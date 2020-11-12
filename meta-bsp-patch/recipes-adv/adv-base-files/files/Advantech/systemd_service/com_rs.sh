#!/bin/bash 

if [ ! -e /dev/mmcblk0p3 ]; then
	echo "There is no Recovery function in you system"
	exit
else
	mount /dev/mmcblk0p3 /media/Recovery
fi


cd /usr/Advantech/CP21XX_cfgtool
./auto-setting.sh

exit 0; 
