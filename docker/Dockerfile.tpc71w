FROM ubuntu:xenial
MAINTAINER "Ralph Wang"
RUN apt-get update -y && apt-get install -y gawk wget git-core diffstat unzip texinfo gcc-multilib \
    build-essential chrpath socat cpio python3 python3-pip python3-pexpect \
    xz-utils debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa libsdl1.2-dev \
    pylint3 xterm
RUN apt-get install -y make xsltproc docbook-utils fop dblatex xmlto
RUN apt-get install -y vim
RUN apt-get install -y locales
ENV LANG en_US.UTF-8  
ENV LC_ALL en_US.UTF-8     
RUN locale-gen en_US.UTF-8
RUN update-locale LC_ALL=en_US.UTF-8 LANG=en_US.UTF-8
