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
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.externalSystem.util.ExternalSystemApiUtil;
import com.intellij.openapi.fileChooser.FileChooser;
import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.DumbService;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.startup.StartupManager;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.util.DisposeAwareRunnable;
import org.jetbrains.annotations.NotNull;

import java.io.File;

public class ModuleUtils {

    public static final String MODULE_PATH_KEY = "external.linked.project.path";
    public static final String MODULE_ID_KEY = "external.linked.project.id";
    public static final String XCODE_PROJECT_PATH_KEY = "moe.xcode.xcodeProjectPath";
    public static final String MAIN_PRODUCT_NAME_KEY = "moe.xcode.mainProductName";

    public static final String XCODE_PROJECT_PATH_TASK = "moeXcodeProperties";
    public static final String MAIN_PRODUCT_NAME_TASK = "moeMainProductName";

    public static Module findModuleByName(Project project, String moduleName) {
        return ReadAction.compute(() -> ModuleManager.getInstance(project).findModuleByName(moduleName));
    }
    
    public static void setOption(Module module, String key, String value) {
        if ((module == null) || (value == null) || (key == null)) {
            return;
        }

        runInDispatchedThread(() -> WriteAction.run(() -> module.setOption(key, value)));
    }

    public static String getOption(Module module, String key) {
        if (module == null) {
            return null;
        }
        return ReadAction.compute(() -> module.getOptionValue(key));
    }

    public static void setXcodeProjectPath(Module module, String xcodeProjectPath) {
        setOption(module, XCODE_PROJECT_PATH_KEY, xcodeProjectPath);
    }

    public static String getXcodeProjectPath(Module module) {
        return getOption(module, XCODE_PROJECT_PATH_KEY);
    }

    public static void setProductName(Module module, String productName) {
        setOption(module, MAIN_PRODUCT_NAME_KEY, productName);
    }

    public static String getProductName(Module module) {
        return getOption(module, MAIN_PRODUCT_NAME_KEY);
    }

    public static String getModulePath(Module module) {
        String modulePath = ExternalSystemApiUtil.getExternalProjectPath(module);

        if ((modulePath == null) || modulePath.isEmpty())
            throw new IllegalStateException("Module path is null or empty");

        return modulePath;
    }

    public static String getModulePath(Project project, String moduleName) {
        return getModulePath(findModuleByName(project, moduleName));
    }

    public static void runInDispatchedThread(@NotNull Runnable runnable) {
        ApplicationManager.getApplication().invokeLater(runnable);
    }

    public static void runWhenInitialized(Project project, Runnable r) {
        if(!project.isDisposed()) {
            if(isNoBackgroundMode()) {
                r.run();
            } else if(!project.isInitialized()) {
                StartupManager.getInstance(project).registerPostStartupActivity(DisposeAwareRunnable.create(r, project));
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
