#!/bin/sh

SHELLDIR="$(cd "$(dirname "$0")" && pwd)"
WAIT=5000
BUNDRATE=115200
PASS=0
FAIL=1

CHINAMODULE=`lsusb |grep "2020:2040"`
if [ "x$CHINAMODULE" = "x" ]; then
    DEVICE=/dev/ttyACM0
else
    DEVICE=/dev/ttyUSB1
fi

if [ ! -c ${DEVICE} ]; then
	echo "fail"
	exit ${FAIL}
fi

echo "Must be entering the \"at+cimi\" in ${WAIT} milliseconds."
microcom -t ${WAIT} -s ${BUNDRATE} ${DEVICE} &> ${SHELLDIR}/history

sleep 1
sync
RESULT=`cat ${SHELLDIR}/history |grep ERROR`
rm ${SHELLDIR}/history

if [ x"$RESULT" == "x" ]; then
	echo "test pass"
	exit ${PASS}
else
	echo "fail"
	exit ${FAIL}
fi

