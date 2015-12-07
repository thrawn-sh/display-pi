FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://99_shadowhunt "

# real hostname will be determined via dhcp see busybox
hostname_pn-base-files = "shadowhunt"

do_install_append () {
    install -d                               ${D}/${sysconfdir}/default/volatiles
    install -m 0644 ${WORKDIR}/99_shadowhunt ${D}/${sysconfdir}/default/volatiles
}
