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
import org.gradle.api.file.ConfigurableFileCollection;
import org.gradle.api.provider.Property;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.InputDirectory;
import org.gradle.api.tasks.InputFiles;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.OutputDirectory;
import org.gradle.api.tasks.PathSensitivity;
import org.gradle.api.tasks.PathSensitive;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class Prebuild extends BaseTask {

    private final Map<String, String> envMap = new HashMap<>();

    private String sourcePath;

    @InputDirectory
    public File getSourceFile() {
        return sourcePath == null ? null : new File(getRepoRootDirectory().get().getAsFile(), sourcePath);
    }

    private int ramdiskSizeMB = 256;

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
    public int getRamdiskSizeMB() {
        return ramdiskSizeMB;
    }

    public void setRamdiskSizeMB(int ramdiskSizeMB) {
        this.ramdiskSizeMB = ramdiskSizeMB;
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

    @Internal
    public abstract Property<Boolean> getDontUnmount();

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
        mount();
    }

    private void mount() {
        if (ramdiskSizeMB <= 0) {
            throw new GradleException("Ramdisk size must be a positive number");
        }

        final AtomicReference<OutputStream> osr = new AtomicReference<>();

        // Create mountpoint
        exec(spec -> {
            spec.setExecutable("hdiutil");
            spec.args("attach", "-nomount", "ram://" + (ramdiskSizeMB * 2048));

            OutputStream os = new ByteArrayOutputStream();
            osr.set(os);
            spec.setStandardOutput(new SplitOutputStream(getLog(), os));
        });
        final String mountpoint = osr.get().toString().trim();

        // Mount
        final SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd-hhmmss");
        final String volname = "build-" + formatter.format(new Date());
        exec(spec -> {
            spec.setExecutable("diskutil");
            spec.args("erasevolume", "HFS+", volname, mountpoint);
        });
        final String path = "/Volumes/" + volname;

        try {
            rsync(path);
            if (!getPreBuildFiles().isEmpty()) {
                getFileSystemOperations().copy(spec -> {
                    spec.into(new File(path));
                    spec.from(getPreBuildFiles());
                });
            }
            runBuildScript(path);
        } finally {
            if (!getDontUnmount().get()) {
                exec(spec -> {
                    spec.setExecutable("diskutil");
                    spec.args("unmountDisk", mountpoint);
                    spec.setIgnoreExitValue(true);
                });
            }
        }
    }

    private void rsync(String ramdisk) {
        exec(spec -> {
            spec.setExecutable("rsync");
            spec.args("-r", "--exclude=.git", getSourceFile().getAbsolutePath() + "/", ramdisk + "/");
        });
    }

    private void runBuildScript(String ramdisk) {
        final File scriptFile = new File(ramdisk, buildScript);
        if (!scriptFile.canExecute()) {
            scriptFile.setExecutable(true);
        }

        exec(spec -> {
            spec.setWorkingDir(ramdisk);

            spec.environment("MOE_PREBUILTS_DIR", getRootProjectDirectory().get().getAsFile().toString());
            spec.environment("MOE_PREBUILTS_TARGET_DIR", sourcePath + "/build/" + targetName);
            spec.getEnvironment().putAll(envMap);

            spec.setExecutable("bash");
            spec.args(buildScript);
        });
    }
}
