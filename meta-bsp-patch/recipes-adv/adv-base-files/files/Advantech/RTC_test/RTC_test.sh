#!/bin/bash

DIR=$(cd `dirname $0`; pwd)

echo ***********RTC TEST**************
${DIR}/up_time.sh 2018 10 29 00 11 00 53 > /dev/null 2>&1
${DIR}/time_chk.sh 2018 10 29 00 11 00 54 > /dev/null 2>&1
echo date:
date
echo hwclock:
hwclock
echo "date >>>>>>>>>>>>>> RTC "
echo "date -s 05:23:41 =>"
date -s 05:23:41
echo "hwclock -w & hwclock =>"
hwclock -w
hwclock
RESULT=`hwclock |awk '{print $2}'`
RESULT=${RESULT:0:7}
if [ "x$RESULT" != "x05:23:4" ]; then
	echo "[RTC][test failed]"
	exit
fi

echo "RTC >>>>>>>>>>>>>>> date"
echo "date -s 00:00:00 =>"
date -s 00:00:00
echo "hwclock -s & date =>"
hwclock -s
date
RESULT=`date +%H:%M:%S`
echo $RESULT
RESULT=${RESULT:0:7}
echo $RESULT
if [ "x$RESULT" = "x05:23:4" ];then
	echo "[RTC][test success]"
else
	echo "[RTC][test failed]"
	exit
fi

