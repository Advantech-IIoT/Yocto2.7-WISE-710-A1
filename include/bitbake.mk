
$(builddir)/.bitbake-show-versions:
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake -s,$(@))

showversions: $(builddir)/.bitbake-show-versions

