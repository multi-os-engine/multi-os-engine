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

package org.moe.xosrt.binding.test.contextTest.testClasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;


@Runtime(ObjCRuntime.class)
public class Delegate extends NSObject implements Protocol {

    static
    {
		NatJ.register();
    }

	protected Delegate(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	@Generated
	@Owned
	public static native Delegate alloc(); 
	
	@Selector("init")
	public native Delegate init();
	
	@Override
	@Selector("methodWithContext:")
	public void methodWithContext( VoidPtr context) {
		(context.getIntPtr()).setValue(context.getIntPtr().getValue() + 42);
	}

}
