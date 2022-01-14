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
import org.moe.gradle.options.*;
import org.moe.gradle.utils.Require;

import java.io.File;

public class MoeExtension extends AbstractMoeExtension {

    public static final int PROGUARD_LEVEL_APP = 0;
    public static final int PROGUARD_LEVEL_PLATFORM = 1;
    public static final int PROGUARD_LEVEL_ALL = 2;

    private static final String PROGUARD_LEVEL_APP_STRING = "app";
    private static final String PROGUARD_LEVEL_PLATFORM_STRING = "platform";
    private static final String PROGUARD_LEVEL_ALL_STRING = "all";

    @NotNull
    public final PackagingOptions packaging;

    @NotNull
    public final ResourceOptions resources;

    @NotNull
    public final XcodeOptions xcode;

    @NotNull
    public final SigningOptions signing;

    @NotNull
    public final UIActionsAndOutletsOptions actionsAndOutlets;

    @NotNull
    public final IpaExportOptions ipaExport;

    @NotNull
    public final RemoteBuildOptions remoteBuildOptions;

    @NotNull
    private MoePlatform platform = MoePlatform.IOS;

    private int proguardLevel = PROGUARD_LEVEL_APP;

    public MoeExtension(@NotNull MoePlugin plugin, @NotNull Instantiator instantiator) {
        super(plugin, instantiator);
        this.packaging = instantiator.newInstance(PackagingOptions.class);
        this.resources = instantiator.newInstance(ResourceOptions.class);
        this.xcode = instantiator.newInstance(XcodeOptions.class);
        this.signing = instantiator.newInstance(SigningOptions.class);
        this.actionsAndOutlets = instantiator.newInstance(UIActionsAndOutletsOptions.class);
        this.ipaExport = instantiator.newInstance(IpaExportOptions.class);
        this.remoteBuildOptions = instantiator.newInstance(RemoteBuildOptions.class);
    }

    void setup() {}

    @IgnoreUnused
    public void packaging(Action<PackagingOptions> action) {
        Require.nonNull(action).execute(packaging);
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
    public void signing(Action<SigningOptions> action) {
        Require.nonNull(action).execute(signing);
    }

    @IgnoreUnused
    public void actionsAndOutlets(Action<UIActionsAndOutletsOptions> action) {
        Require.nonNull(action).execute(actionsAndOutlets);
    }

    @IgnoreUnused
    public void ipaExport(Action<IpaExportOptions> action) {
        Require.nonNull(action).execute(ipaExport);
    }

    @IgnoreUnused
    public void remoteBuild(Action<RemoteBuildOptions> action) {
        Require.nonNull(action).execute(remoteBuildOptions);
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
        switch (proguardLevel) {
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
        return proguardLevel;
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

    @Nullable
    public File getPlatformJar() {
        return plugin.getSDK().getPlatformJar(platform);
    }

    @Nullable
    public File getPlatformDex() {
        return plugin.getSDK().getPlatformDex(platform);
    }
}
