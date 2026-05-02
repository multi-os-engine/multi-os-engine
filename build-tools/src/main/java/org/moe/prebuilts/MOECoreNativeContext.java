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

package org.moe.prebuilts;

import org.gradle.api.tasks.TaskProvider;

import java.io.File;

/**
 * Tasks and paths that belong to the {@code moe.core.native} parent project and
 * are read by its subprojects ({@code svm.openjdk}, {@code svm.jdwp}). Registered
 * as an extension on {@code moe.core.native} itself; subprojects read via
 * {@code parent!!.the<MOECoreNativeContext>()}.
 */
public class MOECoreNativeContext {
    public File bootJdkDir;
    public String bootJdkDirAlias;
    public File bootJdkDirHome;
    public TaskProvider<?> bootJdkTask;
    public File graalDist;
    public TaskProvider<?> graalDistTask;
}
