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

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;
import org.moe.runconfig.junit.JUnitEditorTab;

public class LocalLaunchConfigurationTabGroup extends AbstractLaunchConfigurationTabGroup {

	@Override
	public void createTabs(ILaunchConfigurationDialog arg0, String arg1) {
		RunConfigurationEditorLocal launch = new RunConfigurationEditorLocal();
		JUnitEditorTab junit = new JUnitEditorTab();
		junit.setRunConfigurationEditorLocal(launch);
		RunConfigurationEditorRemote remote = new RunConfigurationEditorRemote();
		remote.setRunConfigurationEditorLocal(launch);
		ArgumentsTab arguments = new  ArgumentsTab();
		ILaunchConfigurationTab[] tabs = new ILaunchConfigurationTab[] { launch, junit, remote, arguments };
		setTabs(tabs);
	}

}
