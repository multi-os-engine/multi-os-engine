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

package org.moe.xosrt.binding.test.StaticSections;

import org.moe.xosrt.binding.test.StaticSections.TestClasses.SomeClass;
import org.moe.xosrt.binding.test.StaticSections.TestClasses.SomeController;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class StaticSectionsInit extends XrtTest {

	@Test
	public void returnTestNativeCreatedObject() {

        /**
         * SomeClass was never used before. Static section
         * for SomeClass was not called but this class should
         * be returned from ClassController.
         */
		SomeController testObject = SomeController.alloc().init();
		
		SomeClass expObj = testObject.testStaticSection();
		
		//expected return value defined in native part
		assertTrue( expObj.getPeer().getPeer() != 0);
	}
}
