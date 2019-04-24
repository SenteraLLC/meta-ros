# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Various tools for IMU devices"
AUTHOR = "Martin Günther <martin.guenther1980@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/imu_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d81febe1baeaed0bfd599be384185f36"

ROS_CN = "imu_tools"
ROS_BPN = "imu_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    imu-complementary-filter \
    imu-filter-madgwick \
    rviz-imu-plugin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    imu-complementary-filter \
    imu-filter-madgwick \
    rviz-imu-plugin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uos-gbp/imu_tools-release/archive/release/melodic/imu_tools/1.2.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b8abe1cf0fb5662e3c194a596321ccb4"
SRC_URI[sha256sum] = "8fd6b517a5550d0e5151db6599ed9e4eacaca2e299846939932f35f5d0ca3569"
S = "${WORKDIR}/imu_tools-release-release-melodic-imu_tools-1.2.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('imu-tools', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('imu-tools', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-tools/imu-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-tools/imu-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/imu-tools/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
