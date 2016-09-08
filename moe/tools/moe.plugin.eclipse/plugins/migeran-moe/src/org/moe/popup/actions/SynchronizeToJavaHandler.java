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

package org.moe.popup.actions;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.handlers.HandlerUtil;
import org.moe.common.utils.ProjectUtil;
import org.moe.runconfig.MOEProjectBuildConsole;
import org.moe.tools.natjgen.binding.IConsole;
import org.moe.tools.natjgen.binding.IMonitor;
import org.moe.tools.natjgen.binding.MOEBindingGenerator;
import org.moe.tools.natjgen.binding.MOEBindingGeneratorByXcode;
import org.moe.tools.natjgen.utils.NatjGenUtil;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

public class SynchronizeToJavaHandler extends AbstractHandler {

	private static final Logger LOG = LoggerFactory.getLogger(SynchronizeToJavaHandler.class);

	private List<File> bindingList = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LOG.debug("Synchronize to Java action");
		ISelection selection = ProjectHelper.getSelection();
		bindingList = null;
		IResource resource = ProjectHelper.getSelectedResource(selection);
		String extension = resource.getFileExtension();
		if (extension != null && extension.equals("h")) {
			bindingList = new ArrayList<File>();
			bindingList.add(new File(resource.getLocation().toOSString()));
		}
		IProject project = ProjectHelper.getSelectedProject(selection);
		if (project != null) {
			IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			InputDialog dialog = new InputDialog(window.getShell(), "", "Package Name", "ui", null);
			if (dialog.open() == Window.OK) {
				synhroniteToJava(project, dialog.getValue());
			}
		}
		return null;
	}

	private void synhroniteToJava(final IProject project, final String packageName) {
		Job job = new Job("Synchronize to Java") {

			@Override
			protected IStatus run(final IProgressMonitor monitor) {
				monitor.beginTask("Synchronize to Java", 4);

				File projectFile = project.getLocation().toFile();

				IMonitor progressMonitor = new IMonitor() {

					@Override
					public void setText(String text) {
						monitor.subTask(text);
					}

					@Override
					public boolean isCanceled() {
						return monitor.isCanceled();
					}
				};

				if (bindingList == null) {
					bindingList = NatjGenUtil.getBindingList(projectFile, progressMonitor);
				}

				monitor.worked(1);

				if (bindingList != null && bindingList.size() > 0) {
					MOEBindingGenerator generator = new MOEBindingGeneratorByXcode();
					generator.setPackage(packageName);
					generator.createFromPrototype(true);

					monitor.subTask("Synchronize...");
					final MessageConsole console = MOEProjectBuildConsole.getBuildConsole();
					console.activate();
					IConsole messageConsole = new IConsole() {

						@Override
						public void write(String message) {
							console.newMessageStream().println(message);
						}
					};

					monitor.worked(1);
					File sdkToolsDir = new File(ProjectUtil.retrieveSDKPathFromGradle(project.getLocation().toFile()),
							"tools");
					if (sdkToolsDir == null || !sdkToolsDir.exists()) {
						return MessageFactory.getError("Unable find MOE sdk");
					}
					generator.generate(sdkToolsDir, projectFile, bindingList.toArray(new File[] {}),
							"Synchronize to Java", messageConsole, progressMonitor);
				} else {
					return MessageFactory.getError("Unable find binding .h files");
				}
				monitor.done();

				// Refresh project
				try {
					project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
				} catch (CoreException e) {
					LOG.error("Unable to refresh project", e);
				}

				return Status.OK_STATUS;
			}

		};
		job.setPriority(Job.LONG);
		job.setRule(project);
		job.schedule();
	}

}
