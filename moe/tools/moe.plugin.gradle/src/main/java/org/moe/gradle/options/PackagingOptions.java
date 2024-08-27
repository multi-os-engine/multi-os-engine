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

import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class PackagingOptions {

    @NotNull
    private List<String> excludes = new ArrayList<>(Arrays.asList(
            "LICENSE", "LICENSE.*",
            "META-INF/LICENSE", "META-INF/LICENSE.*",
            "NOTICE", "NOTICE.*",
            "META-INF/NOTICE", "META-INF/NOTICE.*",
            "**/.*"));

    @NotNull
    public List<String> getExcludes() {
        return Require.nonNull(excludes);
    }

    @IgnoreUnused
    public void setExcludes(@NotNull Collection<String> excludes) {
        this.excludes = new ArrayList<>(Require.nonNull(excludes));
    }

    @NotNull
    @IgnoreUnused
    public PackagingOptions exclude(String... names) {
        excludes.addAll(Arrays.asList(Require.nonNull(names)));
        return this;
    }
}
