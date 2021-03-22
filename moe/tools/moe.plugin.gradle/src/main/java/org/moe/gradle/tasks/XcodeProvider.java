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
import org.gradle.api.tasks.SourceSet;
import org.moe.document.pbxproj.ProjectException;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.gradle.MoePlatform;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.XcodeOptions;
import org.moe.gradle.remote.Server;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.function.Supplier;

public class XcodeProvider extends AbstractBaseTask {

    @Nullable
    private Supplier<Path> outDir;

    @Nullable
    private Dex2Oat dex2OatTask;

    private @Nullable Arch arch;

    @NotNull
    private final String xcodeProviderTaskDate = new Date().toString();

    @Input
    @IgnoreUnused
    public String getXcodeProviderTaskDate() {
        // NOTE: never allow Gradle to skip this task due to incremental build!!!
        return xcodeProviderTaskDate;
    }

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        Require.nonNull(outDir);
        Require.nonNull(dex2OatTask);
        Require.nonNull(arch);

        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            final Path artRel;
            final Path oatRel;
            try {
                artRel = getInnerProjectRelativePath(dex2OatTask.getDestImageFile());
                oatRel = getInnerProjectRelativePath(dex2OatTask.getDestOatFile());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteArt = remoteServer.getRemotePath(artRel);
            final String remoteOat = remoteServer.getRemotePath(oatRel);

            final Path outPath;
            try {
                outPath = getInnerProjectRelativePath(resolvePathInBuildDir(outDir.get()));
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            final String remoteArtLink = remoteServer.getRemotePath(outPath.resolve(arch.name + ".art"));
            final String remoteOatLink = remoteServer.getRemotePath(outPath.resolve(arch.name + ".oat"));
            remoteServer.exec("link art & oat", "" +
                    "mkdir -p '" + remoteServer.getRemotePath(outPath) + "' && " +
                    "rm -f '" + remoteArtLink + "' && " +
                    "rm -f '" + remoteOatLink + "' && " +
                    "ln -s '" + remoteArt + "' '" + remoteArtLink + "' && " +
                    "ln -s '" + remoteOat + "' '" + remoteOatLink + "'");

        } else {
            XcodeOptions xcode = getMoeExtension().xcode;
            File xcodeFile = getProject().file(xcode.getProject());
            try {
                XcodeEditor xcodeEditor = new XcodeEditor(xcodeFile);
                if (!xcodeEditor.isUpToDate()) {
                    throw new GradleException("Xcode project is not up to date, update it with task " +
                            MoePlugin.getTaskName(UpdateXcodeSettings.class));
                }
            } catch (ProjectException e) {
                throw new GradleException("Could not open Xcode project to check if it is up to date", e);
            } catch (IOException e) {
                throw new GradleException("Could not determine if the Xcode project is up to date", e);
            }

            final Path artLink = getArtLink();
            try {
                Files.deleteIfExists(artLink);
                Files.createSymbolicLink(artLink, dex2OatTask.getDestImageFile().toPath());
            } catch (IOException e) {
                throw new GradleException("Failed to create symlink to " + artLink);
            }

            final Path oatLink = getOatLink();
            try {
                Files.deleteIfExists(oatLink);
                Files.createSymbolicLink(oatLink, dex2OatTask.getDestOatFile().toPath());
            } catch (IOException e) {
                throw new GradleException("Failed to create symlink to " + oatLink);
            }
        }
    }

    private Dex2Oat dex2OatTaskDep;

    @NotNull
    public Dex2Oat getDex2OatTaskDep() {
        return Require.nonNull(dex2OatTaskDep);
    }

    private StartupProvider startupProviderTaskDep;

    @NotNull
    public StartupProvider getStartupProviderTaskDep() {
        return Require.nonNull(startupProviderTaskDep);
    }

    private Path outRoot;

    @NotNull
    public Path getOutRoot() {
        return Require.nonNull(outRoot);
    }

    @NotNull
    public Path getArtLink() {
        final String outPath = outDir.get().toString();
        return Paths.get(getProject().getBuildDir().toString(), outPath, arch.name + ".art");
    }

    @NotNull
    public Path getOatLink() {
        final String outPath = outDir.get().toString();
        return Paths.get(getProject().getBuildDir().toString(), outPath, arch.name + ".oat");
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet, @NotNull Mode mode, @NotNull Arch arch,
                                      @NotNull MoePlatform platform) {
        Require.nonNull(sourceSet);
        Require.nonNull(mode);
        Require.nonNull(arch);
        Require.nonNull(platform);

        setSupportsRemoteBuild(true);

        // Do sanity check on supported arch
        if (!platform.archs.contains(arch)) {
            throw new GradleException("The platform '" + platform + "' does not support the '" + arch + "' architecture");
        }

        // Construct default output path
        outRoot = Paths.get(MoePlugin.MOE, sourceSet.getName(), "xcode");
        final Supplier<Path> outPath;
        if (platform.mainPlatformsHasSimulatorPair()) {
            outPath = () -> outRoot.resolve(mode.getXcodeCompatibleName() + "-" + platform.platformName);
        } else {
            outPath = () -> outRoot.resolve(mode.getXcodeCompatibleName());
        }

        // Create task
        setDescription("Generates object files (sourceset: " + sourceSet.getName() + ", mode: " + mode.name +
                ", arch: " + arch.name + ", platform: " + platform.platformName + ").");
        this.outDir = outPath;
        this.arch = arch;

        // Add dependencies
        final Dex2Oat dex2oatTask = getMoePlugin().getTaskBy(Dex2Oat.class, sourceSet, mode, arch.family);
        dex2OatTaskDep = dex2oatTask;
        dependsOn(dex2oatTask);
        this.dex2OatTask = dex2oatTask;

        final NativeImageTask nit = getMoePlugin().getTaskBy(NativeImageTask.class, sourceSet, mode, platform);
        dependsOn(nit);

        final StartupProvider startupProviderTask = getMoePlugin().getTaskBy(StartupProvider.class, sourceSet);
        startupProviderTaskDep = startupProviderTask;
        dependsOn(startupProviderTask);

        dependsOn(getProject().getTasks().getByName(MoePlugin.getTaskName(ResourcePackager.class, sourceSet)));

        if (SourceSet.TEST_SOURCE_SET_NAME.equals(sourceSet.getName())) {
            dependsOn(getMoePlugin().getTaskBy(TestClassesProvider.class, sourceSet));
        }

        if (SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName())) {
            dependsOn(getMoePlugin().getTaskBy(GenerateUIObjCInterfaces.class));
        }

        // Update convention mapping
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(outPath.get(), "XcodeProvider.log"));
    }
}
