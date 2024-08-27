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

import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.common._NSObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClass;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class DirectCallTest extends XrtTest {
	
	@Test
    @Ignore 
	public void testProducingNativeObjects() throws InterruptedException {
		DirectCallClass testClass = DirectCallClass.alloc().initWithMock(true);
		Set<WeakReference<_NSObject>> weakList = new HashSet<WeakReference<_NSObject>>();
		for(int i = 0; i<1000; i++)
		{
			_NSObject myObj = testClass.producingNativeObjects(); 
			WeakReference<_NSObject> wr = new WeakReference(myObj);
			if(wr != null) weakList.add(wr);
			System.gc();
			
		}
		Thread.sleep(1000);
		int j = 0;
		for(WeakReference<_NSObject> wr : weakList)
		{
			if (wr != null) {
				_NSObject no = wr.get();
				if(j < 10)
				assertEquals(no,null);
				else break;
			}
			j++;
		}
	}
}
