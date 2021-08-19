# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "Low-code programming for event-driven applications"
HOMEPAGE = "http://nodered.org"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   LICENSE
#   node_modules/node-red-admin/LICENSE
#   node_modules/node-red-admin/node_modules/cli-table/node_modules/colors/MIT-LICENSE.txt
#   node_modules/node-red-admin/node_modules/bcryptjs/LICENSE
#   node_modules/node-red-admin/node_modules/bcrypt/node_modules/node-pre-gyp/LICENSE
#   node_modules/node-red-admin/node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rc/LICENSE.APACHE2
#   node_modules/node-red-admin/node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rc/LICENSE.BSD
#   node_modules/node-red-admin/node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/detect-libc/LICENSE
#   node_modules/node-red-admin/node_modules/bcrypt/node_modules/nan/LICENSE.md
#   node_modules/bcryptjs/LICENSE
#   node_modules/@node-red/editor-api/LICENSE
#   node_modules/@node-red/editor-api/node_modules/bcryptjs/LICENSE
#   node_modules/@node-red/editor-api/node_modules/clone/LICENSE
#   node_modules/@node-red/editor-api/node_modules/when/LICENSE.txt
#   node_modules/@node-red/editor-api/node_modules/express/node_modules/qs/LICENSE
#   node_modules/@node-red/editor-api/node_modules/body-parser/node_modules/qs/LICENSE
#   node_modules/@node-red/editor-api/node_modules/@node-red/util/LICENSE
#   node_modules/@node-red/editor-api/node_modules/@node-red/util/node_modules/lodash.clonedeep/LICENSE
#   node_modules/@node-red/editor-api/node_modules/@node-red/util/node_modules/clone/LICENSE
#   node_modules/@node-red/editor-api/node_modules/@node-red/util/node_modules/when/LICENSE.txt
#   node_modules/@node-red/editor-api/node_modules/@node-red/editor-client/LICENSE
#   node_modules/@node-red/editor-api/node_modules/@node-red/editor-client/public/vendor/ace/LICENSE
#   node_modules/@node-red/util/LICENSE
#   node_modules/@node-red/nodes/LICENSE
#   node_modules/@node-red/nodes/node_modules/denque/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.filter/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.pick/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.merge/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.map/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.assignin/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domutils/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domutils/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domutils/node_modules/dom-serializer/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/entities/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domhandler/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/htmlparser2/node_modules/domhandler/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.some/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.bind/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/css-what/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/nth-check/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/domutils/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/domutils/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/domutils/node_modules/dom-serializer/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/domutils/node_modules/dom-serializer/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/css-select/node_modules/domutils/node_modules/dom-serializer/node_modules/entities/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/dom-serializer/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/dom-serializer/node_modules/domelementtype/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/dom-serializer/node_modules/entities/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.flatten/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.foreach/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.reduce/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.defaults/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/lodash.reject/LICENSE
#   node_modules/@node-red/nodes/node_modules/cheerio/node_modules/entities/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/websocket-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/websocket-stream/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/split2/node_modules/through2/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/callback-stream/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/pumpify/node_modules/duplexify/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/glob/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/ordered-read-streams/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/unique-stream/node_modules/through2-filter/node_modules/through2/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/glob-stream/node_modules/unique-stream/node_modules/through2-filter/node_modules/through2/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/help-me/node_modules/through2/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/concat-stream/node_modules/typedarray/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/concat-stream/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/mqtt-packet/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/mqtt-packet/node_modules/process-nextick-args/license.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/mqtt-packet/node_modules/bl/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/mqtt/node_modules/mqtt-packet/node_modules/bl/node_modules/readable-stream/LICENSE
#   node_modules/@node-red/nodes/node_modules/fs.notify/node_modules/retry/License
#   node_modules/@node-red/nodes/node_modules/js-yaml/node_modules/argparse/node_modules/sprintf-js/LICENSE
#   node_modules/@node-red/nodes/node_modules/js-yaml/node_modules/esprima/LICENSE.BSD
#   node_modules/@node-red/nodes/node_modules/request/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/caseless/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/aws-sign2/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/isstream/LICENSE.md
#   node_modules/@node-red/nodes/node_modules/request/node_modules/tunnel-agent/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/forever-agent/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/tough-cookie/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/qs/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/jsprim/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/verror/node_modules/extsprintf/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/jsprim/node_modules/extsprintf/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/bcrypt-pbkdf/node_modules/tweetnacl/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/tweetnacl/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/dashdash/LICENSE.txt
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/asn1/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/jsbn/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/node_modules/jsbn/LICENSE
#   node_modules/@node-red/nodes/node_modules/request/node_modules/http-signature/node_modules/sshpk/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   node_modules/@node-red/nodes/node_modules/request/node_modules/oauth-sign/LICENSE
#   node_modules/@node-red/nodes/node_modules/xml2js/node_modules/sax/LICENSE
#   node_modules/@node-red/runtime/LICENSE
#   node_modules/@node-red/runtime/node_modules/clone/LICENSE
#   node_modules/@node-red/runtime/node_modules/when/LICENSE.txt
#   node_modules/@node-red/runtime/node_modules/@node-red/util/LICENSE
#   node_modules/@node-red/runtime/node_modules/@node-red/registry/LICENSE
#   node_modules/@node-red/runtime/node_modules/@node-red/registry/node_modules/when/LICENSE.txt
#   node_modules/@node-red/runtime/node_modules/@node-red/registry/node_modules/@node-red/util/LICENSE
#   node_modules/@node-red/runtime/node_modules/@node-red/registry/node_modules/uglify-js/LICENSE
#   node_modules/node-red-node-rbe/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rimraf/node_modules/glob/node_modules/fs.realpath/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/needle/node_modules/sax/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/process-nextick-args/license.md
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/npmlog/node_modules/are-we-there-yet/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/nopt/node_modules/abbrev/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rc/LICENSE.APACHE2
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/rc/LICENSE.BSD
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/tar/node_modules/minizlib/LICENSE
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/npm-packlist/node_modules/ignore-walk/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/bcrypt/node_modules/node-pre-gyp/node_modules/detect-libc/LICENSE
#   node_modules/bcrypt/node_modules/nan/LICENSE.md
#   node_modules/node-red-node-tail/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "BSD-2-Clause & BSD-like & Apache-2.0 & Unlicense & ISC & \
MIT & Unknown & BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d6f37569f5013072e9490d2194d10ae6"

SRC_URI = "npm://registry.npmjs.org/;name=node-red;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-basic-auth-safe-buffer = "MIT"
LICENSE_${PN}-basic-auth = "MIT"
LICENSE_${PN}-bcrypt-nan = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-detect-libc = "Apache-2.0"
LICENSE_${PN}-bcrypt-node-pre-gyp-mkdirp-minimist = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-mkdirp = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle-debug-ms = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle-debug = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle-iconv-lite = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle-sax = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-needle = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-nopt-abbrev = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-nopt-osenv-os-homedir = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-nopt-osenv-os-tmpdir = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-nopt-osenv = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-nopt = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-ignore-walk-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-ignore-walk-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-ignore-walk-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-ignore-walk-minimatch = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-ignore-walk = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-npm-bundled-npm-normalize-package-bin = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-npm-bundled = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist-npm-normalize-package-bin = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npm-packlist = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-delegates = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-inherits = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-isarray = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-process-nextick-args = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-safe-buffer = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet-readable-stream = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-are-we-there-yet = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-console-control-strings = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-aproba = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-console-control-strings = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-has-unicode = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-object-assign = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-signal-exit = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width-code-point-at = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width-is-fullwidth-code-point-number-is-nan = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width-strip-ansi = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-string-width = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-strip-ansi = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-wide-align-string-width-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-wide-align-string-width-strip-ansi-ansi-regex = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-wide-align-string-width-strip-ansi = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-wide-align-string-width = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge-wide-align = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-gauge = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog-set-blocking = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-npmlog = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rc-deep-extend = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-rc-ini = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rc-minimist = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-rc-strip-json-comments = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-rc = "MIT Unknown"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-fs.realpath = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-inflight-once = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-inflight-wrappy = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-inflight = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-inherits = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-minimatch = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-once = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob-path-is-absolute = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf-glob = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-rimraf = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-semver = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-chownr = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-fs-minipass-minipass-safe-buffer = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-fs-minipass-minipass-yallist = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-fs-minipass-minipass = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-fs-minipass = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-minipass = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-minizlib-minipass = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-minizlib = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-mkdirp = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-safe-buffer = "MIT"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar-yallist = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp-tar = "ISC"
LICENSE_${PN}-bcrypt-node-pre-gyp = "BSD-3-Clause"
LICENSE_${PN}-bcryptjs = "MIT"
LICENSE_${PN}-bcrypt = "MIT"
LICENSE_${PN}-express = "MIT"
LICENSE_${PN}-fs-extra = "MIT"
LICENSE_${PN}-node-red-admin-axios-follow-redirects-debug = "MIT"
LICENSE_${PN}-node-red-admin-axios-follow-redirects = "MIT"
LICENSE_${PN}-node-red-admin-axios = "MIT"
LICENSE_${PN}-node-red-admin-bcrypt-nan = "MIT"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-detect-libc = "Apache-2.0"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-mkdirp = "MIT"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-needle = "MIT"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-nopt = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-npm-packlist = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-npmlog = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-rc = "MIT Unknown"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-rimraf = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-semver = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp-tar = "ISC"
LICENSE_${PN}-node-red-admin-bcrypt-node-pre-gyp = "BSD-3-Clause"
LICENSE_${PN}-node-red-admin-bcryptjs = "MIT"
LICENSE_${PN}-node-red-admin-bcrypt = "MIT"
LICENSE_${PN}-node-red-admin-cli-table-colors = "MIT"
LICENSE_${PN}-node-red-admin-cli-table = "Unknown"
LICENSE_${PN}-node-red-admin-minimist = "MIT"
LICENSE_${PN}-node-red-admin-read-mute-stream = "ISC"
LICENSE_${PN}-node-red-admin-read = "ISC"
LICENSE_${PN}-node-red-admin = "Apache-2.0"
LICENSE_${PN}-node-red-editor-api-bcryptjs = "MIT"
LICENSE_${PN}-node-red-editor-api-bcrypt = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-bytes = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-content-type = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-debug-ms = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors-inherits = "ISC"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors-statuses = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors-toidentifier = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-http-errors = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-iconv-lite = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-on-finished-ee-first = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-on-finished = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-qs = "BSD-3-Clause"
LICENSE_${PN}-node-red-editor-api-body-parser-raw-body-bytes = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-raw-body-http-errors = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-raw-body-iconv-lite = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-raw-body-unpipe = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-raw-body = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-type-is-media-typer = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-type-is-mime-types-mime-db = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-type-is-mime-types = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser-type-is = "MIT"
LICENSE_${PN}-node-red-editor-api-body-parser = "MIT"
LICENSE_${PN}-node-red-editor-api-clone = "MIT"
LICENSE_${PN}-node-red-editor-api-cors-object-assign = "MIT"
LICENSE_${PN}-node-red-editor-api-cors-vary = "MIT"
LICENSE_${PN}-node-red-editor-api-cors = "MIT"
LICENSE_${PN}-node-red-editor-api-express-accepts-mime-types = "MIT"
LICENSE_${PN}-node-red-editor-api-express-accepts-negotiator = "MIT"
LICENSE_${PN}-node-red-editor-api-express-accepts = "MIT"
LICENSE_${PN}-node-red-editor-api-express-array-flatten = "MIT"
LICENSE_${PN}-node-red-editor-api-express-body-parser = "MIT"
LICENSE_${PN}-node-red-editor-api-express-content-disposition-safe-buffer = "MIT"
LICENSE_${PN}-node-red-editor-api-express-content-disposition = "MIT"
LICENSE_${PN}-node-red-editor-api-express-content-type = "MIT"
LICENSE_${PN}-node-red-editor-api-express-cookie-signature = "MIT"
LICENSE_${PN}-node-red-editor-api-express-cookie = "MIT"
LICENSE_${PN}-node-red-editor-api-express-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-express-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-express-encodeurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-escape-html = "MIT"
LICENSE_${PN}-node-red-editor-api-express-etag = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-encodeurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-escape-html = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-on-finished = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-parseurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-statuses = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler-unpipe = "MIT"
LICENSE_${PN}-node-red-editor-api-express-finalhandler = "MIT"
LICENSE_${PN}-node-red-editor-api-express-fresh = "MIT"
LICENSE_${PN}-node-red-editor-api-express-merge-descriptors = "MIT"
LICENSE_${PN}-node-red-editor-api-express-methods = "MIT"
LICENSE_${PN}-node-red-editor-api-express-on-finished = "MIT"
LICENSE_${PN}-node-red-editor-api-express-parseurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-path-to-regexp = "MIT"
LICENSE_${PN}-node-red-editor-api-express-proxy-addr-forwarded = "MIT"
LICENSE_${PN}-node-red-editor-api-express-proxy-addr-ipaddr.js = "MIT"
LICENSE_${PN}-node-red-editor-api-express-proxy-addr = "MIT"
LICENSE_${PN}-node-red-editor-api-express-qs = "BSD-3-Clause"
LICENSE_${PN}-node-red-editor-api-express-range-parser = "MIT"
LICENSE_${PN}-node-red-editor-api-express-safe-buffer = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-destroy = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-encodeurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-escape-html = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-etag = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-fresh = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors-inherits = "ISC"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors-setprototypeof = "ISC"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors-statuses = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors-toidentifier = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-http-errors = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-mime = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-ms = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-on-finished = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-range-parser = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send-statuses = "MIT"
LICENSE_${PN}-node-red-editor-api-express-send = "MIT"
LICENSE_${PN}-node-red-editor-api-express-serve-static-encodeurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-serve-static-escape-html = "MIT"
LICENSE_${PN}-node-red-editor-api-express-serve-static-parseurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-serve-static-send = "MIT"
LICENSE_${PN}-node-red-editor-api-express-serve-static = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-cookie-signature = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-cookie = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-depd = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-on-headers = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-parseurl = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-safe-buffer = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-uid-safe-random-bytes = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session-uid-safe = "MIT"
LICENSE_${PN}-node-red-editor-api-express-session = "MIT"
LICENSE_${PN}-node-red-editor-api-express-setprototypeof = "ISC"
LICENSE_${PN}-node-red-editor-api-express-statuses = "MIT"
LICENSE_${PN}-node-red-editor-api-express-type-is = "MIT"
LICENSE_${PN}-node-red-editor-api-express-utils-merge = "MIT"
LICENSE_${PN}-node-red-editor-api-express-vary = "MIT"
LICENSE_${PN}-node-red-editor-api-express = "MIT"
LICENSE_${PN}-node-red-editor-api-memorystore-debug-ms = "MIT"
LICENSE_${PN}-node-red-editor-api-memorystore-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-memorystore-lru-cache-pseudomap = "ISC"
LICENSE_${PN}-node-red-editor-api-memorystore-lru-cache-yallist = "ISC"
LICENSE_${PN}-node-red-editor-api-memorystore-lru-cache = "ISC"
LICENSE_${PN}-node-red-editor-api-memorystore = "MIT"
LICENSE_${PN}-node-red-editor-api-mime = "MIT"
LICENSE_${PN}-node-red-editor-api-mustache = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-clone = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-i18next-babel-runtime-regenerator-runtime = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-i18next = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-json-stringify-safe = "ISC"
LICENSE_${PN}-node-red-editor-api-node-red-util-jsonata = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-lodash.clonedeep = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-moment-timezone-moment = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-moment-timezone = "MIT"
LICENSE_${PN}-node-red-editor-api-node-red-util-when = "MIT"
LICENSE_${PN}-node-red-editor-api-oauth2orize-debug = "MIT"
LICENSE_${PN}-node-red-editor-api-oauth2orize-uid2 = "MIT"
LICENSE_${PN}-node-red-editor-api-oauth2orize-utils-merge = "MIT"
LICENSE_${PN}-node-red-editor-api-oauth2orize = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-http-bearer-passport-strategy = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-http-bearer = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-oauth2-client-password-passport-strategy = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-oauth2-client-password = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-passport-strategy = "MIT"
LICENSE_${PN}-node-red-editor-api-passport-pause = "Unknown"
LICENSE_${PN}-node-red-editor-api-passport = "MIT"
LICENSE_${PN}-node-red-editor-api-when = "MIT"
LICENSE_${PN}-node-red-editor-api-ws-async-limiter = "MIT"
LICENSE_${PN}-node-red-editor-api-ws = "MIT"
LICENSE_${PN}-node-red-node-rbe = "Apache-2.0"
LICENSE_${PN}-node-red-node-tail-tail = "MIT"
LICENSE_${PN}-node-red-node-tail = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-ajv-fast-deep-equal = "MIT"
LICENSE_${PN}-node-red-nodes-ajv-fast-json-stable-stringify = "MIT"
LICENSE_${PN}-node-red-nodes-ajv-json-schema-traverse = "MIT"
LICENSE_${PN}-node-red-nodes-ajv-uri-js-punycode = "MIT"
LICENSE_${PN}-node-red-nodes-ajv-uri-js = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-ajv = "MIT"
LICENSE_${PN}-node-red-nodes-body-parser = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-boolbase = "ISC"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-css-what = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-domutils-dom-serializer-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-domutils-dom-serializer-entities = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-domutils-dom-serializer = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-domutils-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-domutils = "Unknown"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-nth-check-boolbase = "ISC"
LICENSE_${PN}-node-red-nodes-cheerio-css-select-nth-check = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-css-select = "BSD-like"
LICENSE_${PN}-node-red-nodes-cheerio-dom-serializer-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-dom-serializer-entities = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-dom-serializer = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-entities = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domhandler-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domhandler = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domutils-dom-serializer = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domutils-domelementtype = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-domutils = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-entities = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-readable-stream-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-readable-stream-string-decoder-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-readable-stream-util-deprecate = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-htmlparser2 = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.assignin = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.bind = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.defaults = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.filter = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.flatten = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.foreach = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.map = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.merge = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.pick = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.reduce = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.reject = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio-lodash.some = "MIT"
LICENSE_${PN}-node-red-nodes-cheerio = "MIT"
LICENSE_${PN}-node-red-nodes-content-type = "MIT"
LICENSE_${PN}-node-red-nodes-cookie-parser-cookie-signature = "MIT"
LICENSE_${PN}-node-red-nodes-cookie-parser-cookie = "MIT"
LICENSE_${PN}-node-red-nodes-cookie-parser = "MIT"
LICENSE_${PN}-node-red-nodes-cookie = "MIT"
LICENSE_${PN}-node-red-nodes-cors = "MIT"
LICENSE_${PN}-node-red-nodes-cron-moment-timezone = "MIT"
LICENSE_${PN}-node-red-nodes-cron = "MIT"
LICENSE_${PN}-node-red-nodes-denque = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-fs-extra = "MIT"
LICENSE_${PN}-node-red-nodes-fs.notify-async = "MIT"
LICENSE_${PN}-node-red-nodes-fs.notify-retry = "Unknown"
LICENSE_${PN}-node-red-nodes-fs.notify = "MIT"
LICENSE_${PN}-node-red-nodes-hash-sum = "MIT"
LICENSE_${PN}-node-red-nodes-https-proxy-agent-agent-base-debug-ms = "MIT"
LICENSE_${PN}-node-red-nodes-https-proxy-agent-agent-base-debug = "MIT"
LICENSE_${PN}-node-red-nodes-https-proxy-agent-agent-base = "MIT"
LICENSE_${PN}-node-red-nodes-https-proxy-agent-debug = "MIT"
LICENSE_${PN}-node-red-nodes-https-proxy-agent = "MIT"
LICENSE_${PN}-node-red-nodes-iconv-lite-safer-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-iconv-lite = "MIT"
LICENSE_${PN}-node-red-nodes-is-utf8 = "MIT"
LICENSE_${PN}-node-red-nodes-js-yaml-argparse-sprintf-js = "BSD-3-Clause"
LICENSE_${PN}-node-red-nodes-js-yaml-argparse = "MIT"
LICENSE_${PN}-node-red-nodes-js-yaml-esprima = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-js-yaml = "MIT"
LICENSE_${PN}-node-red-nodes-media-typer = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-commist-leven = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-commist-minimist = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-commist = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-concat-stream-buffer-from = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-concat-stream-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-concat-stream-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-concat-stream-typedarray = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-concat-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-end-of-stream-once = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-end-of-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-es6-symbol-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-es6-symbol-ext-type = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-es6-symbol-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator-es6-symbol = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-iterator = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-es6-symbol = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext-next-tick = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d-type = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-iterator = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-es6-iterator = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-es6-symbol-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-es6-symbol-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-es6-symbol = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-event-emitter-d = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-event-emitter-es5-ext = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set-event-emitter = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-set = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-es6-symbol = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map-event-emitter = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-es6-map = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-callback-stream-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-callback-stream-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-callback-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-extend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-glob-parent-is-glob-is-extglob = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-glob-parent-is-glob = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-glob-parent-path-dirname = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-glob-parent = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-glob = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-is-negated-glob = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-ordered-read-streams-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-ordered-read-streams = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-duplexify-end-of-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-duplexify-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-duplexify-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-duplexify-stream-shift = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-duplexify = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-pump-end-of-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-pump-once = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify-pump = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-pumpify = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-remove-trailing-separator = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-absolute-is-relative-is-unc-path-unc-path-regex = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-absolute-is-relative-is-unc-path = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-absolute-is-relative = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-absolute-is-windows = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-absolute = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob-is-negated-glob = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-to-absolute-glob = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-json-stable-stringify-without-jsonify = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-through2-filter-through2-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-through2-filter-through2-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-through2-filter-through2 = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-through2-filter-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream-through2-filter = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream-unique-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-glob-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-through2 = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-help-me = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-minimist = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-bl-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-bl-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-bl = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-process-nextick-args = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-mqtt-packet = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-pump-end-of-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-pump-once = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-pump = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-reinterval = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-split2-through2 = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-split2 = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-duplexify = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-ws-async-limiter = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-ws-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-ws-ultron = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-ws = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt-websocket-stream = "BSD-2-Clause"
LICENSE_${PN}-node-red-nodes-mqtt-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-mqtt = "MIT"
LICENSE_${PN}-node-red-nodes-multer-append-field = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-readable-stream-core-util-is = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-readable-stream-inherits = "ISC"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-readable-stream-isarray = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer-streamsearch = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-dicer = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy-readable-stream = "MIT"
LICENSE_${PN}-node-red-nodes-multer-busboy = "MIT"
LICENSE_${PN}-node-red-nodes-multer-concat-stream = "MIT"
LICENSE_${PN}-node-red-nodes-multer-mkdirp = "MIT"
LICENSE_${PN}-node-red-nodes-multer-object-assign = "MIT"
LICENSE_${PN}-node-red-nodes-multer-on-finished = "MIT"
LICENSE_${PN}-node-red-nodes-multer-type-is = "MIT"
LICENSE_${PN}-node-red-nodes-multer-xtend = "MIT"
LICENSE_${PN}-node-red-nodes-multer = "MIT"
LICENSE_${PN}-node-red-nodes-mustache = "MIT"
LICENSE_${PN}-node-red-nodes-on-headers = "MIT"
LICENSE_${PN}-node-red-nodes-raw-body-bytes = "MIT"
LICENSE_${PN}-node-red-nodes-raw-body-http-errors = "MIT"
LICENSE_${PN}-node-red-nodes-raw-body-iconv-lite = "MIT"
LICENSE_${PN}-node-red-nodes-raw-body-unpipe = "MIT"
LICENSE_${PN}-node-red-nodes-raw-body = "MIT"
LICENSE_${PN}-node-red-nodes-request-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-request-aws4 = "MIT"
LICENSE_${PN}-node-red-nodes-request-caseless = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-request-combined-stream-delayed-stream = "MIT"
LICENSE_${PN}-node-red-nodes-request-combined-stream = "MIT"
LICENSE_${PN}-node-red-nodes-request-extend = "MIT"
LICENSE_${PN}-node-red-nodes-request-forever-agent = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-request-form-data-asynckit = "MIT"
LICENSE_${PN}-node-red-nodes-request-form-data-combined-stream = "MIT"
LICENSE_${PN}-node-red-nodes-request-form-data-mime-types = "MIT"
LICENSE_${PN}-node-red-nodes-request-form-data = "MIT"
LICENSE_${PN}-node-red-nodes-request-har-validator-ajv = "MIT"
LICENSE_${PN}-node-red-nodes-request-har-validator-har-schema = "ISC"
LICENSE_${PN}-node-red-nodes-request-har-validator = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-extsprintf = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-json-schema = "Unknown"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-verror-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-verror-core-util-is = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-verror-extsprintf = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim-verror = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-jsprim = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-asn1-safer-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-asn1 = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-bcrypt-pbkdf-tweetnacl = "Unlicense"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-dashdash-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-dashdash = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-ecc-jsbn-jsbn = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-ecc-jsbn-safer-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-ecc-jsbn = "MIT Unknown"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-getpass-assert-plus = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-getpass = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-jsbn = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-safer-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk-tweetnacl = "Unlicense"
LICENSE_${PN}-node-red-nodes-request-http-signature-sshpk = "MIT"
LICENSE_${PN}-node-red-nodes-request-http-signature = "MIT"
LICENSE_${PN}-node-red-nodes-request-is-typedarray = "MIT"
LICENSE_${PN}-node-red-nodes-request-isstream = "MIT"
LICENSE_${PN}-node-red-nodes-request-json-stringify-safe = "ISC"
LICENSE_${PN}-node-red-nodes-request-mime-types = "MIT"
LICENSE_${PN}-node-red-nodes-request-oauth-sign = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-request-performance-now = "MIT"
LICENSE_${PN}-node-red-nodes-request-qs = "BSD-3-Clause"
LICENSE_${PN}-node-red-nodes-request-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-request-tough-cookie-psl = "MIT"
LICENSE_${PN}-node-red-nodes-request-tough-cookie-punycode = "MIT"
LICENSE_${PN}-node-red-nodes-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-node-red-nodes-request-tunnel-agent-safe-buffer = "MIT"
LICENSE_${PN}-node-red-nodes-request-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-request-uuid = "MIT"
LICENSE_${PN}-node-red-nodes-request = "Apache-2.0"
LICENSE_${PN}-node-red-nodes-ws = "MIT"
LICENSE_${PN}-node-red-nodes-xml2js-sax = "ISC"
LICENSE_${PN}-node-red-nodes-xml2js-xmlbuilder = "MIT"
LICENSE_${PN}-node-red-nodes-xml2js = "MIT"
LICENSE_${PN}-node-red-runtime-clone = "MIT"
LICENSE_${PN}-node-red-runtime-express = "MIT"
LICENSE_${PN}-node-red-runtime-fs-extra-graceful-fs = "ISC"
LICENSE_${PN}-node-red-runtime-fs-extra-jsonfile-graceful-fs = "ISC"
LICENSE_${PN}-node-red-runtime-fs-extra-jsonfile = "MIT"
LICENSE_${PN}-node-red-runtime-fs-extra-universalify = "MIT"
LICENSE_${PN}-node-red-runtime-fs-extra = "MIT"
LICENSE_${PN}-node-red-runtime-json-stringify-safe = "ISC"
LICENSE_${PN}-node-red-runtime-node-red-registry-semver = "ISC"
LICENSE_${PN}-node-red-runtime-node-red-registry-uglify-js = "BSD-2-Clause"
LICENSE_${PN}-node-red-runtime-node-red-registry-when = "MIT"
LICENSE_${PN}-node-red-runtime-when = "MIT"
LICENSE_${PN}-nopt = "ISC"
LICENSE_${PN}-semver = "ISC"
LICENSE_${PN} = "Apache-2.0"

NPMPN = "node-red"
INSANE_SKIP = "node-red"
RDEPENDS_${PN} += "bash"


