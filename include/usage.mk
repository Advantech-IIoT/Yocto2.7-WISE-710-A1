define usage_str

##########################################
# distro=$(yoctodistro)                  
# machine=$(yoctomachine)                
##########################################

Usage: 
	make all          - Set up yocto layers and build fsl-image-qt5. 
	make prepare      - Set up yocto layers. 
	make build        - Build core-image-minimal. 
	make buildqt5     - Build fsl-image-qt5
	make u-boot-imx   - Build u-boot-imx
	make linux-imx    - Build linux-imx

  --------

  Yoc can do Yocto Project by manual with commands as below: 

    $$ make prepare
    $$ cd build/yocto/build.$(yoctomachine)
    $$ source setup-environment build.$(yoctomachine)

  Then, you can run 'bitbake' commands. 
  ex: 
    $$ bitbake u-boot-imx 

  --------

  If you want to change the working directory for downloads, sstate_cache 
  and tmp folder location, please define 'YOCTO_WORK_DIR'. 
  ex: 
    $$ YOCTO_WORK_DIR=/root/imx-linux-warrior make prepare

endef
export usage_str

usage help: 
	@echo "$${usage_str}"

default: usage; 
