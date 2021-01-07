#!/bin/bash
VERSION=v12.13.0
DISTRO=linux-armv7l
sudo wget https://nodejs.org/dist/${VERSION}/node-${VERSION}-${DISTRO}.tar.xz
sudo mkdir -p /usr/local/lib/nodejs
sudo tar -C /usr/local/lib/nodejs -xvf node-${VERSION}-${DISTRO}.tar.xz
sudo cat << EOF > ~/.nodejs_profile
VERSION=${VERSION}
DISTRO=${DISTRO}
export PATH=/usr/local/lib/nodejs/node-$VERSION-$DISTRO/bin:$PATH
EOF
