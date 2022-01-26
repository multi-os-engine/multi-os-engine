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

package org.moe.gradle;

import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.JavaProcessOptions;
import org.moe.gradle.options.NatjgenOptions;
import org.moe.gradle.utils.Require;

import java.io.File;

public abstract class AbstractMoeExtension {

    @NotNull
    public final AbstractMoePlugin plugin;

    @NotNull
    public final NatjgenOptions natjgen;

    @NotNull
    public final JavaProcessOptions javaProcess;

    public AbstractMoeExtension(@NotNull AbstractMoePlugin plugin, @NotNull Instantiator instantiator) {
        this.plugin = Require.nonNull(plugin);
        Require.nonNull(instantiator);
        this.javaProcess = instantiator.newInstance(JavaProcessOptions.class);
        this.natjgen = instantiator.newInstance(NatjgenOptions.class);
    }

    @NotNull
    @IgnoreUnused
    // Add this variant of the method so we can access it from Gradle as 'sdk'
    public MoeSDK getSdk() {
        return plugin.getSDK();
    }

    @NotNull
    @IgnoreUnused
    public MoeSDK getSDK() {
        return plugin.getSDK();
    }

    @IgnoreUnused
    public void javaProcess(Action<JavaProcessOptions> action) {
        Require.nonNull(action).execute(javaProcess);
    }

    @IgnoreUnused
    public void natjgen(Action<NatjgenOptions> action) {
        Require.nonNull(action).execute(natjgen);
    }

    @Nullable
    public abstract File getPlatformJar();

    @NotNull
    public static AbstractMoeExtension getInstance(@NotNull Project project) {
        return Require.nonNull((AbstractMoeExtension) project.getExtensions().findByName(AbstractMoePlugin.MOE));
    }
}
