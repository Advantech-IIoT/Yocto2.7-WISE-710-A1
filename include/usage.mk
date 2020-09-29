
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
      usage                          Default target, show this usage.
      help                           Default target, show this usage.
      info                           Show macro information
      prepare                        Set up yocto layers and varaibles. 
      build                          Build core-image-minimal image. 
      buildqt5                       Build fsl-image-qt5 image. 
      buildcmdline                   Build core-image-full-cmdline image.
      u-boot-imx                     Build u-boot-imx
      linux-imx                      Build linux-imx
      writesdcard                    Write image to SDCARD.
      writesdcardremote              Write image to SDCARD on remote device.
                                                               
    parameter:                                                 
                                                               
      YOCTO_WORK_DIR=[path]          Yocto working directory: downloads, tmp and 
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

  Currently, YOCTO_WORK_DIR=$(yoctoworkdir)

endef
export usage_str

usage help: 
	@echo "$${usage_str}" | more

