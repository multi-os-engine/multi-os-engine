package org.moe.runconfig;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.jface.dialogs.MessageDialog;

public abstract class AbstractTab extends AbstractLaunchConfigurationTab {

	protected void showError(String message) {
		MessageDialog.openError(getShell(), "Error", message);
	}

	protected void showMessage(String message) {
		MessageDialog.openInformation(getShell(), "Info", message);
	}

}
