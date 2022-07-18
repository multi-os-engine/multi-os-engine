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

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.projectRoots.AdditionalDataConfigurable;
import com.intellij.openapi.projectRoots.JavaSdkType;
import com.intellij.openapi.projectRoots.ProjectJdkTable;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.openapi.projectRoots.SdkAdditionalData;
import com.intellij.openapi.projectRoots.SdkModel;
import com.intellij.openapi.projectRoots.SdkModificator;
import com.intellij.openapi.projectRoots.SdkType;
import com.intellij.openapi.projectRoots.impl.JavaDependentSdkType;
import com.intellij.openapi.roots.AnnotationOrderRootType;
import com.intellij.openapi.roots.JavadocOrderRootType;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.pom.java.LanguageLevel;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.common.utils.ProjectUtil;
import org.moe.gradle.model.MOESdkProperties;
import org.moe.idea.compiler.MOEGradleRunner;
import org.moe.idea.model.GradleModuleModel;
import org.moe.idea.utils.ModuleUtils;
import res.MOEIcons;

import javax.swing.*;
import java.io.File;
import java.util.Properties;

public class MOESdkType extends JavaDependentSdkType implements JavaSdkType {

    @NotNull
    public static MOESdkType getInstance() {
        return SdkType.findInstance(MOESdkType.class);
    }

    public static boolean isMOESdk(@NotNull Sdk sdk) {
        return sdk.getSdkType() == getInstance();
    }

    public static final LanguageLevel REQUIRED_JAVA_LANGUAGE_LEVEL = LanguageLevel.JDK_1_8;
    public static final String SDK_NAME = "MOE SDK";

    public MOESdkType() {
        super(SDK_NAME);
    }

    @Override
    public String getBinPath(@NotNull Sdk sdk) {
        return null;
    }

    @Override
    public String getToolsPath(@NotNull Sdk sdk) {
        return null;
    }

    @Override
    public String getVMExecutablePath(@NotNull Sdk sdk) {
        return null;
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
        return null;
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
    }

    @Override
    public boolean setupSdkPaths(@NotNull final Sdk sdk, @NotNull final SdkModel sdkModel) {
        return true;
    }

    @Override
    public boolean isRootTypeApplicable(@NotNull OrderRootType type) {
        return type == OrderRootType.CLASSES ||
                type == OrderRootType.SOURCES ||
                type == JavadocOrderRootType.getInstance() ||
                type == AnnotationOrderRootType.getInstance();
    }

    /**
     * Get or create a new MOE SDK.
     *
     * If the given module is not configured with a MOE SDK, then this function will
     * run the Gradle task to obtain the SDK path and create a new SDK. Otherwise the existing
     * SDK will be returned.
     */
    public static Sdk getMOESdk(Module module) {
        if (module == null) {
            return null;
        }

        Sdk currentSdk = ModuleRootManager.getInstance(module).getSdk();
        if (currentSdk != null && isMOESdk(currentSdk) && currentSdk.getHomePath() != null) {
            return currentSdk;
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
                .retrievePropertiesFromGradle(new File(modulePath), ProjectUtil.SDK_PROPERTIES_TASK,
                        MOEGradleRunner.getGradleJavaHome(module));

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

        final Sdk sdk = ProjectJdkTable.getInstance().createSdk(name, MOESdkType.getInstance());

        final SdkModificator sdkModificator = sdk.getSdkModificator();
        sdkModificator.setVersionString(name);
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

}
