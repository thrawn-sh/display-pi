DESCRIPTION = "studio-system application"
SECTION = "base"
LICENSE = "CLOSED"

DEPENDS = "\
           log4cpp \
           qtbase \
           qtconnectivity \
           qtmultimedia \
           qtwebkit \
          "

SRC_URI = "git://scm.shadowhunt.de/studio-system.git;protocol=https;rev=e6c26033370485a0a40cc399de5fc5ddf3ef1b66"

S = "${WORKDIR}/git"

export EXTRA_OECMAKE = " -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_DIR_NATIVE}/usr/bin/qt5 "

inherit pkgconfig cmake
