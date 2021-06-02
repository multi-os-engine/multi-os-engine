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
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.artifacts.ExternalDependency;
import org.gradle.api.artifacts.ResolvedArtifact;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.api.artifacts.repositories.ArtifactRepository;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.plugins.ExtraPropertiesExtension;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.PropertiesUtil;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;

public class MoeSDK {
    private static final Logger LOG = Logging.getLogger(MoeSDK.class);

    private static final String MOE_GRADLE_ARTIFACT_ID = "moe-gradle";
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
        final Project project = plugin.getProject();

        Configuration classpathConfiguration =
                project.getBuildscript().getConfigurations().getByName("classpath");
        Require.nonNull(classpathConfiguration, "Couldn't find the classpath configuration in the buildscript.");

        // Check if explicit SDK version is defined.
        String sdkVersion = getMoeSDKVersion(project);
        if (sdkVersion == null) {
            // There's no explicit SDK version, retrieving version
            // from moe.properties.
            {
                // Get SDK version from moe.properties
                final Properties props = new Properties();
                try {
                    props.load(MoeSDK.class.getResourceAsStream("moe.properties"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                sdkVersion = props.getProperty("MOE-SDK-Version");
            }
            if (sdkVersion == null || sdkVersion.length() == 0) {
                throw new GradleException("MOE SDK version is undefined");
            }

            LOG.info("Using implicit moe-sdk version: {}", sdkVersion);
        } else {
            LOG.info("Using explicit moe-sdk version: {}", sdkVersion);
        }

        // Retrieve and resolve the moe-gradle plugin version.
        ResolvedArtifact artifact;
        {
            Project classpathProject = project;
            while ((artifact = classpathConfiguration.getResolvedConfiguration().getResolvedArtifacts()
                    .stream()
                    .filter(p -> MOE_GRADLE_ARTIFACT_ID.equals(p.getName()))
                    .findAny()
                    .orElse(null)) == null) {
                classpathProject = classpathProject.getParent();
                if (classpathProject == null) {
                    break;
                }
                classpathConfiguration = classpathProject.getBuildscript().getConfigurations().getByName("classpath");
                Require.nonNull(classpathConfiguration, "Couldn't find the classpath configuration in the buildscript.");
            }
        }
        Require.nonNull(artifact, "Couldn't find the moe-gradle artifact.");
        final String pluginVersion = artifact.getModuleVersion().getId().getVersion();
        Require.nonNull(pluginVersion, "Couldn't resolve the version of the moe-gradle artifact.");
        LOG.info("Resolved moe-gradle version: {}", pluginVersion);

        // Check for overriding property
        final String p = PropertiesUtil.tryGetProperty(project, MOE_LOCAL_SDK_PROPERTY);
        if (p != null) {
            final Path path = Paths.get(p);
            LOG.quiet("Using custom local MOE SDK: {}", path.toFile().getAbsolutePath());
            // Construct the SDK.
            final MoeSDK sdk = new MoeSDK(pluginVersion, sdkVersion);
            sdk.validateSDK(path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        // Check for overriding environment variable
        if (System.getenv(MOE_LOCAL_SDK_ENV) != null) {
            final Path path = Paths.get(System.getenv(MOE_LOCAL_SDK_ENV));
            LOG.quiet("Using custom local MOE SDK (env): {}", path.toFile().getAbsolutePath());
            // Construct the SDK.
            final MoeSDK sdk = new MoeSDK(pluginVersion, sdkVersion);
            sdk.validateSDK(path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        // Check if moe.sdk.localbuild file exists.
        if (plugin.getProject().file("moe.sdk.localbuild").exists()) {
            final Path path = Paths.get(FileUtils.read(plugin.getProject().file("moe.sdk.localbuild")).trim());
            LOG.quiet("Using custom local MOE SDK (file): {}", path.toFile().getAbsolutePath());
            // Construct the SDK.
            final MoeSDK sdk = new MoeSDK(pluginVersion, sdkVersion);
            sdk.validateSDK(path, true);
            sdk.bakeSDKPaths(path);
            return sdk;
        }

        // Use configuration
        LOG.info("Using Maven-based MOE SDK");

        // We need a resolved SDK version which is required as a part of the SDK path.
        sdkVersion = resolveSDKVersion(project, sdkVersion);
        LOG.info("Resolved moe-sdk version: {}", sdkVersion);

        // Construct the SDK.
        final MoeSDK sdk = new MoeSDK(pluginVersion, sdkVersion);

        // Prepare USER_MOE_HOME
        if (!USER_MOE_HOME.toFile().exists() && !USER_MOE_HOME.toFile().mkdir()) {
            throw new GradleException("Failed to create directory at " + USER_MOE_HOME);
        }

        // If the required SDK version is already downloaded and not a snapshot (because snapshot versions
        // can't be reused due to it's version can't be checked), use it and return.
        final boolean isSnapshotSDKVersion = sdkVersion.endsWith("-SNAPSHOT");
        final Path SDK_PATH = USER_MOE_HOME.resolve("moe-sdk-" + sdkVersion);
        if (SDK_PATH.toFile().exists() && !isSnapshotSDKVersion) {
            LOG.quiet("Using already downloaded SDK: {}", SDK_PATH.toFile().getAbsolutePath());
            sdk.validateSDK(SDK_PATH, false);
            sdk.bakeSDKPaths(SDK_PATH);
            return sdk;
        }

        // Download the SDK from the repositories.
        final File file = sdk.downloadSDK(project, sdkVersion);

        // Calculate MD5 on the SDK.
        final AtomicReference<String> sdkCalculatedMD5Ref = new AtomicReference<>();
        final File md5CacheFile = SDK_PATH.resolve("sdk.md5").toFile();
        final boolean sdkUpToDate = checkComponentUpToDate(file, md5CacheFile, sdkCalculatedMD5Ref);
        if (SDK_PATH.toFile().exists() && isSnapshotSDKVersion) {
            if (sdkUpToDate) {
                LOG.quiet("Using already downloaded SDK: {}", SDK_PATH.toFile().getAbsolutePath());
                sdk.validateSDK(SDK_PATH, false);
                sdk.bakeSDKPaths(SDK_PATH);
                return sdk;
            } else {
                try {
                    FileUtils.deleteFileOrFolder(SDK_PATH);
                    LOG.info("Deleted existing SDK: {}", SDK_PATH.toFile().getAbsolutePath());
                } catch (IOException e) {
                    throw new GradleException("Failed to remove directory at " + SDK_PATH.toFile().getAbsolutePath(), e);
                }
            }
        }

        // Prepare temp dir by removing old tmp directory and re-creating it
        LOG.quiet("Installing MOE SDK ({}), this may take a few minutes...", sdkVersion);

        // Extract zip into the temp directory
        project.copy(spec -> {
            spec.from(project.zipTree(file));
            spec.into(SDK_PATH.toFile());
        });

        if (isSnapshotSDKVersion && sdkCalculatedMD5Ref.get() != null) {
            // Cache md5
            try {
                FileUtils.deleteFileOrFolder(md5CacheFile);
            } catch (IOException e) {
                throw new GradleException("Failed to delete file " + md5CacheFile, e);
            }
            FileUtils.write(md5CacheFile, sdkCalculatedMD5Ref.get());
        }

        // Validate files
        sdk.validateSDK(SDK_PATH, false);
        sdk.bakeSDKPaths(SDK_PATH);
        return sdk;
    }

    private static String getMoeSDKVersion(@NotNull Project project) {
        final ExtraPropertiesExtension extraProperties = project.getExtensions().getExtraProperties();
        if (!extraProperties.has("moeSDKVersion")) {
            return null;
        }
        final Object moeSDKVersion = extraProperties.get("moeSDKVersion");
        if (moeSDKVersion == null) {
            throw new GradleException("'moeSDKVersion' property cannot be null");
        }
        if (!(moeSDKVersion instanceof String)) {
            throw new GradleException("'moeSDKVersion' property must be a string");
        }
        if ("".equals((String) moeSDKVersion)) {
            throw new GradleException("'moeSDKVersion' property must not be an empty string");
        }
        return (String)moeSDKVersion;
    }

    private static boolean checkComponentUpToDate(File input, File md5file, AtomicReference<String> out) {
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

    private static <T> T createSDKArtifact(@NotNull Project project, String version, BiFunction<Configuration, ExternalDependency, T> consumer) {
        Require.nonNull(project);
        Require.nonNull(version);
        final String desc = MOE_GROUP_ID + ":" + MOE_SDK_ARTIFACT_ID + ":" + version + "@zip";

        // Get or create configuration
        Configuration configuration;
        ExternalDependency dependency;
        try {
            configuration = project.getConfigurations().getByName(MOE_SDK_CONFIGURATION_NAME);
            Require.EQ(configuration.getDependencies().size(), 1,
                    "Unexpected number of dependencies in " + MOE_SDK_CONFIGURATION_NAME + " configuration.");
            dependency = (ExternalDependency)configuration.getDependencies().iterator().next();
        } catch (UnknownConfigurationException ex) {
            configuration = project.getConfigurations().create(MOE_SDK_CONFIGURATION_NAME);
            // Create an external dependency
            dependency = (ExternalDependency)project.getDependencies().create(desc);
            configuration.getDependencies().add(dependency);
        }

        // Add repositories from the buildscript to be able to download the SDK
        Set<ArtifactRepository> addedRepositories = new HashSet<>();
        project.getBuildscript().getRepositories().forEach(repository -> {
            if (!project.getRepositories().contains(repository)) {
                project.getRepositories().add(repository);
                addedRepositories.add(repository);
            }
        });

        try {
            return consumer.apply(configuration, dependency);
        } finally {
            // Remove added repositories
            project.getRepositories().removeAll(addedRepositories);
        }
    }

    private static String resolveSDKVersion(@NotNull Project project, String version) {
        return createSDKArtifact(project, version, (config, dep) -> {
            ResolvedArtifact artifact = config.getResolvedConfiguration().getResolvedArtifacts()
                    .stream()
                    .filter(p -> MOE_SDK_ARTIFACT_ID.equals(p.getName()))
                    .findAny()
                    .orElse(null);
            Require.nonNull(artifact, "Couldn't find the " + MOE_SDK_ARTIFACT_ID + " artifact.");
            final String sdkVersion = artifact.getModuleVersion().getId().getVersion();
            Require.nonNull(sdkVersion, "Couldn't resolve the version of the " + MOE_SDK_ARTIFACT_ID + " artifact.");
            return sdkVersion;
        });
    }

    @NotNull
    private File downloadSDK(@NotNull Project project, String version) {
        Require.nonNull(project);
        Require.nonNull(version);

        final String desc = MOE_GROUP_ID + ":" + MOE_SDK_ARTIFACT_ID + ":" + version + "@zip";
        LOG.info("Downloading dependency " + desc);

        final Set<File> files = createSDKArtifact(project, version, (config, dep) -> {
            return config.files(dep);
        });

        // Return the SDK
        return Require.sizeEQ(files, 1, "Unexpected number of files in MOE SDK").iterator().next();
    }

    private void validateSDK(@NotNull Path path, boolean isLocalSDK) {
        Require.nonNull(path);

        try {
            validate(DIR, path, "");
            validate(FIL, path, "sdk/moe-core.jar");
            validate(FIL, path, "sdk/moe-core-javadoc.jar");
            validate(FIL, path, "sdk/moe-core-sources.jar");

            validate(FIL, path, "sdk/moe-ios-junit.jar");
            validate(FIL, path, "sdk/moe-ios-junit-javadoc.jar");
            validate(FIL, path, "sdk/moe-ios-junit-sources.jar");

            validate(FIL, path, "sdk/moe-ios.jar");
            validate(FIL, path, "sdk/moe-ios-javadoc.jar");
            validate(FIL, path, "sdk/moe-ios-sources.jar");

            if (!isLocalSDK) {
                validate(FIL, path, "sdk/iphoneos/libmoe.a");
                validate(FIL, path, "sdk/iphoneos/include/MOE/MOE.h");
                validate(FIL, path, "sdk/iphonesimulator/libmoe.a");
                validate(FIL, path, "sdk/iphonesimulator/include/MOE/MOE.h");
            }

            validate(FIL, path, "tools/ios-device.jar");
            validate(DIR, path, "tools/macosx");
            validate(FIL, path, "tools/jni-config-base.json");
            validate(FIL, path, "tools/reflection-config-base.json");
            validate(FIL, path, "tools/proxy-config-base.json");
            validate(FIL, path, "tools/proguard-full.cfg");
            validate(FIL, path, "tools/proguard.cfg");
            validate(FIL, path, "tools/proguard.jar");
            validate(DIR, path, "tools/windows/x86_64");
            validate(FIL, path, "tools/wrapnatjgen.jar");
            validate(FIL, path, "tools/gradlew.zip");
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
    private @Nullable File MOE_SDK_CORE_SOURCES_JAR;
    private @Nullable File MOE_SDK_CORE_JAVADOC_JAR;
    private @Nullable File MOE_SDK_IOS_JAVADOC_JAR;
    private @Nullable File MOE_SDK_IOS_JUNIT_JAR;
    private @Nullable File MOE_SDK_IOS_JUNIT_SOURCES_JAR;
    private @Nullable File MOE_SDK_IOS_JUNIT_JAVADOC_JAR;
    private @Nullable File MOE_SDK_IOS_JAR;
    private @Nullable File MOE_SDK_IOS_SOURCES_JAR;
    private @Nullable File MOE_SDK_IOS_DEVICE_JAR;
    private @Nullable File MOE_SDK_MACOS_SUPPORT;
    private @Nullable File MOE_SDK_JNICONFIGBASE_FILE;
    private @Nullable File MOE_SDK_REFLECTIONCONFIGBASE_FILE;
    private @Nullable File MOE_SDK_PROXYCONFIGBASE_FILE;
    private @Nullable File MOE_SDK_PROGUARDFULL_CFG;
    private @Nullable File MOE_SDK_PROGUARD_CFG;
    private @Nullable File MOE_SDK_PROGUARD_JAR;
    private @Nullable File MOE_SDK_WINDOWS_X86_64_SUPPORT;
    private @Nullable File MOE_SDK_NATJGEN_JAR;
    private @Nullable File MOE_SDK_GRADLEW_ZIP;

    private void bakeSDKPaths(@NotNull Path path) {
        MOE_SDK_ROOT = path.toFile();
        MOE_SDK_SDK_DIR = path.resolve("sdk").toFile();
        MOE_SDK_TOOLS_DIR = path.resolve("tools").toFile();
        MOE_SDK_CORE_JAR = path.resolve("sdk/moe-core.jar").toFile();
        MOE_SDK_CORE_SOURCES_JAR = path.resolve("sdk/moe-core-sources.jar").toFile();
        MOE_SDK_CORE_JAVADOC_JAR = path.resolve("sdk/moe-core-javadoc.jar").toFile();
        MOE_SDK_IOS_JAR = path.resolve("sdk/moe-ios.jar").toFile();
        MOE_SDK_IOS_SOURCES_JAR = path.resolve("sdk/moe-ios-sources.jar").toFile();
        MOE_SDK_IOS_JAVADOC_JAR = path.resolve("sdk/moe-ios-javadoc.jar").toFile();
        MOE_SDK_IOS_JUNIT_JAR = path.resolve("sdk/moe-ios-junit.jar").toFile();
        MOE_SDK_IOS_JUNIT_SOURCES_JAR = path.resolve("sdk/moe-ios-junit-sources.jar").toFile();
        MOE_SDK_IOS_JUNIT_JAVADOC_JAR = path.resolve("sdk/moe-ios-junit-javadoc.jar").toFile();
        MOE_SDK_IOS_DEVICE_JAR = path.resolve("tools/ios-device.jar").toFile();
        MOE_SDK_MACOS_SUPPORT = path.resolve("tools/macosx").toFile();
        MOE_SDK_JNICONFIGBASE_FILE = path.resolve("tools/jni-config-base.json").toFile();
        MOE_SDK_REFLECTIONCONFIGBASE_FILE = path.resolve("tools/reflection-config-base.json").toFile();
        MOE_SDK_PROXYCONFIGBASE_FILE = path.resolve("tools/proxy-config-base.json").toFile();
        MOE_SDK_PROGUARDFULL_CFG = path.resolve("tools/proguard-full.cfg").toFile();
        MOE_SDK_PROGUARD_CFG = path.resolve("tools/proguard.cfg").toFile();
        MOE_SDK_PROGUARD_JAR = path.resolve("tools/proguard.jar").toFile();
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
    @IgnoreUnused
    public File getCoreJavadocJar() {
        return safeVariable(MOE_SDK_CORE_JAVADOC_JAR, "MOE_SDK_CORE_JAVADOC_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getCoreSourcesJar() {
        return safeVariable(MOE_SDK_CORE_SOURCES_JAR, "MOE_SDK_CORE_SOURCES_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSJavadocJar() {
        return safeVariable(MOE_SDK_IOS_JAVADOC_JAR, "MOE_SDK_IOS_JAVADOC_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSSourcesJar() {
        return safeVariable(MOE_SDK_IOS_SOURCES_JAR, "MOE_SDK_IOS_SOURCES_JAR");
    }

    @NotNull
    public File getiOSJUnitJar() {
        return safeVariable(MOE_SDK_IOS_JUNIT_JAR, "MOE_SDK_IOS_JUNIT_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSJUnitJavadocJar() {
        return safeVariable(MOE_SDK_IOS_JUNIT_JAVADOC_JAR, "MOE_SDK_IOS_JUNIT_JAVADOC_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getiOSJUnitSourcesJar() {
        return safeVariable(MOE_SDK_IOS_JUNIT_SOURCES_JAR, "MOE_SDK_IOS_JUNIT_SOURCES_JAR");
    }

    @NotNull
    private File getiOSJar() {
        return safeVariable(MOE_SDK_IOS_JAR, "MOE_SDK_IOS_JAR");
    }

    @NotNull
    public File getiOSDeviceJar() {
        return safeVariable(MOE_SDK_IOS_DEVICE_JAR, "MOE_SDK_IOS_DEVICE_JAR");
    }

    @NotNull
    @IgnoreUnused
    public File getMacOS_Support() {
        return safeVariable(MOE_SDK_MACOS_SUPPORT, "MOE_SDK_MACOS_SUPPORT");
    }

    @NotNull
    public File getJniConfigBaseFile() {
        return safeVariable(MOE_SDK_JNICONFIGBASE_FILE, "MOE_SDK_JNICONFIGBASE_FILE");
    }

    @NotNull
    public File getReflectionConfigBaseFile() {
        return safeVariable(MOE_SDK_REFLECTIONCONFIGBASE_FILE, "MOE_SDK_REFLECTIONCONFIGBASE_FILE");
    }

    @NotNull
    public File getProxyConfigBaseFile() {
        return safeVariable(MOE_SDK_PROXYCONFIGBASE_FILE, "MOE_SDK_PROXYCONFIGBASE_FILE");
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
    private static <T> T safeVariable(@Nullable T variable, @NotNull String name) {
        return Require.nonNull(variable, "Unable to access MOE SDK variable '" + name + "'");
    }
}
