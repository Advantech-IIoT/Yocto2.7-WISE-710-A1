#!/bin/bash

if [[ $1 = "" ]]; then
echo "Usage such as:./wpa_test.sh AXA-Notebook 1234567890"
exit
fi

insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/8821ae.ko
insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/8188eu.ko
insmod /lib/modules/4.1.15/kernel/drivers/net/wireless/88x2bu.ko

sync
rfkill unblock all
sync
ifconfig wlan0 up

# connect to the net

killall wpa_supplicant 1>/dev/null 2>/dev/null
sync
rm /etc/resolv.conf 1>/dev/null 2>/dev/null
echo "ctrl_interface=/var/run/wpa_supplicant" > /tmp/wpa.conf
wpa_passphrase "$1"  $2 >> /tmp/wpa.conf
sync
sleep 1;
wpa_supplicant -B Dwext -iwlan0 -c /tmp/wpa.conf 1>/dev/null 2>/dev/null
sync
sleep 1;
wpa_cli -iwlan0 scan 
sync
sleep 5;
udhcpc -i  wlan0
sync
rm /tmp/wpa.conf


