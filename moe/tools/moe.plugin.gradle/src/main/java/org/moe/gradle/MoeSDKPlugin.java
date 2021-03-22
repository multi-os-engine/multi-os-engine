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
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.artifacts.repositories.IvyArtifactRepository;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.plugins.JavaPlugin;
import org.gradle.api.plugins.JavaPluginConvention;
import org.gradle.api.tasks.compile.CompileOptions;
import org.gradle.api.tasks.compile.JavaCompile;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.tasks.AbstractBaseTask;
import org.moe.gradle.tasks.NatJGen;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import javax.inject.Inject;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;

import static java.util.Collections.emptyList;

/**
 * MOE's 'moe-sdk' plugin.
 */
public class MoeSDKPlugin extends AbstractMoePlugin {

    private static final Logger LOG = Logging.getLogger(MoeSDKPlugin.class);

    @NotNull
    private MoeSDKExtension extension;

    @NotNull
    @IgnoreUnused
    public MoeSDKExtension getExtension() {
        return Require.nonNull(extension, "The plugin's 'extension' property was null");
    }

    @Inject
    public MoeSDKPlugin(Instantiator instantiator) {
        super(instantiator);
    }

    @Override
    public void apply(Project project) {
        super.apply(project);

        // Create plugin extension
        extension = project.getExtensions().create(MOE, MoeSDKExtension.class, this, instantiator);

        // Get Java convention
        javaConvention = (JavaPluginConvention) project.getConvention().getPlugins().get("java");
        Require.nonNull(javaConvention, "The 'java' Gradle plugin must be applied before the '" + MOE + "' plugin");

        // Add moe-core.jar to the bootclasspath
//        Arrays.asList("compileJava", "compileTestJava").forEach(name -> {
//            Task task = project.getTasks().getByName(name);
//            CompileOptions compileOptions = ((JavaCompile) task).getOptions();
//            compileOptions.setBootstrapClasspath(project.files(getSDK().getCoreJar()));
//            compileOptions.setFork(true);
//        });
        
        // Install core, ios and junit jars as dependencies
        project.getRepositories().ivy(ivy -> {
            ivy.setName("multi-os-engine-implicit-repo");
            try {
                ivy.setUrl(getSDK().getSDKDir().toURI().toURL());
            } catch (MalformedURLException e) {
                throw new GradleException("Failed to add Multi-OS Engine repo", e);
            }
            ivy.artifactPattern(ivy.getUrl() + "/[artifact](-[classifier])(.[ext])");
        }).metadataSources(IvyArtifactRepository.MetadataSources::artifact);

//        project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
//                FileUtils.getNameAsArtifact(getSDK().getCoreJar(), getSDK().sdkVersion));
        if (extension.getPlatformJar() != null) {
            project.getDependencies().add(JavaPlugin.COMPILE_CONFIGURATION_NAME,
                    FileUtils.getNameAsArtifact(getExtension().getPlatformJar(), getSDK().sdkVersion));
        }
        project.getDependencies().add(JavaPlugin.TEST_COMPILE_CONFIGURATION_NAME,
                FileUtils.getNameAsArtifact(getSDK().getiOSJUnitJar(), getSDK().sdkVersion));

        project.getTasks().create("moeSDKProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE SDK.");
            task.getActions().add(t -> {
                final File platformJar = extension.getPlatformJar();
                LOG.quiet("\n" +
                        "moe.sdk.home=" + getSDK().getRoot() + "\n" +
//                        "moe.sdk.coreJar=" + getSDK().getCoreJar() + "\n" +
                        "moe.sdk.platformJar=" + (platformJar == null ? "" : platformJar) + "\n" +
                        "moe.sdk.junitJar=" + getSDK().getiOSJUnitJar() + "\n" +
                        "\n");
            });
        });

        addRule(NatJGen.class, "Generate binding",
                emptyList(), MoeSDKPlugin.this);
    }

    @Override
    protected void checkRemoteServer(AbstractBaseTask task) {

    }

}
