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

package org.moe.prebuilts;

import org.gradle.api.GradleException;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Script extends BaseTask {

    private final Map<String, String> envMap = new HashMap<>();

    private String tempWorkDir;

    private final List<Step> steps = new ArrayList<>();

    private String failureMessage;

    @Input
    public List<Step> getSteps() {
        return steps;
    }

    @Override
    protected File logFile() {
        return getProjectLayout().getProjectDirectory().file("build/" + getName() + ".log").getAsFile();
    }

    @Override
    protected void executeImpl() {
        for (Step step : steps) {
            step.run(this);
        }
    }

    public String checkDir(String path) {
        final File file = getProjectLayout().getProjectDirectory().file(path).getAsFile();
        if (!file.exists() || !file.isDirectory()) {
            throw new GradleException("Directory doesn't exist! " + file.getAbsolutePath());
        }
        return file.getAbsolutePath();
    }

    public void env(String key, String value) {
        envMap.put(key, value);
    }

    public void unset(String key) {
        envMap.remove(key);
    }

    public void setWorkDir(String tempWorkDir) {
        if (tempWorkDir == null) {
            throw new NullPointerException();
        }
        this.tempWorkDir = "build/" + tempWorkDir;
        getProjectLayout().getProjectDirectory().file(this.tempWorkDir).getAsFile().mkdirs();
    }

    public void setRawWorkDir(String tempWorkDir) {
        if (tempWorkDir == null) {
            throw new NullPointerException();
        }
        this.tempWorkDir = tempWorkDir;
        getProjectLayout().getProjectDirectory().file(this.tempWorkDir).getAsFile().mkdirs();
    }

    @Internal
    public File getWorkDir() {
        if (tempWorkDir == null) {
            throw new GradleException("workDir is not set");
        }
        return getProjectLayout().getProjectDirectory().file(tempWorkDir).getAsFile();
    }

    @Input
    @Optional
    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public void download(String target, String url) {
        final File targetFile = new File(getWorkDir(), target);
        if (!targetFile.exists()) {
            exec("curl", "-L", "-o", target, "--fail", url);
        }
    }

    public void mkdir(String path) {
        exec("mkdir", "-p", path);
    }

    public void progress(String msg) {
        steps.add(new ProgressStep(msg));
    }

    public void rsync(File from, File to) {
        exec("rsync",
                "-aL",
                "--delete",
                from.getAbsolutePath() + "/",
                to.getAbsolutePath() + "/"
        );
    }

    public void exec(String exec, String... args) {
        exec(exec, Arrays.asList(args));
    }

    public void exec(String exec, Iterable<String> args) {
        final ArrayList<String> argsCopy = new ArrayList<>();
        for (String a : args) {
            argsCopy.add(a);
        }
        steps.add(new ExecStep(exec, argsCopy, getWorkDir(),
                new HashMap<>(this.envMap), this.failureMessage));
        this.failureMessage = null;
    }

    public interface Step extends Serializable {
        void run(Script script);
    }

    public static final class ProgressStep implements Step {
        private static final long serialVersionUID = 1L;
        private final String message;

        public ProgressStep(String message) {
            this.message = message;
        }

        @Override
        public void run(Script script) {
            System.out.println("> " + message);
        }
    }

    public static final class ExecStep implements Step {
        private static final long serialVersionUID = 1L;
        private final String executable;
        private final List<String> args;
        private final File workDir;
        private final Map<String, String> envMap;
        private final String failureMessage;

        public ExecStep(String executable, List<String> args, File workDir,
                        Map<String, String> envMap, String failureMessage) {
            this.executable = executable;
            this.args = args;
            this.workDir = workDir;
            this.envMap = envMap;
            this.failureMessage = failureMessage;
        }

        @Override
        public void run(Script script) {
            try {
                script.exec(spec -> {
                    workDir.mkdirs();
                    spec.workingDir(workDir);
                    spec.setExecutable(executable);
                    spec.args(args);
                    spec.getEnvironment().putAll(envMap);
                });
            } catch (Throwable t) {
                if (failureMessage != null) {
                    System.err.println(failureMessage);
                }
                throw t;
            }
        }
    }
}
