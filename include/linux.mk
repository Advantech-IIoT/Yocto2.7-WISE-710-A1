
$(builddir)/.build_linux-imx:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake linux-imx,$(@))

linux-imx: $(builddir)/.build_linux-imx

