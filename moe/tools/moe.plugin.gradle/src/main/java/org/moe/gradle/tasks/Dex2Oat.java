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
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.remote.file.FileList;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Dex2Oat extends AbstractBaseTask {

    private static final String CONVENTION_DEX2OAT_EXEC = "dex2oatExec";
    private static final String CONVENTION_ARCH_FAMILY = "archFamily";
    private static final String CONVENTION_BASE = "base";
    private static final String CONVENTION_IMAGE_CLASSES = "imageClasses";
    private static final String CONVENTION_EMIT_DEBUG_INFO = "emitDebugInfo";
    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_COMPILER_BACKEND = "compilerBackend";
    private static final String CONVENTION_DEST_IMAGE_FILE = "destImageFile";
    private static final String CONVENTION_DEST_OAT_FILE = "destOatFile";

    private static final String BACKEND_QUICK = "Quick";
    private static final String BACKEND_OPTIMIZING = "Optimizing";
    private static final String[] ALL_BACKENDS = new String[]{BACKEND_QUICK, BACKEND_OPTIMIZING};

    @Nullable
    private Object dex2oatExec;

    @InputFile
    @NotNull
    public File getDex2oatExec() {
        return getProject().file(getOrConvention(dex2oatExec, CONVENTION_DEX2OAT_EXEC));
    }

    @IgnoreUnused
    public void setDex2oatExec(@Nullable Object dex2oatExec) {
        this.dex2oatExec = dex2oatExec;
    }

    @Nullable
    private String archFamily;

    @Input
    @NotNull
    public String getArchFamily() {
        return getOrConvention(archFamily, CONVENTION_ARCH_FAMILY);
    }

    @IgnoreUnused
    public void setArchFamily(@Nullable String archFamily) {
        this.archFamily = archFamily == null ? null : Arch.validateArchFamily(archFamily);
    }

    @Nullable
    private Long base;

    @Input
    @NotNull
    public Long getBase() {
        return getOrConvention(base, CONVENTION_BASE);
    }

    @IgnoreUnused
    public void setBase(@Nullable Long base) {
        this.base = base;
    }

    @Nullable
    private Object imageClasses;

    @InputFile
    @NotNull
    public File getImageClasses() {
        return getProject().file(getOrConvention(imageClasses, CONVENTION_IMAGE_CLASSES));
    }

    @IgnoreUnused
    public void setImageClasses(@Nullable Object imageClasses) {
        this.imageClasses = imageClasses;
    }

    @Nullable
    private Boolean emitDebugInfo;

    @Input
    @NotNull
    public Boolean getEmitDebugInfo() {
        return getOrConvention(emitDebugInfo, CONVENTION_EMIT_DEBUG_INFO);
    }

    @IgnoreUnused
    public void setEmitDebugInfo(@Nullable Boolean emitDebugInfo) {
        this.emitDebugInfo = emitDebugInfo;
    }

    @Nullable
    private Set<Object> inputFiles;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getInputFiles() {
        return getProject().files(getOrConvention(inputFiles, CONVENTION_INPUT_FILES));
    }

    @IgnoreUnused
    public void setInputFiles(@Nullable Collection<Object> inputFiles) {
        this.inputFiles = inputFiles == null ? null : new HashSet<>(inputFiles);
    }

    @Nullable
    private String compilerBackend;

    @Input
    @NotNull
    public String getCompilerBackend() {
        return getOrConvention(compilerBackend, CONVENTION_COMPILER_BACKEND);
    }

    @IgnoreUnused
    public void setCompilerBackend(@Nullable String compilerBackend) {
        this.compilerBackend = compilerBackend == null ? null : validateBackend(compilerBackend);
    }

    @Nullable
    private Object destImageFile;

    @OutputFile
    @NotNull
    public File getDestImageFile() {
        return getProject().file(getOrConvention(destImageFile, CONVENTION_DEST_IMAGE_FILE));
    }

    @IgnoreUnused
    public void setDestImageFile(@Nullable Object destImageFile) {
        this.destImageFile = destImageFile;
    }

    @Nullable
    private Object destOatFile;

    @OutputFile
    @NotNull
    public File getDestOatFile() {
        return getProject().file(getOrConvention(destOatFile, CONVENTION_DEST_OAT_FILE));
    }

    @IgnoreUnused
    public void setDestOatFile(@Nullable Object destOatFile) {
        this.destOatFile = destOatFile;
    }

    @Override
    protected void run() {
        getMoePlugin().requireMacHostOrRemoteServerConfig(this);

        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            final String dex2oatExec;
            final String imageClasses;
            try {
                dex2oatExec = remoteServer.getSDKRemotePath(getDex2oatExec());
                imageClasses = remoteServer.getSDKRemotePath(getImageClasses());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            final FileList fileList = new FileList(getProject().getProjectDir(), remoteServer.getBuildDir());
            StringBuilder dexFiles = new StringBuilder();
            StringBuilder remoteDexFilesCheck = new StringBuilder();
            getInputFiles().forEach(it -> {
                String path;
                boolean needsUpload = false;
                try {
                    path = remoteServer.getSDKRemotePath(it);
                } catch (IOException ignore) {
                    needsUpload = true;
                    try {
                        path = getInnerProjectRelativePath(it).toString();
                    } catch (IOException e) {
                        throw new GradleException("Unsupported configuration", e);
                    }
                }
                if (dexFiles.length() > 0) {
                    dexFiles.append(':');
                    remoteDexFilesCheck.append(" && ");
                }
                if (needsUpload) {
                    final String remotePath = fileList.add(it);
                    dexFiles.append(remotePath);
                    remoteDexFilesCheck.append("[ -f '").append(remotePath).append("' ]");
                } else {
                    dexFiles.append(path);
                    remoteDexFilesCheck.append("[ -f '").append(path).append("' ]");
                }
            });
            remoteServer.upload("dex2oat inputs", fileList);
            remoteServer.exec("dex2oat inputs check", remoteDexFilesCheck.toString());

            final Path destArtRel;
            final Path destOatRel;
            try {
                destArtRel = getInnerProjectRelativePath(getDestImageFile());
                destOatRel = getInnerProjectRelativePath(getDestOatFile());
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }
            final String remoteDestArt = remoteServer.getRemotePath(destArtRel);
            final String remoteDestOat = remoteServer.getRemotePath(destOatRel);

            remoteServer.exec("prepare output directories", "" +
                    "mkdir -p `dirname " + remoteDestArt + "` && " +
                    "mkdir -p `dirname " + remoteDestOat + "`");

            remoteServer.exec("dex2oat", dex2oatExec + " " +
                    "--instruction-set=" + Arch.validateArchFamily(getArchFamily()) + " " +
                    "--base=0x" + Long.toHexString(getBase()) + " " +
                    "--compiler-backend=" + validateBackend(getCompilerBackend()) + " " +
                    (getEmitDebugInfo() ? "--generate-debug-info" : "--no-generate-debug-info") + " " +
                    "--image=" + remoteDestArt + " " +
                    "--image-classes=" + imageClasses + " " +
                    "--oat-file=" + remoteDestOat + " " +
                    "--dex-file=" + dexFiles
            );

            remoteServer.downloadFile("art", remoteDestArt, getDestImageFile().getParentFile());
            remoteServer.downloadFile("oat", remoteDestOat, getDestOatFile().getParentFile());

        } else {
            exec(spec -> {
                // Set executable
                spec.setExecutable(getDex2oatExec());

                // Set target options
                spec.args("--instruction-set=" + Arch.validateArchFamily(getArchFamily()));
                spec.args("--base=0x" + Long.toHexString(getBase()));

                // Set compiler backend
                spec.args("--compiler-backend=" + validateBackend(getCompilerBackend()));

                // Include or not include ELF symbols in oat file
                if (getEmitDebugInfo()) {
                    spec.args("--generate-debug-info");
                } else {
                    spec.args("--no-generate-debug-info");
                }

                // Set files
                spec.args("--image=" + getDestImageFile().getAbsolutePath());
                spec.args("--image-classes=" + getImageClasses().getAbsolutePath());
                spec.args("--oat-file=" + getDestOatFile().getAbsolutePath());

                // Set inputs
                StringBuilder dexFiles = new StringBuilder();
                getInputFiles().forEach(it -> {
                    if (dexFiles.length() > 0) {
                        dexFiles.append(':');
                    }
                    dexFiles.append(it.getAbsolutePath());
                });
                spec.args("--dex-file=" + dexFiles);
            });
        }
    }

    private Dex dexTaskDep;

    @NotNull
    public Dex getDexTaskDep() {
        return Require.nonNull(dexTaskDep);
    }

    @NotNull
    protected final void setupMoeTask(@NotNull SourceSet sourceSet, @NotNull Mode mode, @NotNull String archFamily) {
        Require.nonNull(sourceSet);
        Require.nonNull(mode);
        Require.nonNull(archFamily);

        setSupportsRemoteBuild(true);

        final MoeExtension ext = getMoeExtension();
        final MoeSDK sdk = getMoeSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "dex2oat", mode.name + "-" + archFamily);

        setDescription("Generates art+oat files (sourceset: " + sourceSet.getName() + ", mode: " + mode.name +
                ", arch-family: " + archFamily + ").");

        // Add dependencies
        final Dex dexTask = getMoePlugin().getTaskBy(Dex.class, sourceSet);
        dexTaskDep = dexTask;
        dependsOn(dexTask);

        // Update convention mapping
        addConvention(CONVENTION_DEX2OAT_EXEC, sdk::getDex2OatExec);
        addConvention(CONVENTION_ARCH_FAMILY, () -> archFamily);
        addConvention(CONVENTION_BASE, () -> {
            if (Arch.FAMILY_ARM.equals(archFamily)) {
                return 0x10000000L;
            } else if (Arch.FAMILY_ARM64.equals(archFamily)) {
                return 0x10000000L;
            } else if (Arch.FAMILY_X86.equals(archFamily)) {
                return 0x40000000L;
            } else if (Arch.FAMILY_X86_64.equals(archFamily)) {
                return 0x40000000L;
            } else {
                throw new GradleException("Unexpected arch family '" + archFamily + "'");
            }
        });
        addConvention(CONVENTION_IMAGE_CLASSES, sdk::getPreloadedClassesFile);
        addConvention(CONVENTION_EMIT_DEBUG_INFO, () -> mode == Mode.DEBUG);
        addConvention(CONVENTION_INPUT_FILES, () -> {
            final Set<File> files = new HashSet<>();
            files.add(dexTask.getDestJar());

            switch (ext.getProguardLevelRaw()) {
                case MoeExtension.PROGUARD_LEVEL_APP:
//                    files.add(sdk.getCoreDex());
                    if (ext.getPlatformDex() != null) {
                        files.add(ext.getPlatformDex());
                    }
                    break;
                case MoeExtension.PROGUARD_LEVEL_PLATFORM:
//                    files.add(sdk.getCoreDex());
                    break;
                case MoeExtension.PROGUARD_LEVEL_ALL:
                    break;
                default:
                    throw new IllegalStateException();
            }

            return files;
        });
        addConvention(CONVENTION_COMPILER_BACKEND, () -> BACKEND_QUICK);
        addConvention(CONVENTION_DEST_IMAGE_FILE, () -> resolvePathInBuildDir(out, "image.art"));
        addConvention(CONVENTION_DEST_OAT_FILE, () -> resolvePathInBuildDir(out, "application.oat"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "Dex2Oat.log"));
    }

    private static String validateBackend(@NotNull String name) {
        Require.nonNull(name);

        for (String backend : ALL_BACKENDS) {
            if (backend.equalsIgnoreCase(name)) {
                return backend;
            }
        }
        throw new GradleException("Unknown backend '" + name + "', supported: " + Arrays.asList(ALL_BACKENDS));
    }
}
