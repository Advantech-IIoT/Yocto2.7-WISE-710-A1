#!/bin/bash

MAXCOUNT=$1

####################################
COUNT=0
DIR=$(cd `dirname $0`; pwd)

if [ "x$MAXCOUNT" = "x" ]; then
	echo "Usage: $0 <COUNT>"
	exit
fi

date > ${DIR}/testResut.log
hwclock >> ${DIR}/testResut.log
while [ $COUNT -ne $MAXCOUNT ]; do
	echo "Times: $COUNT ==============" >> ${DIR}/testResut.log
	#./AdvComTest  -speedtest /dev/ttyUSB2 /dev/ttyUSB3 >> ${DIR}/testResut.log 2>&1
	./AdvComTest  -speedtest /dev/ttyUSB0 /dev/ttyUSB0 >> ${DIR}/testResut.log 2>&1
	sleep 1

	COUNT=$((COUNT + 1))
done

echo "==============" >> ${DIR}/testResut.log
date >> ${DIR}/testResut.log
hwclock >> ${DIR}/testResut.log


RESULT=`cat testResut.log |grep failed`
if [ "x$RESULT" = "x" ]; then
        echo "[USB SERIAL BAND][test success]"
else
        echo "[USB SERIAL BAND][test failed]"
fi
