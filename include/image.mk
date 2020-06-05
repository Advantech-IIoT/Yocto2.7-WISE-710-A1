
$(builddir)/.build_core-image-minimal:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake core-image-minimal,$(@))

$(builddir)/.build_fsl-image-qt5:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake fsl-image-qt5,$(@))

