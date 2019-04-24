# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "roslaunch scripts for starting the TurtleBot3"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Pyo <pyo@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/turtlebot3_bringup"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "turtlebot3"
ROS_BPN = "turtlebot3_bringup"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    turtlebot3-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    hls-lfcd-lds-driver \
    joint-state-publisher \
    robot-state-publisher \
    roscpp \
    rosserial-python \
    sensor-msgs \
    std-msgs \
    turtlebot3-description \
    turtlebot3-msgs \
    turtlebot3-teleop \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3-release/archive/release/melodic/turtlebot3_bringup/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4417ab00eed23f44696311a1057993a5"
SRC_URI[sha256sum] = "afbf800cde94e405ffa9e691b9379042304dd8455e2c3e906cd7ba97ff636f70"
S = "${WORKDIR}/turtlebot3-release-release-melodic-turtlebot3_bringup-1.2.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('turtlebot3', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('turtlebot3', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot3/turtlebot3_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot3/turtlebot3-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot3/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/turtlebot3/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
