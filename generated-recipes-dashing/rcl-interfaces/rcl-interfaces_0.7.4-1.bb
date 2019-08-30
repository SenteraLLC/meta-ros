# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The ROS client library common interfaces.     This package contains the messages and services which ROS client libraries will use under the hood to     communicate higher level concepts such as parameters."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rcl_interfaces"
ROS_BPN = "rcl_interfaces"

ROS_BUILD_DEPENDS = " \
    builtin-interfaces \
    rosidl-adapter \
"

ROS_BUILDTOOL_DEPENDS = " \
    python3-numpy-native \
    python3-lark-parser-native \
    ament-cmake-native \
    rosidl-default-generators-native \
    rosidl-parser-native \
    rosidl-adapter-native \
"

ROS_EXPORT_DEPENDS = " \
    builtin-interfaces \
"

# Manually include the numpy directory, not sure why this is required
CXXFLAGS += " -I${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/include"
CFLAGS += " -I${STAGING_LIBDIR}/${PYTHON_DIR}/site-packages/numpy/core/include"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    builtin-interfaces \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rcl_interfaces-release/archive/release/dashing/rcl_interfaces/0.7.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3d79ab74dc3aef70c4876bec60c039dd"
SRC_URI[sha256sum] = "a2a3bb956ad9c9f07d9f8c0d7877646fbf5def24514f9e0b6d68c3bbeaa10eeb"
S = "${WORKDIR}/rcl_interfaces-release-release-dashing-rcl_interfaces-0.7.4-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rcl-interfaces', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rcl-interfaces', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-interfaces/rcl-interfaces_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-interfaces/rcl-interfaces-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-interfaces/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rcl-interfaces/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
