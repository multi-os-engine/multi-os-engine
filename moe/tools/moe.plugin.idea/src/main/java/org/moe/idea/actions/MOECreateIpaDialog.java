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

package org.moe.idea.actions;

import com.intellij.execution.RunManager;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.ide.passwordSafe.PasswordSafeException;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.ui.ValidationInfo;
import org.jetbrains.annotations.Nullable;
import org.moe.common.PasswordEntry;
import org.moe.common.developer.ProvisioningProfile;
import org.moe.common.developer.SigningIdentity;
import org.moe.common.utils.OsUtils;
import org.moe.idea.MOESdkPlugin;
import org.moe.idea.runconfig.MOEIpaConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.utils.ProvisioningProfileComboItem;
import org.moe.idea.utils.SigningIdentityComboItem;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MOECreateIpaDialog extends DialogWrapper {
    private final Project project;

    private JComboBox moduleComboBox;

    private JComboBox signingIdentityComboBox;
    private JComboBox provisioningProfileComboBox;

    private JPanel contentPanel;
    private JComboBox sdkCombo;
    private JCheckBox remoteCheckBox;
    private JComboBox remoteConfigComboBox;

    protected MOECreateIpaDialog(@Nullable Project project) {
        super(project);

        this.project = project;

        init();

        remoteConfigComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onConfigSelected();
            }
        });

        remoteCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onConfigTypeSwitch();
            }
        });

        if (OsUtils.isMac()) {
            remoteCheckBox.setSelected(false);

            populateControls();
        } else {
            // Always remote
            remoteCheckBox.setSelected(true);
            remoteCheckBox.setVisible(false);

            moduleComboBox.setEnabled(false);
            signingIdentityComboBox.setEnabled(false);
            provisioningProfileComboBox.setEnabled(false);
            sdkCombo.setEnabled(false);

            populateConfigs();
        }
    }

    private void onConfigTypeSwitch() {
        if (remoteCheckBox.isSelected()) {
            remoteConfigComboBox.setEnabled(true);

            moduleComboBox.setEnabled(false);
            signingIdentityComboBox.setEnabled(false);
            provisioningProfileComboBox.setEnabled(false);
            sdkCombo.setEnabled(false);

            populateConfigs();
        } else {
            remoteConfigComboBox.setEnabled(false);
            remoteConfigComboBox.removeAllItems();

            moduleComboBox.setEnabled(true);
            signingIdentityComboBox.setEnabled(true);
            provisioningProfileComboBox.setEnabled(true);
            sdkCombo.setEnabled(true);

            populateControls();
        }
    }

    private void onConfigSelected() {
        if (!remoteCheckBox.isSelected() || (remoteConfigComboBox.getItemCount() < 1)) {
            return;
        }

        moduleComboBox.removeAllItems();
        signingIdentityComboBox.removeAllItems();
        provisioningProfileComboBox.removeAllItems();
        sdkCombo.removeAllItems();

        MOERunConfigurationBase configuration = (MOERunConfigurationBase) ((ConfigComboItem) remoteConfigComboBox.getSelectedItem()).runConfiguraion;

        if (configuration == null) {
            return;
        }

        if (!checkBaseConfig(configuration)) {
            return;
        }

        populateControlsForConfiguration(configuration);
    }

    @Nullable
    @Override
    protected JComponent createCenterPanel() {
        return contentPanel;
    }

    private void populateControls() {
        sdkCombo.removeAllItems();

        moduleComboBox.removeAllItems();

        for (Module module : MOESdkPlugin.getMoeModules(project)) {
            moduleComboBox.addItem(module.getName());
        }

        signingIdentityComboBox.removeAllItems();
        try {
            List<SigningIdentity> signingIdentities = SigningIdentity.getIdentities();
            if (signingIdentities != null) {
                for (SigningIdentity identity : signingIdentities) {
                    signingIdentityComboBox.addItem(new SigningIdentityComboItem(identity));
                }
            }

//            for (Sdk sdk : SdkManager.list()) {
//                boolean hasDevices = false;
//                for (Simulator simulator : SimulatorManager.getSimulators()) {
//                    if (sdk.version().contains(simulator.sdk())) {
//                        hasDevices = true;
//                        break;
//                    }
//                }
//
//                if (hasDevices) {
//                    sdkCombo.addItem(sdk.version());
//                }
//            }
        } catch (Exception e) {
            MOEToolWindow.getInstance(project).log(e.getMessage());
        }

        provisioningProfileComboBox.removeAllItems();
        List<ProvisioningProfile> profiles = ProvisioningProfile.getProfiles();
        if (profiles != null) {
            for (ProvisioningProfile profile : profiles) {
                provisioningProfileComboBox.addItem(new ProvisioningProfileComboItem(profile));
            }
        }

        if (sdkCombo.getItemCount() > 0) {
            sdkCombo.setSelectedIndex(0);
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    private void populateConfigs() {
        if (project == null) {
            return;
        }

        /*List<RunConfiguration> RemoteConfigs = RunManager.getInstance(project).getConfigurationsList(MOERunConfigurationTypeRemote.getInstance());

        if (!RemoteConfigs.isEmpty()) {
            for (RunConfiguration conf : RemoteConfigs) {
                remoteConfigComboBox.addItem(new ConfigComboItem(conf));
            }
        }*/

        if (remoteConfigComboBox.getItemCount() > 0) {
            remoteConfigComboBox.setSelectedIndex(0);
        }
    }

    private void populateControlsForConfiguration(MOERunConfigurationBase configuration) {
        moduleComboBox.removeAllItems();
        signingIdentityComboBox.removeAllItems();
        provisioningProfileComboBox.removeAllItems();
        sdkCombo.removeAllItems();

        moduleComboBox.addItem(configuration.moduleName());

        /*if (configuration instanceof MOERunConfigurationRemote) {
            signingIdentityComboBox.addItem(((MOERunConfigurationRemote) configuration).certificatePath());
            provisioningProfileComboBox.addItem(((MOERunConfigurationRemote) configuration).profilePath());
            sdkCombo.addItem(configuration.sdkVersion());
        }*/

    }

    @Nullable
    @Override
    protected ValidationInfo doValidate() {
        return null;
    }

    public MOEIpaConfiguration getConfiguration() {
        if (project == null) {
            return null;
        }

        MOEIpaConfiguration configuration = null;

        if ((moduleComboBox.getItemCount() > 0) && (signingIdentityComboBox.getItemCount() > 0) && (provisioningProfileComboBox.getItemCount() > 0)) {
            Module module = ModuleManager.getInstance(project).findModuleByName(moduleComboBox.getSelectedItem().toString());

            if (module == null) {
                return null;
            }


            SigningIdentity signingIdentity = null;
            ProvisioningProfile provisioningProfile = null;
            String sdkVertion = "9.3";
            if (!remoteCheckBox.isSelected()) {
                signingIdentity = ((SigningIdentityComboItem) this.signingIdentityComboBox.getSelectedItem()).signingIdentity;
                provisioningProfile = ((ProvisioningProfileComboItem) this.provisioningProfileComboBox.getSelectedItem()).provisioningProfile;
                if (sdkCombo.getSelectedItem() != null) {
                    sdkVertion = sdkCombo.getSelectedItem().toString();
                }
            }

            configuration = new MOEIpaConfiguration(project, module, signingIdentity, provisioningProfile);

            /*if (remoteCheckBox.isSelected() && (remoteConfigComboBox.getSelectedItem() != null) && (((ConfigComboItem)remoteConfigComboBox.getSelectedItem()).runConfiguraion instanceof MOERunConfigurationRemote)) {
                MOERunConfigurationBase runConfiguration = (MOERunConfigurationBase)((ConfigComboItem) remoteConfigComboBox.getSelectedItem()).runConfiguraion;
                configuration.runConfiguration(runConfiguration);
                sdkVertion = runConfiguration.sdkVersion();
            }*/

            configuration.sdkVersion(sdkVertion);
        }

        return configuration;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /*private boolean checkRemoteConfig(MOERunConfigurationRemote configuration) {
        if ((configuration.sdkVersion() == null) || configuration.sdkVersion().isEmpty() ||
                (configuration.certificatePath() == null) || configuration.certificatePath().isEmpty() ||
                (configuration.profilePath() == null) || configuration.profilePath().isEmpty() ) {
            return false;
        }

        MOERemoteConfiguration remoteConfiguration = configuration.remoteConfiguration();

        boolean retVal = false;
        String passKey = null;

        try {
            passKey = configuration.secureValue(remoteConfiguration.passKey());
            retVal = !((remoteConfiguration.address() == null) || remoteConfiguration.address().isEmpty() ||
                    (remoteConfiguration.login() == null) || remoteConfiguration.login().isEmpty() ||
                    (passKey == null) || passKey.isEmpty() ||
                    (configuration.remoteModuleDirPath() == null) || configuration.remoteModuleDirPath().isEmpty());
        } catch (PasswordSafeException pse) {
            MOEToolWindow.getInstance(configuration.getProject()).log(pse.getMessage());
        } finally {
            try {
                PasswordEntry.fillString(passKey, PasswordEntry.charToFill);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return retVal;
    }*/

    private <T extends RunConfiguration> boolean checkBaseConfig(T configuration) {
        /*if (configuration instanceof MOERunConfigurationRemote) {
            return checkRemoteConfig((MOERunConfigurationRemote) configuration);
        }*/
        return false;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    protected class ConfigComboItem {
        protected RunConfiguration runConfiguraion;

        public ConfigComboItem(RunConfiguration config) {
            runConfiguraion = config;
        }

        public String toString() {
            return runConfiguraion.getName();
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
