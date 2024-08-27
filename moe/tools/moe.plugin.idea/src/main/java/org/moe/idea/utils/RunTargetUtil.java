/*
 * Copyright (C) 2017 Migeran
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.idea.utils;

import com.intellij.openapi.diagnostic.Logger;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.SimCtl;
import org.moe.common.utils.SimCtl.Device;
import org.moe.idea.utils.logger.LoggerFactory;
import res.MOEText;

import javax.swing.*;
import java.io.IOException;
import java.util.List;

public class RunTargetUtil {

    private static final Logger LOG = LoggerFactory.getLogger(RunTargetUtil.class);
    public static final DefaultComboBoxModel NO_SIMULATORS_AVAILABLE_MODEL = new DefaultComboBoxModel(
            new SimulatorComboItem[] { new SimulatorComboItem(null) });

    private RunTargetUtil() {
    }

    public static class SimulatorComboItem {
        private final SimCtl.Device device;
        private final String text;

        public SimulatorComboItem(SimCtl.Device device) {
            this.device = device;
            if (device == null) {
                text = MOEText.get("No.Simulator.Device.Available");
            } else {
                text = null;
            }
        }

        public String toString() {
            if (text != null) {
                return text;
            }
            return device.name + " (" + device.runtime + ")";
        }

        public String udid() {
            if (text != null) {
                return null;
            }
            return device.udid;
        }
    }

    public static void populateSimulatorCombo(JComboBox comboBox, String selected)
            throws IOException, InterruptedException {
        // Clear list
        comboBox.removeAllItems();

        // Only continue on Mac platform
        if (!OsUtils.isMac()) {
            comboBox.setEnabled(false);
            comboBox.setModel(NO_SIMULATORS_AVAILABLE_MODEL);
            return;
        } else {
            comboBox.setEnabled(true);
        }

        // Get list
        final List<Device> devices;
        try {
            devices = SimCtl.getDevices();
        } catch (Throwable t) {
            comboBox.setEnabled(false);
            comboBox.setModel(NO_SIMULATORS_AVAILABLE_MODEL);
            throw new RuntimeException(t);
        }

        // Populate
        for (SimCtl.Device device : devices) {
            comboBox.addItem(new SimulatorComboItem(device));
            if (selected != null && selected.equals(device.udid)) {
                comboBox.setSelectedIndex(comboBox.getItemCount() - 1);
            }
        }

        // Default item for empty list
        if (comboBox.getItemCount() == 0) {
            comboBox.setEnabled(false);
            comboBox.setModel(NO_SIMULATORS_AVAILABLE_MODEL);
        }
    }

    public static Device getDefaultSimulatorQuiet() {
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
