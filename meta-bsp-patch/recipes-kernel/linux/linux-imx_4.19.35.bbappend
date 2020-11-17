FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += "file://0001-wise710a1.patch"
SRC_URI += "file://0001-add-advantech-watchdog.patch"
SRC_URI += "file://0001-disable-i2c2-and-i2c3.patch"
SRC_URI += "file://0001-rename-sys-class-gpio.patch"
SRC_URI += "file://0001-fine-tune-dts-for-gpio.patch"
SRC_URI += "file://0001-disable-auto-version.patch"
SRC_URI += "file://0001-add-imx6dl-wise710-a1.dts.patch"
SRC_URI += "file://0002-fix-watchdog-restart-handler-fatlal-problem.patch"
SRC_URI += "file://0001-update-for-device-tree-and-proc-board-data.patch"
SRC_URI += "file://0001-enable-fb-in-dts.patch"
SRC_URI += "file://0002-fix-psplash-error.patch"

LOCALVERSION = ""

