package org.moe.popup.actions;

import java.io.File;
import java.util.Properties;

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
import org.moe.common.utils.ProjectUtil;
import org.moe.generator.project.writer.XcodeEditor;
import org.moe.generator.project.writer.XcodeEditor.Settings;
import org.moe.utils.ProjectHelper;

public class RefreshXcodeProjectActionHandler extends AbstractHandler {
	
	private static final String ID = "org.moe.popup.actions.RefreshXcodeProjectActionHandler";

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project != null) {
			try {
				refreshXcodeProject(project);
			} catch (InterruptedException e) {
				return new Status(Status.ERROR, ID, "Exception", e);
			}
		} else {
			return new Status(Status.ERROR, ID, "Unable find project");
		}
		return Status.OK_STATUS;
	}

	private void refreshXcodeProject(IProject project) throws InterruptedException {
		Job job = new Job("Injecting/Refreshing Xcode Settings") {

			@Override
			protected IStatus run(IProgressMonitor m) {
				
				final IProgressMonitor monitor = m == null ? new NullProgressMonitor() : m;

				try {
	    			
	    			monitor.beginTask("Injecting/Refreshing Xcode Settings", 4);
	    			
					final File projectFile = project.getLocation().toFile();
					
					monitor.worked(1);

					final Properties properties = ProjectUtil
	                        .retrievePropertiesFromGradle(projectFile, ProjectUtil.XCODE_PROPERTIES_TASK);
					
					monitor.worked(1);

	                final String xcodeProjectPath = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
	                final String mainTarget = properties.getProperty(ProjectUtil.XCODE_MAIN_TARGET_KEY);
	                final String testTarget = properties.getProperty(ProjectUtil.XCODE_TEST_TARGET_KEY);
	                File xcodeFile = new File(xcodeProjectPath);
	                if (!xcodeFile.exists()) {
	                    throw new RuntimeException("Xcode project does not exist at " + xcodeProjectPath);
	                }

	                final XcodeEditor xcodeEditor = new XcodeEditor(xcodeFile);
	                XcodeEditor.Settings settings = new Settings();
	                settings.mainTarget = (mainTarget == null || mainTarget.length() == 0) ? null : mainTarget;
	                settings.testTarget = (testTarget == null || testTarget.length() == 0) ? null : testTarget;
	                settings.moeProject = projectFile;
	                settings.xcodeProject = xcodeFile;
	                xcodeEditor.update(settings);
	                
	                monitor.worked(1);

	                xcodeEditor.getProjectFile().save();
					
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
}
