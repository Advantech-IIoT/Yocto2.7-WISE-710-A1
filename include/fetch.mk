
$(builddir)/.fetch:
	@cd $(yoctodir) && $(repo) init -u $(yoctourl) -b $(yoctobranch) -m $(yoctomanifest) && $(repo) sync
	@touch $@

