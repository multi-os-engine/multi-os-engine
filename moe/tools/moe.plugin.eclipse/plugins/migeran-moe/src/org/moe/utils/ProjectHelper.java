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

package org.moe.utils;

import java.io.File;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.m2e.core.internal.MavenPluginActivator;
import org.eclipse.m2e.core.internal.launch.AbstractMavenRuntime;
import org.eclipse.m2e.core.internal.launch.MavenRuntimeManagerImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.moe.common.utils.ProjectUtil;

@SuppressWarnings("restriction")
public class ProjectHelper {

	public static final String SDK_ROOT_ENV_VAR_NAME = "MOE_HOME";
	public static final String XCODE_PROJECT_PATH_KEY = "moe.xcode.xcodeProjectPath";
	public static final String XCODE_PROJECT_PATH_TASK = "moeXcodeProjectPath";

	public static ISelection getSelection() {
		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		if (activeWorkbenchWindow == null) {
			return null;
		}
		IWorkbenchPage page = activeWorkbenchWindow.getActivePage();
		if (page != null) {
			return page.getSelection();
		}

		return null;
	}

	public static IProject getSelectedProject(ISelection selection) {
		IResource resource = getSelectedResource(selection);
		if (resource != null) {
			return resource.getProject();
		}
		return null;
	}

	public static IResource getSelectedResource(ISelection selection) {
		if (selection == null) {
			return null;
		}
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)selection;
			Object selected = structuredSelection.getFirstElement();
			if (selected instanceof IAdaptable) {
				return (IResource)((IAdaptable)selected).getAdapter(IResource.class);
			}
		}
		return null;
	}

	public static String getResourcesFolderName() {
		return "resources";
	}

	public static String getSdkRootPath(File projectFile) {
		String sdkPath = null;
		if (projectFile != null) {
			ProjectUtil.retrieveSDKPathFromGradle(projectFile);
		}

		if (sdkPath == null || sdkPath.isEmpty()) {
			MessageFactory.showErrorDialog("Error",
					"Path to MOE SDK unset or invalid.\n\nIf not specified set MOE_HOME system environment variable.");
		}

		return sdkPath;
	}

	public static String getMavenRuntimePath() {
		MavenRuntimeManagerImpl manager = MavenPluginActivator.getDefault().getMavenRuntimeManager();
		if (manager == null) return null;
		AbstractMavenRuntime mavenRuntime = manager.getRuntime(MavenRuntimeManagerImpl.DEFAULT);
		if (mavenRuntime == null) return null;
		return mavenRuntime.getLocation();
	}

	public static IProject getProject(String name) {
		return ResourcesPlugin.getWorkspace().getRoot().getProject(name);
	}

}
