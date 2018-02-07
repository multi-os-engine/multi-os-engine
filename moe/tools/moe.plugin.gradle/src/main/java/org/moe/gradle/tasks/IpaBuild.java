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
import org.gradle.api.logging.LogLevel;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.ExportOptionsPlistManager;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class IpaBuild extends AbstractBaseTask {

    private static final Logger LOG = Logging.getLogger(IpaBuild.class);

    private static final String CONVENTION_INPUT_APP = "inputApp";
    private static final String CONVENTION_OUTPUT_IPA = "outputIpa";
    private static final String CONVENTION_TARGET = "target";
    private static final String CONVENTION_SCHEME = "scheme";
    private static final String CONVENTION_XCODE_PROJECT_FILE = "xcodeProjectFile";
    private static final String CONVENTION_XCODE_WORKSPACE_FILE = "xcodeWorkspaceFile";
    private static final String CONVENTION_EXPORT_METHOD = "exportMethod";
    private static final String CONVENTION_CONFIGURATION = "configuration";
    private static final String CONVENTION_OUTPUT_ARCHIVE = "outputArchive";
    private static final String CONVENTION_DEVELOPMENT_TEAM = "developmentTeam";
    private static final String CONVENTION_ADDITIONAL_PARAMETERS = "additionalParameters";
    private static final String CONVENTION_EXPORT_INFO_PLIST = "exportInfoPlist";
    private static final String CONVENTION_EXPORT_UPLOAD_SYMBOLS = "exportUploadSymbols";
    private static final String CONVENTION_EXPORT_UPLOAD_BITCODE = "exportUploadBitcode";
    private static final String CONVENTION_EXPORT_COMPILE_BITCODE = "exportCompileBitcode";
    private static final String CONVENTION_EXPORT_ICLOUD = "iCloudContainerEnvironment";
    private static final String CONVENTION_EXPORT_DEMAND_RESOURCES_BASE_URL = "onDemandResourcesAssetPacksBaseURL";
    private static final String CONVENTION_EXPORT_DEMAND_RESOURCES_IN_BUNDLE = "embedOnDemandResourcesAssetPacksInBundle";
    private static final String CONVENTION_THINNING = "thinning";
    private static final String CONVENTION_APP_URL = "appURL";
    private static final String CONVENTION_DISPLAY_IMAGE_URL = "displayImageURL";
    private static final String CONVENTION_FULL_SIZE_IMAGE_URL = "fullSizeImageURL";
    private static final String CONVENTION_USER_PLIST_FILE = "userPlistFile";
    private static final String CONVENTION_USER_EXPORT_PLIST = "userExportPlist";
    private static final String CONVENTION_BUNDLE_IDENTIFIER = "bundleIdentifier";
    private static final String CONVENTION_PROVISIONING_PROFILE_SPECIFIER = "provisioningProfileSpecifier";
    private static final String CONVENTION_PROVISIONING_PROFILE = "provisioningProfile";

    public static final String BUNDLE_IDENTIFIER_KEY = "PRODUCT_BUNDLE_IDENTIFIER";

    @Nullable
    private Object inputApp;

    @InputDirectory
    @Optional
    @Nullable
    public File getInputApp() {
        final Object inputApp = nullableGetOrConvention(this.inputApp, CONVENTION_INPUT_APP);
        if (inputApp == null) {
            return null;
        }
        return getProject().file(inputApp);
    }

    @IgnoreUnused
    public void setInputApp(@Nullable Object inputApp) {
        this.inputApp = inputApp;
    }

    @Nullable
    private Object outputIpa;

    @OutputFile
    @NotNull
    public File getOutputIpa() {
        return getProject().file(getOrConvention(outputIpa, CONVENTION_OUTPUT_IPA));
    }

    @IgnoreUnused
    public void setOutputIpa(@Nullable Object outputIpa) {
        this.outputIpa = outputIpa;
    }

    @NotNull
    private final String ipaBuildTaskDate = new Date().toString();

    @Input
    @NotNull
    @IgnoreUnused
    public String getIpaBuildTaskDate() {
        // NOTE: never allow Gradle to skip this task due to incremental build!!!
        return ipaBuildTaskDate;
    }

    @Nullable
    private String bundleIdentifier;

    @Input
    @NotNull
    public String getBundleIdentifier() {
        return nullableGetOrConvention(bundleIdentifier, CONVENTION_BUNDLE_IDENTIFIER);
    }

    @IgnoreUnused
    public void setBundleIdentifier(@Nullable String bundleIdentifier) {
        this.bundleIdentifier = bundleIdentifier;
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
    private String exportMethod;

    @Input
    @Optional
    @Nullable
    public String getExportMethod() {
        return nullableGetOrConvention(exportMethod, CONVENTION_EXPORT_METHOD);
    }

    @IgnoreUnused
    public void setExportMethod(@Nullable String exportMethod) {
        this.exportMethod = exportMethod;
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
    private Object outputArchive;

    @OutputFile
    @NotNull
    public File getOutputArchive() {
        return getProject().file(getOrConvention(outputArchive, CONVENTION_OUTPUT_ARCHIVE));
    }

    @IgnoreUnused
    public void setOutputArchive(@Nullable Object outputArchive) {
        this.outputArchive = outputArchive;
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
    private Object exportOptionsPlist;

    @OutputFile
    @NotNull
    public File getExportOptionsPlist() {
        return getProject().file(getOrConvention(exportOptionsPlist, CONVENTION_EXPORT_INFO_PLIST));
    }

    @IgnoreUnused
    public void setExportOptionsPlist(@Nullable Object exportOptionsPlist) {
        this.exportOptionsPlist = exportOptionsPlist;
    }

    @NotNull
    private boolean userExportPlist;

    @Input
    @NotNull
    public boolean isUserExportPlist() {
        return getOrConvention(userExportPlist, CONVENTION_USER_PLIST_FILE);
    }

    @IgnoreUnused
    public void setUserExportPlist(@Nullable boolean userExportPlist) {
        this.userExportPlist = userExportPlist;
    }

    @NotNull
    private boolean uploadBitcode;

    @Input
    @NotNull
    public boolean getUploadBitcode() {
        return getOrConvention(uploadBitcode, CONVENTION_EXPORT_UPLOAD_BITCODE);
    }

    @IgnoreUnused
    public void setUploadBitcode(@Nullable boolean uploadBitcode) {
        this.uploadBitcode = uploadBitcode;
    }

    @NotNull
    private boolean compileBitCode;

    @Input
    @NotNull
    public boolean getCompileBitcode() {
        return getOrConvention(compileBitCode, CONVENTION_EXPORT_COMPILE_BITCODE);
    }

    @IgnoreUnused
    public void setCompileBitCode(@Nullable boolean compileBitCode) {
        this.compileBitCode = compileBitCode;
    }

    @NotNull
    private boolean embedOnDemandResourcesAssetPacksInBundle;

    @Input
    @NotNull
    public boolean getEmbedOnDemandResourcesAssetPacksInBundle() {
        return nullableGetOrConvention(embedOnDemandResourcesAssetPacksInBundle, CONVENTION_EXPORT_DEMAND_RESOURCES_IN_BUNDLE);
    }

    @IgnoreUnused
    public void setEmbedOnDemandResourcesAssetPacksInBundle(boolean embedOnDemandResourcesAssetPacksInBundle) {
        this.embedOnDemandResourcesAssetPacksInBundle = embedOnDemandResourcesAssetPacksInBundle;
    }

    @Input
    @Optional
    @Nullable
    public String iCloudContainerEnvironment;

    @Nullable
    public String getICloudContainerEnvironment() {
        return nullableGetOrConvention(iCloudContainerEnvironment, CONVENTION_EXPORT_ICLOUD);
    }

    @IgnoreUnused
    public void setICloudContainerEnvironment(String iCloudContainerEnvironment) {
        this.iCloudContainerEnvironment = iCloudContainerEnvironment;
    }

    @Input
    @Optional
    @Nullable
    public String onDemandResourcesAssetPacksBaseURL;

    @Input
    @Optional
    @Nullable
    public String getOnDemandResourcesAssetPacksBaseURL() {
        return nullableGetOrConvention(onDemandResourcesAssetPacksBaseURL, CONVENTION_EXPORT_DEMAND_RESOURCES_BASE_URL);
    }

    @IgnoreUnused
    public void setOnDemandResourcesAssetPacksBaseURL(String onDemandResourcesAssetPacksBaseURL) {
        this.onDemandResourcesAssetPacksBaseURL = onDemandResourcesAssetPacksBaseURL;
    }

    @Input
    @Optional
    @Nullable
    public String thinning;

    @Nullable
    public String getThinning() {
        return nullableGetOrConvention(thinning, CONVENTION_THINNING);
    }

    @IgnoreUnused
    public void setThinning(String thinning) {
        this.thinning = thinning;
    }

    @Input
    @Optional
    @Nullable
    public String appURL;

    public String getAppURL() {
        return nullableGetOrConvention(appURL, CONVENTION_APP_URL);
    }

    @IgnoreUnused
    public void setAppURL(String appURL) {
        this.appURL = appURL;
    }

    @Input
    @Optional
    @Nullable
    public String displayImageURL;

    @Nullable
    public String getDisplayImageURL() {
        return nullableGetOrConvention(displayImageURL, CONVENTION_DISPLAY_IMAGE_URL);
    }

    @IgnoreUnused
    public void setDisplayImageURL(String displayImageURL) {
        this.displayImageURL = displayImageURL;
    }

    @Input
    @Optional
    @Nullable
    public String fullSizeImageURL;

    @Nullable
    public String getFullSizeImageURL() {
        return nullableGetOrConvention(fullSizeImageURL, CONVENTION_FULL_SIZE_IMAGE_URL);
    }

    @IgnoreUnused
    public void setFullSizeImageURL(String fullSizeImageURL) {
        this.fullSizeImageURL = fullSizeImageURL;
    }

    @Input
    @Optional
    @Nullable
    public String plistFile;

    @Nullable
    public String getPlistFile() {
        return nullableGetOrConvention(plistFile, CONVENTION_USER_PLIST_FILE);
    }

    @IgnoreUnused
    public void setPlistFile(String plistFile) {
        this.plistFile = plistFile;
    }

    @NotNull
    private boolean uploadSymbols;

    @Input
    @NotNull
    public boolean getUploadSymbols() {
        return getOrConvention(uploadSymbols, CONVENTION_EXPORT_UPLOAD_SYMBOLS);
    }

    @IgnoreUnused
    public void setUploadSymbols(@Nullable boolean uploadSymbols) {
        this.uploadSymbols = uploadSymbols;
    }

    @Nullable
    private String provisioningProfileSpecifier;

    @Input
    @Optional
    public String getProvisioningProfileSpecifier() {
        return nullableGetOrConvention(provisioningProfileSpecifier, CONVENTION_PROVISIONING_PROFILE_SPECIFIER);
    }

    @IgnoreUnused
    public void setProvisioningProfileSpecifier(@Nullable String provisioningProfileSpecifier) {
        this.provisioningProfileSpecifier = provisioningProfileSpecifier;
    }

    @Nullable
    private String provisioningProfile;

    @Input
    @Optional
    public String getProvisioningProfile() {
        return nullableGetOrConvention(provisioningProfile, CONVENTION_PROVISIONING_PROFILE);
    }

    @IgnoreUnused
    public void setProvisioningProfile(@Nullable String provisioningProfile) {
        this.provisioningProfileSpecifier = provisioningProfile;
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

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        if (getScheme() == null) {
            throw new GradleException("IPA build requires schemes! Please set the "
                    + "moe.xcode.mainScheme property");
        }

        if (getDevelopmentTeam() == null) {
            throw new GradleException("IPA build requires signing developmentTeam! Please set the "
                    + "moe.signing.developmentTeam property");
        }

        final Server remoteServer = getMoePlugin().getRemoteServer();
        final File inputApp = Require.nonNull(getInputApp());

        if (!isUserExportPlist()) {
            generateExportOptionsPlist();
        } else {
            LOG.warn("Ipa export option plist is defined, ignore all other settings");
        }

        if (remoteServer != null) {
            final Path ipaRel;
            try {
                ipaRel = getInnerProjectRelativePath(getOutputIpa());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteIpa = remoteServer.getRemotePath(ipaRel);

            // Upload ipa export options
            final FileList list = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());
            list.add(getExportOptionsPlist());

            remoteServer.upload("Upload export options", list);

            remoteServer.exec("remove previous ipa", "rm -rf " + remoteIpa);

            remoteServer.exec("archive", "xcrun xcodebuild " +
                    calculateArchiveArgs().stream().collect(Collectors.joining(" ")));

            remoteServer.exec("export archive", "xcrun xcodebuild " +
                    calculateExportArchiveArgs().stream().collect(Collectors.joining(" ")));

            remoteServer.downloadFile("ipa file", remoteIpa, getOutputIpa().getParentFile());

        } else {
            exec(spec -> {
                // Set executable
                spec.setExecutable("xcrun");
                spec.args("xcodebuild");
                spec.args(calculateArchiveArgs());

            });

            exec(spec -> {
                // Set executable
                spec.setExecutable("xcrun");
                spec.args("xcodebuild");
                spec.args(calculateExportArchiveArgs());
            });
        }
    }

    private XcodeBuild xcodeBuildTaskDep;

    @NotNull
    @IgnoreUnused
    public XcodeBuild getXcodeBuildTaskDep() {
        return Require.nonNull(xcodeBuildTaskDep);
    }

    protected final void setupMoeTask() {
        setSupportsRemoteBuild(true);

        final MoeExtension ext = getMoeExtension();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE);

        setDescription("Builds .ipa file.");

        // Add dependencies
        final XcodeBuild xcodeBuildTask = getMoePlugin().getTaskBy(XcodeBuild.class,
                TaskUtils.getSourceSet(getMoePlugin(), SourceSet.MAIN_SOURCE_SET_NAME),
                Mode.RELEASE,
                ext.getPlatformType());
        xcodeBuildTaskDep = xcodeBuildTask;
        dependsOn(xcodeBuildTask);

        // Update convention mapping
        addConvention(CONVENTION_INPUT_APP, () -> {
            final Map<String, String> buildSettings = xcodeBuildTask.getNullableXcodeBuildSettings();
            if (buildSettings == null) {
                return null;
            }
            final String sym = xcodeBuildTask.getConfigurationBuildDir().getAbsolutePath();
            final String productName = buildSettings.get("PRODUCT_NAME");
            return Paths.get(sym, productName + ".app").toFile();
        });
        addConvention(CONVENTION_OUTPUT_IPA, () -> {
            final Map<String, String> buildSettings = xcodeBuildTask.getXcodeBuildSettings();
            final String productName = buildSettings.get("PRODUCT_NAME");
            return resolvePathInBuildDir(productName + ".ipa");
        });
        // Update convention mapping
        addConvention(CONVENTION_TARGET, () -> {
            return ext.xcode.getMainTarget();
        });
        addConvention(CONVENTION_SCHEME, () -> {
            return ext.xcode.getMainScheme();
        });
        addConvention(CONVENTION_XCODE_PROJECT_FILE, () ->
                resolvePathRelativeToRoot(getProject().file(ext.xcode.getProject())));
        addConvention(CONVENTION_XCODE_WORKSPACE_FILE, () -> {
            final Object workspace = ext.xcode.getWorkspace();
            if (workspace == null) {
                return null;
            }
            return resolvePathRelativeToRoot(getProject().file(workspace));
        });
        addConvention(CONVENTION_BUNDLE_IDENTIFIER, () -> {
            final Map<String, String> buildSettings = xcodeBuildTask.getNullableXcodeBuildSettings();
            if (buildSettings == null) {
                return null;
            }
            final String bundleIdentifier = buildSettings.get(BUNDLE_IDENTIFIER_KEY);
            return bundleIdentifier;
        });

        addConvention(CONVENTION_EXPORT_METHOD, ext.ipaExport::getMethod);
        setUploadBitcode(ext.ipaExport.getUploadBitcode());
        setUploadSymbols(ext.ipaExport.getUploadSymbols());
        setCompileBitCode(ext.ipaExport.getCompileBitcode());
        setEmbedOnDemandResourcesAssetPacksInBundle(ext.ipaExport.getEmbedOnDemandResourcesAssetPacksInBundle());
        addConvention(CONVENTION_EXPORT_ICLOUD, ext.ipaExport::getICloudContainerEnvironment);
        addConvention(CONVENTION_EXPORT_DEMAND_RESOURCES_BASE_URL, ext.ipaExport::getOnDemandResourcesAssetPacksBaseURL);
        addConvention(CONVENTION_EXPORT_DEMAND_RESOURCES_IN_BUNDLE, ext.ipaExport::getEmbedOnDemandResourcesAssetPacksInBundle);
        addConvention(CONVENTION_THINNING, ext.ipaExport::getThinning);
        addConvention(CONVENTION_APP_URL, ext.ipaExport::getAppURL);
        addConvention(CONVENTION_DISPLAY_IMAGE_URL, ext.ipaExport::getDisplayImageURL);
        addConvention(CONVENTION_FULL_SIZE_IMAGE_URL, ext.ipaExport::getFullSizeImageURL);
        addConvention(CONVENTION_USER_PLIST_FILE, ext.ipaExport::getPlistFile);
        if (!ext.ipaExport.isUserDefinedExportPlist()) {
            setUserExportPlist(false);
            addConvention(CONVENTION_EXPORT_INFO_PLIST, () -> resolvePathInBuildDir(out, "export_options.plist"));
        } else {
            setUserExportPlist(true);
            addConvention(CONVENTION_EXPORT_INFO_PLIST, () -> resolvePathInProjectDir(ext.ipaExport.getPlistFile()));
        }

        addConvention(CONVENTION_CONFIGURATION, Mode.RELEASE::getXcodeCompatibleName);
        addConvention(CONVENTION_OUTPUT_ARCHIVE, () -> {
            return resolvePathInBuildDir("archive");
        });
        addConvention(CONVENTION_DEVELOPMENT_TEAM, () -> {
            String xcodeprojDevelopmentTeam = getXcodeprojDevelopmentTeam();
            if (!ext.signing.usesDefaultDevelopmentTeam()) {
                return ext.signing.getDevelopmentTeam();
            } else if (ext.signing.getDevelopmentTeam() != null) {
                return ext.signing.getDevelopmentTeam();
            } else {
                return xcodeprojDevelopmentTeam;
            }
        });
        addConvention(CONVENTION_ADDITIONAL_PARAMETERS, () ->
                new ArrayList<>(Arrays.asList("MOE_GRADLE_EXTERNAL_BUILD=YES", "ONLY_ACTIVE_ARCH=NO")));
        addConvention(CONVENTION_PROVISIONING_PROFILE_SPECIFIER, () -> {
            return ext.signing.getProvisioningProfileSpecifier();
        });
        addConvention(CONVENTION_PROVISIONING_PROFILE, () -> {
            return ext.signing.getProvisioningProfile();
        });
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "IpaBuild.log"));
    }

    private List<String> calculateArchiveArgs() {
        final List<String> args = new ArrayList<>();
        final Server remoteServer = getMoePlugin().getRemoteServer();

        args.add("archive");

        final String _xcodeProjectFile;
        final String _xcodeWorkspaceFile;
        final String _archiveFile;

        if (remoteServer != null) {
            final Path xcodeProjectFileRel;
            final Path xcodeWorkspaceFileRel;
            final Path archiveFileRel;
            try {
                xcodeProjectFileRel = getInnerProjectRelativePath(getXcodeProjectFile());
                if (getXcodeWorkspaceFile() != null) {
                    xcodeWorkspaceFileRel = getInnerProjectRelativePath(getXcodeWorkspaceFile());
                } else {
                    xcodeWorkspaceFileRel = null;
                }
                archiveFileRel = getInnerProjectRelativePath(getOutputArchive());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            _xcodeProjectFile = remoteServer.getRemotePath(xcodeProjectFileRel);
            if (xcodeWorkspaceFileRel != null) {
                _xcodeWorkspaceFile = remoteServer.getRemotePath(xcodeWorkspaceFileRel);
            } else {
                _xcodeWorkspaceFile = null;
            }
            _archiveFile = remoteServer.getRemotePath(archiveFileRel);


        } else {
            _xcodeProjectFile = getXcodeProjectFile().getAbsolutePath();
            if (getXcodeWorkspaceFile() != null) {
                _xcodeWorkspaceFile = getXcodeWorkspaceFile().getAbsolutePath();
            } else {
                _xcodeWorkspaceFile = null;
            }
            _archiveFile = getOutputArchive().getAbsolutePath();
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

        args.add("DEVELOPMENT_TEAM=" + getDevelopmentTeam());

        args.add("-configuration");
        args.add(getConfiguration());

        args.add("-archivePath");
        args.add(_archiveFile);

        String provProf = getProvisioningProfile();
        if (provProf != null && !provProf.isEmpty()) {
            args.add("PROVISIONING_PROFILE=" + provProf);
        }
        return args;
    }

    private List<String> calculateExportArchiveArgs() {
        final List<String> args = new ArrayList<>();
        final Server remoteServer = getMoePlugin().getRemoteServer();

        final String _archiveFile;
        final String _ipaFile;
        final String _optionsPlistFile;

        if (remoteServer != null) {
            final Path archiveFileRel;
            final Path ipaFileRel;
            final Path optionsPlistFileRel;
            try {
                ipaFileRel = getInnerProjectRelativePath(getOutputIpa().getParentFile());
                archiveFileRel = getInnerProjectRelativePath(resolvePathInBuildDir("archive.xcarchive"));
                optionsPlistFileRel = getInnerProjectRelativePath(getExportOptionsPlist());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            _ipaFile = remoteServer.getRemotePath(ipaFileRel);
            _archiveFile = remoteServer.getRemotePath(archiveFileRel);
            _optionsPlistFile = remoteServer.getRemotePath(optionsPlistFileRel);
        } else {
            _ipaFile = getOutputIpa().getParent();
            _archiveFile = resolvePathInBuildDir("archive.xcarchive").getAbsolutePath();
            _optionsPlistFile = getExportOptionsPlist().getAbsolutePath();
        }

        args.add("-exportArchive");
        args.add("-archivePath");
        args.add(_archiveFile);
        args.add("-exportPath");
        args.add(_ipaFile);
        args.add("-exportOptionsPlist");
        args.add(_optionsPlistFile);

        return args;
    }

    private String getXcodeprojDevelopmentTeam() {
        try {
            // Open Xcode project
            final File xcodeproj = Require.nonNull(getXcodeProjectFile());
            final ProjectFile project = new ProjectFile(xcodeproj);
            final String target = Require.nonNull(getTarget());

            // Search for target with name
            final java.util.Optional<Map.Entry<PBXObjectRef<? extends PBXObject>, PBXObject>> optional = project.getRoot()
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
                if (xcBuildConfiguration.getName().equals(Mode.RELEASE.getXcodeCompatibleName())) {
                    final NextStep developmentTeam = xcBuildConfiguration.getOrCreateBuildSettings().get("DEVELOPMENT_TEAM");
                    if (developmentTeam != null && ((Value)developmentTeam).value.length() != 0) {
                        return ((Value) developmentTeam).value;
                    }
                }
            }

            xcConfigurationList = project.getRoot().getRootObject().getReferenced().getBuildConfigurationList()
                    .getReferenced();
            for (PBXObjectRef<XCBuildConfiguration> ref : xcConfigurationList.getOrCreateBuildConfigurations()) {
                XCBuildConfiguration xcBuildConfiguration = ref.getReferenced();
                if (xcBuildConfiguration.getName().equals(Mode.RELEASE.getXcodeCompatibleName())) {
                    final NextStep developmentTeam = xcBuildConfiguration.getOrCreateBuildSettings().get("DEVELOPMENT_TEAM");
                    if (developmentTeam != null && ((Value)developmentTeam).value.length() != 0) {
                        return ((Value) developmentTeam).value;
                    }
                }
            }
        } catch (Throwable t) {
            getProject().getLogger().log(LogLevel.ERROR, "Failed to read Xcode project file", t);
            return null;
        }
        return null;
    }

    private void generateExportOptionsPlist() {

        // Generate options file
        File exportOptionsPlist = getExportOptionsPlist();

        LOG.quiet("Generate export_options.plist");

        try {
            if (!exportOptionsPlist.exists()) {
                String template;
                {
                    StringBuilder builder = new StringBuilder();
                    InputStream stream = getClass().getResourceAsStream("export_options_template.txt");
                    byte buff[] = new byte[1024];
                    int len;
                    while ((len = stream.read(buff)) > 0) {
                        builder.append(new String(buff, 0, len, StandardCharsets.UTF_8));
                    }
                    template = builder.toString();
                }

                PrintWriter writer = new PrintWriter(exportOptionsPlist);
                writer.print(template);
                writer.close();
            }

            ExportOptionsPlistManager manager = new ExportOptionsPlistManager(exportOptionsPlist);
            manager.clean();

            String method = getExportMethod();
            if (method != null && !method.isEmpty()) {
                manager.setMethod(method);
            }
            manager.setTeamId(getDevelopmentTeam());
            manager.setCompileBitcode(getCompileBitcode());
            manager.setUploadBitcode(getUploadBitcode());
            manager.setUploadSymbols(getUploadSymbols());
            manager.setEmbedOnDemandResourcesAssetPacksInBundle(getEmbedOnDemandResourcesAssetPacksInBundle());
            String iCloudContainerEnvironment = getICloudContainerEnvironment();
            if (iCloudContainerEnvironment != null && !iCloudContainerEnvironment.isEmpty()) {
                manager.setICloudContainerEnvironment(iCloudContainerEnvironment);
            }
            String thinning = getThinning();
            if (thinning != null && !thinning.isEmpty()) {
                manager.setThinning(thinning);
            }
            String appUrl = getAppURL();
            if (appUrl != null && !appUrl.isEmpty()) {
                manager.setAppURL(appUrl);
            }
            String displayImageURL = getDisplayImageURL();
            if (displayImageURL != null && !displayImageURL.isEmpty()) {
                manager.setDisplayImageURL(displayImageURL);
            }
            String fullSizeImageURL = getFullSizeImageURL();
            if (fullSizeImageURL != null && !fullSizeImageURL.isEmpty()) {
                manager.setFullSizeImageURL(fullSizeImageURL);
            }

            String bundleId = getBundleIdentifier();
            String provisioningProf = getProvisioningProfileSpecifier();

            if (bundleId != null && !bundleId.isEmpty() && provisioningProf != null && !provisioningProf.isEmpty()) {
                manager.setProvisioningProfiles(bundleId, provisioningProf);
            }

            manager.save();

        } catch (Throwable t) {
            throw new GradleException("Could not generate export_options.plist", t);
        }

    }
}
