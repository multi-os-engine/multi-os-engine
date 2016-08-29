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

import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.logging.Logger;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import javax.inject.Inject;

public abstract class AbstractMoePlugin implements Plugin<Project> {

    public static final String MOE = "moe";

    private static final int GRADLE_MIN_VERSION_MAJOR = 2;
    private static final int GRADLE_MIN_VERSION_MINOR = 5;

    @NotNull
    protected final Instantiator instantiator;

    @NotNull
    private Project project;

    public Project getProject() {
        return Require.nonNull(project, "The plugin's 'project' property was null");
    }

    @NotNull
    private MoeSDK sdk;

    @NotNull
    public MoeSDK getSDK() {
        return Require.nonNull(sdk, "The plugin's 'sdk' property was null");
    }

    @Inject
    AbstractMoePlugin(Instantiator instantiator) {
        this.instantiator = Require.nonNull(instantiator);
    }

    @Override
    public void apply(Project project) {
        // Set project
        this.project = Require.nonNull(project);

        // Check Gradle version
        checkGradleVersion(project);

        // Apply Java plugin
        project.getPluginManager().apply(JavaPlugin.class);

        // Setup the SDK
        sdk = MoeSDK.setup(this);
    }

    @IgnoreUnused
    public final String getRequiredGradleVersion() {
        return GRADLE_MIN_VERSION_MAJOR + "." + GRADLE_MIN_VERSION_MINOR;
    }

    private void checkGradleVersion(Project project) {
        final String version = project.getGradle().getGradleVersion();
        final String[] components = version.split("\\.");
        final int major = Integer.parseInt(components[0 /* Major */]);
        final int minor = Integer.parseInt(components[1 /* Minor */]);
        if (major > GRADLE_MIN_VERSION_MAJOR ||
                (major == GRADLE_MIN_VERSION_MAJOR && minor >= GRADLE_MIN_VERSION_MINOR)) {
            return;
        }
        throw new GradleException("The 'moe' plugin requires Gradle version " + GRADLE_MIN_VERSION_MAJOR + "." +
                GRADLE_MIN_VERSION_MINOR + " or higher! " + "Current version is " + version + ".");
    }

    public final Logger getLogger() {
        return getProject().getLogger();
    }
}
