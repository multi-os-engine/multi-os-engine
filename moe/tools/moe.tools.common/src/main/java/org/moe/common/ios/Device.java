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
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.ExecRunner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Device extends DeviceLauncher {

    public static List<DeviceInfo> getDevices() throws IOException {
        List<DeviceInfo> result = new ArrayList<DeviceInfo>();

        List<String> args = new ArrayList<String>();

        args.add("--list");

        AbstractExec exec = createExecRunner(DeviceType.Device);
        exec.getArguments().addAll(args);

        String output;
        try {
            output = ExecOutputCollector.collect(exec);
        } catch (InterruptedException e) {
            throw new IOException(e);
        }

        String[] lines = output.split("\n");

        for (String line: lines) {
            DeviceInfo device = parseDeviceInfo(line);

            if(device != null) {
                result.add(device);
            }
        }

        return result;
    }

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

    public static Process launchApp(String deviceUdid, String appPath, int jdwpPort, int remotePort, List<String> args) throws IOException {
        AbstractExec exec = createExecRunner(DeviceType.Device);
        List<String> execArgs = exec.getArguments();

        execArgs.add("-a=" + appPath);
        execArgs.add("-u=" + deviceUdid);

        if (jdwpPort > 0) {
            execArgs.add(String.format("-d=%s:%s", Integer.toString(jdwpPort), Integer.toString(remotePort)));
        }

        if ((args != null) && (args.size() != 0)) {
            execArgs.addAll(args);
        }

        return exec.getRunner().execute();
    }
}
