package org.moe.popup.actions;

import java.io.File;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.moe.ui.CreateBindingDialog;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;

public class NewBindingActionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent arg0) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return MessageFactory.showErrorDialog("There are no selected projects");
		}
		
		Shell shell = Display.getDefault().getActiveShell();
		CreateBindingDialog dialog = new CreateBindingDialog(shell);
		if (dialog.open() != Window.OK) {
			return null;
		}

		String name = dialog.getName();
		if (name == null || name.isEmpty()) {
			return MessageFactory.showErrorDialog("Name cannot be empty");
		}

		File bindingConfiguration = new File(project.getLocation().toOSString(), name + ".nbc");
		if (bindingConfiguration.exists()) {
			return MessageFactory.showErrorDialog("File " + bindingConfiguration.getAbsolutePath() + " already exists");
		}

		try {
			bindingConfiguration.createNewFile();
			
			// Refresh project
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(bindingConfiguration.toURI());
		    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		 
		    try {
		        IDE.openEditorOnFileStore( page, fileStore );
		        return null;
		    } catch ( PartInitException e ) {
		    	return MessageFactory.showErrorDialog("Unable open binding configuration file", e);
		    }
		} catch (Exception e) {
			return MessageFactory.showErrorDialog("Unable create binding configuration file", e);
		}
	}
}
