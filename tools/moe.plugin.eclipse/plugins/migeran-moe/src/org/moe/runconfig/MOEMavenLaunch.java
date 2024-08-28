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

package org.moe.runconfig;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.ISourceLocator;
import org.eclipse.m2e.internal.launch.MavenSourceLocator;

@SuppressWarnings("restriction")
public class MOEMavenLaunch implements ILaunch {
	
	private ILaunch launch;
	
	public MOEMavenLaunch(ILaunch launch) {
		this.launch = launch;
	}

	@Override
	public boolean canTerminate() {
		return launch.canTerminate();
	}

	@Override
	public boolean isTerminated() {
		return launch.isTerminated();
	}

	@Override
	public void terminate() throws DebugException {
		launch.terminate();
	}

	@Override
	public <T> T getAdapter(Class<T> arg0) {
		return launch.getAdapter(arg0);
	}

	@Override
	public void addDebugTarget(IDebugTarget arg0) {
		launch.addDebugTarget(arg0);
	}

	@Override
	public void addProcess(IProcess arg0) {
		launch.addProcess(arg0);
	}

	@Override
	public String getAttribute(String arg0) {
		return launch.getAttribute(arg0);
	}

	@Override
	public Object[] getChildren() {
		return launch.getChildren();
	}

	@Override
	public IDebugTarget getDebugTarget() {
		return launch.getDebugTarget();
	}

	@Override
	public IDebugTarget[] getDebugTargets() {
		return launch.getDebugTargets();
	}

	@Override
	public ILaunchConfiguration getLaunchConfiguration() {
		return launch.getLaunchConfiguration();
	}

	@Override
	public String getLaunchMode() {
		return ILaunchManager.RUN_MODE;
	}

	@Override
	public IProcess[] getProcesses() {
		return launch.getProcesses();
	}

	@Override
	public ISourceLocator getSourceLocator() {
		return new MavenSourceLocator();
	}

	@Override
	public boolean hasChildren() {
		return launch.hasChildren();
	}

	@Override
	public void removeDebugTarget(IDebugTarget arg0) {
		launch.removeDebugTarget(arg0);
	}

	@Override
	public void removeProcess(IProcess arg0) {
		launch.removeProcess(arg0);
	}

	@Override
	public void setAttribute(String arg0, String arg1) {
		launch.setAttribute(arg0, arg1);
	}

	@Override
	public void setSourceLocator(ISourceLocator arg0) {
		launch.setSourceLocator(arg0);
	}

}
