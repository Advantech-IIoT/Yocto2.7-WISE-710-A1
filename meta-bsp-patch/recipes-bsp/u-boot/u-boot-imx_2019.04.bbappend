FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-wise710a1.patch"
SRC_URI += "file://0001-add-config-for-ddr.patch"
SRC_URI += "file://0001-use-imx6dl-wise710-a1.dtb-for-fdt-file.patch"

UBOOT_MAKE_TARGET = "SPL u-boot.bin u-boot.imx u-boot-dtb.img u-boot_crc.bin"

SPL_BINARY = "SPL"

do_install_append(){
    if [ -n "${UBOOT_CONFIG}" ]
    then
        for config in ${UBOOT_MACHINE}; do
            if [ -e "${B}/${config}/u-boot-dtb.img" ] 
            then 
                install -m 644 ${B}/${config}/u-boot-dtb.img ${D}/boot/u-boot-dtb.img
            fi
            if [ -e "${B}/${config}/u-boot_crc.bin" ] 
            then 
                install -m 644 ${B}/${config}/u-boot_crc.bin ${D}/boot/u-boot_crc.bin
                install -m 644 ${B}/${config}/u-boot_crc.bin.crc ${D}/boot/u-boot_crc.bin.crc
            fi
        done
    else
        if [ -e "${B}/u-boot-dtb.img" ] 
        then 
            install -m 644 ${B}/u-boot-dtb.img ${D}/boot/u-boot-dtb.img
        fi
        if [ -e "${B}/u-boot_crc.bin" ] 
        then 
            install -m 644 ${B}/u-boot_crc.bin ${D}/boot/u-boot_crc.bin
            install -m 644 ${B}/u-boot_crc.bin.crc ${D}/boot/u-boot_crc.bin.crc
        fi
    fi
}

do_deploy_append(){
    if [ -n "${UBOOT_CONFIG}" ]
    then
        for config in ${UBOOT_MACHINE}; do
            if [ -e "${B}/${config}/u-boot-dtb.img" ] 
            then 
                install -m 644 ${B}/${config}/u-boot-dtb.img ${DEPLOYDIR}/u-boot-dtb.img
            fi
            if [ -e "${B}/${config}/u-boot_crc.bin" ] 
            then 
                install -m 644 ${B}/${config}/u-boot_crc.bin ${DEPLOYDIR}/u-boot_crc.bin
                install -m 644 ${B}/${config}/u-boot_crc.bin.crc ${DEPLOYDIR}/u-boot_crc.bin.crc
            fi
        done
    else
        if [ -e "${B}/u-boot-dtb.img" ] 
        then 
            install -m 644 ${B}/u-boot-dtb.img ${DEPLOYDIR}/u-boot-dtb.img
        fi
        if [ -e "${B}/u-boot_crc.bin" ] 
        then 
            install -m 644 ${B}/u-boot_crc.bin ${DEPLOYDIR}/u-boot_crc.bin
            install -m 644 ${B}/u-boot_crc.bin.crc ${DEPLOYDIR}/u-boot_crc.bin.crc
        fi
    fi
}

