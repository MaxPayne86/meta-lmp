SUMMARY = "Foundries.io NXP SE05X Secure Element CLI"
HOMEPAGE = "https://github.com/foundriesio/fio-se05x-cli"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

inherit pkgconfig

DEPENDS = "optee-client openssl"

SRC_URI = "git://github.com/foundriesio/fio-se05x-cli.git;protocol=https;branch=main"
SRCREV = "1e170cd3d8a0f46920073565115ee19b694ab64a"

S = "${WORKDIR}/git"

TEEC_EXPORT = "${STAGING_DIR_HOST}${prefix}"
EXTRA_OEMAKE = "TEEC_EXPORT=${TEEC_EXPORT}"


do_install() {
	install -d ${D}${bindir}
	install -m 0755 ${S}/fio-se05x-cli ${D}${bindir}
}

