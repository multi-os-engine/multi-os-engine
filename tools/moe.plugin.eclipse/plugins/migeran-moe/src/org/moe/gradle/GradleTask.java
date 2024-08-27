/*
 * Copyright (C) 2016 Migeran
 *
 * Licensed under the Eclipse Public License, Version 1.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.eclipse.org/org/documents/epl-v10.php
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.moe.gradle;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase.ExecRunnerListener;
import org.moe.common.exec.GradleExec;
import org.moe.common.exec.IKillListener;

public class GradleTask {

	private ExecRunner runner;
	private IProgressMonitor monitor;
	private StringBuffer buffer;
	private IConsole messageConsole;

	public GradleTask(File directory, String command, List<String> arguments, IProgressMonitor monitor)
			throws IOException {
		this.monitor = monitor;

		GradleExec exec = new GradleExec(directory);
		exec.getArguments().add(command);

		if (arguments != null) {
			exec.getArguments().addAll(arguments);
		}

		this.runner = exec.getRunner();
		runner.getBuilder().directory(directory);

		this.buffer = new StringBuffer();

		runner.setListener(new ExecRunnerListener() {

			@Override
			public void stdout(String line) {
				buffer.append(line);
				buffer.append("\n");
				if (messageConsole != null) {
					messageConsole.write(line);
				}
			}

			@Override
			public void stderr(String line) {
				buffer.append(line);
				buffer.append("\n");
				if (messageConsole != null) {
					messageConsole.write(line);
				}
			}
		});

	}

	public int run() throws IOException {
		return runner.run(new IKillListener() {

			@Override
			public boolean needsKill() {
				if (monitor != null) {
					return monitor.isCanceled();
				}
				return false;
			}
		});
	}

	public String getOutput() {
		return buffer.toString();
	}

	public void setMessageConsole(IConsole console) {
		this.messageConsole = console;
	}

	public ExecRunner getRunner() {
		return runner;
	}

}
