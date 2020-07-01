.PHONY: run
run: $(builddir)/.dockerrun

$(builddir)/.dockerrun: 
	@mkdir -p $(builddir)/share
	@docker run --name $(container) \
		--network host \
		-v $(builddir)/share:/share \
		-it $(repo)
