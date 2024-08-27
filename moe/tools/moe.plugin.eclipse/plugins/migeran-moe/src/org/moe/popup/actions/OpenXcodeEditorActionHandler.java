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
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;

public class OpenXcodeEditorActionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return MessageFactory.showErrorDialog("There are no selected projects");
		}

		File projectFile = new File(project.getLocation().toOSString());
		final Properties properties = ProjectUtil.retrievePropertiesFromGradle(projectFile,
				ProjectUtil.XCODE_PROPERTIES_TASK);
		final String pr = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
		if (pr == null) {
			return MessageFactory.showErrorDialog("The moe.xcode.project property is not set in the Gradle project");
		}

		File xcodeProjectFile = new File(pr, "project.pbxproj");
		if (xcodeProjectFile.exists()) {
			IFileStore fileStore = EFS.getLocalFileSystem().getStore(xcodeProjectFile.toURI());
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();

			try {
				IDE.openEditorOnFileStore(page, fileStore);
				return null;
			} catch (PartInitException e) {
				return MessageFactory.showErrorDialog("Failed to open document in editor", e);
			}
		} else {
			return MessageFactory.showErrorDialog("Xcode project file does not exist at " + xcodeProjectFile.getPath());
		}
	}

}
