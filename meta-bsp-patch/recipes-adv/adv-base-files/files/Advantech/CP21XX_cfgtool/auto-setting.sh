#!/bin/bash 

DIR=$(cd `dirname $0`; pwd)

echo 5 > /sys/class/gpio/export 
echo 6 > /sys/class/gpio/export 
GPIO5=`cat /sys/class/gpio/gpio1/value`
GPIO6=`cat /sys/class/gpio/gpio2/value`
echo 5 > /sys/class/gpio/unexport 
echo 6 > /sys/class/gpio/unexport

if [ "x$GPIO5" == "x1" ] && [ "x$GPIO6" == "x0" ]; then
        ${DIR}/config-cp2108.sh 232
elif [ "x$GPIO5" == "x0" ] && [ "x$GPIO6" == "x1" ]; then 
        ${DIR}/config-cp2108.sh 485
fi


