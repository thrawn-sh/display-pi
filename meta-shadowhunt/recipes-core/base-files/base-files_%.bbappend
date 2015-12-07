FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += " file://99_shadowhunt \
             file://authorized_keys \
           "

# real hostname will be determined via dhcp see busybox
hostname_pn-base-files = "shadowhunt"

do_install_append () {
    install -d                               ${D}/${sysconfdir}/default/volatiles
    install -m 0644 ${WORKDIR}/99_shadowhunt ${D}/${sysconfdir}/default/volatiles

    install -m 0700 -d                            ${D}/root/.ssh
    install -m 0644    ${WORKDIR}/authorized_keys ${D}/root/.ssh/authorized_keys
}
