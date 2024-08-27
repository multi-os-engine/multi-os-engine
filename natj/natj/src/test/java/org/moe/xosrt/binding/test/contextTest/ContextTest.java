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

package org.moe.xosrt.binding.test.contextTest;

import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.contextTest.testClasses.Controller;
import org.moe.xosrt.binding.test.contextTest.testClasses.Delegate;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContextTest extends XrtTest {

	@Test
	public void directCallWithContextAsArgument() {
		
		Controller controller = Controller.alloc().init();
		LongPtr context = PtrFactory.newLongReference(100500L);
		controller.setContext(context);
						
		assertEquals(controller.getContext().getLongPtr().getPeer().getPeer(),
				context.getPeer().getPeer());		
	}

	// TODO: Need implemented Delegate class
	@Test
	public void callBackWithContext() {
		
		Delegate delegate = Delegate.alloc().init();
		Controller controller = Controller.alloc().initWithDelegate( delegate );
		controller.setContext(PtrFactory.newLongReference(100500L) );
		
		controller.callDelegate();
		controller.callDelegate();
		controller.callDelegate();
			
		//	callDelegate method calls methodWithContext from delegate
		//	methodWithContext call increase method from context with '42' as argument
		assertEquals( controller.getContext().getLongPtr().getValue() , 100500L + 42*3);	

	}

}
