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

package org.moe;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.moe.utils.logger.LoggerFactory;

public class MOEProjectNature implements IProjectNature {

	public static final String NATURE_ID = "org.moe.natures.project";

	private static final Logger LOG = LoggerFactory.getLogger(MOEProjectNature.class);

	private IProject mProject;

	@Override
	public void configure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deconfigure() throws CoreException {
		// TODO Auto-generated method stub

	}

	@Override
	public IProject getProject() {
		return mProject;
	}

	@Override
	public void setProject(IProject arg0) {
		this.mProject = arg0;
	}

	public static void addNature(IProject project) throws CoreException {
		try {
			IProjectDescription desc = project.getDescription();
			String[] prevNatures = desc.getNatureIds();
			String[] newNatures = new String[prevNatures.length + 1];
			System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
			newNatures[prevNatures.length] = NATURE_ID;
			desc.setNatureIds(newNatures);
			project.setDescription(desc, new NullProgressMonitor());
		} catch (CoreException e) {
			LOG.error("Unable set project nature", e);
		}
	}

}
