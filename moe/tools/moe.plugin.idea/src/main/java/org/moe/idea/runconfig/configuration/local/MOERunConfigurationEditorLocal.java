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

package org.moe.idea.runconfig.configuration.local;

import org.moe.common.utils.OsUtils;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.common.sdk.Sdk;
import org.moe.common.sdk.SdkManager;
import org.moe.common.simulator.Simulator;
import org.moe.common.simulator.SimulatorManager;
import org.moe.idea.runconfig.configuration.test.MOETestClassBrowser;
import org.moe.idea.runconfig.configuration.test.MOETestClassVisibilityChecker;
import org.moe.idea.utils.InputValidationHelper;
import com.intellij.execution.ExecutionBundle;
import com.intellij.execution.configuration.BrowseModuleValueActionListener;
import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiPackage;
import com.intellij.ui.EditorTextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MOERunConfigurationEditorLocal extends SettingsEditor<MOERunConfigurationLocal> {
    private JPanel panel;
    private JPanel notAvailablePanel;

    private JComboBox moduleCombo;

    private JComboBox sdkCombo;

    private JRadioButton simulatorRadio;
    private JComboBox simulatorCombo;

    private JRadioButton deviceRadio;
    private JComboBox deviceCombo;
    private JButton refreshButton;
    private JTextField textDebugPort;
    private JTextField textDebugRemotePort;
    private JLabel labelDebugRemotePort;
    private JRadioButton allInPackageRadioButton;
    private JRadioButton allInModuleRadioButton;
    private JRadioButton classRadioButton;
    private LabeledComponent<EditorTextFieldWithBrowseButton> myPackageComponent;
    private LabeledComponent<EditorTextFieldWithBrowseButton> myClassComponent;
    private JCheckBox runJUnitTestsCheckBox;
    private JPanel junitTestPanel;
    private final JRadioButton[] myTestingType2RadioButton = new JRadioButton[3];
    private Project myProject;
    private JComponent anchor;

    public MOERunConfigurationEditorLocal(Project project) {
        this.myProject = project;
    }


    @Override
    protected void resetEditorFrom(MOERunConfigurationLocal configuration) {
        if(!OsUtils.isMac()) {
            panel.setVisible(false);
            notAvailablePanel.setVisible(true);
        }
        else {
            notAvailablePanel.setVisible(false);
            populateControls(configuration);
        }
    }

    @Override
    protected void applyEditorTo(MOERunConfigurationLocal configuration) throws ConfigurationException {
        if (!OsUtils.isMac()) {
            throw new ConfigurationException("This type of Run configuration is available only on Mac.");
        }

        if (sdkCombo.getSelectedItem() != null) {
            configuration.sdkVersion(sdkCombo.getSelectedItem().toString());
        }

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

        if (moduleCombo.getSelectedItem() == null) {
            throw new ConfigurationException("Please select a module");
        }

        try {
            configuration.moduleName(moduleCombo.getSelectedItem().toString());
        }
        catch (Exception e) {
            throw new ConfigurationException(e.getMessage());
        }

        String port = textDebugPort.getText();

        if (!InputValidationHelper.isInteger(port)) {
            throw new ConfigurationException("Wrong debug port number, please enter a numeric value.");
        }

        configuration.debugPort(Integer.parseInt(port));

        port = textDebugRemotePort.getText();

        if (!InputValidationHelper.isInteger(port)) {
            throw new ConfigurationException("Wrong remote debug port number, please enter a numeric value.");
        }

        configuration.debugRemotePort(Integer.parseInt(port));

        configuration.runOnSimulator(simulatorRadio.isSelected());

//        configuration.runJUnitTests(runJUnitTestsCheckBox.isSelected());
//        configuration.setTestType(getTestingType());
//        updateButtonsAndLabelComponents(configuration.getTestType());
//        configuration.setTestClassName(myClassComponent.getComponent().getText());
//        configuration.setTestPackageName(myPackageComponent.getComponent().getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel;
    }

    private void populateControls(MOERunConfigurationLocal configuration) {
        moduleCombo.removeAllItems();

        for (Module module : MOESdkPlugin.getMoeModules(configuration.getProject())) {
            moduleCombo.addItem(module.getName());
        }

        if (configuration.moduleName() != null) {
            moduleCombo.setSelectedItem(configuration.moduleName());
        }

        sdkCombo.removeAllItems();
        try {
            for (Sdk sdk : SdkManager.list()) {
                sdkCombo.addItem(sdk.version());
            }
            if (configuration.sdkVersion() != null) {
                sdkCombo.setSelectedItem(configuration.sdkVersion());
            } else {
                sdkCombo.setSelectedItem(sdkCombo.getItemCount() - 1);
            }
        } catch (Exception e) {
            MOEToolWindow.getInstance(myProject).log(e.getMessage());
        }

        sdkCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sdk = sdkCombo.getSelectedItem().toString();
                populateSimulators(sdk, "");
            }
        });

        if (sdkCombo.getSelectedItem() != null) {
            populateSimulators(sdkCombo.getSelectedItem().toString(), configuration.simulatorUdid());
        }

        simulatorRadio.setSelected(configuration.runOnSimulator());
        simulatorRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRunOn();
            }
        });

        deviceRadio.setSelected(!configuration.runOnSimulator());
        deviceRadio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateRunOn();
            }
        });

        populateDevices();

        if (configuration.deviceUdid() != null) {
            deviceCombo.setSelectedItem(configuration.deviceUdid());
        }

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateDevices();
            }
        });

        textDebugPort.setText(Integer.toString(configuration.debugPort()));
        textDebugRemotePort.setText(Integer.toString(configuration.debugRemotePort()));

        updateRunOn();

//        populateJUnitTest(configuration);
    }

    private void populateSimulators(String sdk, String selectedUdid) {
        simulatorCombo.removeAllItems();

        for (Simulator simulator : SimulatorManager.getSimulators()) {
            simulatorCombo.addItem(new SimulatorComboItem(simulator));

            if(selectedUdid != null && selectedUdid.equals(simulator.udid())) {
                simulatorCombo.setSelectedIndex(simulatorCombo.getItemCount() - 1);
            }
        }

        if (simulatorCombo.getItemCount() == 0) {
            simulatorCombo.setModel(new DefaultComboBoxModel(new String[]{MOEText.get("No.Simulator.Device.Available")}));
        }
    }

    private void populateDevices() {
        deviceCombo.removeAllItems();

        deviceCombo.addItem(MOEText.get("First.Device.Available"));

        try {
            for (DeviceInfo device : Device.getDevices()) {
                deviceCombo.addItem(device.udid());
            }
        } catch (Exception e) {
            MOEToolWindow.getInstance(myProject).log(e.getMessage());
        }

        deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));
    }

    private void updateRunOn() {
        boolean simulator = simulatorRadio.isSelected();

        simulatorCombo.setEnabled(simulator);
        deviceCombo.setEnabled(!simulator);

        textDebugRemotePort.setVisible(!simulator);
        labelDebugRemotePort.setVisible(!simulator);
    }

    private void showMessage(String message) {
        Messages.showMessageDialog(message, MOEText.get("Configuration.Editor"), MOEIcons.MOELogo);
    }

    private class SimulatorComboItem {
        private Simulator simulator;

        SimulatorComboItem(Simulator simulator) {
            this.simulator = simulator;
        }

        public String toString() {
            return simulator.name() + " (" + simulator.sdk() + ")";
        }

        String udid() {
            return simulator.udid();
        }
    }

    private void populateJUnitTest(MOERunConfigurationLocal configuration) {

        junitTestPanel.setVisible(configuration.runJUnitTests());

        runJUnitTestsCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                junitTestPanel.setVisible(runJUnitTestsCheckBox.isSelected());
            }
        });

        runJUnitTestsCheckBox.setSelected(configuration.runJUnitTests());

        myPackageComponent.setComponent(new EditorTextFieldWithBrowseButton(myProject, false));
        bind(myPackageComponent, new MyPackageBrowser(configuration.getModules()[0]));

        myClassComponent
                .setComponent(new EditorTextFieldWithBrowseButton(myProject, true, new MOETestClassVisibilityChecker(configuration.getModules()[0])));

        bind(myClassComponent,
                new MOETestClassBrowser(myProject, configuration.getModules()[0], "Select test class", false));

        addTestingType(MOEJUnitUtil.TEST_ALL_IN_MODULE, allInModuleRadioButton);
        addTestingType(MOEJUnitUtil.TEST_ALL_IN_PACKAGE, allInPackageRadioButton);
        addTestingType(MOEJUnitUtil.TEST_CLASS, classRadioButton);

        setAnchor(myPackageComponent.getLabel());

        myClassComponent.getComponent().setText(configuration.getTestClassName());
        myPackageComponent.getComponent().setText(configuration.getTestPackageName());
        updateButtonsAndLabelComponents(configuration.getTestType());
    }

    private class MyPackageBrowser extends BrowseModuleValueActionListener {

        private Module module;

        protected MyPackageBrowser(Module module) {
            super(myProject);
            this.module = module;
        }

        @Override
        protected String showDialog() {

            if (module == null) {
                Messages.showErrorDialog(panel, ExecutionBundle.message("module.not.specified.error.text"));
                return null;
            }
            System.out.println("Select package in the module: " + module.getName() + " : project: " + module.getProject().getName());
            final PackageChooserDialog dialog = new PackageChooserDialog(ExecutionBundle.message("choose.package.dialog.title"), module.getProject());
            dialog.selectPackage(myPackageComponent.getComponent().getText());
            dialog.show();
            final PsiPackage aPackage = dialog.getSelectedPackage();
            return aPackage != null ? aPackage.getQualifiedName() : null;
        }
    }

    private static void bind(final LabeledComponent<? extends ComponentWithBrowseButton<?>> labeledComponent,
                             BrowseModuleValueActionListener browser) {
        browser.setField(labeledComponent.getComponent());
    }

    private int getTestingType() {
        for (int i = 0, myTestingType2RadioButtonLength = myTestingType2RadioButton.length; i < myTestingType2RadioButtonLength; i++) {
            JRadioButton button = myTestingType2RadioButton[i];
            if (button.isSelected()) {
                return i;
            }
        }
        return -1;
    }

    private void addTestingType(final int type, JRadioButton button) {
        myTestingType2RadioButton[type] = button;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateButtonsAndLabelComponents(type);
            }
        });
    }

    private void updateLabelComponents(int type) {
        myPackageComponent.setVisible(type == MOEJUnitUtil.TEST_ALL_IN_PACKAGE);
        myClassComponent.setVisible(type == MOEJUnitUtil.TEST_CLASS);
    }

    private void updateButtonsAndLabelComponents(int type) {
        allInModuleRadioButton.setSelected(type == MOEJUnitUtil.TEST_ALL_IN_MODULE);
        allInPackageRadioButton.setSelected(type == MOEJUnitUtil.TEST_ALL_IN_PACKAGE);
        classRadioButton.setSelected(type == MOEJUnitUtil.TEST_CLASS);
        updateLabelComponents(type);
    }

    public void setAnchor(JComponent anchor) {
        this.anchor = anchor;
        myPackageComponent.setAnchor(anchor);
        myClassComponent.setAnchor(anchor);
    }
}
