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
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.StringUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Retrolambda extends AbstractBaseTask {

    private static final String CONVENTION_RETROLAMBDA_JAR = "retrolambdaJar";
    private static final String CONVENTION_INPUT_FILES = "inputFiles";
    private static final String CONVENTION_CLASSPATH_FILES = "classpathFiles";
    private static final String CONVENTION_DEFAULT_METHODS = "defaultMethods";
    private static final String CONVENTION_NATJ_SUPPORT = "natjSupport";
    private static final String CONVENTION_EXPANDED_CLASSES_DIR = "expandedClassesDir";
    private static final String CONVENTION_OUTPUT_DIR = "outputDir";

    @Nullable
    private Object retrolambdaJar;

    @InputFile
    @NotNull
    public File getRetrolambdaJar() {
        return getProject().file(getOrConvention(retrolambdaJar, CONVENTION_RETROLAMBDA_JAR));
    }

    @IgnoreUnused
    public void setRetrolambdaJar(@Nullable Object retrolambdaJar) {
        this.retrolambdaJar = retrolambdaJar;
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
    private Set<Object> classpathFiles;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getClasspathFiles() {
        return getProject().files(getOrConvention(classpathFiles, CONVENTION_CLASSPATH_FILES));
    }

    @IgnoreUnused
    public void setClasspathFiles(@Nullable Collection<Object> classpathFiles) {
        this.classpathFiles = classpathFiles == null ? null : new HashSet<>(classpathFiles);
    }

    @Nullable
    private Boolean defaultMethods;

    @Input
    @NotNull
    public Boolean getDefaultMethods() {
        return getOrConvention(defaultMethods, CONVENTION_DEFAULT_METHODS);
    }

    @IgnoreUnused
    public void setDefaultMethods(@Nullable Boolean defaultMethods) {
        this.defaultMethods = defaultMethods;
    }

    @Nullable
    private Boolean natjSupport;

    @Input
    @NotNull
    public Boolean getNatjSupport() {
        return getOrConvention(natjSupport, CONVENTION_NATJ_SUPPORT);
    }

    @IgnoreUnused
    public void setNatjSupport(@Nullable Boolean natjSupport) {
        this.natjSupport = natjSupport;
    }

    @Nullable
    private Object expandedClassesDir;

    @NotNull
    public File getExpandedClassesDir() {
        return getProject().file(getOrConvention(expandedClassesDir, CONVENTION_EXPANDED_CLASSES_DIR));
    }

    @IgnoreUnused
    public void setExpandedClassesDir(@Nullable Object expandedClassesDir) {
        this.expandedClassesDir = expandedClassesDir;
    }

    @Nullable
    private File outputDir;

    @OutputDirectory
    @NotNull
    public File getOutputDir() {
        return getProject().file(getOrConvention(outputDir, CONVENTION_OUTPUT_DIR));
    }

    @IgnoreUnused
    public void setOutputDir(@NotNull File outputDir) {
        this.outputDir = outputDir;
    }

    @Override
    protected void run() {
        // Clean expanded classes dir
        try {
            FileUtils.deleteFileOrFolder(getExpandedClassesDir());
        } catch (IOException e) {
            throw new GradleException("Failed to delete directory " + getExpandedClassesDir().getAbsolutePath(), e);
        }

        // Clean output dir
        try {
            FileUtils.deleteFileOrFolder(getOutputDir());
        } catch (IOException e) {
            throw new GradleException("Failed to delete directory " + getOutputDir().getAbsolutePath(), e);
        }

        // Copy class files from jar
        getProject().copy(spec -> {
            getInputFiles().forEach(it -> spec.from(it.isDirectory() ? it : getProject().zipTree(it)));
            spec.include("**/*.class");
            spec.into(getExpandedClassesDir());
        });

        // Run Retrolambda
        javaexec(spec -> {
            spec.systemProperty("retrolambda.inputDir", getExpandedClassesDir().getAbsolutePath());
            spec.systemProperty("retrolambda.classpath", StringUtils.compose(() -> {
                final ArrayList<File> files = new ArrayList<>(getClasspathFiles().getFiles());
                files.add(0, getExpandedClassesDir()); // Add input dir to classpath
                final List<String> paths = files.stream().map(File::getAbsolutePath).collect(Collectors.toList());
                return org.apache.commons.lang3.StringUtils.join(paths, File.pathSeparator);
            }));
            spec.systemProperty("retrolambda.defaultMethods", getDefaultMethods());
            spec.systemProperty("retrolambda.natjSupport", getNatjSupport());
            spec.systemProperty("retrolambda.outputDir", getOutputDir().getAbsolutePath());
            spec.setMain("-jar");
            spec.args(getRetrolambdaJar().getAbsolutePath());
        });
    }

    private ProGuard proGuardTaskDep;

    @NotNull
    public ProGuard getProGuardTaskDep() {
        return Require.nonNull(proGuardTaskDep);
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        final MoeExtension ext = getMoeExtension();
        final MoeSDK sdk = getMoeSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "retro");

        setDescription("Generates retrolambda files (sourceset: " + sourceSet.getName() + ").");

        // Add dependencies
        final ProGuard proGuardTask = getMoePlugin().getTaskBy(ProGuard.class, sourceSet);
        proGuardTaskDep = proGuardTask;
        dependsOn(proGuardTask);

        // Update convention mapping
        addConvention(CONVENTION_RETROLAMBDA_JAR, sdk::getRetrolambdaJar);
        addConvention(CONVENTION_INPUT_FILES, () -> {
            final HashSet<Object> files = new HashSet<>();
            files.add(proGuardTask.getOutJar());
            return files;
        });
        addConvention(CONVENTION_CLASSPATH_FILES, () -> {
            final HashSet<Object> files = new HashSet<>();
            files.add(proGuardTask.getLibraryJars());
            return files;
        });
        addConvention(CONVENTION_DEFAULT_METHODS, () -> Boolean.TRUE);
        addConvention(CONVENTION_NATJ_SUPPORT, () -> !ext.skipPlatformSupport());
        addConvention(CONVENTION_EXPANDED_CLASSES_DIR, () -> resolvePathInBuildDir(out, "input"));
        addConvention(CONVENTION_OUTPUT_DIR, () -> resolvePathInBuildDir(out, "output"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "Retrolambda.log"));
    }
}
