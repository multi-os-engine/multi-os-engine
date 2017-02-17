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
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.specs.Spec;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Optional;
import org.moe.gradle.AbstractMoeExtension;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.moe.gradle.AbstractMoePlugin.MOE;

public class NatJGen extends AbstractBaseTask {

    private static final String CONVENTION_CONFIGURATION = "config";
    private static final String CONVENTION_NATJGEN_JAR = "natjgen-jar";
    private static final String CONVENTION_NATJGEN_LOG_OUTPUT = "natjgen-output";

    @Nullable
    private String config;

    @Nullable
    private String natjgenOutput;

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

    @Input
    @Optional
    @Nullable
    public String getNatjgenOutput() {
        return nullableGetOrConvention(config, CONVENTION_NATJGEN_LOG_OUTPUT);
    }

    @IgnoreUnused
    public void setNatjgenOutput(@Nullable String output) {
        this.natjgenOutput = output;
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

        String natjLogOutput = getNatjgenOutput();

        final AbstractMoeExtension ext = getExtension();

        javaexec(spec -> {
            spec.setMain("-jar");
            spec.setWorkingDir(ext.getSDK().getToolsDir().getAbsolutePath());
            spec.args(getNatJGenJar().getAbsolutePath());
            spec.args(getProject().getProjectDir().getParent());
            spec.args(getProject().getName());
            spec.args(configuration);
            List<String> args = new ArrayList<String>();
            if (isTest) {
                args.add("-Dmoe.natjgen.testrun=true");
            }
            if (natjLogOutput != null && !natjLogOutput.isEmpty()) {
                args.add("-Dmoe.natjgen.log.output=" + natjLogOutput);
            }
            //forward property
            if (System.getProperty("moe.keep.natjgen") != null) {
                args.add("-Dmoe.keep.natjgen=true");
            }
            spec.setJvmArgs(args);
        });
    }

    protected final void setupMoeTask() {

        setSupportsRemoteBuild(false);

        final AbstractMoeExtension ext = getExtension();

        // Construct default output path
        final Path out = Paths.get(MOE);

        setDescription("Generate binding");

        addConvention(CONVENTION_CONFIGURATION, () -> ext.natjgen.getConfig());

        addConvention(CONVENTION_NATJGEN_JAR, () -> ext.getSdk().getNatJGenJar());

        addConvention(CONVENTION_NATJGEN_LOG_OUTPUT, () -> ext.natjgen.getLogFile());

        addConvention(CONVENTION_LOG_FILE, () -> resolvePathInBuildDir(out, "NatJGen.log"));
    }

    public @NotNull AbstractMoeExtension getExtension() {
        return Require.nonNull((AbstractMoeExtension) getProject().getExtensions().findByName(MOE));
    }
}
