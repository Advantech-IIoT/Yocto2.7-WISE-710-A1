#!/bin/bash

COUNT=0
MAXZEROPKT=5
MAXCOUNT=$1
DIR=$(cd `dirname $0`; pwd)

if [ "x$MAXCOUNT" = "x" ]; then
	echo "Usage: $0 <count>"
	exit
fi

date > ${DIR}/history_com2_485.txt
hwclock >> ${DIR}/history_com2_485.txt
date > ${DIR}/history_com3_485.txt
hwclock >> ${DIR}/history_com3_485.txt

while [ $COUNT -ne $MAXCOUNT ]; do
	echo "Read-Times: $COUNT ==============" >> ${DIR}/history_com2_485.txt
	${DIR}/st -ravo -m 485 -b 115200 -h 12 /dev/ttyUSB2 >> ${DIR}/history_com2_485.txt &
	echo "Write-Times: $COUNT ==============" >> ${DIR}/history_com3_485.txt
	${DIR}/st -savo -m 485 -b 115200 -h 10 /dev/ttyUSB3 >> ${DIR}/history_com3_485.txt
	sleep 5

	echo "Read-Times: $COUNT ==============" >> ${DIR}/history_com3_485.txt
	${DIR}/st -ravo -m 485 -b 115200 -h 12 /dev/ttyUSB3 >> ${DIR}/history_com3_485.txt &
	echo "Write-Times: $COUNT ==============" >> ${DIR}/history_com2_485.txt
	${DIR}/st -savo -m 485 -b 115200 -h 10 /dev/ttyUSB2 >> ${DIR}/history_com2_485.txt
	sleep 5

	COUNT=$((COUNT + 1))
done

date >> ${DIR}/history_com2_485.txt
hwclock >> ${DIR}/history_com2_485.txt
date >> ${DIR}/history_com3_485.txt
hwclock >> ${DIR}/history_com3_485.txt

COM2RESULT=`cat ${DIR}/history_com2_485.txt |grep error`
COM2ZEROPKT=`cat ${DIR}/history_com2_485.txt |grep "R 0, 0 BPS<=" |grep "=>S 0, 0 BPS, 0" |wc -l`
COM3RESULT=`cat ${DIR}/history_com3_485.txt |grep error`
COM3ZEROPKT=`cat ${DIR}/history_com3_485.txt |grep "R 0, 0 BPS<=" |grep "=>S 0, 0 BPS, 0" |wc -l`
if [ "x$COM2RESULT" = "x" ]; then
	if [ $COM2ZEROPKT -lt $MAXZEROPKT ]; then
		echo "[serial-com2:485][test success]"
	else
		echo "[serial-com2:485][test failed]"
	fi
fi

if [ "x$COM3RESULT" = "x" ]; then
	if [ $COM3ZEROPKT -lt $MAXZEROPKT ]; then
		echo "[serial-com3:485][test success]"
	else
		echo "[serial-com3:485][test failed]"
	fi
fi
