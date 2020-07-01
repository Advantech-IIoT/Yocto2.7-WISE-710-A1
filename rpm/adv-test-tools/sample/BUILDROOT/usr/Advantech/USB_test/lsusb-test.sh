#!/bin/bash

USBNUM=3  # Modify to actual number of current device usb node
CURUSBNUM=`lsusb |awk '{print NR}' |tail -n 1`

ls /mnt/boottimes > /dev/zero 2>&1
if [ $? -eq 0 ]; then
   boots=`cat /mnt/boottimes`
   boots=$[ boots+1 ]
else
   boots=1
fi

echo "boots=$boots"
echo "$boots" > /mnt/boottimes

echo "[COUNT: $boots]" >> /mnt/result.txt
if [ $CURUSBNUM -le $USBNUM ]; then
	echo "Not scanning enough USB nodes!" >> /mnt/result.txt
else
	echo "Test success" >> /mnt/result.txt
fi

sync

#echo "$boots" >> /mnt/Starttime.log
#hwclock >>/mnt/Starttime.log
#echo "------------------------------------------------------------------------" >> /mnt/Starttime.log

sleep 10
if [ -f "/etc/pflock" ]; then
	poweroff
fi
