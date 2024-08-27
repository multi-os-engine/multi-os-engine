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

package org.moe.testers;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.moe.MOEProjectNature;

public class MOEProjectTester extends PropertyTester {

	@Override
	public boolean test(Object o, String property, Object[] args, Object expectedValue) {

		IResource resource = (IResource)o;
		IProject project = resource.getProject();
		if (project != null) {
			try {
				if (project.hasNature(MOEProjectNature.NATURE_ID)) {
					return true;
				}
			} catch (CoreException e) {
				return false;
			}
		}
		return false;
	}

}
