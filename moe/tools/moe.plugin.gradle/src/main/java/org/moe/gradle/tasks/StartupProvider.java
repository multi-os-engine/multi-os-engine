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
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.internal.AnnotationChecker;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarFile;

public class StartupProvider extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_PREREGISTER_FILE = "preregisterFile";

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
    private Object preregisterFile;

    @OutputFile
    @NotNull
    public File getPreregisterFile() {
        return getProject().file(getOrConvention(preregisterFile, CONVENTION_PREREGISTER_FILE));
    }

    @IgnoreUnused
    public void setPreregisterFile(@Nullable Object preregisterFile) {
        this.preregisterFile = preregisterFile;
    }

    @Override
    protected void run() {
        try {
            FileUtils.deleteFileOrFolder(getPreregisterFile());

            try (FileWriter log = new FileWriter(getLogFile(), true);
                 FileWriter txt = new FileWriter(getPreregisterFile())) {
                getInputFiles().forEach(it -> {
                    JarFile file;
                    try {
                        log.append("Checking: ").append(it.getAbsolutePath()).append("\n");
                        file = new JarFile(it);
                    } catch (IOException e) {
                        throw new GradleException("An IOException occurred", e);
                    }
                    file.stream().forEach(entry -> {
                        try {
                            if (!entry.getName().endsWith(".class")) {
                                return;
                            }

                            AnnotationChecker checker = AnnotationChecker.getRegisterOnStartupChecker(file.getInputStream(entry));
                            if (checker.hasAnnotation()) {
                                log.append("Found: ").append(checker.getName()).append("\n");
                                txt.append(checker.getName().replace('/', '.')).append("\n");
                            }
                        } catch (IOException e) {
                            throw new GradleException("An IOException occurred", e);
                        }
                    });
                });
            }
        } catch (IOException e) {
            throw new GradleException("An IOException occurred", e);
        }
    }

    private ProGuard proGuardTaskDep;

    @NotNull
    @IgnoreUnused
    public ProGuard getProGuardTaskDep() {
        return Require.nonNull(proGuardTaskDep);
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName());

        // Create task
        setDescription("Generates preregister.txt file (sourceset: " + sourceSet.getName() + ").");

        // Add dependencies
        final ProGuard proguardTask = getMoePlugin().getTaskBy(ProGuard.class, sourceSet);
        proGuardTaskDep = proguardTask;
        dependsOn(proguardTask);

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES, () -> {
            final Set<File> files = new HashSet<>();
            files.add(proguardTask.getOutJar());
            return files;
        });
        addConvention(CONVENTION_PREREGISTER_FILE, () -> resolvePathInBuildDir(out, "preregister.txt"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "StartupProvider.log"));
    }
}
