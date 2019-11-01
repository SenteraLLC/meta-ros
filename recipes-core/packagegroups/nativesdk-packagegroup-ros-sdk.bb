DESCRIPTION = "Packages to be included in the OE sdk"
LICENSE = "MIT"

inherit packagegroup nativesdk 

PACKAGEGROUP_DISABLE_COMPLEMENTARY = "1"

# For now I hardcode these one by one.
# There should be a cleaner way of using ROS_SUPERFLORE_GENERATED_BUULD_TOOLS 
RDEPENDS_${PN} = " \ 
        nativesdk-ament-cmake-core \
        nativesdk-ament-cmake-python \
        nativesdk-ament-cmake-export-include-directories \
        nativesdk-ament-cmake-libraries \
        nativesdk-ament-cmake-export-libraries \
        nativesdk-ament-cmake-export-definitions \
	nativesdk-python-cmake-module \
"

