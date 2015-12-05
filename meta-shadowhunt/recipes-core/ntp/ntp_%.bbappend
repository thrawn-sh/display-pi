FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://etc/default/ntpdate_shadowhunt"

do_install_append_shadowhunt() {
    install -d                                                  "${D}${sysconfdir}/default"
    install -m 0644 "${WORKDIR}/etc/default/ntpdate_shadowhunt" "${D}${sysconfdir}/default/ntpdate"
}
