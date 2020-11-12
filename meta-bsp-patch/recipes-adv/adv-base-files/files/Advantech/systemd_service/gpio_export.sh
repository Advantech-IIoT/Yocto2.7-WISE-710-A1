#!/bin/bash

echo 204 > /sys/class/gpio/export 
echo out > /sys/class/gpio/gpio1/direction
echo 0 > /sys/class/gpio/gpio1/value
echo 204 > /sys/class/gpio/unexport

sleep 1
cd /usr/Advantech/GPIO_test
./gpioinit.sh

exit 0; 
