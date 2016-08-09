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

import com.intellij.execution.ExecutionException;
import com.intellij.execution.configurations.GeneralCommandLine;
import com.intellij.execution.process.OSProcessHandler;
import com.intellij.execution.process.ProcessTerminatedListener;

public class MOEProcessHandler extends OSProcessHandler {

    public MOEProcessHandler(Process process , String command) throws ExecutionException {
        super(process, command);
    }

    public static MOEProcessHandler runCommand(final GeneralCommandLine commandLine) throws ExecutionException {
        final MOEProcessHandler processHandler = new MOEProcessHandler(commandLine.createProcess(), commandLine.getCommandLineString());

        ProcessTerminatedListener.attach(processHandler);

        return processHandler;
    }
}
