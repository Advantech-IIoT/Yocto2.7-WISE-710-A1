#!/bin/bash

ifconfig wlan0 down
sleep 1

ISMODULELOAD=`lsmod |grep 8821ae`
if [ "x$ISMODULELOAD" != "x" ]; then
	rmmod 8821ae
fi

ISMODULELOAD=`lsmod |grep 8188eu`
if [ "x$ISMODULELOAD" != "x" ]; then
	rmmod 8188eu
fi

ISMODULELOAD=`lsmod |grep 88x2bu`
if [ "x$ISMODULELOAD" != "x" ]; then
	rmmod 88x2bu
fi
