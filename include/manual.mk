

define manual_prompt

  Please execucate the commands as below by manual....

    $$ cd build/yocto/build.$(yoctomachine)
    $$ source setup-environment build.$(yoctomachine)

endef
export manual_prompt

.PHONY: manual
manual: prepare
	@echo "$${manual_prompt}"
