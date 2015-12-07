LICENSE_FLAGS_WHITELIST += "commercial"

# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

# set a (random) password for root account
inherit extrausers
EXTRA_USERS_PARAMS = " usermod -P `dd if=/dev/urandom bs=1M count=1 2> /dev/null | md5sum | head -n 1 | cut -d' ' -f1` root; "

# enable support for dispmanx offline compositing
DISMANX_OFFLINE = "1"

SPLASH = "psplash-shadowhunt"

IMAGE_FEATURES += " \
    hwcodecs \
    read-only-rootfs \
    splash \
    ssh-server-dropbear \
    "

IMAGE_INSTALL += " \
	kernel-modules \
    ntp \
    ntpdate \
    tzdata \
	"
