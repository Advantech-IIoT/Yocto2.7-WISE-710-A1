#!/bin/bash

/sbin/ip link set eth0 down
/sbin/ip link set eth1 down
/usr/sbin/i2cset -f -y 0 0x29 0x30 0x0001 w

