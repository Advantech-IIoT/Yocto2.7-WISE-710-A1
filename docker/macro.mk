CURRDIR=$(shell realpath -m .)
export SHELL=bash
############################
#           path           #
############################
builddir:=$(CURRDIR)/build
sharedir:=$(builddir)/share
workdir:=/disk/workssd/advantechralph/workdir/krogoth
logdir:=$(builddir)/log
############################
#          docker          #
############################
repo:=advantechralph/work:tpc71w_yocto_env
container:=wise710a1_yocto_env
