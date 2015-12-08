# Base this image on core-image-minimal
include recipes-core/images/shadowhunt-basic-image.bb

IMAGE_FEATURES += " x11 "

IMAGE_INSTALL += " \
    neard \
    qtbase-fonts \
    ca-certificates \
    liberation-fonts ttf-bitstream-vera \
    mesa-megadriver xserver-xorg-extension-glx xf86-video-modesetting \
    studio-system modules-raspberrypi2 \
    "
