#!/bin/bash

MAXZEROPKT=19
DIR=$(cd `dirname $0`; pwd)

date > ${DIR}/history_com1_485_read.txt
hwclock >> ${DIR}/history_com1_485_read.txt

echo "==============" >> ${DIR}/history_com1_485_read.txt
${DIR}/st -ravo -m 485 -b 115200 -h 20 /dev/ttyUSB0 >> ${DIR}/history_com1_485_read.txt
echo "==============" >> ${DIR}/history_com1_485_read.txt

COM1RESULT=`cat ${DIR}/history_com1_485_read.txt |grep error`
COM1ZEROPKT=`cat ${DIR}/history_com1_485_read.txt |grep "R 0, 0 BPS<=" |grep "=>S 0, 0 BPS, 0" |wc -l`
if [ "x$COM1RESULT" = "x" ]; then
	if [ $COM1ZEROPKT -lt $MAXZEROPKT ]; then
		echo "[serial-com1:485 read][test success]"
	else
		echo "[serial-com1:485 read][test failed]"
	fi
fi
