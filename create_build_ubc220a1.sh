#!/bin/bash
MACHINE=imx6dlubc220a1  EULA=1 source fsl-setup-release.sh -b build.imx6dlubc220a1 -e x11
touch conf/sanity.conf
# source setup-environment ${yoctobuilddir} && bitbake core-image-minimal -vDDD
