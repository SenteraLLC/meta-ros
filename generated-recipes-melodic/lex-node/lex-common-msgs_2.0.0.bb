# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Common messages for interacting with Amazon Lex using the lex_node package"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/lex_common_msgs"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "lex_node"
ROS_BPN = "lex_common_msgs"

ROS_BUILD_DEPENDS = " \
    audio-common-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    audio-common-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    audio-common-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/lex_node-release/archive/release/melodic/lex_common_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8a8fa3e20cf98eb4a6c37d0cd52cb595"
SRC_URI[sha256sum] = "38bc675f3d1607953a04c92775548a0cda08aa90b0699ed3c8ae3cd0d5d3c98d"
S = "${WORKDIR}/lex_node-release-release-melodic-lex_common_msgs-2.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('lex-node', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('lex-node', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lex-node/lex-node_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lex-node/lex-node-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lex-node/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/lex-node/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
