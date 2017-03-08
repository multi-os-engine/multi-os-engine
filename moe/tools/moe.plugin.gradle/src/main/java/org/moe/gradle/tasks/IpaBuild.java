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
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IpaBuild extends AbstractBaseTask {

    private static final Logger LOG = Logging.getLogger(IpaBuild.class);

    private static final String CONVENTION_INPUT_APP = "inputApp";
    private static final String CONVENTION_OUTPUT_IPA = "outputIpa";
    private static final String CONVENTION_TARGET = "target";
    private static final String CONVENTION_SCHEME = "scheme";
    private static final String CONVENTION_XCODE_PROJECT_FILE = "xcodeProjectFile";
    private static final String CONVENTION_XCODE_WORKSPACE_FILE = "xcodeWorkspaceFile";
    private static final String CONVENTION_PROVISIONING_PROFILE_NAME = "provisioningProfileName";
    private static final String CONVENTION_CONFIGURATION = "configuration";
    private static final String CONVENTION_OUTPUT_ARCHIVE = "outputArchive";
    private static final String CONVENTION_DEVELOPMENT_TEAM = "developmentTeam";

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
    private String provisioningProfileName;

    @Input
    @Optional
    @Nullable
    public String getProvisioningProfileName() {
        return nullableGetOrConvention(provisioningProfileName, CONVENTION_PROVISIONING_PROFILE_NAME);
    }

    @IgnoreUnused
    public void setProvisioningProfileName(@Nullable String provisioningProfileName) {
        this.provisioningProfileName = provisioningProfileName;
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

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        if (getScheme() == null) {
            throw new GradleException("Using Xcode workspaces requires schemes! Please set the "
                    + "moe.xcode." + "main" + "Scheme property");
        }

        final Server remoteServer = getMoePlugin().getRemoteServer();
        final File inputApp = Require.nonNull(getInputApp());

        String profileName = getProvisioningProfileName();

        if (profileName == null || profileName.isEmpty()) {
            throw new GradleException("Provisioning profile name is not specified!");
        }

        removePreviousIpa();

        if (remoteServer != null) {
            final Path ipaRel;
            try {
                ipaRel = getInnerProjectRelativePath(getOutputIpa());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteIpa = remoteServer.getRemotePath(ipaRel);

            // Upload project
            final FileList list = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());
            final String remoteApp = list.add(inputApp);

            // NOTE: do not re-upload the files, incremental builds are disabled for remotely executed tasks, the
            // files are guarantied to be there. Also, enabling this would possibly break the signed files.
            // remoteServer.upload("application files", list);
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
        addConvention(CONVENTION_PROVISIONING_PROFILE_NAME, ext.signing::getProvisioningProfileName);
        addConvention(CONVENTION_CONFIGURATION, Mode.RELEASE::getXcodeCompatibleName);
        addConvention(CONVENTION_OUTPUT_ARCHIVE, () -> {
            return resolvePathInBuildDir("archive");
        });
        addConvention(CONVENTION_DEVELOPMENT_TEAM, () -> {
            if (!ext.signing.usesDefaultDevelopmentTeam()) {
                return ext.signing.getDevelopmentTeam();
            } else if (!xcodeprojDevelopmentTeamIsSet()) {
                return ext.signing.getDevelopmentTeam();
            } else {
                return null;
            }
        });
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "IpaBuild.log"));
    }

    private void removePreviousIpa() {
        File libswiftRemoteMirror = getOutputIpa();
        if (libswiftRemoteMirror.exists()) {
            libswiftRemoteMirror.delete();
        }
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

        args.add("DEVELOPMENT_TEAM=" + getDevelopmentTeam());

        args.add("-configuration");
        args.add(getConfiguration());

        args.add("-archivePath");
        args.add(_archiveFile);
        return args;
    }

    private List<String> calculateExportArchiveArgs() {
        final List<String> args = new ArrayList<>();
        final Server remoteServer = getMoePlugin().getRemoteServer();

        final String _archiveFile;
        final String _ipaFile;

        if (remoteServer != null) {
            final Path archiveFileRel;
            final Path ipaFileRel;
            try {
                ipaFileRel = getInnerProjectRelativePath(getOutputIpa());
                archiveFileRel = getInnerProjectRelativePath(resolvePathInBuildDir("archive.xcarchive"));
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            _ipaFile = remoteServer.getRemotePath(ipaFileRel);
            _archiveFile = remoteServer.getRemotePath(archiveFileRel);
        } else {
            _ipaFile = getOutputIpa().getAbsolutePath();
            _archiveFile = resolvePathInBuildDir("archive.xcarchive").getAbsolutePath();
        }

        args.add("-exportArchive");
        args.add("-exportFormat");
        args.add("IPA");

        args.add("-archivePath");
        args.add(_archiveFile);
        args.add("-exportPath");
        args.add(_ipaFile);
        args.add("-exportProvisioningProfile");
        args.add(getProvisioningProfileName());

        return args;
    }

    private boolean xcodeprojDevelopmentTeamIsSet() {
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
                        return true;
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
}
