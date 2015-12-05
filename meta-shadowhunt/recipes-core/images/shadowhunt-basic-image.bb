LICENSE_FLAGS_WHITELIST += "commercial"

# Base this image on core-image-minimal
include recipes-core/images/core-image-minimal.bb

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
