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

package org.moe.common.ios;

import org.moe.common.exec.AbstractExec;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.OsUtils;
import org.moe.common.sdk.MOESDK;

import java.io.File;
import java.util.List;

public class DeviceLauncher {

    enum DeviceType {
        Device
    }

    public static String pathToDeviceLib(File sdkToolsPath) {
        return pathToLib(MOESDK.IOS_DEVICE_JAR, sdkToolsPath);
    }

    public static AbstractExec createExecRunner(DeviceType type, File sdkToolsPath) {
        String libPath = "";

        libPath = pathToDeviceLib(sdkToolsPath);

        AbstractExec exec = SimpleExec.getExec("java", sdkToolsPath);

        List<String> args = exec.getArguments();
        if (OsUtils.isMac()) {
            args.add("-XstartOnFirstThread");
        }

        args.add("-jar");
        args.add(libPath);

        return exec;
    }

    private static String pathToLib(String libName, File sdkToolsPath) {
        String toolsPath = sdkToolsPath.getAbsolutePath();

        if (toolsPath == null || toolsPath.isEmpty()) {
            throw new RuntimeException("Can't locate Multi-OS Engine home directory! Please make sure MOE_HOME environment variable is set.");
        }

        return toolsPath + File.separator + libName;
    }
}
