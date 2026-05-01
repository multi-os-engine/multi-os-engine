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
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.internal.RegisterOnStartupChecker;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarFile;

public abstract class StartupProvider extends AbstractBaseTask {

    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_PREREGISTER_FILE = "preregisterFile";
    private static final String CONVENTION_OBJC_BINDINGS_FILE = "objCBindingsFile";

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

    @Nullable
    private Object objCBindingsFile;

    @OutputFile
    @NotNull
    public File getObjCBindingsFile() {
        return getProject().file(getOrConvention(objCBindingsFile, CONVENTION_OBJC_BINDINGS_FILE));
    }

    @IgnoreUnused
    public void setObjCBindingsFile(@Nullable Object objCBindingsFile) {
        this.objCBindingsFile = objCBindingsFile;
    }

    @Override
    protected void run() {
        try {
            FileUtils.deleteFileOrFolder(getPreregisterFile());
            FileUtils.deleteFileOrFolder(getObjCBindingsFile());

            HashMap<String, LinkedHashSet<String>> nativeClassNames = new HashMap<>();
            // ObjC class name -> Java FQNs of every @ObjCClassBinding observed.
            // Used to detect duplicate bindings before writing the mapping file.
            HashMap<String, LinkedHashSet<String>> bindingClassNames = new HashMap<>();
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

                            RegisterOnStartupChecker checker = RegisterOnStartupChecker.getRegisterOnStartupChecker(file.getInputStream(entry));
                            if (checker.isRegisterOnStartup()) {
                                log.append("Found: ").append(checker.getJavaClassName()).append("\n");
                                txt.append(checker.getJavaClassName()).append("\n");

                                if (checker.getObjCClassName() != null) {
                                    nativeClassNames
                                        .computeIfAbsent(checker.getObjCClassName(), k -> new LinkedHashSet<>())
                                        .add(checker.getJavaClassName());
                                }
                            }
                            if (checker.isObjCClassBinding() && checker.getObjCBindingClassName() != null) {
                                bindingClassNames
                                    .computeIfAbsent(checker.getObjCBindingClassName(), k -> new LinkedHashSet<>())
                                    .add(checker.getJavaClassName().replace('/', '.'));
                            }
                        } catch (IOException e) {
                            throw new GradleException("An IOException occurred", e);
                        }
                    });
                });

                nativeClassNames
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().size() > 1)
                    .forEach(entry -> {
                        String warn = "ObjC class \"" + entry.getKey()
                            + "\" is preregistered with multiple hybrid Java classes: ["
                            + String.join(", ", entry.getValue()) + "], this might cause crash at runtime!";
                        getLogger().warn(warn);
                        try {
                            log.append("WARN: ").append(warn);
                        } catch (IOException e) {
                            throw new GradleException("An IOException occurred", e);
                        }
                    });
            }

            try (FileWriter log = new FileWriter(getLogFile(), true);
                 FileWriter txt = new FileWriter(getObjCBindingsFile())) {
                for (Map.Entry<String, LinkedHashSet<String>> entry : bindingClassNames.entrySet()) {
                    String objCName = entry.getKey();
                    LinkedHashSet<String> javaNames = entry.getValue();
                    if (javaNames.size() > 1) {
                        String warn = "ObjC class \"" + objCName
                            + "\" has multiple Java @ObjCClassBinding classes: ["
                            + String.join(", ", javaNames) + "], using the first one for lazy resolution!";
                        getLogger().warn(warn);
                        log.append("WARN: ").append(warn).append("\n");
                    }
                    String javaName = javaNames.iterator().next();
                    log.append("Binding: ").append(objCName).append(" -> ").append(javaName).append("\n");
                    txt.append(objCName).append(':').append(javaName).append('\n');
                }
            }
        } catch (IOException e) {
            throw new GradleException("An IOException occurred", e);
        }
    }

    private R8 r8TaskDep;

    @NotNull
    @IgnoreUnused
    @Internal
    public R8 getR8TaskDep() {
        return Require.nonNull(r8TaskDep);
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet, final @NotNull Mode mode) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "startup-provider", mode.name);

        // Create task
        setDescription("Generates preregister.txt file (sourceset: " + sourceSet.getName() + ", mode: " + mode.name + ").");

        // Add dependencies
        final R8 r8Task = getMoePlugin().getTaskBy(R8.class, sourceSet, mode);
        r8TaskDep = r8Task;
        dependsOn(r8Task);

        // Update convention mapping
        addConvention(CONVENTION_INPUT_FILES, () -> {
            final Set<File> files = new HashSet<>();
            files.add(r8Task.getOutJar());
            return files;
        });
        addConvention(CONVENTION_PREREGISTER_FILE, () -> resolvePathInBuildDir(out, "preregister.txt"));
        addConvention(CONVENTION_OBJC_BINDINGS_FILE, () -> resolvePathInBuildDir(out, "objc-bindings.txt"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "StartupProvider.log"));
    }
}
