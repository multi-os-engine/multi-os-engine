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

import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.SourceSetContainer;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.generator.project.Generator;
import org.moe.generator.project.config.Configuration;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlatform;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.XcodeOptions;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import static org.moe.common.constants.MOEManifestConstants.*;

// TODO: in this form this can break incremental builds
public class XcodeProjectGenerator extends AbstractBaseTask {

    private static final String CONVENTION_MAIN_CLASS_NAME = "mainClassName";
    private static final String CONVENTION_APPLICATION_EXIT_ON_SUSPEND = "applicationExitOnSuspend";
    private static final String CONVENTION_BUNDLE_SHORT_VERSION_STRING = "bundleShortVersionString";
    private static final String CONVENTION_BUNDLE_VERSION = "bundleVersion";
    private static final String CONVENTION_COMPANY_IDENTIFIER = "companyIdentifier";
    private static final String CONVENTION_DEPENDENCIES = "dependencies";
    private static final String CONVENTION_DEPLOYMENT_TARGET = "deploymentTarget";
    private static final String CONVENTION_GRADLE_VERSION = "gradleVersion";
    private static final String CONVENTION_INFO_PLIST_PATH = "infoPlistPath";
    private static final String CONVENTION_MAIN_RESOURCES = "mainResources";
    private static final String CONVENTION_MAIN_UI_STORYBOARD_PATH = "mainUIStoryboardPath";
    private static final String CONVENTION_LAUNCH_SCREEN_FILE_PATH = "launchScreenFilePath";
    private static final String CONVENTION_LAUNCH_IMAGES_SOURCE = "launchImagesSource";
    private static final String CONVENTION_LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION = "locationWhenInUseUsageDescription";
    private static final String CONVENTION_APP_ICONS_SOURCE = "appIconsSource";
    private static final String CONVENTION_ORGANIZATION_NAME = "organizationName";
    private static final String CONVENTION_PACKAGE_NAME = "packageName";
    private static final String CONVENTION_PRODUCT_NAME = "productName";
    private static final String CONVENTION_BUNDLE_ID = "bundleID";
    private static final String CONVENTION_PROJECT_NAME = "projectName";
    private static final String CONVENTION_SUPPORTED_INTERFACE_ORIENTATIONS = "supportedInterfaceOrientations";
    private static final String CONVENTION_SYM_ROOT = "symRoot";
    private static final String CONVENTION_TARGET_PLATFORM = "targetPlatform";
    private static final String CONVENTION_TEST_INFO_PLIST_PATH = "testInfoPlistPath";
    private static final String CONVENTION_TEST_RESOURCES = "testResources";
    private static final String CONVENTION_USE_SCALA = "useScala";
    private static final String CONVENTION_XCODE_PROJECT_DIR = "xcodeProjectDir";
    private static final String CONVENTION_LIBRARIES_DIR = "librariesDir";

    @Nullable
    private String mainClassName;

    @Input
    @NotNull
    public String getMainClassName() {
        return getOrConvention(mainClassName, CONVENTION_MAIN_CLASS_NAME);
    }

    @IgnoreUnused
    public void setMainClassName(@Nullable String mainClassName) {
        this.mainClassName = mainClassName;
    }

    @Nullable
    private Boolean applicationExitOnSuspend;

    @Input
    @Optional
    @Nullable
    public Boolean getApplicationExitOnSuspend() {
        return nullableGetOrConvention(applicationExitOnSuspend, CONVENTION_APPLICATION_EXIT_ON_SUSPEND);
    }

    @IgnoreUnused
    public void setApplicationExitOnSuspend(@Nullable Boolean applicationExitOnSuspend) {
        this.applicationExitOnSuspend = applicationExitOnSuspend;
    }

    @Nullable
    private String bundleShortVersionString;

    @Input
    @Optional
    @Nullable
    public String getBundleShortVersionString() {
        return nullableGetOrConvention(bundleShortVersionString, CONVENTION_BUNDLE_SHORT_VERSION_STRING);
    }

    @IgnoreUnused
    public void setBundleShortVersionString(@Nullable String bundleShortVersionString) {
        this.bundleShortVersionString = bundleShortVersionString;
    }

    @Nullable
    private String bundleVersion;

    @Input
    @Optional
    @Nullable
    public String getBundleVersion() {
        return nullableGetOrConvention(bundleVersion, CONVENTION_BUNDLE_VERSION);
    }

    @IgnoreUnused
    public void setBundleVersion(@Nullable String bundleVersion) {
        this.bundleVersion = bundleVersion;
    }

    @Nullable
    private String companyIdentifier;

    @Input
    @Optional
    @Nullable
    public String getCompanyIdentifier() {
        return nullableGetOrConvention(companyIdentifier, CONVENTION_COMPANY_IDENTIFIER);
    }

    @IgnoreUnused
    public void setCompanyIdentifier(@Nullable String companyIdentifier) {
        this.companyIdentifier = companyIdentifier;
    }

    @Nullable
    private Set<Object> dependencies;

    @InputFiles
    public @NotNull ConfigurableFileCollection getDependencies() {
        return getProject().files(getOrConvention(dependencies, CONVENTION_DEPENDENCIES));
    }

    public void setDependencies(@Nullable Collection<Object> dependencies) {
        this.dependencies = dependencies == null ? null : new HashSet<>(dependencies);
    }

    @Nullable
    private String deploymentTarget;

    @Input
    @Optional
    @Nullable
    public String getDeploymentTarget() {
        return nullableGetOrConvention(deploymentTarget, CONVENTION_DEPLOYMENT_TARGET);
    }

    @IgnoreUnused
    public void setDeploymentTarget(@Nullable String deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
    }

    @Nullable
    private String gradleVersion;

    @Input
    @Optional
    @Nullable
    public String getGradleVersion() {
        return nullableGetOrConvention(gradleVersion, CONVENTION_GRADLE_VERSION);
    }

    @IgnoreUnused
    public void setGradleVersion(@Nullable String gradleVersion) {
        this.gradleVersion = gradleVersion;
    }

    @Nullable
    private String infoPlistPath;

    @Input
    @Optional
    @Nullable
    public String getInfoPlistPath() {
        return nullableGetOrConvention(infoPlistPath, CONVENTION_INFO_PLIST_PATH);
    }

    @IgnoreUnused
    public void setInfoPlistPath(@Nullable String infoPlistPath) {
        this.infoPlistPath = infoPlistPath;
    }

    @Nullable
    private List<String> mainResources;

    @Input
    @Optional
    @Nullable
    public List<String> getMainResources() {
        return nullableGetOrConvention(mainResources, CONVENTION_MAIN_RESOURCES);
    }

    @IgnoreUnused
    public void setMainResources(@Nullable Collection<String> mainResources) {
        this.mainResources = mainResources == null ? null : new ArrayList<>(mainResources);
    }

    @Nullable
    private Object mainUIStoryboardPath;

    @Input
    @Optional
    @Nullable
    public File getMainUIStoryboardPath() {
        final Object value = nullableGetOrConvention(mainUIStoryboardPath, CONVENTION_MAIN_UI_STORYBOARD_PATH);
        return value == null ? null : getProject().file(value);
    }

    @IgnoreUnused
    public void setMainUIStoryboardPath(@Nullable Object mainUIStoryboardPath) {
        this.mainUIStoryboardPath = mainUIStoryboardPath;
    }

    @Nullable
    private Object launchScreenFilePath;

    @Input
    @Optional
    @Nullable
    public File getLaunchScreenFilePath() {
        final Object value = nullableGetOrConvention(launchScreenFilePath, CONVENTION_LAUNCH_SCREEN_FILE_PATH);
        return value == null ? null : getProject().file(value);
    }

    @IgnoreUnused
    public void setLaunchScreenFilePath(@Nullable Object launchScreenFilePath) {
        this.launchScreenFilePath = launchScreenFilePath;
    }

    @Nullable
    private String launchImagesSource;

    @Input
    @Optional
    @Nullable
    public String getLaunchImagesSource() {
        return nullableGetOrConvention(launchImagesSource, CONVENTION_LAUNCH_IMAGES_SOURCE);
    }

    @IgnoreUnused
    public void setLaunchImagesSource(@Nullable String launchImagesSource) {
        this.launchImagesSource = launchImagesSource;
    }

    @Nullable
    private String locationWhenInUseUsageDescription;

    @Input
    @Optional
    @Nullable
    public String getLocationWhenInUseUsageDescription() {
        return nullableGetOrConvention(locationWhenInUseUsageDescription, CONVENTION_LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION);
    }

    @IgnoreUnused
    public void setLocationWhenInUseUsageDescription(@Nullable String locationWhenInUseUsageDescription) {
        this.locationWhenInUseUsageDescription = locationWhenInUseUsageDescription;
    }

    @Nullable
    private String appIconsSource;

    @Input
    @Optional
    @Nullable
    public String getAppIconsSource() {
        return nullableGetOrConvention(appIconsSource, CONVENTION_APP_ICONS_SOURCE);
    }

    @IgnoreUnused
    public void setAppIconsSource(@Nullable String appIconsSource) {
        this.appIconsSource = appIconsSource;
    }

    @Nullable
    private String organizationName;

    @Input
    @NotNull
    public String getOrganizationName() {
        return getOrConvention(organizationName, CONVENTION_ORGANIZATION_NAME);
    }

    @IgnoreUnused
    public void setOrganizationName(@Nullable String organizationName) {
        this.organizationName = organizationName;
    }

    @Nullable
    private String packageName;

    @Input
    @Optional
    @Nullable
    public String getPackageName() {
        return nullableGetOrConvention(packageName, CONVENTION_PACKAGE_NAME);
    }

    @IgnoreUnused
    public void setPackageName(@Nullable String packageName) {
        this.packageName = packageName;
    }

    @Nullable
    private String productName;

    @Input
    @Optional
    @Nullable
    public String getProductName() {
        return nullableGetOrConvention(productName, CONVENTION_PRODUCT_NAME);
    }

    @IgnoreUnused
    public void setProductName(@Nullable String productName) {
        this.productName = productName;
    }

    @Nullable
    private String bundleID;

    @Input
    @Optional
    @Nullable
    public String getBundleID() {
        return nullableGetOrConvention(bundleID, CONVENTION_BUNDLE_ID);
    }

    @IgnoreUnused
    public void setBundleID(@Nullable String bundleID) {
        this.bundleID = bundleID;
    }

    @Nullable
    private String projectName;

    @Input
    @NotNull
    public String getProjectName() {
        return getOrConvention(projectName, CONVENTION_PROJECT_NAME);
    }

    @IgnoreUnused
    public void setProjectName(@Nullable String projectName) {
        this.projectName = projectName;
    }

    @Nullable
    private List<String> supportedInterfaceOrientations;

    @Input
    @Optional
    @Nullable
    public List<String> getSupportedInterfaceOrientations() {
        return nullableGetOrConvention(supportedInterfaceOrientations, CONVENTION_SUPPORTED_INTERFACE_ORIENTATIONS);
    }

    @IgnoreUnused
    public void setSupportedInterfaceOrientations(@Nullable Collection<String> supportedInterfaceOrientations) {
        this.supportedInterfaceOrientations = supportedInterfaceOrientations == null ? null : new ArrayList<>(supportedInterfaceOrientations);
    }

    @Nullable
    private String symRoot;

    @Input
    @NotNull
    public String getSymRoot() {
        return getOrConvention(symRoot, CONVENTION_SYM_ROOT);
    }

    @IgnoreUnused
    public void setSymRoot(@Nullable String symRoot) {
        this.symRoot = symRoot;
    }

    @Nullable
    private String targetPlatform;

    @Input
    @NotNull
    public String getTargetPlatform() {
        return getOrConvention(targetPlatform, CONVENTION_TARGET_PLATFORM);
    }

    @IgnoreUnused
    public void setTargetPlatform(@Nullable String targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    @Nullable
    private String testInfoPlistPath;

    @Input
    @Optional
    @Nullable
    public String getTestInfoPlistPath() {
        return nullableGetOrConvention(testInfoPlistPath, CONVENTION_TEST_INFO_PLIST_PATH);
    }

    @IgnoreUnused
    public void setTestInfoPlistPath(@Nullable String testInfoPlistPath) {
        this.testInfoPlistPath = testInfoPlistPath;
    }

    @Nullable
    private List<String> testResources;

    @Input
    @Optional
    @Nullable
    public List<String> getTestResources() {
        return nullableGetOrConvention(testResources, CONVENTION_TEST_RESOURCES);
    }

    @IgnoreUnused
    public void setTestResources(@Nullable Collection<String> testResources) {
        this.testResources = testResources == null ? null : new ArrayList<>(testResources);
    }

    @Nullable
    private Boolean useScala;

    @Input
    @NotNull
    public Boolean getUseScala() {
        return getOrConvention(useScala, CONVENTION_USE_SCALA);
    }

    @IgnoreUnused
    public void setUseScala(@Nullable Boolean useScala) {
        this.useScala = useScala;
    }

    @Nullable
    private Object xcodeProjectDir;

    @OutputDirectory
    @NotNull
    public File getXcodeProjectDir() {
        return getProject().file(getOrConvention(xcodeProjectDir, CONVENTION_XCODE_PROJECT_DIR));
    }

    @IgnoreUnused
    public void setXcodeProjectDir(@Nullable Object xcodeProjectDir) {
        this.xcodeProjectDir = xcodeProjectDir;
    }

    @Nullable
    private Object librariesDir;

    @OutputDirectory
    @NotNull
    public File getLibrariesDir() {
        return getProject().file(getOrConvention(librariesDir, CONVENTION_LIBRARIES_DIR));
    }

    @IgnoreUnused
    public void setLibrariesDir(@Nullable Object librariesDir) {
        this.librariesDir = librariesDir;
    }

    @Override
    protected void run() {
        @NotNull final ConfigurableFileCollection dependencies = getDependencies();
        final IdentityHashMap<Enum, List<String>> enumListIdentityHashMap = collectDependenciesAttributes(dependencies);

        final String pluginVersion = getMoeSDK().pluginVersion;
        final String configPluginVersion;
        if (pluginVersion.matches("\\d+\\.\\d+\\.\\d+")) {
            configPluginVersion = pluginVersion.substring(0, pluginVersion.lastIndexOf('.'));
        } else {
            configPluginVersion = pluginVersion;
        }

        Configuration conf = new Configuration(configPluginVersion);

        conf.setApplicationExitOnSuspend(getApplicationExitOnSuspend());
        conf.setBundleShortVersionString(getBundleShortVersionString());
        conf.setBundleVersion(getBundleVersion());
        conf.setDependenciesManifestsProperties(enumListIdentityHashMap);
        conf.setDeploymentTarget(getDeploymentTarget());
        conf.setGradleVersion(getGradleVersion());
        conf.setInfoPlistPath(getInfoPlistPath());
        conf.setMainClassName(getMainClassName());
        conf.setMainResourcesSet(getMainResources());
        final File mainUIStoryboardPath = getMainUIStoryboardPath();
        conf.setMainUIStoryboardPath(mainUIStoryboardPath == null ? null : FileUtils.getRelativeTo(getXcodeProjectDir(), mainUIStoryboardPath).toString().replaceAll("\\\\", "/"));
        final File launchScreenFilePath = getLaunchScreenFilePath();
        conf.setLaunchScreenFilePath(launchScreenFilePath == null ? null : FileUtils.getRelativeTo(getXcodeProjectDir(), launchScreenFilePath).toString().replaceAll("\\\\", "/"));
        conf.setLaunchImagesSource(getLaunchImagesSource());
        conf.setLocationWhenInUseUsageDescription(getLocationWhenInUseUsageDescription());
        conf.setAppIconsSource(getAppIconsSource());
        conf.setBundleID(getBundleID());
        conf.setOrganizationName(getOrganizationName());
        conf.setPackageName(getPackageName());
        conf.setProductName(getProductName());
        conf.setProjectName(getProjectName());
        conf.setProjectRoot(getXcodeProjectDir());
        conf.setRelativePathToBasePrj(FileUtils.getRelativeTo(getXcodeProjectDir(), getProject().getProjectDir()).toString().replaceAll("\\\\", "/"));
        conf.setRelativePathToBuildDir(FileUtils.getRelativeTo(getXcodeProjectDir(), getProject().getBuildDir()).toString().replaceAll("\\\\", "/"));
        conf.setSupportedInterfaceOrientations(getSupportedInterfaceOrientations());
        conf.setSymRoot("$(SRCROOT)/" + FileUtils.getRelativeTo(getXcodeProjectDir(), new File(getSymRoot())).toString().replaceAll("\\\\", "/"));
        conf.setTargetPlatform(getTargetPlatform());
        conf.setTestInfoPlistPath(getTestInfoPlistPath());
        conf.setTestResourcesSet(getTestResources());
        conf.setUseScala(getUseScala());

        // Validate settings
        try {
            conf.validate();
        } catch (ConfigurationValidationException ve) {
            throw new GradleException(ve.getPropertyName() + ": " + ve.getErrorMessage());
        }

        // Generate project
        Generator generator = new Generator(conf);
        try {
            generator.create();
        } catch (Throwable e) {
            throw new GradleException("An exception occurred during Xcode project generation", e);
        }
    }

    protected final void setupMoeTask() {
        setSupportsRemoteBuild(false);

        final Project project = getProject();
        final MoeExtension ext = getMoeExtension();
        final SourceSetContainer sourceSets = getMoePlugin().getJavaConvention().getSourceSets();
        final XcodeOptions xcode = ext.xcode;

        // Create task
        setDescription("Generates Xcode project.");

        addConvention(CONVENTION_MAIN_CLASS_NAME, () -> {
            if (ext.mainClassName != null) {
                return ext.mainClassName;
            }
            return "Main";
        });
        addConvention(CONVENTION_APPLICATION_EXIT_ON_SUSPEND, xcode::isApplicationExitOnSuspend);
        addConvention(CONVENTION_BUNDLE_SHORT_VERSION_STRING, xcode::getBundleShortVersionString);
        addConvention(CONVENTION_BUNDLE_VERSION, xcode::getBundleVersion);
        addConvention(CONVENTION_COMPANY_IDENTIFIER, xcode::getCompanyIdentifier);
        addConvention(CONVENTION_DEPENDENCIES, () -> {
            final Set<File> dependencies = new HashSet<>();
            for (org.gradle.api.artifacts.Configuration configuration : project.getConfigurations()) {
                for (File file : configuration) {
                    if (!dependencies.contains(file)) {
                        dependencies.add(file);
                    }
                }
            }
            return dependencies;
        });
        addConvention(CONVENTION_DEPLOYMENT_TARGET, xcode::getDeploymentTarget);
        addConvention(CONVENTION_GRADLE_VERSION, () -> project.getGradle().getGradleVersion());
        addConvention(CONVENTION_INFO_PLIST_PATH, xcode::getInfoPlistPath);
        addConvention(CONVENTION_MAIN_RESOURCES, () -> {
            return collectMainResources(sourceSets,
                    getXcodeProjectDir(),
                    getMainUIStoryboardPath(),
                    getLaunchScreenFilePath());
        });
        addConvention(CONVENTION_MAIN_UI_STORYBOARD_PATH, () -> {
            // 1, Check for custom location
            // 2, Check for generated storyboard
            // 3, Check in default location
            // 4, null
            if (xcode.getMainUIStoryboardPath() != null) {
                return project.file(xcode.getMainUIStoryboardPath());
            }
            final SourceSet mainSourceSet = sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME);
            final UITransformer task = getMoePlugin().getTaskBy(UITransformer.class, mainSourceSet);
            if (task.shouldRunUITransformer()) {
                return task.getOutputStoryboardFile();
            }
            File defaultLocation = project.file("src/main/resources/MainUI.storyboard");
            if (defaultLocation.exists()) {
                return defaultLocation;
            }
            return null;
        });
        addConvention(CONVENTION_LAUNCH_SCREEN_FILE_PATH, () -> {
            if (xcode.getLaunchScreenFilePath() != null) {
                return xcode.getLaunchScreenFilePath();
            }
            return null;
        });
        addConvention(CONVENTION_LAUNCH_IMAGES_SOURCE, xcode::getLaunchImagesSource);
        addConvention(CONVENTION_LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION, xcode::getLocationWhenInUseUsageDescription);
        addConvention(CONVENTION_APP_ICONS_SOURCE, xcode::getAppIconsSource);
        addConvention(CONVENTION_ORGANIZATION_NAME, xcode::getOrganizationName);
        addConvention(CONVENTION_PACKAGE_NAME, xcode::getPackageName);
        addConvention(CONVENTION_PRODUCT_NAME, xcode::getMainProductName);
        addConvention(CONVENTION_BUNDLE_ID, () -> {
            if (xcode.getBundleID() != null) {
                return xcode.getBundleID();
            }
            return project.getName();
        });
        addConvention(CONVENTION_PROJECT_NAME, xcode::getMainTarget);
        addConvention(CONVENTION_SUPPORTED_INTERFACE_ORIENTATIONS, () -> {
            if (xcode.getSupportedInterfaceOrientations() != null) {
                return new ArrayList<>(xcode.getSupportedInterfaceOrientations());
            }
            return null;
        });
        addConvention(CONVENTION_SYM_ROOT, () -> {
            return project.file(project.getBuildDir() + "/" + MoePlugin.MOE + "/xcodebuild/sym").getAbsolutePath();
        });
        addConvention(CONVENTION_TARGET_PLATFORM, () -> {
            if (ext.getPlatformType() == MoePlatform.IOS) {
                return Configuration.TARGET_PLATFORM_IOS_UNIVERSAL;
            }
            return null;
        });
        addConvention(CONVENTION_TEST_INFO_PLIST_PATH, xcode::getTestInfoPlistPath);
        addConvention(CONVENTION_TEST_RESOURCES, () -> {
            return collectTestResources(sourceSets, getXcodeProjectDir());
        });
        addConvention(CONVENTION_USE_SCALA, () -> false);
        addConvention(CONVENTION_XCODE_PROJECT_DIR, () -> {
            if (xcode.getXcodeProjectDirPath() != null) {
                return project.file(xcode.getXcodeProjectDirPath());
            }
            return project.file(project.getBuildDir() + "/xcode");
        });
        addConvention(CONVENTION_LIBRARIES_DIR, () -> {
            return project.file(project.getBuildDir() + "/libs");
        });
        addConvention(CONVENTION_LOG_FILE, () -> {
            return project.file(project.getBuildDir() + "/" + MoePlugin.MOE + "/xcode/XcodeProjectGenerator.log");
        });

        onlyIf(task -> xcode.isGenerateProject() || project.hasProperty("moe.xcode.forceGenerate"));
    }

    private static List<String> collectMainResources(@NotNull SourceSetContainer sourceSets,
                                                     @NotNull File xcodeProjectDir,
                                                     @Nullable File mainUIStoryboardPath,
                                                     @Nullable File launchScreenFilePath) {
        Require.nonNull(sourceSets);
        Require.nonNull(xcodeProjectDir);

        final Set<File> resources = new HashSet<>();
        final SourceSet mainSourceSet = sourceSets.getByName(SourceSet.MAIN_SOURCE_SET_NAME);

        mainSourceSet.getResources().getSrcDirs().stream().flatMap(directory -> {
            final File[] files = directory.listFiles();
            return Arrays.stream(files == null ? new File[0] : files);
        }).forEach(candidate -> {
            for (File child : mainSourceSet.getResources().getFiles()) {
                if (child.toPath().startsWith(candidate.toPath())) {
                    if (child.getName().endsWith(".ixml")) {
                        continue;
                    }
                    resources.add(FileUtils.getRelativeTo(xcodeProjectDir, candidate));
                    break;
                }
            }
        });

        if (mainUIStoryboardPath != null) {
            resources.add(FileUtils.getRelativeTo(xcodeProjectDir, mainUIStoryboardPath));
        }
        if (launchScreenFilePath != null) {
            resources.add(FileUtils.getRelativeTo(xcodeProjectDir, launchScreenFilePath));
        }

        Stream<String> stream = resources.stream().map(File::toString);
        if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            stream = stream.map(x -> x.replaceAll("\\\\", "/"));
        }
        return stream.collect(Collectors.toList());
    }

    private static List<String> collectTestResources(@NotNull SourceSetContainer sourceSets,
                                                     @NotNull File xcodeProjectDir) {
        Require.nonNull(sourceSets);
        Require.nonNull(xcodeProjectDir);

        final Set<File> resources = new HashSet<>();
        final SourceSet sourceSet = sourceSets.getByName(SourceSet.TEST_SOURCE_SET_NAME);

        for (File child : sourceSet.getResources().getFiles()) {
            resources.add(FileUtils.getRelativeTo(xcodeProjectDir, child));
        }

        Stream<String> stream = resources.stream().map(File::toString);
        if (Os.isFamily(Os.FAMILY_WINDOWS)) {
            stream = stream.map(x -> x.replaceAll("\\\\", "/"));
        }
        return stream.collect(Collectors.toList());
    }

    private IdentityHashMap<Enum, List<String>> collectDependenciesAttributes(ConfigurableFileCollection dependencies) {
        final IdentityHashMap<Enum, List<String>> dependenciesManifestsProperties = new IdentityHashMap<>();

        String resDir = getProject().getBuildDir().getAbsolutePath() + "/resources";
        File natjRes = new File(resDir);
        FileUtils.prepareDir(natjRes);

        try {
            for (File dependencyFile : dependencies) {
                JarFile jarFile = new JarFile(dependencyFile);
                Manifest manifest = jarFile.getManifest();
                if (manifest == null) {
                    getProject().getLogger().warn("File " + dependencyFile.getAbsolutePath() + " does not contain manifest file.");
                    continue;
                }

                // Add custom linked flags
                for (Enum property : LINKER_FLAGS.values()) {
                    String propertyValue = getManifestAttribute(manifest, property.name());
                    if ((propertyValue != null) && !propertyValue.isEmpty()) {
                        List<String> values = dependenciesManifestsProperties.get(property);
                        if (values == null) {
                            values = new ArrayList<>();
                            dependenciesManifestsProperties.put(property, values);
                        }
                        for (String value : Arrays.asList(propertyValue.split(";"))) {
                            value = value.replace(";", "").trim();
                            values.add(value);
                        }
                    }
                }

                // Add custom libraries
                String type = getManifestAttribute(manifest, MOE_TYPE);
                if ((type != null) && !type.isEmpty()) {
                    List<String> typeArray = new ArrayList<>();
                    typeArray.addAll(Arrays.asList(type.split(";")));

                    File libsDir = getLibrariesDir();
                    File dynamicDir = createDynamicDirectory(libsDir);
                    File staticDir = createStaticDirectory(libsDir);

                    Attributes attributes = manifest.getMainAttributes();

                    int typeIndex = 0;
                    for (Object key : attributes.keySet()) {
                        LIBRARIES_PATHS libPathConst;
                        try {
                            libPathConst = LIBRARIES_PATHS.valueOf(key.toString());
                        } catch (IllegalArgumentException e) {
                            continue;
                        }

                        String propertyValue;
                        try {
                            propertyValue = attributes.getValue(key.toString());
                        } catch (IllegalArgumentException e) {
                            getProject().getLogger().info("Incorrect manifest attribute name '" + key + "'. " + e.getMessage());
                            continue;
                        }
                        if ((propertyValue != null) && !propertyValue.isEmpty()) {
                            getProject().getLogger().debug("collectDependenciesAttributes: attribute '" + key + "' with value '" + propertyValue + "' was found.");
                            List<String> libPaths = dependenciesManifestsProperties.get(libPathConst);
                            if (libPaths == null) {
                                libPaths = new ArrayList<>();
                                dependenciesManifestsProperties.put(libPathConst, libPaths);
                            }

                            for (String path : Arrays.asList(propertyValue.split(";"))) {
                                path = path.replace(";", "").trim();

                                List<String> subPaths = new ArrayList<>();
                                if (libPathConst != LIBRARIES_PATHS.MOE_ThirdpartyFramework_universal) {
                                    List<MoePlatform> targets = new ArrayList<>();
                                    MoePlatform targetVariant = MoePlatform.getByManifestProperty(libPathConst);
                                    if (targetVariant == null) {
                                        Arch archVariant = Arch.getByManifestProperty(libPathConst);
                                        if (archVariant != null) {
                                            targets.addAll(MoePlatform.getSupportedTargetVariants(archVariant));
                                        }
                                    } else {
                                        targets.add(targetVariant);
                                    }
                                    for (MoePlatform target : targets) {
                                        subPaths.add(target.platformName);
                                    }
                                } else {
                                    subPaths.add("");
                                }

                                type = typeArray.get(typeIndex).replace(";", "").trim();

                                File dstDir;
                                if (type.equals("dynamic")) {
                                    dstDir = dynamicDir;
                                } else {
                                    dstDir = staticDir;
                                }

                                for (String subPath : subPaths) {
                                    File destDir = new File(dstDir, subPath);
                                    if (!destDir.exists()) {
                                        destDir.mkdirs();
                                    }
                                    copyFromJar(jarFile, path, destDir);
                                    String libName = new File(path).getName();
                                    libPaths.add(destDir.getAbsolutePath() + "/" + libName);
                                    getProject().getLogger().debug("Lib '" + libName + "' was placed to " + destDir.getAbsolutePath());
                                }

                                typeIndex++;
                            }
                        }
                    }
                }

                // Add bundle resources
                for (BUNDLE_RESOURCES resFlag : BUNDLE_RESOURCES.values()) {
                    String bundleRes = getManifestAttribute(manifest, resFlag.name());
                    if (bundleRes != null && !bundleRes.isEmpty()) {
                        String[] bundleArray = bundleRes.split(";");

                        List<String> values = dependenciesManifestsProperties.get(resFlag);
                        if (values == null) {
                            values = new ArrayList<>();
                            dependenciesManifestsProperties.put(resFlag, values);
                        }

                        for (String bundlePath : bundleArray) {
                            bundlePath = bundlePath.replace(";", "").trim();

                            copyFromJar(jarFile, bundlePath, natjRes);
                            values.add("resources/" + new File(bundlePath).getName());
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new GradleException(e.getMessage(), e);
        }
        return dependenciesManifestsProperties;
    }

    private String getManifestAttribute(Manifest manifest, String attribute) {
        String retValue = null;
        Attributes attributes = manifest.getMainAttributes();
        try {
            retValue = attributes.getValue(attribute);
        } catch (IllegalArgumentException e) {
            getProject().getLogger().info("Incorrect manifest attribute name '" + attribute + "'. " + e.getMessage());
        }
        return retValue;
    }

    private void copyFromJar(ZipFile zipFile, String relativeFilePath, File destination) throws IOException {
        Enumeration<? extends ZipEntry> e = zipFile.entries();
        InputStream is = null;
        FileOutputStream fStream = null;
        if (relativeFilePath.startsWith("./")) {
            relativeFilePath = relativeFilePath.substring(2);
        }
        int startIndex = 0;
        File relativeFile = new File(relativeFilePath);
        if (relativeFile.getParentFile() != null) {
            startIndex = relativeFile.getParent().length() + 1;
        }

        while (e.hasMoreElements()) {
            ZipEntry entry = e.nextElement();

            // if the entry is not directory and matches relative file then extract it
            String entryName = entry.getName();
            if (entryName.startsWith(relativeFilePath)) {
                if (entry.isDirectory()) {
                    String dest = entry.getName().substring(startIndex);
                    if (!dest.isEmpty()) {
                        File destFolder = new File(destination, dest);
                        if (!destFolder.exists()) {
                            destFolder.mkdirs();
                        }
                    }
                } else {
                    String dest = entry.getName().substring(startIndex);
                    if (!dest.isEmpty()) {
                        File destFile = new File(destination, dest);
                        if (!destFile.exists()) {
                            destFile.createNewFile();
                        }
                        try {
                            is = zipFile.getInputStream(entry); // get the input stream
                            fStream = new FileOutputStream(destFile);
                            copyFiles(is, fStream);
                        } finally {
                            if (is != null) {
                                try {
                                    is.close();
                                } catch (IOException ioe) {
                                    ioe.printStackTrace();
                                }
                            }
                            if (fStream != null) {
                                try {
                                    fStream.close();
                                } catch (IOException ioe) {
                                    ioe.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } else {
                continue;
            }
        }
    }

    private void copyFiles(InputStream inStream, FileOutputStream outStream) throws IOException {
        byte[] buffer = new byte[1024];

        int length;
        while ((length = inStream.read(buffer)) > 0) {
            outStream.write(buffer, 0, length);
        }

    }

    private File createDynamicDirectory(File libs) {
        File dynamicDir = new File(libs, "dynamic");
        if (!dynamicDir.exists()) {
            dynamicDir.mkdirs();
        }
        for (MoePlatform variant : MoePlatform.ALL_PLATFORMS) {
            File targetDir = new File(dynamicDir, variant.platformName);
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
        }

        return dynamicDir;
    }

    private File createStaticDirectory(File libs) {
        File staticDir = new File(libs, "static");
        if (!staticDir.exists()) {
            staticDir.mkdirs();
        }
        for (MoePlatform variant : MoePlatform.ALL_PLATFORMS) {
            File targetDir = new File(staticDir, variant.platformName);
            if (!targetDir.exists()) {
                targetDir.mkdirs();
            }
        }

        return staticDir;
    }
}
