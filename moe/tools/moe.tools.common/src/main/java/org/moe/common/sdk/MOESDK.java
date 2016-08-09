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

package org.moe.common.sdk;

import org.moe.common.utils.OsUtils;

import java.io.File;
import java.nio.file.InvalidPathException;

public class MOESDK {

    MOERuntime runtime;
    MOEToolsBase tools;

    public MOEBindingsBase getBindings() {
        return bindings;
    }

    public MOEToolsBase getTools() {
        return tools;
    }

    public MOERuntime getRuntime() {
        return runtime;
    }

    MOEBindingsBase bindings;

    public static final String IOS_SIMULATOR_JAR = "ios-simulator.jar";
    public static final String IOS_DEVICE_JAR = "ios-device.jar";

    public static final String HOME_ENV_VAR_NAME = "MOE_HOME";

    public static final String HOME_PATH = getHomePath();
    public static final String SDK_TOOLS_PATH = HOME_PATH + File.separator + MOEToolsBase.ROOT_DIR;


    public MOESDK() {
        if (OsUtils.isWindows()) {
            createForWindows(HOME_PATH);
        } else {
            createForMacOs(HOME_PATH);
        }
    }

    public void createForMacOs(String homePath) {
        runtime = new MOERuntime(homePath);
        bindings = new MOEBindingsMacOS(homePath);
        tools = new MOEToolsMacOs(homePath);
        if (runtime == null || bindings == null || tools == null) {
            throw new NullPointerException();
        }
    }

    public void createForWindows(String homePath) {

        bindings = new MOEBindingsWindows(homePath);
        tools = new MOEToolsWindows(homePath);

        if (bindings == null || tools == null) {
            throw new NullPointerException();
        }
    }

    public static String getHomePath() {
        String homePath = System.getenv(HOME_ENV_VAR_NAME);

        if (homePath == null || homePath.isEmpty()) {
            throw new InvalidPathException(homePath, "Invalid.MOE.Home.Path");
        }

        return homePath;
    }
}
