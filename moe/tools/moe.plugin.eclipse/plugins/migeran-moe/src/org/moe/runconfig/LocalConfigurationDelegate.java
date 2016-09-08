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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.jdt.core.IJavaProject;
import org.moe.runconfig.ApplicationManager.OptionsBuilder;
import org.moe.runconfig.junit.MOEJUnitLaunchConfigurationDelegate;
import org.moe.utils.logger.LoggerFactory;

public class LocalConfigurationDelegate extends AbstractLaunchConfigurationDelegate {

	private static final Logger LOG = LoggerFactory.getLogger(LocalConfigurationDelegate.class);

	@Override
	public void launch(ILaunchConfiguration launchConfiguration, String mode, ILaunch launch,
			IProgressMonitor progressMonitor) throws CoreException {

		this.launchConfiguration = launchConfiguration;
		setDefaultSourceLocator(launch, launchConfiguration);

		IJavaProject javaProject = getJavaProject(launchConfiguration);
		IProject project = javaProject.getProject();

		boolean runOnSimulator = isRunOnSimulator();
		boolean isDebug = mode.equals(ILaunchManager.DEBUG_MODE);

		ApplicationManager manager = new ApplicationManager(project);

		List<String> args = new ArrayList<String>();
		Map<String, String> vmArgs = new HashMap<String, String>();

		int debugPort = 0;
		int debugRemotePort = 0;

		args.add("moeLaunch");

		if (isDebug) {
			vmArgs.put("hostname", "localhost");
			vmArgs.put("timeout", "0");
			debugPort = getDebugPort();
			debugRemotePort = getDebugRemotePort();
		}

		// Build section
		if (project.hasNature("org.eclipse.m2e.core.maven2Nature")) {
			manager.buildMavenProject(launchConfiguration, launch, progressMonitor);
		} else {
			manager.build(launchConfiguration, progressMonitor);
		}

		// Launch
		OptionsBuilder optionsBuilder = new OptionsBuilder();
		optionsBuilder.push("no-build");
		optionsBuilder.push("config:" + getConfiguration());
		LOG.debug("Lanch configuartion: " + getConfiguration());

		if (runOnSimulator) {
			args.add("-P" + ApplicationManager.LAUNCHER_SIMULATORS + getSimulatoreUdid());
			if (isDebug) {
				optionsBuilder.push("debug:" + Integer.toString(debugPort));
				vmArgs.put("port", Integer.toString(debugPort));
			}
		} else {
			args.add("-P" + ApplicationManager.DEVICE_UDID + getDeviceUdid());
			if (isDebug) {
				optionsBuilder.push("debug:" + Integer.toString(debugPort) + ":" + Integer.toString(debugRemotePort));
				vmArgs.put("port", Integer.toString(debugRemotePort));
			}
		}

		boolean isJUnitEnabled = launchConfiguration
				.getAttribute(AbstractLaunchConfigurationDelegate.RUN_JUNIT_TEST_KEY, false);

		if (!isJUnitEnabled) {
			manager.setArguments(args);
			manager.setOptionsBuilder(optionsBuilder);
			manager.launchApplication(launch, vmArgs, progressMonitor);
		} else {
			MOEJUnitLaunchConfigurationDelegate junitDelegate = new MOEJUnitLaunchConfigurationDelegate();
			junitDelegate.launch(launchConfiguration, mode, launch, progressMonitor);
		}
	}

}
