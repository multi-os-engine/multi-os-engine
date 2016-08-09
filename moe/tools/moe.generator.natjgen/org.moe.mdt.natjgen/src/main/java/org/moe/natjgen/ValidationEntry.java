/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.natjgen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

class ValidationEntry {

	public static final String PLUGIN_ID = "mdtBuilderPlugin.mdtNatJGen";

	/**
	 * Message level for informal messages
	 */
	public static final int INFO = 0;

	/**
	 * Message level for warning messages
	 */
	public static final int WARNING = 1;

	/**
	 * Message level for error messages
	 */
	public static final int ERROR = 2;

	/**
	 * Level of the message
	 */
	private final int level;

	/**
	 * Message
	 */
	private final String message;

	/**
	 * Creates a {@link ValidationEntry}
	 * 
	 * @param level
	 *            message level
	 * @param message
	 *            message
	 */
	public ValidationEntry(int level, String message) {
		this.level = level;
		this.message = message;
	}

	/**
	 * Creates a {@link ValidationEntry} with a key
	 * 
	 * @param level
	 *            message level
	 * @param message
	 *            message
	 * @param keypath
	 *            keypath
	 */
	public ValidationEntry(int level, String message, String... keypath) {
		if (keypath == null || keypath.length == 0) {
			this.level = level;
			this.message = message;
		} else {
			StringBuilder path = new StringBuilder(message);
			path.append(" (Key path: ");
			List<String> elems = Arrays.asList(keypath);
			Iterator<String> it = elems.iterator();
			while (it.hasNext()) {
				path.append(it.next());
				if (it.hasNext()) {
					path.append(" > ");
				}
			}
			path.append(")");

			this.level = level;
			this.message = path.toString();
		}
	}

	/**
	 * Returns the level of the message
	 * 
	 * @return level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * Returns the message
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Returns the level as a String value
	 * 
	 * @return level as String
	 */
	public String getLevelAsString() {
		switch (level) {
		case INFO:
			return "Info";
		case WARNING:
			return "Warning";
		case ERROR:
			return "Error";
		default:
			return "Unknown";
		}
	}

	/**
	 * Creates a {@link MultiStatus} object representing a list of
	 * {@link ValidationEntry} objects
	 * 
	 * @param entries
	 *            list of {@link ValidationEntry} object
	 * @param levelInMessage
	 *            true if each message should contain its severity level
	 * @return new {@link MultiStatus} object
	 */
	public static MultiStatus createMultiStatus(final List<ValidationEntry> entries, boolean levelInMessage) {
		MultiStatus ms = new MultiStatus(PLUGIN_ID, 0, "Configuration has problems in it", null);

		for (ValidationEntry e : entries) {
			Status s = e.createStatus(levelInMessage);
			ms.add(s);
		}

		return ms;
	}

	/**
	 * Creates a {@link Status} object representing the caller
	 * {@link ValidationEntry}
	 * 
	 * @param levelInMessage
	 *            true if the message should contain the severity level
	 * @return new {@link Status} object
	 */
	public Status createStatus(boolean levelInMessage) {
		int sev = 0;
		switch (getLevel()) {
		case ValidationEntry.INFO:
			sev = IStatus.INFO;
			break;
		case ValidationEntry.WARNING:
			sev = IStatus.WARNING;
			break;
		case ValidationEntry.ERROR:
			sev = IStatus.ERROR;
			break;
		}
		if (levelInMessage) {
			return new Status(sev, PLUGIN_ID, getLevelAsString() + ": " + getMessage());
		} else {
			return new Status(sev, PLUGIN_ID, getMessage());
		}
	}

	@Override
	public String toString() {
		switch (level) {
		case INFO:
			return "Info: " + message;
		case WARNING:
			return "Warning: " + message;
		case ERROR:
			return "Error: " + message;
		default:
			return "Unknown: " + message;
		}
	}

	/**
	 * Tells whether the list of {@link ValidationEntry} objects contains
	 * entries with level set to ERROR
	 * 
	 * @param entries
	 *            List to check
	 * @return true if list contains at least one {@link ValidationEntry} with
	 *         level set to ERROR
	 */
	public static boolean containsErrors(final List<ValidationEntry> entries) {
		for (ValidationEntry entry : entries) {
			if (entry.getLevel() == ERROR) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Tells whether the list of {@link ValidationEntry} objects contains
	 * entries with level set to WARNING
	 * 
	 * @param entries
	 *            List to check
	 * @return true if list contains at least one {@link ValidationEntry} with
	 *         level set to WARNING
	 */
	public static boolean containsWarnings(final List<ValidationEntry> entries) {
		for (ValidationEntry entry : entries) {
			if (entry.getLevel() == WARNING) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Tells whether the list of {@link ValidationEntry} objects contains
	 * entries with level set to WARNING or ERROR
	 * 
	 * @param entries
	 *            List to check
	 * @return true if list contains at least one {@link ValidationEntry} with
	 *         level set to WARNING or ERROR
	 */
	public static boolean containsWarningsOrErrors(final List<ValidationEntry> entries) {
		for (ValidationEntry entry : entries) {
			if (entry.getLevel() == WARNING || entry.getLevel() == ERROR) {
				return true;
			}
		}
		return false;
	}
}
