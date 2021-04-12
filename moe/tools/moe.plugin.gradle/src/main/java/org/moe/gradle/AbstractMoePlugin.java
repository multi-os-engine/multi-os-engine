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
import org.gradle.api.GradleException;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.SourceSet;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.RuleClosure;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.utils.*;

import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Base class of MOE plugins.
 */
public abstract class AbstractMoePlugin implements Plugin<Project> {

    /**
     * MOE group.
     */
    public static final String MOE = "moe";

    /**
     * Required major version of Gradle.
     */
    private static final int GRADLE_MIN_VERSION_MAJOR = 5;
    /**
     * Required minor version of Gradle.
     */
    private static final int GRADLE_MIN_VERSION_MINOR = 4;

    /**
     * Optional revision version of Gradle.
     */
    private static final Integer GRADLE_MIN_REVISION = 1;

    @NotNull
    protected final Instantiator instantiator;

    @NotNull
    private Project project;

    @NotNull
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

    /**
     * Returns the minimum required Gradle version.
     *
     * @return Minimum required Gradle version
     */
    @IgnoreUnused
    public final String getRequiredGradleVersion() {
        if (GRADLE_MIN_REVISION == null) {
            return GRADLE_MIN_VERSION_MAJOR + "." + GRADLE_MIN_VERSION_MINOR;
        } else {
            return GRADLE_MIN_VERSION_MAJOR + "." + GRADLE_MIN_VERSION_MINOR + "." + GRADLE_MIN_REVISION;
        }
    }

    /**
     * Checks whether the host Gradle complies with MOE's version requirements.
     *
     * @param project Project to check
     */
    private void checkGradleVersion(Project project) {
        final String versionString = project.getGradle().getGradleVersion();
        final String[] components = versionString.split("\\.");
        final int major = Integer.parseInt(components[0 /* Major */]);

        Integer revision = 0;

        String minorString = components[1 /* Minor */];
        String suffix = null;

        int minor = 0;

        if (!minorString.contains("-")) {
            minor = Integer.parseInt(minorString);
        } else {
            String[] minorComponents = minorString.split("-");
            minor = Integer.parseInt(minorComponents[0]);
            if (minorComponents.length > 1) {
                suffix = minorComponents[1];
            }
        }

        if (components.length > 2) {
            String revisionString = components[2 /* Revision */];
            if (!revisionString.contains("-")) {
                revision = Integer.parseInt(revisionString);
            } else {
                String[] revisionComponents = revisionString.split("-");
                revision = Integer.parseInt(revisionComponents[0]);
                if (revisionComponents.length > 1) {
                    suffix = revisionComponents[1];
                }
            }
        }

        if (major > GRADLE_MIN_VERSION_MAJOR) {
            return;
        }
        if (major == GRADLE_MIN_VERSION_MAJOR && minor > GRADLE_MIN_VERSION_MINOR) {
            return;
        }
        if (GRADLE_MIN_REVISION == null) {
            if (revision != null && revision.intValue() > 0) {
                return;
            }
            if (major == GRADLE_MIN_VERSION_MAJOR && minor > GRADLE_MIN_VERSION_MINOR){
                return;
            }
            if (suffix == null) {
                if (major == GRADLE_MIN_VERSION_MAJOR && minor >= GRADLE_MIN_VERSION_MINOR) {
                    return;
                }
            }
        } else if (revision != null) {
            if (major == GRADLE_MIN_VERSION_MAJOR && minor == GRADLE_MIN_VERSION_MINOR &&
                    revision.intValue() > GRADLE_MIN_REVISION) {
                return;
            }
            if (suffix == null) {
                if (major == GRADLE_MIN_VERSION_MAJOR && minor == GRADLE_MIN_VERSION_MINOR &&
                        revision.intValue() >= GRADLE_MIN_REVISION) {
                    return;
                }
            }
        }

        String revisionMessage = GRADLE_MIN_REVISION == null ? "" :  "." + GRADLE_MIN_REVISION;
        throw new GradleException("The 'moe' plugin requires Gradle version " + GRADLE_MIN_VERSION_MAJOR + "." +
                GRADLE_MIN_VERSION_MINOR + revisionMessage + " or higher! " +
                "Current version is " + versionString + ".");
    }

    public final Logger getLogger() {
        return getProject().getLogger();
    }

    @NotNull
    protected JavaPluginConvention javaConvention;

    @NotNull
    public JavaPluginConvention getJavaConvention() {
        return Require.nonNull(javaConvention, "The plugin's 'javaConvention' property was null");
    }

    protected enum TaskParams {
        SOURCE_SET, MODE, ARCH, ARCH_FAMILY, PLATFORM;

        public Object getValue(AbstractMoePlugin plugin, String value) {
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

    protected  <T extends AbstractBaseTask> void addRule(Class<T> taskClass, String description, List<TaskParams> params, AbstractMoePlugin plugin) {
        // Prepare constants
        final String TASK_NAME = taskClass.getSimpleName();
        final String ELEMENTS_DESC = params.stream().map(p -> "<" + p.getName() + ">").collect(Collectors.joining());
        final String PATTERN = MOE + ELEMENTS_DESC + TASK_NAME;

        // Add rule
        getProject().getTasks().addRule("Pattern: " + PATTERN + ": " + description, new RuleClosure(getProject()) {
            @Override
            public @Nullable Task doCall(@NotNull String taskName) {
                Require.nonNull(taskName);

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
                final Object[] objects = params.stream().map(p -> p.getValue(plugin, elements.get(pIndex.getAndIncrement()))).collect(Collectors.toList()).toArray();

                // Create task
                final T task = getProject().getTasks().create(taskName, taskClass);

                // Set group
                task.setGroup(MOE);

                // Call setup method
                ((GroovyObject) task).invokeMethod("setupMoeTask", objects);

                checkRemoteServer(task);

                return task;
            }
        });
    }

    abstract protected void checkRemoteServer(AbstractBaseTask task);
}
