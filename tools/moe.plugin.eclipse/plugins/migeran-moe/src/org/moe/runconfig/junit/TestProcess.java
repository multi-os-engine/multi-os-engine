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

package org.moe.runconfig.junit;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IStreamsProxy;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.moe.runconfig.ApplicationManager;

public class TestProcess implements IProcess {

	private MOERemoteTestRunner testRunner;
	private ApplicationManager manager;
	private VMRunnerConfiguration configuration;

	public TestProcess(VMRunnerConfiguration configuration, ApplicationManager manager) {
		this.configuration = configuration;
		this.manager = manager;
	}

	@Override
	public <T> T getAdapter(Class<T> arg0) {
		return null;
	}

	@Override
	public boolean canTerminate() {
		return true;
	}

	@Override
	public boolean isTerminated() {
		return false;
	}

	@Override
	public void terminate() throws DebugException {
		if (testRunner != null) {
			testRunner.stop();
		}
	}

	@Override
	public String getAttribute(String arg0) {
		return null;
	}

	@Override
	public int getExitValue() throws DebugException {
		return 0;
	}

	@Override
	public String getLabel() {
		return "JUnit test";
	}

	@Override
	public ILaunch getLaunch() {
		return manager.getLaunch();
	}

	@Override
	public IStreamsProxy getStreamsProxy() {
		return null;
	}

	@Override
	public void setAttribute(String arg0, String arg1) {

	}

	public void run() throws Exception {
		testRunner = new MOERemoteTestRunner();
		testRunner.runTests(configuration.getProgramArguments(), manager);
	}
}
