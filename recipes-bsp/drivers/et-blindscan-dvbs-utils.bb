DESCRIPTION = "Utils for DVB-S blindscan"
SECTION = "base"
PRIORITY = "optional"
LICENSE = "CLOSED"

SRC_URI = "http://www.xtrendet.net/enigma2-plugin-systemplugins-blindscan_2012-02-14_mipsel.zip"

PROVIDES += "virtual/blindscan-dvbs"
RPROVIDES_${PN} += "virtual/blindscan-dvbs"

PV = "1.0"
PR = "r2"

S = "${WORKDIR}"

do_compile() {
}

do_install() {
	install -d "${D}/${bindir}"
	install -m 0755 "${S}/usr/bin/avl_xtrend_blindscan" "${D}/${bindir}"
}

INHIBIT_PACKAGE_STRIP = "1"

SRC_URI[md5sum] = "537af67e2fb6bac63352ecb39f4b24ed"
SRC_URI[sha256sum] = "20339a4cf77237b515b667afb59aea1fccf1d768ef9f0daf6c8901361a3d5bb6"
