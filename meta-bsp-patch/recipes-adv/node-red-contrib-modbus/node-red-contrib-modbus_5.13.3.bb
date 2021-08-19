# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "The all in one Modbus TCP and Serial contribution package for Node-RED."
HOMEPAGE = "https://github.com/sponsors/biancode/"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   node_modules/source-map-support/node_modules/source-map/LICENSE
#   node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/nan/LICENSE.md
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/readable-stream/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/LICENSE.md
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/buffer/node_modules/ieee754/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/LICENSE.APACHE2
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/LICENSE.BSD
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tunnel-agent/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/detect-libc/LICENSE
#   node_modules/serialport/node_modules/@serialport/bindings/node_modules/nan/LICENSE.md
#   node_modules/bson/LICENSE.md
#   node_modules/bson/node_modules/long/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & BSD-3-Clause & ISC & MIT & Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ce3d0350364f3efff545d6ba54f61eb"

SRC_URI = "npm://registry.npmjs.org/;name=node-red-contrib-modbus;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-bson-buffer = "MIT"
LICENSE_${PN}-bson-long = "Apache-2.0"
LICENSE_${PN}-bson = "Apache-2.0"
LICENSE_${PN}-debug-ms = "MIT"
LICENSE_${PN}-debug = "MIT"
LICENSE_${PN}-jsmodbus-crc = "MIT"
LICENSE_${PN}-jsmodbus-debug-ms = "MIT"
LICENSE_${PN}-jsmodbus-debug = "MIT"
LICENSE_${PN}-jsmodbus = "MIT"
LICENSE_${PN}-line-by-line = "MIT"
LICENSE_${PN}-modbus-serial-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-binding-mock-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-binding-mock-serialport-binding-abstract-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-bindings-bindings = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-bindings-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-bindings-nan = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-bindings-prebuild-install = "MIT"
LICENSE_${PN}-modbus-serial-serialport-serialport-stream-debug = "MIT"
LICENSE_${PN}-modbus-serial-serialport = "MIT"
LICENSE_${PN}-modbus-serial = "ISC"
LICENSE_${PN}-serialport-debug = "MIT"
LICENSE_${PN}-serialport-list-commander = "MIT"
LICENSE_${PN}-serialport-serialport-binding-mock-debug = "MIT"
LICENSE_${PN}-serialport-serialport-binding-mock-serialport-binding-abstract-debug-ms = "MIT"
LICENSE_${PN}-serialport-serialport-binding-mock-serialport-binding-abstract-debug = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-bindings-file-uri-to-path = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-bindings = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-debug = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-nan = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-detect-libc = "Apache-2.0"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-expand-template = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-github-from-package = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-minimist = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-mkdirp-minimist = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-mkdirp = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-napi-build-utils = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-node-abi-semver = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-node-abi = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-noop-logger = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-delegates = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-inherits = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-isarray = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-safe-buffer = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet-readable-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-are-we-there-yet = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-console-control-strings = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-aproba = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-console-control-strings = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-has-unicode = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-object-assign = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-signal-exit = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width-code-point-at = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width-strip-ansi = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-string-width = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-strip-ansi = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-wide-align-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-wide-align-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-wide-align-string-width-strip-ansi = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-wide-align-string-width = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge-wide-align = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-gauge = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog-set-blocking = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-npmlog = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-pump-end-of-stream-once-wrappy = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-pump-end-of-stream-once = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-pump-end-of-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-pump-once = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-pump = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-rc-deep-extend = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-rc-ini = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-rc-minimist = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-rc-strip-json-comments = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-rc = "Unknown MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-simple-get-decompress-response-mimic-response = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-simple-get-decompress-response = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-simple-get-once = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-simple-get-simple-concat = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-simple-get = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-chownr = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-mkdirp-classic = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-pump = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-buffer-base64-js = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-buffer-ieee754 = "BSD-3-Clause"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-buffer = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-inherits = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-readable-stream-inherits = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl-readable-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-bl = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-end-of-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-fs-constants = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-inherits = "ISC"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream-readable-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs-tar-stream = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tar-fs = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install-which-pm-runs = "MIT"
LICENSE_${PN}-serialport-serialport-bindings-prebuild-install = "MIT"
LICENSE_${PN}-serialport-serialport-stream-debug = "MIT"
LICENSE_${PN}-serialport = "MIT"
LICENSE_${PN}-source-map-support-buffer-from = "MIT"
LICENSE_${PN}-source-map-support-source-map = "BSD-3-Clause"
LICENSE_${PN}-source-map-support = "MIT"
LICENSE_${PN}-vm2 = "MIT"
LICENSE_${PN} = "Unknown Apache-2.0 MIT"

NPMPN = "node-red-contrib-modbus"
RDEPENDS_${PN} = "nodejs node-red"

