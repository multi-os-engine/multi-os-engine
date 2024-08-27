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

package org.moe.document.xib;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.net.URL;
import java.util.HashSet;

import static org.junit.Assert.*;

public class XibTest {

	private XIB xib;

	@Before
	public void before() {
		if (xib != null) {
			return;
		}
		try {
			URL resourceUrl = getClass().getResource("Test.xib");
			xib = XIBParser.parse(new File(resourceUrl.getFile()));
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testCustomClasses() {
		assertNotNull(xib);

		HashSet<String> set = new HashSet<String>();
		set.add("TestClassOwner");
		set.add("UIResponder");
		set.add("TestView");
		set.add("TestButton");
		set.add("TestRootLevelObject");
		assertEquals(set, xib.getCustomClasses());
	}

	@Test
	public void testType() {
		assertNotNull(xib);
		assertEquals("com.apple.InterfaceBuilder3.CocoaTouch.XIB", xib.getType());
		assertEquals("com.apple.InterfaceBuilder3.CocoaTouch.XIB", XIB.DOCUMENT_IB3_XIB_TYPE);
	}

	@Test
	public void testVersion() {
		assertNotNull(xib);
		assertEquals("3.0", xib.getVersion());
	}

	@Test
	public void testToolsVersion() {
		assertNotNull(xib);
		assertEquals("5053", xib.getToolsVersion());
	}

	@Test
	public void testSystemVersion() {
		assertNotNull(xib);
		assertEquals("13C64", xib.getSystemVersion());
	}

	@Test
	public void testTargetRuntime() {
		assertNotNull(xib);
		assertEquals("iOS.CocoaTouch", xib.getTargetRuntime());
	}

	@Test
	public void testPropertyAccessControl() {
		assertNotNull(xib);
		assertEquals("none", xib.getPropertyAccessControl());
	}

	@Test
	public void testUseAutoLayout() {
		assertNotNull(xib);
		assertTrue(xib.getUseAutolayout());
	}

}
