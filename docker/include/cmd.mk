
define cmd
  date +"%F_%T"; \
  $(1); \
  date +"%F_%T"; 
endef

ifeq ($(_L),1) 
ifeq ($(_V),1) 
# _L=1, _V=1
define cmd
  logfile=$(logdir)/$(if $(2),log.$(shell echo $(2) | sed -e 's/^.*\///' -e 's/^\.//'),log.$(shell date +"%F_%T")); \
  exec > >(tee -i -a $${logfile}); exec 2>&1; date +"%F_%T"; set -x; $(1); set +x; date +"%F_%T"; echo;
endef
endif # ifeq ($(_V),1)
endif # ifeq ($(_L),1)

ifeq ($(_L),1) 
ifeq ($(_V),0) 
# _L=1, _V=0
define cmd
  logfile=$(logdir)/$(if $(2),log.$(shell echo $(2) | sed -e 's/^.*\///' -e 's/^\.//'),log.$(shell date +"%F_%T")); \
  date +"%F_%T" >> $${logfile} 2>&1; \
  ($(1)) >> $${logfile} 2>&1; \
  date +"%F_%T" >> $${logfile} 2>&1;
endef
endif # ifeq ($(_V),1)
endif # ifeq ($(_L),0)

ifeq ($(S),1) 
  define cmd
    $(1) > /dev/null 2>&1
  endef
endif
