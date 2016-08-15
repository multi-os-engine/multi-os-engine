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

import org.gradle.api.Project;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;

import java.util.ArrayList;
import java.util.List;

public class XcodeOptions {

    private final Project project;

    public XcodeOptions(Project project) {
        this.project = Require.nonNull(project);
    }

    private boolean generateProject = true;

    public boolean isGenerateProject() {
        return generateProject;
    }

    @IgnoreUnused
    public void setGenerateProject(boolean generateProject) {
        this.generateProject = generateProject;
    }

    @Nullable
    private String mainTarget;

    @NotNull
    public String getMainTarget() {
        return mainTarget == null ? project.getName() : mainTarget;
    }

    @IgnoreUnused
    public void setMainTarget(@Nullable String mainTarget) {
        this.mainTarget = mainTarget;
    }

    @Nullable
    private String testTarget;

    @NotNull
    public String getTestTarget() {
        return testTarget == null ? getMainTarget() + "-Test" : testTarget;
    }

    @IgnoreUnused
    public void setTestTarget(@Nullable String testTarget) {
        this.testTarget = testTarget;
    }

    @Nullable
    private String mainProductName;

    @Nullable
    public String getMainProductName() {
        if (mainProductName == null) {
            return mainTarget;
        }
        return mainProductName;
    }

    @IgnoreUnused
    public void setMainProductName(@Nullable String mainProductName) {
        this.mainProductName = mainProductName;
    }

    /*
    @Nullable
    private String testProductName;

    @Nullable
    public String getTestProductName() {
        if (testProductName == null) {
            return testTarget;
        }
        return testProductName;
    }

    @IgnoreUnused
    public void setTestProductName(@Nullable String testProductName) {
        this.testProductName = testProductName;
    }
    */

    @Nullable
    private String mainUIStoryboardPath;

    @Nullable
    public String getMainUIStoryboardPath() {
        return mainUIStoryboardPath;
    }

    @IgnoreUnused
    public void setMainUIStoryboardPath(@Nullable String mainUIStoryboardPath) {
        this.mainUIStoryboardPath = mainUIStoryboardPath;
    }

    @Nullable
    private String launchScreenFilePath;

    @Nullable
    public String getLaunchScreenFilePath() {
        return launchScreenFilePath;
    }

    @IgnoreUnused
    public void setLaunchScreenFilePath(@Nullable String launchScreenFilePath) {
        this.launchScreenFilePath = launchScreenFilePath;
    }

    @Nullable
    private String launchImagesSource;

    @Nullable
    public String getLaunchImagesSource() {
        return launchImagesSource;
    }

    @IgnoreUnused
    public void setLaunchImagesSource(@Nullable String launchImagesSource) {
        this.launchImagesSource = launchImagesSource;
    }

    @Nullable
    private String locationWhenInUseUsageDescription;

    @Nullable
    public String getLocationWhenInUseUsageDescription() {
        return locationWhenInUseUsageDescription;
    }

    @IgnoreUnused
    public void setLocationWhenInUseUsageDescription(@Nullable String locationWhenInUseUsageDescription) {
        this.locationWhenInUseUsageDescription = locationWhenInUseUsageDescription;
    }

    @Nullable
    private String appIconsSource;

    @Nullable
    public String getAppIconsSource() {
        return appIconsSource;
    }

    @IgnoreUnused
    public void setAppIconsSource(@Nullable String appIconsSource) {
        this.appIconsSource = appIconsSource;
    }

    @NotNull
    private String organizationName = "My Company";

    @NotNull
    public String getOrganizationName() {
        return organizationName;
    }

    @IgnoreUnused
    public void setOrganizationName(@NotNull String organizationName) {
        this.organizationName = Require.nonNull(organizationName);
    }

    @Nullable
    private String companyIdentifier;

    @Nullable
    public String getCompanyIdentifier() {
        return companyIdentifier;
    }

    @IgnoreUnused
    public void setCompanyIdentifier(@Nullable String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    @Nullable
    private String bundleID;

    @Nullable
    public String getBundleID() {
        return bundleID;
    }

    @IgnoreUnused
    public void setBundleID(@Nullable String bundleID) {
        this.bundleID = bundleID;
    }

    @Nullable
    private String packageName;

    @Nullable
    public String getPackageName() {
        return packageName;
    }

    @IgnoreUnused
    public void setPackageName(@Nullable String packageName) {
        this.packageName = packageName;
    }

    @Nullable
    private String infoPlistPath;

    @Nullable
    public String getInfoPlistPath() {
        return infoPlistPath;
    }

    @IgnoreUnused
    public void setInfoPlistPath(@Nullable String infoPlistPath) {
        this.infoPlistPath = infoPlistPath;
    }

    @Nullable
    private String testInfoPlistPath;

    @Nullable
    public String getTestInfoPlistPath() {
        return testInfoPlistPath;
    }

    @IgnoreUnused
    public void setTestInfoPlistPath(@Nullable String testInfoPlistPath) {
        this.testInfoPlistPath = testInfoPlistPath;
    }

    private boolean applicationExitOnSuspend = false;

    public boolean isApplicationExitOnSuspend() {
        return applicationExitOnSuspend;
    }

    @IgnoreUnused
    public void setApplicationExitOnSuspend(boolean applicationExitOnSuspend) {
        this.applicationExitOnSuspend = applicationExitOnSuspend;
    }

    @Nullable
    private String bundleShortVersionString;

    @Nullable
    public String getBundleShortVersionString() {
        return bundleShortVersionString;
    }

    @IgnoreUnused
    public void setBundleShortVersionString(@Nullable String bundleShortVersionString) {
        this.bundleShortVersionString = bundleShortVersionString;
    }

    @Nullable
    private String bundleVersion;

    @Nullable
    public String getBundleVersion() {
        return bundleVersion;
    }

    @IgnoreUnused
    public void setBundleVersion(@Nullable String bundleVersion) {
        this.bundleVersion = bundleVersion;
    }

    @Nullable
    private String deploymentTarget = "8.0";

    @Nullable
    public String getDeploymentTarget() {
        return deploymentTarget;
    }

    @IgnoreUnused
    public void setDeploymentTarget(@Nullable String deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
    }

    @Nullable
    private String xcodeProjectDirPath;

    @Nullable
    public String getXcodeProjectDirPath() {
        return xcodeProjectDirPath;
    }

    @IgnoreUnused
    public void setXcodeProjectDirPath(@Nullable String xcodeProjectDirPath) {
        this.xcodeProjectDirPath = xcodeProjectDirPath;
    }

    @Nullable
    private List<String> supportedInterfaceOrientations;

    @Nullable
    public List<String> getSupportedInterfaceOrientations() {
        return supportedInterfaceOrientations;
    }

    @IgnoreUnused
    public void setSupportedInterfaceOrientations(@Nullable List<String> orientations) {
        this.supportedInterfaceOrientations = orientations == null ? null : new ArrayList<>(orientations);
    }
}
