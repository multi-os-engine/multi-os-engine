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
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.SimpleExec;
import org.moe.common.simulator.Simulator;
import org.moe.common.simulator.SimulatorState;
import org.moe.common.utils.SplitOutput;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Simctl {
    private static final String SIMCTL = "simctl";

    private static final String DEVICES = "devices";

    private enum Cmd {
        List("list"),
        Boot("boot"),
        Shutdown("shutdown"),
        Install("install"),
        Uninstall("uninstall"),
        Launch("launch"),
        Spawn("spawn"),
        GetAppContainer("get_app_container");

        private final String cmd;

        Cmd(String cmd) {
            this.cmd = cmd;
        }

        public String cmd() {
            return cmd;
        }
    }

    public static List<Simulator> list() throws RuntimeException {
        return SimctlListParser.parse(runCommand(Cmd.List, new String[]{DEVICES}));
    }

    public static void boot(String deviceUDID) throws RuntimeException {
        runCommand(Cmd.Boot, new String[]{deviceUDID});
    }

    public static void shutdown(String deviceUDID) throws RuntimeException {
        runCommand(Cmd.Shutdown, new String[]{deviceUDID});
    }

    public static void install(String deviceUDID, String appPath) throws RuntimeException {
        runCommand(Cmd.Install, new String[]{deviceUDID, appPath});
    }

    public static void uninstall(String deviceUDID, String bundleId) throws RuntimeException {
        runCommand(Cmd.Uninstall, new String[]{deviceUDID, bundleId});
    }

    public static String getAppContainer(String deviceUDID, String bundleId) throws RuntimeException {
        String containerPath = runCommand(Cmd.GetAppContainer, new String[]{deviceUDID, bundleId});

        String paths[] = SplitOutput.split(containerPath);

        File container = new File(paths[0]);

        if (!container.exists()) {
            throw new RuntimeException("Can not get app container path: " + containerPath);
        }

        return container.getAbsolutePath();
    }

    public static String launch(String deviceUDID, String bundleId, List<String> args, Map<String, String> env) throws IOException {

        ArrayList<String> list = new ArrayList<String>();
        list.add(deviceUDID);
        list.add(bundleId);
        if (args != null && args.size() != 0) {
            list.addAll(args);
        }

        return runCommand(Cmd.Launch, list.toArray(new String[list.size()]), env);
    }

    public static ExecRunner spawn(String deviceUDID, String appPath, List<String> args, Map<String, String> env) throws IOException {

        SimpleExec exec = SimpleExec.getExec(Xcode.getSimctlPath().toString());
        List<String> execArgs = exec.getArguments();
        execArgs.add(Cmd.Spawn.cmd());
        execArgs.add(deviceUDID);
        execArgs.add(appPath);

        if ((args != null) && (args.size() != 0)) {
            execArgs.addAll(args);
        }

        final ExecRunner runner = exec.getRunner();

        if (env != null) {
            for (Map.Entry<String, String> entry : env.entrySet()) {
                runner.getBuilder().environment().put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
            }
        }

        return runner;
    }

    public static Simulator getByUdid(String simulatorUdid) throws RuntimeException {
        List<Simulator> simulators = list();

        for (Simulator simulator : simulators) {
            if (simulatorUdid.equals(simulator.udid())) {
                return simulator;
            }
        }

        return null;
    }

    public static Simulator getByState(SimulatorState state) throws RuntimeException {
        List<Simulator> simulators = list();

        for (Simulator simulator : simulators) {
            if (state == simulator.state()) {
                return simulator;
            }
        }

        return null;
    }

    private static String runCommand(Cmd command) throws RuntimeException {
        return runCommand(command, null);
    }

    private static String runCommand(Cmd command, String[] args) throws RuntimeException {
        return runCommand(command, args, null);
    }

    private static String runCommand(Cmd command, String[] args, Map<String, String> env) throws RuntimeException {
        SimpleExec exec = SimpleExec.getExec(Xcode.getSimctlPath().toString());
        List<String> execArgs = exec.getArguments();
        execArgs.add(command.cmd());

        if (args != null) {
            for (String arg : args) {
                if ((arg != null) && !arg.isEmpty()) {
                    execArgs.add(arg);
                }
            }
        }

        final ExecRunner runner;
        try {
            runner = exec.getRunner();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (env != null) {
            for (Map.Entry<String, String> entry : env.entrySet()) {
                runner.getBuilder().environment().put("SIMCTL_CHILD_" + entry.getKey(), entry.getValue());
            }
        }

        String output;
        try {
            output = ExecOutputCollector.collect(runner);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        if (exec.getReturnCode() != 0) {
            throw new RuntimeException("Error launching " + SIMCTL + " [" + command.cmd() + "]: " + output + " Error code: " + exec.getReturnCode());
        }

        return output;
    }
}
