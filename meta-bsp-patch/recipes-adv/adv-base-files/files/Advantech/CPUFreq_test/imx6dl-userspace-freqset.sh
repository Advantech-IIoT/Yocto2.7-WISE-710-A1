#!/bin/bash

if [ x$1 == "x396000" ] || [ x$1 == "x792000" ] || [ x$1 == "x996000" ]; then
	echo "CPU0-current mode:"
	cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
	echo "set CPU0 mode ..."
	echo userspace > /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
	echo "CPU0-current mode:"
	cat /sys/devices/system/cpu/cpu0/cpufreq/scaling_governor
	
	echo "CPU0-current freq:"
	cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_cur_freq
	echo "set CPU0 freq ..."
	echo $1 > /sys/devices/system/cpu/cpu0/cpufreq/scaling_setspeed
	echo "CPU0-current freq:"
	cat /sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_cur_freq
	
	echo "CPU1-current mode:"
	cat /sys/devices/system/cpu/cpu1/cpufreq/scaling_governor
	echo "set CPU1 mode ..."
	echo userspace > /sys/devices/system/cpu/cpu1/cpufreq/scaling_governor
	echo "CPU1-current mode:"
	cat /sys/devices/system/cpu/cpu1/cpufreq/scaling_governor
	
	echo "CPU1-current freq:"
	cat /sys/devices/system/cpu/cpu1/cpufreq/cpuinfo_cur_freq
	echo "set CPU1 freq ..."
	echo $1 > /sys/devices/system/cpu/cpu1/cpufreq/scaling_setspeed
	echo "CPU1-current freq:"
	cat /sys/devices/system/cpu/cpu1/cpufreq/cpuinfo_cur_freq
else
	echo "Usage: $0 [freq]"
	echo "[freq]: 396000/792000/996000"
fi

exit 0
