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

import org.moe.common.constants.SourceSet;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.common.developer.ProvisioningProfile;
import org.moe.common.developer.SigningIdentity;
import com.intellij.execution.configurations.ConfigurationFactory;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.options.SettingsEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.InvalidDataException;
import com.intellij.openapi.util.JDOMExternalizerUtil;
import com.intellij.openapi.util.WriteExternalException;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;

public class MOERunConfigurationRemote extends MOERunConfigurationBase {
    protected SigningIdentity signingIdentity;
    protected ProvisioningProfile provisioningProfile;
    protected MOERemoteConfiguration remoteConfiguration;

    protected String certificatePath;
    protected String profilePath;

    protected String remoteModuleDirPath;
    protected SourceSet sourceSet;

    public MOERunConfigurationRemote(final Project project, final ConfigurationFactory factory) {
        super(project, factory);

        architecture("armv7,arm64");
        remoteConfiguration = new MOERemoteConfiguration();
        sourceSet = SourceSet.Main;
    }

    @NotNull
    @Override
    public SettingsEditor<? extends RunConfiguration> getConfigurationEditor() {
        return new MOERunConfigurationEditorRemote(this);
    }

    @Override
    public void readExternal(Element element) throws InvalidDataException {
        super.readExternal(element);

        remoteConfiguration.readExternal(element);

        architecture("armv7,arm64");

        try {
            certificatePath = JDOMExternalizerUtil.readField(element, "certificatePath");
            profilePath = JDOMExternalizerUtil.readField(element, "profilePath");
        } catch (Exception e) {}

        remoteModuleDirPath = JDOMExternalizerUtil.readField(element, "remoteModuleDirPath");
    }

    @Override
    public void writeExternal(Element element) throws WriteExternalException {
        super.writeExternal(element);

        remoteConfiguration.writeExternal(element);

        try {
            JDOMExternalizerUtil.writeField(element, "certificatePath",
                    certificatePath);
            JDOMExternalizerUtil.writeField(element, "profilePath",
                    profilePath);
        } catch (Exception e) {}

        JDOMExternalizerUtil.writeField(element, "remoteModuleDirPath", remoteModuleDirPath);
    }

    public MOERemoteConfiguration remoteConfiguration() {
        return remoteConfiguration;
    }

    public void remoteConfiguration(MOERemoteConfiguration remoteConfiguration) {
        this.remoteConfiguration = remoteConfiguration;
    }

    public SigningIdentity getSigningIdentity() {
        return signingIdentity;
    }

    public void setSigningIdentity(SigningIdentity identity) {
        signingIdentity = identity;
    }

    public ProvisioningProfile getProvisioningProfile() {
        return provisioningProfile;
    }

    public void setProvisioningProfile(ProvisioningProfile profile) {
        provisioningProfile = profile;
    }

    public MOERunConfigurationRemote certificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
        return this;
    }

    public String certificatePath() {
        return this.certificatePath;
    }

    public MOERunConfigurationRemote profilePath(String profilePath) {
        this.profilePath = profilePath;
        return this;
    }

    public String profilePath() {
        return this.profilePath;
    }

    public void remoteModuleDirPath(String remoteModuleDirPath) {
        this.remoteModuleDirPath = remoteModuleDirPath;
    }

    public String remoteModuleDirPath() {
        return remoteModuleDirPath;
    }

    public void sourceSet(SourceSet sourceSet) {
        this.sourceSet = sourceSet;
    }

    public SourceSet sourceSet() {
        return sourceSet;
    }
}
