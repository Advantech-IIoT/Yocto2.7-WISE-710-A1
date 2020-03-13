
include macro.mk

.PHONY: all prepare build

all: prepare buildqt5

prepare: $(builddir) $(builddir)/.repo $(yoctodir) $(builddir)/.fetch $(builddir)/.setenv $(builddir)/.downloads

build: $(builddir)/.build_core-image-minimal

buildqt5: $(builddir)/.build_fsl-image-qt5

$(builddir)/.downloads:
	@[ -d "$(downloadsdir)" ] && ln -sf $(downloadsdir) $(yoctodir)/downloads
	@touch $@

$(builddir)/.repo: 
#	@mkdir -p $(repodir)
#	@curl -s $(repourl) -o $(repo)
	@git clone --branch v1.13.9.4 $(repogiturl) $(repodir) && rm -rf $(repodir)/.git
	@chmod a+x $(repo)
	@touch $@

$(builddir) $(yoctodir):
	@mkdir -p $@

$(builddir)/.fetch:
	@cd $(yoctodir) && $(repo) init -u $(yoctourl) -b $(yoctobranch) -m $(yoctomanifest) && $(repo) sync
	@touch $@

define extra_local_conf
DL_DIR=$(YOCTO_DL_DIR)
TMPDIR=$(YOCTO_TMPDIR)
SSTATE_DIR=$(YOCTO_SSTATE_DIR)
endef
export extra_local_conf

$(builddir)/.setenv:
	@cd $(yoctodir) && MACHINE=$(yoctomachine) EULA=1 source fsl-setup-release.sh -b $(yoctobuilddir) -e $(yoctodistro)
	@touch $(yoctodir)/$(yoctobuilddir)/conf/sanity.conf
	@echo "$${extra_local_conf}" > $(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf
	@touch $@

define debugcmd
  exec > >(tee -i -a $(builddir)/$(if $(2),log$(shell echo $(2) | sed -e 's/^.*\///'),log.$(shell date +"%F_%T"))); exec 2>&1; set -x; $(1)
endef

$(builddir)/.build_core-image-minimal:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake core-image-minimal,$(@))

$(builddir)/.build_fsl-image-qt5:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake fsl-image-qt5,$(@))

$(builddir)/.bitbake-show-versions:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake -s,$(@))

$(builddir)/.build_u-boot-imx:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake u-boot-imx,$(@))

u-boot-imx: $(builddir)/.build_u-boot-imx

showversions: $(builddir)/.bitbake-show-versions

clean:
	@rm -rf $(builddir)

