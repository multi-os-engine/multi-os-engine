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

package org.moe.gradle;

import org.gradle.api.Action;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.options.JavaProcessOptions;
import org.moe.gradle.options.NatjgenOptions;
import org.moe.gradle.utils.Require;

import java.io.File;

public class MoeSDKExtension extends AbstractMoeExtension {

    @NotNull
    private MoePlatform platform = MoePlatform.IOS;

    public MoeSDKExtension(@NotNull MoeSDKPlugin plugin, @NotNull Instantiator instantiator) {
        super(plugin, instantiator);
    }

    @NotNull
    @IgnoreUnused
    public String getPlatform() {
        return Require.nonNull(platform).displayName;
    }

    @NotNull
    @IgnoreUnused
    public MoePlatform getPlatformType() {
        return Require.nonNull(platform);
    }

    @IgnoreUnused
    public void setPlatform(@NotNull String platform) {
        this.platform = MoePlatform.getForDisplayName(platform);
    }

    @Nullable
    public File getPlatformJar() {
        return plugin.getSDK().getPlatformJar(platform);
    }

}
