FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://99shadowhunt"

do_install_append_shadowhunt() {
    install -d                                "${D}${sysconfdir}/udhcpc.d"
    install -m 0755 "${WORKDIR}/99shadowhunt" "${D}${sysconfdir}/udhcpc.d/99shadowhunt"
}
