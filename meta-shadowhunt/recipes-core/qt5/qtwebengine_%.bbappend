FILESEXTRAPATHS_prepend := "${THISDIR}/qtwebengine:"

#CXXFLAGS +=" -I${STAGING_DIR_TARGET}/usr/include/interface/vcos/pthreads \
#             -I${STAGING_DIR_TARGET}/usr/include/interface/vmcs_host/linux \
#		   "

SRC_URI += " file://0001-jpeg_bool_to_boolean.patch "
