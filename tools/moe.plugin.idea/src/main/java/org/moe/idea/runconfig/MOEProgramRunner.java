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

package org.moe.idea.runconfig;

import com.intellij.debugger.impl.GenericDebuggerRunner;
import com.intellij.execution.ExecutionException;
import com.intellij.execution.ExecutionResult;
import com.intellij.execution.Executor;
import com.intellij.execution.configurations.RemoteConnection;
import com.intellij.execution.configurations.RunProfile;
import com.intellij.execution.configurations.RunProfileState;
import com.intellij.execution.runners.ExecutionEnvironment;
import com.intellij.execution.runners.RunContentBuilder;
import com.intellij.execution.ui.RunContentDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.idea.runconfig.configuration.MOERunConfiguration;
import org.moe.idea.runconfig.configuration.MOERunConfigurationBase;

public class MOEProgramRunner extends GenericDebuggerRunner {
    private static final String DEBUG = "Debug";

    public static boolean isDebugExecutor(Executor exec) {
        return exec.getId().equals(DEBUG);
    }

    @NotNull
    @Override
    public String getRunnerId() {
        return MOEProgramRunner.class.getCanonicalName();
    }

    @Override
    public boolean canRun(@NotNull String s, @NotNull RunProfile runProfile) {
        return (runProfile instanceof MOERunConfigurationBase);
    }

    @Nullable
    @Override
    protected RunContentDescriptor doExecute(@NotNull RunProfileState state, @NotNull ExecutionEnvironment environment) throws ExecutionException {
        MOERunConfiguration runConfig = (MOERunConfiguration)environment.getRunProfile();
        runConfig.debug(isDebugExecutor(environment.getExecutor()));
        if (runConfig.isCanceled()) {
            return null;
        }
        if(isDebugExecutor(environment.getExecutor())) {
            RemoteConnection connection = new RemoteConnection(true, "localhost", Integer.toString(runConfig.debugPort()), false);
            return attachVirtualMachine(state, environment, connection, true);
        }
        else {
            ExecutionResult executionResult = state.execute(environment.getExecutor(), this);

            if (executionResult == null) {
                return null;
            }

            return new RunContentBuilder(executionResult, environment).showRunContent(environment.getContentToReuse());
        }
    }
}
