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

public abstract class AbstractExec {

	private String name = null;

    private int returnCode;

	private final ArrayList<String> arguments = new ArrayList<String>();

	protected File workingDir = null;

	public AbstractExec() {
		// Do nothing
	}

	public AbstractExec(String name, File workingDir) {
		this.name = name;
		this.workingDir = workingDir;
	}

	public ArrayList<String> getArguments() {
		return arguments;
	}

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public int getReturnCode() {
        return returnCode;
    }

	abstract protected String lookupExec();

	public String getExecPath() {
		if (name != null) {
			return name;
		}
		return lookupExec();
	}

	public ExecRunner getRunner() throws IOException {
		ArrayList<String> cmds = new ArrayList<String>(
				getArguments().size() + 1);
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

	protected void applyArguments(ArrayList<String> cmds) {
		cmds.addAll(getArguments());
	}
}
