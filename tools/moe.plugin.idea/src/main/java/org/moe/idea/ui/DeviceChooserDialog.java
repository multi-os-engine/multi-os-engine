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

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import io.github.berstanio.pymobiledevice3.ipc.PyMobileDevice3IPC;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.OsUtils;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.utils.PyMobileHandler;
import org.moe.idea.utils.RunTargetUtil;
import org.moe.idea.utils.RunTargetUtil.SimulatorComboItem;
import org.moe.idea.utils.logger.LoggerFactory;
import res.MOEText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeviceChooserDialog extends DialogWrapper {

    private static final Logger LOG = LoggerFactory.getLogger(DeviceChooserDialog.class);

    private Module module;
    private JPanel contentPane;
    private JComboBox simulatorCombo;
    private JRadioButton simulatorRadio;
    private JRadioButton deviceRadio;
    private JComboBox deviceCombo;
    private JButton refreshButton;
    private MOERunConfiguration configuration;

    public DeviceChooserDialog(final Module module, MOERunConfiguration runConfig) {
        super(module.getProject(), true);
        this.module = module;
        this.configuration = runConfig;
        setTitle("Select Deployment Target");

        if(OsUtils.isMac()) {
            simulatorRadio.setSelected(configuration.runOnSimulator());
            deviceRadio.setSelected(!configuration.runOnSimulator());
        } else {
            simulatorRadio.setSelected(false);
            deviceRadio.setSelected(true);
            simulatorRadio.setEnabled(false);
        }

        simulatorRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRunOn();
            }
        });
        deviceRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRunOn();
            }
        });

        updateRunOn();

        simulatorCombo.removeAllItems();
        String selectedSimulatordUdid = runConfig.simulatorUdid();
        String selecteDevicedUdid = runConfig.deviceUdid();

        populateSimulators(selectedSimulatordUdid);

        populateDevices();

        if(selecteDevicedUdid != null && !selecteDevicedUdid.isEmpty()) {
            deviceCombo.setSelectedItem(selecteDevicedUdid);
        } else {
            deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));
        }

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateDevices();
            }
        });

        init();
    }

    private void populateDevices() {
        deviceCombo.removeAllItems();
        deviceCombo.addItem(MOEText.get("First.Device.Available"));

        deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));

        PyMobileHandler.invokeOnUIThread(module.getProject(), PyMobileDevice3IPC::listDevicesUDID, deviceInfos -> {
            deviceCombo.removeAllItems();
            deviceCombo.addItem(MOEText.get("First.Device.Available"));

            for (String deviceInfo : deviceInfos)
                deviceCombo.addItem(deviceInfo);

            deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));
        }, throwable -> LOG.error("An error occurred during getDevices", throwable));
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
            configuration.simulatorUdid(((SimulatorComboItem)simulatorCombo.getSelectedItem()).udid());
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

    private void populateSimulators(String selectedUdid) {
        try {
            RunTargetUtil.populateSimulatorCombo(simulatorCombo, selectedUdid);
        } catch (Throwable t) {
            LOG.warn("Failed to populate simulators list", t);
            ApplicationManager.getApplication().invokeLater(new Runnable() {
                @Override
                public void run() {
                    Messages.showErrorDialog("Failed to populate list of simulators", "Internal Error");
                }
            });
        }
    }

    private void updateRunOn() {
        boolean simulator = simulatorRadio.isSelected();

        simulatorCombo.setEnabled(simulator);
        deviceCombo.setEnabled(!simulator);
    }
}
