# NDK Support

Setup NDK environment:
    Download and install NDK somewhere
    Add this to your ~/.bash_profile:

        export NDK_PATH=<your NDK install location>

By default NDK build is disabled because it is currently not fully supported.
To enable NDK build, specify

    export NATJ_ENABLE_NDK_BUILD=1

before invoking natj-build.sh

# Ignoring prebuilt files

By default NatJ uses the prebuilt ffi files.
To disable this behaviour, specify

    export NATJ_IGNORE_PREBUILT_FFI=1

before invoking natj-build.sh

# Linux support

Building for Linux is a bit trick, requires additional setup and manual invocation.

Example for Linux build configuration:
	- OS X host system
	- 32-bit Ubuntu 15.10 distribution in a VM
	- 64-bit Ubuntu 15.10 distribution in a VM
	- Both VMs must be on the same network as the host
	- OS X should be able to access both VMs via SSH key authentication and SCP
		this command should succeed without asking for password:
		ssh <user>@<ubuntu-ip-address>

Build only:
	cd natj-linux
	# for 32-bit builds
	./build_remote_linux.sh <user>@<ubuntu-32-ip> i686
	# for 64-bit builds
	./build_remote_linux.sh <user>@<ubuntu-64-ip> x86_64

	The results will be copied back to the host system.

Build and test:
	cd natj-cxxtests/linux-test
	# for 32-bit
	./test_remote_linux.sh <user>@<ubuntu-32-ip> i686
	# for 64-bit
	./test_remote_linux.sh <user>@<ubuntu-64-ip> x86_64

	The results will be copied back to the host system.

# Windows support

Known issue: Windows 32-bit builds are currently causing VM crashes.

Testing on Windows is currently possible via Ansible. More info is available in natj-cxxtests/README.txt
