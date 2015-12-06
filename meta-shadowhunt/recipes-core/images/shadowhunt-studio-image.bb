# Base this image on core-image-minimal
include recipes-core/images/shadowhunt-basic-image.bb

IMAGE_FEATURES += " x11-base "

IMAGE_INSTALL += " \
    neard \
    qtbase \
    qtbase-fonts \
    qtconnectivity \
    qtmultimedia \
    qtwebengine \
    studio-system \
    liberation-fonts \
    ttf-bitstream-vera \
    xf86-video-modesetting \
    xserver-xorg-extension-glx \
    mesa-megadriver \
    "
