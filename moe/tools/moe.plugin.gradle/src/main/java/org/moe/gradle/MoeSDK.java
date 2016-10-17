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

package org.moe.gradle;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ExternalDependency;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.artifacts.repositories.ArtifactRepository;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.TaskUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

public class MoeSDK {
    private static final Logger LOG = LoggerFactory.getLogger(MoeSDK.class);

    private static final String MOE_SDK_CONFIGURATION_NAME = "moeMavenSDK";
    private static final String MOE_LOCAL_SDK_PROPERTY = "moe.sdk.localbuild";
    private static final String MOE_LOCAL_SDK_ENV = "MOE_SDK_LOCALBUILD";
    private static final String MOE_GROUP_ID = "org.multi-os-engine";
    private static final String MOE_SDK_ARTIFACT_ID = "moe-sdk";

    public static final Path USER_MOE_HOME;

    static {
        final String user_moe_home = System.getenv("USER_MOE_HOME");
        if (user_moe_home != null && user_moe_home.length() > 0) {
            USER_MOE_HOME = new File(user_moe_home).toPath();
        } else {
            USER_MOE_HOME = new File(System.getProperty("user.home")).toPath().resolve(".moe");
        }
    }

    private static final int DIR = 1 << 0;
    private static final int FIL = 1 << 1;
    private static final int EXE = 1 << 2;

    @NotNull
    public final String pluginVersion;

    @NotNull
    public final String sdkVersion;

    private MoeSDK(@NotNull String pluginVersion, @NotNull String sdkVersion) {
        this.pluginVersion = Require.nonNull(pluginVersion);
        this.sdkVersion = Require.nonNull(sdkVersion);
    }

    public static MoeSDK setup(@NotNull AbstractMoePlugin plugin) {
        Require.nonNull(plugin);

        final String pluginVersion;
        final String sdkVersion;
        {
            // Get SDK version from moe.properties
            final Properties props = new Properties();
            try {
                props.load(MoeSDK.class.getResourceAsStream("moe.properties"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            pluginVersion = props.getProperty("MOE-Plugin-Version");
            sdkVersion = props.getProperty("MOE-SDK-Version");
        }
        if (pluginVersion == null || pluginVersion.length() == 0) {
            throw new GradleException("MOE plugin version is undefined");
        }
        if (sdkVersion == null || sdkVersion.length() == 0) {
            throw new GradleException("MOE SDK version is undefined");
        }

        final MoeSDK sdk = new MoeSDK(pluginVersion, sdkVersion);
        final Project project = plugin.getProject();

        // Check for overriding property
        if (project.hasProperty(MOE_LOCAL_SDK_PROPERTY)) {
            LOG.info("Using custom local MOE SDK");
            final Object property = project.property(MOE_LOCAL_SDK_PROPERTY);
            if (!(property instanceof String)) {
                throw new GradleException("Value of " + MOE_LOCAL_SDK_PROPERTY + " property is not a String");
            }
            final Path path = Paths.get((String)property);
            sdk.validatePartialSDK(path, true);
            sdk.completePartialSDK(project, path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        // Check for overriding environment variable
        if (System.getenv(MOE_LOCAL_SDK_ENV) != null) {
            LOG.info("Using custom local MOE SDK (env)");
            final Path path = Paths.get(System.getenv(MOE_LOCAL_SDK_ENV));
            sdk.validatePartialSDK(path, true);
            sdk.completePartialSDK(project, path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        if (plugin.getProject().file("moe.sdk.localbuild").exists()) {
            LOG.info("Using custom local MOE SDK (file)");
            final Path path = Paths.get(FileUtils.read(plugin.getProject().file("moe.sdk.localbuild")).trim());
            sdk.validatePartialSDK(path, true);
            sdk.completePartialSDK(project, path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        // Use configuration
        LOG.info("Using Maven-based MOE SDK");

        // Prepare USER_MOE_HOME
        if (!USER_MOE_HOME.toFile().exists() && !USER_MOE_HOME.toFile().mkdir()) {
            throw new GradleException("Failed to create directory at " + USER_MOE_HOME);
        }

        // Check for pre-installed SDK
        final Path SDK_PATH = USER_MOE_HOME.resolve("moe-sdk-" + sdkVersion);
        if (SDK_PATH.toFile().exists()) {
            sdk.validateCompleteSDK(SDK_PATH, false);
            sdk.bakeSDKPaths(SDK_PATH);
            return sdk;
        }

        // Prepare temp dir by removing old tmp directory and re-creating it
        System.out.println("Installing MOE SDK, this may take a few minutes...");
        final Path TEMP_SDK_PATH = USER_MOE_HOME.resolve("moe-sdk-" + sdkVersion + ".tmp");
        if (TEMP_SDK_PATH.toFile().exists()) {
            try {
                FileUtils.deleteFileOrFolder(TEMP_SDK_PATH);
            } catch (IOException e) {
                throw new GradleException("Failed to delete directory " + TEMP_SDK_PATH, e);
            }
        }
        if (!TEMP_SDK_PATH.toFile().mkdir()) {
            throw new GradleException("Failed to create directory at " + TEMP_SDK_PATH);
        }

        // Get or create configuration
        final File file = sdk.downloadSDK(project, sdkVersion);

        // Extract zip into the temp directory
        project.copy(spec -> {
            spec.from(project.zipTree(file));
            spec.into(TEMP_SDK_PATH.toFile());
        });

        // Validate files
        sdk.validatePartialSDK(TEMP_SDK_PATH, false);

        // Process SDK
        sdk.completePartialSDK(project, TEMP_SDK_PATH, false);

        // Move the SDK into place
        if (!TEMP_SDK_PATH.toFile().renameTo(SDK_PATH.toFile())) {
            throw new GradleException("Failed to move the MOE SDK into its final place");
        }
        sdk.bakeSDKPaths(SDK_PATH);
        return sdk;
    }

    private void completePartialSDK(@NotNull Project project, @NotNull Path path, boolean isLocalSDK) {
        final ASync ios = new ASync(() -> {
            final File cachedMD5File = path.resolve("sdk/moe-ios.jar.md5").toFile();
            final File md5CheckInputFile = path.resolve("sdk/moe-ios.jar").toFile();

            final AtomicReference<String> calculatedMD5Ref = new AtomicReference<>();
            if (checkComponentUpToDate(md5CheckInputFile, cachedMD5File, calculatedMD5Ref)) {
                return;
            }

            LOG.info("Extracting retrolambda on moe-ios.jar");
            project.copy(spec -> {
                spec.from(project.zipTree(md5CheckInputFile));
                spec.into(path.resolve("sdk/moe-ios-jar.dir").toFile());
            });

            LOG.info("Running retrolambda on moe-ios.jar");
            TaskUtils.javaexec(project, spec -> {
                spec.systemProperty("retrolambda.inputDir", path.resolve("sdk/moe-ios-jar.dir"));
                spec.systemProperty("retrolambda.classpath", path.resolve("sdk/moe-core.jar"));
                spec.systemProperty("retrolambda.defaultMethods", "true");
                spec.systemProperty("retrolambda.outputDir", path.resolve("sdk/moe-ios-retro.dir"));
                spec.setMain("-jar");
                spec.args(path.resolve("tools/retrolambda.jar").toFile());
            });

            LOG.info("Creating moe-ios-retro.jar");
            TaskUtils.exec(project, spec -> {
                final Path wdir = path.resolve("sdk/moe-ios-retro.dir");
                spec.setWorkingDir(wdir.toFile());
                spec.setCommandLine("jar", "-cvf", path.resolve("sdk/moe-ios-retro.jar"), wdir.resolve("."));
            });

            LOG.info("Cleaning up temp files after moe-ios-retro.jar");
            try {
                FileUtils.deleteFileOrFolder(path.resolve("sdk/moe-ios-jar.dir"));
            } catch (IOException ex) {
                LOG.warn(ex.getMessage());
            }
            try {
                FileUtils.deleteFileOrFolder(path.resolve("sdk/moe-ios-retro.dir"));
            } catch (IOException ex) {
                LOG.warn(ex.getMessage());
            }

            LOG.info("Created moe-ios-retro.jar");

            LOG.info("Running dx on moe-ios-retro.jar");

            final List<Object> cmd = new ArrayList<>();
            cmd.add("--dex");
            cmd.add("--output");
            cmd.add(path.resolve("sdk/moe-ios-retro-dex.jar"));
            cmd.add("--core-library");
            cmd.add("--multi-dex");
            cmd.add(path.resolve("sdk/moe-ios-retro.jar"));

            if (Os.isFamily(Os.FAMILY_WINDOWS)) {
                TaskUtils.javaexec(project, spec -> {
                    spec.setMain("-jar");
                    spec.args(path.resolve("tools/dx.jar").toFile());
                    spec.args(cmd);
                    System.out.println(spec.getCommandLine());
                });
            } else {
                TaskUtils.exec(project, spec -> {
                    spec.setExecutable(path.resolve("tools/dx").toFile());
                    spec.args(cmd);
                });
            }

            LOG.info("Created moe-ios-retro-dex.jar");
            FileUtils.write(cachedMD5File, calculatedMD5Ref.get());
        });

        final ASync core = new ASync(() -> {
            final File cachedMD5File = path.resolve("sdk/moe-core.jar.md5").toFile();
            final File md5CheckInputFile = path.resolve("sdk/moe-core.jar").toFile();

            final AtomicReference<String> calculatedMD5Ref = new AtomicReference<>();
            if (checkComponentUpToDate(md5CheckInputFile, cachedMD5File, calculatedMD5Ref)) {
                return;
            }

            LOG.info("Running dx on moe-core.jar");

            final List<Object> cmd = new ArrayList<>();
            cmd.add("--dex");
            cmd.add("--output");
            cmd.add(path.resolve("sdk/moe-core.dex"));
            cmd.add("--core-library");
            cmd.add(path.resolve("sdk/moe-core.jar"));

            if (Os.isFamily(Os.FAMILY_WINDOWS)) {
                TaskUtils.javaexec(project, spec -> {
                    spec.setMain("-jar");
                    spec.args(path.resolve("tools/dx.jar").toFile());
                    spec.args(cmd);
                    System.out.println(spec.getCommandLine());
                });
            } else {
                TaskUtils.exec(project, spec -> {
                    spec.setExecutable(path.resolve("tools/dx").toFile());
                    spec.args(cmd);
                });
            }

            LOG.info("Created moe-core.dex");
            FileUtils.write(cachedMD5File, calculatedMD5Ref.get());
        });

        final ASync junit = new ASync(() -> {
            final File cachedMD5File = path.resolve("sdk/moe-ios-junit.jar.md5").toFile();
            final File md5CheckInputFile = path.resolve("sdk/moe-ios-junit.jar").toFile();

            final AtomicReference<String> calculatedMD5Ref = new AtomicReference<>();
            if (checkComponentUpToDate(md5CheckInputFile, cachedMD5File, calculatedMD5Ref)) {
                return;
            }

            LOG.info("Running dx on moe-ios-junit.jar");

            final List<Object> cmd = new ArrayList<>();
            cmd.add("--dex");
            cmd.add("--output");
            cmd.add(path.resolve("sdk/moe-ios-junit.dex"));
            cmd.add("--core-library");
            cmd.add(path.resolve("sdk/moe-ios-junit.jar"));

            if (Os.isFamily(Os.FAMILY_WINDOWS)) {
                TaskUtils.javaexec(project, spec -> {
                    spec.setMain("-jar");
                    spec.args(path.resolve("tools/dx.jar").toFile());
                    spec.args(cmd);
                    System.out.println(spec.getCommandLine());
                });
            } else {
                TaskUtils.exec(project, spec -> {
                    spec.setExecutable(path.resolve("tools/dx").toFile());
                    spec.args(cmd);
                });
            }

            LOG.info("Created moe-ios-junit.dex");
            FileUtils.write(cachedMD5File, calculatedMD5Ref.get());
        });

        // Wait for all tasks to complete
        ios.join();
        core.join();
        junit.join();

        validateCompleteSDK(path, isLocalSDK);
    }

    private boolean checkComponentUpToDate(File input, File md5file, AtomicReference<String> out) {
        final String calculatedMD5;
        try {
            calculatedMD5 = DigestUtils.md5Hex(new FileInputStream(input)).trim();
        } catch (IOException ignore) {
            throw new GradleException(ignore.getMessage(), ignore);
        }
        out.set(calculatedMD5);

        if (!md5file.exists()) {
            return false;
        }
        final String cachedMD5 = FileUtils.read(md5file);
        return cachedMD5.length() != 0 && cachedMD5.trim().equalsIgnoreCase(calculatedMD5);
    }

    private static class ASync {
        @NotNull
        final Thread worker;

        ASync(@NotNull Runnable task) {
            worker = new Thread(Require.nonNull(task));
            worker.start();
        }

        void join() {
            try {
                worker.join();
            } catch (InterruptedException e) {
                throw new GradleException("Failed to join worker thread", e);
            }
        }
    }

    @NotNull
    private File downloadSDK(@NotNull Project project, String version) {
        Require.nonNull(project);
        Require.nonNull(version);

        final String desc = MOE_GROUP_ID + ":" + MOE_SDK_ARTIFACT_ID + ":" + version + "@zip";
        LOG.info("Downloading dependency " + desc);

        // Get or create configuration
        Configuration configuration;
        try {
            configuration = project.getConfigurations().getByName(MOE_SDK_CONFIGURATION_NAME);
        } catch (UnknownConfigurationException ex) {
            configuration = project.getConfigurations().create(MOE_SDK_CONFIGURATION_NAME);
        }

        // Create an external dependency
        final ExternalDependency dependency = (ExternalDependency)project.getDependencies().create(desc);
        configuration.getDependencies().add(dependency);

        // Add repositories from buildscript to be able to download the SDK
        Set<ArtifactRepository> addedRepositories = new HashSet<>();
        project.getBuildscript().getRepositories().forEach(repository -> {
            if (!project.getRepositories().contains(repository)) {
                project.getRepositories().add(repository);
                addedRepositories.add(repository);
            }
        });
        project.getRepositories().maven(repo -> {
            repo.setUrl("https://dl.bintray.com/multi-os-engine/maven/");
        });

        // Retrieve files
        final Set<File> files;
        try {
            files = configuration.files(dependency);
        } finally {
            // Remove added repositories
            project.getRepositories().removeAll(addedRepositories);
        }

        // Return the SDK
        return Require.sizeEQ(files, 1, "Unexpected number of files in MOE SDK").iterator().next();
    }

    private void validatePartialSDK(@NotNull Path path, boolean isLocalSDK) {
        Require.nonNull(path);

        try {
            validate(DIR, path, "");
            validate(FIL, path, "sdk/moe-core.jar");
            validate(FIL, path, "sdk/moe-ios-javadoc.jar");
            validate(FIL, path, "sdk/moe-ios-junit.jar");
            validate(FIL, path, "sdk/moe-ios.jar");
            if (!isLocalSDK) {
                validate(DIR, path, "sdk/iphoneos/MOE.framework");
                validate(DIR, path, "sdk/iphonesimulator/MOE.framework");
            }
            validate(FIL | EXE, path, "tools/dex2oat");
            validate(FIL, path, "tools/dx.jar");
            validate(FIL, path, "tools/ios-device.jar");
            validate(FIL, path, "tools/java8support.jar");
            validate(DIR, path, "tools/macosx/x86_64");
            validate(FIL, path, "tools/preloaded-classes");
            validate(FIL, path, "tools/proguard-full.cfg");
            validate(FIL, path, "tools/proguard.cfg");
            validate(FIL, path, "tools/proguard.jar");
            validate(FIL, path, "tools/retrolambda.jar");
            validate(FIL | EXE, path, "tools/simlauncher");
            validate(DIR, path, "tools/windows/x86_64");
            validate(FIL, path, "tools/wrapnatjgen.jar");
            validate(FIL, path, "tools/gradlew.zip");
        } catch (IOException ex) {
            LOG.error("Error: failed to validate MOE SDK, " + ex.getMessage());
            throw new GradleException("MOE SDK is probably damaged, please remove it manually from " + path);
        }
    }

    private void validateCompleteSDK(@NotNull Path path, boolean isLocalSDK) {
        Require.nonNull(path);

        validatePartialSDK(path, isLocalSDK);
        try {
            validate(FIL, path, "sdk/moe-core.dex");
            validate(FIL, path, "sdk/moe-ios-junit.dex");
            validate(FIL, path, "sdk/moe-ios-retro.jar");
            validate(FIL, path, "sdk/moe-ios-retro-dex.jar");
        } catch (IOException ex) {
            LOG.error("Error: failed to validate MOE SDK, " + ex.getMessage());
            throw new GradleException("MOE SDK is probably damaged, please remove it manually from " + path);
        }
    }

    private void validate(int type, @NotNull Path path, @NotNull String sub) throws IOException {
        Require.nonNull(path);
        Require.nonNull(sub);

        final Path fullPath = sub.length() == 0 ? path : path.resolve(sub);
        final File file = fullPath.toFile();
        if (!file.exists()) {
            throw new IOException("no filesystem entry exists at " + file.getAbsolutePath());
        }
        if ((type & DIR) != 0 && !file.isDirectory()) {
            throw new IOException("expected a directory at " + file.getAbsolutePath());
        }
        if ((type & FIL) != 0 && !file.isFile()) {
            throw new IOException("expected a file at " + file.getAbsolutePath());
        }
        if ((type & EXE) != 0 && !file.canExecute() && !file.setExecutable(true)) {
            throw new IOException("file is not executable at " + file.getAbsolutePath());
        }
    }

    private @Nullable File MOE_SDK_ROOT;
    private @Nullable File MOE_SDK_SDK_DIR;
    private @Nullable File MOE_SDK_TOOLS_DIR;
    private @Nullable File MOE_SDK_CORE_JAR;
    private @Nullable File MOE_SDK_CORE_DEX;
    private @Nullable File MOE_SDK_IOS_JAVADOC_JAR;
    private @Nullable File MOE_SDK_IOS_JUNIT_JAR;
    private @Nullable File MOE_SDK_IOS_JUNIT_DEX;
    private @Nullable File MOE_SDK_IOS_JAR;
    private @Nullable File MOE_SDK_IOS_RETRO_JAR;
    private @Nullable File MOE_SDK_IOS_RETRO_DEX;
    private @Nullable File MOE_SDK_DEX2OAT_EXEC;
    private @Nullable File MOE_SDK_DX_JAR;
    private @Nullable File MOE_SDK_IOS_DEVICE_JAR;
    private @Nullable File MOE_SDK_JAVA8SUPPORT_JAR;
    private @Nullable File MOE_SDK_MACOS_X86_64_SUPPORT;
    private @Nullable File MOE_SDK_PRELOADEDCLASSES_FILE;
    private @Nullable File MOE_SDK_PROGUARDFULL_CFG;
    private @Nullable File MOE_SDK_PROGUARD_CFG;
    private @Nullable File MOE_SDK_PROGUARD_JAR;
    private @Nullable File MOE_SDK_RETROLAMBDA_JAR;
    private @Nullable File MOE_SDK_SIMLAUNCHER_EXEC;
    private @Nullable File MOE_SDK_WINDOWS_X86_64_SUPPORT;
    private @Nullable File MOE_SDK_NATJGEN_JAR;
    private @Nullable File MOE_SDK_GRADLEW_ZIP;

    private void bakeSDKPaths(@NotNull Path path) {
        MOE_SDK_ROOT = path.toFile();
        MOE_SDK_SDK_DIR = path.resolve("sdk").toFile();
        MOE_SDK_TOOLS_DIR = path.resolve("tools").toFile();
        MOE_SDK_CORE_JAR = path.resolve("sdk/moe-core.jar").toFile();
        MOE_SDK_CORE_DEX = path.resolve("sdk/moe-core.dex").toFile();
        MOE_SDK_IOS_JAVADOC_JAR = path.resolve("sdk/moe-ios-javadoc.jar").toFile();
        MOE_SDK_IOS_JUNIT_JAR = path.resolve("sdk/moe-ios-junit.jar").toFile();
        MOE_SDK_IOS_JUNIT_DEX = path.resolve("sdk/moe-ios-junit.dex").toFile();
        MOE_SDK_IOS_JAR = path.resolve("sdk/moe-ios.jar").toFile();
        MOE_SDK_IOS_RETRO_JAR = path.resolve("sdk/moe-ios-retro.jar").toFile();
        MOE_SDK_IOS_RETRO_DEX = path.resolve("sdk/moe-ios-retro-dex.jar").toFile();
        MOE_SDK_DEX2OAT_EXEC = path.resolve("tools/dex2oat").toFile();
        MOE_SDK_DX_JAR = path.resolve("tools/dx.jar").toFile();
        MOE_SDK_IOS_DEVICE_JAR = path.resolve("tools/ios-device.jar").toFile();
        MOE_SDK_JAVA8SUPPORT_JAR = path.resolve("tools/java8support.jar").toFile();
        MOE_SDK_MACOS_X86_64_SUPPORT = path.resolve("tools/macosx/x86_64").toFile();
        MOE_SDK_PRELOADEDCLASSES_FILE = path.resolve("tools/preloaded-classes").toFile();
        MOE_SDK_PROGUARDFULL_CFG = path.resolve("tools/proguard-full.cfg").toFile();
        MOE_SDK_PROGUARD_CFG = path.resolve("tools/proguard.cfg").toFile();
        MOE_SDK_PROGUARD_JAR = path.resolve("tools/proguard.jar").toFile();
        MOE_SDK_RETROLAMBDA_JAR = path.resolve("tools/retrolambda.jar").toFile();
        MOE_SDK_SIMLAUNCHER_EXEC = path.resolve("tools/simlauncher").toFile();
        MOE_SDK_WINDOWS_X86_64_SUPPORT = path.resolve("tools/windows/x86_64").toFile();
        MOE_SDK_NATJGEN_JAR = path.resolve("tools/wrapnatjgen.jar").toFile();
        MOE_SDK_GRADLEW_ZIP = path.resolve("tools/gradlew.zip").toFile();
    }

    @NotNull
    public File getRoot() {
        return safeVariable(MOE_SDK_ROOT, "MOE_SDK_ROOT");
    }

    @NotNull
    @IgnoreUnused
    public File getSDKDir() {
        return safeVariable(MOE_SDK_SDK_DIR, "MOE_SDK_SDK_DIR");
    }

    @NotNull
    public File getToolsDir() {
        return safeVariable(MOE_SDK_TOOLS_DIR, "MOE_SDK_TOOLS_DIR");
    }

    @NotNull
    public File getCoreJar() {
        return safeVariable(MOE_SDK_CORE_JAR, "MOE_SDK_CORE_JAR");
    }

    @NotNull
    public File getCoreDex() {
        return safeVariable(MOE_SDK_CORE_DEX, "MOE_SDK_CORE_DEX");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSJavadocJar() {
        return safeVariable(MOE_SDK_IOS_JAVADOC_JAR, "MOE_SDK_IOS_JAVADOC_JAR");
    }

    @NotNull
    public File getiOSJUnitJar() {
        return safeVariable(MOE_SDK_IOS_JUNIT_JAR, "MOE_SDK_IOS_JUNIT_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSJUnitDex() {
        return safeVariable(MOE_SDK_IOS_JUNIT_DEX, "MOE_SDK_IOS_JUNIT_DEX");
    }

    @NotNull
    private File getiOSJar() {
        return safeVariable(MOE_SDK_IOS_JAR, "MOE_SDK_IOS_JAR");
    }

    @NotNull
    @IgnoreUnused
    private File getiOSRetroJar() {
        return safeVariable(MOE_SDK_IOS_RETRO_JAR, "MOE_SDK_IOS_RETRO_JAR");
    }

    @NotNull
    private File getiOSRetroDex() {
        return safeVariable(MOE_SDK_IOS_RETRO_DEX, "MOE_SDK_IOS_RETRO_DEX");
    }

    @NotNull
    public File getDex2OatExec() {
        return safeVariable(MOE_SDK_DEX2OAT_EXEC, "MOE_SDK_DEX2OAT_EXEC");
    }

    @NotNull
    public File getDxJar() {
        return safeVariable(MOE_SDK_DX_JAR, "MOE_SDK_DX_JAR");
    }

    @NotNull
    public File getiOSDeviceJar() {
        return safeVariable(MOE_SDK_IOS_DEVICE_JAR, "MOE_SDK_IOS_DEVICE_JAR");
    }

    @NotNull
    public File getJava8SupportJar() {
        return safeVariable(MOE_SDK_JAVA8SUPPORT_JAR, "MOE_SDK_JAVA8SUPPORT_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getMacOS_X86_64Support() {
        return safeVariable(MOE_SDK_MACOS_X86_64_SUPPORT, "MOE_SDK_MACOS_X86_64_SUPPORT");
    }

    @NotNull
    public File getPreloadedClassesFile() {
        return safeVariable(MOE_SDK_PRELOADEDCLASSES_FILE, "MOE_SDK_PRELOADEDCLASSES_FILE");
    }

    @NotNull
    public File getProguardFullCfg() {
        return safeVariable(MOE_SDK_PROGUARDFULL_CFG, "MOE_SDK_PROGUARDFULL_CFG");
    }

    @NotNull
    public File getProguardCfg() {
        return safeVariable(MOE_SDK_PROGUARD_CFG, "MOE_SDK_PROGUARD_CFG");
    }

    @NotNull
    public File getProGuardJar() {
        return safeVariable(MOE_SDK_PROGUARD_JAR, "MOE_SDK_PROGUARD_JAR");
    }

    @NotNull
    public File getRetrolambdaJar() {
        return safeVariable(MOE_SDK_RETROLAMBDA_JAR, "MOE_SDK_RETROLAMBDA_JAR");
    }

    @NotNull
    public File getSimlauncherExec() {
        return safeVariable(MOE_SDK_SIMLAUNCHER_EXEC, "MOE_SDK_SIMLAUNCHER_EXEC");
    }

    @NotNull
    @IgnoreUnused
    public File getWindows_X86_64Support() {
        return safeVariable(MOE_SDK_WINDOWS_X86_64_SUPPORT, "MOE_SDK_WINDOWS_X86_64_SUPPORT");
    }

    @NotNull
    @IgnoreUnused
    public File getNatJGenJar() {
        return safeVariable(MOE_SDK_NATJGEN_JAR, "MOE_SDK_NATJGEN_JAR");
    }

    @NotNull
    public File getGradlewZip() {
        return safeVariable(MOE_SDK_GRADLEW_ZIP, "MOE_SDK_GRADLEW_ZIP");
    }

    @NotNull
    public File getPlatformJar(final @NotNull MoePlatform platform) {
        if (platform == MoePlatform.IOS) {
            return getiOSJar();
        }
        throw new GradleException("platform jar is unsupported for " + platform.displayName);
    }

    @NotNull
    public File getPlatformDex(final @NotNull MoePlatform platform) {
        if (platform == MoePlatform.IOS) {
            return getiOSRetroDex();
        }
        throw new GradleException("platform dex is unsupported for " + platform.displayName);
    }

    @NotNull
    private static <T> T safeVariable(@Nullable T variable, @NotNull String name) {
        return Require.nonNull(variable, "Unable to access MOE SDK variable '" + name + "'");
    }
}
