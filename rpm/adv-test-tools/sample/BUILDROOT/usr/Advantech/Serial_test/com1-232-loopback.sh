#!/bin/bash

COUNT=0
MAXZEROPKT=5
MAXCOUNT=$1
DIR=$(cd `dirname $0`; pwd)

if [ "x$MAXCOUNT" = "x" ]; then
        echo "Usage: $0 <count>"
        exit
fi

date > ${DIR}/history_com1_232_loopback.txt
hwclock >> ${DIR}/history_com1_232_loopback.txt

while [ $COUNT -ne $MAXCOUNT ]; do
	echo "Times: $COUNT ==============" >> ${DIR}/history_com1_232_loopback.txt
	${DIR}/st -rsavo -m 232 -b 115200 -h 10 /dev/ttyUSB0 >> ${DIR}/history_com1_232_loopback.txt &
	sleep 5

	COUNT=$((COUNT + 1))
done

echo "==============" >> ${DIR}/history_com1_232_loopback.txt
date >> ${DIR}/history_com1_232_loopback.txt
hwclock >> ${DIR}/history_com1_232_loopback.txt

COM1RESULT=`cat ${DIR}/history_com1_232_loopback.txt |grep error`
COM1ZEROPKT=`cat ${DIR}/history_com1_232_loopback.txt |grep "R 0, 0 BPS<=" |wc -l`
if [ "x$COM1RESULT" = "x" ]; then
	if [ $COM1ZEROPKT -lt $MAXZEROPKT ]; then
		echo "[serial-com1:232 loopback][test success]"
	else
		echo "[serial-com1:232 loopback][test failed]"
	fi
fi
