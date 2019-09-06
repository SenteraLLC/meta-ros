# Copyright (c) 2019 LG Electronics, Inc.


FILESEXTRAPATHS_prepend := "${THISDIR}/rosidl-generator-py:"

export STAGING_DIR_NATIVE
SRC_URI_append = " \
    file://0001-Remove-non-package-from-ament-dependancies.patch \
    file://0002-Fix-numpy-header-search.patch \
"