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

import org.gradle.api.Action;
import org.gradle.api.tasks.Nested;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ResourceOptions {

    private boolean enableResourcesFromSourceDirs = true;

    public boolean isEnableResourcesFromSourceDirs() {
        return enableResourcesFromSourceDirs;
    }

    @IgnoreUnused
    public void setEnableResourcesFromSourceDirs(boolean enable) {
        this.enableResourcesFromSourceDirs = enable;
    }

    @NotNull
    private List<String> resourcesFromSourceDirExcludes = new ArrayList<>(Arrays.asList("**/*.java", "**/*.scala", "**/*.kt"));

    @NotNull
    public List<String> getResourcesFromSourceDirExcludes() {
        return Require.nonNull(resourcesFromSourceDirExcludes);
    }

    @IgnoreUnused
    public void setResourcesFromSourceDirExcludes(@NotNull Collection<String> list) {
        this.resourcesFromSourceDirExcludes = new ArrayList<>(Require.nonNull(list));
    }

    private ResourceDetectionOptions detectionOptions = new ResourceDetectionOptions();

    @Nested
    public ResourceDetectionOptions getDetectionOptions() {
        return detectionOptions;
    }

    @IgnoreUnused
    public void autodetection(Action<? super ResourceDetectionOptions> spec) {
        spec.execute(getDetectionOptions());
    }
}
