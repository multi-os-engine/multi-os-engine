/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.options;

import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SigningOptions {
    private static final Logger LOG = Logging.getLogger(SigningOptions.class);

    /**
     * Default development team ID. This will be used if 'developmentTeam' was not explicitly set.
     */
    @Nullable
    private String defaultDevelopmentTeam;

    public SigningOptions() {
        final Properties props = new Properties();
        try {
            props.load(new FileInputStream(MoeSDK.USER_MOE_HOME.resolve("default.properties").toFile()));
            defaultDevelopmentTeam = props.getProperty("developmentTeam");
        } catch (FileNotFoundException ignore) {
            // This is ok, don't fail, don't log
        } catch (IOException e) {
            // Some other error occurred, print but don't fail
            LOG.warn("Failed to read 'default.properties' file", e);
        }
    }

    /**
     * Path to the provisioning profile.
     */
    @Nullable
    private String provisioningProfile;

    @Nullable
    public String getProvisioningProfile() {
        return provisioningProfile;
    }

    @IgnoreUnused
    public void setProvisioningProfile(@Nullable String provisioningProfile) {
        this.provisioningProfile = provisioningProfile;
    }

    /**
     * Name of the provisioning profile (Xcode 8).
     */
    @Nullable
    private String provisioningProfileSpecifier;

    @Nullable
    public String getProvisioningProfileSpecifier() {
        return provisioningProfileSpecifier;
    }

    @IgnoreUnused
    public void setProvisioningProfileSpecifier(@Nullable String provisioningProfileSpecifier) {
        this.provisioningProfileSpecifier = provisioningProfileSpecifier;
    }

    /**
     * Name of the signing identity.
     */
    @Nullable
    private String signingIdentity;

    @Nullable
    public String getSigningIdentity() {
        return signingIdentity;
    }

    @IgnoreUnused
    public void setSigningIdentity(@Nullable String signingIdentity) {
        this.signingIdentity = signingIdentity;
    }

    /**
     * Development team ID.
     */
    @Nullable
    private String developmentTeam;

    @Nullable
    public String getDevelopmentTeam() {
        return developmentTeam == null ? defaultDevelopmentTeam : developmentTeam;
    }

    public boolean usesDefaultDevelopmentTeam() {
        return developmentTeam == null;
    }

    @IgnoreUnused
    public void setDevelopmentTeam(String developmentTeam) {
        this.developmentTeam = developmentTeam;
    }

    /**
     * Name of the provisioning profile.
     */
    @Nullable
    private String provisioningProfileName;

    public String getProvisioningProfileName() {
        return provisioningProfileName;
    }

    @IgnoreUnused
    public void setProvisioningProfileName(@Nullable String provisioningProfileName) {
        this.provisioningProfileName = provisioningProfileName;
    }
}
