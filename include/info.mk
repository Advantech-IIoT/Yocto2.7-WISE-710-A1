
.PHONY: info
info: 
	@printf "%-30s: %s\n" "machine" "$(yoctomachine)"
	@printf "%-30s: %s\n" "manifest" "$(yoctomanifest)"
	@printf "%-30s: %s\n" "build folder" "$(yoctodir)/$(yoctobuilddir)"
	@printf "%-30s: %s\n" "YOCTO_WORK_DIR" "$(yoctoworkdir)" 
ifneq ($(YOCTO_WORK_5IR_CHK),)
	@printf "%-30s: %s\n" "YOCTO_WORK_DIR(old)" "$(yoctodir)/$(yoctobuilddir)" 
endif
	@printf "%-30s: %s\n" "download folder" "$(yoctoworkdir)/downloads"
	@printf "%-30s: %s\n" "deploy folder" "$(yoctoworkdir)/tmp/deploy"
	@printf "%-30s: %s\n" "sdk folder" "$(yoctoworkdir)/tmp/sdk"
	@printf "%-30s: %s\n" "images folder" "$(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)"
#	@printf "%-30s: %s\n" "fsl-image-qt5" "$(fsl-image-qt5)"
#	@printf "%-30s: %s\n" "core-image-full-cmdline" "$(core-image-full-cmdline)"
	@printf "%-30s: %s\n" "SPL" "$(SPL)"
	@printf "%-30s: %s\n" "sdcardimage" "$($(sdcardimage))"


