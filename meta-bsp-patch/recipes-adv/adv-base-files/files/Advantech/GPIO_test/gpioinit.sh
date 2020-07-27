#!/bin/bash

if [ -d /sys/class/gpio/gpio1/ ]; then
	echo  204 > /sys/class/gpio/unexport
fi

# GPIO1(DO)
if [ ! -d /sys/class/gpio/gpio1/ ]; then
	echo  27 > /sys/class/gpio/export
fi
echo out > /sys/class/gpio/gpio1/direction
chmod a+w /sys/class/gpio/gpio1/*

# GPIO2(DO)
if [ ! -d /sys/class/gpio/gpio2/ ]; then
	echo  29 > /sys/class/gpio/export
fi
echo out > /sys/class/gpio/gpio2/direction
chmod a+w /sys/class/gpio/gpio2/*

# GPIO3(DO)
if [ ! -d /sys/class/gpio/gpio3/ ]; then
	echo  25 > /sys/class/gpio/export
fi
echo out > /sys/class/gpio/gpio3/direction
chmod a+w /sys/class/gpio/gpio3/*

# GPIO4(DO)
if [ ! -d /sys/class/gpio/gpio4/ ]; then
	echo  30 > /sys/class/gpio/export
fi
echo out > /sys/class/gpio/gpio4/direction
chmod a+w /sys/class/gpio/gpio4/*

# GPIO5(DI)
if [ ! -d /sys/class/gpio/gpio5/ ]; then
	echo  101 > /sys/class/gpio/export
fi
echo in > /sys/class/gpio/gpio5/direction
chmod a+w /sys/class/gpio/gpio5/*

# GPIO6(DI)
if [ ! -d /sys/class/gpio/gpio6/ ]; then
	echo  7 > /sys/class/gpio/export
fi
echo in > /sys/class/gpio/gpio6/direction
chmod a+w /sys/class/gpio/gpio6/*

# GPIO7(DI)
if [ ! -d /sys/class/gpio/gpio7/ ]; then
	echo  8 > /sys/class/gpio/export
fi
echo in > /sys/class/gpio/gpio7/direction
chmod a+w /sys/class/gpio/gpio7/*

# GPIO8(DI)
if [ ! -d /sys/class/gpio/gpio8/ ]; then
	echo  205 > /sys/class/gpio/export
fi
echo in > /sys/class/gpio/gpio8/direction
chmod a+w /sys/class/gpio/gpio8/*

echo "How to test gpio:"
echo "link gpio1 & gpio5, then run following cmd:"
echo "echo 1 > /sys/class/gpio/gpio1/value"
echo "cat /sys/class/gpio/gpio5/value"
echo "echo 0 > /sys/class/gpio/gpio1/value"
echo "cat /sys/class/gpio/gpio5/value"




