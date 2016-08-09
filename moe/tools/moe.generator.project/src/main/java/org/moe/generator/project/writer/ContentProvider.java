/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.generator.project.writer;

import org.moe.common.constants.MOEManifestConstants.LINKER_FLAGS;
import org.moe.generator.project.config.Configuration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * ContentProvider class provides default contents for generated files.
 */
public final class ContentProvider {

    /**
     * Private contructor.
     */
    private ContentProvider() {

    }

    /**
     * Generates the main.cpp file.
     *
     * @param file file to write to
     */
    public static void generateMainCppContent(File file) {
        ContentWriter w = new ContentWriter(file);

        w.wl("// Copyright (c) 2015, Intel Corporation");
        w.wl("// All rights reserved.");
        w.wl("//");
        w.wl("// Redistribution and use in source and binary forms, with or without");
        w.wl("// modification, are permitted provided that the following conditions are");
        w.wl("// met:");
        w.wl("//");
        w.wl("// 1. Redistributions of source code must retain the above copyright");
        w.wl("// notice, this list of conditions and the following disclaimer.");
        w.wl("// 2. Redistributions in binary form must reproduce the above");
        w.wl("// copyright notice, this list of conditions and the following disclaimer");
        w.wl("// in the documentation and/or other materials provided with the");
        w.wl("// distribution.");
        w.wl("// 3. Neither the name of the copyright holder nor the names of its");
        w.wl("// contributors may be used to endorse or promote products derived from");
        w.wl("// this software without specific prior written permission.");
        w.wl("//");
        w.wl("// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS");
        w.wl("// \"AS IS\" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT");
        w.wl("// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR");
        w.wl("// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT");
        w.wl("// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,");
        w.wl("// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT");
        w.wl("// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,");
        w.wl("// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY");
        w.wl("// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT");
        w.wl("// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE");
        w.wl("// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.");
        w.nl();
        w.wl("#include <MOE/MOE.h>");
        w.nl();
        w.nl();
        w.wl("int main(int argc, char *argv[]) {");
        w.wl("    return moevm(argc, argv);");
        w.wl("}");
        w.close();
    }

    /**
     * Generates the xcconfig file.
     *
     * @param file   file to write to
     * @param isTest is test target
     * @param config configuration
     */
    public static void generateXcConfigContent(File file, boolean isTest, Configuration config) {
        ContentWriter w = new ContentWriter(file);
        String sourceSet = isTest ? "test" : "main";
        w.wl("// Create sections from the art and oat files.");
        w.wl("MOE_SECT_OAT = -sectcreate __OATDATA __oatdata \"${SRCROOT}/" + config.getRelativePathToBuildDir() + "/moe/" + sourceSet +
                "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.oat\"");
        w.wl("MOE_SECT_ART = -sectcreate __ARTDATA __artdata \"${SRCROOT}/" + config.getRelativePathToBuildDir() + "/moe/" + sourceSet +
                "/xcode/${CONFIGURATION}${EFFECTIVE_PLATFORM_NAME}/${arch}.art\"");
        w.nl();
        w.wl("// Set the maximum and initial virtual memory protection for the segments.");
        w.nl();
        w.wl("MOE_SEGPROT[sdk=iphoneos*] = -segprot __OATDATA rx rx -segprot __ARTDATA rw rw");
        w.wl("MOE_SEGPROT[sdk=iphonesimulator*] = -segprot __OATDATA rwx rx -segprot __ARTDATA rwx rw");
//        w.wl("MOE_SEGPROT[sdk=appletvos*] = -segprot __OATDATA rx rx -segprot __ARTDATA rw rw");
//        w.wl("MOE_SEGPROT[sdk=appletvsimulator*] = -segprot __OATDATA rwx rx -segprot __ARTDATA rwx rw");
        w.nl();
        w.wl("// Set the __PAGEZERO segment size.");
        w.wl("MOE_PAGEZERO[sdk=iphoneos*] =");
        w.wl("MOE_PAGEZERO[sdk=iphonesimulator*] = -pagezero_size 4096");
//        w.wl("MOE_PAGEZERO[sdk=appletvos*] =");
//        w.wl("MOE_PAGEZERO[sdk=appletvsimulator*] = -pagezero_size 4096");
        w.nl();
        w.wl("// Set frameworks paths.");
        IdentityHashMap<Enum, List<String>> properties = config.getDependenciesManifestsProperties();

        w.wl("MOE_FRAMEWORK_PATH = ${MOE_HOME}/sdk/${PLATFORM_NAME}");
        w.nl();
        w.wl("MOE_CUSTOM_STATIC_FRAMEWORK_PATH = " + config.getRelativePathToBuildDir() +
                "/libs/static/${PLATFORM_NAME}");
        w.wl("MOE_CUSTOM_DYNAMIC_FRAMEWORK_PATH = " + config.getRelativePathToBuildDir() +
                "/libs/dynamic/${PLATFORM_NAME}");
        w.nl();
        w.wl("// Collect all MOE linker flags.");

        String customLDFlags = "MOE_CUSTOM_OTHER_LDFLAGS =";
        for (Enum flag : LINKER_FLAGS.values()) {
            List<String> flags = properties.get(flag);
            if (flags != null) {
                for (String ldFlag : flags) {
                    customLDFlags += (" " + ldFlag);
                }
            }
        }
        customLDFlags += " -framework Foundation -framework UIKit";
        
        customLDFlags += " -L" + config.getRelativePathToBuildDir() + "/libs/static";
        customLDFlags += " -L" + config.getRelativePathToBuildDir() + "/libs/static/${PLATFORM_NAME}";
        customLDFlags += " -F" + config.getRelativePathToBuildDir() + "/libs/static";
        customLDFlags += " -F" + config.getRelativePathToBuildDir() + "/libs/static/${PLATFORM_NAME}";
        customLDFlags += " -F" + config.getRelativePathToBuildDir() + "/libs/dynamic";
        customLDFlags += " -F" + config.getRelativePathToBuildDir() + "/libs/dynamic/${PLATFORM_NAME}";

        w.wl(customLDFlags);
        w.nl();
        w.wl("MOE_OTHER_LDFLAGS = ${MOE_SECT_OAT} ${MOE_SECT_ART} ${MOE_SEGPROT} ${MOE_PAGEZERO} ${MOE_CUSTOM_OTHER_LDFLAGS} -lstdc++");
        w.nl();
        w.wl("// Disable BitCode.");
        w.wl("ENABLE_BITCODE = NO");
        w.close();
    }

    /**
     * Generates the Info.plist file.
     *
     * @param file   file to write to
     * @param config configuration
     * @param isTest is test target
     */
    public static void generateInfoPlistContent(File file, Configuration config, boolean isTest) {
        PlistWriter w = new PlistWriter(file);
        w.addString("CFBundleDevelopmentRegion", "en");
        w.addString("CFBundleExecutable", "$(EXECUTABLE_NAME)");
        w.addString("CFBundleIdentifier", config.getNormalizedBundleID());
        w.addString("CFBundleInfoDictionaryVersion", "6.0");
        w.addString("CFBundleName", "$(PRODUCT_NAME)");
        w.addString("CFBundlePackageType", "APPL");
        w.addString("CFBundleShortVersionString", config.getBundleShortVersionString());
        w.addString("CFBundleSignature", "????");
        w.addString("CFBundleVersion", config.getBundleVersion());
        w.addBoolean("LSRequiresIPhoneOS", true);
        w.addBoolean("UIRequiresFullScreen", true);

        String packageName = config.getPackageName();
        if (packageName == null) {
            packageName = "";
        } else if (!packageName.isEmpty()) {
            packageName += '.';
        }
        w.addString("MOE.Main.Class", isTest ? "org.moe.mdt.junit.MoeRemoteTestRunner" :
                packageName + config.getMainClassName());

        w.addBoolean("UIApplicationExitsOnSuspend", config.getApplicationExitOnSuspend());

        if (config.targetIsIOS()) {
            List<String> requiredDeviceCapabilities = new ArrayList<String>();
            requiredDeviceCapabilities.add("armv7");
            w.addStringList("UIRequiredDeviceCapabilities", requiredDeviceCapabilities);

            if (!isTest) {
                if (Configuration.TARGET_PLATFORM_IOS_UNIVERSAL.equals(config.getTargetPlatform())
                        || Configuration.TARGET_PLATFORM_IOS_IPHONE.equals(config.getTargetPlatform())) {
                    List<String> oriantations = config.getSupportedInterfaceOrientations();
                    if ((oriantations == null) || oriantations.isEmpty()) {
                        oriantations = new ArrayList<String>();
                        oriantations.add("UIInterfaceOrientationPortrait");
                        oriantations.add("UIInterfaceOrientationPortraitUpsideDown");
                        oriantations.add("UIInterfaceOrientationLandscapeLeft");
                        oriantations.add("UIInterfaceOrientationLandscapeRight");
                    }
                    w.addStringList("UISupportedInterfaceOrientations", oriantations);
                }
                if (Configuration.TARGET_PLATFORM_IOS_UNIVERSAL.equals(config.getTargetPlatform())
                        || Configuration.TARGET_PLATFORM_IOS_IPAD.equals(config.getTargetPlatform())) {
                    List<String> oriantations = config.getSupportedInterfaceOrientations();
                    if ((oriantations == null) || oriantations.isEmpty()) {
                        oriantations = new ArrayList<String>();
                        oriantations.add("UIInterfaceOrientationPortrait");
                        oriantations.add("UIInterfaceOrientationPortraitUpsideDown");
                        oriantations.add("UIInterfaceOrientationLandscapeLeft");
                        oriantations.add("UIInterfaceOrientationLandscapeRight");
                    }
                    w.addStringList("UISupportedInterfaceOrientations~ipad", oriantations);
                }
                String mainUIStoryboardPath = config.getMainUIStoryboardPath();
                if (mainUIStoryboardPath != null && !mainUIStoryboardPath.isEmpty()) {
                    try {
                        String storyboardName = mainUIStoryboardPath.substring(
                                mainUIStoryboardPath.lastIndexOf("/") + 1,
                                mainUIStoryboardPath.lastIndexOf(".storyboard"));
                        if (storyboardName.isEmpty() || !mainUIStoryboardPath.endsWith(".storyboard")) {
                            System.out.println("Warning: Skipped storyboard because it doesn't end with .storyboard: " + mainUIStoryboardPath);
                        } else {
                            w.addString("UIMainStoryboardFile", storyboardName);
                        }
                    } catch (IndexOutOfBoundsException ignored) {
                        System.out.println("Warning: Skipped storyboard because it doesn't contain .storyboard extension: " + mainUIStoryboardPath);
                    }
                } else {
                    System.out.println("Warning: Skipped storyboard because it's not configured");
                }

                String launchScreenFilePath = config.getLaunchScreenFilePath();
                if (launchScreenFilePath != null && !launchScreenFilePath.isEmpty()) {
                    try {
                        String launchScreenName = launchScreenFilePath.substring(
                                launchScreenFilePath.lastIndexOf("/") + 1,
                                launchScreenFilePath.lastIndexOf(".xib"));
                        if (launchScreenName.isEmpty() || !launchScreenFilePath.endsWith(".xib")) {
                            launchScreenName = launchScreenFilePath.substring(
                                    launchScreenFilePath.lastIndexOf("/") + 1,
                                    launchScreenFilePath.lastIndexOf(".storyboard"));
                            if (launchScreenName.isEmpty() || !launchScreenFilePath.endsWith(".storyboard")) {
                                System.out.println("Warning: Skipped launch screen file because it doesn't end with .storyboard: " + launchScreenFilePath);
                            } else {
                                w.addString("UILaunchStoryboardName", launchScreenName);
                            }
                        } else {
                            w.addString("UILaunchStoryboardName", launchScreenName);
                        }

                    } catch (IndexOutOfBoundsException ignored) {
                        System.out.println("Warning: Skipped launch screen file because it doesn't contain .storyboard or .xib extension: " + launchScreenFilePath);
                    }
                } else {
                    System.out.println("Warning: Skipped launch screen file because it's not configured");
                }
            }

        } else if (config.targetIsTvOS()) {
            List<String> requiredDeviceCapabilities = new ArrayList<String>();
            requiredDeviceCapabilities.add("arm64");
            w.addStringList("UIRequiredDeviceCapabilities", requiredDeviceCapabilities);
        } else {
            throw new RuntimeException("Unsupported target platform: " + config.getTargetPlatform());
        }

        String locationWhenInUseUsageDescription = config.getLocationWhenInUseUsageDescription();
        if ((locationWhenInUseUsageDescription != null) && !locationWhenInUseUsageDescription.isEmpty()) {
            w.addString("NSLocationWhenInUseUsageDescription", locationWhenInUseUsageDescription);
        }

        w.close();
    }

    /**
     * Generates the Gradle build file.
     *
     * @param file   file to write to
     * @param config configuration
     */
    public static void generateGradleBuildFile(File file, Configuration config) {
        InputStream stream = ContentProvider.class.getResourceAsStream("/org/moe/generator/project/build.gradle.in");
        try {
            ResourceWriter w = new ResourceWriter(file, stream);

            w.setPlaceholder("MOE_PROJECT_NAME", config.getProjectName());
            w.setPlaceholder("MOE_PACKAGE_NAME", config.getPackageName());
            if (config.getUseEclipse()) {
                w.enableRegion("USE_ECLIPSE_PLUGIN");
            }
            if (config.getUseScala()) {
                w.enableRegion("USE_SCALA_PLUGIN");
                w.setPlaceholder("SCALA_VERSION", "2.+");
            }
            if ((config.getProductName() != null) && !config.getProductName().isEmpty()) {
                w.enableRegion("USE_CUSTOM_PRODUCT_NAME");
                w.setPlaceholder("MOE_PRODUCT_NAME", config.getProductName());
            }
            if ((config.getLaunchScreenFilePath() != null) && !config.getLaunchScreenFilePath().isEmpty()) {
                w.enableRegion("USE_CUSTOM_LAUNCH_SCREEN_FILE_PATH");
                w.setPlaceholder("MOE_LAUNCH_SCREEN_FILE_PATH", config.getLaunchScreenFilePath());
            }
            if ((config.getBundleID() != null) && !config.getBundleID().isEmpty()) {
                w.enableRegion("USE_CUSTOM_BUNDLE_ID");
                w.setPlaceholder("MOE_BUNDLE_ID", config.getNormalizedBundleID());
            }
            if (config.getUseIdea()) {
                w.enableRegion("USE_IDEA_PLUGIN");
            }
            if (config.getUseKotlin()) {
                w.enableRegion("USE_KOTLIN_PLUGIN");
            }
            w.writeAndClose();
        } finally {
            try {
                stream.close();
            } catch (IOException ignore) {
            }
        }
    }

    /**
     * Generates the Gradle wrapper properties file.
     *
     * @param file   file to write to
     * @param config configuration
     */
    public static void generateGradlePropertiesFile(File file, Configuration config) {
        InputStream stream = ContentProvider.class.getResourceAsStream(
                "/org/moe/generator/project/wrapper/gradle/wrapper/gradle-wrapper.properties");
        try {
            ResourceWriter w = new ResourceWriter(file, stream);
            w.setPlaceholder("MOE_GRADLE_VERSION", config.getGradleVersion());
            w.writeAndClose();
        } finally {
            try {
                stream.close();
            } catch (IOException ignore) {
            }
        }
    }

    /**
     * Generates the shell script build phase contents for Xcode.
     *
     * @param isTest is test target
     * @return shell script build phase contents
     */
    public static String getGradleBuildScriptContents(boolean isTest, Configuration config) {
        StringBuilder b = new StringBuilder();
        b.append("cd \"${SRCROOT}/" + config.getRelativePathToBasePrj() + "\"\n\n");

        b.append("export JAVA_HOME=$(/usr/libexec/java_home -v 1.8)\n");
        b.append("java -version\n\n");

        b.append("########################\n");
        b.append("# Find Gradle\n");
        b.append("########################\n");
        b.append("function findGradle {\n");
        b.append("	CD=\"$PWD\"\n");
        b.append("	while [ \"$CD\" != \"\" ]; do\n");
        b.append("		echo \"Looking for gradlew in $CD\"\n");
        b.append("		if [ -x \"$CD/gradlew\" ]; then\n");
        b.append("			GRADLE_EXEC=$CD/gradlew\n");
        b.append("			return 0\n");
        b.append("		fi\n");
        b.append("		CD=\"${CD%/*}\"\n");
        b.append("	done\n\n");

        b.append("	DEFAULT_PATH=$(echo $PATH)\n");
        b.append("	source ~/.bash_profile\n");
        b.append("	export PATH=$PATH:DEFAULT_PATH\n\n");

        b.append("	echo \"Checking with 'which'\"\n");
        b.append("	GRADLE_EXEC=$(which 'gradle')\n\n");

        b.append("	if [ \"$GRADLE_EXEC\" = \"\" ]; then\n");
        b.append("		echo \"Falling back to '/usr/local/bin/gradle'\"\n");
        b.append("		GRADLE_EXEC=/usr/local/bin/gradle\n");
        b.append("	fi\n");
        b.append("}\n");

        b.append("########################\n");
        b.append("# Execute Gradle build\n");
        b.append("########################\n");
        b.append("if [ -z \"$MOE_GRADLE_EXTERNAL_BUILD\" ]; then\n");
        b.append("    findGradle\n\n");
        if (isTest) {
            b.append("    export MOE_BUILD_SOURCE_SET=test\n");
        }
        b.append("    \"$GRADLE_EXEC\" --daemon moeXcodeInternal\n");
        b.append("fi\n");
        return b.toString();
    }
}
