FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-wise710a1.patch"
SRC_URI += "file://0001-add-advantech-watchdog.patch"
SRC_URI += "file://0001-disable-i2c2-and-i2c3.patch"
SRC_URI += "file://0001-rename-sys-class-gpio.patch"
SRC_URI += "file://0001-fine-tune-dts-for-gpio.patch"

