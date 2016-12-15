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

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PlatformUI;
import org.moe.utils.logger.LoggerFactory;

public class MessageFactory {

	private static final Logger LOG = LoggerFactory.getLogger(MessageFactory.class);

	private static final String MULTI_OS_ENGINE_ERROR_TITLE = "Multi-OS Engine Error";
	private static final String ID = "com.migeran.moe";

	@Deprecated
	public static Object showErrorDialog(String t, String message) {
		return showErrorDialog(message);
	}

	public static Object showErrorDialog(String message) {
		// Error dialogs without exceptions are only informal
		LOG.debug(MULTI_OS_ENGINE_ERROR_TITLE + ": " + message);
		MessageDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), MULTI_OS_ENGINE_ERROR_TITLE, message);
		return null;
	}

	public static Object showErrorDialog(String message, Throwable t) {
		if (t == null) {
			return showErrorDialog(message);
		} else {
			// Always log dialogs with exceptions
			LOG.error(MULTI_OS_ENGINE_ERROR_TITLE + ": " + message, t);
			Status status = getStatus(IStatus.ERROR, "Internal error", t);
			ErrorDialog.openError(PlatformUI.getWorkbench().getDisplay().getActiveShell(), MULTI_OS_ENGINE_ERROR_TITLE, message, status);
			return null;
		}
	}
	
	public static void showInfoDialog(String title, String message) {
		MessageDialog.openInformation(PlatformUI.getWorkbench().getDisplay().getActiveShell(), title, message);
	}

	public static Status getError(String message) {
		return getError(message, null);
	}

	public static Status getError(String message, Throwable ex) {
		return getStatus(IStatus.ERROR, message, ex);
	}

	private static Status getStatus(int severity, String message, Throwable ex) {
		return new Status(severity, ID, message, ex);
	}

}
