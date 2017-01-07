# MOE Gradle Plugin

The MOE Gradle plugin adds support to building MOE based applications via Gradle.

## Table of Contents

* [Basics](#basics)
  * [Plugins](#plugins)
  * [SDK](#sdk)
* [Configuration](#configuration)
  * [ProGuard](#proguard)
  * [Xcode Project](#xcode-project)
  * [Code Signing](#code-signing)
  * [Resource Packaging](#resource-packaging)
  * [Java Processes](#java-processes)
* [Tasks](#tasks)
  * [ProGuard Task](#proguard-task)
  * [Retrolambda Task](#retrolambda-task)
  * [Dex Task](#dex-task)
  * [Dex2Oat Task](#dex2oat-task)
  * [StartupProvider Task](#startupprovider-task)
  * [ResourcePackager Task](#resourcepackager-task)
  * [TestClassesProvider Task](#testclassesprovider-task)
  * [XcodeProvider Task](#xcodeprovider-task)
  * [XcodeInternal Task](#xcodeinternal-task)
  * [XcodeBuild Task](#xcodebuild-task)
  * [IpaBuild Task](#ipabuild-task)
  * [ListDevices Task](#listdevices-task)
  * [ListSimulators Task](#listsimulators-task)
  * [Launch Task](#launch-task)
  * [Test Task](#test-task)
  * [ConfigRemote Task](#configremote-task)
  * [TestRemote Task](#testremote-task)
  * [RemoteServerSetup Task](#remoteserversetup-task)
* [Remote Server Settings](#remote-server-settings)

## Basics

### Plugins

There are two Gradle plugins:

- `moe-sdk`: this plugin ensures the MOE SDK is installed on the system and exposes the `moe` extension for
accessing its properties.
- `moe`: this plugin does the same as `moe-sdk`, but also adds all the tasks, rules, etc. necessary to build a MOE-based
application.

### Building

Build and publish _release_ version to Maven local repository:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:publishMavenJavaPublicationToMavenLocal
```

Build and publish _snapshot_ version to Maven local repository:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:publishMavenJavaSnapshotPublicationToMavenLocal
```

Build and publish _release_ version to Bintray:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:bintrayUpload \
    -Pbintray.user=<user> \
    -Pbintray.key=<key>
```

Build and publish _snapshot_ version to Artifactory:

```sh
cd <repo>/moe/tools/master
./gradlew :moe-gradle:artifactoryPublish \
    -Partifactory.url=<url> \
    -Partifactory.key=<key> \
    -Partifactory.user=<user> \
    -Partifactory.pass=<pass>
```

### SDK

The plugin knows which SDK to download, and automatically installs it into the `.moe` directory under the user's home
directory.

The default installation directory can be overridden via the `USER_MOE_HOME` environmental variable.

The plugin's associated SDK is also customizable and is evaluated as follows:

- If there is a path specified via Gradle's project property `moe.sdk.localbuild`, that will be used
- If the `MOE_SDK_LOCALBUILD` environmental variable exists, that will be used
- If the `moe.sdk.localbuild` file in the module, the contents of that file will be used
- Otherwise the default SDK will be downloaded on demand and used

The SDK's structure must be as follows, otherwise the validation will fail:

```
+- sdk
|  +- moe-core.dex          /* generated on download */
|  +- moe-core.jar
|  +- moe-ios-javadoc.jar
|  +- moe-ios-junit.dex     /* generated on download */
|  +- moe-ios-junit.jar
|  +- moe-ios-retro-dex.jar /* generated on download */
|  +- moe-ios-retro.jar     /* generated on download */
|  +- moe-ios.jar
|  +- iphoneos/MOE.framework
|  \- iphonesimulator/MOE.framework
\- tools
   +- dex2oat
   +- dx.jar
   +- ios-device.jar
   +- java8support.jar
   +- macosx/x86_64/lib(clang|imobiledevice|natj).dylib
   +- preloaded-classes
   +- proguard-full.cfg
   +- proguard.cfg
   +- proguard.jar
   +- retrolambda.jar
   +- simlauncher
   +- UITransformer-res
   +- uiTransformer.jar
   +- windows/x86_64/(libeay32|libimobiledevice|natj|ssleay32).dll
   \- wrapnatjgen.jar
```

## Configuration

### ProGuard

ProGuard has three supported levels of trimming: `app` (default), `platform`, `all`

This level can be set in the buildscript:

```groovy
moe {
    proguardLevel 'platform'
}
```

- `app` will only process the classes of your application and it's non-MOE dependencies. This is the fastest mode and
is recommended for development.
- `platform` will do the same as `app` but will also include the `moe-ios.jar` MOE dependency. This mode is a bit
slower and only provides marginally better results.
- `all` will do the same as `platform` but will also include the `moe-core.jar` MOE dependency. This is much slower
than the other two, but will provide the best size reduction.

At any of these levels ProGuard may trim out classes which are needed at compile/runtime. For further configuration
see [ProGuard Task](#proguard-task).

### Xcode Project

Generated Xcode project settings can be configured as follows:

```groovy
moe {
    xcode {
        // Object, path to the Xcode project.
        project
        
        // Object, path to the Xcode workspace.
        workspace

        // String, name of the main target.
        mainTarget

        // String, name of the test target.
        testTarget

        // String, name of the main scheme.
        mainScheme

        // String, name of the test scheme.
        testScheme
    }
}
```

**Note:** when working with Xcode workspaces, scheme settings are required!

### Code Signing

Code signing can be configured by the following options:

```groovy
moe {
    signing {
        // String, ID of the development team.
        developmentTeam

        // String, path to the provisioning profile or UUID.
        provisioningProfile

        // String, name of the provisioning profile (new in Xcode 8).
        provisioningProfileSpecifier

        // String, name of the signing identity
        signingIdentity
    }
}
```

#### Code Signing Defaults

The development team setting can have a default value which can be set in this file:
`<user-home>/.moe/default.properties`.

```text
developmentTeam=ABCDEFGHIJ
```

### Resource Packaging

Resource packaging into the application.jar can be configured in the build script with the following options:

```groovy
moe {
    packaging {
        excludes = ['LICENSE', 'LICENSE.*']
        exclude 'README.md' // Excludes the README.md file from the application.jar
    }
    resources {
        // Enables resources from the source directory
        enableResourcesFromSourceDirs = true

        // Excludes all Java source files when copying from the source directory
        resourcesFromSourceDirExcludes = ['**/*.java']
    }
}
```

### Java Processes

VM arguments for launched Java processes can be customized, for example custom `xmx` values can be set:

```groovy
moe {
    javaProcess {
        jvmArgs '-Xmx4096m'
    }
}
```

## Tasks

### ProGuard Task

Task name: `moe<sourceset>ProGuard`

This task collects the dependent jar files and invokes ProGuard with a set of predefined and (optional) custom rules.
The rules are composed of two parts. The first part comes from the MOE SDK (`<sdk>/tools/proguard.cfg`) which contains
a set of predefined rules. The second part - which is optional - comes from the project's directory
(`<project>/proguard.append.cfg`) and contains a set of additional rules which are appended to the original
configuration. If for some reason the original `proguard.cfg` configuration file is not good for your project then you
can overwrite it by creating a `proguard.cfg` file in your project directory. The result of this task is a
`proguarded.jar` file which contains the minimized version of the application code which is required to run. Detailed
information about what got stripped can be found in the `proguard.log` file which is in your build directory.



Overriding this level on the command-line can be done via the `moe.proguardLevel=<level>` project property.

#### Task Properties

- `proGuardJar`: path to the `proguard.jar` file.
- `baseCfgFile`: path to the base configuration file.
- `appendCfgFile`: null or path to to appended configuration file.
- `inJars`: collection of paths to files being passed to ProGuard via `-injars`.
- `libraryJars`: collection of paths to files being passed to ProGuard via `-libraryjars`.
- `outJar`: path to ProGuard's output jar.
- `composedCfgFile`: path to the composed configuration file.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

### Retrolambda Task

Task name: `moe<sourceset>Retrolambda`

This task collects the class files and invokes Retrolambda on them. This will create Java 7 compatible class files from
Java 8 class files.

#### Task Properties

- `retrolambdaJar`: path to the `retrolambda.jar` file.
- `inputFiles`: collection of paths to files being passed to Retrolambda via `-Dretrolambda.inputDir`.
- `classpathFiles`: collection of paths to files being passed to Retrolambda via `-Dretrolambda.classpath`.
- `defaultMethods`: boolean passed to Retrolambda via `-Dretrolambda.defaultMethods`.
- `natjSupport`: boolean passed to Retrolambda via `-Dretrolambda.natjSupport`.
- `expandedClassesDir`: path to a temporary directory, where the input class files are collected.
- `outputDir`: path to a directory containing the processed class files.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

### Dex Task

Task name: `moe<sourceset>Dex`

We need to create a dex file from the proguarded jar which we can later on convert to art and oat files. This task is
responsible for that. The result of this task is a `classes.jar` file which can be found in the build directory and
detailed information can be found in the `dx.log` file.

#### Task Properties

- `dxJar`: path to the `dx.jar` file.
- `inputFiles`: collection of paths to files being passed to Dex.
- `extraArgs`: extra arguments passed to Dex.
- `destJar`: path to the jar file produced by dex.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

### Dex2Oat Task

Task name: `moe<sourceset><mode><arch-family>Dex2Oat`

- Values for `mode`: Debug, Release
- Values for `arch-family`: Arm, Arm64, X86, X86_64

For Android's ART runtime to function we need to provide an art and an oat file which contains application code
information and everything required by the application to be able to run. This task creates those files from the
specified dex file created by the Dex task. The results of this task is an `image.art` file and an `application.oat`
file both of which can be found in the build directory, detailed information about the process can also be found in the
build directory in a file called `dex2oat.log`.

#### Task Properties

- `dex2oatExec`: path to the `dex2oat` executable file.
- `archFamily`: architecture family to build for, passed to dex2oat via `--instruction-set`.
- `base`: the base address, passed to dex2oat via `--base`.
- `imageClasses`: path to file containing classes to include in an image, passed to dex2oat via `--image-classes`.
- `emitDebugInfo`: boolean for emitting debug info, when true passes `--generate-debug-info` to dex2oat, otherwise
passes `--no-generate-debug-info`.
- `inputFiles`: path to `.dex`, `.jar`, or `.apk` files to compile, passed to dex2oat via `--dex-file`.
- `compilerBackend`: compiler backend, passed to dex2oat via `--compiler-backend`.
- `destImageFile`: path to the image.art file produced by dex2oat.
- `destOatFile`: path to the application.oat file produced by dex2oat.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

### StartupProvider Task

Task name: `moe<sourceset>StartupProvider`

MOE supports extending Objective-C classes from Java, but there are some special cases where we need to register some
classes even before the Objective-C runtime initializes. These classes must be collected at build time and this task is
responsible for that. The classes it needs to collect are marked with a `@RegisterOnStartup` annotation.
The results of this task is in the `preregister.txt` file which can be found in the build directory and additional
information can also be found there in a file called `StartupProvider.log`.

#### Task Properties

- `inputFiles`: collection of paths to files on which the search for the `@RegisterOnStartup` annotations is conducted.
- `preregisterFile`: path to the output file containing the results.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

### ResourcePackager Task

Task name: `moe<sourceset>ResourcePackager`

This task collects the resource files used by the application. These files can originate from the application's resource
folder, dependent jars and additional external sources specified in the build script.
The result of this task is an `application.jar` file which can be found in the build directory.

---

### TestClassesProvider Task

Task name: `moe<sourceset>TestClassesProvider`

MOE supports running JUnit tests on iOS devices. This requires a list of classes which contain the JUnit tests. This
task collects these classes and writes them out in a text file.

#### Task Properties

- `inputFiles`: collection of paths to directories and jars. These inputs will be searched for JUnit tests.
- `classListFile`: path to the output file containing the class list.
- `logFile`: path to the task's log file.

Setting any of these properties to null will reset them to their default values.

---

GenerateUIObjCInterfaces Task

Task name: `moeGenerateUIObjCInterfaces`

Generates Objective-C class interfaces for working with Xcode's Interface Builder.

#### Task Properties

- `inputFiles`: collection of paths to directories and jars. These inputs will be searched for Objective-C classes.
- `outputSource`: path to the output file containing the class interfaces.
- `xcodeProjectFile`: path to the Xcode project.

Setting any of these properties to null will reset them to their default values.

---

### XcodeProvider Task

Task name: `moe<sourceset><mode><arch><plat>XcodeProvider`

- Values for `mode`: Debug, Release
- Values for `arch`: Armv7, Arm64, I386, X86_64
- Values for `plat`: Iphoneos, Iphonesimulator

This task is responsible for collecting all of the files which are needed by Xcode so it can compile the application
package. This task depends on most of the tasks described above.

---

### XcodeInternal Task

Task name: `moeXcodeInternal`

This task is only called when the build is initiated from Xcode. If this is the case, Xcode will set a few environmental
variables which this task will try to read and configure the other dependent tasks according to them. This task will
look for the following environmental variables:

- `PLATFORM_NAME`: target platform (iphoneos or iphonesimulator)
- `CONFIGURATION`: target configuration (Debug or Release)
- `ARCHS`: target architectures for the build
- `MOE_BUILD_SOURCE_SET`: source set to build

All of these variables are required, otherwise the task will fail.

---

### XcodeBuild Task

Task name: `moe<sourceset><mode><plat>XcodeBuild`

- Values for `mode`: Debug, Release
- Values for `plat`: Iphoneos, Iphonesimulator

This task invokes `xcodebuild` and creates the application.

#### Task Properties

- `target`: target name in the Xcode project.
- `scheme`: scheme name in the Xcode project.
- `configuration`: configuration to build, derived from `mode`.
- `sdk`: sdk to build for, derived from `plat`.
- `xcodeProjectFile`: path to the Xcode project file.
- `xcodeWorkspaceFile`: path to the Xcode workspace file.
- `additionalParameters`: additional parameters to pass to `xcodebuild`.
- `provisioningProfile`: path to the provisioning profile or UUID.
- `provisioningProfileSpecifier`: name of the provisioning profile (new in Xcode 8).
- `signingIdentity`: name of the signing identity.
- `developmentTeam`: ID of the development team.
- `xcodeBuildRoot`: `xcodebuild` root output directory.
- `xcodeBuildSettingsFile`: path to the output Xcode build settings file.

---

### IpaBuild Task

Task name: `moeIpaBuild`

This task creates an ipa from the app.

#### Task Properties

- `inputApp`: path to the app to create the ipa from.
- `outputIpa`: path to the output ipa file.

---

### ListDevices Task

Task name: `moeListDevices`

This task lists the UDID's of the connected devices.

---

### ListSimulators Task

Task name: `moeListSimulators`

This task lists the UDID's of the available simulators.

---

### Launch Task

Task name: `moeLaunch`

This task builds and runs the main target of this application on the specified device(s) and/or simulator(s). The
following project properties control this task:

- `-Pmoe.launcher.devices`: comma separated list of device of UDIDs to run the app on.
- `-Pmoe.launcher.simulators`: comma separated list of simulator of UDIDs to run the app on.
- `-Pmoe.launcher.options`: comma separated list of options.
    Options:
    - `config`: overrides the default configuration of release, supported values: debug, release.
    - `no-wait-device`: tells the device launcher not to wait for devices if they're not connected.
    - `no-build`: tells the task not to build the project before launch. This requires an already existing build with
    the correct configuration.
    - `no-launch`: tells the task not to launch the app. This is useful when you only want to build for your target
    devices and want to run as a separate step.
    - `install-on-target`: forces application to be installed on the target device. Mostly used in combination with
    `no-launch`.
    - `no-install-on-target`: skips installation of the application. Mostly used in combination with `no-build`.
    - `debug`: tells the device and simulator launchers to launch with JDWP. Parameters for this option `<local-port>`
    or `<local-port>:<remote-port>`. Remote port only has an effect when launching on devices.
    - `arg`: passes the specified argument to the application.
    - `vmarg`: passes a VM argument to the application.
    - `env`: passes an environmental variable to the application (format: `key=value`).
    - `proxy`: creates a proxy server on the host to the device. Parameters are the same as for `debug`.
    - `raw-test-output`: print all test output to stdout/stderr instead of creating reports.

If neither `-Pmoe.launcher.devices` and `-Pmoe.launcher.simulators` is set, then the task will try to launch on the
first available device.

#### Examples

Build for and launch on the first available device:

```sh
./gradlew moeLaunch
```

Don't build and launch a debug session (with JDWP on port 5005) on simulator:

```sh
./gradlew moeLaunch -Pmoe.launcher.simulators=XXXXXXXXXXXX -Pmoe.launcher.options=no-build,debug:5005
```

---

### Test Task

Task name: `moeTest`

This task builds and runs the test target of this application on the specified device(s) and/or simulator(s). The
controlling project properties are the same as for the Launch task.

---

### ConfigRemote Task

Task name: `moeConfigRemote`

This task run an interactive command-line utility for configuring and testing remote server connection and
authentication.

---

### TestRemote Task

Task name: `moeTestRemote`

This task tests the connection to the remote server.

---

### RemoteServerSetup Task

Task name: `moeRemoteServerSetup`

This task ensures the remote system has the MOE SDK installed properly. This task will run before the first task that
would use the remote connection.

## Remote Server Settings

The following settings are available for configuring the remote connection:

- `host`: address of the remote build server.
- `port`: port for ssh, defaults to 22.
- `user`: user on the remote build server.
- `identity`: path to private key.
- `knownhosts`: path to known_hosts file.
- `keychain.name`: name of keychain to unlock, defaults to 'moeremotebuild.keychain'.
- `keychain.pass`: password for keychain, defaults to ''.
- `keychain.locktimeout`: keychain lock timeout in seconds, defaults to 3600.
- `gradle.repositories`: repositories to be used when setting up the MOE SDK on the remote server, defaults to
'jcenter()'.

The identity and knownhosts keys accept special parameters to access environmental variables (`$env$KEY`),
system properties (`$sys$KEY`) and project properties (`$proj$KEY`).

Example: `knownhosts=$sys$user.home/.ssh/known_hosts`

All of these properties can be overridden from command-line with `-Pmoe.remotebuild.<setting>=<value>`.
The `moe.remotebuild.properties` file can be completely ignored by passing the `-Pmoe.remotebuild.properties.ignore`
parameter.
