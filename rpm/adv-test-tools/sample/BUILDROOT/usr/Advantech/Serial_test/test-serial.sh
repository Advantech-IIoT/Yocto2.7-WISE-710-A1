#!/bin/bash
#This script is use to test multiple port 232 mode loopback mode at the same time.
#baud is the baud rate ,you can write any baudrate you want to test in the array baud.
#flow is the flow control,you can write any flowcontrol you want to test in the array flow.
#databit is the data bit and stop bit.you can write any databit you want to test in the array databit
#baud=(921600 460800 230400 128000 115200 57600 38400 19200 9600 7200 4800 2400 1800 1200 600 300 150 134 110 75 50)
time=10
#port=(S1 S2)
port=(mxc0 mxc1 mxc3 mxc4 USB5)
#baud=(115200 57600 38400 19200 9600 7200 4800 2400 1800 1200 600 300 150 134 110 75 50)
baud=(115200)
#flow=(none xonxoff rtscts)
flow=(none)
databit=(n81)
PortNum=${#port[*]}
mode=$1

function check_result()
{
	result=`grep -rn "data error" $1`
	if [ -n "$result" ]; then
		echo "Serial test failed!"
		echo "Log: $1"
		return 1
	fi

	if [ "$1"x = "/mnt/loop-ttymxc0-115200-none-n81-r"x ]; then
		echo ">> checking ttymxc0 read log ..."
		result=`grep -rn "total rx:0" $1`
		if [ -n "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
	elif [ "$1"x = "/mnt/loop-ttymxc0-115200-none-n81-s"x ]; then
		echo ">> checking ttymxc0 write log ..."
		result=`grep -rn "total tx:0" $1`
		if [ -n "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
	elif [ "$1"x = "/mnt/loop-ttymxc1-115200-none-n81-r"x ]; then
		echo ">> checking ttymxc1 read log ..."
		result=`grep -rn "total rx:0" $1`
		if [ -n "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
	elif [ "$1"x = "/mnt/loop-ttymxc1-115200-none-n81-s"x ]; then
		echo ">> checking ttymxc1 write log ..."
		result=`grep -rn "total tx:0" $1`
		if [ -n "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
	else
		echo ">> checking other tty loopback log ..."
		result=`grep -rn "total rx:0" $1`
		if [ -n "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
		
		result=`grep -rn "total tx:0" $1`
		if [ -u "$result" ]; then
			echo "Serial Test failed!"
			echo "Log: $1"
			return 1
		fi
	fi
	
	return 0
}

#for i in ${baud[*]};do
#	for j in ${flow[*]};do
#		for k in ${databit[*]};do
#			let PortId=0
#			while [ $PortId -lt $((PortNum-1)) ];do
#				st /dev/tty${port[$PortId]} -srvoa -b $i -f $j -c $k -h $time > /mnt/loop-tty${port[$PortId]}-$i-$j-$k &
#				let PortId=PortId+1
#			done   	
#		done
#	done
#done

if [ -z $mode ]; then
	echo "Use default RS-232(COM1/COM2)"
	mode=232
else
	echo "Set RS-$mode(COM1/COM2)"
fi

for k in ${databit[*]};do
	let PortId=0
	while [ $PortId -lt $((PortNum)) ];do
		if [ $PortId == 0 ]; then
			/usr/Advantech/Serial_test/st /dev/ttymxc0 -ravo -m $mode -b 115200 -h 10 > /mnt/loop-ttymxc0-115200-none-n81-r &
			sleep 1
			/usr/Advantech/Serial_test/st /dev/ttymxc1 -savo -m $mode -b 115200 -h 9 > /mnt/loop-ttymxc1-115200-none-n81-s &
			sleep 15
		elif [ $PortId == 1 ]; then
			/usr/Advantech/Serial_test/st /dev/ttymxc1 -ravo -m $mode -b 115200 -h 10 > /mnt/loop-ttymxc1-115200-none-n81-r &
			sleep 1
			/usr/Advantech/Serial_test/st /dev/ttymxc0 -savo -m $mode -b 115200 -h 9 > /mnt/loop-ttymxc0-115200-none-n81-s &
		elif [ $PortId == 2 ]; then
			/usr/Advantech/Serial_test/st /dev/ttymxc3 -rsavo -m 232 -b 115200 -h 10 > /mnt/loop-ttymxc3-115200-none-n81 &
		elif [ $PortId == 3 ]; then
			/usr/Advantech/Serial_test/st /dev/ttymxc4 -rsavo -m 232 -b 115200 -h 10 > /mnt/loop-ttymxc4-115200-none-n81 &
		elif [ $PortId == 4 ]; then
			/usr/Advantech/Serial_test/st /dev/ttyUSB5 -rsavo -m 232 -b 115200 -h 10 > /mnt/loop-ttyUSB5-115200-none-n81 &
		fi
		let PortId=PortId+1
	done   	
done

sleep 12
errflag=0
check_result "/mnt/loop-ttymxc0-115200-none-n81-r"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttymxc0-115200-none-n81-s"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttymxc1-115200-none-n81-r"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttymxc1-115200-none-n81-s"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttymxc3-115200-none-n81"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttymxc4-115200-none-n81"
if [ $? -eq 1 ]; then
	errflag=1
fi
check_result "/mnt/loop-ttyUSB5-115200-none-n81"
if [ $? -eq 1 ]; then
	errflag=1
fi

if [ $errflag -eq 1 ]; then
	echo "Serial test failed!"
else
	echo "Serial test successful!"
fi
