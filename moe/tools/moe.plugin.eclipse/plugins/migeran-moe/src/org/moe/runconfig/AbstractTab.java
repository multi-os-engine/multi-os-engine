package org.moe.runconfig;

import org.eclipse.core.resources.IProject;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.MessageDialog;
import org.moe.utils.ProjectHelper;

public abstract class AbstractTab extends AbstractLaunchConfigurationTab {

	protected void showError(String message) {
		MessageDialog.openError(getShell(), "Error", message);
	}

	protected void showMessage(String message) {
		MessageDialog.openInformation(getShell(), "Info", message);
	}
	
	protected IProject getProject(String projectName) {
		if (projectName == null || projectName.isEmpty()) {
			return null;
		}

		IProject project = ProjectHelper.getProject(projectName);
		if (project == null) {
			return null;
		}
		return project;
	}

}
