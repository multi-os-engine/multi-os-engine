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

package org.moe.xosrt.binding.test.directCallTest.testClasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import org.moe.xosrt.binding.test.common.NativeCGPoint;

@ObjCClassName("NotMockedDCallClass")
public class NotMockedDCallClass extends NativeObject {
	
	static {
		NatJ.register();
	}

	protected NotMockedDCallClass(Pointer peer) {
		super(peer);
	}


//	@NativeSelector("someAtherFunction")
//	public native void someOtherFunction();
//	
//	@NativeSelector("someFunction")
//	public native void someFunction();
//	
//	@NativeSelector("someFuncWithInts:")
//	public native void someFuncWithInts(int i);
//	
//	@NativeSelector("someStatFunc")
//	public static native void someStatFunc();
//	
//	@NativeSelector("someFuncWithInts:wBool:wLong:")
//	public  native long someFuncWithIntswBoolwLong(int a, boolean b, long l);
//	
//	@NativeSelector("someFuncStatWithInts:wLong:")
//	public static native long someStatFuncLong(long a, long l);
//	
//	@NativeSelector("someStringFunc:")
//	public  native String someStringFunc(String s);
//		
//	@NativeSelector("someStringFuncRInt:")
//	public  native int someStringFuncRInt(String s);
		
	@Selector("someStructFunc:")
	@ByValue
	public  native NativeCGPoint someStructFunc(@ByValue NativeCGPoint s);
}
