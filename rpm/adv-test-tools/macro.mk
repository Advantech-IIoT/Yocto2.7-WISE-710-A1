
# basic macro
currdir:=$(shell pwd)
builddir:=$(currdir)/build

# rpm info
name=adv-test-tools
rpmdir=$(builddir)/$(name)
buildroot=$(rpmdir)/BUILDROOT
spec=$(rpmdir)/sample.spec
version=0.1
revision=1
arch=noarch
rpm=$(shell realpath $(rpmdir)/RPMS/$(arch)/*)

