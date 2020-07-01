.PHONY: build
build: prepare $(builddir)/.dockerbuild

$(builddir)/.dockerbuild: 
#	@docker build --no-cache --network=host -t $(repo) .
	@docker build --network=host -t $(repo) .
	@touch $@

