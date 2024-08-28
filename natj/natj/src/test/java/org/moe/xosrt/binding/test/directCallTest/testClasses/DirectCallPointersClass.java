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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Functions.FunctionMultipleTwoFloats;

@ObjCClassName("DirectCallPointersClass")
public class DirectCallPointersClass extends NSObject {
	
	static {
		NatJ.register();
	}

	protected DirectCallPointersClass(Pointer peer) {
		super(peer);
	}
	
	@Selector("alloc")
	@Generated
	@Owned
	public static native DirectCallPointersClass alloc();
	
	@Selector("init")
	public native DirectCallPointersClass init();
	
	@Selector("DirectCallAllPointers:wBool:wDouble:wByte:wInt:wShort:wLong:")
	public native void DirectCallAllPointers(FloatPtr floatArg, BoolPtr boolArg, DoublePtr doubleArg,
											 BytePtr bytePtr, IntPtr intArg, ShortPtr shortArg, LongPtr longArg);
	
	@Selector("DirectCallCharPtrPtr:")
	public native void DirectCallCharPtrPtr( Ptr<CharPtr> spp );
	
	@Selector("DirectCallWithFunctionPointer:sDouble:funcPtr:")
	public native double DirectCallWithFunctionPointer(double a, double b, @FunctionPtr(name = "BlockCallBack") Object object);
	
	@Selector("DirectCallWithReturnFncPointer")
	public native @FunctionPtr FunctionMultipleTwoFloats DirectCallWithReturnFunctionPointer();
	
	@Selector("DirectCallWithFunctionPointer:")
	public native void DirectCallWithFunctionPointerSimple(@FunctionPtr(name = "BlockCallback") Object object);
	
	@Selector("DirectCallWithFunctionPointer:FFloat:SFloat:")
	public native float DirectCallWithFunctionMultipleTwoFloats(@FunctionPtr(name = "BlockCallBack") FunctionMultipleTwoFloats object, float a, float b);
	
	
	
}
