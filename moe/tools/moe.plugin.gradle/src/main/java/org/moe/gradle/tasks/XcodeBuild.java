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

package org.moe.gradle.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.compile.JavaCompile;
import org.moe.common.developer.ProvisioningProfile;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObject;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.document.pbxproj.XCBuildConfiguration;
import org.moe.document.pbxproj.XCConfigurationList;
import org.moe.document.pbxproj.nextstep.Dictionary.Field;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlatform;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class XcodeBuild extends AbstractBaseTask {

    private static final String CONVENTION_TARGET = "target";
    private static final String CONVENTION_CONFIGURATION = "configuration";
    private static final String CONVENTION_SDK = "sdk";
    private static final String CONVENTION_XCODE_PROJECT_FILE = "xcodeProjectFile";
    private static final String CONVENTION_ADDITIONAL_PARAMETERS = "additionalParameters";
    private static final String CONVENTION_PROVISIONING_PROFILE = "provisioningProfile";
    private static final String CONVENTION_SIGNING_IDENTITY = "signingIdentity";
    private static final String CONVENTION_DEVELOPMENT_TEAM = "developmentTeam";
    private static final String CONVENTION_XCODE_BUILD_ROOT = "xcodeBuildRoot";
    private static final String CONVENTION_XCODE_BUILD_SETTINGS_FILE = "xcodeBuildSettingsFile";

    @Nullable
    private SourceSet sourceSet;

    @NotNull
    public SourceSet getSourceSet() {
        return Require.nonNull(sourceSet);
    }

    private @Nullable Mode mode;

    @NotNull
    public Mode getMode() {
        return Require.nonNull(mode);
    }

    private @Nullable MoePlatform platform;

    @NotNull
    public MoePlatform getPlatform() {
        return Require.nonNull(platform);
    }

    @NotNull
    private final String xcodeBuildTaskDate = new Date().toString();

    @Input
    @NotNull
    @IgnoreUnused
    public String getXcodeBuildTaskDate() {
        // NOTE: never allow Gradle to skip this task due to incremental build!!!
        return xcodeBuildTaskDate;
    }

    @Nullable
    private String target;

    @Input
    @NotNull
    public String getTarget() {
        return getOrConvention(target, CONVENTION_TARGET);
    }

    @IgnoreUnused
    public void setTarget(@Nullable String target) {
        this.target = target;
    }

    @Nullable
    private String configuration;

    @Input
    @NotNull
    public String getConfiguration() {
        return getOrConvention(configuration, CONVENTION_CONFIGURATION);
    }

    @IgnoreUnused
    public void setConfiguration(@Nullable String configuration) {
        this.configuration = configuration;
    }

    @Nullable
    private String sdk;

    @Input
    @NotNull
    public String getSdk() {
        return getOrConvention(sdk, CONVENTION_SDK);
    }

    public void setSdk(@Nullable String sdk) {
        this.sdk = sdk;
    }

    @Nullable
    private Object xcodeProjectFile;

    @InputDirectory
    @NotNull
    public File getXcodeProjectFile() {
        return getProject().file(getOrConvention(xcodeProjectFile, CONVENTION_XCODE_PROJECT_FILE));
    }

    @IgnoreUnused
    public void setXcodeProjectFile(@Nullable Object xcodeProjectFile) {
        this.xcodeProjectFile = xcodeProjectFile;
    }

    @Nullable
    private List<String> additionalParameters;

    @Input
    @NotNull
    public List<String> getAdditionalParameters() {
        return getOrConvention(additionalParameters, CONVENTION_ADDITIONAL_PARAMETERS);
    }

    @IgnoreUnused
    public void setAdditionalParameters(@NotNull List<String> additionalParameters) {
        this.additionalParameters = additionalParameters == null ? null : new ArrayList<>(additionalParameters);
    }

    @Nullable
    private String provisioningProfile;

    @Input
    @Optional
    @Nullable
    public String getProvisioningProfile() {
        return nullableGetOrConvention(provisioningProfile, CONVENTION_PROVISIONING_PROFILE);
    }

    @IgnoreUnused
    public void setProvisioningProfile(@Nullable String provisioningProfile) {
        this.provisioningProfile = provisioningProfile;
    }

    @Nullable
    private String signingIdentity;

    @Input
    @Optional
    @Nullable
    public String getSigningIdentity() {
        return nullableGetOrConvention(signingIdentity, CONVENTION_SIGNING_IDENTITY);
    }

    @IgnoreUnused
    public void setSigningIdentity(@Nullable String signingIdentity) {
        this.signingIdentity = signingIdentity;
    }

    @Nullable
    private String developmentTeam;

    @Input
    @Optional
    @Nullable
    public String getDevelopmentTeam() {
        return nullableGetOrConvention(developmentTeam, CONVENTION_DEVELOPMENT_TEAM);
    }

    @IgnoreUnused
    public void setDevelopmentTeam(@Nullable String developmentTeam) {
        this.developmentTeam = developmentTeam;
    }

    @Nullable
    private Object xcodeBuildRoot;

    @Input
    @NotNull
    public File getXcodeBuildRoot() {
        return getProject().file(getOrConvention(xcodeBuildRoot, CONVENTION_XCODE_BUILD_ROOT));
    }

    @IgnoreUnused
    public void setXcodeBuildRoot(@Nullable Object xcodeBuildRoot) {
        this.xcodeBuildRoot = xcodeBuildRoot;
    }

    @NotNull
    public File getConfigurationBuildDir() {
        if (getPlatform().mainPlatformsHasSimulatorPair()) {
            return new File(getXcodeBuildRoot(), mode.getXcodeCompatibleName() + "-" + getPlatform().platformName);
        } else {
            return new File(getXcodeBuildRoot(), mode.getXcodeCompatibleName());
        }
    }

    @Nullable
    private Object xcodeBuildSettingsFile;

    @OutputFile
    @NotNull
    public File getXcodeBuildSettingsFile() {
        return getProject().file(getOrConvention(xcodeBuildSettingsFile, CONVENTION_XCODE_BUILD_SETTINGS_FILE));
    }

    @IgnoreUnused
    public void setXcodeBuildSettingsFile(@Nullable Object xcodeBuildSettingsFile) {
        this.xcodeBuildSettingsFile = xcodeBuildSettingsFile;
    }

    private Map<String, String> xcodeBuildSettings;

    @NotNull
    public Map<String, String> getXcodeBuildSettings() {
        if (xcodeBuildSettings == null && getState().getSkipped()) {
            this.xcodeBuildSettings = getCachedXcodeBuildSettings();
        }
        return Require.nonNull(xcodeBuildSettings);
    }

    @NotNull
    public Map<String, String> getCachedXcodeBuildSettings() {
        Properties xcodeBuildSettingsP = new Properties();
        try {
            xcodeBuildSettingsP.load(new FileInputStream(getXcodeBuildSettingsFile()));
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
        Map<String, String> xcodeBuildSettings = new HashMap<>();
        xcodeBuildSettingsP.forEach((k, v) -> xcodeBuildSettings.put((String) k, (String) v));
        return xcodeBuildSettings;
    }

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            remoteServer.unlockRemoteKeychain();

            // Upload project
            final FileList list = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());

            // Collect files we don't want to upload
            final Set<File> excludes = new HashSet<>();

            // Exclude some special paths
            excludes.add(new File(getProject().getBuildDir(), "tmp"));
            excludes.add(new File(getProject().getRootDir(), ".gradle"));
            excludes.add(new File(getProject().getRootDir(), ".idea"));

            // Exclude files from dependencies
            for (XcodeProvider xcodeProvider : getXcodeProviderTaskDeps()) {
                excludes.add(xcodeProvider.getLogFile());
                excludes.add(resolvePathInBuildDir(xcodeProvider.getOutRoot()));

                final Dex2Oat dex2OatTask = xcodeProvider.getDex2OatTaskDep();
                excludes.add(dex2OatTask.getLogFile());

                final Dex dexTask = dex2OatTask.getDexTaskDep();
                excludes.add(dexTask.getDestJar());
                excludes.add(dexTask.getLogFile());

                final Retrolambda retrolambdaTask = dexTask.getRetrolambdaTaskDep();
                excludes.add(retrolambdaTask.getExpandedClassesDir());
                excludes.add(retrolambdaTask.getOutputDir());
                excludes.add(retrolambdaTask.getLogFile());

                final ProGuard proGuardTask = retrolambdaTask.getProGuardTaskDep();
                excludes.add(proGuardTask.getOutJar());
                excludes.add(proGuardTask.getComposedCfgFile());
                excludes.add(proGuardTask.getLogFile());

                final JavaCompile classesTask = proGuardTask.getJavaCompileTaskDep();
                if (classesTask != null) {
                    excludes.add(classesTask.getDestinationDir());
                }

                final StartupProvider startupProviderTask = xcodeProvider.getStartupProviderTaskDep();
                excludes.add(startupProviderTask.getLogFile());
            }

            // Exclude files from "self"
            excludes.add(getLogFile());
            excludes.add(getXcodeBuildRoot());
            excludes.add(getLocalSDKLink().toFile());

            // TODO: exclude IPA

            list.add(getProject().getProjectDir(), excludes);
            remoteServer.upload("project files", list);

            linkSDK();

            final Path configurationBuildDirRel;
            try {
                configurationBuildDirRel = getInnerProjectRelativePath(getConfigurationBuildDir());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            remoteServer.exec("xcodebuild", "xcrun --find xcodebuild && " +
                    "xcrun xcodebuild " + calculateArgs().stream().collect(Collectors.joining(" ")));

            final String xcodeBuildSettingsRaw = remoteServer.exec("xcodebuild build settings", "" +
                    "xcrun xcodebuild -showBuildSettings " + calculateArgs().stream().collect(Collectors.joining(" ")));
            Map<String, String> xcodeBuildSettingsRemote = processXcodeBuildSettings(xcodeBuildSettingsRaw);
            Map<String, String> xcodeBuildSettings = new HashMap<>(xcodeBuildSettingsRemote);
            final String buildDir = remoteServer.getBuildDir().getPath();
            for (Map.Entry<String, String> entry : xcodeBuildSettings.entrySet()) {
                final String value = entry.getValue();
                if (!value.contains(buildDir)) {
                    continue;
                }
                final List<String> paths = Arrays.asList(value.split(Pattern.quote(":")));
                entry.setValue(paths.stream().map(path -> {
                    if (!path.startsWith(buildDir)) {
                        return path;
                    }
                    path = path.substring(buildDir.length());
                    if (!buildDir.endsWith("/") && path.startsWith("/")) {
                        path = path.substring(1);
                    }
                    return getProject().file(path).getAbsolutePath();
                }).collect(Collectors.joining(File.pathSeparator)));
            }

            remoteServer.downloadDirectory("products", remoteServer.getRemotePath(configurationBuildDirRel), getConfigurationBuildDir().getParentFile());

            this.xcodeBuildSettings = xcodeBuildSettings;

        } else {
            linkSDK();

            exec(spec -> {
                // Set executable
                spec.setExecutable("xcrun");
                spec.args("xcodebuild");

                // Set options
                spec.args(calculateArgs());
            });

            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            exec(spec -> {
                spec.setExecutable("xcrun");
                spec.args("xcodebuild", "-showBuildSettings");
                spec.args(calculateArgs());

                spec.setStandardOutput(baos);
            });
            xcodeBuildSettings = processXcodeBuildSettings(baos.toString());
        }

        try {
            final Properties properties = new Properties();
            xcodeBuildSettings.forEach(properties::put);
            properties.store(new FileOutputStream(getXcodeBuildSettingsFile()), null);
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
    }

    private Map<String, String> processXcodeBuildSettings(String output) {
        final List<String> buildSettingsLines = Arrays.asList(output.trim().split("\\n"));
        final Map<String, String> xcodeBuildSettings = new HashMap<>();
        for (String line : buildSettingsLines) {
            if (line.startsWith("    ")) {
                final int sep = line.indexOf(" = ");
                if (sep == -1) {
                    continue;
                }
                xcodeBuildSettings.put(line.substring(0, sep).trim(), line.substring(sep + 3));
            }
        }
        return xcodeBuildSettings;
    }

    private List<String> calculateArgs() {
        final String PROVISIONING_PROFILE;
        final String provisioningProfile = getProvisioningProfile();
        if (provisioningProfile != null && !provisioningProfile.isEmpty()) {
            String uuid;
            File fileProvisioningProfile = new File(provisioningProfile);
            if (fileProvisioningProfile.exists()) {
                try {
                    uuid = ProvisioningProfile.getUUIDFromProfile(fileProvisioningProfile);
                } catch (Exception e) {
                    throw new GradleException(e.getMessage(), e);
                }
                PROVISIONING_PROFILE = uuid;
            } else {
                throw new GradleException("Failed to find provisioning profile: " + provisioningProfile);
            }
        } else {
            PROVISIONING_PROFILE = null;
            getProject().getLogger().info("Provisioning profile is not specified! Default one will be chosen!");
        }

        final String CODE_SIGN_IDENTITY;
        final String signingIdentity = getSigningIdentity();
        if (signingIdentity != null && !signingIdentity.isEmpty()) {
            CODE_SIGN_IDENTITY = signingIdentity;
        } else {
            CODE_SIGN_IDENTITY = null;
            getProject().getLogger().info("Signing identity is not specified! Default one will be chosen!");
        }

        final String DEVELOPMENT_TEAM;
        final String developmentTeam = getDevelopmentTeam();
        if (developmentTeam != null && !developmentTeam.isEmpty()) {
            DEVELOPMENT_TEAM = developmentTeam;
        } else {
            DEVELOPMENT_TEAM = null;
            getProject().getLogger().info("Development team is not specified! Default one will be chosen!");
        }

        final List<String> args = new ArrayList<>();
        final Server remoteServer = getMoePlugin().getRemoteServer();

        args.add("-target");
        args.add(getTarget());

        args.add("-configuration");
        args.add(getConfiguration());

        args.add("-sdk");
        args.add(getSdk());

        args.add("-project");

        final String _xcodeProjectFile;
        final String _xcodeBuildRoot;
        final String _configurationBuildDir;

        if (remoteServer != null) {
            final Path xcodeProjectFileRel;
            final Path xcodeBuildRootRel;
            final Path configurationBuildDirRel;
            try {
                xcodeProjectFileRel = getInnerProjectRelativePath(getXcodeProjectFile());
                xcodeBuildRootRel = getInnerProjectRelativePath(getXcodeBuildRoot());
                configurationBuildDirRel = getInnerProjectRelativePath(getConfigurationBuildDir());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            _xcodeProjectFile = remoteServer.getRemotePath(xcodeProjectFileRel);
            _xcodeBuildRoot = remoteServer.getRemotePath(xcodeBuildRootRel);
            _configurationBuildDir = remoteServer.getRemotePath(configurationBuildDirRel);

        } else {
            _xcodeProjectFile = getXcodeProjectFile().getAbsolutePath();
            _xcodeBuildRoot = getXcodeBuildRoot().getAbsolutePath();
            _configurationBuildDir = getConfigurationBuildDir().getAbsolutePath();
        }

        args.add(_xcodeProjectFile);

        args.addAll(getAdditionalParameters());

        args.add("CONFIGURATION_BUILD_DIR=" + _configurationBuildDir);
        args.add("DSTROOT=" + _xcodeBuildRoot + "/dst");
        args.add("OBJROOT=" + _xcodeBuildRoot + "/obj");
        args.add("SYMROOT=" + _xcodeBuildRoot + "/sym");
        args.add("SHARED_PRECOMPS_DIR=" + _xcodeBuildRoot + "/shared_precomps");
        if (PROVISIONING_PROFILE != null) {
            args.add("PROVISIONING_PROFILE=" + PROVISIONING_PROFILE);
        }
        if (CODE_SIGN_IDENTITY != null) {
            args.add("CODE_SIGN_IDENTITY=" + CODE_SIGN_IDENTITY);
        }
        if (DEVELOPMENT_TEAM != null) {
            args.add("DEVELOPMENT_TEAM=" + DEVELOPMENT_TEAM);
        }

        return args;
    }

    private List<XcodeProvider> xcodeProviderTaskDeps;

    @NotNull
    public List<XcodeProvider> getXcodeProviderTaskDeps() {
        return Collections.unmodifiableList(Require.nonNull(xcodeProviderTaskDeps));
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet, @NotNull Mode mode, @NotNull MoePlatform platform) {
        Require.nonNull(sourceSet);
        Require.nonNull(mode);
        Require.nonNull(platform);

        this.sourceSet = sourceSet;
        this.mode = mode;
        this.platform = platform;

        setSupportsRemoteBuild(true);

        final MoeExtension ext = getMoeExtension();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, "xcodebuild");

        // Create task
        setDescription("Builds .app files (sourceset: " + sourceSet.getName() + ", mode: " + mode.name +
                ", platform: " + platform.platformName + ").");

        // Add dependencies
        final ArrayList<XcodeProvider> xcodeProviderTasks = new ArrayList<>();
        platform.archs.forEach(arch -> {
            final XcodeProvider xcodeProvider = getMoePlugin().getTaskBy(XcodeProvider.class, sourceSet, mode, arch, platform);
            xcodeProviderTasks.add(xcodeProvider);
            dependsOn(xcodeProvider);
        });
        xcodeProviderTaskDeps = xcodeProviderTasks;

        // Update convention mapping
        addConvention(CONVENTION_TARGET, () -> {
            String targetName;
            if (SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName())) {
                targetName = ext.xcode.getMainTarget();
            } else {
                targetName = ext.xcode.getTestTarget();
            }
            return targetName;
        });
        addConvention(CONVENTION_CONFIGURATION, mode::getXcodeCompatibleName);
        addConvention(CONVENTION_SDK, () -> platform.platformName);
        addConvention(CONVENTION_XCODE_PROJECT_FILE, () ->
                resolvePathRelativeToRoot(getProject().file(ext.xcode.getProject())));
        addConvention(CONVENTION_XCODE_BUILD_ROOT, () -> resolvePathInBuildDir(out));
        addConvention(CONVENTION_ADDITIONAL_PARAMETERS, () ->
                new ArrayList<>(Arrays.asList("MOE_GRADLE_EXTERNAL_BUILD=YES", "ONLY_ACTIVE_ARCH=NO")));
        addConvention(CONVENTION_PROVISIONING_PROFILE, ext.signing::getProvisioningProfile);
        addConvention(CONVENTION_SIGNING_IDENTITY, ext.signing::getSigningIdentity);
        addConvention(CONVENTION_DEVELOPMENT_TEAM, () -> {
            if (!xcodeprojDevelopmentTeamIsSet() || !ext.signing.usesDefaultDevelopmentTeam()) {
                return ext.signing.getDevelopmentTeam();
            } else {
                return null;
            }
        });
        addConvention(CONVENTION_XCODE_BUILD_SETTINGS_FILE, () -> resolvePathInBuildDir(out, "XcodeBuild-" +
                sourceSet.getName() + "-" + mode.name + "-" + platform.platformName + ".properties"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "XcodeBuild-" + sourceSet.getName() + "-" +
                mode.name + "-" + platform.platformName + ".log"));
    }

    private boolean xcodeprojDevelopmentTeamIsSet() {
        try {
            // Open Xcode project
            @NotNull File xcodeproj = getXcodeProjectFile();
            final ProjectFile project = new ProjectFile(xcodeproj);

            // Search for target with name
            Field<PBXObjectRef<? extends PBXObject>, PBXObject> nTargetField = project.getRoot().getObjects().findFirst(
                    field -> field.value instanceof PBXNativeTarget && ((PBXNativeTarget)field.key.getReferenced())
                            .getName().equals(target));
            Require.nonNull(nTargetField,
                    "Target with name '" + target + "' doesn't exist in Xcode project at " + xcodeproj
                            .getAbsolutePath());
            PBXNativeTarget nTarget = (PBXNativeTarget)nTargetField.value;

            // Search for build configuration with name
            XCConfigurationList xcConfigurationList = nTarget.getBuildConfigurationList().getReferenced();
            for (PBXObjectRef<XCBuildConfiguration> ref : xcConfigurationList.getOrCreateBuildConfigurations()) {
                XCBuildConfiguration xcBuildConfiguration = ref.getReferenced();
                if (xcBuildConfiguration.getName().equals(getMode().getXcodeCompatibleName())) {
                    return xcBuildConfiguration.getValue("DEVELOPMENT_TEAM") != null;
                }
            }
        } catch (Throwable t) {
            return false;
        }
        return false;
    }
}
