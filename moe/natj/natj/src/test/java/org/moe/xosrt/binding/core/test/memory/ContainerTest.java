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

package org.moe.xosrt.binding.core.test.memory;

import org.moe.xosrt.binding.core.test.memory.testClasses.HoldingContainer;
import org.moe.xosrt.binding.core.test.memory.testClasses.TestObjectWithField;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.ref.WeakReference;
import java.util.HashMap;

import static org.junit.Assert.assertTrue;

@Ignore
public class ContainerTest extends XrtTest {
	
	@Test 
	public void testLost() {
		HashMap<Long, WeakReference<TestObjectWithField>> objs = new HashMap<Long, WeakReference<TestObjectWithField>>();
		HashMap<Long, HoldingContainer> conts = new HashMap<Long, HoldingContainer>();
		
		final int COUNT = 5000;
		
		for (int i = 0; i < COUNT; i++) {
			
			TestObjectWithField to = TestObjectWithField.alloc().init();
			objs.put(to.getPeer().getPeer(), new WeakReference<TestObjectWithField>(to));
			to.setJavaField(to.getPeer().getPeer());
			
			HoldingContainer hc = HoldingContainer.alloc().init();
			conts.put(to.getPeer().getPeer(), hc);
			
			hc.setContained(to);
		}
		System.gc();
		
		for (Long l : objs.keySet()) {
			TestObjectWithField hc = objs.get(l).get();
			assertTrue("java object is lost", hc != null);
			assertTrue("java object is empty", hc.getJavaField() == l);
		}

		for (Long l : conts.keySet()) {
			HoldingContainer hc = conts.get(l);
			TestObjectWithField to = (TestObjectWithField)hc.getContained();
			conts.get(l).setContained(null);
			assertTrue("native object is lost", to.getPeer().getPeer() == l);
		}

		System.gc();
	}
}
