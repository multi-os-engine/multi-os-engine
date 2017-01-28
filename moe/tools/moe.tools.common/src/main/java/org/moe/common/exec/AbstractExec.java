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
import java.util.ArrayList;

/**
 * Base class for executables.
 */
public abstract class AbstractExec {

    /**
     * Exec name.
     */
    private String name = null;

    /**
     * Return code.
     */
    private int returnCode;

    /**
     * Arguments.
     */
    private final ArrayList<String> arguments = new ArrayList<String>();

    /**
     * Working directory.
     */
    protected File workingDir = null;

    /**
     * Creates a new AbstractExec instance.
     */
    public AbstractExec() {
        // Do nothing
    }

    /**
     * Creates a new AbstractExec instance.
     *
     * @param name       Exec name
     * @param workingDir Working directory
     */
    public AbstractExec(String name, File workingDir) {
        this.name = name;
        this.workingDir = workingDir;
    }

    /**
     * Returns the arguments.
     *
     * @return Arguments list
     */
    public ArrayList<String> getArguments() {
        return arguments;
    }

    /**
     * Sets the return code.
     *
     * @param returnCode Return code
     */
    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    /**
     * Returns the return code.
     *
     * @return Return code
     */
    public int getReturnCode() {
        return returnCode;
    }

    /**
     * Looks up the executable.
     *
     * @return Exec path
     */
    abstract protected String lookupExec();

    /**
     * Returns the executable's path.
     *
     * @return executable's path
     */
    public String getExecPath() {
        if (name != null) {
            return name;
        }
        return lookupExec();
    }

    /**
     * Returns an ExecRunner for this exec configuration.
     *
     * @return ExecRunner
     * @throws IOException if an I/O error occurs
     */
    public ExecRunner getRunner() throws IOException {
        ArrayList<String> cmds = new ArrayList<String>(getArguments().size() + 1);
        String exec = getExecPath();
        if (exec == null) {
            throw new IOException("exec is null");
        }
        if (OsUtils.isMac()) {
            try {
                File execFile = new File(exec);
                if (execFile.exists() && !execFile.canExecute()) {
                    Runtime.getRuntime().exec("chmod 777 " + exec);
                }
            } catch (Exception e) {
            }
        }
        cmds.add(exec);
        applyArguments(cmds);
        ProcessBuilder builder = new ProcessBuilder(cmds);
        builder.directory(workingDir);
        return new ExecRunner(builder);
    }

    /**
     * Appends all arguments from the specified list.
     *
     * @param cmds Arguments list
     */
    protected void applyArguments(ArrayList<String> cmds) {
        cmds.addAll(getArguments());
    }
}
