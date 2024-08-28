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

import org.gradle.api.Project;
import org.gradle.api.tasks.Input;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XcodeBuild extends BaseTask {

    private Map<String, String> envMap = new HashMap<>();

    private List<String> buildOpts = new ArrayList<>();

    private String configuration;

    @Input
    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    private String target;

    @Input
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    private String sdk;

    @Input
    public String getSdk() {
        return sdk;
    }

    public void setSdk(String sdk) {
        this.sdk = sdk;
    }

    public XcodeBuild env(String key, String value) {
        envMap.put(key, value);
        return this;
    }

    public XcodeBuild cond_buildopt(Object condAndValue, String key) {
        if (condAndValue != null) {
            buildOpts.add(key + "=" + condAndValue.toString());
        }
        return this;
    }

    public XcodeBuild cond_buildopt(boolean cond, String key, String value) {
        if (cond) {
            buildOpts.add(key + "=" + value);
        }
        return this;
    }

    @Override
    protected File logFile() {
        return getProject().file("build/" + getTarget() + "-" + getConfiguration() + "-" + getSdk() + ".log");
    }

    @Override
    protected void executeImpl() {
        final Path repoRoot = getProject().getRootProject().file("../..").toPath();
        final SplitOutputStream output = new SplitOutputStream(getLog(), new XcodeOutputStream(repoRoot));
        exec(spec -> {
            spec.setExecutable("xcodebuild");
            spec.args("-project", getProject().file(getProject().getName() + ".xcodeproj").getAbsolutePath());
            spec.args("-configuration", getConfiguration());
            spec.args("-sdk", getSdk());
            spec.args("-target", getTarget());
            spec.args(buildOpts);
            spec.setStandardOutput(output);
            spec.setErrorOutput(output);
            spec.getEnvironment().putAll(envMap);
        });
    }

    public static XcodeBuild createTask(Project project, String target, String platform, String sdk,
            String configuration) {
        return createTask(project, target, platform, sdk, configuration, Collections.emptyMap());
    }

    public static XcodeBuild createTask(Project project, String target, String platform, String sdk,
            String configuration, Map<String, Object> deps) {
        // Construct name
        String name = "build";
        name += "_" + target;
        name += "_" + platform;
        name += "_" + sdk;
        name += "_" + configuration.toLowerCase();

        // Create task
        final XcodeBuild task = project.getTasks().create(name, XcodeBuild.class, xcodeBuild -> {
            xcodeBuild.setConfiguration(configuration + "-" + platform);
            xcodeBuild.setTarget(target);
            xcodeBuild.setSdk(sdk);
        });

        // Calculate dependencies
        final List projects = (List)deps.get("projects");
        if (projects != null) {
            for (Object _project : projects) {
                String p = (String)_project;
                String t;
                if (p.contains("@")) {
                    t = p.substring(p.lastIndexOf('@') + 1);
                    p = p.substring(0, p.lastIndexOf('@'));
                } else {
                    t = p.substring(p.lastIndexOf('.') + 1);
                }

                String n = "build";
                n += "_" + t;
                n += "_" + platform;
                n += "_" + sdk;
                n += "_" + configuration.toLowerCase();
                task.dependsOn(p + ":" + n);
            }
        }

        return task;
    }

    private class XcodeOutputStream extends OutputStream {

        final ByteArrayOutputStream buffer;
        private final Path repoRoot;

        public XcodeOutputStream(Path repoRoot) {
            this.repoRoot = repoRoot;
            buffer = new ByteArrayOutputStream(1024);
            captureFailures = false;
        }

        @Override
        public void write(int b) throws IOException {
            try {
                if (b == '\n') {
                    process();
                } else {
                    buffer.write(b);
                }
            } catch (Throwable ignore) {
                // Never fail the build because of pretty logging!!!
            }
        }

        @Override
        public void write(byte[] b, final int off, final int len) throws IOException {
            try {
                int start = off;
                int end = off;
                for (int i = 0; i < len; i++) {
                    byte c = b[i];
                    if (c == '\n') {
                        buffer.write(b, start, end - start);
                        process();
                        start = end + 1;
                    }
                    ++end;
                }
                buffer.write(b, start, end - start);
            } catch (Throwable ignore) {
                // Never fail the build because of pretty logging!!!
            }
        }

        boolean captureFailures;

        private void process() {
            final String line = buffer.toString().replaceAll(" ", "\u241E").replaceAll("\\\\\u241E", " ");
            buffer.reset();

            final String output = processLine(line, true);
            if (output != null) {
                if (captureFailures) {
                    getProject().getLogger().error("    Failed: " + output);
                } else {
                    getProject().getLogger().info("    " + output);
                }
            }
        }

        private String processLine(String line, boolean topLevel) {
            if (line.startsWith("CompileC\u241E")) {
                final String[] split = line.split("\u241E");
                final Path relative = repoRoot.relativize(new File(split[2]).toPath());
                return "CompileC " + split[4] + " " + relative;

            } else if (line.startsWith("Libtool\u241E")) {
                final String[] split = line.split("\u241E");
                final File file = new File(split[1]);
                return "Libtool " + split[3] + " " + file.getName();

            } else if (line.startsWith("Ld\u241E")) {
                final String[] split = line.split("\u241E");
                final File file = new File(split[1]);
                return "Ld " + split[3] + " " + file.getName();

            } else if (line.startsWith("CreateUniversalBinary\u241E")) {
                final String[] split = line.split("\u241E");
                final File file = new File(split[1]);
                return "CreateUniversalBinary " + split[3] + " " + file.getName();

            } else if (line.startsWith("GenerateDSYMFile\u241E")) {
                final String[] split = line.split("\u241E");
                final File file = new File(split[1]);
                return "GenerateDSYMFile " + file.getName();

            } else if ("The\u241Efollowing\u241Ebuild\u241Ecommands\u241Efailed:".equals(line)) {
                captureFailures = true;
                return null;

            } else if (topLevel && captureFailures && line.startsWith("\t")) {
                final String subline = line.substring(1);
                final String processLine = processLine(subline, false);
                if (processLine == null) {
                    return subline;
                }
                return processLine;

            }

            return null;
        }

        @Override
        public void close() throws IOException {
            process();
        }
    }
}
