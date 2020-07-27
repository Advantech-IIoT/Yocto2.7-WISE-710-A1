#!/bin/sh
#############################################################################
#    FILE        : $0
#    DESCRIPTION : Update test time
#    USAGE       : ./up_time.sh [Year|Month|Day|DayofWeek|Hour|Minute|Second]"
#    EXAMPLE     : ./up_time.sh 2018 10 29 00 11 00 53 
#    HISTORY     : Initial version at 08/15/2011 
#                        Update version 03/27/2018
#############################################################################

PASS=0
FAIL=1
if [ $# -ne 7 ];then
    echo "Usage: $0 [Year|Month|Day|DayofWeek|Hour|Minute|Second]"
    echo -e "Example:\n $0 2018 10 29 00 11 00 53"
    exit $FAIL
fi
YEAR=$1
MONTH=$2
DAY=$3
DAYOFWEEK=$4
HOUR=$5
MIN=$6
SEC=$7

# Set the Date&Time by rtc program #
echo "date -s $YEAR$MONTH$DAY $HOUR:$MIN:$SEC"
date -s "$YEAR$MONTH$DAY $HOUR:$MIN:$SEC"

if [ $? -eq 0 ];then
  hwclock -w
  echo "[time update][test success]" 
  exit $PASS
else
  echo "[time update][test failed]" 
  exit $FAIL
fi 

