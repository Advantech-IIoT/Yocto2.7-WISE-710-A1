
repodir=$(builddir)/bin
repo=$(repodir)/repo
repourl=http://commondatastorage.googleapis.com/git-repo-downloads/repo
repogiturl=https://gerrit.googlesource.com/git-repo

$(builddir)/.repo: 
#	@mkdir -p $(repodir)
#	@curl -s $(repourl) -o $(repo)
	@git clone --branch v1.13.9.4 $(repogiturl) $(repodir) && rm -rf $(repodir)/.git
	@chmod a+x $(repo)
	@touch $@

