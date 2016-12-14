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

import org.apache.log4j.Logger;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.Status;
import org.moe.common.exec.SimpleExec;
import org.moe.common.utils.ProjectUtil;
import org.moe.utils.MessageFactory;
import org.moe.utils.ProjectHelper;
import org.moe.utils.logger.LoggerFactory;

public class OpenXcodeActionHandler extends AbstractHandler {

	private static final Logger LOG = LoggerFactory.getLogger(OpenXcodeActionHandler.class);

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		LOG.debug("Open Project in Xcode action");
		IProject project = ProjectHelper.getSelectedProject(ProjectHelper.getSelection());
		if (project == null) {
			return Status.OK_STATUS;
		}

		File projectFile = new File(project.getLocation().toOSString());
        final Properties properties = ProjectUtil
                .retrievePropertiesFromGradle(projectFile, ProjectUtil.XCODE_PROPERTIES_TASK);

        // Try to open workspace
        final String ws = properties.getProperty(ProjectUtil.XCODE_WORKSPACE_KEY);
        if (ws != null) {
            final File file = new File(ws);
            if (!file.exists()) {
            	MessageFactory.getError("Xcode workspace does not exist");
            }
            try {
                SimpleExec.getOpen("xcode", file.getAbsolutePath()).getRunner().run(null);
            } catch (IOException ignored) {
    			LOG.error("Unale to open xcode workspace " + file.getAbsolutePath(), ignored);
            	MessageFactory.getError("Could not open workspace " + file.getAbsolutePath() + "\n" + ignored.getMessage());
            }
			return Status.OK_STATUS;
        }

        // Try to open project
        final String pr = properties.getProperty(ProjectUtil.XCODE_PROJECT_KEY);
        if (pr != null) {
            final File file = new File(pr);
            if (!file.exists()) {
            	MessageFactory.getError("Xcode project does not exist");
            }
            try {
                SimpleExec.getOpen("xcode", file.getAbsolutePath()).getRunner().run(null);
            } catch (IOException ignored) {
    			LOG.error("Unale to open xcode project " + file.getAbsolutePath(), ignored);
            	MessageFactory.getError("Could not open project " + file.getAbsolutePath() + "\n" + ignored.getMessage());
            }
			return Status.OK_STATUS;
        }

        MessageFactory.getError("Neither the Xcode project nor the workspace is set in the Gradle plugin");
		return Status.OK_STATUS;
	}

}
