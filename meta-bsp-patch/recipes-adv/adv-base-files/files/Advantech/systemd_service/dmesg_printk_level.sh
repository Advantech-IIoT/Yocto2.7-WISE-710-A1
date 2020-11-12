#!/bin/bash 

# set dmesg printk level
echo "4 4 1 7" > /proc/sys/kernel/printk

cd /usr/Advantech/systemd_service
./rtl8111_ssc.sh

exit 0;
