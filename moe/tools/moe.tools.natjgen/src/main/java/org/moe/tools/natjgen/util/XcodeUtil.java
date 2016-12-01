/*
Copyright (C) 2016 Migeran

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

package org.moe.tools.natjgen.util;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.File;
import java.io.IOException;

public class XcodeUtil {

    public final static String PLATFORM_IOS = "iOS";
    public final static String PLATFORM_OSX = "OS X";
    public final static String PLATFORM_TVOS = "tvOS";
    public final static String PLATFORM_NDK = "NDK";

    public static File getXcodePlatformPath(String sdk) {
        SimpleExec xcodeSelect = SimpleExec.getExec("xcrun");
        xcodeSelect.getArguments().add("--sdk");
        xcodeSelect.getArguments().add(sdk);
        xcodeSelect.getArguments().add("--show-sdk-platform-path");
        String out;
        try {
            out = ExecOutputCollector.collect(xcodeSelect).trim();
        } catch (IOException e) {
            return null;
        } catch (InterruptedException e) {
            return null;
        }
        File f = new File(out);
        return f.exists() ? f : null;
    }

    public static File getXcodePlatformSDKsPath(String sdk) {
        File path = getXcodePlatformPath(sdk);
        if (path != null) {
            File file = new File(path, "Developer/SDKs");
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    public static File getPlatformSDKsPath(String platform) {
        if (platform.equalsIgnoreCase(PLATFORM_IOS)) {
            return getXcodePlatformSDKsPath("iphoneos");
        } else if (platform.equalsIgnoreCase(PLATFORM_OSX)) {
            return getXcodePlatformSDKsPath("macosx");
        } else if (platform.equalsIgnoreCase(PLATFORM_TVOS)) {
            return getXcodePlatformSDKsPath("appletvos");
        } else if (platform.equalsIgnoreCase(PLATFORM_NDK)) {
            throw new UnsupportedOperationException("NDK platform binding generation is not supported");
        } else {
            return null;
        }
    }
}
