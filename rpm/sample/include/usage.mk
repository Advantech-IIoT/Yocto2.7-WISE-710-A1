
define bar
$(shell printf "#%.0s" {1..55})
endef

define title
$(shell printf "# %-51s #" "")
$(shell printf "# %-51s #" "Create Debian Sample Package Usage")
$(shell printf "# %-51s #" "")
endef

define usage_info

$(call bar)
$(call title)
$(call bar)

Create Sample dpkg: 

  $$ make sample

endef

export usage_info

usage help: 
	@echo "$${usage_info}"

