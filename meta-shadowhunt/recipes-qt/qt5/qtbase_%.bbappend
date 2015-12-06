PACKAGECONFIG_append = " fontconfig "
PACKAGECONFIG_append = " gles2 "
PACKAGECONFIG_remove = " gtkstyle "

# Preferred eglfs backend
export EGLFS_DEVICE_INTEGRATION = "eglfs_brcm"
export OE_QMAKE_LDFLAGS = " -lEGL -lGLESv2 "
