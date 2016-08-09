/*
Copyright 2014-2016 Intel Corporation

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

package org.moe.generator.project.config;

import org.moe.common.configuration.AbstractConfiguration;
import org.moe.common.configuration.ConfigurationValidationException;
import org.moe.common.utils.ArrayUtil;

import java.io.File;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;

/**
 * The Configuration class contains all basic configuration settings.
 */
public final class Configuration extends AbstractConfiguration {

    public static final String DEFAULT_MAIN_INFO_PLIST_PATH = "src/main/";
    public static final String DEFAULT_TEST_INFO_PLIST_PATH = "src/test/";

    /*
     Configuration property names.
     */
    public static final String APPLICATION_EXIT_ON_SUSPEND = "Application exit on suspend";
    public static final String BUNDLE_SHORT_VERSION_STRING = "Bundle short version string";
    public static final String BUNDLE_VERSION = "Bundle version";
    public static final String DEPENDENCIES_MANIFEST_PROPERTIES = "Dependencies manifest properties";
    public static final String DEPLOYMENT_TARGET = "Deployment target";
    public static final String GRADLE_VERSION_PROPERTY_NAME = "Gradle Version";
    public static final String INFO_PLIST_PATH = "Info plist path";
    public static final String MAIN_CLASS_NAME = "Main class name";
    public static final String MAIN_RESOURCES_SET = "Main resources set";
    public static final String MAIN_UI_STORYBOARD_PATH = "Main UI storyboard name";
    public static final String LAUNCH_SCREEN_FILE_PATH = "Path to the launch screen file";
    public static final String LAUNCH_IMAGES_SOURCE = "Name of the .appiconset in .xcasset";
    public static final String LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION = "Description of the reason why the app accesses the user’s location normally while running in the foreground";
    public static final String APP_ICONS_SOURCE = "Name of the .launchimage in .xcasset";
    public static final String ORGANIZATION_NAME_PROPERTY_NAME = "Organization Name";
    public static final String BUNDLE_ID_PROPERTY_NAME = "Organization ID";
    public static final String PACKAGE_NAME = "Package Name";
    public static final String PRODUCT_NAME_PROPERTY_NAME = "Product Name";
    public static final String PROJECT_NAME_PROPERTY_NAME = "Project Name";
    public static final String PROJECT_ROOT_PROPERTY_NAME = "Project Root";
    public static final String RELATIVE_PATH_TO_BUILD_DIR = "Relative path to build directory";
    public static final String RELATIVE_PATH_TO_BASE_PROJECT = "Relative path to base MOE project";
    public static final String SDK_VERSION_PROPERTY_NAME = "SDK Version";
    public static final String SKIP_GRADLE_WRAPPER_PROPERTY_NAME = "Skip Gradle Wrapper";
    public static final String SUPPORTED_INTERFACE_ORIENTATIONS = "Supported interface orientations";
    public static final String SYM_ROOT = "Sym root";
    public static final String TARGET_PLATFORM_PROPERTY_NAME = "Target Platform";
    public static final String TEST_INFO_PLIST_PATH = "Test info plist path";
    public static final String TEST_RESOURCES_SET = "Test resources set";
    public static final String USE_ECLIPSE_PROPERTY_NAME = "Use Eclipse";
    public static final String USE_IDEA_PROPERTY_NAME = "Use Idea";
    public static final String USE_KOTLIN_PROPERTY_NAME = "Use Kotlin";
    public static final String USE_SCALA_PROPERTY_NAME = "Use Scala";

    public static final String TARGET_PLATFORM_IOS_UNIVERSAL = "Universal iOS";
    public static final String TARGET_PLATFORM_IOS_IPHONE = "iPhone";
    public static final String TARGET_PLATFORM_IOS_IPAD = "iPad";
    public static final String TARGET_PLATFORM_TVOS = "tvOS";
    /**
     * Preferred gradle version.
     */
    public static String DEFAULT_GRADLE_VERSION = "2.7";
    /**
     * Target platform.
     */
    private String targetPlatform;
    /**
     * Project root path.
     */
    private File projectRoot;
    /**
     * Project name.
     */
    private String projectName;
    /**
     * Organization name.
     */
    private String organizationName;
    /**
     * Organization ID.
     */
    private String bundleID;
    /**
     * SDK version.
     */
    private String sdkVersion;
    /**
     * Gradle version.
     */
    private String gradleVersion;
    /**
     * Use eclipse plugin.
     */
    private boolean useEclipse = false;
    /**
     * Use scala plugin.
     */
    private boolean useScala = false;
    /**
     * Skip Gradle wrapper generation.
     */
    private boolean skipGradleWrapper = false;
    /**
     * Product name.
     */
    private String productName;
    /**
     * Use idea plugin.
     */
    private boolean useIdea = false;
    /**
     * Use kotlin plugin.
     */
    private boolean useKotlin = false;
    /**
     * Main class name.
     */
    private String mainClassName;
    /**
     * MainUI storyboard path.
     */
    private String mainUIStoryboardPath;
    /**
     * Path to the launch screen file";
     */
    private String launchScreenFilePath;
    /**
     * Name of the .appiconset in .xcasset
     */
    private String launchImagesSource;
    /**
     * Describes the reason why the app accesses the user’s location normally while running in the foreground.
     */
    private String locationWhenInUseUsageDescription;
    /**
     * Name of the .launchimage in .xcasset
     */
    private String appIconsSource;
    /**
     * Package name.
     */
    private String packageName;
    /**
     * Absolute path to Info.plist file.
     * If it was not set, new Info.plist file will be generated.
     */
    private String infoPlistPath;
    /**
     * Absolute path to Info-Test.plist file.
     * If it was not set, new Info-Test.plist file will be generated.
     */
    private String testInfoPlistPath;
    /**
     * Relative path to base MOE project dir.
     */
    private String relativePathToBasePrj;
    /**
     * Relative path to build dir.
     */
    private String relativePathToBuildDir;
    /**
     * Relative path to build dir.
     */
    private List<String> mainResourcesSet;
    /**
     * Relative path to build dir.
     */
    private List<String> testResourcesSet;
    /**
     * Path to binary files.
     */
    private String symRoot;
    /**
     * If true application does not run in background.
     */
    private Boolean applicationExitOnSuspend;
    /**
     * Bundle versions string, short.
     */
    private String bundleShortVersionString;
    /**
     * Bundle version.
     */
    private String bundleVersion;
    /**
     * Deployment target.
     */
    private String deploymentTarget = "9.0";
    /**
     * Supported interface orientations.
     */
    private List<String> supportedInterfaceOrientations;
    /**
     * Linked libraries.
     */
    private IdentityHashMap<Enum, List<String>> dependenciesManifestsProperties;

    /**
     * Returns the names of pre-defined SDKs.
     *
     * @return list of pre-defined SDKs
     */
    public static ArrayList<String> getKnownSdks() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("1.0.+");
        return names;
    }

    /**
     * Returns the names of the supported gradle versions.
     *
     * @return list of supported gradle versions
     */
    public static ArrayList<String> getSupportedGradleVersions() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("2.0");
        names.add("2.1");
        names.add("2.2");
        names.add("2.2.1");
        names.add("2.3");
        names.add("2.4");
        names.add("2.5");
        names.add("2.6");
        names.add("2.7");
        return names;
    }

    /**
     * Returns a list of supported target platforms.
     *
     * @return list of supported target platforms
     */
    public static ArrayList<String> getSupportedTargetPlatforms() {
        ArrayList<String> targets = new ArrayList<String>();
        targets.add(TARGET_PLATFORM_IOS_UNIVERSAL);
        targets.add(TARGET_PLATFORM_IOS_IPHONE);
        targets.add(TARGET_PLATFORM_IOS_IPAD);
        targets.add(TARGET_PLATFORM_TVOS);
        return targets;
    }

    /**
     * Returns the deployment target.
     *
     * @return deployment target
     */
    public String getDeploymentTarget() {
        return deploymentTarget;
    }

    /**
     * Sets the deployment target.
     *
     * @param deploymentTarget deployment target
     */
    public void setDeploymentTarget(String deploymentTarget) {
        this.deploymentTarget = deploymentTarget;
    }

    /**
     * Returns the applicationExitOnSuspend.
     *
     * @return applicationExitOnSuspend
     */
    public Boolean getApplicationExitOnSuspend() {
        return applicationExitOnSuspend;
    }

    /**
     * Sets the applicationExitOnSuspend.
     *
     * @param applicationExitOnSuspend
     */
    public void setApplicationExitOnSuspend(Boolean applicationExitOnSuspend) {
        this.applicationExitOnSuspend = applicationExitOnSuspend;
    }

    /**
     * Returns the bundle short version string.
     *
     * @return bundle short version string
     */
    public String getBundleShortVersionString() {
        return bundleShortVersionString;
    }

    /**
     * Sets the bundle short versionString.
     *
     * @param bundleShortVersionString project's root path
     */
    public void setBundleShortVersionString(String bundleShortVersionString) {
        this.bundleShortVersionString = bundleShortVersionString;
    }

    /**
     * Returns the bundle version.
     *
     * @return bundle version
     */
    public String getBundleVersion() {
        return bundleVersion;
    }

    /**
     * Sets the bundle version.
     *
     * @param bundleVersion bundle version
     */
    public void setBundleVersion(String bundleVersion) {
        this.bundleVersion = bundleVersion;
    }

    /**
     * Returns the supported interface orientations.
     *
     * @return
     */
    public List<String> getSupportedInterfaceOrientations() {
        return supportedInterfaceOrientations;
    }

    /**
     * Sets the supported interface orientations.
     *
     * @param supportedInterfaceOrientations
     */
    public void setSupportedInterfaceOrientations(List<String> supportedInterfaceOrientations) {
        this.supportedInterfaceOrientations = supportedInterfaceOrientations;
    }

    /**
     * Returns the target platform.
     *
     * @return target platform
     */
    public String getTargetPlatform() {
        return targetPlatform;
    }

    /**
     * Sets the target platform.
     *
     * @param targetPlatform target platform
     */
    public void setTargetPlatform(String targetPlatform) {
        this.targetPlatform = targetPlatform;
    }

    /**
     * Returns the project's root path.
     *
     * @return project's root path
     */
    public File getProjectRoot() {
        return projectRoot;
    }

    /**
     * Sets the project's root path.
     *
     * @param projectRoot project's root path
     */
    public void setProjectRoot(File projectRoot) {
        this.projectRoot = projectRoot;
    }

    /**
     * Returns the project name.
     *
     * @return project name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the project name.
     *
     * @param projectName project name
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * Returns the organization name.
     *
     * @return organization name
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the organization name.
     *
     * @param organizationName organization name
     */
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    /**
     * Returns the bundle ID.
     *
     * @return bundle ID
     */
    public String getBundleID() {
        return bundleID;
    }

    /**
     * Sets the bundle ID.
     *
     * @param bundleID bundle ID
     */
    public void setBundleID(String bundleID) {
        this.bundleID = bundleID;
    }

    /**
     * Returns the normalized bundle ID.
     *
     * @return normalized bundle ID
     */
    public String getNormalizedBundleID() {
        return Normalizer.normalize(bundleID, Normalizer.Form.NFD).replaceAll("[^.a-zA-Z0-9]", "-");
    }

    /**
     * Returns the SDK version.
     *
     * @return SDK version
     */
    public String getSdkVersion() {
        return sdkVersion;
    }

    /**
     * Sets the SDK version.
     *
     * @param sdkVersion SDK version
     */
    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    /**
     * Returns the use Eclipse flag.
     *
     * @return use Eclipse flag
     */
    public boolean getUseEclipse() {
        return useEclipse;
    }

    /**
     * Sets the use Eclipse flag.
     *
     * @param useEclipse use Eclipse flag
     */
    public void setUseEclipse(boolean useEclipse) {
        this.useEclipse = useEclipse;
    }

    /**
     * Returns the use Scala flag.
     *
     * @return use Scala flag
     */
    public boolean getUseScala() {
        return useScala;
    }

    /**
     * Sets the use Scala flag.
     *
     * @param useScala use Scala flag
     */
    public void setUseScala(boolean useScala) {
        this.useScala = useScala;
    }

    /**
     * Returns the skip Gradle wrapper flag.
     *
     * @return skip Gradle wrapper flag
     */
    public boolean getSkipGradleWrapper() {
        return skipGradleWrapper;
    }

    /**
     * Sets the skip Gradle wrapper flag.
     *
     * @param skipGradleWrapper skip Gradle wrapper flag
     */
    public void setSkipGradleWrapper(boolean skipGradleWrapper) {
        this.skipGradleWrapper = skipGradleWrapper;
    }

    /**
     * Returns the Gradle version.
     *
     * @return Gradle version
     */
    public String getGradleVersion() {
        return gradleVersion;
    }

    /**
     * Sets the Gradle version.
     *
     * @param gradleVersion Gradle version
     */
    public void setGradleVersion(String gradleVersion) {
        this.gradleVersion = gradleVersion;
    }

    /**
     * Returns the product name.
     *
     * @return product name
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the product name.
     *
     * @param productName product name
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * Returns the use Idea flag.
     *
     * @return use Idea flag
     */
    public boolean getUseIdea() {
        return useIdea;
    }

    /**
     * Sets the use Idea flag.
     *
     * @param useIdea use Idea flag
     */
    public void setUseIdea(boolean useIdea) {
        this.useIdea = useIdea;
    }

    /**
     * Returns the use Kotlin flag.
     *
     * @return use Kotlin flag
     */
    public boolean getUseKotlin() {
        return useKotlin;
    }

    /**
     * Sets the use Kotlin flag.
     *
     * @param useKotlin use Scala flag
     */
    public void setUseKotlin(boolean useKotlin) {
        this.useKotlin = useKotlin;
    }

    /**
     * Returns true if the target is iOS.
     *
     * @return true if the target is iOS
     */
    public boolean targetIsIOS() {
        return TARGET_PLATFORM_IOS_UNIVERSAL.equals(targetPlatform)
                || TARGET_PLATFORM_IOS_IPHONE.equals(targetPlatform)
                || TARGET_PLATFORM_IOS_IPAD.equals(targetPlatform);
    }

    /**
     * Returns true if the target is tvOS.
     *
     * @return true if the target is tvOS
     */
    public boolean targetIsTvOS() {
        return TARGET_PLATFORM_TVOS.equals(targetPlatform);
    }

    @Override
    public void validate() throws ConfigurationValidationException {
        // targetPlatform
        assertNotNull(TARGET_PLATFORM_PROPERTY_NAME, targetPlatform);
        assertNotEmpty(TARGET_PLATFORM_PROPERTY_NAME, targetPlatform);
        assertValueIsOneOf(TARGET_PLATFORM_PROPERTY_NAME, targetPlatform, getSupportedTargetPlatforms().toArray());

        // projectRoot
        assertNotNull(PROJECT_ROOT_PROPERTY_NAME, projectRoot);

        // projectName
        assertNotNull(PROJECT_NAME_PROPERTY_NAME, projectName);
        assertNotEmpty(PROJECT_NAME_PROPERTY_NAME, projectName);

        // organizationName
        assertNotNull(ORGANIZATION_NAME_PROPERTY_NAME, organizationName);

        // bundleID
//        if ((infoPlistPath == null) || infoPlistPath.isEmpty() || !(new File(infoPlistPath).exists())) {
//            if (!(new File(Configuration.DEFAULT_MAIN_INFO_PLIST_PATH + "Info.plist").exists())) {
//                assertNotNull(BUNDLE_ID_PROPERTY_NAME, bundleID);
//                assertNotEmpty(BUNDLE_ID_PROPERTY_NAME, bundleID);
//            }
//        }

        // sdkVersion
//        assertNotNull(SDK_VERSION_PROPERTY_NAME, sdkVersion);
//        assertNotEmpty(SDK_VERSION_PROPERTY_NAME, sdkVersion);

        // gradleVersion
        if (!getSkipGradleWrapper()) {
            assertNotNull(GRADLE_VERSION_PROPERTY_NAME, gradleVersion);
            assertNotEmpty(GRADLE_VERSION_PROPERTY_NAME, gradleVersion);
        }

        // productName
        assertNotEmpty(PRODUCT_NAME_PROPERTY_NAME, productName);
    }

    @Override
    public Object getProperty(String key) {
        if (APPLICATION_EXIT_ON_SUSPEND.equals(key)) {
            return getApplicationExitOnSuspend();
        } else if (BUNDLE_SHORT_VERSION_STRING.equals(key)) {
            return getBundleShortVersionString();
        } else if (BUNDLE_VERSION.equals(key)) {
            return getBundleVersion();
        } else if (DEPLOYMENT_TARGET.equals(key)) {
            return getDeploymentTarget();
        } else if (INFO_PLIST_PATH.equals(key)) {
            return getInfoPlistPath();
        } else if (MAIN_CLASS_NAME.equals(key)) {
            return getMainClassName();
        } else if (MAIN_RESOURCES_SET.equals(key)) {
            return getMainResourcesSet();
        } else if (MAIN_UI_STORYBOARD_PATH.equals(key)) {
            return getMainUIStoryboardPath();
        } else if (LAUNCH_SCREEN_FILE_PATH.equals(key)) {
            return getLaunchScreenFilePath();
        } else if (LAUNCH_IMAGES_SOURCE.equals(key)) {
            return getLaunchImagesSource();
        } else if (LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION.equals(key)) {
            return getLocationWhenInUseUsageDescription();
        } else if (APP_ICONS_SOURCE.equals(key)) {
            return getAppIconsSource();
        } else if (PACKAGE_NAME.equals(key)) {
            return getPackageName();
        } else if (TARGET_PLATFORM_PROPERTY_NAME.equals(key)) {
            return getTargetPlatform();
        } else if (TEST_INFO_PLIST_PATH.equals(key)) {
            return getTestInfoPlistPath();
        } else if (TEST_RESOURCES_SET.equals(key)) {
            return getTestResourcesSet();
        } else if (PROJECT_ROOT_PROPERTY_NAME.equals(key)) {
            return getProjectRoot();
        } else if (PROJECT_NAME_PROPERTY_NAME.equals(key)) {
            return getProjectName();
        } else if (ORGANIZATION_NAME_PROPERTY_NAME.equals(key)) {
            return getOrganizationName();
        } else if (BUNDLE_ID_PROPERTY_NAME.equals(key)) {
            return getBundleID();
        } else if (RELATIVE_PATH_TO_BASE_PROJECT.equals(key)) {
            return getRelativePathToBasePrj();
        } else if (RELATIVE_PATH_TO_BUILD_DIR.equals(key)) {
            return getRelativePathToBasePrj();
        } else if (SDK_VERSION_PROPERTY_NAME.equals(key)) {
            return getSdkVersion();
        } else if (GRADLE_VERSION_PROPERTY_NAME.equals(key)) {
            return getGradleVersion();
        } else if (USE_ECLIPSE_PROPERTY_NAME.equals(key)) {
            return getUseEclipse();
        } else if (USE_SCALA_PROPERTY_NAME.equals(key)) {
            return getUseScala();
        } else if (SKIP_GRADLE_WRAPPER_PROPERTY_NAME.equals(key)) {
            return getSkipGradleWrapper();
        } else if (PRODUCT_NAME_PROPERTY_NAME.equals(key)) {
            return getProductName();
        } else if (DEPENDENCIES_MANIFEST_PROPERTIES.equals(key)) {
            return getDependenciesManifestsProperties();
        } else if (SUPPORTED_INTERFACE_ORIENTATIONS.equals(key)) {
            return getSupportedInterfaceOrientations();
        } else if (SYM_ROOT.equals(key)) {
            return getSymRoot();
        } else if (USE_IDEA_PROPERTY_NAME.equals(key)) {
            return getUseIdea();
        } else if (USE_KOTLIN_PROPERTY_NAME.equals(key)) {
            return getUseKotlin();
        } else {
            return super.getProperty(key);
        }
    }

    @Override
    public void setProperty(String key, Object value) {
        if (APPLICATION_EXIT_ON_SUSPEND.equals(key)) {
            setApplicationExitOnSuspend((Boolean) value);
        } else if (BUNDLE_SHORT_VERSION_STRING.equals(key)) {
            setBundleShortVersionString((String) value);
        } else if (BUNDLE_VERSION.equals(key)) {
            setBundleVersion((String) value);
        } else if (DEPLOYMENT_TARGET.equals(key)) {
            setDeploymentTarget((String) value);
        } else if (INFO_PLIST_PATH.equals(key)) {
            setInfoPlistPath((String) value);
        } else if (MAIN_CLASS_NAME.equals(key)) {
            setMainClassName((String) value);
        } else if (MAIN_RESOURCES_SET.equals(key)) {
            setMainResourcesSet((List<String>) value);
        } else if (MAIN_UI_STORYBOARD_PATH.equals(key)) {
            setMainUIStoryboardPath((String) value);
        } else if (LAUNCH_SCREEN_FILE_PATH.equals(key)) {
            setLaunchScreenFilePath((String) value);
        } else if (LAUNCH_IMAGES_SOURCE.equals(key)) {
            setLaunchImagesSource((String) value);
        } else if (LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION.equals(key)) {
            setLocationWhenInUseUsageDescription((String) value);
        } else if (APP_ICONS_SOURCE.equals(key)) {
            setAppIconsSource((String) value);
        } else if (PACKAGE_NAME.equals(key)) {
            setPackageName((String) value);
        } else if (TARGET_PLATFORM_PROPERTY_NAME.equals(key)) {
            setTargetPlatform((String) value);
        } else if (TEST_INFO_PLIST_PATH.equals(key)) {
            setTestInfoPlistPath((String) value);
        } else if (TEST_RESOURCES_SET.equals(key)) {
            setTestResourcesSet((List<String>) value);
        } else if (PROJECT_ROOT_PROPERTY_NAME.equals(key)) {
            setProjectRoot((File) value);
        } else if (PROJECT_NAME_PROPERTY_NAME.equals(key)) {
            setProjectName((String) value);
        } else if (ORGANIZATION_NAME_PROPERTY_NAME.equals(key)) {
            setOrganizationName((String) value);
        } else if (BUNDLE_ID_PROPERTY_NAME.equals(key)) {
            setBundleID((String) value);
        } else if (RELATIVE_PATH_TO_BASE_PROJECT.equals(key)) {
            setRelativePathToBasePrj((String) value);
        } else if (RELATIVE_PATH_TO_BUILD_DIR.equals(key)) {
            setRelativePathToBasePrj((String) value);
        } else if (SDK_VERSION_PROPERTY_NAME.equals(key)) {
            setSdkVersion((String) value);
        } else if (GRADLE_VERSION_PROPERTY_NAME.equals(key)) {
            setGradleVersion((String) value);
        } else if (USE_ECLIPSE_PROPERTY_NAME.equals(key)) {
            setUseEclipse((Boolean) value);
        } else if (USE_SCALA_PROPERTY_NAME.equals(key)) {
            setUseScala((Boolean) value);
        } else if (SKIP_GRADLE_WRAPPER_PROPERTY_NAME.equals(key)) {
            setSkipGradleWrapper((Boolean) value);
        } else if (PRODUCT_NAME_PROPERTY_NAME.equals(key)) {
            setProductName((String) value);
        } else if (DEPENDENCIES_MANIFEST_PROPERTIES.equals(key)) {
            setDependenciesManifestsProperties((IdentityHashMap<Enum, List<String>>) value);
        } else if (SUPPORTED_INTERFACE_ORIENTATIONS.equals(key)) {
            setSupportedInterfaceOrientations((List<String>) value);
        } else if (SYM_ROOT.equals(key)) {
            setSymRoot((String) value);
        } else if (USE_IDEA_PROPERTY_NAME.equals(key)) {
            setUseIdea((Boolean) value);
        } else if (USE_KOTLIN_PROPERTY_NAME.equals(key)) {
            setUseKotlin((Boolean) value);
        } else {
            super.setProperty(key, value);
        }
    }

    @Override
    public Class<?> getPropertyClass(String key) {
        if (APPLICATION_EXIT_ON_SUSPEND.equals(key)) {
            return Boolean.class;
        } else if (BUNDLE_SHORT_VERSION_STRING.equals(key)) {
            return String.class;
        } else if (BUNDLE_VERSION.equals(key)) {
            return String.class;
        } else if (DEPLOYMENT_TARGET.equals(key)) {
            return String.class;
        } else if (INFO_PLIST_PATH.equals(key)) {
            return String.class;
        } else if (LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION.equals(key)) {
            return String.class;
        } else if (MAIN_CLASS_NAME.equals(key)) {
            return String.class;
        } else if (MAIN_RESOURCES_SET.equals(key)) {
            return List.class;
        } else if (MAIN_UI_STORYBOARD_PATH.equals(key)) {
            return String.class;
        } else if (PACKAGE_NAME.equals(key)) {
            return String.class;
        } else if (TARGET_PLATFORM_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (PROJECT_ROOT_PROPERTY_NAME.equals(key)) {
            return File.class;
        } else if (PROJECT_NAME_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (ORGANIZATION_NAME_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (BUNDLE_ID_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (RELATIVE_PATH_TO_BASE_PROJECT.equals(key)) {
            return String.class;
        } else if (RELATIVE_PATH_TO_BUILD_DIR.equals(key)) {
            return String.class;
        } else if (SDK_VERSION_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (GRADLE_VERSION_PROPERTY_NAME.equals(key)) {
            return String.class;
        } else if (USE_ECLIPSE_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (USE_SCALA_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (SKIP_GRADLE_WRAPPER_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (PRODUCT_NAME_PROPERTY_NAME.equals(key)) {
            return HashSet.class;
        } else if (DEPENDENCIES_MANIFEST_PROPERTIES.equals(key)) {
            return String.class;
        } else if (SUPPORTED_INTERFACE_ORIENTATIONS.equals(key)) {
            return List.class;
        } else if (SYM_ROOT.equals(key)) {
            return String.class;
        } else if (USE_IDEA_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else if (USE_KOTLIN_PROPERTY_NAME.equals(key)) {
            return Boolean.class;
        } else {
            return super.getPropertyClass(key);
        }
    }

    @Override
    public String[] getAllPropertyNames() {
        return ArrayUtil.concatenate(super.getAllPropertyNames(),
                new String[]{
                        APPLICATION_EXIT_ON_SUSPEND,
                        BUNDLE_SHORT_VERSION_STRING,
                        BUNDLE_VERSION,
                        DEPENDENCIES_MANIFEST_PROPERTIES,
                        DEPLOYMENT_TARGET,
                        GRADLE_VERSION_PROPERTY_NAME,
                        INFO_PLIST_PATH,
                        LOCATION_WHEN_IN_USE_USAGE_DESCRIPTION,
                        MAIN_CLASS_NAME,
                        MAIN_RESOURCES_SET,
                        MAIN_UI_STORYBOARD_PATH,
                        ORGANIZATION_NAME_PROPERTY_NAME,
                        BUNDLE_ID_PROPERTY_NAME,
                        PACKAGE_NAME,
                        PRODUCT_NAME_PROPERTY_NAME,
                        PROJECT_ROOT_PROPERTY_NAME,
                        PROJECT_NAME_PROPERTY_NAME,
                        RELATIVE_PATH_TO_BASE_PROJECT,
                        RELATIVE_PATH_TO_BUILD_DIR,
                        SDK_VERSION_PROPERTY_NAME,
                        SKIP_GRADLE_WRAPPER_PROPERTY_NAME,
                        SUPPORTED_INTERFACE_ORIENTATIONS,
                        SYM_ROOT,
                        TARGET_PLATFORM_PROPERTY_NAME,
                        TEST_INFO_PLIST_PATH,
                        TEST_RESOURCES_SET,
                        USE_ECLIPSE_PROPERTY_NAME,
                        USE_IDEA_PROPERTY_NAME,
                        USE_KOTLIN_PROPERTY_NAME,
                        USE_SCALA_PROPERTY_NAME
                });
    }

    public String getMainClassName() {
        return mainClassName;
    }

    public void setMainClassName(String mainClassName) {
        this.mainClassName = mainClassName;
    }

    public String getMainUIStoryboardPath() {
        return mainUIStoryboardPath;
    }

    public void setMainUIStoryboardPath(String mainUIStoryboardPath) {
        this.mainUIStoryboardPath = mainUIStoryboardPath;
    }

    public String getLaunchScreenFilePath() {
        return launchScreenFilePath;
    }

    public void setLaunchScreenFilePath(String launchScreenFilePath) {
        this.launchScreenFilePath = launchScreenFilePath;
    }

    public String getLaunchImagesSource() {
        return launchImagesSource;
    }

    public void setLaunchImagesSource(String launchImagesSource) {
        this.launchImagesSource = launchImagesSource;
    }

    public String getLocationWhenInUseUsageDescription() {
        return locationWhenInUseUsageDescription;
    }

    public void setLocationWhenInUseUsageDescription(String locationWhenInUseUsageDescription) {
        this.locationWhenInUseUsageDescription = locationWhenInUseUsageDescription;
    }

    public String getAppIconsSource() {
        return appIconsSource;
    }

    public void setAppIconsSource(String appIconsSource) {
        this.appIconsSource = appIconsSource;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getInfoPlistPath() {
        return infoPlistPath;
    }

    public void setInfoPlistPath(String infoPlistPath) {
        this.infoPlistPath = infoPlistPath;
    }

    public String getTestInfoPlistPath() {
        return testInfoPlistPath;
    }

    public void setTestInfoPlistPath(String testInfoPlistPath) {
        this.testInfoPlistPath = testInfoPlistPath;
    }

    public String getSymRoot() {
        return symRoot;
    }

    public void setSymRoot(String symRoot) {
        this.symRoot = symRoot;
    }

    public String getRelativePathToBasePrj() {
        return relativePathToBasePrj;
    }

    public void setRelativePathToBasePrj(String relativePathToBasePrj) {
        this.relativePathToBasePrj = relativePathToBasePrj;
    }

    public String getRelativePathToBuildDir() {
        return relativePathToBuildDir;
    }

    public void setRelativePathToBuildDir(String relativePathToBuildDir) {
        this.relativePathToBuildDir = relativePathToBuildDir;
    }

    public IdentityHashMap<Enum, List<String>> getDependenciesManifestsProperties() {
        return dependenciesManifestsProperties;
    }

    public void setDependenciesManifestsProperties(IdentityHashMap<Enum, List<String>> dependenciesManifestsProperties) {
        this.dependenciesManifestsProperties = dependenciesManifestsProperties;
    }

    public List<String> getMainResourcesSet() {
        return mainResourcesSet;
    }

    public void setMainResourcesSet(List<String> mainResourcesSet) {
        this.mainResourcesSet = mainResourcesSet;
    }

    public List<String> getTestResourcesSet() {
        return testResourcesSet;
    }

    public void setTestResourcesSet(List<String> testResourcesSet) {
        this.testResourcesSet = testResourcesSet;
    }
}
