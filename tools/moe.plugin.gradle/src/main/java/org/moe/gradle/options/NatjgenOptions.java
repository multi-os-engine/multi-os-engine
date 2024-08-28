/*
Copyright (C) 2017 Migeran

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

package org.moe.gradle.options;

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

public class NatjgenOptions {

    /**
     * Name of the binding configuration file.
     */
    @Nullable
    private String config;

    @Nullable
    public String getConfig() {
        return config;
    }

    @IgnoreUnused
    public void setConfig(@Nullable String config) {
        this.config = config;
    }

    /**
     * Name of the binding log output file.
     */
    @Nullable
    private String logFile;

    @Nullable
    public String getLogFile() {
        return logFile;
    }

    @IgnoreUnused
    public void setLogFile(@Nullable String logFile) {
        this.logFile = logFile;
    }
}
