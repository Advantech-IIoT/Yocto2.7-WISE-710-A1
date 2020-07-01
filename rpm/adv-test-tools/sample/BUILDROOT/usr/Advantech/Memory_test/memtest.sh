#!/bin/bash 

LOOP=$1
FILEPATH=$(cd `dirname $0`; pwd)
RESULT_LOG=${FILEPATH}/memtest-history.txt

if [ $# -ne 1 ]; then
	echo "Syntax:  $0 <LOOP_TIME>"
	exit
fi

# Memory stress test
MEMSIZE=`cat /proc/meminfo |grep MemFree |awk '{print $2}'`
MEMSIZE_TEST=`expr $MEMSIZE / 1024 - 60`
echo "memtester start ..."
echo "===== Memory Test =====" > ${RESULT_LOG}
#/usr/bin/memtester $MEMSIZE_TEST $LOOP |tee -a ${RESULT_LOG}
/usr/bin/memtester $MEMSIZE_TEST $LOOP >> ${RESULT_LOG}

#sleep 360000

