.PHONY: create
create: $(builddir)/.dockercreate

$(builddir)/.dockercreate: 
	@if [ $(call iscreated) -eq 0 ] ; then \
		mkdir -p $(builddir)/share; \
		docker create --name $(container) \
			--privileged \
			--network host \
			--hostname $(container) \
			-v /dev:/dev \
			-v $(sharedir):/share \
			-v $(workdir):/work \
			-t $(repo) ; \
	fi



#	@if [ $(call iscreated) -eq 0 ] ; then \

