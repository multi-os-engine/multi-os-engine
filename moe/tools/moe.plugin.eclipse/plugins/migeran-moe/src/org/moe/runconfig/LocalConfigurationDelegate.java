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

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.junit.launcher.JUnitLaunchConfigurationDelegate;
import org.moe.runconfig.junit.MOEJUnitLaunchConfigurationDelegate;
import org.moe.utils.logger.LoggerFactory;

public class LocalConfigurationDelegate extends JUnitLaunchConfigurationDelegate {

	private static final Logger LOG = LoggerFactory.getLogger(LocalConfigurationDelegate.class);

	@Override
	public void launch(ILaunchConfiguration launchConfiguration, String mode, ILaunch launch,
			IProgressMonitor progressMonitor) throws CoreException {

		setDefaultSourceLocator(launch, launchConfiguration);

		IJavaProject javaProject = getJavaProject(launchConfiguration);
		IProject project = javaProject.getProject();

		ApplicationManager manager = new ApplicationManager(project, launchConfiguration, launch, progressMonitor);

		LOG.debug("Start build");

		// Build section
		if (project.hasNature("org.eclipse.m2e.core.maven2Nature")) {
			manager.buildMavenProject();
		} else {
			manager.build();
		}

		LOG.debug("Start launch");

		// Launch
		boolean isJUnitEnabled = launchConfiguration.getAttribute(ApplicationManager.RUN_JUNIT_TEST_KEY, false);

		if (!isJUnitEnabled) {
			manager.launchApplication(null);
		} else {
			MOEJUnitLaunchConfigurationDelegate junitDelegate = new MOEJUnitLaunchConfigurationDelegate(manager);
			junitDelegate.launch(launchConfiguration, mode, launch, progressMonitor);
		}
	}

}
