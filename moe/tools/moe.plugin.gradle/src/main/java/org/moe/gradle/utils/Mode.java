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
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;

public class Mode {
    @NotNull
    public final String name;

    private Mode(@NotNull String name) {
        this.name = name;
    }

    public static final Mode DEBUG = new Mode("debug");
    public static final Mode RELEASE = new Mode("release");

    public static Mode getForName(@NotNull String name) {
        Require.nonNull(name);

        if ("debug".equalsIgnoreCase(name)) {
            return DEBUG;
        }
        if ("release".equalsIgnoreCase(name)) {
            return RELEASE;
        }
        throw new GradleException("Unknown configuration '" + name + "'");
    }

    public static boolean validateName(@Nullable String name) {
        return "debug".equalsIgnoreCase(name) || "release".equalsIgnoreCase(name);
    }

    public String getXcodeCompatibleName() {
        if (this == DEBUG) {
            return "Debug";
        }
        if (this == RELEASE) {
            return "Release";
        }
        throw new GradleException("Unknown configuration '" + name + "'");
    }
}
