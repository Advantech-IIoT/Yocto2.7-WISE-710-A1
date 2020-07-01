%define _topdir __rpmdir__
%define buildroot __buildroot__
%define _binaries_in_noarch_packages_terminate_build   0
%define _unpackaged_files_terminate_build      0
Name: __name__
Version: __version__
Release: __revision__
Summary: __summary__
Group: Development/Tools
License: GPL
BuildArch: __arch__

%description
This is a rpm sample. 

#%prep
#echo "bypass prep..."

#%setup
#echo "bypass setup..."

#%build
#echo "bypass build..."

%files
/*

%clean
echo "bypass clean..."

%post
echo "bypass post..."


