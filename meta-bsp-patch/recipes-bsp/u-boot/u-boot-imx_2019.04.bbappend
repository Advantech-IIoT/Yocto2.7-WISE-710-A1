FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-wise710a1.patch"

UBOOT_MAKE_TARGET="SPL u-boot.bin u-boot.imx"
