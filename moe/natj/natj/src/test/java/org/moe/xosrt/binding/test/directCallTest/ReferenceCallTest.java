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

package org.moe.xosrt.binding.test.directCallTest;

import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClassCFunctions;
import org.moe.xosrt.binding.test.directCallTest.testClasses.UpcastMe;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReferenceCallTest extends XrtTest {

	@Test
	public void callByValueChange() {
		//DirectCallClassCFunctions dc = new DirectCallClassCFunctions();
		
		NativeCGPoint p = new NativeCGPoint(1.0, 2.0);
		DirectCallClassCFunctions.nativeTestFunctionTakeStructByValAndChange(p);
		assertEquals(p.getX(), 1.0, 0.01);
		assertEquals(p.getY(), 2.0, 0.01);
	}

	@Test
	public void callByReferenceChange() {
		
		NativeCGPoint p = new NativeCGPoint(1.0, 2.0);
		DirectCallClassCFunctions.nativeTestFunctionTakeStructByRefAndChange(p);
		assertEquals(p.getX(), 5.0, 0.01);
		assertEquals(p.getY(), 6.0, 0.01);
	}

	@Test
	public void callByReferenceReturn() {
		
		NativeCGPoint p = new NativeCGPoint(1.0, 2.0);
		NativeCGPoint q = DirectCallClassCFunctions.nativeTestFunctionTakeStructByRefAndReturn(p);
		assertEquals(p.getX(), 5.0, 0.01);
		assertEquals(p.getY(), 6.0, 0.01);
		assertEquals(q.getX(), 5.0, 0.01);
		assertEquals(q.getY(), 6.0, 0.01);
		p.setX(123.0);
		assertEquals(q.getX(), 123.0, 0.01);
		//assertEquals(p, q);//We do not compare for equality of structures
	}
	
	@Test
	public void RefernceCallObjectsCompare()
	{
		UpcastMe testObject = UpcastMe.alloc().init();
		
		
		
	}
}
