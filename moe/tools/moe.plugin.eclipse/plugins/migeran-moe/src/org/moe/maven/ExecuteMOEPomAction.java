/*******************************************************************************
 * Copyright (c) 2008-2010 Sonatype, Inc.
 * Copyright (C) 2017 Migeran
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *      Sonatype, Inc. - initial API and implementation
 *******************************************************************************/

package org.moe.maven;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugUIConstants;
import org.eclipse.debug.ui.RefreshTab;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.m2e.actions.MavenLaunchConstants;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.internal.IMavenConstants;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.IMavenProjectRegistry;
import org.eclipse.m2e.core.project.ResolverConfiguration;
import org.eclipse.m2e.internal.launch.Messages;
import org.eclipse.osgi.util.NLS;
import org.moe.runconfig.RunConfigurationEditorLocal;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

@SuppressWarnings("restriction")
public class ExecuteMOEPomAction {

	private static final Logger log = LoggerFactory.getLogger(ExecuteMOEPomAction.class);

	public void runGoal(IProject project, String goal) {
		ILaunchConfiguration configuration = createLaunchConfiguration(project, goal);

		if (configuration == null) {
			return;
		}

		DebugUITools.launch(configuration, ILaunchManager.RUN_MODE);
	}

	private ILaunchConfiguration createLaunchConfiguration(IContainer basedir, String goal) {
		try {
			ILaunchManager launchManager = DebugPlugin.getDefault().getLaunchManager();
			ILaunchConfigurationType launchConfigurationType = launchManager
					.getLaunchConfigurationType(MavenLaunchConstants.LAUNCH_CONFIGURATION_TYPE_ID);

			String rawConfigName = NLS.bind(Messages.ExecutePomAction_executing, goal,
					basedir.getLocation().toString());

			String safeConfigName = launchManager.generateLaunchConfigurationName(rawConfigName);

			ILaunchConfigurationWorkingCopy workingCopy = launchConfigurationType.newInstance(null, safeConfigName);
			workingCopy.setAttribute(MavenLaunchConstants.ATTR_POM_DIR, basedir.getLocation().toOSString());
			workingCopy.setAttribute(MavenLaunchConstants.ATTR_GOALS, goal);
			workingCopy.setAttribute(IDebugUIConstants.ATTR_PRIVATE, true);
			workingCopy.setAttribute(RefreshTab.ATTR_REFRESH_SCOPE, "${project}"); //$NON-NLS-1$
			workingCopy.setAttribute(RefreshTab.ATTR_REFRESH_RECURSIVE, true);
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, basedir.getName());
			workingCopy.setAttribute(RunConfigurationEditorLocal.ATTR_RUNTIME, ProjectHelper.getMavenRuntimePath());
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_ALLOW_TERMINATE, true);
			workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_VM_ARGUMENTS,
					"-Dmaven.multiModuleProjectDirectory=$M2_HOME");

			setProjectConfiguration(workingCopy, basedir);

			IPath path = getJREContainerPath(basedir);
			if (path != null) {
				workingCopy.setAttribute(IJavaLaunchConfigurationConstants.ATTR_JRE_CONTAINER_PATH,
						path.toPortableString());
			}

			return workingCopy;
		} catch (CoreException ex) {
			log.error(ex.getMessage(), ex);
		}
		return null;
	}

	private void setProjectConfiguration(ILaunchConfigurationWorkingCopy workingCopy, IContainer basedir) {
		IMavenProjectRegistry projectManager = MavenPlugin.getMavenProjectRegistry();
		IFile pomFile = basedir.getFile(new Path(IMavenConstants.POM_FILE_NAME));
		IMavenProjectFacade projectFacade = projectManager.create(pomFile, false, new NullProgressMonitor());
		if (projectFacade != null) {
			ResolverConfiguration configuration = projectFacade.getResolverConfiguration();

			String selectedProfiles = configuration.getSelectedProfiles();
			if (selectedProfiles != null && selectedProfiles.length() > 0) {
				workingCopy.setAttribute(MavenLaunchConstants.ATTR_PROFILES, selectedProfiles);
			}
		}
	}

	private IPath getJREContainerPath(IContainer basedir) throws CoreException {
		IProject project = basedir.getProject();
		if (project != null && project.hasNature(JavaCore.NATURE_ID)) {
			IJavaProject javaProject = JavaCore.create(project);
			IClasspathEntry[] entries = javaProject.getRawClasspath();
			for (int i = 0; i < entries.length; i++) {
				IClasspathEntry entry = entries[i];
				if (JavaRuntime.JRE_CONTAINER.equals(entry.getPath().segment(0))) {
					return entry.getPath();
				}
			}
		}
		return null;
	}
}
