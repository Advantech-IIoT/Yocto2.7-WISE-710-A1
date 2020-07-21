
ifdef YOCTO_WORK_DIR
define extra_local_conf
DL_DIR=$(YOCTO_DL_DIR)
TMPDIR=$(YOCTO_TMPDIR)
SSTATE_DIR=$(YOCTO_SSTATE_DIR)
endef
export extra_local_conf
endif

$(builddir)/.setenv:
ifdef YOCTO_WORK_DIR
	@mkdir -p $(YOCTO_WORK_DIR)
endif
	@cd $(yoctodir) && MACHINE=$(yoctomachine) DISTRO=$(yoctodistro) EULA=1 source fsl-setup-release.sh -b $(yoctobuilddir) -e $(yoctodistro)
ifdef YOCTO_WORK_DIR
	@ln -sf $(YOCTO_WORK_DIR) $(yoctodir)/$(yoctobuilddir)/workdir
endif
	@touch $(yoctodir)/$(yoctobuilddir)/conf/sanity.conf
	@echo "$${extra_local_conf}" > $(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf
	@echo "CORE_IMAGE_EXTRA_INSTALL += \"$(CORE_IMAGE_EXTRA_INSTALL)\"" >> $(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf
	@ln -sf $(currdir)/yocto.build.mk $(yoctodir)/$(yoctobuilddir)/Makefile
	@touch $@

resetenv: $(builddir)/.resetenv $(builddir)/.setenv

$(builddir)/.resetenv: 
	@rm -rf $(builddir)/.setenv

$(builddir)/.resetenv: 

