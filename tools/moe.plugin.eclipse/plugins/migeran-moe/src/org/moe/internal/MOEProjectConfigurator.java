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
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.maven.plugin.MojoExecution;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
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

public class MOEProjectConfigurator extends AbstractSourcesGenerationProjectConfigurator {
	
	private static final Logger LOG = LoggerFactory.getLogger(MOEProjectConfigurator.class);
	
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
	}

	@Override
	public void configureClasspath(IMavenProjectFacade facade, IClasspathDescriptor classpath, IProgressMonitor monitor) 
			throws CoreException {
		/*
		 * This one is called after the Eclipse started. In other cases, always the first in the call queue.
		 */
		IProject project = facade.getProject();
		if (!project.hasNature(MOEProjectNature.NATURE_ID) && isMOEProject(project)) {
			// Add MOE nature
			LOG.debug("Add nature " + MOEProjectNature.NATURE_ID + " to project " + project.getName());
			MOEProjectNature.addNature(project);
		}
		if (project.hasNature(MOEProjectNature.NATURE_ID)) {
			LOG.debug("Found nature " + MOEProjectNature.NATURE_ID + " on project " + project.getName());
			setSdk(project, classpath);
			checkBuildCommands(project);
		}
	}

	@Override
	public void configureRawClasspath(ProjectConfigurationRequest request, IClasspathDescriptor classpath, IProgressMonitor monitor) 
			throws CoreException {
		/*
		 * In any case, the last in the call queue.
		 */
	}
	
	static final String MOE_JARS_PATH = "sdk";
	static final List<String> MOE_JARS = Arrays.asList("moe-core.jar", "moe-ios.jar", "moe-ios-junit.jar");
	
	private void setSdk(IProject project, IClasspathDescriptor classpath) {
		LOG.debug("Set MOE libs for project " + project.getName());
		// Find MOE home
        final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(project.getLocation().toFile(), ProjectUtil.SDK_PROPERTIES_TASK);

        final String home = properties.getProperty(ProjectUtil.SDK_PATH_KEY);
		if (home == null || home.isEmpty()) {
			throw new RuntimeException("Unable to find MOE home");
		}
		LOG.debug("Found MOE home " + home);
		// Add new entries
		for (String jar : MOE_JARS) {
			File f = new File(home, MOE_JARS_PATH + File.separator + jar);
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
					if (!home.equals(path.removeLastSegments(2).toOSString())) {
						LOG.debug("Remove old MOE lib " + path);
						return true;
					}
				}
				return false;
			}
			
		});
	}
	
	static final String MOE_MAVEN_ARTIFACT = "moe-maven";
	
	private boolean isMOEProject(IProject project) {
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
	
	private void checkBuildCommands(IProject project) throws CoreException {
		IProjectDescription description = project.getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			System.out.println("BUILDER NAME: " + commands[i].getBuilderName());
			if (commands[i].getBuilderName().equals("org.eclipse.m2e.core.maven2Builder")) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);
				break;
			}
		}
	}
	
}
