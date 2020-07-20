
.PHONY: writesdcard
writesdcard: 
	@if [ ! -f "$($(sdcardimage))" ] ; then \
	   $(call printferr,"$(sdcardimage) not exist, please do make first!! \n") \
	   exit 1; \
	 fi
	@printf $(YELLOW)"%s\n" "Please select SD card disk to write $(sdcardimage) image. (selections: $(shell lsblk -d | sed -e '1d' | awk '{print $$1}' | sort -d) )"; \
	 printf $(NC); \
	 read disk; \
	 echo "Select '$$disk'. "; \
	 if [ ! -b "/dev/$${disk}" ] ; then \
	   $(call printferr,"/dev/$${disk} not exist!!") \
	   exit 1; \
	 fi ; \
	 echo "Are you sure to write image to /dev/$${disk}? (y/n) "; \
	 read ans; \
	 if [ "$$ans" == "y" ] ; then \
	   dd if=$($(sdcardimage)) of=/dev/$$disk bs=1M status=progress; \
	   sync; sync; \
	   echo "Write image done!!"; \
	 else \
	   echo bye!!; \
	 fi

.PHONY: writesdcardremote
writesdcardremote: 
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
	   ssh root@$${ip} umount /run/media/mmcblk1p?;\
	   scp $($(sdcardimage)) root@$${ip}:/dev/mmcblk1; \
	   ssh root@$${ip} sync; \
	 else \
	   echo bye!!; \
	 fi

