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
LIC_FILES_CHKSUM = "file://LICENSE;md5=4ce3d0350364f3efff545d6ba54f61eb \
                    file://node_modules/source-map-support/LICENSE.md;md5=f433e270f6b1d088c38b279d53048f5e \
                    file://node_modules/source-map-support/node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/source-map-support/node_modules/buffer-from/LICENSE;md5=46513463e8f7d9eb671a243f0083b2c6 \
                    file://node_modules/line-by-line/LICENSE.txt;md5=3dcdc1de6118dc8470249ba4b8186d1c \
                    file://node_modules/modbus-serial/LICENSE;md5=98a791f4f18cf4e29c99e206ad1b55f3 \
                    file://node_modules/modbus-serial/node_modules/serialport/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/binding-mock/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/@serialport/binding-abstract/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/@serialport/binding-abstract/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/stream/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/stream/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-regex/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-ready/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-readline/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-byte-length/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/binding-abstract/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/parser-readline/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/parser-readline/node_modules/@serialport/parser-delimiter/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-cctalk/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/serialport/node_modules/@serialport/parser-delimiter/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/modbus-serial/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/vm2/LICENSE.md;md5=0004fb7b81f10729685935fc6e9be734 \
                    file://node_modules/serialport/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serialport/node_modules/@serialport/binding-mock/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/@serialport/binding-abstract/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/@serialport/binding-abstract/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serialport/node_modules/@serialport/binding-mock/node_modules/@serialport/binding-abstract/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/serialport/node_modules/@serialport/stream/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/stream/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serialport/node_modules/@serialport/parser-regex/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/parser-ready/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/parser-readline/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/parser-byte-length/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/LICENSE;md5=a75272c6b584d0f8e2c1676b4e72469e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/simple-get/LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/simple-get/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/simple-get/node_modules/simple-concat/LICENSE;md5=fb42e5aa12bb9e365d38b4b5691d6984 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/simple-get/node_modules/decompress-response/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/simple-get/node_modules/decompress-response/node_modules/mimic-response/license;md5=d5f2a6dd0192dcc7c833e50bb9017337 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/node-abi/LICENSE;md5=950ded031080d1cc5efffec127b7a852 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/node-abi/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/pump/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/pump/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/pump/node_modules/end-of-stream/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/pump/node_modules/end-of-stream/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/which-pm-runs/LICENSE;md5=a2661af2f2ec8fb665254e547ed4ac87 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/fs-constants/LICENSE;md5=0033175ba371b569c73d23fd726c37e8 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/LICENSE.md;md5=455bc3781a009cf9a615e8622138814c \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/buffer/LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/buffer/node_modules/base64-js/LICENSE;md5=ea9187ca93cdc4f71219d1675712e908 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/buffer/node_modules/ieee754/LICENSE;md5=56c3be003027d64d24ca6b69a2612f2f \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/tar-stream/node_modules/bl/node_modules/readable-stream/node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tar-fs/node_modules/mkdirp-classic/LICENSE;md5=9d0b3b7764a2c71b14f36865c1d30feb \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/LICENSE;md5=039a23da29f56411e6d75d7b7bc9de13 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/delegates/License;md5=039225978c07bc42e8c0ef2f72b81c09 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/set-blocking/LICENSE.txt;md5=8fd106383180f7bbb8f534414fdf7d35 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/is-fullwidth-code-point/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/string-width/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/strip-ansi/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/wide-align/node_modules/string-width/node_modules/strip-ansi/node_modules/ansi-regex/license;md5=915042b5df33c31a6db2b37eadaa00e3 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/console-control-strings/LICENSE;md5=43abbc6f9093aea69560715033788727 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/aproba/LICENSE;md5=9d215c9223fbef14a4642cc450e7ed4b \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/npmlog/node_modules/gauge/node_modules/has-unicode/LICENSE;md5=2bab5b1c26e9c44fc4e489bb98cfb196 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/node_modules/deep-extend/LICENSE;md5=827bb5781213ff1e9d2fe309bbfc0115 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/rc/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/tunnel-agent/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/github-from-package/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/napi-build-utils/LICENSE;md5=422bf72cc7bd42f1141b39eb8bac7903 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/detect-libc/LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/prebuild-install/node_modules/expand-template/LICENSE;md5=a962d6824118a16b514469e71173ac14 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/nan/LICENSE.md;md5=e6270b7774528599f2623a4aeb625829 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/bindings/LICENSE.md;md5=471723f32516f18ef36e7ef63580e4a8 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/bindings/node_modules/file-uri-to-path/LICENSE;md5=9513dc0b97137379cfabc81b60889174 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/binding-abstract/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/parser-readline/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/bindings/node_modules/@serialport/parser-readline/node_modules/@serialport/parser-delimiter/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/parser-cctalk/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/serialport/node_modules/@serialport/parser-delimiter/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://node_modules/bson/LICENSE.md;md5=86d3f3a95c324c9479bd8986968f4327 \
                    file://node_modules/bson/node_modules/buffer/LICENSE;md5=e49e579dbcc02cf1f699deec85fd96f0 \
                    file://node_modules/bson/node_modules/long/LICENSE;md5=d273d63619c9aeaf15cdaf76422c4f87 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/jsmodbus/node_modules/crc/LICENSE;md5=96fda0720658f13fcd8fe9972ae08a77 \
                    file://node_modules/jsmodbus/node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/jsmodbus/node_modules/debug/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/@serialport/list/LICENSE;md5=04756a2813f2b2cb685861664e3448c8 \
                    file://node_modules/@serialport/list/node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://node_modules/@serialport/list/node_modules/@serialport/bindings/LICENSE;md5=e2bc0aa64d278eb2b6ddeb692e294945 \
                    file://docs/gen/scripts/prettify/Apache-License-2.0.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

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

