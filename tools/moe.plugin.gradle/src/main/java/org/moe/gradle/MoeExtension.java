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
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.*;
import org.moe.gradle.utils.Require;

import java.io.File;

public class MoeExtension extends AbstractMoeExtension {

    private static final Logger LOG = Logging.getLogger(MoeExtension.class);

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
    public final NativeImageOptions nativeImage;

    @NotNull
    private MoePlatform platform = MoePlatform.IOS;

    @NotNull
    public final ProGuardOptions proguard;

    @Nullable
    private String mainClassName = "org.moe.IOSLauncher";

    public MoeExtension(@NotNull MoePlugin plugin, @NotNull Instantiator instantiator) {
        super(plugin, instantiator);
        this.packaging = instantiator.newInstance(PackagingOptions.class);
        this.resources = instantiator.newInstance(ResourceOptions.class);
        this.xcode = instantiator.newInstance(XcodeOptions.class);
        this.signing = instantiator.newInstance(SigningOptions.class);
        this.actionsAndOutlets = instantiator.newInstance(UIActionsAndOutletsOptions.class);
        this.ipaExport = instantiator.newInstance(IpaExportOptions.class);
        this.remoteBuildOptions = instantiator.newInstance(RemoteBuildOptions.class);
        this.proguard = instantiator.newInstance(ProGuardOptions.class);
        this.nativeImage = instantiator.newInstance(NativeImageOptions.class);
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

    @IgnoreUnused
    public void proguard(Action<ProGuardOptions> action) {
        Require.nonNull(action).execute(proguard);
    }

    @IgnoreUnused
    public void nativeImage(Action<NativeImageOptions> action) {
        Require.nonNull(action).execute(nativeImage);
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
    @Deprecated
    public String getProguardLevel() {
        LOG.warn("The 'getProguardLevel' is deprecated, please use 'proguard.level' instead!");
        return proguard.getLevel();
    }

    @IgnoreUnused
    @Deprecated
    public void setProguardLevel(@NotNull String proguardLevel) {
        LOG.warn("The 'setProguardLevel' is deprecated, please use 'proguard.level' instead!");
        proguard.setLevel(proguardLevel);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public File getPlatformJar() {
        return plugin.getSDK().getPlatformJar(platform);
    }

    @IgnoreUnused
    @Nullable
    public String getMainClassName() {
        return mainClassName;
    }

    @IgnoreUnused
    public void setMainClassName(@Nullable String mainClassName) {
        this.mainClassName = mainClassName;
    }

}
