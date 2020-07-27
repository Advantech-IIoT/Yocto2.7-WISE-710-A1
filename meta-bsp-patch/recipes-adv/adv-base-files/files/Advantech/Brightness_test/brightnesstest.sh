#!/bin/bash 

COUNT=$1 # count*1s/times
DELAYTIME=1
FILEPATH=$(cd `dirname $0`; pwd)

brightnessset() {
	sleep $DELAYTIME
	echo "Set brightness[$1] =>" >> ${FILEPATH}/brightness_history.txt
	echo $1 >> /sys/class/backlight/backlight/brightness
}

brightnessget() {
	result=`cat /sys/class/backlight/backlight/actual_brightness`
	if [ "x$result" == "x$1" ]; then
		echo "Set brightness[$1] OK" >> ${FILEPATH}/brightness_history.txt
	else
		echo "Set brightness[$1] failed" >> ${FILEPATH}/brightness_history.txt
	fi
}

if [ "x$COUNT" = "x" ]; then
	echo "Usage: $0 [COUNT]"
	exit
fi

if [ -f ${FILEPATH}/brightness_history.txt ]; then
	rm ${FILEPATH}/brightness_history.txt
fi

date > ${FILEPATH}/brightness_history.txt
hwclock >> ${FILEPATH}/brightness_history.txt

#<<!
while [ $COUNT -ge 1 ]; do
	echo "==============================" >> ${FILEPATH}/brightness_history.txt
	echo "times: $COUNT" >> ${FILEPATH}/brightness_history.txt

	brightnessset 0
	brightnessget 0
	brightnessset 1
	brightnessget 1
	brightnessset 2
	brightnessget 2
	brightnessset 3
	brightnessget 3
	brightnessset 4
	brightnessget 4
	brightnessset 5
	brightnessget 5
	brightnessset 6
	brightnessget 6
	brightnessset 7
	brightnessget 7

	COUNT=$((COUNT - 1))
done
!

echo "==============================" >> ${FILEPATH}/brightness_history.txt
date >> ${FILEPATH}/brightness_history.txt
hwclock >> ${FILEPATH}/brightness_history.txt

RESULT=`cat ${FILEPATH}/brightness_history.txt |grep failed`
if [ "x$RESULT" = "x" ]; then
	echo "[Brightness][test success]"
else
	echo "[Brightness][test failed]"
fi

