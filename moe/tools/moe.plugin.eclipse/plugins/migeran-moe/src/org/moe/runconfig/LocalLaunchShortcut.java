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

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.moe.common.utils.OsUtils;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;
import org.moe.utils.SimCtl;

public class LocalLaunchShortcut implements ILaunchShortcut {

	public static final String LOCAL_CONFIGURATION_ID = "org.moe.runconfig.LocalConfigurationDelegate";

	@Override
	public void launch(ISelection arg0, String arg1) {
		IProject project = ProjectHelper.getSelectedProject(arg0);
		if (project != null) {
			launch(project.getName(), arg1);
		}
	}

	@Override
	public void launch(IEditorPart arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	private void launch(String projectName, String mode) {
		ILaunchConfiguration launchConfiguration = getLaunchConfiguration(projectName);

		if (launchConfiguration != null) {
			DebugUITools.launch(launchConfiguration, mode);
		}
	}

	private ILaunchConfiguration getLaunchConfiguration(String projectName) {
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

		ILaunchConfigurationType configurationType = manager.getLaunchConfigurationType(LOCAL_CONFIGURATION_ID);

		ILaunchConfiguration configuration = findConfiguration(manager, configurationType, projectName);

		if (configuration == null) {
			try {
				configuration = newLaunchConfiguration(configurationType, projectName).doSave();
			} catch (CoreException e) {
				MessageFactory.showErrorDialog("Unable create launch configuration", e.getStatus().getMessage());
			}
		}

		return configuration;
	}

	private static ILaunchConfiguration findConfiguration(ILaunchManager manager, ILaunchConfigurationType type,
			String projectName) {

		try {
			ILaunchConfiguration[] configurations = manager.getLaunchConfigurations(type);

			for (ILaunchConfiguration config : configurations) {
				if (config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "").equals(projectName)) {
					return config;
				}
			}
		} catch (CoreException e) {
			MessageFactory.showErrorDialog("Launch Error", e.getStatus().getMessage());
		}

		return null;

	}

	public static ILaunchConfigurationWorkingCopy newLaunchConfiguration(ILaunchConfigurationType configType,
			String name) throws CoreException {
		ILaunchConfigurationWorkingCopy workingCopy = null;
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

		workingCopy = configType.newInstance(null, manager.generateLaunchConfigurationName(name));

		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, name);
		workingCopy.setAttribute(RunConfigurationEditorLocal.ATTR_GOALS, "moe:xcodebuild");
		workingCopy.setAttribute(RunConfigurationEditorLocal.ATTR_RUNTIME, ProjectHelper.getMavenRuntimePath());
		workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_ALLOW_TERMINATE, true);
		if (!OsUtils.isMac()) {
			workingCopy.setAttribute(ApplicationManager.RUN_ON_SIMULATOR_KEY, false);
		} else {
			for (SimCtl.Device device : SimCtl.getDevices()) {
				workingCopy.setAttribute(ApplicationManager.RUN_ON_SIMULATOR_KEY, true);
				workingCopy.setAttribute(ApplicationManager.SIMULATOR_UUID_KEY, device.udid);
				break;
			}
		}

		return workingCopy;
	}

}
