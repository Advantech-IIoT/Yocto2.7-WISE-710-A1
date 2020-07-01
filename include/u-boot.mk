
$(builddir)/.build_u-boot-imx:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake u-boot-imx,$(@))

u-boot-imx: $(builddir)/.build_u-boot-imx

