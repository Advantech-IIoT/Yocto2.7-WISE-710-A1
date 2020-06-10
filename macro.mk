currdir=$(shell pwd)
builddir=${currdir}/build
downloadsdir=$(shell cd ~; realpath -m ./downloads)
yoctodir=$(builddir)/yocto
yoctourl=https://github.com/advantechralph/yocto.git
yoctobranch=project/wise710a1
yoctomanifest=default.xml
yoctomachine=imx6dlwise710a1
yoctobuilddir=build.$(yoctomachine)
yoctodistro=x11
SHELL=/bin/bash
export YOCTO_DL_DIR="$(YOCTO_WORK_DIR)/downloads"
export YOCTO_TMPDIR="$(YOCTO_WORK_DIR)/tmp"
export YOCTO_SSTATE_DIR="$(YOCTO_WORK_DIR)/sstate-cache"
