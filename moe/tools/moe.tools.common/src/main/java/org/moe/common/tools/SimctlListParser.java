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

import org.moe.common.simulator.Simulator;
import org.moe.common.utils.SplitOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimctlListParser {
    private static final String NAME = "name";
    private static final String UDID = "udid";
    private static final String STATE = "state";
    private static final String UNAVAILABLE = "unavailable";
    private static final String SDK = "iOS";
    private static final String SECTION = "section";

    private static final String NAME_GROUP = " *(.+) ";
    private static final String UDID_GROUP = "\\(([0-9A-F-]+)\\) ";
    private static final String STATE_GROUP = "\\((Creating|Booting|Shutting Down|Shutdown|Booted)\\)";
    private static final String UNAVAILABLE_GROUP = "(\\(unavailable, .*\\))?";
    private static final String SDK_GROUP = "\\-\\- iOS ([0-9]+\\.[0-9]+) \\-\\-";
    private static final String SECTION_GROUP = "== (.+) ==";

    private static final Pattern devicePattern = Pattern.compile(NAME_GROUP + UDID_GROUP + STATE_GROUP + UNAVAILABLE_GROUP);
    private static final Pattern sdkPattern = Pattern.compile(SDK_GROUP);
    private static final Pattern sectionPattern = Pattern.compile(SECTION_GROUP);

    public static List<Simulator> parse(String buffer) {
        List<Simulator> result = new ArrayList<Simulator>();

        String lines[] = SplitOutput.split(buffer);

        String sdkInfo = null;

        boolean isInDevicesSection = false;

        for(String line : lines) {
            Matcher matcher = sectionPattern.matcher(line);

            if(matcher.matches()) {
                if(isInDevicesSection) {
                    break;
                }
                else if(matcher.group(1).compareToIgnoreCase("Devices") == 0) {
                    isInDevicesSection = true;
                }
            }

            if(!isInDevicesSection) {
                continue;
            }

            String newSdkInfo = parseSdk(line);

            if(newSdkInfo != null) {
                sdkInfo = newSdkInfo;
                continue;
            }

            Simulator simulator = parseSimulator(line);

            if(sdkInfo != null && simulator != null) {
                simulator.sdk(sdkInfo);
                result.add(simulator);
            }
        }

        return result;
    }

    private static String parseSdk(String line) {
        String sdkInfo = null;

        Matcher matcher = sdkPattern.matcher(line);

        if (matcher.matches()) {
            sdkInfo = matcher.group(1);
        }

        return sdkInfo;
    }

    private static Simulator parseSimulator(String line) {
        Simulator simulatorInfo = null;

        Matcher matcher = devicePattern.matcher(line);

        if (matcher.matches() && matcher.group(4) == null && matcher.group(1).indexOf(':') == -1) {
            simulatorInfo = new Simulator();

            simulatorInfo.name(matcher.group(1))
                .udid(matcher.group(2))
                .state(matcher.group(3));
        }

        return simulatorInfo;
    }
}
