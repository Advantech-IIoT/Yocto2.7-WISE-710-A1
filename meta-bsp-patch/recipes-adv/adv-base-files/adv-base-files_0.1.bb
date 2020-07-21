SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI += "file://20-wired.network"

do_install(){
    install -d ${D}/etc/systemd/network
    install -m 0644 ${WORKDIR}/20-wired.network ${D}/etc/systemd/network/
}

FILES_${PN} = " /etc/systemd/network/* "

