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
import java.util.Map;

/**
 * This class collects the standard output of an exec object.
 */
public class ExecOutputCollector {

    /**
     * Creates a new ExecOutputCollector instance.
     */
    private ExecOutputCollector() {

    }

    /**
     * Collects the standard output of the specified exec object.
     *
     * @param exec Exec to run
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(AbstractExec exec) throws IOException, InterruptedException {
        return collect(exec, null);
    }

    /**
     * Collects the standard output of the specified exec object.
     *
     * @param exec Exec to run
     * @param env  Environment to run the exec in
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(AbstractExec exec, Map<String, String> env) throws IOException, InterruptedException {
        return collect(exec, env, false);
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param exec          Exec to run
     * @param inheritOutput Whether delegate the subprocess stdout and stderr to current Java process
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(AbstractExec exec, boolean inheritOutput) throws IOException, InterruptedException {
        return collect(exec, null, inheritOutput);
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param exec          Exec to run
     * @param env           Environment to run the exec in
     * @param inheritOutput Whether delegate the subprocess stdout and stderr to current Java process
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(AbstractExec exec, Map<String, String> env, boolean inheritOutput) throws IOException, InterruptedException {
        ExecRunner runner = exec.getRunner();
        String output = collect(runner, env, inheritOutput);
        return output;
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param runner ExecRunner to run
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(ExecRunner runner) throws IOException, InterruptedException {
        return collect(runner, null);
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param runner ExecRunner to run
     * @param env    Environment to run the exec in
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(ExecRunner runner, Map<String, String> env) throws IOException, InterruptedException {
        return collect(runner, env, false);
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param runner        ExecRunner to run
     * @param inheritOutput Whether delegate the subprocess stdout and stderr to current Java process
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(ExecRunner runner, boolean inheritOutput) throws IOException, InterruptedException {
        return collect(runner, null, inheritOutput);
    }

    /**
     * Collects the standard output of the specified ExecRunner.
     *
     * @param runner        ExecRunner to run
     * @param env           Environment to run the exec in
     * @param inheritOutput Whether delegate the subprocess stdout and stderr to current Java process
     * @return Standard output
     * @throws IOException          if an I/O error occurs
     * @throws InterruptedException if the operation was interrupted
     */
    public static String collect(ExecRunner runner, Map<String, String> env, boolean inheritOutput) throws IOException, InterruptedException {

        final StringBuilder out = new StringBuilder();
        final StringBuilder err = new StringBuilder();

        runner.setListener(new ExecRunnerBase.ExecRunnerListener() {
            @Override
            public void stdout(String line) {
                if (inheritOutput) {
                    System.out.println(line);
                }
                out.append(line).append("\n");
            }

            @Override
            public void stderr(String line) {
                if (inheritOutput) {
                    System.err.println(line);
                }
                err.append(line).append("\n");
            }
        });

        if (env != null) {
            final Map<String, String> environment = runner.getBuilder().environment();
            for (Map.Entry<String, String> entry : env.entrySet()) {
                environment.put(entry.getKey(), entry.getValue());
            }
        }

        int rc = runner.run(null);
        if (rc != 0) {
            if (runner.wasKilled()) {
                throw new IOException("Execution of command '" + runner.commandLine() + "' was canceled by the user.");
            } else {
                throw new IOException(
                        "Execution of command '" + runner.commandLine() + "' failed with error code " + rc + "\n" + err
                                .toString());
            }
        }
        return out.toString();
    }
}
