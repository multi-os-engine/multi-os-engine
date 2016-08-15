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

public class ExecOutputCollector {

	private ExecOutputCollector() {

	}

    public static String collect(AbstractExec exec) throws IOException,
            InterruptedException {
        return collect(exec, null);
    }

    public static String collect(AbstractExec exec, Map<String, String> env) throws IOException,
            InterruptedException {
        ExecRunner runner = exec.getRunner();
        String output = collect(runner, env);
        return output;
    }

    public static String collect(ExecRunner runner) throws IOException,
            InterruptedException {
        return collect(runner, null);
    }

	public static String collect(ExecRunner runner, Map<String, String> env) throws IOException,
			InterruptedException {

		final StringBuilder out = new StringBuilder();
		final StringBuilder err = new StringBuilder();

		runner.setListener(new ExecRunnerBase.ExecRunnerListener() {
            @Override
            public void stdout(String line) {
                out.append(line).append("\n");
            }

            @Override
            public void stderr(String line) {
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
                throw new IOException("Execution of command '" + runner.commandLine() + "' failed with error code " + rc + "\n" + err.toString());
            }
        }
		return out.toString();
	}
}
