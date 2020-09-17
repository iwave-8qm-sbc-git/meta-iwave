# Copyright (C) 2020 iWave Systems Technologies Pvt Ltd
require recipes-security/optee-imx/optee-os.imx.inc

SRCBRANCH = "imx_5.4.24_2.1.0"
SRC_URI = "${OPTEE_OS_SRC};branch=${SRCBRANCH} file://Optee_support_iwg27s.patch"
SRCREV = "7a49776de59265500f10a247125429fde1555ac1"

PLATFORM_FLAVOR_mx8qm-iwg27s	= "mx8qm-iwg27s"
PLATFORM_FLAVOR_mx8qm-iwg27s-8gb	= "mx8qm-iwg27s-8gb"

COMPATIBLE_MACHINE = "(imx8qm-iwg27s|imx8qm-iwg27s-8gb)"
