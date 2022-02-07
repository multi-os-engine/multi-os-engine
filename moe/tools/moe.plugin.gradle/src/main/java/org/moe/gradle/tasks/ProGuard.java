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

import kotlin.Unit;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.SourceSet;
import org.moe.common.utils.FileUtilsKt;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.ProGuardOptions;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProGuard extends AbstractBaseTask {

    private static final Logger LOG = Logging.getLogger(ProGuard.class);

    private static final String CONVENTION_PROGUARD_JAR = "proGuardJar";
    private static final String CONVENTION_BASE_CFG_FILE = "baseCfgFile";
    private static final String CONVENTION_APPEND_CFG_FILE = "appendCfgFile";
    private static final String CONVENTION_IN_JARS = "inJars";
    private static final String CONVENTION_EXCLUDE_FILES = "excludeFiles";
    private static final String CONVENTION_LIBRARY_JARS = "libraryJars";
    private static final String CONVENTION_OUT_JAR = "outJar";
    private static final String CONVENTION_COMPOSED_CFG_FILE = "composedCfgFile";
    private static final String CONVENTION_MAPPING_FILE = "mappingFile";
    private static final String CONVENTION_MINIFY_ENABLED = "minifyEnabled";
    private static final String CONVENTION_OBFUSCATION_ENABLED = "obfuscationEnabled";

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
    private Set<String> excludeFiles;

    @Input
    @NotNull
    public Collection<String> getExcludeFiles() {
        return getOrConvention(excludeFiles, CONVENTION_EXCLUDE_FILES);
    }

    @IgnoreUnused
    public void setExcludeFiles(@Nullable Collection<String> excludeFiles) {
        this.excludeFiles = excludeFiles == null ? null : new LinkedHashSet<>(excludeFiles);
    }

    @NotNull
    @Input
    public Collection<String> getComposedExcludeFiles() {
        HashSet<String> result = new LinkedHashSet<>();

        // Add user specified proguard exclusion
        result.addAll(getExcludeFiles());

        // Also combine resource exclusions
        result.addAll(getMoeExtension().packaging.getExcludes());

        return result;
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

    @Nullable
    private Boolean minifyEnabled;

    @IgnoreUnused
    public void setMinifyEnabled(Boolean minifyEnabled) {
        this.minifyEnabled = minifyEnabled;
    }

    @Input
    public boolean isMinifyEnabled() {
        return getOrConvention(minifyEnabled, CONVENTION_MINIFY_ENABLED);
    }

    @Nullable
    private Boolean obfuscationEnabled;

    @IgnoreUnused
    public void setObfuscationEnabled(Boolean obfuscationEnabled) {
        this.obfuscationEnabled = obfuscationEnabled;
    }

    @Input
    public boolean isObfuscationEnabled() {
        return getOrConvention(obfuscationEnabled, CONVENTION_OBFUSCATION_ENABLED);
    }

    @Nullable
    private Object mappingFile;

    @OutputFile
    @Optional
    @Nullable
    public File getMappingFile() {
        Object f = nullableGetOrConvention(mappingFile, CONVENTION_MAPPING_FILE);
        return f == null ? null : getProject().file(f);
    }

    public void setMappingFile(@Nullable Object mappingFile) {
        this.mappingFile = mappingFile;
    }

    private boolean isCustomisedBaseConfig() {
        @NotNull final File baseCfgFile = getBaseCfgFile();
        return !getMoeSDK().getProguardCfg().equals(baseCfgFile)
            && !getMoeSDK().getProguardFullCfg().equals(baseCfgFile);
    }

    @Override
    protected void run() {
        try {
            FileUtils.deleteFileOrFolder(getOutJar());
            File mapping = getMappingFile();
            if (mapping != null) {
                FileUtils.deleteFileOrFolder(mapping);
            }
        } catch (IOException e) {
            throw new GradleException("an IOException occurred", e);
        }

        composeConfigurationFile();
        javaexec(spec -> {
            spec.setMain("-jar");
            spec.args(getProGuardJar().getAbsolutePath(), "@" + getComposedCfgFile().getAbsolutePath());
        });
    }

    private String composeInputFileFilter() {
        StringBuilder sb = new StringBuilder();
        // Add default exclusions
        sb.append("(!**.framework/**,!**.bundle/**,!module-info.class");

        // Add user specified
        for (String excludeFile : getComposedExcludeFiles()) {
            sb.append(",!").append(excludeFile);
        }

        sb.append(")");

        return sb.toString();
    }

    private void composeConfigurationFile() {
        final StringBuilder conf = new StringBuilder();

        // Add injars
        startSection(conf, "Generating -injars");
        String inputFilter = composeInputFileFilter();
        getInJars().forEach(it -> {
            if (it.exists()) {
                conf.append("-injars ").append(it.getAbsolutePath()).append(inputFilter).append('\n');
            } else {
                LOG.debug("inJars file doesn't exist: " + it.getAbsolutePath());
            }
        });

        // Add outjar
        startSection(conf, "Generating -outjars");
        conf.append("-outjars \"").append(getOutJar().getAbsolutePath()).append("\"\n");

        // Add libraryjars
        startSection(conf, "Generating -libraryjars");
        getLibraryJars().forEach(it -> {
            if (it.exists()) {
                conf.append("-libraryjars ").append(it.getAbsolutePath()).append("(!module-info.class)\n");
            } else {
                LOG.debug("libraryJars file doesn't exist: " + it.getAbsolutePath());
            }
        });

        // Add base configuration
        @NotNull final File baseCfgFile = getBaseCfgFile();
        startSection(conf, "Appending from " + baseCfgFile);
        conf.append(FileUtils.read(baseCfgFile));

        startSection(conf, "Shrinking & obfuscation flags");
        if (!isCustomisedBaseConfig()) {
            if (isMinifyEnabled()) {
                conf.append("#-dontshrink\n");
            } else {
                conf.append("-dontshrink\n");
            }

            if (isObfuscationEnabled()) {
                conf.append("#-dontobfuscate\n");
                // Don't use mixed cases names because MacOS file system is case-insenstive by default
                conf.append("-dontusemixedcaseclassnames\n");

                // Save mapping file
                conf.append("-printmapping ").append(getMappingFile().getAbsolutePath()).append("\n");
            } else {
                conf.append("-dontobfuscate\n");
            }
        } else {
            LOG.info("Customised base proguard config file used, ignore minifyEnabled & obfuscationEnabled settings.");
            conf.append("# Ignored as customised base proguard config file is used\n");
        }

        // Add external configuration
        PathMatcher externalCfgMatcher = FileSystems.getDefault().getPathMatcher("glob:META-INF/proguard/*.pro");
        getInJars().forEach(jar-> {
            FileUtilsKt.classpathIterator(jar, (path, inputStream) -> {
                String fullPath;
                if (jar.isFile()) {
                    fullPath = jar.getAbsolutePath() + "!/" + path;
                } else {
                    fullPath = new File(jar, path).getAbsolutePath();
                }
                LOG.debug("Append proguard rule from {}", fullPath);
                startSection(conf, "Appending from " + fullPath);

                try (BufferedReader isr = new BufferedReader(
                    new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
                    String line;
                    while ((line = isr.readLine()) != null) {
                        conf.append(line).append('\n');
                    }
                } catch (IOException e) {
                    throw new GradleException("Failed to read " + fullPath, e);
                }

                return Unit.INSTANCE;
            }, path -> externalCfgMatcher.matches(new File(path).toPath()));
        });

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

    private ClassValidate classValidateTaskDep;

    @Nullable
    @IgnoreUnused
    @Internal
    public ClassValidate getClassValidateTaskDep() {
        return classValidateTaskDep;
    }

    protected final void setupMoeTask(final @NotNull SourceSet sourceSet, final @NotNull Mode mode) {
        Require.nonNull(sourceSet);

        setSupportsRemoteBuild(false);

        final Project project = getProject();
        final MoeExtension ext = getMoeExtension();
        final MoeSDK sdk = getMoeSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName(), "proguard", mode.name);

        setDescription("Generates ProGuarded jar files (sourceset: " + sourceSet.getName() + ", mode: " + mode.name + ").");

        // Add dependencies
        final ClassValidate classValidateTask = getMoePlugin().getTaskBy(ClassValidate.class, sourceSet, mode);
        classValidateTaskDep = classValidateTask;
        dependsOn(classValidateTask);

        addConvention(CONVENTION_PROGUARD_JAR, sdk::getProGuardJar);
        addConvention(CONVENTION_BASE_CFG_FILE, () -> {
            if (ext.proguard.getBaseCfgFile() != null) {
                return ext.proguard.getBaseCfgFile();
            }

            final File cfg = project.file("proguard.cfg");
            if (cfg.exists() && cfg.isFile()) {
                return cfg;
            }
            switch (ext.proguard.getLevelRaw()) {
                case ProGuardOptions.LEVEL_APP:
                case ProGuardOptions.LEVEL_PLATFORM:
                    return sdk.getProguardCfg();
                case ProGuardOptions.LEVEL_ALL:
                    return sdk.getProguardFullCfg();
                default:
                    throw new IllegalStateException();
            }
        });
        addConvention(CONVENTION_APPEND_CFG_FILE, () -> {
            if (ext.proguard.getAppendCfgFile() != null) {
                return ext.proguard.getAppendCfgFile();
            }

            final File cfg = project.file("proguard.append.cfg");
            if (cfg.exists() && cfg.isFile()) {
                return cfg;
            }
            return null; // This is an optional convention.
        });
        addConvention(CONVENTION_IN_JARS, () -> {
            final HashSet<Object> jars = new LinkedHashSet<>();
            jars.add(classValidateTask.getClassesOutputDir());
            jars.addAll(classValidateTask.getInputFiles().getFiles());

            return jars;
        });
        addConvention(CONVENTION_EXCLUDE_FILES, ext.proguard::getExcludeFiles);
        addConvention(CONVENTION_LIBRARY_JARS, () -> {
            final HashSet<Object> jars = new LinkedHashSet<>(
                // Make JDK runtime libraries available for ProGuard
                // because we no longer have all basic runtime classes in core jar.
                getMoePlugin().getGraalVM().getRuntimeLibraries()
            );
            jars.addAll(classValidateTask.getClasspathFiles().getFiles());

            return jars;
        });
        addConvention(CONVENTION_OUT_JAR, () -> resolvePathInBuildDir(out, "output.jar"));
        addConvention(CONVENTION_COMPOSED_CFG_FILE, () -> resolvePathInBuildDir(out, "configuration.pro"));
        addConvention(CONVENTION_MAPPING_FILE, () -> isCustomisedBaseConfig() || !isObfuscationEnabled() ? null : resolvePathInBuildDir(out, "mapping.txt"));
        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "ProGuard.log"));
        addConvention(CONVENTION_MINIFY_ENABLED, ext.proguard::isMinifyEnabled);
        addConvention(CONVENTION_OBFUSCATION_ENABLED, ext.proguard::isObfuscationEnabled);
    }
}
