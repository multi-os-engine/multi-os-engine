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

import com.dd.plist.NSDictionary;
import com.dd.plist.NSNumber;
import com.dd.plist.NSObject;
import com.dd.plist.PropertyListParser;
import org.gradle.api.GradleException;
import org.gradle.api.logging.LogLevel;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Internal;
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
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlatform;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.ServerChannelException;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
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
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class XcodeBuild extends AbstractBaseTask {

    private static final Logger LOG = Logging.getLogger(XcodeBuild.class);

    private static final String CONVENTION_TARGET = "target";
    private static final String CONVENTION_SCHEME = "scheme";
    private static final String CONVENTION_CONFIGURATION = "configuration";
    private static final String CONVENTION_SDK = "sdk";
    private static final String CONVENTION_XCODE_PROJECT_FILE = "xcodeProjectFile";
    private static final String CONVENTION_XCODE_WORKSPACE_FILE = "xcodeWorkspaceFile";
    private static final String CONVENTION_ADDITIONAL_PARAMETERS = "additionalParameters";
    private static final String CONVENTION_PROVISIONING_PROFILE = "provisioningProfile";
    private static final String CONVENTION_PROVISIONING_PROFILE_SPECIFIER = "provisioningProfileSpecifier";
    private static final String CONVENTION_SIGNING_IDENTITY = "signingIdentity";
    private static final String CONVENTION_DEVELOPMENT_TEAM = "developmentTeam";
    private static final String CONVENTION_XCODE_BUILD_ROOT = "xcodeBuildRoot";
    private static final String CONVENTION_XCODE_BUILD_SETTINGS_FILE = "xcodeBuildSettingsFile";

    @Nullable
    private SourceSet sourceSet;

    @NotNull
    @Internal
    public SourceSet getSourceSet() {
        return Require.nonNull(sourceSet);
    }

    @Nullable
    private Mode mode;

    @NotNull
    @Internal
    public Mode getMode() {
        return Require.nonNull(mode);
    }

    @Nullable
    private MoePlatform platform;

    @NotNull
    @Internal
    public MoePlatform getPlatform() {
        return Require.nonNull(platform);
    }

    @Nullable
    private Set<Arch> archs;

    @Nullable
    @Internal
    @IgnoreUnused
    public Set<Arch> getArchs() {
        return archs;
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
    private String scheme;

    @Input
    @Optional
    @Nullable
    public String getScheme() {
        return nullableGetOrConvention(scheme, CONVENTION_SCHEME);
    }

    @IgnoreUnused
    public void setScheme(@Nullable String scheme) {
        this.scheme = scheme;
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
    private Object xcodeWorkspaceFile;

    @InputDirectory
    @Optional
    @Nullable
    public File getXcodeWorkspaceFile() {
        final Object object = nullableGetOrConvention(xcodeWorkspaceFile, CONVENTION_XCODE_WORKSPACE_FILE);
        if (object == null) {
            return null;
        }
        return getProject().file(object);
    }

    @IgnoreUnused
    public void setXcodeWorkspaceFile(@Nullable Object xcodeWorkspaceFile) {
        this.xcodeWorkspaceFile = xcodeWorkspaceFile;
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
    private String provisioningProfileSpecifier;

    @Input
    @Optional
    @Nullable
    public String getProvisioningProfileSpecifier() {
        return nullableGetOrConvention(provisioningProfileSpecifier, CONVENTION_PROVISIONING_PROFILE_SPECIFIER);
    }

    @IgnoreUnused
    public void setProvisioningProfileSpecifier(@Nullable String provisioningProfileSpecifier) {
        this.provisioningProfileSpecifier = provisioningProfileSpecifier;
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
    public String getXcodeBuildRoot() {
        return getProject().file(getOrConvention(xcodeBuildRoot, CONVENTION_XCODE_BUILD_ROOT)).getAbsolutePath();
    }

    @IgnoreUnused
    public void setXcodeBuildRoot(@Nullable Object xcodeBuildRoot) {
        this.xcodeBuildRoot = xcodeBuildRoot;
    }

    @NotNull
    @Internal
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

    @Nullable
    private Map<String, String> xcodeBuildSettings;

    @NotNull
    @Internal
    public Map<String, String> getXcodeBuildSettings() {
        if (xcodeBuildSettings == null && getState().getSkipped()) {
            this.xcodeBuildSettings = getCachedXcodeBuildSettings();
        }
        return Require.nonNull(xcodeBuildSettings);
    }

    @Nullable
    @Internal
    public Map<String, String> getNullableXcodeBuildSettings() {
        if (xcodeBuildSettings == null && getState().getSkipped()) {
            this.xcodeBuildSettings = getCachedXcodeBuildSettings();
        }
        return xcodeBuildSettings;
    }

    @NotNull
    @Internal
    public Map<String, String> getCachedXcodeBuildSettings() {
        Properties xcodeBuildSettingsP = new Properties();
        try {
            xcodeBuildSettingsP.load(new FileInputStream(getXcodeBuildSettingsFile()));
        } catch (IOException e) {
            throw new GradleException(e.getMessage(), e);
        }
        Map<String, String> xcodeBuildSettings = new HashMap<>();
        xcodeBuildSettingsP.forEach((k, v) -> xcodeBuildSettings.put((String)k, (String)v));
        return xcodeBuildSettings;
    }

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        if (getXcodeWorkspaceFile() != null && getScheme() == null) {
            String set = SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName()) ? "main" : "test";
            throw new GradleException("Using Xcode workspaces requires schemes! Please set the "
                    + "moe.xcode." + set + "Scheme property");
        }

        String scheme = getScheme();
        if (scheme != null) {
            generateSchemeIfNeeded(scheme);
        }

        final Server remoteServer = getMoePlugin().getRemoteServer();

        final MoeExtension ext = getMoePlugin().getExtension();

        if (remoteServer != null) {
            remoteServer.unlockRemoteKeychain();

            // Upload project
            File projectDir = getProject().getParent() != null ? getProject().getParent().getProjectDir() : getProject().getProjectDir();
            final FileList list = new FileList(projectDir, remoteServer.getBuildDir());

            // Collect files we don't want to upload
            final Set<File> excludes = new HashSet<>();

            // Exclude some special paths
            excludes.add(new File(getProject().getProjectDir(), "moe.remotebuild.properties"));
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

                final ClassValidate classValidateTask = dexTask.getClassValidateTaskDep();
                excludes.add(classValidateTask.getOutputDir());
                excludes.add(classValidateTask.getLogFile());

                final Desugar desugarTask = classValidateTask.getDesugarTaskDep();
                excludes.add(desugarTask.getAppOutJar());
                excludes.add(desugarTask.getRuntimeOutJar());
                excludes.add(desugarTask.getComposedCfgFile());
                excludes.add(desugarTask.getLogFile());

                final ProGuard proGuardTask = desugarTask.getProGuardTaskDep();
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
            excludes.add(new File(getXcodeBuildRoot()));
            excludes.add(getLocalSDKLink().toFile());

            // TODO: exclude IPA

            list.add(getProject().getProjectDir(), excludes);
            remoteServer.upload("project files", list);

            List<File> resources = ext.remoteBuildOptions.getResources();

            if (resources != null && !resources.isEmpty()) {
                uploadResources(remoteServer, projectDir, resources);
            }

            linkSDK();

            final Path configurationBuildDirRel;
            try {
                configurationBuildDirRel = getInnerProjectRelativePath(getConfigurationBuildDir());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            try {
                remoteServer.exec("xcodebuild", "xcrun --find xcodebuild && " +
                        "xcrun xcodebuild " + calculateArgs().stream().collect(Collectors.joining(" ")));
            } catch (GradleException e) {
                if (e.getCause() instanceof ServerChannelException) {
                    String output = ((ServerChannelException) e.getCause()).getOutput();
                    if (output != null && output.contains("MOE.framework: errSecInternalComponent")) {
                        LOG.error("Codesign failed.\nMake sure /usr/bin/codesign can access the private key corresponds to your development certificate.");
                    }
                }
                throw e;
            }

            final String xcodeBuildSettingsRaw = remoteServer.exec("xcodebuild build settings", "" +
                    "xcrun xcodebuild -showBuildSettings " + calculateArgs().stream().collect(Collectors.joining(" ")));
            Map<String, String> xcodeBuildSettingsRemote = processXcodeBuildSettings(xcodeBuildSettingsRaw);
            Map<String, String> xcodeBuildSettings = new HashMap<>(xcodeBuildSettingsRemote);
            boolean isSingle = getProject().getParent() == null;
            String suffix = isSingle ? "" : "/" + getProject().getName();
            final String buildDir = remoteServer.getBuildDir().getPath() + suffix;
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
            if (provisioningProfile
                    .matches("^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$")) {
                PROVISIONING_PROFILE = provisioningProfile;
            } else {
                File fileProvisioningProfile = new File(provisioningProfile);
                if (fileProvisioningProfile.exists()) {
                    try {
                        PROVISIONING_PROFILE = ProvisioningProfile.getUUIDFromProfile(fileProvisioningProfile);
                    } catch (Exception e) {
                        throw new GradleException(e.getMessage(), e);
                    }
                } else {
                    throw new GradleException("Failed to find provisioning profile: " + provisioningProfile);
                }
            }
        } else {
            PROVISIONING_PROFILE = null;
            getProject().getLogger().info("Provisioning profile is not specified! Default one will be chosen!");
        }

        final String PROVISIONING_PROFILE_SPECIFIER;
        final String provisioningProfileSpecifier = getProvisioningProfileSpecifier();
        if (provisioningProfileSpecifier != null && !provisioningProfileSpecifier.isEmpty()) {
            PROVISIONING_PROFILE_SPECIFIER = provisioningProfileSpecifier;
        } else {
            PROVISIONING_PROFILE_SPECIFIER = null;
            getProject().getLogger().info("Provisioning profile specifier is not specified! Default one will be chosen!");
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

        args.add("-configuration");
        args.add(getConfiguration());

        args.add("-sdk");
        args.add(getSdk());

        final String _xcodeProjectFile;
        final String _xcodeWorkspaceFile;
        final String _xcodeBuildRoot;

        if (remoteServer != null) {
            final Path xcodeProjectFileRel;
            final Path xcodeWorkspaceFileRel;
            final Path xcodeBuildRootRel;
            try {
                xcodeProjectFileRel = getInnerProjectRelativePath(getXcodeProjectFile());
                if (getXcodeWorkspaceFile() != null) {
                    xcodeWorkspaceFileRel = getInnerProjectRelativePath(getXcodeWorkspaceFile());
                } else {
                    xcodeWorkspaceFileRel = null;
                }
                xcodeBuildRootRel = getInnerProjectRelativePath(new File(getXcodeBuildRoot()));
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            _xcodeProjectFile = remoteServer.getRemotePath(xcodeProjectFileRel);
            if (xcodeWorkspaceFileRel != null) {
                _xcodeWorkspaceFile = remoteServer.getRemotePath(xcodeWorkspaceFileRel);
            } else {
                _xcodeWorkspaceFile = null;
            }
            _xcodeBuildRoot = remoteServer.getRemotePath(xcodeBuildRootRel);

        } else {
            _xcodeProjectFile = getXcodeProjectFile().getAbsolutePath();
            if (getXcodeWorkspaceFile() != null) {
                _xcodeWorkspaceFile = getXcodeWorkspaceFile().getAbsolutePath();
            } else {
                _xcodeWorkspaceFile = null;
            }
            _xcodeBuildRoot = getXcodeBuildRoot();
        }

        if (_xcodeWorkspaceFile != null) {
            args.add("-workspace");
            args.add(_xcodeWorkspaceFile);

            args.add("-scheme");
            args.add(getScheme());
        } else {
            args.add("-project");
            args.add(_xcodeProjectFile);

            final String scheme = getScheme();
            if (scheme != null) {
                args.add("-scheme");
                args.add(scheme);
            } else {
                args.add("-target");
                args.add(getTarget());
            }
        }

        args.addAll(getAdditionalParameters());

        Set<Arch> archs = getArchs();
        if (archs != null) {
            args.add("ARCHS=" + archs.stream().map(it -> it.name).collect(Collectors.joining(" ")));
        }

        // DO NOT set CONFIGURATION_BUILD_DIR here! This is conflicted with CocoaPods!
        // Instead, set SYMROOT to the build root, since the BUILD_DIR is equals to SYMROOT
        // and CONFIGURATION_BUILD_DIR is derived from it.
        // args.add("CONFIGURATION_BUILD_DIR=" + _configurationBuildDir);
        args.add("SYMROOT=" + _xcodeBuildRoot);
        args.add("DSTROOT=" + _xcodeBuildRoot + "/dst");
        args.add("OBJROOT=" + _xcodeBuildRoot + "/obj");
        args.add("SHARED_PRECOMPS_DIR=" + _xcodeBuildRoot + "/shared_precomps");
        if (PROVISIONING_PROFILE != null) {
            args.add("PROVISIONING_PROFILE=" + PROVISIONING_PROFILE);
        }
        if (PROVISIONING_PROFILE_SPECIFIER != null) {
            args.add("PROVISIONING_PROFILE_SPECIFIER=" + PROVISIONING_PROFILE_SPECIFIER);
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
    @Internal
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
        Set<Arch> buildArchs = new HashSet<>(platform.archs);
        if (getMoePlugin().getArchs() != null) {
            buildArchs.retainAll(getMoePlugin().getArchs());
            archs = buildArchs;
        }
        buildArchs.forEach(arch -> {
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
        addConvention(CONVENTION_SCHEME, () -> {
            String schemeName;
            if (SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName())) {
                schemeName = ext.xcode.getMainScheme();
            } else {
                schemeName = ext.xcode.getTestScheme();
            }
            return schemeName;
        });
        addConvention(CONVENTION_CONFIGURATION, mode::getXcodeCompatibleName);
        addConvention(CONVENTION_SDK, () -> platform.platformName);
        addConvention(CONVENTION_XCODE_PROJECT_FILE, () ->
                resolvePathRelativeToRoot(getProject().file(ext.xcode.getProject())));
        addConvention(CONVENTION_XCODE_WORKSPACE_FILE, () -> {
            final Object workspace = ext.xcode.getWorkspace();
            if (workspace == null) {
                return null;
            }
            return resolvePathRelativeToRoot(getProject().file(workspace));
        });
        addConvention(CONVENTION_XCODE_BUILD_ROOT, () -> resolvePathInBuildDir(out));
        addConvention(CONVENTION_ADDITIONAL_PARAMETERS, () ->
                new ArrayList<>(Arrays.asList("MOE_GRADLE_EXTERNAL_BUILD=YES", "ONLY_ACTIVE_ARCH=NO")));
        addConvention(CONVENTION_PROVISIONING_PROFILE, ext.signing::getProvisioningProfile);
        addConvention(CONVENTION_PROVISIONING_PROFILE_SPECIFIER, ext.signing::getProvisioningProfileSpecifier);
        addConvention(CONVENTION_SIGNING_IDENTITY, ext.signing::getSigningIdentity);
        addConvention(CONVENTION_DEVELOPMENT_TEAM, () -> {
            if (!ext.signing.usesDefaultDevelopmentTeam()) {
                return ext.signing.getDevelopmentTeam();
            } else if (!xcodeprojDevelopmentTeamIsSet()) {
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
            final File xcodeproj = Require.nonNull(getXcodeProjectFile());
            final ProjectFile project = new ProjectFile(xcodeproj);
            final String target = Require.nonNull(getTarget());

            // Search for target with name
            final java.util.Optional<Entry<PBXObjectRef<? extends PBXObject>, PBXObject>> optional = project.getRoot()
                    .getObjects().entrySet().stream()
                    .filter(field -> field.getValue() instanceof PBXNativeTarget && ((PBXNativeTarget)field.getKey()
                            .getReferenced()).getName().equals(target)).findFirst();
            Require.TRUE(optional.isPresent(),
                    "Target with name '" + target + "' doesn't exist in Xcode project at " + xcodeproj
                            .getAbsolutePath());
            PBXNativeTarget nTarget = (PBXNativeTarget)optional.get().getValue();

            // Search for build configuration with name
            XCConfigurationList xcConfigurationList = nTarget.getBuildConfigurationList().getReferenced();
            for (PBXObjectRef<XCBuildConfiguration> ref : xcConfigurationList.getOrCreateBuildConfigurations()) {
                XCBuildConfiguration xcBuildConfiguration = ref.getReferenced();
                if (xcBuildConfiguration.getName().equals(getMode().getXcodeCompatibleName())) {
                    final NextStep developmentTeam = xcBuildConfiguration.getOrCreateBuildSettings().get("DEVELOPMENT_TEAM");
                    if (developmentTeam != null && ((Value)developmentTeam).value.length() != 0) {
                        return true;
                    }
                }
            }

            xcConfigurationList = project.getRoot().getRootObject().getReferenced().getBuildConfigurationList()
                    .getReferenced();
            for (PBXObjectRef<XCBuildConfiguration> ref : xcConfigurationList.getOrCreateBuildConfigurations()) {
                XCBuildConfiguration xcBuildConfiguration = ref.getReferenced();
                if (xcBuildConfiguration.getName().equals(getMode().getXcodeCompatibleName())) {
                    final NextStep developmentTeam = xcBuildConfiguration.getOrCreateBuildSettings().get("DEVELOPMENT_TEAM");
                    if (developmentTeam != null && ((Value)developmentTeam).value.length() != 0) {
                        return true;
                    }
                }
            }
        } catch (Throwable t) {
            getProject().getLogger().log(LogLevel.ERROR, "Failed to read Xcode project file", t);
            return false;
        }
        return false;
    }

    private void generateSchemeIfNeeded(String scheme) {
        try {
            Server remoteServer = getMoePlugin().getRemoteServer();
            String user = remoteServer == null ? System.getProperty("user.name") : remoteServer.getUserName();

            File schemeDir = Paths.get(
                    getXcodeProjectFile().getAbsolutePath(), "xcuserdata",
                    user + ".xcuserdatad", "xcschemes").toFile();

            File shareSchemeDir = Paths.get(
                    getXcodeProjectFile().getAbsolutePath(), "xcshareddata",
                    "xcschemes").toFile();

            File shareSchemeFile = Paths.get(shareSchemeDir.getAbsolutePath(), scheme + ".xcscheme").toFile();

            if (shareSchemeFile.exists()) {
                return;
            }

            if (!schemeDir.exists()) {
                schemeDir.mkdirs();
            }

            ProjectFile proj = new ProjectFile(getXcodeProjectFile());

            // Look for a target with the same name
            Array<PBXObjectRef<PBXNativeTarget>> targets = proj.getRoot().getRootObject().getReferenced().getTargetsOrNull();
            PBXNativeTarget target = null;
            String targetId = null;
            for (PBXObjectRef<PBXNativeTarget> targetRef : targets) {
                PBXNativeTarget targetCandidate = targetRef.getReferenced();

                if (targetCandidate.getName().equals(scheme)) {
                    target = targetCandidate;
                    targetId = targetRef.value;
                    break;
                }
            }
            if (target == null) {
                throw new GradleException("No target exists with the name of " + scheme);
            }

            // Generate xcscheme file
            File schemeFile = Paths.get(schemeDir.getAbsolutePath(), scheme + ".xcscheme").toFile();
            if (!schemeFile.exists()) {
                LOG.quiet("Generate scheme for " + scheme);

                String template;
                {
                    StringBuilder builder = new StringBuilder();
                    InputStream stream = getClass().getResourceAsStream("scheme-template.txt");
                    byte buff[] = new byte[1024];
                    int len;
                    while ((len = stream.read(buff)) > 0) {
                        builder.append(new String(buff, 0, len, StandardCharsets.UTF_8));
                    }
                    template = builder.toString();
                }

                String targetTemplate = "" + template;

                {
                    String localPath = new File(getXcodeProjectFile(), proj.getRoot().getRootObject().getReferenced().getProjectDirPath()).toURI()
                            .relativize(getXcodeProjectFile().toURI()).getPath();
                    if (localPath.isEmpty()) {
                        localPath = getXcodeProjectFile().getName();
                    }
                    targetTemplate = targetTemplate.replace("%%LOCAL_PATH%%", localPath);
                }

                {
                    String product = target.getProductReference().getReferenced().getPath();
                    targetTemplate = targetTemplate.replace("%%PRODUCT%%", product);
                }

                {
                    targetTemplate = targetTemplate.replace("%%TARGET_NAME%%", target.getName());
                }

                {
                    targetTemplate = targetTemplate.replace("%%TARGET_ID%%", targetId);
                }

                PrintWriter writer = new PrintWriter(schemeFile);
                writer.print(targetTemplate);
                writer.close();
            }

            // Register xcscheme in management
            File schemeManagementFile = Paths.get(schemeDir.getAbsolutePath(), "xcschememanagement.plist").toFile();
            if (schemeManagementFile.exists()) {
                LOG.quiet("Generate scheme management for " + scheme);

                boolean modified = false;
                NSDictionary rootDict = (NSDictionary)PropertyListParser.parse(schemeManagementFile);

                NSDictionary schemeUserStateDict = (NSDictionary)rootDict.objectForKey("SchemeUserState");
                NSDictionary schemeDict = (NSDictionary)schemeUserStateDict.objectForKey(target.getName() + ".xcscheme");
                if (schemeDict == null) {
                    int i = 0;

                    for (Map.Entry<String, NSObject> s : schemeUserStateDict.getHashMap().entrySet()) {
                        int v = ((NSNumber)((NSDictionary)s.getValue()).get("orderHint")).intValue();
                        if (v >= i) {
                            i = v + 1;
                        }
                    }

                    schemeDict = new NSDictionary();
                    schemeDict.put("orderHint", i);

                    schemeUserStateDict.put(target.getName() + ".xcscheme", schemeDict);

                    modified = true;
                }

                NSDictionary suppressBuildableAutocreationDict = (NSDictionary)rootDict.objectForKey("SuppressBuildableAutocreation");
                if (suppressBuildableAutocreationDict == null) {
                    suppressBuildableAutocreationDict = new NSDictionary();
                    rootDict.put("SuppressBuildableAutocreation", suppressBuildableAutocreationDict);
                }
                NSDictionary targetDict = (NSDictionary)suppressBuildableAutocreationDict.get(targetId);
                if (targetDict == null) {
                    targetDict = new NSDictionary();
                    targetDict.put("primary", true);

                    suppressBuildableAutocreationDict.put(targetId, targetDict);

                    modified = true;
                }

                if (modified) {
                    PropertyListParser.saveAsXML(rootDict, schemeManagementFile);
                }
            } else {
                LOG.quiet("Extend scheme management for " + scheme);

                NSDictionary rootDict = new NSDictionary();

                NSDictionary schemeUserStateDict = new NSDictionary();//
                rootDict.put("SchemeUserState", schemeUserStateDict);

                NSDictionary schemeDict = new NSDictionary();
                schemeUserStateDict.put(target.getName() + ".xcscheme", schemeDict);

                schemeDict.put("orderHint", 0);

                NSDictionary suppressBuildableAutocreationDict = new NSDictionary();
                rootDict.put("SuppressBuildableAutocreation", suppressBuildableAutocreationDict);

                NSDictionary targetDict = new NSDictionary();
                suppressBuildableAutocreationDict.put(targetId, targetDict);
                targetDict.put("primary", true);

                PropertyListParser.saveAsXML(rootDict, schemeManagementFile);
            }
        } catch (Throwable t) {
            throw new GradleException("Could not generate scheme", t);
        }
    }

    private void uploadResources(Server remoteServer, File projectDir, List<File> resources) {
        final FileList resourceList = new FileList(projectDir, remoteServer.getBuildDir());

        for (File f : resources) {
            resourceList.add(f, null);
        }

        remoteServer.upload("Resources files", resourceList);
    }
}
