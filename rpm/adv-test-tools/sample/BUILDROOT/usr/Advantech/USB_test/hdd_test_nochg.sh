#!/bin/bash

#############################################################################
#    FILE	 : hdd_test.sh
#    DESCRIPTION : Check all hard disks of test system except boot disk.
#    USAGE       : ./hdd_test.sh {hard_disk numbers} ${test_count times}
#    EXAMPLE     : ./hdd_test.sh 1 1
#    HISTORY     : 2012/03/12    Use dd to test the disk   bruce.chu
#############################################################################

_filepath=$(cd `dirname $0`; pwd)
_g_result=0
_tmp_dd_file=${_filepath}/tmp_dd_file
_tmp_backup_file=${_filepath}/tmp_backup_file
_one_1M=${_filepath}/one_1M.dat
_zero_1M=${_filepath}/zero_1M.dat

usb_test() {
	echo "Starting copy and compare data to storage devices to do hdd check..."
	#boot_disk=`df | grep boot | awk '{print $1}'`
	boot_disk=`df | grep -v mapper | grep dev | head -n 1 | awk '{print $1}'`
	disk_list=`cat /proc/partitions | grep [sh]d.$ | awk '{print $4}'`
	protect_disk=`dmesg | grep "Write Protect is on" | awk '{print $1}'`

	detected_number=`cat /proc/partitions | grep [sh]d.$ | wc -l`
	#disk_test_number=`expr $detected_number`
	disk_test_number=`expr $detected_number - 1`
	if [ $disk_test_number -ne $1 ];then
		echo "User want to test $1 disk,  $disk_test_number not match"
		_g_result=1
		exit 1
	fi

	echo boot_disk=$boot_disk
	echo disk_list=$disk_list
	echo protect_disk=$protect_disk
	sleep 3
	if [ "/dev/$disk_list"1 == $boot_disk ];then
		echo "Error : no disk to test, Please check."
		echo fail
		exit 1
	fi

	for i in $disk_list; do
		disk_to_test="/dev/$i"
		write_protect=0
	
		# skip the boot disk
		if [ "$disk_to_test"1 == $boot_disk ];then
			continue
		fi
		
		echo disk_to_test=$disk_to_test
	
		for j in $protect_disk; do
			if [ x$j == x"$i": ];then
				echo $i is write protected.
				write_protect=1
				break
			fi
		done
		if [ $write_protect -eq 1 ];then
			continue
		fi
		
		#Backup 1M data from disk
		dd if=$disk_to_test of=${_tmp_backup_file} bs=1M count=1
		
		if [ $? -ne 0 ];then
			_g_result=1
			echo "$disk_to_test backup fail!"
			continue
		fi
	
		#Write 1M 0 to disk
		dd if=${_zero_1M} of=$disk_to_test conv=notrunc,noerror
		rm ${_tmp_dd_file} 
		
		#Read 1M data from disk
		dd if=$disk_to_test of=${_tmp_dd_file} bs=1M count=1 conv=notrunc,noerror
		#Compare if the written data is the same as the read
		diff ${_zero_1M} ${_tmp_dd_file} 
		if [ $? -ne 0 ];then
			_g_result=1
			echo "Write all 0 to $disk_to_test and compare fail!"
		fi
		
		#Write 1M 1 to disk
		dd if=${_one_1M} of=$disk_to_test conv=notrunc,noerror
		rm ${_tmp_dd_file} 
		
		#Read 1M data from disk
		dd if=$disk_to_test of=${_tmp_dd_file} bs=1M count=1 conv=notrunc,noerror
		
		#Compare if the written data is the same as the read
		diff ${_one_1M} ${_tmp_dd_file} 
		if [ $? -ne 0 ];then
			_g_result=1
			echo "Write all 1 to $disk_to_test and compare failed" >> ${_filepath}/usb_test.log
		fi
	
		#Restore 1M data from file
		dd if=${_tmp_backup_file} of=$disk_to_test bs=1M count=1
	
		if [ $? -ne 0 ];then
			_g_result=1
			echo "$disk_to_test restore failed" >> ${_filepath}/usb_test.log
		fi
	done
}

if [ $# -ne 2 ]; then
	echo -e "Please input {hard_disk numbers} {test_count times} ."
	exit 1
fi	

#<<!
echo > ${_filepath}/usb_test.log
USBNODEID=$1
COUNT=$2
while [ $COUNT -ge 1 ]; do
        echo "==============================" >> ${_filepath}/usb_test.log
        echo "times: $COUNT" >> ${_filepath}/usb_test.log
        echo "==============================" >> ${_filepath}/usb_test.log

	date >> ${_filepath}/usb_test.log
	hwclock >> ${_filepath}/usb_test.log
	
	usb_test $USBNODEID
	
	date >> ${_filepath}/usb_test.log
	hwclock >> ${_filepath}/usb_test.log

	sleep 120

        COUNT=$((COUNT - 1))
done
!

echo "=============================="
RESULT=`cat ${_filepath}/usb_test.log |grep failed`
if [ "x$RESULT" = "x" ]; then
        echo "[USB][test success]"
else
        echo "[USB][test failed]"
fi
