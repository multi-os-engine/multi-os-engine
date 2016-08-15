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

package org.moe.gradle;

import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.IpaOptions;
import org.moe.gradle.options.PackagingOptions;
import org.moe.gradle.options.ResourceOptions;
import org.moe.gradle.options.XcodeOptions;
import org.moe.gradle.utils.Require;

import java.io.File;

public class MoeExtension {

    private static final int PROGUARD_LEVEL_INVALID = -1;
    public static final int PROGUARD_LEVEL_APP = 0;
    public static final int PROGUARD_LEVEL_PLATFORM = 1;
    public static final int PROGUARD_LEVEL_ALL = 2;

    private static final String PROGUARD_LEVEL_APP_STRING = "app";
    private static final String PROGUARD_LEVEL_PLATFORM_STRING = "platform";
    private static final String PROGUARD_LEVEL_ALL_STRING = "all";

    private static final String MOE_SDK_TRIM_IOS_PROPERTY = "moe.sdk.trim_ios";
    private static final String MOE_SDK_TRIM_ALL_PROPERTY = "moe.sdk.trim_all";
    private static final String MOE_PROGUARD_LEVEL_PROPERTY = "moe.proguardLevel";
    private static final String MOE_PLATFORM_SKIP_PROPERTY = "moe.platform.skip";

    @NotNull
    public final MoePlugin plugin;

    @NotNull
    public final PackagingOptions packagingOptions;

    @NotNull
    public final ResourceOptions resources;

    @NotNull
    public final XcodeOptions xcode;

    @NotNull
    public final IpaOptions ipaOptions;

    @Nullable
    public String mainClassName;

    @NotNull
    private MoePlatform platform = MoePlatform.IOS;

    private int proguardLevel = PROGUARD_LEVEL_APP;
    private int proguardLevelProperty = PROGUARD_LEVEL_INVALID;

    public MoeExtension(@NotNull MoePlugin plugin, @NotNull Instantiator instantiator) {
        this.plugin = Require.nonNull(plugin);
        Require.nonNull(instantiator);
        this.packagingOptions = instantiator.newInstance(PackagingOptions.class);
        this.resources = instantiator.newInstance(ResourceOptions.class);
        this.xcode = instantiator.newInstance(XcodeOptions.class, plugin.getProject());
        this.ipaOptions = instantiator.newInstance(IpaOptions.class);
    }

    void setup() {
        final Project project = plugin.getProject();
        if (project.hasProperty(MOE_SDK_TRIM_IOS_PROPERTY)) {
            proguardLevelProperty = PROGUARD_LEVEL_PLATFORM;
            project.getLogger().warn("The '" + MOE_SDK_TRIM_IOS_PROPERTY + "' project property will be removed, " +
                    "please use '" + MOE_PROGUARD_LEVEL_PROPERTY + "=" + PROGUARD_LEVEL_PLATFORM_STRING + "' instead!");
        }
        if (project.hasProperty(MOE_SDK_TRIM_ALL_PROPERTY)) {
            proguardLevelProperty = PROGUARD_LEVEL_ALL;
            project.getLogger().warn("The '" + MOE_SDK_TRIM_ALL_PROPERTY + "' project property will be removed, " +
                    "please use '" + MOE_PROGUARD_LEVEL_PROPERTY + "=" + PROGUARD_LEVEL_ALL_STRING + "' instead!");
        }
        if (project.hasProperty(MOE_PROGUARD_LEVEL_PROPERTY)) {
            final String property = (String) project.property(MOE_PROGUARD_LEVEL_PROPERTY);
            try {
                proguardLevelProperty = getProguardLevelForString(property);
            } catch (GradleException ex) {
                throw new GradleException("'" + MOE_PROGUARD_LEVEL_PROPERTY + "' project property can only be set to " +
                        "'" + PROGUARD_LEVEL_APP_STRING + "', " +
                        "'" + PROGUARD_LEVEL_PLATFORM_STRING + "' or " +
                        "'" + PROGUARD_LEVEL_ALL_STRING + "'");
            }
        }
    }

    @IgnoreUnused
    public void packagingOptions(Action<PackagingOptions> action) {
        Require.nonNull(action).execute(packagingOptions);
    }

    @IgnoreUnused
    public void resources(Action<ResourceOptions> action) {
        Require.nonNull(action).execute(resources);
    }

    @IgnoreUnused
    public void xcode(Action<XcodeOptions> action) {
        Require.nonNull(action).execute(xcode);
    }

    @IgnoreUnused
    public void ipaOptions(Action<IpaOptions> action) {
        Require.nonNull(action).execute(ipaOptions);
    }

    @NotNull
    @IgnoreUnused
    // Add this variant of the method so we can access it from Gradle as 'sdk'
    public MoeSDK getSdk() {
        return plugin.getSDK();
    }

    @NotNull
    @IgnoreUnused
    public MoeSDK getSDK() {
        return plugin.getSDK();
    }

    @NotNull
    @IgnoreUnused
    public String getPlatform() {
        return Require.nonNull(platform).displayName;
    }

    @NotNull
    public MoePlatform getPlatformType() {
        return Require.nonNull(platform);
    }

    @IgnoreUnused
    public void setPlatform(@NotNull String platform) {
        this.platform = MoePlatform.getForDisplayName(platform);
    }

    @NotNull
    @IgnoreUnused
    public String getProguardLevel() {
        final int level = proguardLevelProperty == PROGUARD_LEVEL_INVALID ? proguardLevel : proguardLevelProperty;
        switch (level) {
            case PROGUARD_LEVEL_APP:
                return PROGUARD_LEVEL_APP_STRING;
            case PROGUARD_LEVEL_PLATFORM:
                return PROGUARD_LEVEL_PLATFORM_STRING;
            case PROGUARD_LEVEL_ALL:
                return PROGUARD_LEVEL_ALL_STRING;
            default:
                throw new IllegalStateException();
        }
    }

    public int getProguardLevelRaw() {
        return proguardLevelProperty == PROGUARD_LEVEL_INVALID ? proguardLevel : proguardLevelProperty;
    }

    @IgnoreUnused
    public void setProguardLevel(@NotNull String proguardLevel) {
        try {
            this.proguardLevel = getProguardLevelForString(proguardLevel);
        } catch (GradleException ex) {
            throw new GradleException("proguardLevel property can only be set to " +
                    "'" + PROGUARD_LEVEL_APP_STRING + "', " +
                    "'" + PROGUARD_LEVEL_PLATFORM_STRING + "' or " +
                    "'" + PROGUARD_LEVEL_ALL_STRING + "'");
        }
    }

    private int getProguardLevelForString(@NotNull String proguardLevel) {
        if (PROGUARD_LEVEL_APP_STRING.equalsIgnoreCase(proguardLevel)) {
            return PROGUARD_LEVEL_APP;
        } else if (PROGUARD_LEVEL_PLATFORM_STRING.equalsIgnoreCase(proguardLevel)) {
            return PROGUARD_LEVEL_PLATFORM;
        } else if (PROGUARD_LEVEL_ALL_STRING.equalsIgnoreCase(proguardLevel)) {
            return PROGUARD_LEVEL_ALL;
        } else {
            throw new GradleException();
        }
    }

    public boolean skipPlatformSupport() {
        return plugin.getProject().hasProperty(MOE_PLATFORM_SKIP_PROPERTY);
    }

    @Nullable
    public File getPlatformJar() {
        if (skipPlatformSupport()) {
            return null;
        }
        return plugin.getSDK().getPlatformJar(platform);
    }

    @Nullable
    public File getPlatformDex() {
        if (skipPlatformSupport()) {
            return null;
        }
        return plugin.getSDK().getPlatformDex(platform);
    }
}
