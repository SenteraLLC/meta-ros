# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "visualization_msgs is a set of messages used by higher level packages, such as <a href="/wiki/rviz">rviz</a>, that deal in visualization-specific data.      The main messages in visualization_msgs is <tt>visualization_msgs/Marker</tt>.     The marker message is used to send visualization &quot;markers&quot; such as boxes, spheres, arrows, lines, etc. to a visualization environment such as <a href="http:///www.ros.org/wiki/rviz">rviz</a>.     See the rviz tutorial <a href="http://www.ros.org/wiki/rviz/Tutorials">rviz tutorials</a> for more information."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "Josh Faust <jfaust@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/visualization_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "common_msgs"
ROS_BPN = "visualization_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
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

SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/melodic/visualization_msgs/1.12.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1f1bf26edf660c8b32b68789e771a93c"
SRC_URI[sha256sum] = "fcd899da639e6bd69f2b1dab627bf76ae527ae753f671d01357cb55c215d05da"
S = "${WORKDIR}/common_msgs-release-release-melodic-visualization_msgs-1.12.7-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('common-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('common-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-msgs/common-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-msgs/common-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/common-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
