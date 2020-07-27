#!/bin/bash

echo ***********USB TEST**************

RESULT=`lsusb |wc -l`

if [ "x$RESULT" = "x3" ];then
	echo "[USB OTG][test failed]"
else
	echo "[USB OTG][test success]"
	exit
fi

