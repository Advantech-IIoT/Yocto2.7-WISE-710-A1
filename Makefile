
include macro.mk
include include/*.mk

.PHONY: all prepare build usage

.DEFAULT_GOAL:=usage

all: prepare buildqt5

build: $(builddir)/.build_core-image-minimal

buildqt5: $(builddir)/.build_fsl-image-qt5

