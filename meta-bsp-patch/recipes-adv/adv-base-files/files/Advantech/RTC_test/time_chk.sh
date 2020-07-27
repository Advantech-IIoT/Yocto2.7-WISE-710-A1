#!/bin/bash
#############################################################################
#    FILE	 : $0
#    DESCRIPTION : check CPU model name and core numbers
#    USAGE       : ./time_chk.sh [Year|Month|Day|[DayofWeek]|Hour|Minute|Second|Tolerance]
#    EXAMPLE   : ./time_chk.sh 2018 10 29 00 11 00 53 
#    HISTORY    : Initial version at 08/15/2011 
#                        Update version 03/27/2018
#############################################################################

PASS=0
FAIL=1
if [ $# -ne 7 -a $# -ne 8 ];then
    echo "Usage: $0 [Year|Month|Day|[DayofWeek]|Hour|Minute|Second|Tolerance]"
    echo -e "Example:\n	$0 2018 10 29 00 11 00 53"
    exit $FAIL
fi
YEAR=$1
MONTH=$2
DAY=$3
if [ $# -eq 7 ];then
    HOUR=$4
    MIN=$5
    SEC=$6
    TOL=$7
else
    HOUR=$5
    MIN=$6
    SEC=$7
    TOL=$8
fi

# Get the Date&Time from RTC by rtc program #
hwclock -s
if [ $? -ne 0 ];then
  echo "Error: hwclock -s"
  echo "fail"
  exit $FAIL
fi 
HWRTC=`date +'%y-%m-%d %T'`

DATE=`echo $HWRTC | cut -c 1-8` 
echo "Date : "$DATE

TIME=`echo $HWRTC | cut -c 10-17`
echo "Time : "$TIME

SYSTIME=`date -d "$DATE $TIME" +%s`
CHKTIME=`date -d "$YEAR-$MONTH-$DAY $HOUR:$MIN:$SEC" +%s`
TOLERANCE=`expr $CHKTIME - $SYSTIME`

echo "Given Tolerance=$TOL seconds"
echo "Read Tolerance=$TOLERANCE seconds"

if [ $TOLERANCE -ge -$TOL -a  $TOLERANCE -le $TOL ];then
  echo "[time check][test success]" 
  exit $PASS
else
  echo "[time check][test failed]" 
  exit $FAIL
fi 
