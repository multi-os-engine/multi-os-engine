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
import org.moe.common.exec.GradleExec;
import org.moe.common.exec.IKillListener;
import org.moe.maven.ExecuteMOEPomAction;
import org.moe.runconfig.MOEProjectBuildConsole;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;

public class RefreshXcodeProjectActionHandler extends AbstractHandler {

	private static final String ID = "org.moe.popup.actions.RefreshXcodeProjectActionHandler";

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return MessageFactory.showErrorDialog("There are no selected projects");
		}

		try {
			refreshXcodeProject(project);
			return null;
		} catch (InterruptedException e) {
			return MessageFactory.showErrorDialog("Operation interrupted", e);
		}
	}

	private void refreshXcodeProject(IProject project) throws InterruptedException {
		try {
			if (project.hasNature("org.eclipse.m2e.core.maven2Nature")) {
				ExecuteMOEPomAction goalAction = new ExecuteMOEPomAction();
				goalAction.runGoal(project, "moe:updateXcodeSettings");

				// Refresh project
				project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());

			} else {
				Job job = new Job("Injecting/Refreshing Xcode Settings") {

					@Override
					protected IStatus run(IProgressMonitor m) {

						final IProgressMonitor monitor = m == null ? new NullProgressMonitor() : m;

						try {
							MessageConsole console = MOEProjectBuildConsole.getLaunchConsole();
							console.clearConsole();
							final MessageConsoleStream consoleStream = console.newMessageStream();

							monitor.beginTask("Injecting/Refreshing Xcode Settings", 4);

							final File f = project.getLocation().toFile();

							monitor.worked(1);

							GradleExec exec = new GradleExec(f);

							exec.getArguments().add("moeUpdateXcodeSettings");
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
							return new Status(Status.ERROR, ID, "Unable to refresh Xcode project", e);
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
