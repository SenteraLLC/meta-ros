# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "hector_xacro_tools"
AUTHOR = "Johannes Meyer <johannes@intermodalics.eu>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_xacro_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_models"
ROS_BPN = "hector_xacro_tools"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_models-release/archive/release/melodic/hector_xacro_tools/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ccd327718ff7e21d1a642eca91f90651"
SRC_URI[sha256sum] = "c3fb08b2e43e363415754750c0208062b87686415088d2eaf191d1f9879c95f9"
S = "${WORKDIR}/hector_models-release-release-melodic-hector_xacro_tools-0.5.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('hector-models', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('hector-models', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-models/hector-models_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-models/hector-models-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-models/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/hector-models/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
