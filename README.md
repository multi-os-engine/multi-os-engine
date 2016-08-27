Multi-OS Engine
===============

Overview
--------
[Multi-OS Engine](http://multi-os-engine.org/) provides a Java runtime and Java interfaces to iOS platform API to develop native iOS applications with native look and feel, native performance, and portability of common Java logic modules from your Android Apps. It comes fully integrated with Android* Studio hosted on Mac* OS or Windows* and contains all the development tools needed to develop an iOS* app and publish to the App store.

Getting Started
---------------

- [Install Multi-OS Engine](https://multi-os-engine.org/start/)
- Walk through our [Quick Start Tutorials](http://doc.multi-os-engine.org) to configure your development environment and learn how to develop applications using Multi-OS Engine.
- Ask questions on the [Multi-OS Engine Forum](https://discuss.multi-os-engine.org/)
- Submit issues to our [Issue Tracker](https://github.com/multi-os-engine/multi-os-engine/issues)

Building from source code
-------------------------

Install the 'repo' tool:

```
mkdir ~/bin
PATH=~/bin:$PATH
curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo
chmod a+x ~/bin/repo
```

You may also install the repo using brew:

```
brew install repo
```

Get the source code from mainline branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git
repo sync
```

Note: if you want to get the source code from development branch with initial support of Windows and bitcode, switch to "moe-windows-bitcode" branch:

```
repo init -u https://github.com/multi-os-engine/manifest.git -b moe-windows-bitcode
repo sync
```

Install macOS MinGW build environment:
	
- Install brew from http://brew.sh
- Install the following packages

```	
brew tap homebrew/versions
brew install autogen autoconf automake openssl libtool pkg-config
brew install wget
brew install wine
```

- Install gcc

| macOS 10.10 | macOS 10.11 |
| --- | --- |
| `brew install gcc48`<br> `brew install cloog` | `brew install gcc`<br> `brew install cloog` |

Setup MinGW environment:
- Build mingw:

| macOS 10.10 | macOS 10.11 |
| --- | --- |
| `cd moe/moe-core/Builder`<br>`chmod +x mingw-w64-3.10-osx10.9.sh`<br> `./mingw-w64-3.10-osx10.9.sh`| `cd moe/moe-core/Builder`<br>`chmod +x mingw-w64-3.10-osx10.11.sh`<br> `./mingw-w64-3.10-osx10.11.sh`|


- Add /usr/local/mingw/bin to $PATH in your ~/.bash_profile:

```	
export PATH=$PATH:/usr/local/mingw/bin
```

Install premake5:

```	
cp ./premake5.rb /usr/local/Library/Formula
brew install premake5
```

Install other dependenies

```
brew install cmake jasmin gpg ant
```

To build Multi-OS Engine pluign for Android Studio and IntelliJ IDEA, you should install IntelliJ IDEA 16 and set IDEA_HOME environment variable pointing to the IDEA installation folder, for example:

```
export IDEA_HOME=/Applications/IntelliJ\ IDEA\ CE.app/Contents/
```

Build all Multi-OS Engine components:

```
cd moe/moe-core/Builder
./build-all.sh final <build_number> <maven_repo>
```

where `<maven_repo>` is any folder to place the built binaries

Built package will be placed to `$MOE_HOME` folder or to `<maven_repo>/moe_home` folder if `$MOE_HOME` variable doesn't exists.

From here you may publish the SDK via the [Multi-OS Engine SDK Publisher](https://github.com/multi-os-engine/moe-sdk-publisher) project to a Maven repository, to be used by the [MOE Gradle Plugin](https://github.com/multi-os-engine/moe-plugin-gradle). See the project page for more information.
