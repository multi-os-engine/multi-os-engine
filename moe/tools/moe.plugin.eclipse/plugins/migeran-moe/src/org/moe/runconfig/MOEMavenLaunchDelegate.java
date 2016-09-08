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

package org.moe.runconfig;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.m2e.internal.launch.MavenLaunchDelegate;

@SuppressWarnings("restriction")
public class MOEMavenLaunchDelegate extends MavenLaunchDelegate {

	List<String> remoteArguments;

	@Override
	public String getProgramArguments(ILaunchConfiguration configuration) throws CoreException {
		String programArguments = super.getProgramArguments(configuration);
		StringBuilder sb = new StringBuilder();
		sb.append(programArguments);
		if (remoteArguments != null) {
			for (String arg : remoteArguments) {
				sb.append(" " + arg);
			}
		}
		return sb.toString();
	}

	public void setRemoteArguments(List<String> args) {
		this.remoteArguments = args;
	}

}
