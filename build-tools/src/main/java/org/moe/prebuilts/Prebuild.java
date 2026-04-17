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

import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.PathSensitive;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public abstract class Prebuild extends BaseTask {

    private final Map<String, String> envMap = new HashMap<>();

    private String sourcePath;

    @InputDirectory
    public File getSourceFile() {
        return sourcePath == null ? null : new File(getRepoRootDirectory().get().getAsFile(), sourcePath);
    }

    private String buildScript;

    private String targetName;

    @OutputDirectory
    public File getOutputDirectory() {
        if (sourcePath == null) return null;
        if (targetName == null) return null;
        return new File(getRootProjectDirectory().get().getAsFile(), sourcePath + "/build/" + targetName);
    }

    @Input
    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    @Input
    public String getBuildScript() {
        return buildScript;
    }

    public void setBuildScript(String buildScript) {
        this.buildScript = buildScript;
    }

    @Input
    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    @InputFiles
    @PathSensitive(PathSensitivity.RELATIVE)
    public abstract ConfigurableFileCollection getPreBuildFiles();

    public void env(String key, String value) {
        envMap.put(key, value);
    }

    @Override
    protected File logFile() {
        return getProjectLayout().getProjectDirectory().file("build/" + targetName + "-build.log").getAsFile();
    }

    @Override
    protected void executeImpl() {
        File workDir = getProjectLayout().getBuildDirectory().dir("prebuild-" + targetName).get().getAsFile();
        workDir.mkdirs();

        rsync(workDir);
        if (!getPreBuildFiles().isEmpty()) {
            getFileSystemOperations().copy(spec -> {
                spec.into(workDir);
                spec.from(getPreBuildFiles());
            });
        }
        runBuildScript(workDir);
    }

    private void rsync(File workDir) {
        exec(spec -> {
            spec.setExecutable("rsync");
            spec.args("-aL", "--delete",
                    getSourceFile().getAbsolutePath() + "/",
                    workDir.getAbsolutePath() + "/");
        });
    }

    private void runBuildScript(File workDir) {
        final File scriptFile = new File(workDir, buildScript);
        if (!scriptFile.canExecute()) {
            scriptFile.setExecutable(true);
        }

        exec(spec -> {
            spec.setWorkingDir(workDir);

            spec.environment("MOE_PREBUILTS_DIR", getRootProjectDirectory().get().getAsFile().toString());
            spec.environment("MOE_PREBUILTS_TARGET_DIR", sourcePath + "/build/" + targetName);
            spec.getEnvironment().putAll(envMap);

            spec.setExecutable("bash");
            spec.args(buildScript);
        });
    }
}
