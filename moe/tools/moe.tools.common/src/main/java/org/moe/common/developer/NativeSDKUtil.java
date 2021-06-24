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

package org.moe.common.developer;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

/**
 * Utility class for Xcode and Android SDKs.
 */

public class NativeSDKUtil {

    /**
     * Logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(NativeSDKUtil.class);

    /**
     * Platform: iOS.
     */
    public final static String PLATFORM_IOS = "iOS";
    /**
     * Platform: macOS.
     */
    public final static String PLATFORM_OSX = "OS X";
    /**
     * Platform: tvOS.
     */
    public final static String PLATFORM_TVOS = "tvOS";
    /**
     * Platform: NDK.
     */
    public final static String PLATFORM_NDK = "NDK";

    /**
     * Creates a new NativeSDKUtil instance.
     */
    private NativeSDKUtil() {
    }

    /**
     * Returns the Xcode developer path.
     *
     * @return Developer path or null on error.
     */

    public static File getXcodeDeveloperPath() {
        SimpleExec xcodeSelect = SimpleExec.getXcodeSelect();
        xcodeSelect.getArguments().add("-p");
        String out;
        try {
            out = ExecOutputCollector.collect(xcodeSelect).trim();
        } catch (IOException e) {
            LOG.debug("Failed to get Xcode developer path", e);
            return null;
        } catch (InterruptedException e) {
            LOG.debug("Failed to get Xcode developer path", e);
            return null;
        }
        File f = new File(out);
        return f.exists() ? f : null;
    }

    /**
     * Returns the path to the Xcode SDK platform.
     *
     * @param sdk SDK
     * @return Path to SDK platform
     */
    public static File getXcodePlatformPath(String sdk) {
        SimpleExec xcodeSelect = SimpleExec.getExec("xcrun");
        xcodeSelect.getArguments().add("--sdk");
        xcodeSelect.getArguments().add(sdk);
        xcodeSelect.getArguments().add("--show-sdk-platform-path");
        String out;
        try {
            out = ExecOutputCollector.collect(xcodeSelect).trim();
        } catch (IOException e) {
            LOG.debug("Failed to get Xcode developer path", e);
            return null;
        } catch (InterruptedException e) {
            LOG.debug("Failed to get Xcode developer path", e);
            return null;
        }
        File f = new File(out);
        return f.exists() ? f : null;
    }

    /**
     * Returns the path to the Xcode SDKs.
     *
     * @param sdk SDK
     * @return Path to SDKs
     */
    public static File getXcodePlatformSDKsPath(String sdk) {
        File path = getXcodePlatformPath(sdk);
        if (path != null) {
            File file = new File(path, "Developer" + File.separator + "SDKs");
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    /**
     * Returns the path to Xcode.
     *
     * @return Path to Xcode
     */
    public static File getXcodePath() {
        File path = getXcodeDeveloperPath();
        label1: {
            if (path == null) {
                LOG.debug("Failed to get Xcode.app path, developer path is null, falling back to /Applications/Xcode.app");
                break label1;
            }
            if (!"Developer".equals(path.getName())) {
                break label1;
            }
            path = path.getParentFile();
            if (!"Contents".equals(path.getName())) {
                break label1;
            }
            path = path.getParentFile();
            if (!path.getName().endsWith(".app")) {
                LOG.debug("Failed to get Xcode.app path, didn't find .app file");
                break label1;
            }
            return path;
        }
        path = new File("/Applications/Xcode.app");
        return path.exists() ? path : null;
    }

    /**
     * Opens the specified file with Xcode.
     *
     * @param file File to open
     * @throws IOException if an I/O error occurs
     */
    public static void openWithXcode(String file) throws IOException {
        if (file == null) {
            throw new NullPointerException();
        }
        final File xcodePath = getXcodePath();
        if (xcodePath == null) {
            throw new NullPointerException();
        }
        SimpleExec open = SimpleExec.getOpen(xcodePath.toString(), file);
        int exit = open.getRunner().run(null);
        if (exit != 0) {
            throw new IOException("exit code " + exit);
        }
    }

    /**
     * Returns the path to the platform's SDKs.
     *
     * @param platform Platform
     * @return Path to platform's SDKs
     */
    public static File getPlatformSDKsPath(String platform) {
        if (platform.equalsIgnoreCase(PLATFORM_IOS)) {
            return getXcodePlatformSDKsPath("iphoneos");
        } else if (platform.equalsIgnoreCase(PLATFORM_OSX)) {
            return getXcodePlatformSDKsPath("macosx");
        } else if (platform.equalsIgnoreCase(PLATFORM_TVOS)) {
            return getXcodePlatformSDKsPath("appletvos");
        } else if (platform.equalsIgnoreCase(PLATFORM_NDK)) {
            final String ndkHomeEnv = System.getenv("NDK_HOME");
            if (ndkHomeEnv != null) {
                File ndkHome = new File(ndkHomeEnv, "platforms");
                if (ndkHome.exists()) {
                    return ndkHome;
                }
            }
            final String userHomeProp = System.getProperty("user.home");
            if (userHomeProp != null) {
                File userHome = new File(userHomeProp,
                        "Library" + File.separator + "Android" + File.separator + "sdk" + File.separator + "ndk-bundle"
                                + File.separator + "platforms");
                if (userHome.exists()) {
                    return userHome;
                }
                userHome = new File(userHomeProp,
                        "AppData" + File.separator + "Local" + File.separator + "Android" + File.separator + "sdk"
                                + File.separator + "ndk-bundle" + File.separator + "platforms");
                if (userHome.exists()) {
                    return userHome;
                }
            }
            return null;
        } else {
            return null;
        }
    }
}
