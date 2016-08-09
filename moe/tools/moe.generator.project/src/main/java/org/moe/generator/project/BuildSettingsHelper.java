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

package org.moe.generator.project;

import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.config.Configuration;

/**
 * BuildSettingsHelper class contains utility method for adding default values to a XCBuildConfiguration.
 */
class BuildSettingsHelper {

	/*
     * Regex for extracting from pbxproj file:
	 * \t\t\t\t"?([^ ^"]+)"? = "?([^;^"]+)"?; For replacing simple values:
	 * addString(dict, "$1", "$2");
	 */

    /**
     * Adds the default configuration to the specified XCBuildConfiguration dict of a project.
     *
     * @param dict   dictionary to add the keys to
     * @param debug  is debug configuration
     * @param config configuration
     */
    static void addProjectConfig(Dictionary<Value, NextStep> dict, boolean debug, Configuration config) {
        addString(dict, "ALWAYS_SEARCH_USER_PATHS", "NO");
        addString(dict, "CLANG_CXX_LANGUAGE_STANDARD", "gnu++0x");
        addString(dict, "CLANG_CXX_LIBRARY", "libc++");
        addString(dict, "CLANG_ENABLE_MODULES", "YES");
        addString(dict, "CLANG_ENABLE_OBJC_ARC", "YES");
        addString(dict, "CLANG_WARN_BOOL_CONVERSION", "YES");
        addString(dict, "CLANG_WARN_CONSTANT_CONVERSION", "YES");
        addString(dict, "CLANG_WARN_DIRECT_OBJC_ISA_USAGE", "YES_ERROR");
        addString(dict, "CLANG_WARN_EMPTY_BODY", "YES");
        addString(dict, "CLANG_WARN_ENUM_CONVERSION", "YES");
        addString(dict, "CLANG_WARN_INT_CONVERSION", "YES");
        addString(dict, "CLANG_WARN_OBJC_ROOT_CLASS", "YES_ERROR");
        addString(dict, "CLANG_WARN_UNREACHABLE_CODE", "YES");
        addString(dict, "CLANG_WARN__DUPLICATE_METHOD_MATCH", "YES");
        if (config.targetIsIOS()) {
            addString(dict, "CODE_SIGN_IDENTITY[sdk=iphoneos*]", "iPhone Developer");
        }
        addString(dict, "ENABLE_STRICT_OBJC_MSGSEND", "YES");
        addList(dict, "FRAMEWORK_SEARCH_PATHS", "$(inherited)", "${MOE_FRAMEWORK_PATH}");
        addString(dict, "GCC_C_LANGUAGE_STANDARD", "gnu99");
        addString(dict, "GCC_WARN_64_TO_32_BIT_CONVERSION", "YES");
        addString(dict, "GCC_WARN_ABOUT_RETURN_TYPE", "YES_ERROR");
        addString(dict, "GCC_WARN_UNDECLARED_SELECTOR", "YES");
        addString(dict, "GCC_WARN_UNINITIALIZED_AUTOS", "YES_AGGRESSIVE");
        addString(dict, "GCC_WARN_UNUSED_FUNCTION", "YES");
        addString(dict, "GCC_WARN_UNUSED_VARIABLE", "YES");
        if (config.targetIsIOS()) {
            addString(dict, "IPHONEOS_DEPLOYMENT_TARGET", config.getDeploymentTarget());
            addString(dict, "LD_RUNPATH_SEARCH_PATHS", "$(inherited) @executable_path/Frameworks");
            addString(dict, "SDKROOT", "iphoneos");
            if (Configuration.TARGET_PLATFORM_IOS_UNIVERSAL.equals(config.getTargetPlatform())) {
                addString(dict, "TARGETED_DEVICE_FAMILY", "1,2");
            } else if (Configuration.TARGET_PLATFORM_IOS_IPHONE.equals(config.getTargetPlatform())) {
                addString(dict, "TARGETED_DEVICE_FAMILY", "1");
            } else if (Configuration.TARGET_PLATFORM_IOS_IPAD.equals(config.getTargetPlatform())) {
                addString(dict, "TARGETED_DEVICE_FAMILY", "2");
            } else {
                throw new RuntimeException("Unsupported ios target platform: " + config.getTargetPlatform());
            }
        } else if (config.targetIsTvOS()) {
            addString(dict, "TVOS_DEPLOYMENT_TARGET", config.getDeploymentTarget());
            addString(dict, "SDKROOT", "appletvos");
            addString(dict, "TARGETED_DEVICE_FAMILY", "3");
        } else {
            throw new RuntimeException("Unsupported target platform: " + config.getTargetPlatform());
        }
        addString(dict, "SYMROOT", config.getSymRoot());
        if (debug) {
            addString(dict, "COPY_PHASE_STRIP", "NO");
            addString(dict, "GCC_DYNAMIC_NO_PIC", "NO");
            addString(dict, "GCC_OPTIMIZATION_LEVEL", "0");
            addList(dict, "GCC_PREPROCESSOR_DEFINITIONS", "DEBUG=1", "$(inherited)");
            addString(dict, "GCC_SYMBOLS_PRIVATE_EXTERN", "NO");
            addString(dict, "MTL_ENABLE_DEBUG_INFO", "YES");
        } else {
            addString(dict, "COPY_PHASE_STRIP", "YES");
            addString(dict, "ENABLE_NS_ASSERTIONS", "NO");
            addString(dict, "MTL_ENABLE_DEBUG_INFO", "NO");
            addString(dict, "VALIDATE_PRODUCT", "YES");
        }
    }

    /**
     * Adds the default configuration to the specified XCBuildConfiguration dict of a target.
     *
     * @param dict        dictionary to add the keys to
     * @param debug       is debug configuration
     * @param productName product name
     * @param config      configuration
     */
    static void addTargetConfig(Dictionary<Value, NextStep> dict, boolean debug, String productName, Configuration config) {
        if (config.getAppIconsSource() != null) {
            addString(dict, "ASSETCATALOG_COMPILER_APPICON_NAME", "AppIcon");
        }
        if (config.getLaunchImagesSource() != null) {
            addString(dict, "ASSETCATALOG_COMPILER_LAUNCHIMAGE_NAME", "LaunchImage");
        }
        addString(dict, "DEAD_CODE_STRIPPING", "NO");
        addString(dict, "EMBEDDED_CONTENT_CONTAINS_SWIFT", "NO"); // should be optional
        addString(dict, "FRAMEWORK_SEARCH_PATHS", "$(inherited)");
        if (config.targetIsIOS()) {
            addString(dict, "LD_RUNPATH_SEARCH_PATHS", "$(inherited) @executable_path/Frameworks");
        } else if (config.targetIsTvOS()) {
            addString(dict, "LD_RUNPATH_SEARCH_PATHS", "$(inherited) @executable_path/Frameworks ${SRCROOT}/" + config.getRelativePathToBuildDir() + "/moe/runtime/appletvsimulator");
        } else {
            throw new RuntimeException("Unsupported target platform: " + config.getTargetPlatform());
        }
        addString(dict, "OTHER_LDFLAGS", "${MOE_OTHER_LDFLAGS}");
        addString(dict, "PRODUCT_NAME", productName == null ? "$(TARGET_NAME)" : productName);
        addString(dict, "STRIP_STYLE", "non-global");
    }

    /**
     * Adds a key-value pair to the specified dictionary.
     *
     * @param dict  dictionary to add the keys to
     * @param key   key
     * @param value value
     */
    private static void addString(Dictionary<Value, NextStep> dict, String key, String value) {
        dict.add(new Value(key), new Value(value));
    }

    /**
     * Adds a key-values pair to the specified dictionary.
     *
     * @param dict   dictionary to add the keys to
     * @param key    key
     * @param values values
     */
    private static void addList(Dictionary<Value, NextStep> dict, String key, String... values) {
        Array<NextStep> array = new Array<NextStep>();
        for (String value : values) {
            array.add(new Value(value));
        }
        dict.add(new Value(key), array);
    }
}
