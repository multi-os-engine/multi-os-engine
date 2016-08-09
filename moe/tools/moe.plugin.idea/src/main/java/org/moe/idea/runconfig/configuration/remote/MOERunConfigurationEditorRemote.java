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

package org.moe.idea.runconfig.configuration.remote;

import org.moe.common.*;
import org.moe.common.ios.*;
import org.moe.common.utils.OsUtils;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.configuration.remote.helpers.ProjectGUIDProcessHelper;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.InputValidationHelper;
import org.moe.common.developer.SigningIdentity;
import org.moe.common.sdk.Sdk;
import org.moe.common.sdk.SdkManager;
import org.moe.common.ssh.SSHAdapter;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.fileChooser.FileChooserDialog;
import com.intellij.openapi.fileChooser.FileChooserFactory;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.project.ProjectManager;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Matcher;

import static org.apache.commons.lang.exception.ExceptionUtils.getStackTrace;

public class MOERunConfigurationEditorRemote extends SettingsEditor<MOERunConfigurationRemote> {
    private final MOERunConfigurationRemote configuration;
    private JPanel panel;
    private JComboBox moduleCombo;
    private JComboBox sdkCombo;
    private JTextField serverRemoteText;
    private JButton testConnectionButton;
    private JPasswordField passwordText;
    private JTextField loginText;
    private JComboBox deviceCombo;

    private JTextField portText;
    private JButton refreshButton;
    private JLabel labelDebugRemotePort;
    private JTextField textDebugPort;
    private JTextField textDebugRemotePort;
    private JTextField profilePathText;
    private JButton profileBrowseButton;
    private JTextField certificatePathText;
    private JButton certificateBrowseButton;

    final String remoteProjectDirPath = "/moeRemoteBuilds/";

    public MOERunConfigurationEditorRemote(MOERunConfigurationRemote configuration) {
        LOGGER.SetLogFilePrefix("RunRemoteBuild");
        String basePath = configuration.getProject().getBasePath();
        LOGGER.SetLogFilePath(OsUtils.concatenateToLocalPath(basePath, "build", "logs"));
        LOGGER.EnableConsoleOutLog(true);
        LOGGER.setLogLevel(Level.ALL);
        this.configuration = configuration;
        LOGGER.INFO("Configuration was created");
    }

    private static void runInDispatchedThread(@NotNull Runnable runnable) {
        ApplicationManager.getApplication().invokeLater(runnable);
    }

    @Override
    protected void resetEditorFrom(MOERunConfigurationRemote configuration) {
        LOGGER.FINEST("+");
        populateControls(configuration);
    }

    @Override
    protected void applyEditorTo(MOERunConfigurationRemote configuration) throws ConfigurationException {
        LOGGER.FINEST("+");
        if (configuration == null) {
            throw new ConfigurationException("Configuration retrieving failure.");
        }

        configuration.remoteConfiguration(applyConnectionProperties(new MOERemoteConfiguration()));

        String projectID;
        try {
            projectID = ProjectGUIDProcessHelper.GenerateProjectGUID(MOESdkPlugin.getProductName(configuration.module())) + '/';
        } catch (Exception e) {
            projectID  = "";
        }
        configuration.remoteModuleDirPath(remoteProjectDirPath +
                projectID);

        if (moduleCombo.getSelectedItem() == null) {
            throw new ConfigurationException("Please select a module");
        }

        try {
            configuration.moduleName(moduleCombo.getSelectedItem().toString());
        } catch (Exception e) {
            throw new ConfigurationException(e.getMessage());
        }

        String profilePath = profilePathText.getText();
        if ((profilePath == null) || profilePath.isEmpty()) {
            configuration.profilePath("");
            throw new ConfigurationException("Please select provisioning profile");
        }
        configuration.profilePath(profilePath);

        String certificatePath = certificatePathText.getText();
        if ((certificatePath == null) || certificatePath.isEmpty()) {
            configuration.certificatePath("");
            throw new ConfigurationException("Please select developer certificate");
        }
        configuration.certificatePath(certificatePath);

        if (sdkCombo.getItemCount() != 0 && sdkCombo.getSelectedItem() == null) {
            throw new ConfigurationException("Please select iOS SDK version");
        }
        if (sdkCombo.getSelectedItem() != null) {
            configuration.sdkVersion(sdkCombo.getSelectedItem().toString());
        }

        if (deviceCombo.getSelectedItem() != null) {
            String deviceUdid = deviceCombo.getSelectedItem().toString();

            if (deviceUdid.equals(MOEText.get("First.Device.Available"))) {
                deviceUdid = "";
            }

            configuration.deviceUdid(deviceUdid);
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
    }

    protected MOERemoteConfiguration applyConnectionProperties(MOERemoteConfiguration remoteConfiguration) throws ConfigurationException {
        if (remoteConfiguration == null) {
            throw new ConfigurationException("Invalid remote configuration.");
        }
        if (serverRemoteText.getText().trim().isEmpty()) {
            throw new ConfigurationException("Please enter Server address");
        }
        if (loginText.getText().trim().isEmpty()) {
            throw new ConfigurationException("Please enter Login");
        }

        remoteConfiguration.address(serverRemoteText.getText().trim());

        int portNumber = 22;
        if (!portText.getText().isEmpty()) {
            try {
                portNumber = Integer.parseInt(portText.getText());

                if ((portNumber <= 0) ||
                        (portNumber >= MOERemoteConfiguration.OSX_MAX_PRIVILEGED_PORT)) {
                    throw new ConfigurationException("Port must be more than 0 and less than " + MOERemoteConfiguration.OSX_MAX_PRIVILEGED_PORT);
                }
            } catch (NumberFormatException e) {
                throw new ConfigurationException("Port number should be numeric value");
            }
        }
        remoteConfiguration.port(portNumber);

        remoteConfiguration.login(loginText.getText().trim());

        char[] pswd = passwordText.getPassword();
        if (pswd.length == 0) {
            throw new ConfigurationException("Please enter Password");
        }

        try {
            configuration.secureValue(remoteConfiguration.passKey(), pswd, true);
        } catch (PasswordSafeException pse) {
            MOEToolWindow.getInstance(configuration.getProject()).log(pse.getMessage());
        }

        return remoteConfiguration;
    }

    @NotNull
    @Override
    protected JComponent createEditor() {
        return panel;
    }

    private void populateControls(MOERunConfigurationRemote configuration) {
        LOGGER.FINEST("+");
        moduleCombo.removeAllItems();

        for (Module module : MOESdkPlugin.getMoeModules(configuration.getProject())) {
            moduleCombo.addItem(module.getName());
        }

        String moduleName = configuration.moduleName();
        if ((moduleName != null) && !moduleName.isEmpty()) {
            moduleCombo.setSelectedItem(configuration.moduleName());
        } else if (moduleCombo.getSelectedItem() != null) {
            configuration.moduleName(moduleCombo.getSelectedItem().toString());
        }

        populateDevices();

        if (configuration.deviceUdid() != null) {
            deviceCombo.setSelectedItem(configuration.deviceUdid());
        }

        MOERemoteConfiguration remoteConfiguration = configuration.remoteConfiguration();

        serverRemoteText.setText(remoteConfiguration.address());

        loginText.setText(remoteConfiguration.login());

        String key = null;
        try {
            key = configuration.secureValue(remoteConfiguration.passKey());
            passwordText.setText(key);
        } catch (PasswordSafeException pse) {
            MOEToolWindow.getInstance(configuration.getProject()).log(pse.getMessage());
        } finally {
            try {
                PasswordEntry.fillString(key, PasswordEntry.charToFill);
            } catch (Exception e) {
                LOGGER.SEVERE(getStackTrace(e));
                showMessage(e.getMessage());
            }
        }

        testConnectionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onTestConnection();
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                populateDevices();
            }
        });

        sdkCombo.removeAllItems();
        if (configuration.sdkVersion() != null) {
            sdkCombo.addItem(configuration.sdkVersion());
            sdkCombo.setSelectedIndex(0);
        }
        sdkCombo.setEnabled(false);

        textDebugPort.setText(Integer.toString(configuration.debugPort()));
        textDebugRemotePort.setText(Integer.toString(configuration.debugRemotePort()));

        String profilePath = configuration.profilePath();
        profilePathText.setText((profilePath != null) ? profilePath : "");

        String certificatePath = configuration.certificatePath();
        certificatePathText.setText((certificatePath != null) ? certificatePath : "");

        profileBrowseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                browseForFile(profilePathText, ".mobileprovision");
            }
        });

        certificateBrowseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                certificateBrowseButton.setFocusable(false);
                onCertificateBrowse();
            }
        });
    }

    private void populateSDKs(List<Sdk> sdks) {
        LOGGER.FINEST("+");
        String selected = null;

        if (sdkCombo.getSelectedItem() != null) {
            selected = sdkCombo.getSelectedItem().toString();
        }

        sdkCombo.removeAllItems();

        if (sdks.size() == 0) {
            return;
        }

        for (Sdk sdk : sdks) {
            sdkCombo.addItem(sdk.version());
        }

        if (selected != null) {
            sdkCombo.setSelectedItem(selected);
        } else {
            sdkCombo.setSelectedItem(0);
        }

        sdkCombo.setEnabled(true);
    }

    private void populateDevices() {
        deviceCombo.removeAllItems();

        deviceCombo.addItem(MOEText.get("First.Device.Available"));

        try {
            for (DeviceInfo device : Device.getDevices()) {
                deviceCombo.addItem(device.udid());
            }
        } catch (Exception e) {
            MOEToolWindow.getInstance(configuration.getProject()).log(e.getMessage());
        }

        deviceCombo.setSelectedItem(MOEText.get("First.Device.Available"));
    }

    private void onTestConnection() {
        LOGGER.FINEST("+");
        try {
            applyConnectionProperties(configuration.remoteConfiguration());
        } catch (ConfigurationException e) {
            LOGGER.SEVERE(getStackTrace(e));
            showMessageOnEventDispatchThread(e.getMessage());
            return;
        }

        testConnectionButton.setEnabled(false);

        ProgressManager.getInstance().run(new Task.Backgroundable(configuration.getProject(), "Title") {
            public void run(@NotNull ProgressIndicator progressIndicator) {
                progressIndicator.pushState();

                progressIndicator.setText("Connecting to server...");
                progressIndicator.setIndeterminate(true);

                MOERemoteConfiguration remoteConfiguration = configuration.remoteConfiguration();

                try {
                    tryConnectToSsh(remoteConfiguration.address(), remoteConfiguration.port());
                } catch (final Exception ex) {
                    runInDispatchedThread(new Runnable() {
                        @Override
                        public void run() {
                            LOGGER.SEVERE(getStackTrace(ex));
                            showMessage(ex.getMessage());
                            testConnectionButton.setEnabled(true);
                        }
                    });
                    return;
                }
                String modulePath = configuration.modulePath();
                if ((modulePath == null) || modulePath.isEmpty()) {
                    runInDispatchedThread(new Runnable() {
                        @Override
                        public void run() {
                            LOGGER.SEVERE("Module was not selected.");
                            showMessage("Please select module.");
                            testConnectionButton.setEnabled(true);
                        }
                    });
                    return;
                }
                final File projectDir = new File(modulePath);

                String quotedPswd = null;
                byte[] pswd = null;

                try {
//                    quotedPswd = configuration.getQuotedPassKey(remoteConfiguration.passKey());
                    quotedPswd = configuration.secureValue(remoteConfiguration.passKey());
                    pswd = quotedPswd.getBytes();
                } catch (final PasswordSafeException e) {
                    runInDispatchedThread(new Runnable() {
                        @Override
                        public void run() {
                            LOGGER.SEVERE(getStackTrace(e));
                            showMessage("Unable to retrieve password from secure storage" + "\n" + e.getMessage());
                            testConnectionButton.setEnabled(true);
                        }
                    });
                    return;
                } finally {
                    try {
                        PasswordEntry.clean(quotedPswd);
                    } catch (Exception e) {
                        LOGGER.SEVERE(getStackTrace(e));
                    }
                }

                SSHAdapter sshAdapter = new SSHAdapter();
                List<Sdk> sdks = null;
                try {
                    sshAdapter.ConnectToServer(remoteConfiguration.address(), 22, remoteConfiguration.login(), pswd, null);
                    sdks = getSdks(sshAdapter);
                    sshAdapter.CloseConnection();
                } catch (final Exception e) {
                    runInDispatchedThread(new Runnable() {
                        @Override
                        public void run() {
                            LOGGER.SEVERE(getStackTrace(e));
                            showMessage(e.getMessage());
                            testConnectionButton.setEnabled(true);
                        }
                    });
                    return;
                } finally {
                    PasswordEntry.clean(pswd);
                }

                final List<Sdk> SDKs = sdks;

                runInDispatchedThread(new Runnable() {
                    @Override
                    public void run() {

                        populateSDKs(SDKs);

                        testConnectionButton.setEnabled(true);
                    }
                });

                progressIndicator.setText("Done");

                progressIndicator.popState();
            }

        });
    }

    private void tryConnectToSsh(String address, int port) throws IOException {
        LOGGER.FINEST("+");
        Socket socket = null;

        IOException exception = null;

        try {
            socket = new Socket(address, port);
        } catch (IOException ex) {
            exception = new IOException("Failed to connect to remote server: " + ex.getMessage());
        }

        if (exception == null) {
            BufferedReader bufferedReader = null;
            InputStreamReader inputStreamReader = null;

            try {
                inputStreamReader = new InputStreamReader(socket.getInputStream());
            } catch (IOException e) {
                exception = e;
            }

            if (exception == null) {
                bufferedReader = new BufferedReader(inputStreamReader);

                String response;

                try {
                    response = bufferedReader.readLine();
                } catch (IOException e) {
                    exception = e;
                    response = "";
                }

                if (exception == null) {
                    if (response.isEmpty()) {
                        exception = new IOException("Empty server response. Wrong port?");
                    } else if (!response.contains("SSH")) {
                        exception = new IOException("Wrong server response: " + response + ". Wrong port?");
                    }
                }
            }

            if (inputStreamReader != null) {
                try {
                    inputStreamReader.close();
                } catch (IOException e) {
                }
            }

            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                }
            }
        }

        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }

        if (exception != null) {
            throw exception;
        }
    }

    private boolean browseForFile(final JTextField fieldToSet, final String filter) {
        boolean isSuccessful = false;

        FileChooserDialog fileChooser = FileChooserFactory.getInstance()
                .createFileChooser(new FileChooserDescriptor(true, false, false, false, false, false) {
                    @Override
                    public boolean isFileVisible(VirtualFile file, boolean showHiddenFiles) {
                        return (file.getName().toLowerCase().endsWith(filter.toLowerCase()) || file.isDirectory());
                    }

                    @Override
                    public boolean isFileSelectable(VirtualFile file) {
                        return file.getName().toLowerCase().endsWith(filter.toLowerCase());
                    }
                }, null, panel);

        Project project = ProjectManager.getInstance().getOpenProjects()[0];

        VirtualFile[] dir = fileChooser.choose(project);
        if (dir != null && dir.length > 0) {
            fieldToSet.setText(dir[0].getCanonicalPath());
            isSuccessful = true;
        }

        return isSuccessful;
    }

    private void onCertificateBrowse() {
        boolean isSuccessful = browseForFile(certificatePathText, ".p12");
        if (isSuccessful) {
            String certPath = certificatePathText.getText();
            configuration.certificatePath(certPath);

            PasswdDlg passwdDlg = new PasswdDlg(certPath);
            passwdDlg.setVisible(true);

            char[] certPassword = passwdDlg.certPassword();

            if ((certPassword == null) || (certPassword.length == 0) || !passwdDlg.isPasswordAccepted()) {
                certificatePathText.setText("");
                configuration.certificatePath("");
            } else {
                try {
                    configuration.secureValue(certPath, certPassword, true);
                    configuration.setSigningIdentity(new SigningIdentity(passwdDlg.certCommonName(), ""));
                } catch (Exception e) {
                    PasswordEntry.clean(certPassword);
                    LOGGER.SEVERE(getStackTrace(e));
                    showMessage(e.getMessage());
                }
            }
        }
    }

    public List<Sdk> getSdks(SSHAdapter adapter) throws Exception {

        StringBuffer output = new StringBuffer(1024);
        adapter.ShellCmd("xcodebuild -showsdks", output);

        String[] lines = output.toString().replaceAll("\r", "").split("\n");
        String sdkVersion;
        boolean found;
        List<Sdk> result = new ArrayList<Sdk>();
        for (String line: lines) {
            Matcher matcher = SdkManager.sdkPattern.matcher(line);

            if (!matcher.matches()) {
                continue;
            }

            sdkVersion = matcher.group(1);

            found = false;

            for (Sdk sdk : result) {
                if(sdk.version().compareToIgnoreCase(sdkVersion) == 0) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result.add(new Sdk(sdkVersion));
            }
        }

        return result;
    }

    @Override
    protected void disposeEditor() {
        LOGGER.FINEST("+");
        passwordText.setText("");
        LOGGER.Terminate();
    }

    public void showMessage(String message) {
        if (message != null) {
            LOGGER.SEVERE(message);
            Messages.showMessageDialog(message, MOEText.get("Remote.Build"), MOEIcons.MOELogo);
        }
    }

    public void showMessageOnEventDispatchThread(final String message) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                LOGGER.SEVERE(message);
                showMessage(message);
            }
        });
    }

}
