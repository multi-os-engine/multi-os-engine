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

import org.gradle.api.Project;
import org.gradle.api.Rule;
import org.gradle.api.file.CopySpec;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.bundling.Jar;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.MoeSDK;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.groovy.closures.ConfigurationClosure;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.StringUtils;
import org.moe.gradle.utils.TaskUtils;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ResourcePackager {

    private ResourcePackager() {

    }

    @NotNull
    public static Rule addRule(@NotNull MoePlugin plugin) {
        Require.nonNull(plugin);

        final Project project = plugin.getProject();

        // Prepare constants
        final String TASK_NAME = ResourcePackager.class.getSimpleName();
        final String ELEMENTS_DESC = "<SourceSet>";
        final String PATTERN = MoePlugin.MOE + ELEMENTS_DESC + TASK_NAME;

        // Add rule
        return AbstractBaseTask.addTaskRule(project, "Pattern: " + PATTERN + ": Creates a application resource jar.", taskName -> {

            // Check for prefix, suffix and get elements in-between
            final List<String> elements = StringUtils.getElemsInRule(taskName, MoePlugin.MOE, TASK_NAME);

            // Prefix or suffix failed
            if (elements == null) {
                return null;
            }

            // Check number of elements
            TaskUtils.assertSize(elements, 1, ELEMENTS_DESC);

            // Check element values & configure task on success
            final SourceSet sourceSet = TaskUtils.getSourceSet(plugin, elements.get(0));
            return create(plugin, sourceSet);
        });
    }

    @NotNull
    private static Jar create(@NotNull MoePlugin plugin, @NotNull SourceSet sourceSet) {
        Require.nonNull(plugin);
        Require.nonNull(sourceSet);

        final Project project = plugin.getProject();
        final MoeExtension ext = plugin.getExtension();
        final MoeSDK sdk = plugin.getSDK();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE, sourceSet.getName());

        // Create task
        final String taskName = MoePlugin.getTaskName(ResourcePackager.class, sourceSet);
        final Jar resourcePackagerTask = project.getTasks().create(taskName, Jar.class);
        resourcePackagerTask.setGroup(MoePlugin.MOE);
        resourcePackagerTask.setDescription("Generates application file (sourceset: " + sourceSet.getName() + ").");

        // Add dependencies
        final ProGuard proguardTask = plugin.getTaskBy(ProGuard.class, sourceSet);
        resourcePackagerTask.dependsOn(proguardTask);

        // Update settings
        resourcePackagerTask.setDestinationDir(project.file(project.getBuildDir().toPath().resolve(out).toFile()));
        resourcePackagerTask.setArchiveName("application.jar");
        resourcePackagerTask.from(project.zipTree(proguardTask.getOutJar()));
        resourcePackagerTask.exclude("**/*.class");

        project.afterEvaluate(_project -> {
            // When using full trim, ProGuard will copy the the resources from the common jar
            switch (ext.getProguardLevelRaw()) {
                case MoeExtension.PROGUARD_LEVEL_APP:
                    resourcePackagerTask.from(_project.zipTree(sdk.getCoreJar()));
                    resourcePackagerTask.from(_project.zipTree(ext.getPlatformJar()));
                    break;
                case MoeExtension.PROGUARD_LEVEL_PLATFORM:
                    resourcePackagerTask.from(_project.zipTree(sdk.getCoreJar()));
                    break;
                case MoeExtension.PROGUARD_LEVEL_ALL:
                    break;
                default:
                    throw new IllegalStateException();
            }

            ext.packaging.getExcludes().forEach(resourcePackagerTask::exclude);

            // Add support for copying resources from the source directory
            addResourceFromSources(ext, resourcePackagerTask, sourceSet);
            if (SourceSet.TEST_SOURCE_SET_NAME.equals(sourceSet.getName())) {
                SourceSet main = plugin.getJavaConvention().getSourceSets().getByName(SourceSet.MAIN_SOURCE_SET_NAME);
                addResourceFromSources(ext, resourcePackagerTask, main);
            }
        });

        return resourcePackagerTask;
    }

    private static void addResourceFromSources(@NotNull MoeExtension ext, @NotNull Jar jar,
                                               @NotNull SourceSet sourceSet) {
        Require.nonNull(ext);
        Require.nonNull(jar);
        Require.nonNull(sourceSet);

        if (!ext.resources.isEnableResourcesFromSourceDirs()) {
            return;
        }
        sourceSet.getJava().getSrcDirs().forEach(src -> {
            ext.plugin.getLogger().debug("Adding path " + src + " to " + jar.getName());
            jar.from(src, new ConfigurationClosure<CopySpec>(ext.plugin.getProject()) {
                @Override
                public void doCall(final CopySpec spec) {
                    ext.resources.getResourcesFromSourceDirExcludes().forEach(spec::exclude);
                }
            });
        });
    }
}
