FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://dropbear_rsa_host_key "

do_install_append () {
    install -d                                       ${D}/${sysconfdir}/dropbear
    install -m 0600 ${WORKDIR}/dropbear_rsa_host_key ${D}/${sysconfdir}/dropbear
}
