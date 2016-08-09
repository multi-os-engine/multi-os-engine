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
import org.moe.idea.MOESdkPlugin;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.projectRoots.*;
import com.intellij.openapi.projectRoots.impl.JavaDependentSdkType;
import com.intellij.openapi.projectRoots.impl.SdkConfigurationUtil;
import com.intellij.openapi.roots.AnnotationOrderRootType;
import com.intellij.openapi.roots.JavadocOrderRootType;
import com.intellij.openapi.roots.OrderRootType;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.LocalFileSystem;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.pom.java.LanguageLevel;
import com.intellij.util.SystemProperties;
import org.jdom.Element;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;
import java.io.File;
import java.util.List;

import static com.intellij.openapi.projectRoots.JavaSdk.checkForJdk;

public class MOESdkType extends JavaDependentSdkType implements JavaSdkType {
    private static final String NAME = MOEText.get("SDK.Name");

    private static final String VERSION = MOEText.get("SDK.Version");

    public static final LanguageLevel REQUIRED_JAVA_LANGUAGE_LEVEL = LanguageLevel.JDK_1_8;

    private final Sdk javaSdk;

    private MOESdkType() {
        super(NAME);

        javaSdk = getJDK();
    }

    @Override
    public String getBinPath(Sdk sdk) {
        return ((JavaSdk)javaSdk.getSdkType()).getBinPath(javaSdk);
    }

    @Override
    public String getToolsPath(Sdk sdk) {
        return ((JavaSdk)javaSdk.getSdkType()).getToolsPath(javaSdk);
    }

    @Override
    public String getVMExecutablePath(Sdk sdk) {
        return ((JavaSdk)javaSdk.getSdkType()).getVMExecutablePath(javaSdk);
    }

    @Nullable
    @Override
    public String suggestHomePath() {
        return MOESdkPlugin.getSdkRootPath();
    }

    @Override
    public boolean isValidSdkHome(String path) {
        return MOESdkPlugin.getSdkRootPath().equals(path);
    }

    @Override
    public String suggestSdkName(String s, String s1) {
        return NAME + " " + VERSION;
    }

    @Nullable
    @Override
    public AdditionalDataConfigurable createAdditionalDataConfigurable(@NotNull SdkModel sdkModel, @NotNull SdkModificator sdkModificator) {
        return null;
    }

    @NotNull @Override
    public String getPresentableName() {
        return NAME;
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
        Sdk jdk = getJDK();

        if(jdk == null) {
            throw new RuntimeException("Can't find valid version of JDK.");
        }

        setupSdkRoots(sdk, jdk);

        return true;
    }

    @Override
    public boolean isRootTypeApplicable(@NotNull OrderRootType type) {
        return type == OrderRootType.CLASSES ||
            type == OrderRootType.SOURCES ||
            type == JavadocOrderRootType.getInstance() ||
            type == AnnotationOrderRootType.getInstance();
    }

    private void setupSdkRoots(Sdk sdk, Sdk jdk) {
        SdkModificator sdkModificator = sdk.getSdkModificator();
        sdkModificator.removeAllRoots();

        LocalFileSystem localFileSystem = LocalFileSystem.getInstance();

        for(File file : MOESdkPlugin.getSdkJavaLibraries()) {
            VirtualFile virtualFile = localFileSystem.findFileByIoFile(file);
            sdkModificator.addRoot(virtualFile, OrderRootType.CLASSES);
        }

        for (File file : MOESdkPlugin.getSdkJavaDocs()) {
            if (file.exists()) {
                VirtualFile virtualFile = localFileSystem.findFileByIoFile(file);
                sdkModificator.addRoot(virtualFile, JavadocOrderRootType.getInstance());
            }
        }

        sdkModificator.setVersionString(jdk.getVersionString());
        sdkModificator.setHomePath(MOESdkPlugin.getSdkRootPath());
        sdkModificator.commitChanges();
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

    public static Sdk getMOESdk() {
        String moeRootPath = MOESdkPlugin.getSdkRootPath();

        if(moeRootPath == null) {
            return null;
        }

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

        MOESdkType sdkType = new MOESdkType();

        final Sdk sdk = ProjectJdkTable.getInstance().createSdk(sdkType.suggestSdkName(null, null), sdkType);

        sdkType.setupSdkRoots(sdk, jdk);

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
                if (checkForJdk(jdkPath)) {
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

    private static boolean isApplicableJdk(@NotNull Sdk jdk) {

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
}
