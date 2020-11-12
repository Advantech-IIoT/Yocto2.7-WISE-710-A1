#!/bin/bash

ip link set eth0 down
ip link set eth1 down
ip link set eth0 name nic1
ip link set eth1 name nic0
ip link set nic0 down
ip link set nic1 down
ip link set nic0 name eth0
ip link set nic1 name eth1
ip link set eth0 up
ip link set eth1 up

exit 0; 
