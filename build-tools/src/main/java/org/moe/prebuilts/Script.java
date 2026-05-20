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
import org.gradle.api.tasks.CacheableTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.internal.impldep.org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Collectors;

@CacheableTask
public abstract class Script extends BaseTask {

    private final Map<String, String> envMap = new HashMap<>();
    private final Map<String, String> roots = new HashMap<>();

    private String tempWorkDir;

    private final List<Step> steps = new ArrayList<>();

    private String failureMessage;

    public void registerRoot(String alias, File path) {
        if (roots.containsKey(alias))
            throw new GradleException("Duplicate alias " + alias);
        roots.put(alias, path.toPath().normalize().toString());
    }
    
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
        requirePortable(value);
        envMap.put(key, value);
    }

    public void unset(String key) {
        envMap.remove(key);
    }

    public void setWorkDir(String tempWorkDir) {
        if (tempWorkDir == null)
            throw new NullPointerException();
        requirePortable(tempWorkDir);
        File f = getProjectLayout().getProjectDirectory().file("build/" + tempWorkDir).getAsFile();
        this.tempWorkDir = rel(f);
    }

    public void setRawWorkDir(String tempWorkDir) {
        if (tempWorkDir == null)
            throw new NullPointerException();
        requirePortable(tempWorkDir);
        this.tempWorkDir = rel(tempWorkDir);
    }

    public void setRawWorkDir(File f) {
        this.tempWorkDir = rel(f);
    }

    @Internal
    public File getWorkDir() {
        if (tempWorkDir == null) {
            throw new GradleException("workDir is not set");
        }
        return new File(unwrap(tempWorkDir));
    }

    @Internal
    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public void download(String target, String url, String sha256) {
        requirePortable(target);
        if (tempWorkDir == null) {
            throw new GradleException("workDir is not set");
        }
        steps.add(new DownloadStep(target, url, sha256, tempWorkDir));
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
                "--exclude=.git",
                rel(from) + "/",
                rel(to) + "/"
        );
        // Embed the source's real git directory in the rsync target. Submodules use
        // a .git pointer FILE that rsync can't follow. Without this, downstream tools
        // like mx's libffi patch step lose history and walk up to the parent moe
        // repo's .gitignore, silently skipping patched files under build/.
        exec("bash", "-c",
                "set -e; " +
                "src_gitdir=$(git -C \"" + rel(from) + "\" rev-parse --absolute-git-dir); " +
                "rm -rf \"" + rel(to) + "/.git\"; " +
                "cp -RL \"$src_gitdir\" \"" + rel(to) + "/.git\"; " +
                // Strip core.worktree via sed, NOT via `git config --unset` — the
                // worktree value is a relative path back to the original submodule
                // location, which is broken after cp, and `git config` itself errors
                // trying to chdir into that broken path before reading config.
                "sed -i '' '/^[[:space:]]*worktree[[:space:]]*=/d' \"" + rel(to) + "/.git/config\""
        );
    }

    public void copyFile(File from, File to) {
        copyFile(new FixedFileSource(rel(from)), to);
    }

    public void copyFile(FileSource from, File to) {
        steps.add(new CopyFileStep(from, rel(to)));
    }

    public FirstMatchingSubdirFile firstMatchingSubdir(File baseDir, String subdirPrefix, String relativePath) {
        return new FirstMatchingSubdirFile(rel(baseDir), subdirPrefix, relativePath);
    }

    public void exec(String exec, String... args) {
        exec(exec, Arrays.asList(args));
    }

    public void exec(String exec, List<String> args) {
        requirePortable(exec);
        args.forEach(this::requirePortable);

        if (tempWorkDir == null) {
            throw new GradleException("workDir is not set");
        }
        steps.add(new ExecStep(exec, args, tempWorkDir,
                new TreeMap<>(this.envMap), this.failureMessage));
        this.failureMessage = null;
    }

    /**
     * Relativize a file to declared roots
     */
    public String rel(File f) {
        Path abs = f.toPath().normalize();
        for (var e : roots.entrySet()) {
            Path root = Path.of(e.getValue());
            if (abs.equals(root))
                return "$" + e.getKey();
            if (abs.startsWith(root))
                return "$" + e.getKey() + "/" + root.relativize(abs);
        }
        return abs.toString();
    }

    /**
     * Relativize a file if it lives in the project
     */
    public String rel(String path) {
        return rel(getProjectLayout().getProjectDirectory().file(path).getAsFile());
    }

    /** Substitute the root template back to an absolute path. */
    private String unwrap(String s) {
        if (s == null) return null;
        for (var e : roots.entrySet()) {
            s = s.replace("$" + e.getKey(), e.getValue());
        }
        return s;
    }

    /**
     * Throw at config time if {@code s} contains a root abs path.
     */
    private void requirePortable(String s) {
        if (s == null)
            return;
        for (var e : roots.entrySet()) {
            if (s.contains(e.getValue())) {
                throw new GradleException(
                        "Script value contains an absolute path:\n  " + s + "\n"
                                + "Use rel(...) to make it portable.");
            }
        }
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
        private final String workDir;
        private final TreeMap<String, String> envMap;
        private final String failureMessage;

        public ExecStep(String executable, List<String> args, String workDir,
                        TreeMap<String, String> envMap, String failureMessage) {
            this.executable = executable;
            this.args = args;
            this.workDir = workDir;
            this.envMap = envMap;
            this.failureMessage = failureMessage;
        }

        @Override
        public void run(Script script) {
            File resolvedWorkDir = new File(script.unwrap(workDir));
            String resolvedExec = script.unwrap(executable);
            List<String> resolvedArgs = args.stream().map(script::unwrap).toList();
            Map<String, String> resolvedEnv = envMap.entrySet().stream()
                    .collect(Collectors.toMap(Entry::getKey, entry -> script.unwrap(entry.getValue())));
            try {
                script.exec(spec -> {
                    resolvedWorkDir.mkdirs();
                    spec.workingDir(resolvedWorkDir);
                    spec.setExecutable(resolvedExec);
                    spec.args(resolvedArgs);
                    spec.getEnvironment().putAll(resolvedEnv);
                });
            } catch (Throwable t) {
                if (failureMessage != null) {
                    System.err.println(failureMessage);
                }
                throw t;
            }
        }
    }

    public interface FileSource extends Serializable {
        File resolve(Script script);
    }

    public static final class FixedFileSource implements FileSource {
        private static final long serialVersionUID = 1L;
        private final String pathSentinel;

        public FixedFileSource(String pathSentinel) {
            this.pathSentinel = pathSentinel;
        }

        @Override
        public File resolve(Script script) {
            return new File(script.unwrap(pathSentinel));
        }
    }

    public static final class FirstMatchingSubdirFile implements FileSource {
        private static final long serialVersionUID = 1L;
        private final String baseDirSentinel;
        private final String subdirPrefix;
        private final String relativePath;

        public FirstMatchingSubdirFile(String baseDirSentinel, String subdirPrefix, String relativePath) {
            this.baseDirSentinel = baseDirSentinel;
            this.subdirPrefix = subdirPrefix;
            this.relativePath = relativePath;
        }

        @Override
        public File resolve(Script script) {
            File baseDir = new File(script.unwrap(baseDirSentinel));
            File subdir = baseDir.listFiles((d, name) -> name.startsWith(subdirPrefix))[0];
            return new File(subdir, relativePath);
        }
    }

    public static final class CopyFileStep implements Step {
        private static final long serialVersionUID = 1L;
        private final FileSource from;
        private final String toSentinel;

        public CopyFileStep(FileSource from, String toSentinel) {
            this.from = from;
            this.toSentinel = toSentinel;
        }

        @Override
        public void run(Script script) {
            File src = from.resolve(script);
            File dest = new File(script.unwrap(toSentinel));
            script.getFileSystemOperations().copy(spec -> {
                spec.from(src);
                spec.rename(name -> dest.getName());
                spec.into(dest.getParentFile());
            });
        }
    }

    public static final class DownloadStep implements Step {
        private static final long serialVersionUID = 1L;
        private final String target;
        private final String url;
        private final String sha256;
        private final String workDir;

        public DownloadStep(String target, String url, String sha256, String workDir) {
            this.target = target;
            this.url = url;
            this.sha256 = sha256.toLowerCase();
            this.workDir = workDir;
        }

        @Override
        public void run(Script script) {
            File resolvedWorkDir = new File(script.unwrap(workDir));
            File targetFile = new File(resolvedWorkDir, target);

            if (targetFile.exists()) {
                String actual = sha256(targetFile);
                if (actual.equals(sha256))
                    return;
                System.out.println("> hash mismatch for " + target + ", re-downloading");
                targetFile.delete();
            }

            resolvedWorkDir.mkdirs();
            script.exec(spec -> {
                spec.workingDir(resolvedWorkDir);
                spec.setExecutable("curl");
                spec.args("-L", "-o", target, "--fail", url);
            });

            String actual = sha256(targetFile);
            if (!actual.equals(sha256)) {
                targetFile.delete();
                throw new GradleException(
                        "Hash mismatch for " + url + "\n  expected: " + sha256 + "\n  actual:   " + actual);
            }
        }

        private static String sha256(File f) {
            try (var in = new FileInputStream(f)) {
                return DigestUtils.sha256Hex(in);
            } catch (IOException e) {
                throw new GradleException("Failed to hash " + f, e);
            }
        }
    }
}
