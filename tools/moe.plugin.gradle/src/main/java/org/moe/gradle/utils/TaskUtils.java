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

package org.moe.gradle.utils;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.AbstractMoePlugin;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

import java.util.function.Supplier;

public class TaskUtils {

    private TaskUtils() {
    }

    public static SourceSet getSourceSet(@NotNull AbstractMoePlugin plugin, @NotNull String sourceSetName) {
        Require.nonNull(plugin);
        Require.nonNull(sourceSetName);

        return plugin.getJavaConvention().getSourceSets().getByName(sourceSetName);
    }

    public static String getRequiredEnvVar(@NotNull String name) {
        Require.nonNull(name);

        return getRequiredEnvVar(name, null);
    }

    public static String getRequiredEnvVar(@NotNull String name, @Nullable String defaultValue) {
        Require.nonNull(name);

        String value = System.getenv().get(name);
        if (value == null || value.length() == 0) {
            value = defaultValue;
        }
        if (value == null || value.length() == 0) {
            throw new GradleException("Unspecified environment variable '" + name + "'");
        }
        return value;
    }

    public static <T> T compute(@NotNull Supplier<T> supplier) {
        return supplier.get();
    }
}
