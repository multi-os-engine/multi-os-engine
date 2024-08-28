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

package org.moe.xosrt.binding.test.CArrayTest.TestClasses;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import apple.NSObject;

@Library("TestClasses")
@Generated
@Runtime(CRuntime.class)
public final class CArrayClass {
	
	static {
		NatJ.register();
	}


	@CFunction
	@Generated
	public static native void initCharArray(BytePtr testObject);
//	@NativeCFunction("initBooleanArray") 	public static native void initBooleanArray(BoolArray arr);
//	@NativeCFunction("initIntArray") 		public static native void initIntArray(IntArray arr);
//	@NativeCFunction("initFloatArray") 		public static native void initFloatArray(FloatArray arr);
//	@NativeCFunction("initDoubleArray") 	public static native void initDoubleArray(DoubleArray arr);
//	@NativeCFunction("initLongArray") 		public static native void initLongArray(LongArray arr);
//	@NativeCFunction("initShortArray") 		public static native void initShortArray(ShortArray arr);

	@CFunction("returnCharArray")
	@Generated
	public static native BytePtr returnCharArray();
//	@NativeCFunction("returnBooleanArray") 	public static native BoolArray returnBooleanArray();
//	@NativeCFunction("returnIntArray") 		public static native IntArray returnIntArray();
//	@NativeCFunction("returnFloatArray") 	public static native FloatArray returnFloatArray();
//	@NativeCFunction("returnDoubleArray") 	public static native DoubleArray returnDoubleArray();
//	@NativeCFunction("returnLongArray") 	public static native LongArray returnLongArray();
//	@NativeCFunction("returnShortArray") 	public static native ShortArray returnShortArray();

	@CFunction("initCharPtrArray")
	@Generated
	public static native void initCharPointerArray(Ptr<BytePtr> testObject );

	@CFunction
	@Generated
	public static native Ptr<CharPtr> returnCharPtrArray();
	
	@CFunction("initNSStringArray")
	@Generated
	public static native void initNSObjectArray( Ptr<NSObject> strArr );
	
	@CFunction("argumentToRet")
	@Generated
	public static native VoidPtr argumentByValueReturnByRef(VoidPtr arr);
	
	@CFunction("argumentToRet")
	@Generated
	public static native VoidPtr argumentByValueReturnByValue(LongPtr arr);
	
	@CFunction("argumentToRet")
	@Generated
	public static native VoidPtr argumentByRefReturnByValue( LongPtr arr);
	@CFunction("argumentToRet")
	@Generated
	public static native LongPtr argumentByRefReturnByRef( LongPtr arr );
	@CFunction("argumentToRet")
	@Generated
	public static native Ptr<Ptr<Ptr<LongPtr>>> returnComplexPointer(Ptr<Ptr<Ptr<LongPtr>>> ptr);
	
	@CFunction("argumentToRet")
	@Generated
	public static native VoidPtr structPointerToReturn(IntPtr toRet );

	@CFunction
	@Generated
	public static native CharPtr getTail( CharPtr arr, long index);

}
