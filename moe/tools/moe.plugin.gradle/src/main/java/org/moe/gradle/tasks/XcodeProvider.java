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
import org.gradle.api.tasks.Internal;
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
        Require.nonNull(nativeImageTaskDep);
        Require.nonNull(arch);

        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            final Path mainObjRel;
            final Path llvmObjRel;
            try {
                mainObjRel = getInnerProjectRelativePath(nativeImageTaskDep.getMainObjFile());
                llvmObjRel = getInnerProjectRelativePath(nativeImageTaskDep.getLlvmObjFile());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteMainObj = remoteServer.getRemotePath(mainObjRel);
            final String remoteLlvmObj = remoteServer.getRemotePath(llvmObjRel);

            final Path outPath;
            try {
                outPath = getInnerProjectRelativePath(resolvePathInBuildDir(outDir.get()));
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            final String remoteMainObjLink = remoteServer.getRemotePath(outPath.resolve("main_" + arch.name + ".o"));
            final String remoteLlvmObjLink = remoteServer.getRemotePath(outPath.resolve("llvm_" + arch.name + ".o"));
            remoteServer.exec("link art & oat", "" +
                    "mkdir -p '" + remoteServer.getRemotePath(outPath) + "' && " +
                    "rm -f '" + remoteMainObjLink + "' && " +
                    "rm -f '" + remoteLlvmObjLink + "' && " +
                    "ln -s '" + remoteMainObj + "' '" + remoteMainObjLink + "' && " +
                    "ln -s '" + remoteLlvmObj + "' '" + remoteLlvmObjLink + "'");

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

            final Path mainObjLink = getMainObjLink();
            try {
                Files.deleteIfExists(mainObjLink);
                Files.createSymbolicLink(mainObjLink, nativeImageTaskDep.getMainObjFile().toPath());
            } catch (IOException e) {
                throw new GradleException("Failed to create symlink to " + mainObjLink);
            }

            final Path llvmObjLink = getLlvmObjLink();
            try {
                Files.deleteIfExists(llvmObjLink);
                Files.createSymbolicLink(llvmObjLink, nativeImageTaskDep.getLlvmObjFile().toPath());
            } catch (IOException e) {
                throw new GradleException("Failed to create symlink to " + llvmObjLink);
            }
        }
    }

    private NativeImage nativeImageTaskDep;

    @NotNull
    @Internal
    public NativeImage getNativeImageTaskDep() {
        return Require.nonNull(nativeImageTaskDep);
    }

    private StartupProvider startupProviderTaskDep;

    @NotNull
    @Internal
    public StartupProvider getStartupProviderTaskDep() {
        return Require.nonNull(startupProviderTaskDep);
    }

    private Path outRoot;

    @NotNull
    @Internal
    public Path getOutRoot() {
        return Require.nonNull(outRoot);
    }

    @NotNull
    @Internal
    public Path getMainObjLink() {
        final String outPath = outDir.get().toString();
        return Paths.get(getProject().getBuildDir().toString(), outPath, "main_" + arch.name + ".o");
    }

    @NotNull
    @Internal
    public Path getLlvmObjLink() {
        final String outPath = outDir.get().toString();
        return Paths.get(getProject().getBuildDir().toString(), outPath, "llvm_" + arch.name + ".o");
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
        final NativeImage nativeImageTask = getMoePlugin().getTaskBy(NativeImage.class, sourceSet, mode, arch, platform);
        nativeImageTaskDep = nativeImageTask;
        dependsOn(nativeImageTask);

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
