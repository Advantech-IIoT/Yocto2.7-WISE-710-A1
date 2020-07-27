#!/bin/bash 

#COUNT=86400 # 24*3600*4times*1s/times
COUNT=$1 # count*4times*1s/times
DELAYTIME=1
FILEPATH=$(cd `dirname $0`; pwd)

ledset() {
	sleep $DELAYTIME

	if [ "x$1" = "x1" ]; then
		echo 1 > /sys/class/gpio/gpio1/value
		echo 0 > /sys/class/gpio/gpio2/value
		echo 0 > /sys/class/gpio/gpio3/value
		echo 0 > /sys/class/gpio/gpio4/value
	elif [ "x$1" = "x2" ]; then
		echo 0 > /sys/class/gpio/gpio1/value
		echo 1 > /sys/class/gpio/gpio2/value
		echo 0 > /sys/class/gpio/gpio3/value
		echo 0 > /sys/class/gpio/gpio4/value
	elif [ "x$1" = "x3" ]; then
		echo 0 > /sys/class/gpio/gpio1/value
		echo 0 > /sys/class/gpio/gpio2/value
		echo 1 > /sys/class/gpio/gpio3/value
		echo 0 > /sys/class/gpio/gpio4/value
	elif [ "x$1" = "x4" ]; then
		echo 0 > /sys/class/gpio/gpio1/value
		echo 0 > /sys/class/gpio/gpio2/value
		echo 0 > /sys/class/gpio/gpio3/value
		echo 1 > /sys/class/gpio/gpio4/value
	fi
}

dioget() {
	result1=`cat /sys/class/gpio/gpio5/value`
	result2=`cat /sys/class/gpio/gpio6/value`
	result3=`cat /sys/class/gpio/gpio7/value`
	result4=`cat /sys/class/gpio/gpio8/value`

	if [ "x$1" = "x1" ]; then
		if [ x$result1 == "x0" ] && [ x$result2 == "x1" ] && [ x$result3 == "x1" ] && [ x$result4 == "x1" ]; then
			echo "DIO1->DIO5 test OK" >> ${FILEPATH}/gpio_history.txt
		else
			echo "DIO1->DIO5 test failed" >> ${FILEPATH}/gpio_history.txt
		fi
	elif [ "x$1" = "x2" ]; then
		if [ x$result1 == "x1" ] && [ x$result2 == "x0" ] && [ x$result3 == "x1" ] && [ x$result4 == "x1" ]; then
			echo "DIO2->DIO6 test OK" >> ${FILEPATH}/gpio_history.txt
		else
			echo "DIO2->DIO6 test failed" >> ${FILEPATH}/gpio_history.txt
		fi
	elif [ "x$1" = "x3" ]; then
		if [ x$result1 == "x1" ] && [ x$result2 == "x1" ] && [ x$result3 == "x0" ] && [ x$result4 == "x1" ]; then
			echo "DIO3->DIO7 test OK" >> ${FILEPATH}/gpio_history.txt
		else
			echo "DIO3->DIO7 test failed" >> ${FILEPATH}/gpio_history.txt
		fi
	elif [ "x$1" = "x4" ]; then
		if [ x$result1 == "x1" ] && [ x$result2 == "x1" ] && [ x$result3 == "x1" ] && [ x$result4 == "x0" ]; then
			echo "DIO4->DIO8 test OK" >> ${FILEPATH}/gpio_history.txt
		else
			echo "DIO4->DIO8 test failed" >> ${FILEPATH}/gpio_history.txt
		fi
	fi
}

if [ "x$COUNT" = "x" ]; then
	echo "Usage: $0 [COUNT]"
	exit
fi

if [ -f ${FILEPATH}/gpio_history.txt ]; then
	rm ${FILEPATH}/gpio_history.txt
fi

date > ${FILEPATH}/gpio_history.txt
hwclock >> ${FILEPATH}/gpio_history.txt

#<<!
while [ $COUNT -ge 1 ]; do
	echo "==============================" >> ${FILEPATH}/gpio_history.txt
	echo "times: $COUNT" >> ${FILEPATH}/gpio_history.txt

	ledset 1
	dioget 1
	ledset 2
	dioget 2
	ledset 3
	dioget 3
	ledset 4
	dioget 4

	COUNT=$((COUNT - 1))
done
!

echo "==============================" >> ${FILEPATH}/gpio_history.txt
date >> ${FILEPATH}/gpio_history.txt
hwclock >> ${FILEPATH}/gpio_history.txt

RESULT=`cat ${FILEPATH}/gpio_history.txt |grep failed`
if [ "x$RESULT" = "x" ]; then
	echo "[DIO][test success]"
else
	echo "[DIO][test failed]"
fi

