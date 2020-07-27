#!/bin/sh

export LC_ALL=C

LOG_FLAG="0"

### ------------ ###
### The log file ###
### ------------ ###
if [ "${LOG_FLAG}" == "1" ]; then
    exec &>> ~/w4g_setup.log
fi
### ------------ ###

PROGRAM="ublox 4G"
W4G_ROOT=/usr/Advantech/PPP_test/w4g/
W4G_UNINIT=w4g_disconnect.sh

CHINAMODULE=`lsusb |grep "2020:2040"`
if [ "x$CHINAMODULE" = "x" ]; then
    DEVICENODE=/dev/ttyACM0
else
    DEVICENODE=/dev/ttyUSB1
fi

if [ -f ${W4G_ROOT}${W4G_UNINIT} ]; then
    ${W4G_ROOT}${W4G_UNINIT} ${DEVICENODE}
else
    echo "[$PROGRAM] <Error> Can't find the wireless 4G uninitialized script: ${W4G_ROOT}${W4G_UNINIT}"
fi
