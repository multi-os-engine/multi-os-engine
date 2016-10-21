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
import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

public class OpenXcodeEditorActionHandler extends AbstractHandler {

	private static final Logger LOG = LoggerFactory.getLogger(OpenXcodeEditorActionHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LOG.debug("Open Project in Xcode action");
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project != null) {
			File projectFile = new File(project.getLocation().toOSString());
			String xcodePath = ProjectUtil.retrieveXcodeProjectPathFromGradle(projectFile);
			File xcodeProjectFile = new File(xcodePath, "project.pbxproj");
			
			if (xcodeProjectFile.exists() && xcodeProjectFile.isFile()) {
			    IFileStore fileStore = EFS.getLocalFileSystem().getStore(xcodeProjectFile.toURI());
			    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			 
			    try {
			        IDE.openEditorOnFileStore( page, fileStore );
			    } catch ( PartInitException e ) {
			        //Put your exception handler here if you wish to
			    }
			}
		}
		return Status.OK_STATUS;
	}

}
