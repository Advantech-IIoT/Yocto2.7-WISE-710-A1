
$(builddir)/.build_core-image-minimal:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake core-image-minimal,$(@))

$(builddir)/.build_core-image-full-cmdline:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake core-image-full-cmdline,$(@))

$(builddir)/.build_fsl-image-qt5:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake fsl-image-qt5,$(@))

.PHONY: imagecmdline buildcmdline
buildcmdline imagecmdline: prepare $(builddir)/.build_core-image-full-cmdline

.PHONY: minimal build
build imageminimal: prepare $(builddir)/.build_core-image-minimal

.PHONY: imageqt5 buildqt5
buildqt5 imageqt5: prepare $(builddir)/.build_fsl-image-qt5

