#!/bin/bash 

MODE=$1 
FACTORY=$2
FILEPATH=$(cd `dirname $0`; pwd)
CP2108CONFIG232=cp2108_UART1_232.configuration
CP2108CONFIG485=cp2108_UART1_485.configuration

CheckConfig()
{
	if [ $MODE == "232" ]; then
		cp210xsmt --device-count 1 --verify-config ${FILEPATH}/${CP2108CONFIG232} --serial-nums { 0 } >/dev/null 2>&1 &
	elif [ $MODE == "485" ]; then
		cp210xsmt --device-count 1 --verify-config ${FILEPATH}/${CP2108CONFIG485} --serial-nums { 0 } >/dev/null 2>&1 &
	fi
	sleep 1
	RESULT=`ps aux |grep cp210xsmt |grep -v grep`
	if [ "x$RESULT" == "x" ]; then
		return 0
	else
		killall cp210xsmt >/dev/null 2>&1 &
		sleep 1
		return -1
	fi
}

if [ ! -x /usr/bin/cp210xsmt ]; then
	echo "/usr/bin/cp210xsmt was not exist!"
	exit
fi

if [ "x$MODE" = "x" ]; then 
	echo "Usage: $0 232|485" 
	echo "Example: $0 232"
	exit
fi

if [ "x$MODE" == "x232" ]; then
	if [ x$FACTORY == "xfactory" ]; then
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG232} --serial-nums { 0 }
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG232} --serial-nums { 2 }
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG232} --serial-nums { 3 }
		cp210xsmt --device-count 3 --reset ${FILEPATH}/${CP2108CONFIG232}
	else 
		CheckConfig
		if [ $? -ne 0 ]; then
			cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG232} --serial-nums { 0 }
			cp210xsmt --device-count 3 --reset ${FILEPATH}/${CP2108CONFIG232}
		else
			echo "The cp2108 configuration needs no changes."
		fi
	fi
elif [ "x$MODE" == "x485" ]; then
	if [ x$FACTORY == "xfactory" ]; then
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG485} --serial-nums { 0 }
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG485} --serial-nums { 2 }
		cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG485} --serial-nums { 3 }
		cp210xsmt --device-count 3 --reset ${FILEPATH}/${CP2108CONFIG485}
	else 
		CheckConfig
		if [ $? -ne 0 ]; then
			cp210xsmt --device-count 1 --set-config ${FILEPATH}/${CP2108CONFIG485} --serial-nums { 0 }
			cp210xsmt --device-count 3 --reset ${FILEPATH}/${CP2108CONFIG485}
		else
			echo "The cp2108 configuration needs no changes."
		fi
	fi
else
	echo "Usage: $0 232|485" 
fi

