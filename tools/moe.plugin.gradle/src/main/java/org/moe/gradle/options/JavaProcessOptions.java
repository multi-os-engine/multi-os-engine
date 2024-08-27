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

package org.moe.gradle.options;

import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaProcessOptions {
    @NotNull
    private List<String> jvmArgs = new ArrayList<>();

    @NotNull
    public List<String> getJvmArgs() {
        return jvmArgs;
    }

    public void setJvmArgs(@Nullable List<String> jvmArgs) {
        this.jvmArgs = jvmArgs == null ? new ArrayList<>() : new ArrayList<>(jvmArgs);
    }

    public void jvmArgs(@NotNull Iterable<String> jvmArgs) {
        for (String jvmArg : jvmArgs) {
            this.jvmArgs.add(jvmArg);
        }
    }

    public void jvmArgs(@NotNull String... jvmArgs) {
        Collections.addAll(this.jvmArgs, jvmArgs);
    }
}
