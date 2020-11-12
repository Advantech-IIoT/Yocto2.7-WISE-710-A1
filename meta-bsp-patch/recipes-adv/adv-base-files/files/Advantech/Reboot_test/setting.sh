#!/bin/bash
#getopt -n setting -o "b:h:c:" -l "test" -- -b 1 -c ooo --test start
prog=stress-reboot-setting
opts=$(getopt -n $prog -o "c:s:h" -l "count:" -l "second" -- $@)
eval set -- "$opts"
usage(){
cat << EOF
Usage: 

  $prog [OPTIONS] [ACTIONS]

  OPTIONS: 
  
    -c, --count [N]                   Test N loops
    -s, --second [N]                  Reboot after N seconds 
    -h, --help                        Show this usage

  ACTIONS: 

    start                             Start testing
    stop                              Stop testing 

EOF
  exit 0;
}
c=500
s=40
while true; do
  case "$1" in
    -c|--count)
      shift
      c=$1
      ;;
    -s|--second)
      shift
      s=$1
      ;;
    -h|--help)
      usage
      ;;
    --)
      shift
      break
      ;;
    *)
      ;;
  esac
  shift
done

start_func(){
  rm -rf ${HOME}/{CONFIG,LOG}
  systemctl enable stress-reboot
  systemctl start stress-reboot
}

stop_func(){
  systemctl stop stress-reboot
  killall -9 loop.sh >/dev/null 2>&1
  systemctl disable stress-reboot
}

case "$1" in
  start)
    start_func
    ;;
  stop)
    stop_func
    ;;
  restart)
    stop_func
    start_func
    ;;
  *)
    ;;
esac

