
.PHONY: status
status: 
	@echo "container: $(shell docker inspect -f '{{.State.Status}}' $(container) 2>/dev/null)"
	@printf "%-20s: %s\n" "image" "$(call imageexist)"
	@printf "%-20s: %s\n" "created" "$(call iscreated)"
	@printf "%-20s: %s\n" "running" "$(call isrunning)"

define iscreated
  $(shell docker inspect $(container) 2>/dev/null | grep -iq created; \
    [ $$? -eq 0 ] && echo 1 || echo 0 )
endef

define isrunning
  $(shell docker inspect -f '{{.State.Status}}' $(container) 2>/dev/null | grep -iq running; \
    [ $$? -eq 0 ] && echo 1 || echo 0 )
endef

define imageexist
   $(shell docker image inspect advantechralph/work:tpc71w_yocto_env >/dev/null 2>&1 ; \
     [ $$? -eq 0 ] && echo 1 || echo 0)
endef

