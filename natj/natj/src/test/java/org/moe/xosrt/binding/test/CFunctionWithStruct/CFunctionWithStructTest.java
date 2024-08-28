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

package org.moe.xosrt.binding.test.CFunctionWithStruct;

import org.moe.xosrt.binding.test.CFunctionWithStruct.testClasses.nativeVector2;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CFunctionWithStructTest extends XrtTest {

	@Test
	public void testMake() {
        nativeVector2 v = nativeVector2.make(1.5f, 2.5f);
		assertEquals(v.getV(0), 1.5f, 0.01f);
		assertEquals(v.getV(1), 2.5f, 0.01f);
	}
	
	@Test
	public void testAdd() {
        nativeVector2 vv = new nativeVector2();
		vv.setV(1.5f, 0);
		vv.setV(2.5f, 1);
		vv = nativeVector2.Vector2AddScalar(vv, 2.0f);
		
		assertEquals(vv.getV(0), 3.5f, 0.01f);
		assertEquals(vv.getV(1), 4.5f, 0.01f);
	}

	@Test
	public void testNegate() {
        nativeVector2 vv = new nativeVector2();
		vv.setV(1.5f, 0);
		vv.setV(2.5f, 1);
		vv = nativeVector2.negate(vv);
		
		assertEquals(vv.getV(0), -1.5f, 0.01f);
		assertEquals(vv.getV(1), -2.5f, 0.01f);
	}
}
