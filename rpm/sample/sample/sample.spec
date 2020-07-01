%define _topdir __rpmdir__
%define buildroot __buildroot__
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
echo "post..."


