
define bar
$(shell printf "#%.0s" {1..47}; echo)
endef

define usage_str

$(call bar)
# distro=$(yoctodistro)                  
# machine=$(yoctomachine)                
$(call bar)

Usage: 

  $$ make [target] [parameter: <ENV1=VAR1> <ENV2=VAR2> ... ]

    Build target by makefile rules. 

    target: 

      <empty>                        Default target, show this usage.
      info                           Show macro information
      prepare                        Set up yocto layers. 
      build                          Build core-image-minimal image. 
      buildqt5                       Build fsl-image-qt5 image. 
      u-boot-imx                     Build u-boot-imx
      linux-imx                      Build linux-imx
                                                               
    parameter:                                                 
                                                               
      YOCTO_WORK_DIR=[path]          Yocto working directory: downloads, tmp and i
                                     sstate_cache. 

  --------

  How to run Yocto Project by manual: 

    $$ make prepare
    $$ cd build/yocto/build.$(yoctomachine)
    $$ source setup-environment build.$(yoctomachine)

  Then, you can run Yocto tools, ex: bitbake, devtool and etc. 
 
  ex: 

    $$ bitbake u-boot-imx 

  --------

  If you want to change the working directory for downloads, sstate_cache 
  and tmp folder location, please define 'YOCTO_WORK_DIR'. 

  ex: 

    $$ YOCTO_WORK_DIR=/root/imx-linux-krogoth make prepare

  Currently, YOCTO_WORK_DIR=$(shell if [ -f "$(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf" ] ; then source $(yoctodir)/$(yoctobuilddir)/conf/extra-local.conf; echo $$DL_DIR| sed -e 's/\/downloads$$//'; fi)

endef
export usage_str

usage help: 
	@echo "$${usage_str}" | more

