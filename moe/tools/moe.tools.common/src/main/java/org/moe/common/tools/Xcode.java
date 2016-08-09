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

package org.moe.common.tools;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.SimpleExec;

import java.io.File;

public class Xcode {
    private static final String XCODE_SELECT = "xcode-select";
    private static final String[] SIMULATOR_APP = {"Simulator.app", "iOS Simulator.app"};

    public static String getDeveloperDirectory() throws RuntimeException {
        SimpleExec exec = SimpleExec.getXcodeSelect();
        exec.getArguments().add("-p");

        String output;
        try {
            output = ExecOutputCollector.collect(exec);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (exec.getReturnCode() != 0) {
            throw new RuntimeException("Failed to launch " + XCODE_SELECT + ". Error code: " + exec.getReturnCode());
        }

        String lineSeparator = System.getProperty("line.separator");

        output = output.replace(lineSeparator, "");

        if (output.isEmpty()) {
            throw new RuntimeException("Can't get path to Developer directory.");
        }

        return output;
    }

    public static String getApplicationsPath() {
        return new File(getDeveloperDirectory(), ("Applications")).getAbsolutePath();
    }

    public static String getSimctlPath() {
        return resolve(getDeveloperDirectory(), "usr/bin/simctl");
    }

    public static String getSimulatorAppPath() throws RuntimeException {
        String applicationsPath = getApplicationsPath();

        for(String app : SIMULATOR_APP) {
            String simAppPath = resolve(applicationsPath, app);

            if(toFile(simAppPath).exists() && toFile(simAppPath).isDirectory()) {
                return simAppPath;
            }
        }

        throw new RuntimeException("Can't find Simulator application.");
    }

    private static File toFile(String path) {
        return new File(path);
    }

    private static String resolve(String base, String sub) {
        return new File(base, sub).getAbsolutePath();
    }
}
