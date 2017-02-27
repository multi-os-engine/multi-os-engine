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
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.moe.common.exec.ExecRunner;
import org.moe.common.exec.ExecRunnerBase.ExecRunnerListener;
import org.moe.runconfig.MOEProjectBuildConsole;
import org.moe.common.exec.GradleExec;
import org.moe.common.exec.IKillListener;
import org.moe.maven.ExecuteMOEPomAction;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;

public class GenerateActionsAndOutletsActionHandler extends AbstractHandler {

	private static final String ID = "org.moe.popup.actions.GenerateActionsAndOutletsActionHandler";

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return MessageFactory.showErrorDialog("There are no selected projects");
		}

		try {
			refresh(project);
			return null;
		} catch (InterruptedException e) {
			return MessageFactory.showErrorDialog("Operation interrupted", e);
		}
	}

	private void refresh(final IProject project) throws InterruptedException {
		try {
			if (project.hasNature("org.eclipse.m2e.core.maven2Nature")) {
				ExecuteMOEPomAction goalAction = new ExecuteMOEPomAction();
				goalAction.runGoal(project, "moe:generateUIObjCInterfaces");

				// Refresh project
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

			} else {
				Job job = new Job("Generating Actions and Outlets") {

					@Override
					protected IStatus run(IProgressMonitor m) {

						final IProgressMonitor monitor = m == null ? new NullProgressMonitor() : m;

						try {
							MessageConsole console = MOEProjectBuildConsole.getLaunchConsole();
							console.clearConsole();
							final MessageConsoleStream consoleStream = console.newMessageStream();

							monitor.beginTask("Generating Actions and Outlets", 4);

							final File f = project.getLocation().toFile();

							monitor.worked(1);

							GradleExec exec = new GradleExec(f);

							exec.getArguments().add("moeGenerateUIObjCInterfaces");
							ExecRunner runner = exec.getRunner();
							runner.getBuilder().directory(f);

							runner.setListener(new ExecRunnerListener() {

								@Override
								public void stdout(String line) {
									consoleStream.println(line);
								}

								@Override
								public void stderr(String line) {
									consoleStream.println(line);
								}
							});

							monitor.worked(1);

							runner.run(new IKillListener() {

								@Override
								public boolean needsKill() {
									return false;
								}
							});

							monitor.done();

							// Refresh project
							project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
						} catch (Exception e) {
							return new Status(Status.ERROR, ID, "Unable to refresh project", e);
						}

						return Status.OK_STATUS;
					}
				};
				job.setPriority(Job.SHORT);
				job.setRule(project);
				job.join();
				job.schedule();
			}
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
