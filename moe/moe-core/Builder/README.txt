Building MOE
----------------

1. Install Xcode 7+

	Run in Terminal:
	xcode-select --install

2. Install Java 8 JDK

3. OSX MinGW Build Environment:

	Install brew from http://brew.sh
	brew tap homebrew/versions
	brew install autogen autoconf automake openssl libtool pkg-config
	brew install wget
	brew install wine

	On OS X 10.9, 10.10:

	brew install gcc48

	On OS X 10.11:

	brew install gcc
	brew install cloog

4. Setup MinGW environment:

	On OS X 10.9, 10.10:

	chmod +x mingw-w64-3.10-osx10.9.sh
	./mingw-w64-3.10-osx10.9.sh
	Add to your ~/.bash_profile
	export PATH=$PATH:/usr/local/mingw/bin

	On OS X 10.11:

	chmod +x mingw-w64-3.10-osx10.11.sh
	./mingw-w64-3.10-osx10.11.sh
	Add to your ~/.bash_profile
	export PATH=$PATH:/usr/local/mingw/bin

5. Install premake5

	cp ./premake5.rb /usr/local/Library/Formula
	brew install premake5

6. Other dependenies

	brew install cmake jasmin gpg ant

7. Install sphinx, javasphinx for Documentation

	You can either install sphinx / javasphinx system-wide or in virtualenv

7.1 System-wide install

	sudo easy_install six
	sudo easy_install pip
	sudo CFLAGS="-I$(xcrun --sdk macosx --show-sdk-path)/usr/include/libxml2" pip install javasphinx
	sudo pip install docutils
	sudo pip install sphinx

7.2 Virtualenv install

	Install virtualenv
	virtualenv /path/to/venv
	source /path/to/venv/bin/activate # This has to be applied in each shell, e.g. put into .bash_profile
	pip install six
	CFLAGS="-I$(xcrun --sdk macosx --show-sdk-path)/usr/include/libxml2" pip install javasphinx
	pip install docutils
	pip install sphinx

8. Build all:

	chmod +x build-all.sh
	./build-all.sh <qualifier> <build_number> <maven_repo_dir> <maven_repo_user> <maven_repo_pass>

