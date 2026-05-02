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

package org.moe.idea.utils;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ReadAction;
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.DisposeAwareRunnable;

public class ModuleUtils {

    public static Module findModuleByName(Project project, String moduleName) {
        return ReadAction.compute(() -> ModuleManager.getInstance(project).findModuleByName(moduleName));
    }

    public static String getModulePath(Module module) {
        String modulePath = ExternalSystemApiUtil.getExternalProjectPath(module);

        if ((modulePath == null) || modulePath.isEmpty())
            throw new IllegalStateException("Module path is null or empty for module: " + module);

        return modulePath;
    }

    public static String getModulePath(Project project, String moduleName) {
        return getModulePath(findModuleByName(project, moduleName));
    }

    public static void runWhenInitialized(Project project, Runnable r) {
        if(!project.isDisposed()) {
            if(isNoBackgroundMode()) {
                r.run();
            } else if(!project.isInitialized()) {
                DumbService.getInstance(project).runWhenSmart(DisposeAwareRunnable.create(r, project));
            } else {
                runDumbAware(project, r);
            }
        }
    }

    public static boolean isNoBackgroundMode() {
        return ApplicationManager.getApplication().isUnitTestMode() || ApplicationManager.getApplication().isHeadlessEnvironment();
    }

    public static void runDumbAware(Project project, Runnable r) {
        if(DumbService.isDumbAware(r)) {
            r.run();
        } else {
            DumbService.getInstance(project).runWhenSmart(DisposeAwareRunnable.create(r, project));
        }

    }

    public static String selectDir(Module module) {
        FileChooserDescriptor descriptor = new FileChooserDescriptor(false, true, false, false, false, false);
        VirtualFile root = FileChooser.chooseFile(descriptor, module.getProject(), null);
        if (root != null) {
            String modulePath = getModulePath(module);
            String dirPath = root.getCanonicalPath();
            if (dirPath.startsWith(modulePath)) {
                dirPath = dirPath.substring(modulePath.length() + 1, dirPath.length());
            }
            return dirPath;
        }
        return null;
    }
}
