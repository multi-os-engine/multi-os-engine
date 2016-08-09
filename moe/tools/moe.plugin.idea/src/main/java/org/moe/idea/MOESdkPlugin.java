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

package org.moe.idea;

import com.intellij.ide.plugins.IdeaPluginDescriptor;
import com.intellij.ide.plugins.PluginManager;
import com.intellij.openapi.extensions.PluginId;
import org.moe.idea.sdk.MOESdkType;
import org.moe.idea.utils.ModuleUtils;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.module.impl.scopes.ModuleWithDependenciesScope;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;
import res.MOEIcons;
import res.MOEText;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MOESdkPlugin {

    public static final String SDK_ROOT_ENV_VAR_NAME = "MOE_HOME";


    public static String getResourcesFolderName() {
        return "resources";
    }

    public static String getSdkRootPath() {
        String sdkPath = System.getenv(SDK_ROOT_ENV_VAR_NAME);

        if (sdkPath == null || sdkPath.isEmpty()) {
            Messages.showMessageDialog(MOEText.get("Invalid.SDK.Path"), "Error", MOEIcons.MOELogo);
        }

        return sdkPath;
    }

    public static void getMOESdk() {
        MOESdkType.getMOESdk();
    }

    public static List<File> getSdkJavaLibraries() {
        List<File> jars = new ArrayList<File>();

        List<File> files = getSdkJars();

        for (File file : files) {
            if (!file.getName().endsWith("-dex.jar") &&
                !file.getName().endsWith("-javadoc.jar")) {
                jars.add(file);
            }
        }

        return jars;
    }

    public static List<File> getSdkJavaDocs() {
        List<File> jars = new ArrayList<File>();

        List<File> files = getSdkJars();

        for (File file : files) {
            if (file.getName().endsWith("-javadoc.jar")) {
                jars.add(file);
            }
        }

        return jars;
    }

    private static List<File> getSdkJars() {
        List<File> jars = new ArrayList<File>();

        File libsDir = new File(getSdkRootPath(), "sdk");

        File[] files = libsDir.listFiles();

        if(files == null) {
            return jars;
        }

        for (File file : files) {
            if (file.getName().endsWith(".jar")) {
                jars.add(file);
            }
        }

        return jars;
    }

    public static Collection<Module> getMoeModules(Project project) {
        List<Module> modules = new ArrayList<Module>();

        for (Module module : ModuleManager.getInstance(project).getModules()) {

            if (isValidMoeModule(module)) {
                modules.add(module);
            }
        }

        return modules;
    }

    public static boolean isValidMoeModule(Module module) {
        if (module == null) {
            return false;
        }

        ModuleWithDependenciesScope libraries = (ModuleWithDependenciesScope) module.getModuleWithLibrariesScope();
        Collection<VirtualFile> roots = libraries.getRoots();

        boolean coreFound = false;
        boolean iosFound = false;
        for (VirtualFile vf : roots) {
            String name = vf.getName();
            coreFound = coreFound ? coreFound : name.equals("moe-core.jar");
            iosFound = iosFound ? iosFound : name.equals("moe-ios.jar");
            if (coreFound & iosFound) {
                return true;
            }
        }

        return false;
    }

    public static Module findModuleForFile(Project project, VirtualFile file) {

        if (project == null || project.getBaseDir() == null) {
            return null;
        }

        String projectPath = project.getBaseDir().getPath();

        Module module = null;

        while (file != null && file.getPath().compareToIgnoreCase(projectPath) != 0) {
            module = ModuleUtil.findModuleForFile(file, project);

            if (module != null) {
                break;
            }

            file = file.getParent();
        }

        return module;
    }

    public static File getXcodeProjectFile(Module module) {
        if (module == null) {
            return null;
        }

        File projectFile = null;
        String xcodeProjectPath = ModuleUtils.getXcodeProjectPath(module);
        if (xcodeProjectPath != null) {
            projectFile = new File(xcodeProjectPath);
        } else {
            xcodeProjectPath = ModuleUtils.retrieveXcodeProjectPathFromGradle(module);
            ModuleUtils.setXcodeProjectPath(module, xcodeProjectPath);
        }

        return projectFile;
    }

    public static String getProductName(Module module) {
        if (module == null) {
            return null;
        }

        String productName = ModuleUtils.getProductName(module);
        if (productName == null) {
            productName = ModuleUtils.retrieveProductNameFromGradle(module);
            ModuleUtils.setProductName(module, productName);
        }

        return productName;
    }

    public static String getXcodeBuildAppPath(Module module, String arch, String configuration, boolean test) {
        String appPath = getXcodeBuildSymPath(ModuleUtils.getModulePath(module)) + File.separator + configuration + "-";

        if (arch.contains("arm")) {
            appPath += "iphoneos";
        } else {
            appPath += "iphonesimulator";
        }

        String suffix = test ? "-Test" : "";

        appPath += File.separator + getProductName(module) + suffix + ".app";

        return appPath;
    }

    public static String getXcodeBuildSymPath(String modulePath) {
        String symPath = modulePath + File.separator + "build" + File.separator + "moe" + File.separator + "xcodebuild" + File.separator +"sym";
        return symPath;
    }

    public static String getPluginVersion() {
        String version = "0.0.0.0";

        PluginId pluginId = PluginManager.getPluginByClassName(MOESdkPlugin.class.getCanonicalName());

        if(pluginId != null) {
            IdeaPluginDescriptor plugin = PluginManager.getPlugin(pluginId);

            if(plugin != null) {
                version = plugin.getVersion();
            }
        }

        return version;
    }
}
