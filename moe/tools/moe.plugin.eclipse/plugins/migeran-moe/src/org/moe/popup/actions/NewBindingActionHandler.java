package org.moe.popup.actions;

import java.io.File;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.moe.ui.CreateBindingDialog;
import org.moe.utils.ProjectHelper;

public class NewBindingActionHandler extends AbstractHandler {
	
	private static final String ID = "org.moe.popup.actions.NewBindingActionHandler";

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project != null) {
			Shell shell = Display.getDefault().getActiveShell();
			CreateBindingDialog dialog = new CreateBindingDialog(shell);
			if (dialog.open() == Window.OK) {
				String name = dialog.getName();
				if (name != null && !name.isEmpty()) {
					File bindingConfiguration = new File(project.getLocation().toOSString(), name + ".nbc");
					if (!bindingConfiguration.exists()) {
						try {
							bindingConfiguration.createNewFile();
							
							// Refresh project
							project.refreshLocal(IResource.DEPTH_INFINITE, null);
							
							IFileStore fileStore = EFS.getLocalFileSystem().getStore(bindingConfiguration.toURI());
						    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
						 
						    try {
						        IDE.openEditorOnFileStore( page, fileStore );
						        return Status.OK_STATUS;
						    } catch ( PartInitException e ) {
						    	return new Status(Status.ERROR, ID, "Unable open binding configuration file", e);
						    }
						} catch (Exception e) {
							return new Status(Status.ERROR, ID, "Unable create binding configuration file", e);
						}
					}
				}
			} else {
				return Status.CANCEL_STATUS;
			}
		}
		return Status.OK_STATUS;
	}

}
