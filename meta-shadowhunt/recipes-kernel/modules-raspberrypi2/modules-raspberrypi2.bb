SUMMARY = "Autoload modules during startup"
SECTION = "base"
LICENSE = "MIT"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "file://modules"

S = "${WORKDIR}"

do_compile () {
}

do_install () {
    install -d                         ${D}${sysconfdir}
    install -m 0644 ${WORKDIR}/modules ${D}${sysconfdir}
}
