include ../../../macro.mk
currdir=$(shell realpath -m ../../../)
bitbakedir=$(shell realpath -m $(yoctodir)/sources/poky/bitbake/)
bitbakepath=$(shell realpath -m $(bitbakedir)/bin/bitbake)
sysbitbakepath=$(shell which bitbake)

define bitbake_error_info
*** bitbake error!! ***

Please run commands as below...

 $$ cd $(yoctodir) && source setup-environment $(yoctobuilddir)

endef
export bitbake_error_info

define checkbitbake
  [ "$(sysbitbakepath)" == "$(bitbakepath)" ] && echo "bitbake ok!!" || (echo "$$bitbake_error_info" && exit -1)
endef

define logcmd
  exec > >(tee -i -a $(if $(2),log$(shell echo $(2) | sed -e 's/^.*\///'),log.$(shell date +"%F_%T"))); exec 2>&1; set -x; $(1)
endef

.PHONY: all
all: checkbitbake

.PHONY: checkbitbake
checkbitbake: 
	@$(call checkbitbake)

.PHONY: showversions
showversions: 
	@$(call logcmd,bitbake -s,.$(@))

define bitbakeeval
.PHONY: $(1)
$(1): 
	@$(call logcmd,bitbake $(1) -vDDD,.$(1))
endef

bitbaketargets:=u-boot-imx linux-imx
$(foreach t,$(bitbaketargets),$(eval $(call bitbakeeval,$(t))))


