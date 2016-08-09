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

import org.moe.common.sdk.Sdk;
import org.moe.common.sdk.SdkManager;
import org.moe.common.simulator.Simulator;
import org.moe.common.simulator.SimulatorManager;
import junit.framework.TestCase;

import java.util.List;

public class SimulatorTest extends TestCase {

    protected boolean isMac;

    public SimulatorTest() {
        isMac = System.getProperty("os.name").toLowerCase().contains("mac");
    }

    public void testGetDevices() throws Exception {
        if (isMac) {
            List<Simulator> simulators = SimulatorManager.getSimulators();

            assertNotNull(simulators);
            assertFalse(simulators.isEmpty());
        }
    }

    public void testGetSdks() throws Exception {
        if (isMac) {
            List<Sdk> sdks = SdkManager.list();

            assertNotNull(sdks);
            assertFalse(sdks.isEmpty());
        }
    }
}
