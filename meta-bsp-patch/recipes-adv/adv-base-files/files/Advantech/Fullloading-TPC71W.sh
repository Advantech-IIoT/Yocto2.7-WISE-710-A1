#!/bin/bash

MAXCOUNT=$1 # hours
NETTESTMODE=$2	# two device direct connect ping test.
				# 1: IP 192.168.1.10
				# 2: IP 192.168.1.20

if [ "x$MAXCOUNT" = "x" ]; then
	echo "Usage: $0 <count(hours)>"
	exit
fi

###############################
DIR=/usr/Advantech
COUNT=0
CPUTESTCOUNT=$(expr ${MAXCOUNT} \* 60) # 1min/times
MEMTESTCOUNT=$(expr ${MAXCOUNT} \* 20) # 3min/times
LEDTESTCOUNT=$(expr ${MAXCOUNT} \* 60 \* 15) # 4s/times
COM1TESTCOUNT=$(expr ${MAXCOUNT} \* 60 \* 4) # 15s/times
COM23TESTCOUNT=$(expr ${MAXCOUNT} \* 60 \* 2) # 30s/times
NETTFTPCOUNT=$(expr ${MAXCOUNT} \* 60 \* 3) # 20s/times
USBTESTCOUNT=$(expr ${MAXCOUNT} \* 30) # 2min/times
VIDEOTESTCOUNT=$(expr ${MAXCOUNT} \* 20) # 3min/times

#${DIR}/X11vnc_test/start_x11vnc.sh
#sleep 5
#${DIR}/GPIO_test/gpioinit.sh
#sleep 1

<<!
cd ${DIR}/PPP_test/w4g/
./w4g_setup.sh 0000 internet
sleep 5
cd -
!

${DIR}/Memory_test/memtest.sh ${MEMTESTCOUNT} &
${DIR}/Thermal_test/cputemp.sh ${CPUTESTCOUNT} &
#${DIR}/GPIO_test/ledpolltest.sh ${LEDTESTCOUNT} &
${DIR}/Serial_test/com1-232-loopback.sh ${COM1TESTCOUNT} &
#${DIR}/Serial_test/com23-485.sh ${COM23TESTCOUNT} &
#${DIR}/NetTFTP_test/nettftp_test.sh ${NETTFTPCOUNT} &
${DIR}/USB_test/hdd_test_nochg.sh 1 ${USBTESTCOUNT} &
${DIR}/Video_test/MediaPlayer_test.sh ${NETTFTPCOUNT} /usr/Advantech/Video_test/AT_Corp.mp4 &

if [ x$NETTESTMODE = 'x1' ]; then
	ifconfig eth0 192.168.1.20
	sleep 5
	ping 192.168.1.10 -I eth0 > /dev/null &
else if [ x$NETTESTMODE = 'x2' ]; then
	ifconfig eth0 192.168.1.10
	sleep 5
	ping 192.168.1.20 -I eth0 > /dev/null &
else
	#ping 8.8.8.8 -I eth0 > /dev/null &
	#ping 8.8.8.8 -I usb0 > /dev/null &
fi

while [ $COUNT -ne $MAXCOUNT ]; do
	echo "=============="
	echo "Times: $COUNT"
	echo "=============="
	ifconfig
	echo "Times: $COUNT ==============" >> ${DIR}/Fullloading-history.txt
	sleep 3600

	COUNT=$((COUNT + 1))
done

