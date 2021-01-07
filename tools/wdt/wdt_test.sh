#!/bin/bash

#
# Before you use this script, please do the steps as below: 
# 1. Remove wdt-en and wdt-ping in wdt@29 section of device tree. 
# 2. Check the gpio export and number after export, and make sure the values are the same as 
#    wdi_en_gpio_class and wdi_gpio_class. 
# 3. After replace dtb file and reboot, you can use this script to do init and test. 
#

wdi_en_gpio=37
wdi_gpio=9
wdi_en_gpio_class=9
wdi_gpio_class=10

app_name=wdt_test
time=${time:-300}

usage(){
cat << EOF

  Usage: 

    $app_name [OPTIONS] 

  OPTIONS: 

    -i | --init                      init testing
    -l | --loop                      loop testing
    -t | --time                      wdt time 
    -e | --enable                    enable wdt
    -d | --disable                   disable wdt
    -r | --reset                     reset 

  Example: 

    ./${app_name} --init
    ./${app_name} --reset

EOF
  exit 0; 
}

getwdi(){
  cat /sys/class/gpio/gpio${wdi_gpio_class}/value
}

setwdi(){
  echo $1 > /sys/class/gpio/gpio${wdi_gpio_class}/value
}

togglewdi(){
  wdi=$(getwdi)
  sleep 0.2
  if [ $wdi -eq 1 ]; then
    setwdi 0
  else
    setwdi 1
  fi
  sleep 0.2
}

getwdi_en(){
  cat /sys/class/gpio/gpio${wdi_en_gpio_class}/value
}

setwdi_en(){
  echo $1 > /sys/class/gpio/gpio${wdi_en_gpio_class}/value
}

setwditime(){
  i2cset -y 0 0x29 0x15 $1 w
}

wdi_on(){
  setwdi_en 1
  togglewdi
}

wdi_off(){
  setwdi_en 0
  togglewdi
}

init(){
  # wdi_en
  # default: 0
  echo $wdi_en_gpio > /sys/class/gpio/export 
  echo out > /sys/class/gpio/gpio${wdi_en_gpio_class}/direction 
  # wdi
  # default: 1
  echo $wdi_gpio > /sys/class/gpio/export 
  # echo high > /sys/class/gpio/gpio${wdi_gpio_class}/direction
  echo out > /sys/class/gpio/gpio${wdi_gpio_class}/direction 
}

count=0
loop(){
  echo
  echo -ne "count: $count"
  while true; do
    wdi_off
    sleep 0.1
    wdi_on
    count=$(( $count + 1 ))
    echo $count > /root/ct.txt
    echo -ne "\rcount: $count"
    sleep 3; 
  done
}

reset(){
  setwditime 10
  sleep 0.1
  wdi_on
}

options=$(getopt -o "t:ihledr" -l "init" -l "help" -l "enable" -l "disable" -l "loop" -l "time:" -l "reset" -n $app_name -- $@)

eval set -- "$options"

while true; do
  case $1 in
    -i|--init)
      init
      ;;
    -e|--enable)
      wdi_on
      ;;
    -d|--disable)
      wdi_off
      ;;
    -l|--loop)
      loop
      ;;
    -r|--reset)
      reset
      ;;
    -t|--time)
      shift
      time=$1
      ;;
    -h|--help)
      usage
      ;;
    --)
      shift
      break; 
      ;;
  esac
  shift
done

