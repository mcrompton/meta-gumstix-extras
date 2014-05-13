SUMMARY = "Build extra packages for the package repository"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690"

inherit packagegroup

PACKAGES = "packagegroup-gumstix"

RDEPENDS_packagegroup-gumstix = " \
    ${ROS_INSTALL} \
    boost \
    devmem2 \
    git \
    i2c-tools \
    nano \
    opencv \
    packagegroup-core-qt-demoapps \
    packagegroup-core-sdk \
    packagegroup-core-standalone-sdk-target \
    packagegroup-core-tools-debug \
    packagegroup-core-tools-testapps \
    python \
    robovero-examples \
    robovero-python \
    screen \
    sshd \
"

ROS_INSTALL = " \
    packagegroup-ros-comm \
    python-wstool \
    python-email \
    python-distutils \
    git \
    git-perltools \
    python-rosinstall \
    rospy-tutorials \
    roscpp-tutorials \
"
