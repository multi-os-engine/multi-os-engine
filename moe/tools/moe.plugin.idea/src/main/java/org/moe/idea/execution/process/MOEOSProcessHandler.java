/*
Copyright (C) 2016 Migeran

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

package org.moe.idea.execution.process;

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.UnixProcessManager;
import com.intellij.openapi.util.SystemInfo;
import org.jetbrains.annotations.NotNull;

public class MOEOSProcessHandler extends OSProcessHandler {

    public MOEOSProcessHandler(@NotNull GeneralCommandLine commandLine) throws ExecutionException {
        super(commandLine);
    }

    @Override
    public void destroyProcess() {
        if (!interruptProcess()) {
            super.destroyProcess();
        }
    }

    private boolean interruptProcess() {
        if (SystemInfo.isUnix) {
            return UnixProcessManager.sendSigIntToProcessTree(getProcess());
        }
        return false;
    }
}
