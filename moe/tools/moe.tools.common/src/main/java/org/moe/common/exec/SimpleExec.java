/*
Copyright 2014-2016 Intel Corporation

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

package org.moe.common.exec;

import org.moe.common.utils.OsUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Simple executable.
 */
public class SimpleExec extends AbstractExec {
    /**
     * OS specific lookup command.
     */
    static private String lookupCommand;

    static {
        if (OsUtils.isMac()) {
            lookupCommand = "which";
        } else if (OsUtils.isWindows()) {
            lookupCommand = "where";
        }
    }

    /**
     * Creates a new SimpleExec instance.
     *
     * @param name Exec name
     */
    private SimpleExec(String name) {
        super(name, null);
    }

    /**
     * Creates a new SimpleExec instance.
     *
     * @param name       Exec name
     * @param workingDir Working directory
     */
    private SimpleExec(String name, File workingDir) {
        super(name, workingDir);
    }

    @Override
    protected String lookupExec() {
        return null;
    }

    /**
     * Returns a new SimpleExec.
     *
     * @param name Exec name
     * @return SimpleExec instance
     */
    public static SimpleExec getExec(String name) {
        return new SimpleExec(name);
    }

    /**
     * Returns a new SimpleExec.
     *
     * @param name       Exec name
     * @param workingDir Working directory
     * @return SimpleExec instance
     */
    public static SimpleExec getExec(String name, File workingDir) {
        return new SimpleExec(name, workingDir);
    }

    /**
     * Returns a new SimpleExec for 'xcode-select'.
     *
     * @return SimpleExec instance
     */
    public static SimpleExec getXcodeSelect() {
        return getExec("xcode-select");
    }

    /**
     * Returns a new SimpleExec for the 'open' command.
     *
     * @param app  App to open with
     * @param file File to open
     * @return SimpleExec instance
     */
    public static SimpleExec getOpen(String app, String file) {
        SimpleExec exec = getExec("open");
        if (app != null) {
            exec.getArguments().add("-a");
            exec.getArguments().add(app);
        }
        if (file != null) {
            exec.getArguments().add(file);
        }
        return exec;
    }

    /**
     * Returns a new SimpleExec for the OS specific lookup command.
     *
     * @param app App to lookup
     * @return SimpleExec instance
     */
    public static SimpleExec getWhich(String app) {
        SimpleExec exec = getExec(lookupCommand);
        if (app != null) {
            exec.getArguments().add(app);
        }
        return exec;
    }

    /**
     * Returns a new SimpleExec for revealing a file in Finder.
     *
     * @param path File to reveal
     * @return SimpleExec instance
     */
    public static SimpleExec getRevealInFinder(String path) {
        if (path == null) {
            throw new NullPointerException();
        }
        SimpleExec exec = getExec("osascript");
        exec.getArguments().add("-e");
        exec.getArguments().add("tell application \"Finder\" to reveal POSIX file " + "\"" + path + "\"" + " activate");
        return exec;
    }

    /**
     * Run the exec with given args and return the output if successful
     *
     * @param exec Exec name
     * @param args Arguments passed to `exec`
     * @return The output of the exec
     */
    public static String exec(String exec, String... args) throws IOException, InterruptedException {
        SimpleExec e = getExec(exec);
        List<String> execArgs = e.getArguments();
        execArgs.addAll(Arrays.asList(args));

        return ExecOutputCollector.collect(e);
    }

}
