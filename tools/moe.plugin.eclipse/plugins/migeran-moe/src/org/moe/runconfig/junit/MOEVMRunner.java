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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.moe.runconfig.ApplicationManager;
import org.moe.utils.MessageFactory;

public class MOEVMRunner implements IVMRunner {

	private ApplicationManager manager;

	@Override
	public void run(VMRunnerConfiguration configuration, ILaunch launch, IProgressMonitor monitor)
			throws CoreException {

		TestProcess runnerProcess = new TestProcess(configuration, manager);
		launch.addProcess(runnerProcess);
		try {
			runnerProcess.run();
		} catch (CoreException ex) {
			throw ex;
		} catch (Exception ex) {
			throw new CoreException(MessageFactory.getError("Failed to run JUnit tests", ex));
		}
		launch.removeProcess(runnerProcess);
	}

	public void setApplicationManager(ApplicationManager manager) {
		this.manager = manager;
	}

}
