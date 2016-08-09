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

import org.moe.common.utils.SplitOutput;
import org.moe.common.utils.UserId;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimulatorService {
    private static final Pattern CORE_SIMULATOR_PATTERN = Pattern.compile("(?i:com\\.apple\\.CoreSimulator\\.CoreSimulatorService)");
    private static final Pattern ALL_SIMULATORS_PATTERN = Pattern.compile("(?i:com\\.apple\\.iphonesimulator|UIKitApplication|SimulatorBridge|iOS Simulator|com\\.apple\\.CoreSimulator)");

    public List<String> getServiceNames(Pattern servicePattern) throws RuntimeException {
        List<String> result = new ArrayList<String>();

        Launchctl launchctl = new Launchctl();

        String[] lines = SplitOutput.split(launchctl.list());

        Pattern pattern = Pattern.compile("^(\\S+)\\s+(\\S+)\\s+(.*)$");

        for(String line : lines) {
            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                String serviceName = matcher.group(3);

                Matcher serviceNameMatcher = servicePattern.matcher(serviceName);

                if (serviceNameMatcher.find()) {
                    result.add(serviceName);
                }
            }
        }

        return result;
    }

    public String getCoreSimulatorServicePath() {
        List<String> serviceNames = getServiceNames(CORE_SIMULATOR_PATTERN);

        if (serviceNames.size() != 1) {
            return null;
        }

        String args = String.format("user/%d/%s", UserId.getUserId(), serviceNames.get(0));

        Launchctl launchctl = new Launchctl();

        String[] lines = SplitOutput.split(launchctl.print(args));

        Pattern pattern = Pattern.compile("^\\s*path\\s*=\\s*(.*)$");

        for(String line : lines) {

            Matcher matcher = pattern.matcher(line);

            if (matcher.matches()) {
                return matcher.group(1);
            }
        }

        return null;
    }

    public boolean killSimulatorProcesses() {
        List<String> serviceNames = getServiceNames(ALL_SIMULATORS_PATTERN);

        boolean allSuccess = true;

        for (String service : serviceNames) {
            if (!killService(service)) {
                allSuccess = false;
            }
        }

        return allSuccess;
    }

    private boolean killService(String serviceName) {
        Launchctl launchctl = new Launchctl();

        try {
            launchctl.remove(serviceName);
        }
        catch (RuntimeException ignored) {
        }

        switch(launchctl.lastExitCode()) {
            case 0:
            case 3: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
}
