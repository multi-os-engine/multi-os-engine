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

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;

public class MOEProjectBuildConsole {

	public static MessageConsole getBuildConsole() {
		return getConsole("Migeran Multi-OS Engine");
	}

	private static MessageConsole getConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager manager = plugin.getConsoleManager();
		IConsole[] existingConsoles = manager.getConsoles();
		for (int i = 0; i < existingConsoles.length; i++) {
			if (name.equals(existingConsoles[i].getName())) {
				return (MessageConsole)existingConsoles[i];
			}
		}
		// No console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		manager.addConsoles(new IConsole[] {
				myConsole
		});
		return myConsole;
	}

}
