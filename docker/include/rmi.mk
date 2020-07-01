.PHONY: rm
rmi: $(builddir)/.dockerrmi

$(builddir)/.dockerrmi: 
	@docker rmi $(repo)

