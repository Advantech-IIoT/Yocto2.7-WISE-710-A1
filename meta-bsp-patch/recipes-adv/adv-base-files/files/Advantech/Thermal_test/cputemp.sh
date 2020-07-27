#!/bin/bash

COUNT=0
COUNTMAX=$1 	# 24h*60min
DELAYTIME=60	# 60s
FILEPATH=$(cd `dirname $0`; pwd) 	
HISTORY=${FILEPATH}/cputemp_history.txt

if [ "x$COUNTMAX" = "x" ]; then
	echo "Usage: $0 <COUNT>"
	exit
fi

killall test
${FILEPATH}/test &

while [ $COUNT -le $COUNTMAX ]; do
	#echo "times: $COUNT =============="
	echo "Times: $COUNT ==============" >> $HISTORY

	#cat /sys/devices/virtual/thermal/thermal_zone0/temp
	cat /sys/devices/virtual/thermal/thermal_zone0/temp >> $HISTORY
	#echo ""

	COUNT=$((COUNT + 1))
	sleep $DELAYTIME
done


