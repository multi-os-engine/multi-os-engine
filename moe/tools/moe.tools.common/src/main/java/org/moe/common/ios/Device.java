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

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.GradleExec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Utility for listing connected iOS devices.
 */
public class Device {

    /**
     * Returns the list of connected iOS devices.
     *
     * @param projectFile Project file
     * @return List of connected iOS devices.
     * @throws IOException if an I/O error occurs
     */
    public static List<DeviceInfo> getDevices(File projectFile) throws IOException {
        List<DeviceInfo> result = new ArrayList<DeviceInfo>();

        if (projectFile == null) {
            return result;
        }

        GradleExec exec = new GradleExec(projectFile, null, projectFile);
        exec.getArguments().add("moeListDevices");
        exec.getArguments().add("-Dorg.gradle.daemon=true");
        exec.getArguments().add("-Dorg.gradle.configureondemand=true");

        String output;
        try {
            output = ExecOutputCollector.collect(exec);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }

        String[] lines = output.split("\n");

        for (String line : lines) {
            DeviceInfo device = parseDeviceInfo(line);

            if (device != null) {
                result.add(device);
            }
        }

        return result;
    }

    /**
     * Parses the line for device info.
     *
     * @param line Line to parse
     * @return DeviceInfo or null
     */
    private static DeviceInfo parseDeviceInfo(String line) {
        DeviceInfo device = null;

        String name;
        String uuid;

        String devicePattern = "^\\-\\s(.*)$";

        Pattern pattern = Pattern.compile(devicePattern);

        Matcher matcher = pattern.matcher(line);

        if (!matcher.find()) {
            return null;
        }

        name = "iOS Device";
        uuid = matcher.group(1);

        device = new DeviceInfo(name, uuid);

        return device;
    }
}
