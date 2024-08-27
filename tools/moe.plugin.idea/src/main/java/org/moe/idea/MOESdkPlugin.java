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

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.module.ModuleUtil;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.moe.idea.model.GradleModuleModel;
import org.moe.idea.utils.logger.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MOESdkPlugin {

    private static final Logger LOG = LoggerFactory.getLogger(MOESdkPlugin.class);

    public static String getResourcesFolderName() {
        return "resources";
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

    public static boolean isValidMoeLibModule(Module module) {
        return isValidMoeModule(module, false);
    }

    public static boolean isValidMoeModule(Module module) {
        return isValidMoeModule(module, true);
    }

    public static final String GRADLE_PLUGIN_MOE = "org.moe.gradle.MoePlugin";
    public static final String GRADLE_PLUGIN_MOE_SDK = "org.moe.gradle.MoeSDKPlugin";

    public static boolean isValidMoeModule(Module module, boolean isMOEApp) {
        if (module == null) {
            return false;
        }
        final String moduleName = module.getName();
        if (module.isDisposed()) {
            LOG.info("Invalid MOE module, already disposed (" + moduleName + ")");
            return false;
        }

        GradleModuleModel gradleModuleModel = GradleModuleModel.getInstance(module);
        if (gradleModuleModel != null) {
            if (gradleModuleModel.getGradlePluginList().contains(GRADLE_PLUGIN_MOE)) {
                return true;
            }
            if (!isMOEApp && gradleModuleModel.getGradlePluginList().contains(GRADLE_PLUGIN_MOE_SDK)) {
                return true;
            }

            String taskName = isMOEApp ? "moeLaunch" : "moeSDKProperties";
            return gradleModuleModel.getTaskNames().contains(taskName);
        }

        return false;
    }

    public static Module findModuleForFile(Project project, VirtualFile file) {

        if (project == null || project.getBasePath() == null) {
            return null;
        }

        String projectPath = project.getBasePath();

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

}
