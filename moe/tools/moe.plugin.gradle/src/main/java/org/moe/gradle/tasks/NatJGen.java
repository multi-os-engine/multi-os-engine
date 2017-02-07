/*
Copyright (C) 2017 Migeran

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
import org.gradle.api.Task;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;
import org.moe.gradle.MoeExtension;
import org.moe.gradle.MoePlugin;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.Nullable;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NatJGen extends AbstractBaseTask {

    private static final String CONVENTION_CONFIGURATION = "config";
    private static final String CONVENTION_NATJGEN_JAR = "natjgen-jar";

    @Nullable
    private String config;

    public NatJGen() {
        getOutputs().upToDateWhen(new Spec<Task>() {
            @Override
            public boolean isSatisfiedBy(Task task) {
                return false;
            }
        });
    }

    @Input
    @Optional
    @Nullable
    public String getConfig() {
        return nullableGetOrConvention(config, CONVENTION_CONFIGURATION);
    }

    @IgnoreUnused
    public void setConfig(@Nullable String config) {
        this.config = config;
    }

    private File natjgen;

    @Input
    public File getNatJGenJar() {
        return nullableGetOrConvention(natjgen, CONVENTION_NATJGEN_JAR);
    }

    @IgnoreUnused
    public void setNatJGenJar(File natjgen) {
        this.natjgen = natjgen;
    }

    @Override
    protected void run() {

        String bindingConfiguration = getConfig();

        String propertyConf = System.getProperty("moe.binding.conf");

        final String configuration = propertyConf == null ? bindingConfiguration : propertyConf;

        boolean isTest = Boolean.valueOf(System.getProperty("moe.natjgen.testrun"));

        if (configuration == null || configuration.isEmpty()) {
            throw new GradleException("Missing binding configuration settings");
        }

        javaexec(spec -> {
            spec.setMain("-jar");
            spec.setWorkingDir(getMoeExtension().getSDK().getToolsDir().getAbsolutePath());
            spec.args(getNatJGenJar().getAbsolutePath());
            spec.args(getProject().getProjectDir().getParent());
            spec.args(getProject().getName());
            spec.args(configuration);
            if (isTest) {
                List<String> args = new ArrayList<String>();
                args.add("-Dmoe.natjgen.testrun=true");
                spec.setJvmArgs(args);
            }
        });
    }

    protected final void setupMoeTask() {

        setSupportsRemoteBuild(false);

        final MoeExtension ext = getMoeExtension();

        // Construct default output path
        final Path out = Paths.get(MoePlugin.MOE);

        setDescription("Generate binding");

        addConvention(CONVENTION_CONFIGURATION, () -> ext.natjgen.getConfig());

        addConvention(CONVENTION_NATJGEN_JAR, () -> ext.getSdk().getNatJGenJar());

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "NatJGen.log"));
    }
}
