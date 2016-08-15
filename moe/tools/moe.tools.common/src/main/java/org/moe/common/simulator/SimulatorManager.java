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

package org.moe.common.simulator;

import org.moe.common.application.Bundle;
import org.moe.common.exec.ExecRunner;
import org.moe.common.tools.Simctl;
import org.moe.common.tools.SimulatorApp;
import org.moe.common.tools.SimulatorService;
import org.moe.common.tools.Xcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

public class SimulatorManager {
    private static final int WAIT_TIMEOUT = 20000;
    private static final String BOOTED = "booted";

    public static List<Simulator> getSimulators() {
        return Simctl.list();
    }

    public Process installAndLaunchApp(String simulatorUdid, String appPath, final List<String> args) throws IOException, RuntimeException {
        return installAndLaunchApp(simulatorUdid, appPath, args, new HashMap<String, String>());
    }

    public Process installAndLaunchApp(String simulatorUdid, String appPath, final List<String> args, final Map<String, String> env) throws IOException, RuntimeException {
        if (simulatorUdid.isEmpty()) {
            List<Simulator> simulators = SimulatorManager.getSimulators();

            if ((simulators == null) || (simulators.size() == 0)) {
                throw new RuntimeException("Can not get list of valid simulators. Please install at least one.");
            }

            simulatorUdid = simulators.get(0).udid();
        } else if (!isValidSimulator(simulatorUdid)) {
            throw new RuntimeException("Can not find simulator with udid: " + simulatorUdid);
        }

        boolean result;

        SimulatorService simulatorService = new SimulatorService();

        String simulatorServicePath = simulatorService.getCoreSimulatorServicePath();

        boolean needToWaitForShutdown = false;

        if ((simulatorServicePath == null) || !simulatorServicePath.startsWith(Xcode.getDeveloperDirectory())) {
            if (!simulatorService.killSimulatorProcesses()) {
                throw new RuntimeException("Can not stop previous simulator process.");
            }

            needToWaitForShutdown = true;
        }


        if (!canStartSimulator(simulatorUdid)) {
            if (!simulatorService.killSimulatorProcesses()) {
                throw new RuntimeException("Can not stop previous simulator process.");
            }

            needToWaitForShutdown = true;
        }

        if (needToWaitForShutdown) {
            try {
                result = waitForState(WAIT_TIMEOUT, simulatorUdid, SimulatorState.Shutdown);
            } catch (InterruptedException e) {
                throw new RuntimeException("Previous simulator process wait timed out.");
            }

            if (!result) {
                throw new RuntimeException("Can not stop previous simulator process.");
            }
        }

        if (!startSimulator(simulatorUdid)) {
            throw new RuntimeException("Can not start simulator with udid: " + simulatorUdid);
        }

        try {
            result = waitForState(WAIT_TIMEOUT, simulatorUdid, SimulatorState.Booted);
        } catch (InterruptedException e) {
            throw new RuntimeException("Can not start simulator with udid: " + simulatorUdid + " Wait timed out.");
        }

        if (!result) {
            throw new RuntimeException("Can not start simulator with udid: " + simulatorUdid);
        }

        try {
            Simctl.install(simulatorUdid, appPath);
        } catch (RuntimeException e) {
            throw new RuntimeException("Can not install application. Error: " + e.getMessage());
        }

        final String bundleId = Bundle.getBundleId(appPath);

        if (bundleId == null) {
            throw new RuntimeException("Failed to get application bundle Id.");
        }

        String containerPath = Simctl.getAppContainer(BOOTED, bundleId);

        ExecRunner runner;

        try {
            runner = Simctl.spawn(BOOTED, Bundle.getExecutablePath(containerPath), args, env);
        } catch (RuntimeException e) {
            throw new RuntimeException("Can not spawn application process. Error: " + e.getMessage());
        }

        final Process process = runner.execute();

        Executors.newSingleThreadExecutor().execute(new Runnable() {
            @Override
            public void run() {

                try {
                    // TODO better way to check if launched
                    Thread.sleep(5000);
                    Simctl.launch(BOOTED, bundleId, args, env);
                } catch (InterruptedException ignored) {
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        return process;
    }

    private boolean waitForState(long timeoutMillis, String simulatorUdid, SimulatorState state) throws InterruptedException {
        long millisWaited = 0;

        while (millisWaited < timeoutMillis) {
            Simulator simulator = Simctl.getByUdid(simulatorUdid);

            if (simulator == null) {
                return false;
            } else if (simulator.state() == state) {
                return true;
            } else {
                Thread.sleep(200);
                millisWaited += 200;
            }
        }

        return false;
    }

    private boolean canStartSimulator(String simulatorUdid) {
        List<Simulator> simulators = Simctl.list();

        int booted = 0;
        boolean simulatorBooted = false;

        for (Simulator simulator : simulators) {
            if (simulator.state() == SimulatorState.Booted) {
                if (simulator.udid().equals(simulatorUdid)) {
                    simulatorBooted = true;
                }

                booted++;
            }
        }

        return (booted == 0 || (booted <= 1 && simulatorBooted));
    }

    private boolean isValidSimulator(String simulatorUdid) {
        List<Simulator> simulators = SimulatorManager.getSimulators();

        for (Simulator simulator : simulators) {
            if (simulator.udid().equals(simulatorUdid)) {
                return true;
            }
        }

        return false;
    }

    private boolean startSimulator(String simulatorUdid) throws IOException {
        return canStartSimulator(simulatorUdid) && SimulatorApp.launchSimulator(simulatorUdid);
    }
}
