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

package org.moe.gradle.utils;

import org.apache.commons.io.output.NullOutputStream;
import org.gradle.api.Action;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.Task;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.SourceSet;
import org.gradle.process.ExecResult;
import org.gradle.process.ExecSpec;
import org.gradle.process.JavaExecSpec;
import org.moe.gradle.AbstractMoePlugin;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.TaskClosure;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class TaskUtils {

    private static final Logger LOG = Logging.getLogger(TaskUtils.class);

    private TaskUtils() {
    }

    public static void assertSize(@NotNull List<String> elements, int count, @NotNull String desc) {
        Require.nonNull(elements);
        Require.GE(count, 0, null);
        Require.nonNull(desc);

        if (elements.size() != count) {
            final String[] tmp = elements.toArray(new String[elements.size()]);
            throw new GradleException("Invalid value for '" + desc + "': '" + StringUtils.camelcase(tmp) + "'");
        }
    }

    public static SourceSet getSourceSet(@NotNull AbstractMoePlugin plugin, @NotNull String sourceSetName) {
        Require.nonNull(plugin);
        Require.nonNull(sourceSetName);

        final SourceSet sourceSet = plugin.getJavaConvention().getSourceSets().getByName(sourceSetName);
        if (sourceSet == null) {
            // Fail on unsupported element
            throw new GradleException("Invalid SourceSet '" + sourceSetName + "'");
        }
        return sourceSet;
    }

    public static String getRequiredEnvVar(@NotNull String name) {
        Require.nonNull(name);

        return getRequiredEnvVar(name, null);
    }

    public static String getRequiredEnvVar(@NotNull String name, @Nullable String defaultValue) {
        Require.nonNull(name);

        String value = System.getenv().get(name);
        if (value == null || value.length() == 0) {
            value = defaultValue;
        }
        if (value == null || value.length() == 0) {
            throw new GradleException("Unspecified environment variable '" + name + "'");
        }
        return value;
    }

    @NotNull
    public static <T extends Task> Task create(@NotNull Project project, @NotNull String name, @NotNull Class<T> type,
                                               @NotNull Consumer<T> configure) {
        Require.nonNull(project);
        Require.nonNull(name);
        Require.nonNull(type);
        Require.nonNull(configure);

        return project.task(MapUtils.stringMap("type", type), name, new TaskClosure<T>(project) {
            @Override
            public void doCall(T task) {
                Require.nonNull(task);
                configure.accept(task);
            }
        });
    }

    public static void javaexec(@NotNull Project project, @NotNull Action<? super JavaExecSpec> javaExecSpec) {
        Require.nonNull(project);
        Require.nonNull(javaExecSpec);

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ArrayList<String> cmds = new ArrayList<>();
        final ExecResult result = project.javaexec(spec -> {
            spec.setIgnoreExitValue(true);
            spec.setErrorOutput(out);
            spec.setStandardOutput(out);
            javaExecSpec.execute(spec);
            cmds.addAll(spec.getCommandLine());
        });
        if (result.getExitValue() != 0) {
            LOG.error("Command failed: " + cmds);
            Arrays.asList(new String(out.toByteArray()).split("\\n")).forEach(LOG::error);
            throw new GradleException("Process exited with non-zero exit value");
        }
    }

    public static void exec(@NotNull Project project, @NotNull Action<? super ExecSpec> execSpec) {
        Require.nonNull(project);
        Require.nonNull(execSpec);

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final ArrayList<String> cmds = new ArrayList<>();
        final ExecResult result = project.exec(spec -> {
            spec.setIgnoreExitValue(true);
            spec.setErrorOutput(out);
            spec.setStandardOutput(out);
            execSpec.execute(spec);
            cmds.addAll(spec.getCommandLine());
        });
        if (result.getExitValue() != 0) {
            LOG.error("Command failed: " + cmds);
            Arrays.asList(new String(out.toByteArray()).split("\\n")).forEach(LOG::error);
            throw new GradleException("Process exited with non-zero exit value");
        }
    }

    public static String quickExec(@NotNull Project project, @NotNull String... commands) {
        Require.nonNull(project);
        final List<String> cmds = new ArrayList<>(Arrays.asList(Require.nonNull(commands)));
        Require.sizeGT(cmds, 0);

        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        exec(project, spec -> {
            spec.setExecutable(cmds.remove(0));
            spec.args(cmds);
            spec.setStandardOutput(out);
        });
        return out.toString();
    }

    public static boolean checkExec(@NotNull Project project, @NotNull String... commands) {
        Require.nonNull(project);
        final List<String> cmds = new ArrayList<>(Arrays.asList(Require.nonNull(commands)));
        Require.sizeGT(cmds, 0);

        final ExecResult result = project.exec(spec -> {
            spec.setIgnoreExitValue(true);
            spec.setExecutable(cmds.remove(0));
            spec.args(cmds);
            spec.setErrorOutput(new NullOutputStream());
            spec.setStandardOutput(new NullOutputStream());
        });
        return result.getExitValue() == 0;
    }

    public static <T> T compute(@NotNull Supplier<T> supplier) {
        return supplier.get();
    }
}
