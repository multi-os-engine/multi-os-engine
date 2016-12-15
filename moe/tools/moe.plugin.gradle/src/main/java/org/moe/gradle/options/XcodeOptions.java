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
import org.moe.gradle.anns.Nullable;

public class XcodeOptions {

    @Nullable
    private Object project;

    @Nullable
    public Object getProject() {
        return project;
    }

    public void setProject(@Nullable Object project) {
        this.project = project;
    }

    @Nullable
    private Object workspace;

    @Nullable
    public Object getWorkspace() {
        return workspace;
    }

    public void setWorkspace(@Nullable Object workspace) {
        this.workspace = workspace;
    }

    @Nullable
    private String mainTarget;

    @Nullable
    public String getMainTarget() {
        return mainTarget;
    }

    @IgnoreUnused
    public void setMainTarget(@Nullable String mainTarget) {
        this.mainTarget = mainTarget;
    }

    @Nullable
    private String testTarget;

    @Nullable
    public String getTestTarget() {
        return testTarget;
    }

    @IgnoreUnused
    public void setTestTarget(@Nullable String testTarget) {
        this.testTarget = testTarget;
    }

    @Nullable
    private String mainScheme;

    @Nullable
    public String getMainScheme() {
        return mainScheme;
    }

    @IgnoreUnused
    public void setMainScheme(@Nullable String mainScheme) {
        this.mainScheme = mainScheme;
    }

    @Nullable
    private String testScheme;

    @Nullable
    public String getTestScheme() {
        return testScheme;
    }

    @IgnoreUnused
    public void setTestScheme(@Nullable String testScheme) {
        this.testScheme = testScheme;
    }
}
