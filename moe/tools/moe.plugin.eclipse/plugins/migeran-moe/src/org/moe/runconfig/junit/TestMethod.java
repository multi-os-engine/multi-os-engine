/*
 * Copyright (C) 2009 The Android Open Source Project
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

package org.moe.runconfig.junit;

import org.eclipse.jdt.internal.junit.runner.IVisitsTestTrees;
import org.eclipse.jdt.internal.junit.runner.MessageIds;

@SuppressWarnings("restriction")
public class TestMethod extends JUnitTest {

	private String name;
	private String className;
	private boolean ignored = false;

	public TestMethod(String className, String name) {
		this.className = className;
		this.name = name;
	}

	@Override
	public int countTestCases() {
		return 1;
	}

	@Override
	public void sendTree(IVisitsTestTrees trees) {
		trees.visitTreeEntry(getIdentifier(), false, countTestCases());
	}

	@Override
	public String getName() {
		return ignored
				? MessageIds.IGNORED_TEST_PREFIX + String.format("%s(%s)", name, className)
				: String.format("%s(%s)", name, className);
	}

	public void setIgnored(boolean b) {
		this.ignored = b;
	}
	
	@Override
	public int hashCode() {
		return className.hashCode() * 31 + name.hashCode();
	}

}
