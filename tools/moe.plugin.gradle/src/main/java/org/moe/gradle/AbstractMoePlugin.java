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
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.gradle.api.logging.Logger;
import org.gradle.api.plugins.JavaLibraryPlugin;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginExtension;
import org.gradle.api.tasks.SourceSet;
import org.gradle.api.tasks.compile.CompileOptions;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.internal.reflect.Instantiator;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.model.builder.GradlePluginModelBuilder;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Mode;
import org.moe.gradle.utils.Require;

import javax.inject.Inject;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
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
    private static final int GRADLE_MIN_VERSION_MAJOR = 6;
    /**
     * Required minor version of Gradle.
     */
    private static final int GRADLE_MIN_VERSION_MINOR = 1;

    /**
     * Optional revision version of Gradle.
     */
    private static final Integer GRADLE_MIN_REVISION = 1;

    @NotNull
    protected final Instantiator instantiator;

    @NotNull
    protected final ToolingModelBuilderRegistry registry;

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

    /**
     * Whether this plugin is meant to produce a library or an application.
     *
     * If `isLibrary` == `true` then this plugin will add the "java-library" plugin to the project
     * and add all MOE dependencies using the "api" configuration, otherwise "java" plugin will be used
     * and all dependencies are added into "implementation" configuration.
     */
    private final boolean isLibrary;

    @Inject
    AbstractMoePlugin(Instantiator instantiator, ToolingModelBuilderRegistry registry, boolean isLibrary) {
        this.instantiator = Require.nonNull(instantiator);
        this.registry = Require.nonNull(registry);
        this.isLibrary = isLibrary;
    }

    @Override
    public void apply(Project project) {
        // Register tooling
        registry.register(new GradlePluginModelBuilder());

        // Set project
        this.project = Require.nonNull(project);

        // Check Gradle version
        checkGradleVersion(project);

        // Apply Java plugin
        project.getPluginManager().apply(
            isLibrary ? JavaLibraryPlugin.class : JavaPlugin.class
        );

        // Setup the SDK
        sdk = MoeSDK.setup(this);

        // Get Java convention
        javaConvention = project.getExtensions().getByType(JavaPluginExtension.class);
        Require.nonNull(javaConvention, "The 'java' Gradle plugin must be applied before the '" + MOE + "' plugin");
    }

    /**
     * Returns the minimum required Gradle version.
     *
     * @return Minimum required Gradle version
     */
    @IgnoreUnused
    public final String getRequiredGradleVersion() {
        return getGradleMinVersion();
    }

    public static String getGradleMinVersion() {
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
    protected JavaPluginExtension javaConvention;

    @NotNull
    public JavaPluginExtension getJavaConvention() {
        return Require.nonNull(javaConvention, "The plugin's 'javaConvention' property was null");
    }

    @NotNull
    public abstract AbstractMoeExtension getExtension();

    public enum TaskParams {
        SOURCE_SET, MODE, ARCH, ARCH_FAMILY, PLATFORM;

        public Object[] getPossibleValues(AbstractMoePlugin plugin) {
            switch (this) {
            case SOURCE_SET:
                return plugin.getJavaConvention().getSourceSets().toArray();
            case MODE:
                return new Mode[] {Mode.DEBUG, Mode.RELEASE};
            case ARCH:
                return new Arch[] {Arch.ARM64, Arch.X86_64};
            case ARCH_FAMILY:
                return new String[] {Arch.FAMILY_ARM64, Arch.FAMILY_X86_64};
            case PLATFORM:
                return MoePlatform.ALL_PLATFORMS;
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

    public <T extends AbstractBaseTask> void registerTask(Class<T> taskClass, String description, List<TaskParams> params) {
        generateParameterCombinations(params, objects -> {
            String name = getTaskName(taskClass, objects);
            getProject().getTasks().register(name, taskClass, task -> {
                task.setDescription(description);
                task.setGroup(MOE);

                // Call setup method
                ((GroovyObject) task).invokeMethod("setupMoeTask", objects);

                checkRemoteServer(task);
            });
        });
    }


    public void generateParameterCombinations(List<TaskParams> params, Consumer<Object[]> combinationHandler) {
        if (params.isEmpty()) {
            combinationHandler.accept(new Object[0]);
            return;
        }

        generateRecursive(params, 0, new Object[params.size()], combinationHandler);
    }

    private void generateRecursive(List<TaskParams> params, int currentIndex, Object[] currentCombination, Consumer<Object[]> combinationHandler) {
        if (currentIndex == params.size()) {
            if (verifyParameterCombination(currentCombination))
                combinationHandler.accept(currentCombination.clone());
            return;
        }

        TaskParams currentParam = params.get(currentIndex);
        Object[] possibleValues = currentParam.getPossibleValues(this);

        for (Object value : possibleValues) {
            currentCombination[currentIndex] = value;
            generateRecursive(params, currentIndex + 1, currentCombination, combinationHandler);
        }
    }

    private boolean verifyParameterCombination(Object[] possibleValues) {
        Arch encounteredArch = null;
        MoePlatform encounteredPlatform = null;

        for (Object possibleValue : possibleValues) {
            if (possibleValue instanceof Arch)
                encounteredArch = (Arch)possibleValue;
            if (possibleValue instanceof MoePlatform)
                encounteredPlatform = (MoePlatform)possibleValue;
        }

        if (encounteredArch != null && encounteredPlatform != null && !encounteredPlatform.archs.contains(encounteredArch))
            return false;
        return true;
    }

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

    protected void installCommonDependencies() {
        // Add moe-core.jar to the bootclasspath
        Arrays.asList("compileJava", "compileTestJava").forEach(name -> {
            Task task = project.getTasks().getByName(name);
            CompileOptions compileOptions = ((JavaCompile) task).getOptions();
            compileOptions.setFork(true);
        });

        // Install core, ios and junit jars as dependencies
        project.getRepositories().ivy(ivy -> {
            ivy.setName("multi-os-engine-implicit-sdk-repo");
            try {
                ivy.setUrl(getSDK().getSDKDir().toURI().toURL());
            } catch (MalformedURLException e) {
                throw new GradleException("Failed to add Multi-OS Engine SDK repo", e);
            }
            ivy.artifactPattern(ivy.getUrl() + "/[artifact](-[classifier])(.[ext])");
        }).metadataSources(IvyArtifactRepository.MetadataSources::artifact);
        project.getRepositories().ivy(ivy -> {
            ivy.setName("multi-os-engine-implicit-tools-repo");
            try {
                ivy.setUrl(getSDK().getToolsDir().toURI().toURL());
            } catch (MalformedURLException e) {
                throw new GradleException("Failed to add Multi-OS Engine Tools repo", e);
            }
            ivy.artifactPattern(ivy.getUrl() + "/[artifact](-[classifier])(.[ext])");
        }).metadataSources(IvyArtifactRepository.MetadataSources::artifact);

        project.getDependencies().add(
            isLibrary ? JavaPlugin.API_CONFIGURATION_NAME : JavaPlugin.IMPLEMENTATION_CONFIGURATION_NAME,
            FileUtils.getNameAsArtifact(getSDK().getCoreJar(), getSDK().sdkVersion)
        );

        if (getExtension().getPlatformJar() != null) {
            project.getDependencies().add(
                isLibrary ? JavaPlugin.API_CONFIGURATION_NAME : JavaPlugin.IMPLEMENTATION_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getExtension().getPlatformJar(), getSDK().sdkVersion)
            );
        }
        project.getDependencies().add(JavaPlugin.TEST_IMPLEMENTATION_CONFIGURATION_NAME,
            FileUtils.getNameAsArtifact(getSDK().getiOSJUnitJar(), getSDK().sdkVersion));
        
        project.getDependencies().add(JavaPlugin.COMPILE_ONLY_CONFIGURATION_NAME, "org.jetbrains:annotations:23.0.0");
    }

    abstract protected void checkRemoteServer(AbstractBaseTask task);
}
