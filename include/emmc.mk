
.PHONY: writeemmcremote
writeemmcremote: 
	@if [ ! -f "$($(sdcardimage))" ] ; then \
	   $(call printferr,"$(sdcardimage) not exist, please do make first!! \n") \
	   exit 1; \
	 fi
	@printf "Please enter the device IP, you want to write image to SD card. (ex: 172.17.8.183)\n"
	@read ip; \
	 echo "Device's IP $$ip, are you sure to write image to the SD card? (y/n)"; \
	 read ans; \
	 if [ "$$ans" == "y" ] ; then \
	   ssh-keygen -R $${ip}; \
	   ssh root@$${ip} umount /run/media/mmcblk0p?;\
	   scp $($(sdcardimage)) root@$${ip}:/dev/mmcblk0; \
	   ssh root@$${ip} sync; \
	 else \
	   echo bye!!; \
	 fi

