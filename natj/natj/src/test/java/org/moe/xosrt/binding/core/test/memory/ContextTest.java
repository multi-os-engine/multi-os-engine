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

import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.contextTest.testClasses.Controller;
import org.moe.xosrt.binding.test.contextTest.testClasses.Delegate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest extends XrtTest {
	
	@Test
	public void callBackWithContextWithGC() {
		
		int count = 10;
		Delegate[] delArr = new Delegate[count];
		Controller[] conArr = new Controller[count];
		
		for ( int i = 0; i < count; i++ ) {
			delArr[i] = Delegate.alloc().init();
			conArr[i] = Controller.alloc().initWithDelegate( delArr[i] );
			conArr[i].setContext( PtrFactory.newWeakIntReference(i) );
		}
		
		System.gc();
		
		for ( int i = 0; i < count; i++ ) {
			conArr[i].callDelegate();
			conArr[i].callDelegate();
			conArr[i].callDelegate();
			
			//	callDelegate method calls methodWithContext from delegate
			//	methodWithContext call increase method from context with '42' as argument
			assertEquals( i + 42*3, conArr[i].getContext().getIntPtr().getValue() );	
		}

	}
}
