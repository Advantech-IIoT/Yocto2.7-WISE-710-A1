currdir=$(shell pwd)
builddir=${currdir}/build
downloadsdir=$(shell cd ~; realpath -m ./downloads)
yoctodir=$(builddir)/yocto
yoctourl=https://github.com/advantechralph/yocto.git
yoctobranch=project/wise710a1-warrior
yoctomanifest=default.xml
yoctomachine=imx6dlwise710a1
yoctobuilddir=build.$(yoctomachine)
yoctodistro=fsl-imx-x11
SHELL=/bin/bash
export YOCTO_DL_DIR="$(YOCTO_WORK_DIR)/downloads"
export YOCTO_TMPDIR="$(YOCTO_WORK_DIR)/tmp"
export YOCTO_SSTATE_DIR="$(YOCTO_WORK_DIR)/sstate-cache"
YOCTO_WORK_DIR_CHK=$(shell if [ -f "$(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf" ] ; then eval $$(cat /work/wise710a1/yocto-2.7/build/yocto/build.imx6dlwise710a1/conf/extra-local.conf | grep DL_DIR) ; echo $$DL_DIR | sed -e 's/\/downloads$$//'; fi)
ifneq ($(YOCTO_WORK_DIR_CHK),)
yoctoworkdir=$(YOCTO_WORK_DIR_CHK)
else
yoctoworkdir=$(yoctodir)/$(yoctobuilddir)
endif
fsl-image-qt5=$(shell realpath -m $(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)/fsl-image-qt5-$(yoctomachine).sdcard)
core-image-full-cmdline=$(shell realpath -m $(yoctoworkdir)/tmp/deploy/images/$(yoctomachine)/core-image-full-cmdline-$(yoctomachine).sdcard)
sdcardimage=core-image-full-cmdline

CORE_IMAGE_EXTRA_INSTALL=" adv-base-files "

