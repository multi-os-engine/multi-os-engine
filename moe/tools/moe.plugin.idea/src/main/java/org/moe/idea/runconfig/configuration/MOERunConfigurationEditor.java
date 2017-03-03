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
import com.intellij.execution.configuration.BrowseModuleValueActionListener;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.ide.util.PackageChooserDialog;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.diagnostic.Logger;
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
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.PsiPackage;
import com.intellij.ui.EditorTextFieldWithBrowseButton;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.common.configuration.RemoteSettings;
import org.moe.common.exec.ExecRunnerBase;
import org.moe.common.ios.Device;
import org.moe.common.ios.DeviceInfo;
import org.moe.common.utils.OsUtils;
import org.moe.common.utils.SimCtl;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.test.MOEJUnitUtil;
import org.moe.idea.runconfig.configuration.test.MOETestClassBrowser;
import org.moe.idea.runconfig.configuration.test.MOETestClassVisibilityChecker;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.Configuration;
import org.moe.idea.utils.InputValidationHelper;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.RunTargetUtil;
import org.moe.idea.utils.RunTargetUtil.SimulatorComboItem;
import org.moe.idea.utils.logger.LoggerFactory;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

public class MOERunConfigurationEditor extends SettingsEditor<MOERunConfiguration> {

    private static final Logger LOG = LoggerFactory.getLogger(MOERunConfigurationEditor.class);

    private static final int DEFAULT_REMOTE_BUILD_PORT = 22;
    private static final int DEFAULT_REMOTE_BUILD_TIMEOUT = 3600;
    private static final String DEFAULT_REMOTE_BUILD_REPOSITORY = "jcenter()";
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
    private ArgumentsPanel argumentsPanel;
    private JButton exportButton;
    private JTextField keychainNameTextField;
    private JCheckBox openSelectDeploymentTargetCheckBox;
    private Project myProject;
    private final JRadioButton[] myTestingType2RadioButton = new JRadioButton[3];
    private JComponent anchor;
    private MOERunConfigurationEditor.MyPackageBrowser packageBrowser;
    private MOETestClassVisibilityChecker visibilityChecker;
    private MOETestClassBrowser classBrowser;

    public MOERunConfigurationEditor(Project project) {
        this.myProject = project;
        anchor = UIUtil.mergeComponentsWithAnchor(argumentsPanel);
    }

    @Override
    protected void resetEditorFrom(MOERunConfiguration configuration) {
        if(!OsUtils.isMac()) {
            simulatorRadio.setSelected(false);
            simulatorRadio.setEnabled(false);
            deviceRadio.setSelected(true);
        }
        populateControls(configuration);
        argumentsPanel.resetEditorFrom(configuration);
    }

    @Override
    protected void applyEditorTo(MOERunConfiguration configuration) throws ConfigurationException {

        if (configurationCombo.getSelectedItem() != null) {
            configuration.configuration(configurationCombo.getSelectedItem().toString());
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

        if (enableRemoteBuildCheckBox.isSelected()) {
            Properties properties = RemoteSettings.getProperties(hostTextField.getText(), portTextField.getText(),
                    userTextField.getText(), knownhostsTextField.getText(), identityTextField.getText(),
                    keychainNameTextField.getText(), keychainPassTextField.getText(),
                    keychainLocktimeoutTextField.getText(), gradleRepositoriesTextField.getText());
            try {
                RemoteSettings.validate(properties);
            } catch (ConfigurationValidationException e) {
                throw new ConfigurationException(e.getErrorMessage());
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
        configuration.setRemoteKeychainName(keychainNameTextField.getText());
        String remoteBuildTimeout = keychainLocktimeoutTextField.getText();
        remoteBuildTimeout = remoteBuildTimeout == null || remoteBuildTimeout.isEmpty() ? "0" : remoteBuildTimeout;
        configuration.setRemoteKeychainLocktimeout(Integer.parseInt(remoteBuildTimeout));
        configuration.setRemoteGradleRepositories(gradleRepositoriesTextField.getText());
        configuration.setOpenDeploymentTargetDialog(openSelectDeploymentTargetCheckBox.isSelected());

        argumentsPanel.applyEditorTo(configuration);
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
        configurationCombo.addItem(Configuration.RELEASE_NAME);
        configurationCombo.addItem(Configuration.DEBUG_NAME);

        if (configuration.configuration() != null) {
            configurationCombo.setSelectedItem(configuration.configuration());
        } else {
            configurationCombo.setSelectedItem(configurationCombo.getItemCount() - 1);
        }

        configurationCombo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateSimulators(null);
            }
        });

        populateSimulators(configuration.simulatorUdid());

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

        exportButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSavePropertyDialog();
            }
        });

        openSelectDeploymentTargetCheckBox.setSelected(configuration.getOpenDeploymentTargetDialog());
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
        argumentsPanel.setAnchor(anchor);
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
        String remoteKeychainName = configuration.getRemoteKeychainName();
        String remoteKeychainPass = configuration.getRemoteKeychainPass();
        int remoteKeychainLocktimeout = configuration.getRemoteKeychainLocktimeout();
        String remoteGradleRepositories = configuration.getRemoteGradleRepositories();

        updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity,
                remoteKeychainName, remoteKeychainPass,
                remoteKeychainLocktimeout, remoteGradleRepositories);
    }

    private void showPropertiesChoicerDialog() {
        final FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleFileDescriptor();
        descriptor.setTitle("Select remote build properties file");
        descriptor.setHideIgnored(true);
        VirtualFile selected = FileChooser.chooseFile(descriptor, myProject, null);

        if (selected != null) {

            try {
                Properties property = RemoteSettings.readProperties(selected.getCanonicalPath());
                String remoteHost = property.getProperty("host");
                String port = property.getProperty("port");
                port = port == null || port.isEmpty() ? "0" : port;
                int remotePort = Integer.parseInt(port);
                String remoteUser = property.getProperty("user");
                String remoteKnownhosts = property.getProperty("knownhosts");
                String remoteIdentity = property.getProperty("identity");
                String remoteKeychainName = property.getProperty("keychain.name");
                String remoteKeychainPass = property.getProperty("keychain.pass");
                String timeout = property.getProperty("keychain.locktimeout");
                timeout = timeout == null || timeout.isEmpty() ? "0" : timeout;
                int remoteKeychainLocktimeout = Integer.parseInt(timeout);
                String remoteGradleRepositories = property.getProperty("gradle.repositories");

                updateRemoteBuildSettings(remoteHost, remotePort, remoteUser, remoteKnownhosts, remoteIdentity,
                        remoteKeychainName, remoteKeychainPass,
                        remoteKeychainLocktimeout, remoteGradleRepositories);
            } catch (Exception e) {
                showMessage("Unable load properties file");
            }
        }
    }

    private void updateRemoteBuildSettings(String remoteHost, int remotePort, String remoteUser, String remoteKnownhosts,
                                           String remoteIdentity, String remoteKeychainName,
                                           String remoteKeychainPass, int remoteKeychainLocktimeout,
                                           String remoteGradleRepositories) {
        if (remoteHost != null && !remoteHost.isEmpty()) {
            hostTextField.setText(remoteHost);
        }
        if (remotePort > 0) {
            portTextField.setText(Integer.toString(remotePort));
        } else {
            portTextField.setText(Integer.toString(DEFAULT_REMOTE_BUILD_PORT));
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
        if (remoteKeychainName != null && !remoteKeychainName.isEmpty()) {
            keychainNameTextField.setText(remoteKeychainName);
        } else {
            keychainNameTextField.setText("moeremotebuild.keychain");
        }
        if (remoteKeychainPass != null && !remoteKeychainPass.isEmpty()) {
            keychainPassTextField.setText(remoteKeychainPass);
        }
        if (remoteKeychainLocktimeout > 0) {
            keychainLocktimeoutTextField.setText(Integer.toString(remoteKeychainLocktimeout));
        } else {
            keychainLocktimeoutTextField.setText(Integer.toString(DEFAULT_REMOTE_BUILD_TIMEOUT));
        }
        if (remoteGradleRepositories != null && !remoteGradleRepositories.isEmpty()) {
            gradleRepositoriesTextField.setText(remoteGradleRepositories);
        } else {
            gradleRepositoriesTextField.setText(DEFAULT_REMOTE_BUILD_REPOSITORY);
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
        Properties properties = RemoteSettings.getProperties(hostTextField.getText(), portTextField.getText(),
                userTextField.getText(), knownhostsTextField.getText(), identityTextField.getText(),
                keychainNameTextField.getText(), keychainPassTextField.getText(),
                keychainLocktimeoutTextField.getText(), gradleRepositoriesTextField.getText());
        try {
            RemoteSettings.validate(properties);
        } catch (ConfigurationValidationException e) {
            showMessage(e.getErrorMessage());
            return;
        }

        File f = new File(ModuleUtils.getModulePath(module));
        final MOEToolWindow toolWindow =  MOEToolWindow.getInstance(module.getProject());
        toolWindow.show();
        final StringBuffer runError = new StringBuffer();
        String errorMessage = RemoteSettings.test(f, properties,
                new ExecRunnerBase.ExecRunnerListener() {
                    @Override
                    public void stdout(String s) {
                        toolWindow.printMessage(s + "\n", ConsoleViewContentType.NORMAL_OUTPUT);
                        if (s.toLowerCase().contains("error")) {
                            runError.append(s);
                        }
                    }

                    @Override
                    public void stderr(String s) {
                        toolWindow.printMessage(s + "\n", ConsoleViewContentType.ERROR_OUTPUT);
                        runError.append(s);
                    }
                });

        String runErrorText = runError.toString();
        if (errorMessage == null && (runErrorText == null || runErrorText.isEmpty())) {
            showMessage("Test successful");
        } else {
            if (errorMessage == null) {
                errorMessage = runErrorText;
            } else {
                errorMessage += " " + runErrorText;
            }
            showMessage(errorMessage);
        }
    }

    private void showSavePropertyDialog() {
        final FileChooserDescriptor descriptor = FileChooserDescriptorFactory.createSingleFolderDescriptor();
        descriptor.setTitle("Select save folder");
        descriptor.setHideIgnored(true);
        VirtualFile selected = FileChooser.chooseFile(descriptor, myProject, null);

        if (selected != null) {
            Properties properties = RemoteSettings.getProperties(hostTextField.getText(), portTextField.getText(),
                    userTextField.getText(), knownhostsTextField.getText(), identityTextField.getText(),
                    keychainNameTextField.getText(), keychainPassTextField.getText(),
                    keychainLocktimeoutTextField.getText(), gradleRepositoriesTextField.getText());
            try {
                RemoteSettings.validate(properties);
                RemoteSettings.saveProperties(selected.getCanonicalPath(), properties);
                VfsUtil.markDirtyAndRefresh(false, true, true, selected);

                showMessage("Property file saved.");
            } catch (ConfigurationValidationException e) {
                showMessage(e.getErrorMessage());
                return;
            } catch (IOException e) {
                showMessage(e.getMessage());
                return;
            }
        }
    }
}
