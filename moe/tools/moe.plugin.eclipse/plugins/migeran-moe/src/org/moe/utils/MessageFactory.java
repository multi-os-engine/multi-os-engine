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

package org.moe.utils;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;

public class MessageFactory {

	private static final String ID = "com.migeran.moe";

	public static void showErrorDialog(String title, String message) {
		MessageDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), title, message);
	}

	public static Status getError(String message) {
		return getError(message, null);
	}

	public static Status getError(String message, Exception ex) {
		return getStatus(IStatus.ERROR, message, ex);
	}

	private static Status getStatus(int severity, String message, Exception ex) {
		return new Status(severity, ID, message, ex);
	}

}
