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

import groovy.lang.GroovyObject;
import org.apache.commons.lang3.text.WordUtils;
import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.internal.file.collections.SimpleFileCollection;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.SourceSet;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.RuleClosure;
import org.moe.gradle.remote.Server;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.tasks.Dex;
import org.moe.gradle.tasks.Dex2Oat;
import org.moe.gradle.tasks.IpaBuild;
import org.moe.gradle.tasks.Launchers;
import org.moe.gradle.tasks.ProGuard;
import org.moe.gradle.tasks.ResourcePackager;
import org.moe.gradle.tasks.Retrolambda;
import org.moe.gradle.tasks.StartupProvider;
import org.moe.gradle.tasks.TestClassesProvider;
import org.moe.gradle.tasks.UITransformer;
import org.moe.gradle.tasks.XcodeBuild;
import org.moe.gradle.tasks.XcodeInternal;
import org.moe.gradle.tasks.XcodeProjectGenerator;
import org.moe.gradle.tasks.XcodeProvider;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;
import org.moe.gradle.utils.StringUtils;
import org.moe.gradle.utils.TaskUtils;

import javax.inject.Inject;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.moe.gradle.MoePlugin.TaskParams.*;

public class MoePlugin extends AbstractMoePlugin {

    @NotNull
    private MoeExtension extension;

    @NotNull
    public MoeExtension getExtension() {
        return Require.nonNull(extension, "The plugin's 'extension' property was null");
    }

    @NotNull
    private JavaPluginConvention javaConvention;

    @NotNull
    public JavaPluginConvention getJavaConvention() {
        return Require.nonNull(javaConvention, "The plugin's 'javaConvention' property was null");
    }

    @Nullable
    private Server remoteServer;

    @Nullable
    public Server getRemoteServer() {
        return remoteServer;
    }

    @Inject
    public MoePlugin(Instantiator instantiator) {
        super(instantiator);
    }

    @Override
    public void apply(Project project) {
        super.apply(project);

        // Setup remote build
        remoteServer = Server.setup(this);
        if (remoteServer != null) {
            remoteServer.connect();
        }

        // Create plugin extension
        extension = project.getExtensions().create(MOE, MoeExtension.class, this, instantiator);
        extension.setup();

        // Get Java convention
        javaConvention = (JavaPluginConvention) project.getConvention().getPlugins().get("java");
        Require.nonNull(javaConvention, "The 'java' Gradle plugin must be applied before the '" + MOE + "' plugin");

        // Install core, ios and junit jars as dependencies
        project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                new SimpleFileCollection(getSDK().getCoreJar()));
        if (extension.getPlatformJar() != null) {
            project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                    new SimpleFileCollection(extension.getPlatformJar()));
        }
        project.getDependencies().add(JavaPlugin.TEST_COMPILE_CONFIGURATION_NAME,
                new SimpleFileCollection(getSDK().getJUnitJar()));

        // Install rules
        addRule(ProGuard.class, "Creates a ProGuarded jar.",
                singletonList(SOURCE_SET));
        addRule(Retrolambda.class, "Creates a Retrolambda-d jar.",
                singletonList(SOURCE_SET));
        addRule(Dex.class, "Creates a Dexed jar.",
                singletonList(SOURCE_SET));
        addRule(Dex2Oat.class, "Creates art and oat files.",
                asList(SOURCE_SET, MODE, ARCH_FAMILY));
        ResourcePackager.addRule(this);
        addRule(TestClassesProvider.class, "Creates the classlist.txt file.",
                singletonList(SOURCE_SET));
        addRule(StartupProvider.class, "Creates the preregister.txt file.",
                singletonList(SOURCE_SET));
        addRule(UITransformer.class, "Runs the UITransformer.",
                singletonList(SOURCE_SET));
        addRule(XcodeProjectGenerator.class, "Creates an Xcode project.",
                emptyList());
        addRule(XcodeProvider.class, "Collects the required dependencies.",
                asList(SOURCE_SET, MODE, ARCH, PLATFORM));
        addRule(XcodeInternal.class, "Creates all files for Xcode.",
                emptyList());
        addRule(XcodeBuild.class, "Creates .app files.",
                asList(SOURCE_SET, MODE, PLATFORM));
        addRule(IpaBuild.class, "Creates .ipa files.",
                emptyList());

        project.getTasks().create("moeSDKProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE SDK.");
            task.getActions().add(t -> {
                final File platformJar = extension.getPlatformJar();
                System.out.println("\n" +
                        "moe.sdk.home=" + getSDK().getRoot() + "\n" +
                        "moe.sdk.coreJar=" + getSDK().getCoreJar() + "\n" +
                        "moe.sdk.platformJar=" + (platformJar == null ? "" : platformJar) + "\n" +
                        "moe.sdk.junitJar=" + getSDK().getJUnitJar() + "\n" +
                        "\n");
            });
        });
        project.getTasks().create("moeXcodeProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE Xcode project.");
            task.getActions().add(t -> {
                final XcodeProjectGenerator generator = getTaskBy(XcodeProjectGenerator.class);
                System.out.println("\n" +
                        "moe.xcode.xcodeProjectPath=" + (new File(generator.getXcodeProjectDir(), generator.getProjectName() + ".xcodeproj")) + "\n" +
                        "\n");
            });
        });

        Launchers.addTasks(this);
    }

    @SuppressWarnings("unchecked")
    public static String getTaskName(@NotNull Class<?> taskClass, @NotNull Object... params) {
        Require.nonNull(taskClass);
        Require.nonNull(params);

        final String TASK_CLASS_NAME = taskClass.getSimpleName();
        final String ELEMENTS_DESC = Arrays.stream(params).map(TaskParams::getNameForValue).collect(Collectors.joining());

        return MOE + ELEMENTS_DESC + TASK_CLASS_NAME;
    }

    @SuppressWarnings("unchecked")
    public <T extends AbstractBaseTask> T getTaskBy(@NotNull Class<T> taskClass, @NotNull Object... params) {
        return (T) getProject().getTasks().getByName(getTaskName(taskClass, params));
    }

    @SuppressWarnings("unchecked")
    public <T extends Task> T getTaskByName(@NotNull String name) {
        Require.nonNull(name);

        return (T) getProject().getTasks().getByName(name);
    }

    public void requireMacHostOrRemoteServerConfig(@NotNull Task task) {
        Require.nonNull(task);
        if (!Os.isFamily(Os.FAMILY_MAC) && getRemoteServer() == null) {
            throw new GradleException("The '" + task.getName() + "' task requires a macOS host or a remote build configuration.");
        }
    }

    protected enum TaskParams {
        SOURCE_SET, MODE, ARCH, ARCH_FAMILY, PLATFORM;

        public Object getValue(MoePlugin plugin, String value) {
            switch (this) {
                case SOURCE_SET:
                    return TaskUtils.getSourceSet(plugin, value);
                case MODE:
                    return Mode.getForName(value);
                case ARCH:
                    return Arch.getForName(value);
                case ARCH_FAMILY:
                    return Arch.validateArchFamily(value);
                case PLATFORM:
                    return MoePlatform.getForPlatformName(value);
            }
            throw new IllegalStateException();
        }

        public String getName() {
            switch (this) {
                case SOURCE_SET:
                    return "SourceSet";
                case MODE:
                    return "Mode";
                case ARCH:
                    return "Architecture";
                case ARCH_FAMILY:
                    return "ArchitectureFamily";
                case PLATFORM:
                    return "Platform";
            }
            throw new IllegalStateException();
        }

        public static String getNameForValue(Object value) {
            return WordUtils.capitalize(getNameForValueInternal(value));
        }

        public static String getNameForValueInternal(Object value) {
            Require.nonNull(value);

            if (value instanceof SourceSet) {
                return ((SourceSet) value).getName();
            } else if (value instanceof Mode) {
                return ((Mode) value).name;
            } else if (value instanceof Arch) {
                return ((Arch) value).name;
            } else if (value instanceof String) {
                return Arch.validateArchFamily((String) value);
            } else if (value instanceof MoePlatform) {
                return ((MoePlatform) value).platformName;
            } else
                throw new IllegalStateException();
        }
    }

    private <T extends AbstractBaseTask> void addRule(Class<T> taskClass, String description, List<TaskParams> params) {
        // Prepare constants
        final String TASK_NAME = taskClass.getSimpleName();
        final String ELEMENTS_DESC = params.stream().map(p -> "<" + p.getName() + ">").collect(Collectors.joining());
        final String PATTERN = MOE + ELEMENTS_DESC + TASK_NAME;

        // Add rule
        getProject().getTasks().addRule("Pattern: " + PATTERN + ": " + description, new RuleClosure(getProject()) {
            @Override
            public @Nullable Task doCall(@NotNull String taskName) {
                Require.nonNull(taskName);
                getLogger().info("Evaluating for " + TASK_NAME + " rule: " + taskName);

                // Check for prefix, suffix and get elements in-between
                List<String> elements = StringUtils.getElemsInRule(taskName, MOE, TASK_NAME);

                // Prefix or suffix failed
                if (elements == null) {
                    return null;
                }

                // Check number of elements
                TaskUtils.assertSize(elements, params.size(), ELEMENTS_DESC);

                // Check element values & configure task on success
                final AtomicInteger pIndex = new AtomicInteger();
                final Object[] objects = params.stream().map(p -> p.getValue(MoePlugin.this, elements.get(pIndex.getAndIncrement()))).collect(Collectors.toList()).toArray();

                // Create task
                final T task = getProject().getTasks().create(taskName, taskClass);

                // Set group
                task.setGroup(MOE);

                // Call setup method
                ((GroovyObject) task).invokeMethod("setupMoeTask", objects);

                if (getRemoteServer() != null && task.getRemoteExecutionStatusSet()) {
                    task.dependsOn(getRemoteServer().getMoeRemoteServerSetupTask());
                }

                return task;
            }
        });
    }
}
