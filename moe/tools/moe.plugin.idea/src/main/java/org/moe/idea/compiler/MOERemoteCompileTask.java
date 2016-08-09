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

import org.moe.common.LOGGER;
import org.moe.idea.runconfig.MOEIpaConfiguration;
import org.moe.idea.runconfig.configuration.remote.MOERemoteBuildManager;
import org.moe.idea.ui.MOEToolWindow;
import org.moe.idea.runconfig.configuration.remote.MOERunConfigurationRemote;
import com.intellij.compiler.options.CompileStepBeforeRun;
import com.intellij.openapi.compiler.CompileContext;
import com.intellij.openapi.compiler.CompileTask;
import com.intellij.openapi.project.Project;

public class MOERemoteCompileTask implements CompileTask {

    MOERunConfigurationRemote remoteRunConfiguration;

    public MOERemoteCompileTask(MOERunConfigurationRemote remoteRunConfiguration) {
        this.remoteRunConfiguration = remoteRunConfiguration;
    }

    public MOERemoteCompileTask() {
    }

    @Override
    public boolean execute(CompileContext compileContext) {

        boolean compileResult = false;
        if ((remoteRunConfiguration != null) || setRemoteConfigurationSucceed(compileContext)) {
            compileResult = build(remoteRunConfiguration);
        }

        return compileResult;
    }

    private boolean setRemoteConfigurationSucceed(CompileContext compileContext) {
        Object configuration = compileContext.getCompileScope().getUserData(CompileStepBeforeRun.RUN_CONFIGURATION);

        if (configuration == null) {
            configuration = compileContext.getCompileScope().getUserData(MOEIpaConfiguration.IPA_KEY);
        }

        if (configuration instanceof MOERunConfigurationRemote) {
            remoteRunConfiguration = (MOERunConfigurationRemote) configuration;
            return true;
        }

        return false;
    }

    private boolean build(MOERunConfigurationRemote remoteRunConfiguration) {
        boolean result = false;

        Project project = remoteRunConfiguration.getProject();
        try {
            result = MOERemoteBuildManager.build(remoteRunConfiguration);
        } catch (Exception e) {
            MOEToolWindow.getInstance(project).error(e.getMessage());
            LOGGER.SEVERE(e.getMessage());
        }

        return result;
    }

}
