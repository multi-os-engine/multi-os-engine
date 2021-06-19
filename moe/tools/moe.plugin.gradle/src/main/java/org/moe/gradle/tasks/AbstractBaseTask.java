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

package org.moe.gradle.tasks;

import org.gradle.api.*;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.gradle.process.ExecResult;
import org.gradle.process.ExecSpec;
import org.gradle.process.JavaExecSpec;
import org.moe.common.utils.FileUtilsKt;
import org.moe.gradle.*;
import org.moe.gradle.anns.IgnoreUnused;
import org.moe.gradle.anns.NotNull;
import org.moe.gradle.anns.Nullable;
import org.moe.gradle.groovy.closures.RuleClosure;
import org.moe.gradle.groovy.closures.ValueClosure;
import org.moe.gradle.remote.Server;
import org.moe.gradle.utils.FileUtils;
import org.moe.gradle.utils.Require;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.function.Function;
import java.util.function.Supplier;

public abstract class AbstractBaseTask extends DefaultTask {

    protected static final String CONVENTION_LOG_FILE = "logFile";
    private static final String CONVENTION_REMOTE_BUILD_HELPER = "remoteBuildHelper";
    private static final String MOE_RAW_BINDING_OUTPUT_OPTION = "raw-binding-output";

    private Object logFile;

    private final Logger logger = Logging.getLogger(getClass());

    @OutputFile
    @NotNull
    public File getLogFile() {
        return getProject().file(getOrConvention(logFile, CONVENTION_LOG_FILE));
    }

    @IgnoreUnused
    public void setLogFile(Object logFile) {
        this.logFile = logFile;
    }

    private Boolean remoteExecutionStatusSet;

    public boolean getRemoteExecutionStatusSet() {
        return Require.nonNull(remoteExecutionStatusSet);
    }


    @Input
    @NotNull
    @IgnoreUnused
    public Long getRemoteBuildHelper() {
        Require.nonNull(remoteExecutionStatusSet, "Remote execution status was not set on task '" + getName() + "'");
        return getOrConvention(null, CONVENTION_REMOTE_BUILD_HELPER);
    }

    protected void setSupportsRemoteBuild(boolean value) {
        Require.nullObject(remoteExecutionStatusSet, "Remote execution status was already set on task '" + getName() + "'");
        remoteExecutionStatusSet = value;
        addConvention(CONVENTION_REMOTE_BUILD_HELPER, () -> {
            if (remoteExecutionStatusSet) {
                if (getMoePlugin().getRemoteServer() != null) {
                    return new Date().getTime();
                } else {
                    return 0L;
                }
            } else {
                return 0L;
            }
        });
    }

    @TaskAction
    @IgnoreUnused
    private void runInternal() {
        // Reset logs
        FileUtils.write(getLogFile(), "");
        run();
        setDidWork(true);
    }

    abstract protected void run();

    protected @NotNull MoeExtension getMoeExtension() {
        return Require.nonNull((MoeExtension) getProject().getExtensions().findByName(MoePlugin.MOE));
    }

    public @NotNull AbstractMoeExtension getExtension() {
        return Require.nonNull((AbstractMoeExtension) getProject().getExtensions().findByName(AbstractMoePlugin.MOE));
    }

    @NotNull
    protected MoePlugin getMoePlugin() {
        return Require.nonNull((MoePlugin) getMoeExtension().plugin);
    }

    protected @NotNull MoeSDK getMoeSDK() {
        return getMoeExtension().plugin.getSDK();
    }

    public void addConvention(String name, Supplier<@Nullable Object> supplier) {
        Require.nonNull(name);
        Require.nonNull(supplier);

        getConvention().add(name, new ValueClosure<Object>(this) {
            @Override
            @Nullable
            public Object doCall() {
                return supplier.get();
            }
        });
    }

    @SuppressWarnings("unchecked")
    @NotNull
    public <T> T getOrConvention(@Nullable T value, @NotNull String name) {
        Require.nonNull(name);

        if (value == null) {
            final @Nullable T result = (T) getConvention().findByName(name);
            if (result instanceof ValueClosure) {
                final ValueClosure<T> closure = (ValueClosure<T>) result;
                final @Nullable T result2 = closure.call();
                return Require.nonNull(result2, "Required a non-null value for property '" + name + "'");
            }
            return Require.nonNull(result, "Required a non-null value for property '" + name + "'");
        }
        return value;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public <T> T nullableGetOrConvention(@Nullable T value, @NotNull String name) {
        Require.nonNull(name);

        if (value == null) {
            final @Nullable T result = (T) getConvention().findByName(name);
            if (result != null && result instanceof ValueClosure) {
                final ValueClosure<T> closure = (ValueClosure<T>) result;
                return closure.call();
            }
            return result;
        }
        return value;
    }

    private boolean shouldLogOnExecFail() {
        if (!getProject().hasProperty("moe.tasks.printLogOnFail")) {
            return true;
        }
        return getProject().property("moe.tasks.printLogOnFail").equals("true");
    }

    protected void exec(@NotNull Action<ExecSpec> spec) {
        Require.nonNull(spec);

        FileUtilsKt.touch(getLogFile());

        final ExecResult result = getProject().exec(execSpec -> {
            // Pre-configure
            execSpec.setIgnoreExitValue(true);
            // Set logging
            FileOutputStream ostream = null;
            try {
                ostream = new FileOutputStream(getLogFile(), true);
            } catch (FileNotFoundException e) {
                throw new GradleException("Failed to open output stream to " + getLogFile(), e);
            }
            execSpec.setErrorOutput(ostream);
            execSpec.setStandardOutput(ostream);

            // Configure
            spec.execute(execSpec);
        });
        if (result.getExitValue() != 0 && shouldLogOnExecFail() && getLogFile() != null) {
            logger.error("\n" +
                    "###########\n" +
                    "# ERROR LOG\n" +
                    "###########\n\n");
            logger.error(FileUtils.read(getLogFile()));
            logger.error("\n");
        }
        if (result.getExitValue() != 0) {
            throw new GradleException("Task failed, you can find the log file here: " + getLogFile().getAbsolutePath());
        }
    }

    protected void javaexec(@NotNull Action<JavaExecSpec> spec) {
        Require.nonNull(spec);

        FileUtilsKt.touch(getLogFile());

        final ExecResult result = getProject().javaexec(execSpec -> {
            execSpec.jvmArgs(getExtension().javaProcess.getJvmArgs());

            spec.execute(execSpec);

            execSpec.setIgnoreExitValue(true);
            // Set logging
            FileOutputStream ostream = null;
            try {
                ostream = new FileOutputStream(getLogFile(), true);
            } catch (FileNotFoundException e) {
                throw new GradleException("Failed to open output stream to " + getLogFile(), e);
            }

            if (System.getProperty(MOE_RAW_BINDING_OUTPUT_OPTION) == null) {
                execSpec.setErrorOutput(ostream);
                execSpec.setStandardOutput(ostream);
            }
        });
        if (result.getExitValue() != 0 && shouldLogOnExecFail() && getLogFile() != null) {
            logger.error("\n" +
                    "###########\n" +
                    "# ERROR LOG\n" +
                    "###########\n\n");
            logger.error(FileUtils.read(getLogFile()));
            logger.error("\n");
        }
        if (result.getExitValue() != 0) {
            throw new GradleException("Task failed, you can find the log file here: " + getLogFile().getAbsolutePath());
        }
    }

    @NotNull
    protected static Rule addTaskRule(@NotNull Project project,
                                      @NotNull String pattern,
                                      @NotNull Function<@NotNull String, @Nullable Task> taskBuilder) {
        Require.nonNull(project);
        Require.nonNull(pattern);
        Require.nonNull(taskBuilder);

        return project.getTasks().addRule(pattern, new RuleClosure(project) {
            @Override
            public @Nullable Task doCall(@NotNull String taskName) {
                Require.nonNull(taskName);
                return taskBuilder.apply(taskName);
            }
        });
    }

    protected final File resolvePathInProjectDir(Object... subPaths) {
        return resolvePathRelativeToRoot(getProject().getProjectDir(), subPaths);
    }

    protected final File resolvePathInBuildDir(Object... subPaths) {
        return resolvePathRelativeToRoot(getProject().getBuildDir(), subPaths);
    }

    protected File resolvePathRelativeToRoot(File root, Object... subPaths) {
        Require.nonNull(root);
        Require.nonNull(subPaths);

        Path path = root.toPath();
        for (Object subPath : subPaths) {
            Require.nonNull(subPath);

            if (subPath instanceof Path) {
                path = path.resolve((Path) subPath);
            } else if (subPath instanceof String) {
                path = path.resolve((String) subPath);
            } else {
                throw new IllegalStateException();
            }
        }
        return path.toFile();
    }

    protected Path getProjectRelativePath(@NotNull File file) {
        Require.nonNull(file);
        File projectDir = getProject().getParent() != null ? getProject().getParent().getProjectDir() : getProject().getProjectDir();
        return projectDir.toPath().relativize(file.toPath());
    }

    protected Path getInnerProjectRelativePath(@NotNull File file) throws IOException {
        final Path path = getProjectRelativePath(file);
        if (path.toString().contains("..")) {
            throw new IOException("File is outside of the project directory");
        }
        return path;
    }

    protected Path getLocalSDKLink() {
        final String outPath = Paths.get(MoePlugin.MOE).toString();
        return Paths.get(getProject().getBuildDir().toString(), outPath, "sdk");
    }

    protected void linkSDK() {
        final Server remoteServer = getMoePlugin().getRemoteServer();
        if (remoteServer != null) {
            final Path outPath;
            try {
                outPath = getInnerProjectRelativePath(resolvePathInBuildDir(Paths.get(MoePlugin.MOE)));
            } catch (IOException e) {
                throw new GradleException("Unsupported configuration", e);
            }

            final String remoteSDKLink = remoteServer.getRemotePath(outPath.resolve("sdk"));
            remoteServer.exec("link sdk", "" +
                    "mkdir -p '" + remoteServer.getRemotePath(outPath) + "' && " +
                    "rm -f '" + remoteSDKLink + "' && " +
                    "ln -s '" + remoteServer.getSdkDir().getPath() + "' '" + remoteSDKLink + "'");

        } else {
            final Path sdkLink = getLocalSDKLink();
            try {
                Files.deleteIfExists(sdkLink);
                Files.createSymbolicLink(sdkLink, getMoeSDK().getRoot().toPath());
            } catch (IOException e) {
                throw new GradleException("Failed to create symlink to " + sdkLink);
            }
        }
    }
}
