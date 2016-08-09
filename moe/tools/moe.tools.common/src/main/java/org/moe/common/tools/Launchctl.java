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

package org.moe.common.tools;

import org.moe.common.exec.ExecOutputCollector;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.SimpleExec;

import java.util.List;

public class Launchctl {
    private static final String LAUNCHCTL = "launchctl";
    private int lastExitCode;

    private enum Cmd {
        List("list"),
        Remove("remove"),
        Print("print");

        private final String cmd;

        Cmd(String cmd) {
            this.cmd = cmd;
        }

        public String cmd() {
            return cmd;
        }
    }

    public int lastExitCode() {
        return this.lastExitCode;
    }

    public String list() throws RuntimeException {
        return runCommand(Cmd.List);
    }

    public String remove(String serviceName) throws RuntimeException {
        return runCommand(Cmd.Remove, new String[]{serviceName});
    }

    public String print(String args) throws RuntimeException {
        return runCommand(Cmd.Print, new String[]{args});
    }

    private String runCommand(Cmd command) {
        return runCommand(command, null);
    }

    private String runCommand(Cmd command, String[] args) {
        SimpleExec exec = SimpleExec.getExec(LAUNCHCTL);
        List<String> execArgs = exec.getArguments();
        execArgs.add(command.cmd());

        if (args != null) {
            for (String arg : args) {
                execArgs.add(arg);
            }
        }

        String output;
        try {
            output = ExecOutputCollector.collect(exec);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        lastExitCode = exec.getReturnCode();

        if (lastExitCode != 0) {
            throw new RuntimeException("Error launching " + LAUNCHCTL + " [" + command.cmd() + "]: " + output + " Error code: " + lastExitCode);
        }

        return output;
    }
}
