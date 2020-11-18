SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
SRC_URI += " \
  file://20-wired.network \
  file://Advantech \
  file://lib \
  file://swap-eth.service \
  file://com-rs.service \
  file://gpio-export.service \
  file://direct-powerdown.service \
  file://stress-reboot.service \
  file://sysctl.d \
"
S = "${WORKDIR}"

RDEPENDS_${PN} += " \
  bash \
  expect \
  libxml2 \
  nodejs \
  nodejs-npm \
  node-red \
  node-red-contrib-modbus \
  e2fsprogs-resize2fs \
  i2c-tools \
  mtd-utils \
  usbutils \
"

inherit useradd

USERADD_PACKAGES = "${PN}"

GROUPADD_PARAM_${PN} = " \
  -g 1000 advantech; \
"

USERADD_PARAM_${PN} = "\
  -u 1000 -g advantech -d /home/advantech -m -s /bin/sh advantech; \
"

do_install(){
    install -d ${D}${sysconfdir}/systemd/network
    install -m 0644 ${WORKDIR}/20-wired.network ${D}${sysconfdir}/systemd/network/

    install -d ${D}/usr/Advantech
    tar -C ${WORKDIR}/Advantech --numeric-owner -zcpvf - . | tar -C ${D}/usr/Advantech -zxpvf -

    install -d ${D}/usr/lib
    tar -C ${WORKDIR}/lib --numeric-owner -zcpvf - . | tar -C ${D}/usr/lib -zxpvf -

    install -d ${D}/etc/sysctl.d
    tar -C ${WORKDIR}/sysctl.d --numeric-owner -zcpvf - . | tar -C ${D}/etc/sysctl.d -zxpvf -

    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    install -d ${D}${sysconfdir}/systemd/system/poweroff.target.wants
    install -m 0644 ${WORKDIR}/swap-eth.service ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/com-rs.service ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/gpio-export.service ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/direct-powerdown.service ${D}${sysconfdir}/systemd/system
    install -m 0644 ${WORKDIR}/stress-reboot.service ${D}${sysconfdir}/systemd/system
    ln -sf /etc/systemd/system/swap-eth.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/swap-eth.service
    ln -sf /etc/systemd/system/com-rs.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/com-rs.service
    ln -sf /etc/systemd/system/gpio-export.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/gpio-export.service
    ln -sf /etc/systemd/system/direct-powerdown.service ${D}${sysconfdir}/systemd/system/poweroff.target.wants/direct-powerdown.service
}

FILES_${PN} = " /etc/* /etc/systemd/network/* /etc/systemd/system/* /etc/systemd/system/multi-user.target.wants/* /etc/systemd/system/poweroff.target.wants/* "
FILES_${PN} += " /usr/* /usr/Advantech/* /usr/lib/* "
FILES_${PN} += " /etc/sysctl.d/* "

FILES_${PN}-dev = ""

# Prevents do_package failures with:
# debugsources.list: No such file or directory:
INHIBIT_PACKAGE_DEBUG_SPLIT = "1"

