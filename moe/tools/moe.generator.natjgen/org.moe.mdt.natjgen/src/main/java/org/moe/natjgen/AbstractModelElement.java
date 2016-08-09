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

abstract class AbstractModelElement {

	/**
	 * Element's name.
	 */
	private String name;

	/**
	 * Editor pass count.
	 */
	private boolean edited = true;

	/**
	 * Creates a new Model Element.
	 * 
	 * @param name
	 *            element's name
	 * @param requiresName
	 *            boolean indicating whether the name can be null or not
	 */
	AbstractModelElement(String name, boolean requiresName) {
		if (requiresName && name == null) {
			throw new NullPointerException();
		}
		this.name = name;
	}

	/**
	 * Returns the element's name.
	 * 
	 * @return the element's name
	 */
	final public String getName() {
		return name;
	}

	/**
	 * Sets the element's name.
	 * 
	 * @param name
	 *            new name
	 */
	final void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns the edited flag.
	 * 
	 * @return the edited flag
	 */
	final public boolean isEdited() {
		return edited;
	}

	/**
	 * Sets the edited flag.
	 */
	final public void setEdited() {
		this.edited = true;
	}

	/**
	 * Clears the edited flag.
	 */
	final public void clearEdited() {
		this.edited = true;
	}

}
