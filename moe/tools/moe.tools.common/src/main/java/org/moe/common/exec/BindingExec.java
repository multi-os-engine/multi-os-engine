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

package org.moe.common.exec;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * NatJGen exec.
 */
public class BindingExec extends AbstractExec {

    /**
     * Is test run flag.
     */
    private boolean test;

    /**
     * Creates a BindingExec executable.
     * @param projectFile Project file
     * @param sdkPath SDK path
     * @param confFile Configuration file
     * @param test Is test run flag
     * @throws IOException if an I/O error occurs
     */
    public BindingExec(File projectFile, String sdkPath, File confFile, boolean test) throws IOException {
        super(null, new File(sdkPath + File.separator + "tools"));
        this.test = test;
        getArguments().add(projectFile.getParent());
        getArguments().add(projectFile.getName());
        getArguments().add(confFile.getCanonicalPath());
    }

    public ExecRunner getRunner() throws IOException {
        ArrayList<String> cmds = new ArrayList<String>();
        cmds.add("java");
        if (test) {
            cmds.add("-Dmoe.natjgen.testrun=true");
        }
        cmds.add("-jar");
        cmds.add("wrapnatjgen.jar");
        applyArguments(cmds);
        ProcessBuilder builder = new ProcessBuilder(cmds);
        builder.directory(workingDir);
        /*if (test) {
            builder.environment().put("moe.natjgen.testrun", "true");
        }*/
        return new ExecRunner(builder);
    }

    @Override
    protected String lookupExec() {
        return "";
    }
}
