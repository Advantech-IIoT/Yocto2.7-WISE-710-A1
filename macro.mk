currdir=$(shell pwd)
builddir=${currdir}/build
downloadsdir=$(shell cd ~; realpath -m ./downloads)
yoctodir=$(builddir)/yocto
yoctourl=git@github.com:Advantech-IIoT/Yocto2.7-WISE-710-A1.git
yoctobranch=project/wise710a1-warrior
yoctomanifest=default.xml
yoctomachine=imx6dlwise710a1
yoctobuilddir=build.$(yoctomachine)
yoctodistro=fsl-imx-x11
SHELL=/bin/bash
export YOCTO_DL_DIR="$(YOCTO_WORK_DIR)/downloads"
export YOCTO_TMPDIR="$(YOCTO_WORK_DIR)/tmp"
export YOCTO_SSTATE_DIR="$(YOCTO_WORK_DIR)/sstate-cache"
YOCTO_WORK_DIR_CHK=$(shell if [ -f "$(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf" ] ; then eval $$(cat /mnt/wise710/gitlab/Yocto2.7-WISE-710-A1/build/yocto/build.imx6dlwise710a1/conf/extra-local.conf | grep DL_DIR) ; echo $$DL_DIR | sed -e 's/\/downloads$$//'; fi)
ifneq ($(YOCTO_WORK_DIR_CHK),)
yoctoworkdir=$(YOCTO_WORK_DIR_CHK)
else
yoctoworkdir=$(yoctodir)/$(yoctobuilddir)
endif
fsl-image-qt5=$(shell realpath -m $(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)/fsl-image-qt5-$(yoctomachine).sdcard)
core-image-full-cmdline=$(shell realpath -m $(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)/core-image-full-cmdline-$(yoctomachine).sdcard)
SPL=$(shell realpath -m $(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)/SPL)
sdcardimage=core-image-full-cmdline

CORE_IMAGE_EXTRA_INSTALL=" adv-base-files kernel-modules "
EXTRA_IMAGE_FEATURES=" package-management "
define extra_local_conf_append
DISTRO_FEATURES_remove = " optee "
endef 
export extra_local_conf_append
UBOOT_CONFIG = "1G"

