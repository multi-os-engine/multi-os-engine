# Multi-OS Engine Project Layout

Version 1.3.0

## Information

The layout and settings presented here are mostly recommendations and not
limitations. Most of MOE's settings can be heavily configured, however this is
the most tested version.

## Filesystem Layout

MOE's Gradle plugin relies on the Gradle's Java plugin. By default the Java
plugin's defaults are not modified, so a default MOE plugin's filesystem layout
looks like this:

```
+- build.gradle         // Gradle build script
+- Gradle wrapper files
+- src
|  +- main
|  |  +- java           // Java source files
|  |  \- resources      // Resource files
|  \- test
|     +- java           // Test Java source files (JUnit)
|     \- resources      // Test resource files
\- xcode
   +- main-target
   |  +- Info.plist
   |  +- main.cpp
   |  \- Resources/Native source files
   +- test-target
   |  +- Info.plist
   |  +- main.cpp
   |  \- Resources/Native source files
   \- project.xcodeproj
```

## Xcode Project Layout and Settings

MOE uses Xcode projects so you can easily work with native source files, iOS
specific features and Xcode's tools without any special requirement from MOE's
side. This way a lot of new iOS and Xcode features are supported out of the box
without the need to update MOE. This is also how we support dependency managers,
like CocoaPods.

There are a few requirements to make MOE work with Xcode.

### Build Settings

Targets which use MOE have some custom settings.

Make sure your `OTHER_LDFLAGS` list contains `$(MOE_OTHER_LDFLAGS)`.
`MOE_OTHER_LDFLAGS` consists of a few components:

- Creating and protecting sections for `__ARTDATA` and `__OATDATA`
- Overriding `pagezero_size`
- Linking libstdc++ and MOE.framework

Also make sure your `FRAMEWORK_SEARCH_PATHS` list contains
`$(MOE_FRAMEWORK_PATH)`.

MOE currently does not support bitcode, so please be sure to disable it by
setting `ENABLE_BITCODE` to no.

It is also encouraged to set `STRIP_STYLE` to Non-Global Symbols, though
depending on your project, this may not be required.

More details of these settings can be found [here](https://github.com/multi-os-engine/moe-generator-project/blob/master/src/main/java/org/moe/generator/project/writer/XcodeEditor.java).

### Build Phases

MOE projects contain a custom build phase called `Compile Sources (MOE)`.
This is usually placed right after `Target Dependencies`. This phase is
responsible for invoking Gradle (so all Java sources are compiled and
up-to-date) and also for copying some MOE resources and the MOE framework.

The contents of this script build phase can be found [here](https://github.com/multi-os-engine/moe-generator-project/blob/master/src/main/resources/org/moe/generator/project/moe.build.script.sh.in).

### Main Source File

Most projects want to MOE to start when the application is started on the iOS
device. This requires a custom main function which invokes MOE.

```cpp
// main.cpp files contents
#include <MOE/MOE.h>

int main(int argc, char *argv[]) {
    return moevm(argc, argv);
}
```

### Info.plist file

MOE needs to know which is the main class to start the VM with. You need to
specify this information by adding a new String field into your Info.plist file.

```xml
<key>MOE.Main.Class</key>
<string>com.mycompany.Main</string>
```

Optionally, you can also specify custom environmental variables.

```xml
<key>MOE.Env</key>
<dict>
	<key>key</key>
	<string>value</string>
</dict>
```