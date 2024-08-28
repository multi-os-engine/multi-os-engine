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

package org.moe.gradle.tasks;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.SourceSet;
import org.moe.gradle.MoePlatform;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.TaskUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class XcodeInternal extends AbstractBaseTask {

    @Override
    protected void run() {
        // Do nothing
        if (System.getenv("XCODE_PRODUCT_BUILD_VERSION") == null) {
            throw new GradleException(getName() + " task can only be executed from within Xcode.");
        }

        linkSDK();
    }

    protected final void setupMoeTask() {
        setSupportsRemoteBuild(false);

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE);

        // Get platform
        MoePlatform platform = MoePlatform.getForPlatformName(TaskUtils.getRequiredEnvVar("PLATFORM_NAME"));

        // Get configuration
        Mode mode = Mode.getForName(TaskUtils.getRequiredEnvVar("CONFIGURATION"));

        // Get architectures
        String architectures = TaskUtils.getRequiredEnvVar("ARCHS");

        // Get source set name
        String sourceSetValue = TaskUtils.getRequiredEnvVar("MOE_BUILD_SOURCE_SET", SourceSet.MAIN_SOURCE_SET_NAME);
        SourceSet sourceSet = TaskUtils.getSourceSet(getMoePlugin(), sourceSetValue);

        // Collect architectures
        final ArrayList<Arch> architectureVariants = new ArrayList<>();
        for (String archName : architectures.split(" ")) {
            Arch var = Arch.getForName(archName);
            architectureVariants.add(var);
        }

        setDescription("Creates all files for Xcode.");

        // Collect dependency tasks
        architectureVariants.forEach(arch -> {
            XcodeProvider packagerTask = getMoePlugin().getTaskBy(XcodeProvider.class, sourceSet, mode, arch, platform);
            dependsOn(packagerTask);
        });

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "XcodeInternal.log"));
    }
}
