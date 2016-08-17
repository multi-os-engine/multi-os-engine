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

import com.intellij.openapi.application.AccessToken;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.application.ReadAction;
import com.intellij.openapi.application.WriteAction;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.progress.ProgressIndicator;
import com.intellij.openapi.progress.ProgressManager;
import com.intellij.openapi.progress.Task;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;
import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.GradleExec;

import java.io.File;

public class ModuleUtils {

    public static final String MODULE_PATH_KEY = "external.linked.project.path";
    public static final String XCODE_PROJECT_PATH_KEY = "moe.xcode.xcodeProjectPath";
    public static final String MAIN_PRODUCT_NAME_KEY = "moe.xcode.mainProductName";

    public static final String XCODE_PROJECT_PATH_TASK = "moeXcodeProperties";
    public static final String MAIN_PRODUCT_NAME_TASK = "moeMainProductName";

    public static Module findModuleByName(Project project, String moduleName) {
        AccessToken token = ReadAction.start();
        try {
            return ModuleManager.getInstance(project).findModuleByName(moduleName);
        } finally {
            token.finish();
        }
    }
    
    public static void setOption(Module module, String key, String value) {
        if ((module == null) || (value == null) || (key == null)) {
            return;
        }

        final Module m = module;
        final String k = key, v = value;

        runInDispatchedThread(new Runnable() {
            @Override
            public void run() {
                AccessToken token = WriteAction.start();
                try {
                    m.setOption(k, v);
                } finally {
                    token.finish();
                }
            }
        });
    }
    
    public static String getOption(Module module, String key) {
        if (module == null) {
            return null;
        }
        AccessToken token = ReadAction.start();
        try {
            return module.getOptionValue(key);
        } finally {
            token.finish();
        }
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
        if (module.getModuleFile() == null) {
            module.getProject().save();
        }
        String modulePath = getOption(module, MODULE_PATH_KEY);
        if ((modulePath == null) || modulePath.isEmpty()) {
            modulePath = new File(module.getModuleFilePath()).getParent();
        }
        return modulePath;
    }

    public static String getModulePath(Project project, String moduleName) {
        return getModulePath(findModuleByName(project, moduleName));
    }

    private static void runInDispatchedThread(@NotNull Runnable runnable) {
        ApplicationManager.getApplication().invokeLater(runnable);
    }
}
