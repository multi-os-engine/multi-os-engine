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

import org.apache.tools.ant.taskdefs.condition.Os;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.compile.CompileOptions;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.tasks.Dex;
import org.moe.gradle.tasks.Dex2Oat;
import org.moe.gradle.tasks.GenerateUIObjCInterfaces;
import org.moe.gradle.tasks.IpaBuild;
import org.moe.gradle.tasks.Launchers;
import org.moe.gradle.tasks.NatJGen;
import org.moe.gradle.tasks.ProGuard;
import org.moe.gradle.tasks.ResourcePackager;
import org.moe.gradle.tasks.Retrolambda;
import org.moe.gradle.tasks.StartupProvider;
import org.moe.gradle.tasks.TestClassesProvider;
import org.moe.gradle.tasks.UpdateXcodeSettings;
import org.moe.gradle.tasks.XcodeBuild;
import org.moe.gradle.tasks.XcodeInternal;
import org.moe.gradle.tasks.XcodeProvider;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import javax.inject.Inject;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.moe.gradle.AbstractMoePlugin.TaskParams.*;

/**
 * MOE's 'moe-gradle' plugin.
 */
public class MoePlugin extends AbstractMoePlugin {

    private static final Logger LOG = Logging.getLogger(MoePlugin.class);

    @NotNull
    private MoeExtension extension;

    @NotNull
    public MoeExtension getExtension() {
        return Require.nonNull(extension, "The plugin's 'extension' property was null");
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

        // Add moe-core.jar to the bootclasspath
        Arrays.asList("compileJava", "compileTestJava").forEach(name -> {
            Task task = project.getTasks().getByName(name);
            CompileOptions compileOptions = ((JavaCompile) task).getOptions();
            compileOptions.setBootstrapClasspath(project.files(getSDK().getCoreJar()));
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
        });
        project.getRepositories().ivy(ivy -> {
            ivy.setName("multi-os-engine-implicit-tools-repo");
            try {
                ivy.setUrl(getSDK().getToolsDir().toURI().toURL());
            } catch (MalformedURLException e) {
                throw new GradleException("Failed to add Multi-OS Engine Tools repo", e);
            }
            ivy.artifactPattern(ivy.getUrl() + "/[artifact](-[classifier])(.[ext])");
        });

        project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getSDK().getCoreJar(), getSDK().sdkVersion));

        if (extension.getPlatformJar() != null) {
            project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                    FileUtils.getNameAsArtifact(getExtension().getPlatformJar(), getSDK().sdkVersion));
        }
        project.getDependencies().add(JavaPlugin.TEST_COMPILE_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getSDK().getiOSJUnitJar(), getSDK().sdkVersion));

        // Install java 8 support jars to fix lambda compilation
        project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getSDK().getJava8SupportJar(), getSDK().sdkVersion));

        project.getDependencies().add(JavaPlugin.TEST_COMPILE_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getSDK().getJava8SupportJar(), getSDK().sdkVersion));        

        // Install rules
        addRule(ProGuard.class, "Creates a ProGuarded jar.",
                singletonList(SOURCE_SET), MoePlugin.this);
        addRule(Retrolambda.class, "Creates a Retrolambda-d jar.",
                singletonList(SOURCE_SET), MoePlugin.this);
        addRule(Dex.class, "Creates a Dexed jar.",
                singletonList(SOURCE_SET), MoePlugin.this);
        addRule(Dex2Oat.class, "Creates art and oat files.",
                asList(SOURCE_SET, MODE, ARCH_FAMILY), MoePlugin.this);
        ResourcePackager.addRule(this);
        addRule(TestClassesProvider.class, "Creates the classlist.txt file.",
                singletonList(SOURCE_SET), MoePlugin.this);
        addRule(StartupProvider.class, "Creates the preregister.txt file.",
                singletonList(SOURCE_SET), MoePlugin.this);
        addRule(XcodeProvider.class, "Collects the required dependencies.",
                asList(SOURCE_SET, MODE, ARCH, PLATFORM), MoePlugin.this);
        addRule(XcodeInternal.class, "Creates all files for Xcode.",
                emptyList(), MoePlugin.this);
        addRule(XcodeBuild.class, "Creates .app files.",
                asList(SOURCE_SET, MODE, PLATFORM), MoePlugin.this);
        addRule(IpaBuild.class, "Creates .ipa files.",
                emptyList(), MoePlugin.this);
        addRule(GenerateUIObjCInterfaces.class, "Creates a source file for Interface Builder",
                emptyList(), MoePlugin.this);
        addRule(NatJGen.class, "Generate binding",
                emptyList(), MoePlugin.this);
        addRule(UpdateXcodeSettings.class, "Updates Xcode project settings",
                emptyList(), MoePlugin.this);

        project.getTasks().create("moeSDKProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE SDK.");
            task.getActions().add(t -> {
                final File platformJar = extension.getPlatformJar();
                LOG.quiet("\n" +
                        "moe.sdk.home=" + getSDK().getRoot() + "\n" +
                        "moe.sdk.coreJar=" + getSDK().getCoreJar() + "\n" +
                        "moe.sdk.platformJar=" + (platformJar == null ? "" : platformJar) + "\n" +
                        "moe.sdk.junitJar=" + getSDK().getiOSJUnitJar() + "\n" +
                        "\n");
            });
        });
        project.getTasks().create("moeXcodeProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE Xcode project.");
            task.getActions().add(t -> {
                final StringBuilder b = new StringBuilder("\n");
                Optional.ofNullable(extension.xcode.getProject()).ifPresent(
                        o -> b.append("moe.xcode.project=").append(project.file(o).getAbsolutePath()).append("\n"));
                Optional.ofNullable(extension.xcode.getWorkspace()).ifPresent(
                        o -> b.append("moe.xcode.workspace=").append(project.file(o).getAbsolutePath()).append("\n"));
                Optional.ofNullable(extension.xcode.getMainTarget()).ifPresent(
                        o -> b.append("moe.xcode.mainTarget=").append(o).append("\n"));
                Optional.ofNullable(extension.xcode.getTestTarget()).ifPresent(
                        o -> b.append("moe.xcode.testTarget=").append(o).append("\n"));
                Optional.ofNullable(extension.xcode.getMainScheme()).ifPresent(
                        o -> b.append("moe.xcode.mainScheme=").append(o).append("\n"));
                Optional.ofNullable(extension.xcode.getTestScheme()).ifPresent(
                        o -> b.append("moe.xcode.testScheme=").append(o).append("\n"));
                b.append("\n");
                LOG.quiet(b.toString());
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

    @Override
    protected void checkRemoteServer(AbstractBaseTask task) {
        if (getRemoteServer() != null && task.getRemoteExecutionStatusSet()) {
            task.dependsOn(getRemoteServer().getMoeRemoteServerSetupTask());
        }
    }
}
