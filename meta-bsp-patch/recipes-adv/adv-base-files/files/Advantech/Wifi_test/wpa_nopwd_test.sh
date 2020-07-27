#!/bin/bash

if [[ $1 = "" ]]; then
echo "Usage such as:$0 AXA-Notebook"
exit
fi

insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/8821ae.ko
insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/8188eu.ko
insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/88x2bu.ko

sync
ifconfig wlan0 up

killall wpa_supplicant 1>/dev/null 2>/dev/null
rm /etc/resolv.conf 1>/dev/null 2>/dev/null
sync

iwconfig wlan0 essid $1
udhcpc -i wlan0 
sync
echo "nameserver 8.8.8.8" > /etc/resolv.conf
sync


