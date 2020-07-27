#!/bin/bash

DIR=$(cd `dirname $0`; pwd)

date > ${DIR}/history_com1_485_write.txt
hwclock >> ${DIR}/history_com1_485_write.txt

echo "==============" >> ${DIR}/history_com1_485_write.txt
${DIR}/st -savo -m 485 -b 115200 -h 10 /dev/ttyUSB0 >> ${DIR}/history_com1_485_write.txt
echo "==============" >> ${DIR}/history_com1_485_write.txt

COM1RESULT=`cat ${DIR}/history_com1_485_write.txt |grep error`
if [ "x$COM1RESULT" = "x" ]; then
	echo "[serial-com1:485 write][test success]"
else
	echo "[serial-com1:485 write][test failed]"
fi
