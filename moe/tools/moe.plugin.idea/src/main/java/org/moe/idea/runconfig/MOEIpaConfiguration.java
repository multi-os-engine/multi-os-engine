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

package org.moe.idea.runconfig;

import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.components.*;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.Nullable;
import org.moe.common.developer.ProvisioningProfile;
import org.moe.common.developer.SigningIdentity;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import org.moe.idea.utils.ModuleUtils;

@State(
        name = "MOEIpaConfiguration",
        storages = {
                @Storage(file = StoragePathMacros.WORKSPACE_FILE)
        }
)

public class MOEIpaConfiguration implements PersistentStateComponent<MOEIpaConfiguration> {
    public final static Key<MOEIpaConfiguration> IPA_KEY = Key.create("IPA_KEY");
    public final static Key<String> IPA_PATH = Key.create("IPA_PATH");

    private Project project;
    private Module module;
    private SigningIdentity signingIdentity;
    private ProvisioningProfile provisioningProfile;
    private String sdkVersion;

    private RunConfiguration configuration;

    public MOEIpaConfiguration(Project project, Module module, SigningIdentity signingIdentity, ProvisioningProfile provisioningProile) {
        this.project = project;
        this.module = module;

        this.signingIdentity = signingIdentity;
        this.provisioningProfile = provisioningProile;
    }

    public static MOEIpaConfiguration getInstance(final Project project) {
        return ServiceManager.getService(project, MOEIpaConfiguration.class);
    }

    public Module module() {
        return module;
    }

    public SigningIdentity signingIdentity() {
        return signingIdentity;
    }

    public ProvisioningProfile provisioningProfile() {
        return provisioningProfile;
    }

    public String architecture() {
        return "armv7,arm64";
    }

    @Nullable
    @Override
    public MOEIpaConfiguration getState() {
        return this;
    }

    @Override
    public void loadState(MOEIpaConfiguration settings) {
        XmlSerializerUtil.copyBean(settings, this);
    }

    public Project getProject() {
        return project;
    }

    public String modulePath() {
        if (configuration instanceof MOERunConfigurationBase) {
            return ((MOERunConfigurationBase)configuration).modulePath();
        }
        if (module == null) {
            return "";
        }

        return ModuleUtils.getModulePath(module);
    }

    public String configuration() {
        return "Release";
    }

    public String sdkVersion() {
        return sdkVersion;
    }

    public void sdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public String sdkVersionNumber() {
        String version = sdkVersion();

        if (version.contains(" ")) {
            version = version.substring(version.indexOf(" ") + 1);
        }

        return version;
    }

    public RunConfiguration runConfiguration() {
        return configuration;
    }

    public <T extends RunConfiguration> void runConfiguration(T config) {
        configuration = config;
    }
}
