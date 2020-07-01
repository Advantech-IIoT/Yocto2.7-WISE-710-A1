.PHONY: commit
commit: $(builddir)/.dockercommit

$(builddir)/.dockercommit: 
	@docker commit $(container) $(repo)
