# Base this image on core-image-minimal
include recipes-core/images/shadowhunt-basic-image.bb

# enable support for the video camera
VIDEO_CAMERA = "1"

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
    "
