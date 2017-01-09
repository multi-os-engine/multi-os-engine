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
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UIActionsAndOutletsOptions {

    @NotNull private List<String> includes = new ArrayList<>();

    @NotNull
    public List<String> getIncludes() {
        return Require.nonNull(includes);
    }

    @IgnoreUnused
    public void setIncludes(@NotNull Collection<String> list) {
        this.includes = new ArrayList<>(Require.nonNull(list));
    }

    public void include(@NotNull String regex) {
        includes.add(Require.nonNull(regex));
    }

    @NotNull private List<String> additionalCodes = new ArrayList<>();

    @NotNull
    public List<String> getAdditionalCodes() {
        return Require.nonNull(additionalCodes);
    }

    @IgnoreUnused
    public void setAdditionalCodes(@NotNull Collection<String> list) {
        this.additionalCodes = new ArrayList<>(Require.nonNull(list));
    }

    public void additionalCode(@NotNull String regex) {
        additionalCodes.add(Require.nonNull(regex));
    }

    @NotNull private List<String> excludeLibraries = new ArrayList<>();

    @NotNull
    public List<String> getExcludeLibraries() {
        return Require.nonNull(excludeLibraries);
    }

    @IgnoreUnused
    public void setExcludeLibraries(@NotNull Collection<String> list) {
        this.excludeLibraries = new ArrayList<>(Require.nonNull(list));
    }

    public void excludeLibrary(@NotNull String regex) {
        excludeLibraries.add(Require.nonNull(regex));
    }
}
