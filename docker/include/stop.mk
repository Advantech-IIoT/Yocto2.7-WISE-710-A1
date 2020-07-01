.PHONY: stop
stop: $(builddir)/.dockerstop

$(builddir)/.dockerstop: 
	@docker stop $(container)
