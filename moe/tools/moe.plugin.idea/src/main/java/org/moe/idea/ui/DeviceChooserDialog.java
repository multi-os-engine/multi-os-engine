/*
 * Copyright (C) 2016 Migeran
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

package org.moe.idea.ui;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.idea.compiler.MOECompileTask;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationEditor;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.SimCtl;
import org.moe.idea.utils.logger.LoggerFactory;
import res.MOEText;

import javax.swing.*;
import java.io.File;

public class DeviceChooserDialog extends DialogWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(DeviceChooserDialog.class);

    private JPanel contentPane;
    private JComboBox simulatorCombo;
    private JRadioButton simulatorRadio;
    private JRadioButton deviceRadio;
    private JComboBox deviceCombo;
    private JButton refreshButton;
    private MOERunConfiguration configuration;

    public DeviceChooserDialog(Module module, MOERunConfiguration runConfig) {
        super(module.getProject(), true, IdeModalityType.PROJECT);
        this.configuration = runConfig;
        setTitle("Select Deployment Target");

        simulatorRadio.setSelected(configuration.runOnSimulator());
        deviceRadio.setSelected(!configuration.runOnSimulator());

        simulatorCombo.removeAllItems();
        String selecteSimulatordUdid = runConfig.simulatorUdid();
        String selecteDevicedUdid = runConfig.deviceUdid();

        for (SimCtl.Device device : SimCtl.getDevices()) {
            simulatorCombo.addItem(new MOERunConfigurationEditor.SimulatorComboItem(device));

        }

        deviceCombo.addItem(MOEText.get("First.Device.Available"));
        File projectFile = new File(ModuleUtils.getModulePath(module));

        try {
            for (DeviceInfo device : Device.getDevices(projectFile)) {
                deviceCombo.addItem(device.udid());
            }
        } catch (Exception e) {
            LOG.error("Unable find devices", e);
        }

        if(selecteDevicedUdid != null && !selecteDevicedUdid.isEmpty()) {
            deviceCombo.setSelectedItem(selecteDevicedUdid);
        } else {
            deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));
        }
        init();
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPane;
    }

    @Override
    protected void doOKAction() {
        configuration.runOnSimulator(simulatorRadio.isSelected());
        if (simulatorCombo.getSelectedItem() != null) {
            configuration.simulatorDeviceName(simulatorCombo.getSelectedItem().toString());
            configuration.simulatorUdid(((MOERunConfigurationEditor.SimulatorComboItem)simulatorCombo.getSelectedItem()).udid());
        }

        if (deviceCombo.getSelectedItem() != null) {
            String deviceUdid = deviceCombo.getSelectedItem().toString();

            if (deviceUdid.equals(MOEText.get("First.Device.Available"))) {
                deviceUdid = "";
            }

            configuration.deviceUdid(deviceUdid);
        }
        super.doOKAction();
    }
}
