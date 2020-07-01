.PHONY: clean
clean: 
	@rm -rf $(builddir)

.PHONY: distclean
distclean: 
	@rm -rf $(builddir)
	@docker stop $(container) > /dev/null 2>&1
	@docker rm $(container) > /dev/null 2>&1

