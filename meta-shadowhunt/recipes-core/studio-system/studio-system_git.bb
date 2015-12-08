DESCRIPTION = "studio-system application"
SECTION = "base"
LICENSE = "CLOSED"

DEPENDS = "\
           log4cpp \
           qtbase \
           qtconnectivity \
           qtmultimedia \
           qtwebkit \
          "

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI = "git://scm.shadowhunt.de/studio-system.git;protocol=https;rev=e6c26033370485a0a40cc399de5fc5ddf3ef1b66 \
           file://display.cron \
           file://session \
          "

FILES_${PN} += " ${sysconfdir}/mini_x/session \
                 ${sysconfdir}/cron.d/display \
                 ${sysconfdir}/default/studio-system \
               "

S = "${WORKDIR}/git"

export EXTRA_OECMAKE = " -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_DIR_NATIVE}/usr/bin/qt5 "

inherit pkgconfig cmake

do_install_append_shadowhunt() {
    install -d                           "${D}/${sysconfdir}/mini_x"
    install -m 0755 "${WORKDIR}/session" "${D}/${sysconfdir}/mini_x/session"

    install -d                                "${D}/${sysconfdir}/cron.d"
    install -m 0644 "${WORKDIR}/display.cron" "${D}/${sysconfdir}/cron.d/display"

    install -d                                 "${D}/${sysconfdir}/default"
    install -m 0644 "${WORKDIR}/studio-system" "${D}/${sysconfdir}/default/studio-system"
}
