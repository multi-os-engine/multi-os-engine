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

/**
 * Argument information in a method
 */
public class CalleeArgument {

	/**
	 * Name of the argument
	 */
	private String name;

	/**
	 * Type of the argument
	 */
	private Type type;

	/**
	 * Additional suffix for the name of the argument (for name collisions)
	 */
	private String suffix = "";

	/**
	 * Create a new Argument.
	 * 
	 * @param name
	 *            the name of the argument
	 * @param type
	 *            the type of the argument
	 */
	public CalleeArgument(String name, Type type) {
		// Check values
		if (name == null || name.length() == 0) {
			throw new RuntimeException("Argument name must have a length greater then 0!");
		}
		if (type == null) {
			throw new RuntimeException("Argument type cannot be null!");
		}

		// Set values
		this.name = name;
		this.type = type;

		if (JavaRestrictions.isReserved(this.name)) {
			pushSuffix();
		}
	}

	/**
	 * Get the raw name of the argument
	 * 
	 * @return argument's name
	 */
	public String getRawName() {
		return name;
	}

	/**
	 * Get the type of the argument
	 * 
	 * @return argument's type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Add additional '_' as suffix for the arguments name
	 */
	public void pushSuffix() {
		suffix += "_";
	}

	/**
	 * Get the full name of the argument, contains the additional suffix
	 * 
	 * @return argument's full name
	 */
	public String getName() {
		return name + suffix;
	}
}
