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

package org.moe.natjgen.util;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;
import org.moe.natjgen.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class XcodeUtil {

    private static final Logger LOG = LoggerFactory.getLogger(XcodeUtil.class);

    private XcodeUtil() {
    }

    public static Path getXcodeDeveloperPath() {
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
        Path f = new Path(out);
        return f.exists() ? f : null;
    }

    public static Path getXcodePlatformPath(String sdk) {
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
        Path f = new Path(out);
        return f.exists() ? f : null;
    }

    public static Path getXcodePlatformSDKsPath(String sdk) {
        Path path = getXcodePlatformPath(sdk);
        if (path != null) {
            Path file = new Path(path, "Developer", "SDKs");
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public static Path getXcodePath() {
        Path path = getXcodeDeveloperPath();
        if (path == null) {
            LOG.debug("Failed to get Xcode.app path, developer path is null, falling back to /Applications/Xcode.app");
            return null;
        }
        if (!"Developer".equals(path.getName())) {
            return null;
        }
        path = path.getParentFile();
        if (!"Contents".equals(path.getName())) {
            return null;
        }
        path = path.getParentFile();
        if (!path.getName().endsWith(".app")) {
            LOG.debug("Failed to get Xcode.app path, didn't find .app file");
            return null;
        }
        return path;
    }

    public static void openWithXcode(String file) throws IOException {
        if (file == null) {
            throw new NullPointerException();
        }
        SimpleExec open = SimpleExec.getOpen(getXcodePath().toString(), file);
        int exit = open.getRunner().run(null);
        if (exit != 0) {
            throw new IOException("exit code " + exit);
        }
    }

    public static Path getPlatformSDKsPath(String platform) {
        if (platform.equalsIgnoreCase(Configuration.PLATFORM_IOS)) {
            return getXcodePlatformSDKsPath("iphoneos");
        } else if (platform.equalsIgnoreCase(Configuration.PLATFORM_OSX)) {
            return getXcodePlatformSDKsPath("macosx");
        } else if (platform.equalsIgnoreCase(Configuration.PLATFORM_TVOS)) {
            return getXcodePlatformSDKsPath("appletvos");
        } else if (platform.equalsIgnoreCase(Configuration.PLATFORM_NDK)) {
            final String ndkHomeEnv = System.getenv("NDK_HOME");
            if (ndkHomeEnv != null) {
                Path ndkHome = new Path(ndkHomeEnv, "platforms");
                if (ndkHome.exists()) {
                    return ndkHome;
                }
            }
            final String userHomeProp = System.getProperty("user.home");
            if (userHomeProp != null) {
                Path userHome = new Path(userHomeProp, "Library", "Android", "sdk", "ndk-bundle", "platforms");
                if (userHome.exists()) {
                    return userHome;
                }
                userHome = new Path(userHomeProp, "AppData", "Local", "Android", "sdk", "ndk-bundle", "platforms");
                if (userHome.exists()) {
                    return userHome;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    public static Path getDocsetPath() {
        Path dev = getXcodeDeveloperPath();
        if (dev == null) {
            return null;
        }
        Path ds = new Path(dev, "Documentation", "DocSets");
        return ds;
    }
}
