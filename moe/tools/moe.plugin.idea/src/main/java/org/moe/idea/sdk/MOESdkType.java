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

package org.moe.idea.sdk;

import com.google.common.collect.Lists;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.AdditionalDataConfigurable;
import com.intellij.openapi.projectRoots.JavaSdk;
import com.intellij.openapi.projectRoots.JavaSdkType;
import com.intellij.openapi.projectRoots.JavaSdkVersion;
import com.intellij.openapi.projectRoots.JdkUtil;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.projectRoots.SdkModel;
import com.intellij.openapi.projectRoots.SdkModificator;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.projectRoots.impl.JavaDependentSdkType;
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil;
import com.intellij.openapi.roots.AnnotationOrderRootType;
import com.intellij.openapi.roots.JavadocOrderRootType;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.util.SystemProperties;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.ProjectUtil;
import org.moe.gradle.model.MOESdkProperties;
import org.moe.idea.configurable.MOESdkConfigurable;
import org.moe.idea.model.GradleModuleModel;
import org.moe.idea.utils.ModuleUtils;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class MOESdkType extends JavaDependentSdkType implements JavaSdkType {

    @NotNull
    public static MOESdkType getInstance() {
        return SdkType.findInstance(MOESdkType.class);
    }

    public static boolean isMOESdk(@NotNull Sdk sdk) {
        return sdk.getSdkType() == getInstance();
    }

    @Nullable
    private static Sdk getJdk(@NotNull Sdk sdk) {
        MOESdkAdditionalData data = MOESdkAdditionalData.getInstance(sdk);
        return data != null ? data.getJavaSdk() : null;
    }

    public static final LanguageLevel REQUIRED_JAVA_LANGUAGE_LEVEL = LanguageLevel.JDK_1_8;
    public static final String SDK_NAME = "MOE SDK";

    public MOESdkType() {
        super(SDK_NAME);
    }

    @Override
    public String getBinPath(@NotNull Sdk sdk) {
        Sdk jdk = getJdk(sdk);
        return jdk == null ? null : JavaSdk.getInstance().getBinPath(jdk);
    }

    @Override
    public String getToolsPath(@NotNull Sdk sdk) {
        Sdk jdk = getJdk(sdk);
        if (jdk != null && jdk.getVersionString() != null) {
            return JavaSdk.getInstance().getToolsPath(jdk);
        }
        return null;
    }

    @Override
    public String getVMExecutablePath(@NotNull Sdk sdk) {
        Sdk jdk = getJdk(sdk);
        return jdk == null ? null : JavaSdk.getInstance().getVMExecutablePath(jdk);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return null;
    }

    @Override
    public boolean isValidSdkHome(String path) {
        if (StringUtil.isEmpty(path)) {
            return false;
        }
        File sdkPath = new File(path);

        return sdkPath.exists() && sdkPath.isDirectory();
    }

    @Override
    @NotNull
    public String suggestSdkName(String s, String s1) {
        return SDK_NAME;
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(@NotNull SdkModel sdkModel, @NotNull SdkModificator sdkModificator) {
        return new MOESdkConfigurable(sdkModel);
    }

    @NotNull @Override
    public String getPresentableName() {
        return SDK_NAME;
    }

    @Override
    public Icon getIcon() {
        return MOEIcons.MOESmall;
    }

    @NotNull @Override
    public Icon getIconForAddAction() {
        return MOEIcons.MOESmall;
    }

    @Override
    public void saveAdditionalData(@NotNull SdkAdditionalData sdkAdditionalData, @NotNull Element element) {
        if (sdkAdditionalData instanceof MOESdkAdditionalData) {
            ((MOESdkAdditionalData)sdkAdditionalData).save(element);
        }
    }

    @Override
    public @Nullable SdkAdditionalData loadAdditionalData(@NotNull Sdk currentSdk, @NotNull Element additional) {
        return new MOESdkAdditionalData(currentSdk, additional);
    }

    @Override
    public boolean setupSdkPaths(@NotNull final Sdk sdk, @NotNull final SdkModel sdkModel) {
        Sdk jdk = getJDK();

        if(jdk == null) {
            throw new RuntimeException("Can't find valid version of JDK.");
        }

        getAndInitialiseSdkModificator(sdk, jdk).commitChanges();

        return true;
    }

    @Override
    public boolean isRootTypeApplicable(@NotNull OrderRootType type) {
        return type == OrderRootType.CLASSES ||
                type == OrderRootType.SOURCES ||
                type == JavadocOrderRootType.getInstance() ||
                type == AnnotationOrderRootType.getInstance();
    }

    @NotNull
    private static SdkModificator getAndInitialiseSdkModificator(
            @NotNull Sdk sdk,
            @Nullable Sdk jdk
    ) {
        final SdkModificator sdkModificator = sdk.getSdkModificator();
        final MOESdkAdditionalData data = new MOESdkAdditionalData(sdk, jdk);
        sdkModificator.setSdkAdditionalData(data);
        if (jdk != null) {
            sdkModificator.setVersionString(jdk.getVersionString());
        }
        return sdkModificator;
    }

    public static Sdk getJDK() {
        Sdk sdk = null;

        for(Sdk jdk: ProjectJdkTable.getInstance().getAllJdks()) {
            if(jdk != null && jdk.getSdkType() instanceof JavaSdk) {

                if(sdk == null) {
                    sdk = jdk;
                }
                else {
                    JavaSdkVersion version = ((JavaSdk) jdk.getSdkType()).getVersion(jdk);
                    JavaSdkVersion desiredVersion = ((JavaSdk)sdk.getSdkType()).getVersion(sdk);

                    if(version != null && desiredVersion != null && version.isAtLeast(desiredVersion)) {
                        sdk = jdk;
                    }
                }
            }
        }

        return sdk;
    }

    public static Sdk getMOESdk(Module module) {
        if (module == null) {
            return null;
        }

        String moeRootPath;

        // Read sdk property using facet
        MOESdkProperties sdkProperties = GradleModuleModel.getSdkProperties(module);
        if (sdkProperties != null) {
            moeRootPath = sdkProperties.getHome();
        } else {
            // For compatible with old Gradle plugin
            String modulePath = ModuleUtils.getModulePath(module);
            if (modulePath == null) {
                return null;
            }

            final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(new File(modulePath), ProjectUtil.SDK_PROPERTIES_TASK, MOESdkType.getJavaHome(module));

            moeRootPath = properties.getProperty(ProjectUtil.SDK_PATH_KEY);
        }

        if (moeRootPath == null) {
            return null;
        }

        String name = new File(moeRootPath).getName();

        ProjectJdkTable jdkTable = ProjectJdkTable.getInstance();

        for(Sdk sdk: jdkTable.getAllJdks()) {
            if(sdk != null && sdk.getHomePath() != null && sdk.getHomePath().equals(moeRootPath)) {
                return  sdk;
            }
        }


        Sdk jdk = getJDK();

        if(jdk == null) {
            jdk = findValidJdk();
        }

        if(jdk == null) {
            Messages.showMessageDialog(MOEText.get("JDK.Not.Found"), "Error", MOEIcons.MOELogo);
            return null;
        }

        final Sdk sdk = ProjectJdkTable.getInstance().createSdk(name, MOESdkType.getInstance());

        final SdkModificator sdkModificator = getAndInitialiseSdkModificator(sdk, jdk);
        sdkModificator.setHomePath(moeRootPath);
        sdkModificator.commitChanges();

        ApplicationManager.getApplication().runWriteAction(new Runnable() {
            @Override
            public void run() {
                ProjectJdkTable.getInstance().addJdk(sdk);
            }
        });

        return sdk;
    }

    public static Sdk findValidJdk() {
        Sdk[] sdks = ProjectJdkTable.getInstance().getAllJdks();

        if(sdks == null || sdks.length == 0) {
            List<File> jdkPaths = findPotentialJdkPaths();

            if(jdkPaths == null) {
                return null;
            }

            for (File jdkPath : jdkPaths) {
                if (JdkUtil.checkForJdk(jdkPath.getAbsolutePath())) {
                    Sdk jdk = SdkConfigurationUtil.createAndAddSDK(jdkPath.getAbsolutePath(), JavaSdk.getInstance());

                    if(jdk != null) {
                        if(isApplicableJdk(jdk)) {
                            return jdk;
                        }
                    }
                }
            }

            return null;
        }

        for(Sdk sdk : sdks) {
            if(sdk != null && sdk.getSdkType() instanceof JavaSdk) {
                if(isApplicableJdk(sdk)) {
                    return sdk;
                }
            }
        }

        for(Sdk sdk : sdks) {
            if(sdk != null && sdk.getSdkType() instanceof JavaSdk) {
                return sdk;
            }
        }

        return null;
    }

    public static boolean isApplicableJdk(@NotNull Sdk jdk) {

        if (!(jdk.getSdkType() instanceof JavaSdk)) {
            return false;
        }

        JavaSdkVersion version = JavaSdk.getInstance().getVersion(jdk);

        return (version != null && hasMatchingLangLevel(version, REQUIRED_JAVA_LANGUAGE_LEVEL));

    }

    private static boolean hasMatchingLangLevel(JavaSdkVersion jdkVersion, LanguageLevel langLevel) {
        LanguageLevel max = jdkVersion.getMaxLanguageLevel();

        return max.isAtLeast(langLevel);
    }

    private static List<File> findPotentialJdkPaths() {
        JavaSdk javaSdk = JavaSdk.getInstance();

        List<String> jdkPaths = Lists.newArrayList(javaSdk.suggestHomePaths());

        String javaHome = SystemProperties.getJavaHome();

        if(javaHome == null || javaHome.isEmpty()) {
            return null;
        }

        jdkPaths.add(javaHome);

        List<File> javaHomePaths = Lists.newArrayListWithCapacity(jdkPaths.size());

        for (String jdkPath : jdkPaths) {
            if (jdkPath == null) {
                continue;
            }

            File javaHomeDir = new File(jdkPath);

            if (javaHomeDir.isDirectory()) {
                javaHomePaths.add(javaHomeDir);
            }
        }

        return javaHomePaths;
    }

    @Nullable
    public static Sdk getJDK(@NotNull Module module) {
        Sdk currentSdk = ModuleRootManager.getInstance(module).getSdk();

        if (currentSdk != null && isMOESdk(currentSdk)) {
            MOESdkAdditionalData data = MOESdkAdditionalData.getInstance(currentSdk);
            currentSdk = data != null ? data.getJavaSdk() : null;
        }

        if (currentSdk != null && isApplicableJdk(currentSdk)) {
            return currentSdk;
        }

        return null;
    }

    @Nullable
    public static File getJavaHome(@NotNull Module module) {
        Sdk jdk = getJDK(module);

        String homePath = jdk == null ? null : jdk.getHomePath();

        return homePath == null ? null : new File(homePath);
    }

    @NotNull
    public static File requireJavaHome(@NotNull Module module) throws IOException {
        File javaHome = getJavaHome(module);
        if (javaHome == null) {
            throw new IOException("Module SDK not configured or it's not a valid JDK");
        }

        return javaHome;
    }
}
