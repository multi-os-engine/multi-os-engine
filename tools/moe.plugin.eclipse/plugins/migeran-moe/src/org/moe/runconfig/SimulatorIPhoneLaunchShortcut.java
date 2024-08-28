/*
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.runconfig;

import org.apache.log4j.Logger;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.SimCtl;
import org.moe.common.utils.SimCtl.Device;
import org.moe.utils.logger.LoggerFactory;

public class SimulatorIPhoneLaunchShortcut extends AbstractLaunchShortcut {

	private static final Logger LOG = LoggerFactory.getLogger(SimulatorIPhoneLaunchShortcut.class);
	
	public static final String SIMULATOR_NAME = "iPhone";
	public static final String SIMULATOR_CONFIGURATION_SUFFIX = " (" + SIMULATOR_NAME + ")";

	@Override
	protected void setTargetDevice(ILaunchConfigurationWorkingCopy workingCopy) {
		Device defaultSimulator = getDefaultSimulatorQuiet();
		if (defaultSimulator != null) {
			workingCopy.setAttribute(ApplicationManager.RUN_ON_SIMULATOR_KEY, true);
			workingCopy.setAttribute(ApplicationManager.SIMULATOR_UUID_KEY, defaultSimulator.udid);
		}
	}

	protected String getSimulatorName() {
		return SIMULATOR_NAME;
	}

	@Override
	protected String getConfigurationSuffix() {
		return SIMULATOR_CONFIGURATION_SUFFIX;
	}
	
    public static SimCtl.Device getDefaultSimulatorQuiet() {
        if (!OsUtils.isMac()) {
            return null;
        }
        try {
            return SimCtl.getDevices().get(0);
        } catch (Throwable t) {
            LOG.debug("Failed to get default simulator", t);
        }
        return null;
    }
}
