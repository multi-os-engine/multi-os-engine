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
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.jar.JarEntry;
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

            try (FileWriter log = new FileWriter(getLogFile(), true)) {
                ScanResults results = scanInputs(log);
                writePreregisterFile(log, results);
                writeObjCBindingsFile(log, results);
            }
        } catch (IOException e) {
            throw new GradleException("An IOException occurred", e);
        }
    }

    /**
     * Aggregated state from a single pass over the input jars. The two output
     * files are written from disjoint slices of this struct.
     */
    private static final class ScanResults {
        // Java FQNs (slash form) of every @RegisterOnStartup class, in jar-walk order.
        final List<String> preregister = new ArrayList<>();
        // ObjC name -> Java FQNs (slash form) for hybrid duplicate detection. Only
        // populated for classes where RegisterOnStartupChecker.getObjCClassName()
        // is non-null (i.e. @RegisterOnStartup without @ObjCClassBinding).
        final Map<String, LinkedHashSet<String>> hybridByObjCName = new LinkedHashMap<>();
        // ObjC name -> Java FQNs (dot form) for every @ObjCClassBinding class.
        final Map<String, LinkedHashSet<String>> bindingByObjCName = new LinkedHashMap<>();
    }

    private ScanResults scanInputs(FileWriter log) throws IOException {
        ScanResults r = new ScanResults();
        for (File jarFile : getInputFiles()) {
            log.append("Checking: ").append(jarFile.getAbsolutePath()).append("\n");
            try (JarFile jar = new JarFile(jarFile)) {
                Enumeration<JarEntry> entries = jar.entries();
                while (entries.hasMoreElements()) {
                    JarEntry entry = entries.nextElement();
                    if (!entry.getName().endsWith(".class")) {
                        continue;
                    }
                    try (InputStream in = jar.getInputStream(entry)) {
                        RegisterOnStartupChecker checker =
                            RegisterOnStartupChecker.getRegisterOnStartupChecker(in);
                        if (checker.isRegisterOnStartup()) {
                            r.preregister.add(checker.getJavaClassName());
                            if (checker.getObjCClassName() != null) {
                                r.hybridByObjCName
                                    .computeIfAbsent(checker.getObjCClassName(), k -> new LinkedHashSet<>())
                                    .add(checker.getJavaClassName());
                            }
                        }
                        if (checker.isObjCClassBinding() && checker.getObjCBindingClassName() != null) {
                            r.bindingByObjCName
                                .computeIfAbsent(checker.getObjCBindingClassName(), k -> new LinkedHashSet<>())
                                .add(checker.getJavaClassName().replace('/', '.'));
                        }
                    }
                }
            }
        }
        return r;
    }

    private void writePreregisterFile(FileWriter log, ScanResults r) throws IOException {
        try (FileWriter txt = new FileWriter(getPreregisterFile())) {
            for (String javaName : r.preregister) {
                log.append("Found: ").append(javaName).append("\n");
                txt.append(javaName).append('\n');
            }
        }

        // Hybrid collisions are warned but every class is still emitted: NatJ.register()
        // throws at runtime when two Java classes claim the same ObjC class, and that
        // crash is the user-visible signal.
        warnDuplicates(log, r.hybridByObjCName,
            "is preregistered with multiple hybrid Java classes",
            "this might cause crash at runtime!");
    }

    private void writeObjCBindingsFile(FileWriter log, ScanResults r) throws IOException {
        try (FileWriter txt = new FileWriter(getObjCBindingsFile())) {
            for (Map.Entry<String, LinkedHashSet<String>> entry : r.bindingByObjCName.entrySet()) {
                // The runtime side-table is Map<String,String>; only one Java FQN can
                // win. Pick the first encountered so the result is deterministic.
                String javaName = entry.getValue().iterator().next();
                log.append("Binding: ").append(entry.getKey()).append(" -> ").append(javaName).append("\n");
                txt.append(entry.getKey()).append(':').append(javaName).append('\n');
            }
        }
        warnDuplicates(log, r.bindingByObjCName,
            "has multiple Java @ObjCClassBinding classes",
            "using the first one for lazy resolution!");
    }

    private void warnDuplicates(FileWriter log,
                                Map<String, LinkedHashSet<String>> byObjCName,
                                String midText,
                                String suffix) throws IOException {
        for (Map.Entry<String, LinkedHashSet<String>> entry : byObjCName.entrySet()) {
            if (entry.getValue().size() <= 1) {
                continue;
            }
            String warn = "ObjC class \"" + entry.getKey() + "\" " + midText + ": ["
                + String.join(", ", entry.getValue()) + "], " + suffix;
            getLogger().warn(warn);
            log.append("WARN: ").append(warn).append("\n");
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
