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

SRC_URI = "git://scm.shadowhunt.de/studio-system.git;protocol=https;rev=0f8798fdcc62814bb7466440c0b866d667f3700d"

S = "${WORKDIR}/git"

export EXTRA_OECMAKE = " -DOE_QMAKE_PATH_EXTERNAL_HOST_BINS=${STAGING_DIR_NATIVE}/usr/bin/qt5 "

inherit pkgconfig cmake
