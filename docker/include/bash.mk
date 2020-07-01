.PHONY: bash
bash: start $(builddir)/.dockerbash

$(builddir)/.dockerbash: 
	-@docker exec -it $(container) bash

