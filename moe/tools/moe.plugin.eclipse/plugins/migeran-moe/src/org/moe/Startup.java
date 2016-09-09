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

package org.moe;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.IMavenProjectRegistry;
import org.eclipse.m2e.core.project.configurator.MojoExecutionKey;
import org.eclipse.ui.IStartup;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.ApplicationInfo;
import org.moe.utils.logger.LoggerFactory;

public class Startup implements IStartup {

	private static final Logger LOG = LoggerFactory.getLogger(Startup.class);

	@Override
	public void earlyStartup() {
		LOG.info("Plugin started " + ApplicationInfo.getInstance().getBuild().asString()
                + " (" + ApplicationInfo.getInstance().getVersionName()
                + " " + ApplicationInfo.getInstance().getFullVersion() + ")");
		registerPostBuildListener();
	}
	
	private void registerPostBuildListener() {
		LOG.debug("Register postbuild listener");
		IResourceChangeListener resourceChangeListener = new IResourceChangeListener() {

			@Override
			public void resourceChanged(IResourceChangeEvent arg0) {
				if (arg0.getSource() instanceof IWorkspace && arg0.getType() == IResourceChangeEvent.POST_BUILD) {
					checkMOEMavenProjectsDependencies();
				}
			}

		};
		ResourcesPlugin.getWorkspace().addResourceChangeListener(resourceChangeListener,
				IResourceChangeEvent.POST_BUILD);
	}

	private void checkMOEMavenProjectsDependencies() {
		LOG.debug("Update MOE dependencies on the Maven projects");
		IProject[] projects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects) {
			if (project.isAccessible()) {
				try {
					if (project.hasNature("org.eclipse.m2e.core.maven2Nature")) {
						LOG.debug("Found next Maven project: " + project.getName());
						if (project.hasNature(MOEProjectNature.NATURE_ID)) {
							LOG.debug("Found nature: " + MOEProjectNature.NATURE_ID);
							checkProjectEntries(project);
						} else {
							checkMOEMavenPlugin(project);
						}
					}
				} catch (CoreException e) {
					LOG.error("Unable to update MOE dependencies", e);
				}
			}
		}
	}

	private void checkProjectEntries(IProject project) throws JavaModelException {
		LOG.debug("Update project entries");
		IJavaProject javaProject = JavaCore.create(project);
		IClasspathEntry[] entries = javaProject.getRawClasspath();
		List<IClasspathEntry> entriesList = Arrays.asList(entries);
		entriesList = checkSdkJars(project.getLocation().toFile(), entriesList);
		if (entriesList != null) {
			javaProject.setRawClasspath(entriesList.toArray(new IClasspathEntry[] {}), null);
		} else {
			LOG.error("Unable to update sdk jars");
		}
	}

	private void checkMOEMavenPlugin(IProject project) throws CoreException {
		LOG.debug("Update nature " + MOEProjectNature.NATURE_ID);
		IMavenProjectRegistry projectManager = MavenPlugin.getMavenProjectRegistry();
		IMavenProjectFacade projectFacade = projectManager.create(project, new NullProgressMonitor());
		boolean isMOEProject = false;
		if (projectFacade != null) {
			Map<MojoExecutionKey, List<IPluginExecutionMetadata>> artifacts = projectFacade.getMojoExecutionMapping();
			for (MojoExecutionKey ar : artifacts.keySet()) {
				String artifactId = ar.getArtifactId();
				if (artifactId.equals("moe-maven")) {
					LOG.debug("Found MOE ArtifactRef: " + artifactId);
					isMOEProject = true;
					break;
				}
			}
			if (isMOEProject) {
				MOEProjectNature.addNature(project);
				checkProjectEntries(project);
			}
		}
	}

	private List<IClasspathEntry> checkSdkJars(File projectFile, List<IClasspathEntry> entriesList) {
		LOG.debug("Update sdk jars in: " + projectFile.getPath());
		List<IClasspathEntry> newEntryList = new ArrayList<>();
		String sdkHome = ProjectUtil.retrieveSDKPathFromGradle(projectFile);
		if (sdkHome == null || sdkHome.isEmpty()) {
			LOG.error("Unable to find MOE home");
			return null;
		}
		LOG.debug("Found MOE home: " + sdkHome);
		File sdk = new File(sdkHome, "sdk");

		if (sdk == null || !sdk.exists()) {
			LOG.error("Unable to find MOE sdk");
			return null;
		}
		LOG.debug("Found MOE sdk: " + sdk.getPath());

		File coreJar = null;
		File iosJar = null;
		File junitJar = null;
		boolean coreFound = false;
		boolean iosFound = false;
		boolean junitFound = false;

		for (File f : sdk.listFiles()) {
			if (f.getName().equals("moe-core.jar")) {
				coreJar = f;
			} else if (f.getName().equals("moe-ios.jar")) {
				iosJar = f;
			} else if (f.getName().equals("moe-ios-junit.jar")) {
				junitJar = f;
			}
		}

		if (coreJar == null) {
			LOG.error("Unable to find: " + "moe-core.jar");
			return null;
		}

		if (iosJar == null) {
			LOG.error("Unable to find: " + "moe-ios.jar");
			return null;
		}

		if (junitJar == null) {
			LOG.error("Unable to find: " + "moe-ios-junit.jar");
			return null;
		}

		for (IClasspathEntry entry : entriesList) {
			String entryPath = entry.getPath().toOSString();
			if (entryPath.endsWith("moe-core.jar")) {
				if (entryPath.equals(coreJar.getPath())) {
					newEntryList.add(entry);
					coreFound = true;
				}
			} else if (entryPath.endsWith("moe-ios.jar")) {
				if (entryPath.equals(iosJar.getPath())) {
					newEntryList.add(entry);
					iosFound = true;
				}
			} else if (entryPath.endsWith("moe-ios-junit.jar")) {
				if (entryPath.equals(junitJar.getPath())) {
					newEntryList.add(entry);
					junitFound = true;
				}
			} else {
				newEntryList.add(entry);
			}
		}

		if (!coreFound) {
			IClasspathEntry coreEntry = JavaCore.newLibraryEntry(new Path(coreJar.getPath()), null, null, true);
			newEntryList.add(coreEntry);
		}

		if (!iosFound) {
			IClasspathEntry iosEntry = JavaCore.newLibraryEntry(new Path(iosJar.getPath()), null, null, true);
			newEntryList.add(iosEntry);
		}

		if (!junitFound) {
			IClasspathEntry junitEntry = JavaCore.newLibraryEntry(new Path(junitJar.getPath()), null, null, true);
			newEntryList.add(junitEntry);
		}

		return newEntryList;
	}

}
