package org.moe.popup.actions;

import java.io.File;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
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
import org.moe.utils.ProjectHelper;

public class GenerateActionsAndOutletsActionHandler extends AbstractHandler {
	
	private static final String ID = "org.moe.popup.actions.GenerateActionsAndOutletsActionHandler";

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project != null) {
			try {
				refresh(project);
			} catch (InterruptedException e) {
				return new Status(Status.ERROR, ID, "Exception", e);
			}
		}
		return Status.OK_STATUS;
	}
	
	private void refresh(final IProject project) throws InterruptedException {
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

}
