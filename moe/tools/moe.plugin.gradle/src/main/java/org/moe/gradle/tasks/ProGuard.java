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
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.Dependency;
import org.gradle.api.artifacts.DependencySet;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.compile.JavaCompile;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ProGuard extends AbstractBaseTask {

    private static final String CONVENTION_PROGUARD_JAR = "proGuardJar";
    private static final String CONVENTION_BASE_CFG_FILE = "baseCfgFile";
    private static final String CONVENTION_APPEND_CFG_FILE = "appendCfgFile";
    private static final String CONVENTION_IN_JARS = "inJars";
    private static final String CONVENTION_LIBRARY_JARS = "libraryJars";
    private static final String CONVENTION_OUT_JAR = "outJar";
    private static final String CONVENTION_COMPOSED_CFG_FILE = "composedCfgFile";

    private static final String MOE_PROGUARD_INJARS_PROPERTY = "moe.proguard.injars";

    @Nullable
    private Object proGuardJar;

    @InputFile
    @NotNull
    public File getProGuardJar() {
        return getProject().file(getOrConvention(proGuardJar, CONVENTION_PROGUARD_JAR));
    }

    @IgnoreUnused
    public void setProGuardJar(@Nullable Object proGuardJar) {
        this.proGuardJar = proGuardJar;
    }

    @Nullable
    private Object baseCfgFile;

    @InputFile
    @NotNull
    public File getBaseCfgFile() {
        return getProject().file(getOrConvention(this.baseCfgFile, CONVENTION_BASE_CFG_FILE));
    }

    @IgnoreUnused
    public void setBaseCfgFile(@Nullable Object baseCfgFile) {
        this.baseCfgFile = baseCfgFile;
    }

    @Nullable
    private Object appendCfgFile;

    @Optional
    @InputFile
    @Nullable
    public File getAppendCfgFile() {
        final Object object = nullableGetOrConvention(appendCfgFile, CONVENTION_APPEND_CFG_FILE);
        return object == null ? null : getProject().file(object);
    }

    @IgnoreUnused
    public void setAppendCfgFile(@Nullable Object appendCfgFile) {
        this.appendCfgFile = appendCfgFile;
    }

    @Nullable
    private Set<Object> inJars;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getInJars() {
        return getProject().files(getOrConvention(inJars, CONVENTION_IN_JARS));
    }

    @IgnoreUnused
    public void setInJars(@Nullable Collection<Object> inJars) {
        this.inJars = inJars == null ? null : new HashSet<>(inJars);
    }

    @Nullable
    private Set<Object> libraryJars;

    @InputFiles
    @NotNull
    public ConfigurableFileCollection getLibraryJars() {
        return getProject().files(getOrConvention(libraryJars, CONVENTION_LIBRARY_JARS));
    }

    @IgnoreUnused
    public void setLibraryJars(@Nullable Set<Object> libraryJars) {
        this.libraryJars = libraryJars == null ? null : new HashSet<>(libraryJars);
    }

    @Nullable
    private Object outJar;

    @OutputFile
    @NotNull
    public File getOutJar() {
        return getProject().file(getOrConvention(outJar, CONVENTION_OUT_JAR));
    }

    @IgnoreUnused
    public void setOutJar(@Nullable Object outJar) {
        this.outJar = outJar;
    }

    @Nullable
    private Object composedCfgFile;

    @OutputFile
    @NotNull
    public File getComposedCfgFile() {
        return getProject().file(getOrConvention(composedCfgFile, CONVENTION_COMPOSED_CFG_FILE));
    }

    @IgnoreUnused
    public void setComposedCfgFile(@Nullable Object composedCfgFile) {
        this.composedCfgFile = composedCfgFile;
    }

    @Override
    protected void run() {
        try {
            FileUtils.deleteFileOrFolder(getOutJar());
        } catch (IOException e) {
            throw new GradleException("an IOException occurred", e);
        }

        composeConfigurationFile();
        javaexec(spec -> {
            spec.setMain("-jar");
            spec.args(getProGuardJar().getAbsolutePath(), "@" + getComposedCfgFile().getAbsolutePath());
        });
    }

    private void composeConfigurationFile() {
        final StringBuilder conf = new StringBuilder();

        // Add injars
        startSection(conf, "Generating -injars");
        getInJars().forEach(it -> {
            if (it.exists()) {
                conf.append("-injars ").append(it.getAbsolutePath()).append("(!**.framework/**,!**.bundle/**)\n");
            } else {
                getProject().getLogger().warn("InJar " + it + " for ProGuard task doesn't exist!");
            }
        });

        // Add outjar
        startSection(conf, "Generating -outjars");
        conf.append("-outjars \"").append(getOutJar().getAbsolutePath()).append("\"\n");

        // Add libraryjars
        startSection(conf, "Generating -libraryjars");
        getLibraryJars().forEach(it -> {
            if (it.exists()) {
                conf.append("-libraryjars ").append(it.getAbsolutePath()).append("\n");
            } else {
                getProject().getLogger().warn("LibraryJar " + it + " for ProGuard task doesn't exist!");
            }
        });

        // Add base configuration
        @NotNull final File baseCfgFile = getBaseCfgFile();
        startSection(conf, "Appending from " + baseCfgFile);
        conf.append(FileUtils.read(baseCfgFile));

        // Add appending configuration
        @Nullable final File appendCfgFile = getAppendCfgFile();
        if (appendCfgFile != null) {
            startSection(conf, "Appending from " + appendCfgFile);
            conf.append(FileUtils.read(appendCfgFile));
        }

        // Save
        FileUtils.write(getComposedCfgFile(), conf.toString());
    }

    private static void startSection(@NotNull final StringBuilder b, @NotNull final String comment) {
        int l = comment.length();
        b.append("\n##");
        for (int i = 0; i < l; ++i)
            b.append('#');
        b.append("\n# ");
        b.append(comment);
        b.append("\n##");
        for (int i = 0; i < l; ++i)
            b.append('#');
        b.append("\n\n");
    }

    private Task classesTaskDep;

    @Nullable
    @IgnoreUnused
    public Task getClassesTaskDep() {
        return classesTaskDep;
    }

    private JavaCompile javaCompileTaskDep;

    @Nullable
    public JavaCompile getJavaCompileTaskDep() {
        return javaCompileTaskDep;
    }

    protected final void setupMoeTask(@NotNull SourceSet sourceSet) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        final Project project = getProject();
        final MoeExtension ext = getMoeExtension();
        final MoeSDK sdk = getMoeSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "proguard");

        setDescription("Generates ProGuarded jar files (sourceset: " + sourceSet.getName() + ").");

        final boolean usesCustomInJars = project.hasProperty(MOE_PROGUARD_INJARS_PROPERTY);
        final JavaCompile javaCompileTask;
        if (!usesCustomInJars) {
            // Add dependencies
            final String classesTaskName;
            final String compileJavaTaskName;
            if (SourceSet.MAIN_SOURCE_SET_NAME.equals(sourceSet.getName())) {
                classesTaskName = JavaPlugin.CLASSES_TASK_NAME;
                compileJavaTaskName = JavaPlugin.COMPILE_JAVA_TASK_NAME;
            } else if (SourceSet.TEST_SOURCE_SET_NAME.equals(sourceSet.getName())) {
                classesTaskName = JavaPlugin.TEST_CLASSES_TASK_NAME;
                compileJavaTaskName = JavaPlugin.COMPILE_TEST_JAVA_TASK_NAME;
            } else {
                throw new GradleException("Unsupported SourceSet " + sourceSet.getName());
            }
            final Task classesTask = project.getTasks().getByName(classesTaskName);
            classesTaskDep = classesTask;
            dependsOn(classesTask);

            javaCompileTask = getMoePlugin().getTaskByName(compileJavaTaskName);
            javaCompileTaskDep = javaCompileTask;
            javaCompileTask.setSourceCompatibility("1.8");
            javaCompileTask.setTargetCompatibility("1.8");
        } else {
            javaCompileTask = null;
        }

        addConvention(CONVENTION_PROGUARD_JAR, sdk::getProGuardJar);
        addConvention(CONVENTION_BASE_CFG_FILE, () -> {
            final File cfg = project.file("proguard.cfg");
            if (cfg.exists() && cfg.isFile()) {
                return cfg;
            }
            switch (ext.getProguardLevelRaw()) {
                case MoeExtension.PROGUARD_LEVEL_APP:
                case MoeExtension.PROGUARD_LEVEL_PLATFORM:
                    return sdk.getProguardCfg();
                case MoeExtension.PROGUARD_LEVEL_ALL:
                    return sdk.getProguardFullCfg();
                default:
                    throw new IllegalStateException();
            }
        });
        addConvention(CONVENTION_APPEND_CFG_FILE, () -> {
            final File cfg = project.file("proguard.append.cfg");
            if (cfg.exists() && cfg.isFile()) {
                return cfg;
            }
            return null; // This is an optional convention.
        });
        addConvention(CONVENTION_IN_JARS, () -> {
            final HashSet<Object> jars = new HashSet<>();

            if (!usesCustomInJars) {
                final Configuration compileConf = project.getConfigurations().getByName(sourceSet.getCompileConfigurationName());
                final DependencySet dependencies = compileConf.getDependencies();
                final Set<File> compileConfFiles = compileConf.files(dependencies.toArray(new Dependency[dependencies.size()]));
                jars.addAll(compileConfFiles);
                jars.add(javaCompileTask.getDestinationDir());

            } else {
                final String injars = (String) project.property(MOE_PROGUARD_INJARS_PROPERTY);
                final String[] split = injars.split(Pattern.quote(File.pathSeparator));
                Arrays.stream(split).forEach(jars::add);
            }

            switch (ext.getProguardLevelRaw()) {
                case MoeExtension.PROGUARD_LEVEL_APP:
                    jars.remove(sdk.getCoreJar());
                    if (ext.getPlatformJar() != null) {
                        jars.remove(ext.getPlatformJar());
                    }
                    break;
                case MoeExtension.PROGUARD_LEVEL_PLATFORM:
                    jars.remove(sdk.getCoreJar());
                    if (ext.getPlatformJar() != null) {
                        jars.add(ext.getPlatformJar());
                    }
                    break;
                case MoeExtension.PROGUARD_LEVEL_ALL:
                    jars.add(sdk.getCoreJar());
                    if (ext.getPlatformJar() != null) {
                        jars.add(ext.getPlatformJar());
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }

            return jars;
        });
        addConvention(CONVENTION_LIBRARY_JARS, () -> {
            final HashSet<Object> jars = new HashSet<>();
            switch (ext.getProguardLevelRaw()) {
                case MoeExtension.PROGUARD_LEVEL_APP:
                    jars.add(sdk.getCoreJar());
                    if (ext.getPlatformJar() != null) {
                        jars.add(ext.getPlatformJar());
                    }
                    break;
                case MoeExtension.PROGUARD_LEVEL_PLATFORM:
                    jars.add(sdk.getCoreJar());
                    break;
                case MoeExtension.PROGUARD_LEVEL_ALL:
                    break;
                default:
                    throw new IllegalStateException();
            }

            if (!project.hasProperty("moe.sdk.skip_java8support_jar")) {
                jars.add(sdk.getJava8SupportJar());
            }

            return jars;
        });
        addConvention(CONVENTION_OUT_JAR, () -> resolvePathInBuildDir(out, "output.jar"));
        addConvention(CONVENTION_COMPOSED_CFG_FILE, () -> resolvePathInBuildDir(out, "configuration.pro"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "ProGuard.log"));
    }
}
