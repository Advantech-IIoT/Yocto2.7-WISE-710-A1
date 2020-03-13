#!/bin/bash
MACHINE=imx6dlwise710a1  EULA=1 source fsl-setup-release.sh -b build.imx6dlwise710a1 -e x11
touch conf/sanity.conf
# source setup-environment ${yoctobuilddir} && bitbake core-image-minimal -vDDD
