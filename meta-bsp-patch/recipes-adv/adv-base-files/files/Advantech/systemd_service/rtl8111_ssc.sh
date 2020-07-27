#!/bin/bash

cd /mnt
./mdio-rw eth0 31 0x0007
./mdio-rw eth0 30 0x00a0
./mdio-rw eth0 26 > readvalue.txt
val=$(awk '{printf $9}' readvalue.txt)
echo $val
res=$(($val & 0xFFFB))
./mdio-rw eth0 26 $res
./mdio-rw eth0 31 0x0000
rm readvalue.txt

