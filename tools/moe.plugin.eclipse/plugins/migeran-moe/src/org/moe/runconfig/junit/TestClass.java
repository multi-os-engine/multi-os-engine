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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.junit.runner.IVisitsTestTrees;

@SuppressWarnings("restriction")
public class TestClass extends JUnitTest {

	private String name;
	private List<TestMethod> methods;

	public TestClass(String name) {
		this.name = name;
		this.methods = new ArrayList<TestMethod>();
	}

	@Override
	public int countTestCases() {
		return methods.size();
	}

	@Override
	public void sendTree(IVisitsTestTrees trees) {
		trees.visitTreeEntry(getIdentifier(), true, countTestCases());
		for (TestMethod method : methods) {
			method.sendTree(trees);
		}
	}

	@Override
	public String getName() {
		return name;
	}

	public void push(TestMethod method) {
		methods.add(method);
	}

}
