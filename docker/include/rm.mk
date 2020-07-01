.PHONY: rm
rm: $(builddir)/.dockerstop $(builddir)/.dockerrm

$(builddir)/.dockerrm: 
	@docker rm $(container)

