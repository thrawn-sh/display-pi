# retrieve all submodules
git submodule update

# prepare bitbake
cd poky
. oe-init-build-env
cp ../../conf/* conf/

bitbake --continue shadowhunt-basic-image
