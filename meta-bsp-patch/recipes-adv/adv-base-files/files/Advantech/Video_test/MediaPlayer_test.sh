#!/bin/bash 

DELAYTIME=1
DEVICE=/dev/video17

###############################
COUNT=$1
FILEPATH=$2
DIRPATH=$(cd `dirname $0`; pwd)

if [ "x$COUNT" = "x" ] || [ ! -f "$FILEPATH" ]; then
	echo "Usage: $0 <PLAY TIMES> <FILE_ABSOLUTELY_PATH>"
	echo "Ex: $0 1 ${DIRPATH}/AT_Corp.mp4"
	exit
fi

date > ${DIRPATH}/video_history.txt
hwclock >> ${DIRPATH}/video_history.txt
#<<!
while [ $COUNT -ge 1 ]; do
	echo "==============================" >> ${DIRPATH}/video_history.txt
	echo "times: $COUNT" >> ${DIRPATH}/video_history.txt

	#echo "gst-launch-1.0 playbin uri=file://${FILEPATH} video-sink=\"imxv4l2sink device=${DEVICE}\"" >> ${DIRPATH}/video_history.txt 2>&1
	gst-launch-1.0 playbin uri=file://${FILEPATH} video-sink="imxv4l2sink device=${DEVICE}" >> ${DIRPATH}/video_history.txt 2>&1

	COUNT=$((COUNT - 1))
	sleep ${DELAYTIME}
done
!

echo "==============================" >> ${DIRPATH}/video_history.txt
date >> ${DIRPATH}/video_history.txt
hwclock >> ${DIRPATH}/video_history.txt

