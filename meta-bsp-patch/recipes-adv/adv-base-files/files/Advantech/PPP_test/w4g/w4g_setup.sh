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

if [ $# -gt 4 ]; then
    echo "Description: Initialize the wireless 4G module and connect to 4G network"
    echo "Usage: $0 <simPin> <apn> <username> <password>"
    echo "    <simPin>: The SIM PIN code (optional)"
    echo "    <apn>: The Access Point Name (optional)"
    echo "    <username>: The username for carrier (optional)"
    echo "    <password>: The password for carrier (optional)"
    echo "    Example: $0 0000 internet"
    exit 1;
fi

PROGRAM="ublox 4G"
W4G_ROOT=../w4g/
W4G_INIT=w4g_init.sh

CHINAMODULE=`lsusb |grep "2020:2040"`
if [ "x$CHINAMODULE" = "x" ]; then
    DEVICENODE=/dev/ttyACM0
else
    DEVICENODE=/dev/ttyUSB1
fi

if [ -f ${W4G_ROOT}${W4G_INIT} ]; then
    ${W4G_ROOT}${W4G_INIT} $1 $2 ${DEVICENODE} $3 $4
else
    echo "[$PROGRAM] <Error> Can't find the wireless 4G initialized script: ${W4G_ROOT}${W4G_INIT}"
fi

if [ $? -ne 0 ]; then
    echo "[$PROGRAM] Failed to initialize 4G module."
    exit 1;
fi

echo "[$PROGRAM] Connect to network ... "

## Find out the old PROCESS, and then kill them all
PROCESS="[u]dhcpc -b -i usb0"
ps | grep "${PROCESS}" | grep -o '^[ ]*[0-9]*' | xargs kill > /dev/null 2>&1

udhcpc -b -i usb0
sleep 5

ifconfig | grep usb0 > /dev/null
if [ $? -eq 0 ]; then
    echo "[$PROGRAM] Done! Connect to the cell site."
else
    echo "[$PROGRAM] Connection failed! Please check <simPin>, <apn>, <username>, and <password>!"
    exit 1;
fi
