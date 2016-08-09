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

package org.moe.idea.compiler;

import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;
import com.intellij.compiler.impl.CompileContextImpl;
import com.intellij.compiler.impl.ModuleCompileScope;
import com.intellij.compiler.options.CompileStepBeforeRun;
import com.intellij.compiler.progress.CompilerTask;
import com.intellij.execution.BeforeRunTaskProvider;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileScope;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.Key;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.Nullable;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;

public class MOEGradleTaskProvider extends BeforeRunTaskProvider<MOEGradleTask> {
    public static final Key<MOEGradleTask> TaskID = new Key<MOEGradleTask>("MOEGradle");

    @Override
    public Key<MOEGradleTask> getId() {
        return TaskID;
    }

    @Override
    public String getName() {
        return MOEText.get("MOE.Build");
    }

    @Nullable
    @Override
    public Icon getTaskIcon(MOEGradleTask task) {
        return MOEIcons.MOESmall;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MOEIcons.MOESmall;
    }

    @Override
    public String getDescription(MOEGradleTask MOEGradleTask) {
        return MOEText.get("MOE.Build");
    }

    @Override
    public boolean isConfigurable() {
        return false;
    }

    @Nullable
    @Override
    public MOEGradleTask createTask(RunConfiguration runConfiguration) {
        if (canExecuteTask(runConfiguration, null)) {
            return new MOEGradleTask(TaskID, runConfiguration);
        }

        return null;
    }

    @Override
    public boolean configureTask(RunConfiguration runConfiguration, MOEGradleTask MOEGradleTask) {
        return false;
    }

    @Override
    public boolean canExecuteTask(RunConfiguration runConfiguration, MOEGradleTask MOEGradleTask) {
        return (runConfiguration instanceof MOERunConfigurationBase);
    }

    @Override
    public boolean executeTask(DataContext dataContext, RunConfiguration runConfiguration, ExecutionEnvironment executionEnvironment, MOEGradleTask MOEGradleTask) {

        if(!canExecuteTask(runConfiguration, null)) {
            return false;
        }

        final MOERunConfigurationBase configurationBase = (MOERunConfigurationBase)runConfiguration;

        final Project project = configurationBase.getProject();

        final Module[] module = {null};

        UIUtil.invokeAndWaitIfNeeded(new Runnable() {

            public void run() {
                module[0] = ModuleManager.getInstance(project).findModuleByName(configurationBase.moduleName());
            }
        });

        if(module[0] == null) {
            return false;
        }


        CompilerTask task = new CompilerTask(project, MOEText.get("MOE.Build"), true, false, true, true);
        CompileScope scope = new ModuleCompileScope(module[0], false);
        CompileContext context = new CompileContextImpl(project, task, scope, false, false);

        scope.putUserData(CompileStepBeforeRun.RUN_CONFIGURATION, configurationBase);

        MOECompileTask compileTask = new MOECompileTask();

        return compileTask.execute(context);
    }
}
