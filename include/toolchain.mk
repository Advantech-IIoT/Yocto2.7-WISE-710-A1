
$(builddir)/.toolchain: 
	@$(call debugcmd,cd $(yoctodir) && source setup-environment $(yoctobuilddir) && bitbake meta-toolchain-qt5,$(@))

toolchain: $(builddir)/.toolchain

