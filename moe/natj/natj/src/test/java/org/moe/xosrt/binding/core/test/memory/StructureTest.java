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

import org.moe.xosrt.binding.test.directCallTest.testClasses.AllocDeallocTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClass;
import org.junit.Test;

@SuppressWarnings("unused")
public class StructureTest {
	
	@Test
	public void testGC() {
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 100; i++) {
				DirectCallClass dcc = DirectCallClass.alloc().init();
				AllocDeallocTest adt = AllocDeallocTest.alloc().init();
			}
//			XRTLogger.log.info("Collecting...");
			System.gc();
		}
	}
	
}
