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

package org.moe.idea.runconfig.configuration;

import com.intellij.execution.ExecutionBundle;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.configuration.BrowseModuleValueActionListener;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDescriptorFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.ComponentWithBrowseButton;
import com.intellij.openapi.ui.LabeledComponent;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiPackage;
import com.intellij.ui.EditorTextFieldWithBrowseButton;
import org.jetbrains.annotations.NotNull;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.exec.GradleExec;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.common.simulator.Simulator;
import org.moe.common.simulator.SimulatorManager;
import org.moe.common.utils.OsUtils;
import org.moe.common.variant.ModeVariant;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.runconfig.configuration.test.MOETestClassBrowser;
import org.moe.idea.runconfig.configuration.test.MOETestClassVisibilityChecker;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.InputValidationHelper;
import org.moe.idea.utils.ModuleUtils;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MOERunConfigurationEditor extends SettingsEditor<MOERunConfiguration> {
    private JTabbedPane component;
    private JPanel panel1;
    private JComboBox moduleCombo;
    private JComboBox configurationCombo;
    private JComboBox simulatorCombo;
    private JRadioButton simulatorRadio;
    private JRadioButton deviceRadio;
    private JComboBox deviceCombo;
    private JButton refreshButton;
    private JLabel labelDebugRemotePort;
    private JTextField textDebugPort;
    private JTextField textDebugRemotePort;
    private JCheckBox runJUnitTestsCheckBox;
    private JPanel junitTestPanel;
    private JRadioButton allInPackageRadioButton;
    private JRadioButton allInModuleRadioButton;
    private JRadioButton classRadioButton;
    private LabeledComponent<EditorTextFieldWithBrowseButton> myPackageComponent;
    private LabeledComponent<EditorTextFieldWithBrowseButton> myClassComponent;
    private JCheckBox enableRemoteBuildCheckBox;
    private JPanel remoteConfigurationPanel;
    private JTextField hostTextField;
    private JTextField portTextField;
    private JTextField userTextField;
    private JTextField knownhostsTextField;
    private JTextField identityTextField;
    private JTextField keychainPassTextField;
    private JTextField keychainLocktimeoutTextField;
    private JButton testButton;
    private JButton importButton;
    private JTextField gradleRepositoriesTextField;
    private Project myProject;
    private final JRadioButton[] myTestingType2RadioButton = new JRadioButton[3];
    private JComponent anchor;
    private MOERunConfigurationEditor.MyPackageBrowser packageBrowser;
    private MOETestClassVisibilityChecker visibilityChecker;
    private MOETestClassBrowser classBrowser;

    public MOERunConfigurationEditor(Project project) {
        this.myProject = project;
    }


    @Override
    protected void resetEditorFrom(MOERunConfiguration configuration) {
        if(!OsUtils.isMac()) {
            simulatorRadio.setSelected(false);
            simulatorRadio.setEnabled(false);
            deviceRadio.setSelected(true);
        }
        populateControls(configuration);
    }

    @Override
    protected void applyEditorTo(MOERunConfiguration configuration) throws ConfigurationException {

        if (configurationCombo.getSelectedItem() != null) {
            configuration.configuration(configurationCombo.getSelectedItem().toString());
        }

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

        if (enableRemoteBuildCheckBox.isSelected()) {
            if (hostTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote host value.");
            }
            if (portTextField.getText().isEmpty()) {
                throw new ConfigurationException("Wrong remote port number, please enter a numeric value.");
            }
            if (userTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote user value.");
            }
            if (knownhostsTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote Knownhosts value.");
            }
            if (identityTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote Identity value.");
            }
            if (keychainPassTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote Keychain.pass value.");
            }
            if (keychainLocktimeoutTextField.getText().isEmpty()) {
                throw new ConfigurationException("Wrong remote Keychain.locktimeout number, please enter a numeric value.");
            }
            if (gradleRepositoriesTextField.getText().isEmpty()) {
                throw new ConfigurationException("Please enter a remote gradle repositories value.");
            }
        }

        configuration.debugRemotePort(Integer.parseInt(port));
        configuration.runOnSimulator(simulatorRadio.isSelected());
        configuration.runJUnitTests(runJUnitTestsCheckBox.isSelected());
        configuration.setTestType(getTestingType());
        updateButtonsAndLabelComponents(configuration.getTestType());
        configuration.setTestClassName(myClassComponent.getComponent().getText());
        configuration.setTestPackageName(myPackageComponent.getComponent().getText());
        configuration.setRemoteBuildEnabled(enableRemoteBuildCheckBox.isSelected());
        configuration.setRemoteHost(hostTextField.getText());
        String remotePort = portTextField.getText();
        remotePort = remotePort == null || remotePort.isEmpty() ? "0" : remotePort;
        configuration.setRemotePort(Integer.parseInt(remotePort));
        configuration.setRemoteUser(userTextField.getText());
        configuration.setRemoteKnownhosts(knownhostsTextField.getText());
        configuration.setRemoteIdentity(identityTextField.getText());
        configuration.setRemoteKeychainPass(keychainPassTextField.getText());
        String remoteBuildTimeout = keychainLocktimeoutTextField.getText();
        remoteBuildTimeout = remoteBuildTimeout == null || remoteBuildTimeout.isEmpty() ? "0" : remoteBuildTimeout;
        configuration.setRemoteKeychainLocktimeout(Integer.parseInt(remoteBuildTimeout));
        configuration.setRemoteGradleRepositories(gradleRepositoriesTextField.getText());
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return component;
    }

    private void populateControls(final MOERunConfiguration configuration) {
        moduleCombo.removeAllItems();

        for (Module module : MOESdkPlugin.getMoeModules(configuration.getProject())) {
            moduleCombo.addItem(module.getName());
        }

        if (configuration.moduleName() != null) {
            moduleCombo.setSelectedItem(configuration.moduleName());
        }

        moduleCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Module module = ModuleManager.getInstance(configuration.getProject()).findModuleByName((String)moduleCombo.getSelectedItem());
                packageBrowser.setModule(module);
                visibilityChecker.setModule(module);
                classBrowser.setModule(module);
            }
        });

        configurationCombo.removeAllItems();
        configurationCombo.addItem(ModeVariant.RELEASE_NAME);
        configurationCombo.addItem(ModeVariant.DEBUG_NAME);

        if (configuration.configuration() != null) {
            configurationCombo.setSelectedItem(configuration.configuration());
        } else {
            configurationCombo.setSelectedItem(configurationCombo.getItemCount() - 1);
        }

        configurationCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sdk = configurationCombo.getSelectedItem().toString();
                populateSimulators(sdk, "");
            }
        });

        if (configurationCombo.getSelectedItem() != null) {
            populateSimulators(configurationCombo.getSelectedItem().toString(), configuration.simulatorUdid());
        }

        if(OsUtils.isMac()) {
            simulatorRadio.setSelected(configuration.runOnSimulator());
        }
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

        populateDevices(configuration);

        if (configuration.deviceUdid() != null) {
            deviceCombo.setSelectedItem(configuration.deviceUdid());
        }

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateDevices(configuration);
            }
        });

        textDebugPort.setText(Integer.toString(configuration.debugPort()));
        textDebugRemotePort.setText(Integer.toString(configuration.debugRemotePort()));

        updateRunOn();

        populateRemoteBuild(configuration);

        populateJUnitTest(configuration);

        importButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPropertiesChoicerDialog();
            }
        });

        testButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testRemoteConnection();
            }
        });
    }

    private void populateSimulators(String sdk, String selectedUdid) {
        if(!OsUtils.isMac()) {
            return;
        }
        simulatorCombo.removeAllItems();

        for (Simulator simulator : SimulatorManager.getSimulators()) {
            simulatorCombo.addItem(new MOERunConfigurationEditor.SimulatorComboItem(simulator));

            if(selectedUdid != null && selectedUdid.equals(simulator.udid())) {
                simulatorCombo.setSelectedIndex(simulatorCombo.getItemCount() - 1);
            }
        }

        if (simulatorCombo.getItemCount() == 0) {
            simulatorCombo.setModel(new DefaultComboBoxModel(new String[]{MOEText.get("No.Simulator.Device.Available")}));
        }
    }

    private void populateDevices(MOERunConfiguration configuration) {
        deviceCombo.removeAllItems();

        deviceCombo.addItem(MOEText.get("First.Device.Available"));

        String moduleName = configuration.moduleName();

        Module module = null;

        if (moduleName != null && ! moduleName.isEmpty()) {
            module = configuration.getModules()[0];
        } else {
            module = ModuleManager.getInstance(configuration.getProject()).findModuleByName((String)moduleCombo.getItemAt(0));
        }
        File projectFile = new File(ModuleUtils.getModulePath(module));

        try {
            for (DeviceInfo device : Device.getDevices(projectFile)) {
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

    private void populateJUnitTest(MOERunConfiguration configuration) {

        runJUnitTestsCheckBox.setSelected(configuration.runJUnitTests());

        myPackageComponent.setComponent(new EditorTextFieldWithBrowseButton(myProject, false));
        String moduleName = configuration.moduleName();
        Module module = moduleName != null && ! moduleName.isEmpty() ?  configuration.getModules()[0] : null;
        packageBrowser = new MOERunConfigurationEditor.MyPackageBrowser(module);
        bind(myPackageComponent, packageBrowser);

        visibilityChecker = new MOETestClassVisibilityChecker(module);
        myClassComponent
                .setComponent(new EditorTextFieldWithBrowseButton(myProject, true, visibilityChecker));

        classBrowser = new MOETestClassBrowser(myProject, module, "Select test class", false);
        bind(myClassComponent, classBrowser);

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

        public void setModule(Module module) {
            this.module = module;
        }

        @Override
        protected String showDialog() {

            if (module == null) {
                Messages.showErrorDialog(component, ExecutionBundle.message("module.not.specified.error.text"));
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
            if (button != null) {
                if (button.isSelected()) {
                    return i;
                }
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

    private void populateRemoteBuild(MOERunConfiguration configuration) {
        if(!OsUtils.isMac()) {
            enableRemoteBuildCheckBox.setSelected(true);
            enableRemoteBuildCheckBox.setEnabled(false);
        } else {
            enableRemoteBuildCheckBox.setSelected(configuration.isRemoteBuildEnabled());
        }

        String remoteHost = configuration.getRemoteHost();
        int remotePort = configuration.getRemotePort();
        String remoteUser = configuration.getRemoteUser();
        String remoteKnownhosts = configuration.getRemoteKnownhosts();
        String remoteIdentity = configuration.getRemoteIdentity();
        String remoteKeychainPass = configuration.getRemoteKeychainPass();
        int remoteKeychainLocktimeout = configuration.getRemoteKeychainLocktimeout();
        String remoteGradleRepositories = configuration.getRemoteGradleRepositories();

        updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity, remoteKeychainPass,
                remoteKeychainLocktimeout, remoteGradleRepositories);
    }

    private void showPropertiesChoicerDialog() {
        final FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleFileDescriptor();
        descriptor.setTitle("Select remote build properties file");
        descriptor.setHideIgnored(true);
        VirtualFile selected = FileChooser.chooseFile(descriptor, myProject, null);

        if (selected != null) {
            FileInputStream inStream = null;
            Properties property;
            try {
                File propertiesFile = new File(selected.getCanonicalPath());
                inStream = new FileInputStream(propertiesFile);
                property = new Properties();
                property.load(inStream);

                String remoteHost = property.getProperty("host");
                String port = property.getProperty("port");
                port = port == null || port.isEmpty() ? "0" : port;
                int remotePort = Integer.parseInt(port);
                String remoteUser = property.getProperty("user");
                String remoteKnownhosts = property.getProperty("knownhosts");
                String remoteIdentity = property.getProperty("identity");
                String remoteKeychainPass = property.getProperty("keychain.pass");
                String timeout = property.getProperty("keychain.locktimeout");
                timeout = timeout == null || timeout.isEmpty() ? "0" : timeout;
                int remoteKeychainLocktimeout = Integer.parseInt(timeout);
                String remoteGradleRepositories = property.getProperty("gradle.repositories");

                updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity, remoteKeychainPass,
                        remoteKeychainLocktimeout, remoteGradleRepositories);
            } catch (Exception e) {
                showMessage("Unable load properties file");
            } finally {
                if (inStream != null) {
                    try {
                        inStream.close();
                    } catch (IOException ignore) {

                    }
                }
            }
        }
    }

    private void updateRemoteBuildSettings(String remoteHost, int remotePort, String remoteUser, String remoteKnownhosts,
                                           String remoteIdentity, String remoteKeychainPass, int remoteKeychainLocktimeout,
                                           String remoteGradleRepositories) {
        if (remoteHost != null && !remoteHost.isEmpty()) {
            hostTextField.setText(remoteHost);
        }
        if (remotePort > 0) {
            portTextField.setText(Integer.toString(remotePort));
        }
        if (remoteUser != null && !remoteUser.isEmpty()) {
            userTextField.setText(remoteUser);
        }
        if (remoteKnownhosts != null && !remoteKnownhosts.isEmpty()) {
            knownhostsTextField.setText(remoteKnownhosts);
        }
        if (remoteIdentity != null && !remoteIdentity.isEmpty()) {
            identityTextField.setText(remoteIdentity);
        }
        if (remoteKeychainPass != null && !remoteKeychainPass.isEmpty()) {
            keychainPassTextField.setText(remoteKeychainPass);
        }
        if (remoteKeychainLocktimeout > 0) {
            keychainLocktimeoutTextField.setText(Integer.toString(remoteKeychainLocktimeout));
        }
        if (remoteGradleRepositories != null && !remoteGradleRepositories.isEmpty()) {
            gradleRepositoriesTextField.setText(remoteGradleRepositories);
        }
    }

    private void testRemoteConnection() {
        String moduleName = (String)moduleCombo.getSelectedItem();
        if (moduleName == null || moduleName.isEmpty()) {
            showMessage("Please select module.");
            return;
        }
        Module module = ModuleManager.getInstance(myProject).findModuleByName(moduleName);
        if (module == null) {
            showMessage("Not found module: " + moduleName);
            return;
        }
        String remoteHost = hostTextField.getText();
        String remotePort = portTextField.getText();
        try {
            Integer.parseInt(remotePort);
        } catch (NumberFormatException e) {
            showMessage("Wrong remote port number, please enter a numeric value.");
            return;
        }
        String remoteUser = userTextField.getText();
        String remoteKownHosts = knownhostsTextField.getText();
        String remoteIdentity = identityTextField.getText();
        String remoteKeychainPass = keychainPassTextField.getText();
        String remoteBuildTimeout = keychainLocktimeoutTextField.getText();
        try {
            Integer.parseInt(remoteBuildTimeout);
        } catch (NumberFormatException e) {
            showMessage("Wrong remote build timeout number, please enter a numeric value.");
            return;
        }
        String remoteGradleRepositories = gradleRepositoriesTextField.getText();

        List<String> args = new ArrayList<String>();

        args.add("moeTestRemote");
        args.add("-Pmoe.remotebuild.properties.ignore");

        args.add("-Pmoe.remotebuild.host=" + remoteHost);
        args.add("-Pmoe.remotebuild.port=" + remotePort);
        args.add("-Pmoe.remotebuild.user=" + remoteUser);
        args.add("-Pmoe.remotebuild.knownhosts=" + remoteKownHosts);
        args.add("-Pmoe.remotebuild.identity=" + remoteIdentity);
        args.add("-Pmoe.remotebuild.keychain.pass=" + remoteKeychainPass);
        args.add("-Pmoe.remotebuild.keychain.locktimeout=" + remoteBuildTimeout);
        args.add("-Pmoe.remotebuild.gradle.repositories=" + remoteGradleRepositories);
        args.add("-s");

        File f = new File(ModuleUtils.getModulePath(module));
        GradleExec exec = new GradleExec(f);
        exec.getArguments().addAll(args);
        ExecRunner runner = null;
        final MOEToolWindow toolWindow =  MOEToolWindow.getInstance(module.getProject());
        toolWindow.showAndCreate(module.getProject());
        try {
            runner = exec.getRunner();
            runner.setListener(new ExecRunnerBase.ExecRunnerListener() {
                @Override
                public void stdout(String s) {
                    toolWindow.printMessage(s + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
                }

                @Override
                public void stderr(String s) {
                    toolWindow.printMessage(s + "\n", ConsoleViewContentType.ERROR_OUTPUT);
                }
            });
        } catch (IOException e) {
            showMessage("Unable run test: " + e.getMessage());
        }

        if (runner != null) {
            runner.getBuilder().directory(f);
        }

        try {
            ProcessBuilder builder = runner.getBuilder();
            Process process = runner.execute();
            int result = process.waitFor();

            if (result != 0) {
                showMessage("Test fail");
            } else {
                showMessage("Test successful.");
            }
        } catch (Exception e) {
            showMessage("Unable run test: " + e.getMessage());
        }
    }
}
