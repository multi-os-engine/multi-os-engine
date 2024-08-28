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

import java.io.IOException;

/**
 * Executable runner.
 */
public class ExecRunner extends ExecRunnerBase {

    /**
     * Process builder.
     */
    private final ProcessBuilder builder;

    /**
     * Created a new ExecRunner instance.
     *
     * @param builder Process builder
     */
    ExecRunner(ProcessBuilder builder) {
        if (builder == null) {
            throw new NullPointerException();
        }
        this.builder = builder;
    }

    /**
     * Returns the ProcessBuilder.
     *
     * @return ProcessBuilder
     */
    public ProcessBuilder getBuilder() {
        return builder;
    }

    public synchronized int run(IKillListener killListener) throws IOException {
        Process process = execute();

        killChecker = new KillChecker(process, killListener);

        try {
            returnCode = process.waitFor();
            if (listener != null) {
                stdoutStreamListener.waitFor();
                stderrStreamListener.waitFor();
            }
            killChecker.waitFor();
            return returnCode;
        } catch (InterruptedException e) {
            throw new IOException("exec was interrupted", e);
        } catch (Exception e) {
            throw new IOException("Execution failure.", e);
        }
    }

    /**
     * Startes the process and stream listeners.
     *
     * @return Process instance
     * @throws IOException if an I/O error occurs
     */
    private Process execute() throws IOException {
        Process process = builder.start();

        if (listener != null) {
            stdoutStreamListener = new StdoutStreamListener(process.getInputStream(), listener);
            stderrStreamListener = new StderrStreamListener(process.getErrorStream(), listener);
        }

        return process;
    }

    /**
     * Composes the command line from the builder.
     *
     * @return Command line string
     */
    public String commandLine() {
        String command = "";
        for (String arg : builder.command()) {
            command += arg + ' ';
        }
        if (command.endsWith(" ")) {
            command = command.substring(0, command.length() - 1);
        }
        return command;
    }
}
