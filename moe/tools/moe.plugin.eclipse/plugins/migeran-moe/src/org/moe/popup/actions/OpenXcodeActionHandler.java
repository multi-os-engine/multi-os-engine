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
import java.io.IOException;
import java.util.Properties;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;

public class OpenXcodeActionHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return MessageFactory.showErrorDialog("There are no selected projects");
		}

		File projectFile = new File(project.getLocation().toOSString());
        final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(projectFile, ProjectUtil.XCODE_PROPERTIES_TASK);

        // Try to open workspace
        final String ws = properties.getProperty(ProjectUtil.XCODE_WORKSPACE_KEY);
        if (ws != null) {
            final File file = new File(ws);
            if (!file.exists()) {
            	return MessageFactory.showErrorDialog("Xcode workspace does not exist at " + file.getAbsolutePath());
            }
            try {
                SimpleExec.getOpen("xcode", file.getAbsolutePath()).getRunner().run(null);
    			return null;
            } catch (IOException e) {
            	return MessageFactory.showErrorDialog("Could not open workspace at " + file.getAbsolutePath(), e);
            }
        }

        // Try to open project
        final String pr = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
        if (pr != null) {
            final File file = new File(pr);
            if (!file.exists()) {
            	return MessageFactory.showErrorDialog("Xcode project does not exist at " + file.getAbsolutePath());
            }
            try {
                SimpleExec.getOpen("xcode", file.getAbsolutePath()).getRunner().run(null);
    			return null;
            } catch (IOException e) {
            	return MessageFactory.showErrorDialog("Could not open project at " + file.getAbsolutePath(), e);
            }
        }

        return MessageFactory.showErrorDialog("Neither moe.xcode.project nor moe.xcode.workspace property is set in the Gradle project");
	}

}
