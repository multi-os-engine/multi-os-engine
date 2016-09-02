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

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Script extends BaseTask {

    private Map<String, String> envMap = new HashMap<>();

    private String tempWorkDir;

    private List<Runnable> runnables = new ArrayList<>();

    @Override
    protected File logFile() {
        return getProject().file("build/" + getName() + ".log");
    }

    @Override
    protected void executeImpl() {
        for (Runnable runnable : runnables) {
            runnable.run();
        }
    }

    public String checkDir(String path) {
        final File file = getProject().file(path);
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
    }

    public void setRawWorkDir(String tempWorkDir) {
        if (tempWorkDir == null) {
            throw new NullPointerException();
        }
        this.tempWorkDir = tempWorkDir;
    }

    public File getWorkDir() {
        if (tempWorkDir == null) {
            throw new GradleException("workDir is not set");
        }
        return getProject().file(tempWorkDir);
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
        runnables.add(() -> System.out.println("> " + msg));
    }

    public void exec(String exec, String... args) {
        exec(exec, Arrays.asList(args));
    }

    public void exec(String exec, Iterable<String> args) {
        final File workDir = getWorkDir();
        final HashMap<String, String> envMap = new HashMap<>(this.envMap);
        runnables.add(() -> exec(spec -> {
            getProject().mkdir(workDir);
            spec.workingDir(workDir);

            spec.setExecutable(exec);
            spec.args(args);
            spec.getEnvironment().putAll(envMap);
        }));
    }
}
