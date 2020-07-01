
.PHONY: sample
sample: $(builddir) $(builddir)/.fetch_sample $(builddir)/.patch_sample $(builddir)/.build_sample 

$(builddir)/.fetch_sample: 
	@cp -a sample $(builddir)/$(name)
	@mkdir -p $(rpmdir)/{BUILD,SRPMS,RPMS,SOURCE}
	@touch $@

$(builddir)/.patch_sample: 
	@sed -i "s%__rpmdir__%$(rpmdir)%g" $(spec)
	@sed -i "s%__buildroot__%$(buildroot)%g" $(spec)
	@sed -i "s%__name__%$(name)%g" $(spec)
	@sed -i "s%__version__%$(version)%g" $(spec)
	@sed -i "s%__revision__%$(revision)%g" $(spec)
	@sed -i "s%__arch__%$(arch)%g" $(spec)
	@touch $@

$(builddir)/.build_sample: $(builddir)
	@(rpmbuild -v -ba --nodeps $(spec))

