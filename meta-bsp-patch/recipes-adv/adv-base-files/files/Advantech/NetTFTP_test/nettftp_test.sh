#!/bin/bash

COUNT=$1

###############################
DIRPATH=$(cd `dirname $0`; pwd)
DELAYTIME=1
FILESIZE=128

if [ "x$COUNT" = "x" ]; then
	echo "Usage: $0 <LOOP_TIMES>"
	echo "Ex. $0 1"
	exit
fi

date > ${DIRPATH}/nettftp_history.txt
hwclock >> ${DIRPATH}/nettftp_history.txt

if [ ! -f ${DIRPATH}/test.img ]; then
	dd if=/dev/zero of=${DIRPATH}/test.img bs=${FILESIZE} count=1
	md5sum ${DIRPATH}/test.img > ${DIRPATH}/test.img.md5
fi

#<<!
while [ $COUNT -ge 1 ]; do
	echo "==============================" >> ${DIRPATH}/nettftp_history.txt
	echo "times: $COUNT" >> ${DIRPATH}/nettftp_history.txt

	echo "put file <test.img> =>" >> ${DIRPATH}/nettftp_history.txt
	${DIRPATH}/putFunc test.img >> ${DIRPATH}/nettftp_history.txt 2>&1
	echo "put file <test.img.md5> =>" >> ${DIRPATH}/nettftp_history.txt
	${DIRPATH}/putFunc test.img.md5 >> ${DIRPATH}/nettftp_history.txt 2>&1

	rm ${DIRPATH}/test.img*

	echo "get file <test.img> =>" >> ${DIRPATH}/nettftp_history.txt
	${DIRPATH}/getFunc test.img >> ${DIRPATH}/nettftp_history.txt 2>&1
	echo "get file <test.img.md5> =>" >> ${DIRPATH}/nettftp_history.txt
	${DIRPATH}/getFunc test.img.md5 >> ${DIRPATH}/nettftp_history.txt 2>&1

	MD5CHECK=`cat ${DIRPATH}/test.img.md5 |awk -F ' ' '{print $1}'`
	MD5=`md5sum ${DIRPATH}/test.img |awk -F ' ' '{print $1}'`
	if [ $MD5 = $MD5CHECK ];then
		echo "lan tftp put-get test success." >> ${DIRPATH}/nettftp_history.txt
	else
		echo "lan tftp put-get test failed." >> ${DIRPATH}/nettftp_history.txt
	fi

	COUNT=$((COUNT - 1))
	sleep ${DELAYTIME}
done
!

rm ${DIRPATH}/test.img*

echo "==============================" >> ${DIRPATH}/nettftp_history.txt
date >> ${DIRPATH}/nettftp_history.txt
hwclock >> ${DIRPATH}/nettftp_history.txt

RESULT=`cat ${DIRPATH}/nettftp_history.txt |grep "test failed"`
if [ "x$RESULT" = "x" ]; then
	echo "[NETTFTP][test success]"
else
	echo "[NETTFTP][test failed]"
fi


