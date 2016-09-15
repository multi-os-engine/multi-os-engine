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

import apple.NSObject;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClass;
import org.moe.xosrt.binding.test.directCallTest.testClasses.NSCopyingData;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectCallProperties extends XrtTest {

	@Test
	public void argumentTestProperties() {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();
		NSObject arg = NSObject.alloc().init();
		testObject.setStringProp(arg);
		NSObject nss = testObject.getNSStringProp();
		assertEquals(arg.getPeerPointer(), nss.getPeerPointer());
	}
	
	@Test
	public void argumentTestStaticProperties() {
		NSObject arg = NSObject.alloc().init();
		DirectCallClass.setStaticStringProp(arg);
		assertEquals(arg.getPeerPointer(), DirectCallClass.getStaticNSStringProp().getPeerPointer());
	}
	
	@Test
	public void testMethodWithInterfaces() {
		
		DirectCallClass testObject = DirectCallClass.alloc().initWithBounds();
		NSCopyingData data = NSCopyingData.alloc();
		data = data.init();
		testObject.setDataCopy(data);
		assertEquals(data, testObject.getDataCopy());
	}
}
