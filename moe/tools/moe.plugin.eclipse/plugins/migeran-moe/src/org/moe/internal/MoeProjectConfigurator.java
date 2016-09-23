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

package org.moe.internal;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.m2e.core.MavenPlugin;
import org.eclipse.m2e.core.lifecyclemapping.model.IPluginExecutionMetadata;
import org.eclipse.m2e.core.project.IMavenProjectFacade;
import org.eclipse.m2e.core.project.IMavenProjectRegistry;
import org.eclipse.m2e.core.project.configurator.AbstractBuildParticipant;
import org.eclipse.m2e.core.project.configurator.MojoExecutionBuildParticipant;
import org.eclipse.m2e.core.project.configurator.MojoExecutionKey;
import org.eclipse.m2e.core.project.configurator.ProjectConfigurationRequest;
import org.eclipse.m2e.jdt.AbstractSourcesGenerationProjectConfigurator;
import org.eclipse.m2e.jdt.IClasspathDescriptor;
import org.eclipse.m2e.jdt.IClasspathEntryDescriptor;
import org.moe.MOEProjectNature;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.logger.LoggerFactory;

public class MoeProjectConfigurator extends AbstractSourcesGenerationProjectConfigurator {
	
	private static final Logger LOG = LoggerFactory.getLogger(MoeProjectConfigurator.class);
	
	@Override
	public AbstractBuildParticipant getBuildParticipant(IMavenProjectFacade projectFacade, 
			MojoExecution execution, 
			IPluginExecutionMetadata executionMetadata) {
		return new MojoExecutionBuildParticipant(execution, true);
	}

	@Override
	public void configure(ProjectConfigurationRequest request, IProgressMonitor monitor) throws CoreException {
		/*
		 * In any case, the second in the call queue.
		 */
		IProject project = request.getProject(); 
		if (isMoeProject(project)) {
			// Add moe nature
			LOG.debug("Add nature " + MOEProjectNature.NATURE_ID + " to project " + project.getName());
			MOEProjectNature.addNature(project);
		}
	}

	@Override
	public void configureClasspath(IMavenProjectFacade facade, IClasspathDescriptor classpath, IProgressMonitor monitor) 
			throws CoreException {
		/*
		 * This one is called after the Eclipse started. In other cases, always the first in the call queue.
		 */
	}

	@Override
	public void configureRawClasspath(ProjectConfigurationRequest request, IClasspathDescriptor classpath, IProgressMonitor monitor) 
			throws CoreException {
		/*
		 * In any case, the last in the call queue.
		 */
		IProject project = request.getProject();
		if (project.hasNature(MOEProjectNature.NATURE_ID)) {
			LOG.debug("Found nature " + MOEProjectNature.NATURE_ID + " on project " + project.getName());
			setSdk(project, classpath);
		}
	}
	
	static final String MOE_JARS_PATH = "sdk";
	static final List<String> MOE_JARS = Arrays.asList("moe-core.jar", "moe-ios.jar", "moe-ios-junit.jar");
	
	private void setSdk(IProject project, IClasspathDescriptor classpath) {
		LOG.debug("Set moe libs for project " + project.getName());
		// Find moe home
		final String moeHome = ProjectUtil.retrieveSDKPathFromGradle(project.getLocation().toFile());
		if (moeHome == null || moeHome.isEmpty()) {
			throw new RuntimeException("Unable to find moe home");
		}
		LOG.debug("Found moe home " + moeHome);
		// Add new entries
		for (String jar : MOE_JARS) {
			File f = new File(moeHome, MOE_JARS_PATH + File.separator + jar);
			if (!f.exists()) {
				throw new RuntimeException("Unable to find " + f.getAbsolutePath());
			}
			classpath.addLibraryEntry(new Path(f.getPath()));
		}
		// Remove old entries
		classpath.removeEntry(new IClasspathDescriptor.EntryFilter() {

			@Override
			public boolean accept(IClasspathEntryDescriptor descriptor) {
				IPath path = descriptor.getPath();
				if (MOE_JARS.contains(path.lastSegment())) {
					if (!moeHome.equals(path.removeLastSegments(2).toOSString())) {
						LOG.debug("Remove old moe lib " + path);
						return true;
					}
				}
				return false;
			}
			
		});
	}
	
	static final String MOE_MAVEN_ARTIFACT = "moe-maven";
	
	private boolean isMoeProject(IProject project) {
		LOG.debug("Find artifact " + MOE_MAVEN_ARTIFACT + " on project " + project.getName());
		IMavenProjectRegistry projectManager = MavenPlugin.getMavenProjectRegistry();
		IMavenProjectFacade projectFacade = projectManager.create(project, new NullProgressMonitor());
		if (projectFacade != null) {
			Map<MojoExecutionKey, List<IPluginExecutionMetadata>> artifacts = projectFacade.getMojoExecutionMapping();
			for (MojoExecutionKey artifact : artifacts.keySet()) {
				if (MOE_MAVEN_ARTIFACT.equals(artifact.getArtifactId())) {
					LOG.debug("Found artifact " + MOE_MAVEN_ARTIFACT + " on project " + project.getName());
					return true;
				}
			}
		}
		return false;
	}
	
}
