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
import org.gradle.api.provider.Property;
import org.gradle.api.provider.Provider;
import org.gradle.internal.reflect.Instantiator;
import org.gradle.jvm.toolchain.JavaLanguageVersion;
import org.gradle.jvm.toolchain.JavaLauncher;
import org.gradle.jvm.toolchain.JavaToolchainService;
import org.gradle.jvm.toolchain.JvmImplementation;
import org.gradle.jvm.toolchain.JvmVendorSpec;
import org.gradle.tooling.provider.model.ToolingModelBuilderRegistry;
import org.gradle.util.GradleVersion;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.remote.Server;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.tasks.ClassValidate;
import org.moe.gradle.tasks.GenerateUIObjCInterfaces;
import org.moe.gradle.tasks.IpaBuild;
import org.moe.gradle.tasks.LaunchDevice;
import org.moe.gradle.tasks.LaunchSimulator;
import org.moe.gradle.tasks.ListDevices;
import org.moe.gradle.tasks.ListSimulators;
import org.moe.gradle.tasks.NatJGen;
import org.moe.gradle.tasks.NativeImage;
import org.moe.gradle.tasks.R8;
import org.moe.gradle.tasks.ReflectionCollect;
import org.moe.gradle.tasks.ResourceCollect;
import org.moe.gradle.tasks.ResourcePackager;
import org.moe.gradle.tasks.StartupProvider;
import org.moe.gradle.tasks.TestClassesProvider;
import org.moe.gradle.tasks.UpdateXcodeSettings;
import org.moe.gradle.tasks.XcodeBuild;
import org.moe.gradle.tasks.XcodeInternal;
import org.moe.gradle.tasks.XcodeProvider;
import org.moe.gradle.utils.Arch;
import org.moe.gradle.utils.PropertiesUtil;
import org.moe.gradle.utils.Require;
import org.moe.tools.substrate.GraalVM;

import javax.inject.Inject;
import java.io.File;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.Set;
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

    private static final String MOE_GRAALVM_HOME_PROPERTY = "moe.graalvm.home";
    private static final String MOE_ARCHS_PROPERTY = "moe.archs";

    @NotNull
    private Property<GraalVM> graalVM;

    @NotNull
    public GraalVM getGraalVM() {
        return Require.nonNull(graalVM.getOrNull(), "The plugin's 'graalVM' property was null");
    }

    @NotNull
    private MoeExtension extension;

    @NotNull
    @Override
    public MoeExtension getExtension() {
        return Require.nonNull(extension, "The plugin's 'extension' property was null");
    }

    @Nullable
    private Server remoteServer;

    @Nullable
    public Server getRemoteServer() {
        return remoteServer;
    }

    @Nullable
    private Set<Arch> archs = null;

    @Nullable
    public Set<Arch> getArchs() {
        return archs;
    }

    @Inject
    public MoePlugin(Instantiator instantiator, ToolingModelBuilderRegistry registry) {
        super(instantiator, registry, false);
    }

    @Override
    public void apply(Project project) {
        super.apply(project);

        graalVM = project.getObjects().property(GraalVM.class);

        Provider<GraalVM> graalVMProvider = project.provider(() -> {
            if (PropertiesUtil.tryGetProperty(project, MOE_GRAALVM_HOME_PROPERTY) != null) {
                return new GraalVM(Paths.get(PropertiesUtil.getProperty(project, MOE_GRAALVM_HOME_PROPERTY)));
            } else {
                JavaToolchainService toolchains = project.getExtensions().getByType(JavaToolchainService.class);
                JavaLauncher launcher = toolchains.launcherFor(spec -> {
                    spec.getLanguageVersion().set(JavaLanguageVersion.of(GraalVM.SUPPORTED_JAVA_MAJOR));  // Set as per your GraalVM version
                    spec.getVendor().set(JvmVendorSpec.GRAAL_VM);
                    spec.getImplementation().set(JvmImplementation.VENDOR_SPECIFIC);
                }).get();
                return new GraalVM(launcher.getExecutablePath().getAsFile().getParentFile().getParentFile().toPath());
            }
        });

        if (GradleVersion.current().compareTo(GradleVersion.version("6.1")) >= 0) {
            graalVM.finalizeValueOnRead();
            graalVM.convention(graalVMProvider);
        } else {
            graalVM.set(graalVMProvider);
        }



        // Setup explicit archs
        String archsProp = PropertiesUtil.tryGetProperty(project, MOE_ARCHS_PROPERTY);
        if (archsProp != null) {
            archsProp = archsProp.trim();
            archs = Arrays.stream(archsProp.split(","))
                    .map(String::trim)
                    .filter(it -> !it.isEmpty())
                    .map(Arch::getForName)
                    .collect(Collectors.toSet());

            if (archs.isEmpty()) {
                archs = null;
            }
        }

        // Setup remote build
        remoteServer = Server.setup(this);
        if (remoteServer != null) {
            remoteServer.connect();
        }

        // Create plugin extension
        extension = project.getExtensions().create(MOE, MoeExtension.class, this, instantiator);
        extension.setup();

        // Add common MOE dependencies
        installCommonDependencies();

        // Install rules
        registerTask(R8.class, "Creates a R8'd jar.", asList(SOURCE_SET, MODE));
        registerTask(ClassValidate.class, "Validate classes.", asList(SOURCE_SET, MODE));
        registerTask(ReflectionCollect.class, "Collect reflection config.", asList(SOURCE_SET, MODE));
        ResourcePackager.registerTask(this);
        registerTask(ResourceCollect.class, "Collect resource config.", asList(SOURCE_SET, MODE));
        registerTask(NativeImage.class, "AOT compile using GraalVM native-image.", asList(SOURCE_SET, MODE, ARCH, PLATFORM));
        registerTask(TestClassesProvider.class, "Creates the classlist.txt file.", asList(SOURCE_SET, MODE));
        registerTask(StartupProvider.class, "Creates the preregister.txt file.", asList(SOURCE_SET, MODE));
        registerTask(XcodeProvider.class, "Collects the required dependencies.", asList(SOURCE_SET, MODE, ARCH, PLATFORM));

        // Only register when launched from XCode
        if (System.getenv("XCODE_PRODUCT_BUILD_VERSION") != null)
            registerTask(XcodeInternal.class, "Creates all files for Xcode.", emptyList());

        registerTask(XcodeBuild.class, "Creates .app files.", asList(SOURCE_SET, MODE, PLATFORM));
        registerTask(IpaBuild.class, "Creates .ipa files.", emptyList());
        registerTask(GenerateUIObjCInterfaces.class, "Creates a source file for Interface Builder", singletonList(MODE));
        registerTask(NatJGen.class, "Generate binding", emptyList());
        registerTask(UpdateXcodeSettings.class, "Updates Xcode project settings", emptyList());

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

        registerTask(ListDevices.class, "Lists all connected devices.", emptyList());
        registerTask(ListSimulators.class, "Lists all simulators.", emptyList());
        registerTask(LaunchDevice.class, "Build and run the MOE application or tests on a device.", singletonList(SOURCE_SET));
        registerTask(LaunchSimulator.class, "Build and run the MOE application or tests on a device.", singletonList(SOURCE_SET));
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
