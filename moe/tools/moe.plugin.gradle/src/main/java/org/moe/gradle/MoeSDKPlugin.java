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

import org.gradle.api.Project;
import org.gradle.internal.reflect.Instantiator;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.utils.Require;

import javax.inject.Inject;
import java.io.File;

public class MoeSDKPlugin extends AbstractMoePlugin {

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

        project.getTasks().create("moeSDKProperties", task -> {
            task.setGroup(MOE);
            task.setDescription("Prints some properties of the MOE SDK.");
            task.getActions().add(t -> {
                final File platformJar = extension.getPlatformJar();
                System.out.println("\n" +
                        "moe.sdk.home=" + getSDK().getRoot() + "\n" +
                        "moe.sdk.coreJar=" + getSDK().getCoreJar() + "\n" +
                        "moe.sdk.platformJar=" + (platformJar == null ? "" : platformJar) + "\n" +
                        "moe.sdk.junitJar=" + getSDK().getiOSJUnitJar() + "\n" +
                        "\n");
            });
        });
    }
}
