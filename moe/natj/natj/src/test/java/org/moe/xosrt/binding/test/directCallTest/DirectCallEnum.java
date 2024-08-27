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

import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallEnumClass;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Enums.BaseEnum;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Enums.BaseEnumPtr;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DirectCallEnum extends XrtTest {
	
	private static final int INVOCATION_SKIP = 4;

	@Test
	public void argumentTestBaseEnum() {
		
		DirectCallEnumClass testObject = DirectCallEnumClass.alloc().init();
		
		testObject.javaMethodDCallWBaseEnumArg(BaseEnum.Zero.value());
		testObject.javaMethodDCallWBaseEnumArg(BaseEnum.First.value());
		testObject.javaMethodDCallWBaseEnumArg(BaseEnum.Second.value());

	}
	
	@Test
	public void returnTestBaseEnum() {
		
		DirectCallEnumClass testObject = DirectCallEnumClass.alloc().init();
		
		assertEquals( BaseEnum.Zero.value(), testObject.javaMethodDCallWBaseEnumRet(BaseEnum.Zero.value()));
		assertEquals( BaseEnum.First.value(), testObject.javaMethodDCallWBaseEnumRet(BaseEnum.First.value()));
		assertEquals( BaseEnum.Second.value(), testObject.javaMethodDCallWBaseEnumRet(BaseEnum.Second.value()));

	}
	
	@Test
	public void argumentTestBaseEnumPtr() throws Exception {
		
		BaseEnumPtr ptr = new BaseEnumPtr();
		DirectCallEnumClass.alloc().init().javaMethodDCallWBaseEnumPtrArg(ptr);
		assertEquals(BaseEnum.Second, ptr.getBaseEnum());
		
	}
	
	@Test
	public void returnTestBaseEnumPtr() throws Exception {		
		DirectCallEnumClass argClass = DirectCallEnumClass.alloc().init();
		BaseEnumPtr enumPtr = argClass.javaMethodDCallWBaseEnumPtrRet(BaseEnum.First.value());
		BaseEnum reEnum = enumPtr.getBaseEnum();
		assertEquals( BaseEnum.First, reEnum);

	}

}
