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

import com.intellij.execution.BeforeRunTask;
import com.intellij.execution.configurations.RunConfiguration;
import com.intellij.openapi.util.Key;
import org.jetbrains.annotations.NotNull;

public class MOEGradleTask extends BeforeRunTask<MOEGradleTask> {
    private RunConfiguration config;

    protected MOEGradleTask(@NotNull Key<MOEGradleTask> providerId, RunConfiguration config) {
        super(providerId);
        setEnabled(true);
        this.config = config;
    }

    public RunConfiguration getConfiguration() {
        return this.config;
    }
}
