.PHONY: start
start: $(builddir)/.dockercreate $(builddir)/.dockerstart

$(builddir)/.dockerstart: 
	@if [ $(call isrunning) -eq 0 ] ; then \
		docker start $(container); \
	fi
