#!/bin/bash

function prokiller()
{
	sleep $1
	PID=`ps aux |grep readCAN |grep -v grep`
	if [ "xPID" = "x" ]; then
		echo "[CAN][test failed]"
		exit
	else
		killall readCAN > /dev/null 2>&1 &
	fi
}


CMD=$1
if [ "x$CMD" = "x" ]; then
	echo "Usage: $0 read|write"
	exit
fi

DIR=$(cd `dirname $0`; pwd)
DEVICE=`cat /sys/class/net/can0/uevent |head -1 |awk -F '=' '{print $2}'`

# Open flexCAN device (BITRATE=5000)
ip link set ${DEVICE} down
ip link set ${DEVICE} type can bitrate 50000 loopback off
#ip link set ${DEVICE} type can bitrate 50000 loopback on
ip link set ${DEVICE} up

# Check can status
#ip -details link show can0  

rm ${DIR}/tmp
if [ "x$CMD" = "xread" ]; then
	echo "Please send CAN message within 10 seconds."
	${DIR}/readCAN can0 10 > ${DIR}/history_can_read.txt
	diff ${DIR}/history_can_read.txt ${DIR}/diff_read.txt > ${DIR}/tmp
elif [ "x$CMD" = "xwrite" ]; then
	${DIR}/sendCAN can0 > ${DIR}/history_can_write.txt
	diff ${DIR}/history_can_write.txt ${DIR}/diff_write.txt > ${DIR}/tmp
else
	echo "Usage: $0 read|write"
	exit
fi

RESULT=`cat ${DIR}/tmp`
if [ "x$RESULT" = "x" ]; then
	echo "[CAN][test success]"
else
	echo "[CAN][test failed]"
fi
