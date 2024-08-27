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

import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.DoublePtr;
import org.moe.natj.general.ptr.FloatPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.LongPtr;
import org.moe.natj.general.ptr.ShortPtr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallPointersClass;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Functions.FunctionMultipleTwoFloats;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Functions.SimpleFunction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectCallTestPointers extends XrtTest {

	@Test
	public void AllPointersTest() {
		DirectCallPointersClass testObject = DirectCallPointersClass.alloc().init();
		FloatPtr floatArg = PtrFactory.newFloatReference(100.20f);
		BoolPtr boolArg = PtrFactory.newBoolReference(false);
		DoublePtr doubleArg = PtrFactory.newDoubleReference(200.35d);
		BytePtr bytePtr = PtrFactory.newByteReference((byte)12);
		IntPtr intArg = PtrFactory.newIntReference(100);
		ShortPtr shortArg = PtrFactory.newShortReference((short) 25);
		LongPtr longArg = PtrFactory.newLongReference(5000000);
		//On native site function will perform *value*3, will turn bool into true
		testObject.DirectCallAllPointers(floatArg, boolArg, doubleArg, bytePtr, intArg, shortArg, longArg);
		assertEquals(100.20f*3, 0.1, floatArg.getValue());
		assertEquals( true, boolArg.getValue());
		assertEquals( 200.35d*3, 0.1, doubleArg.getValue());
		assertEquals( 12*3, bytePtr.getValue());
		assertEquals( 100*3, intArg.getValue());
		assertEquals( (short)25*3, shortArg.getValue());
		assertEquals( 5000000*3, longArg.getValue() );
	}

	@Test
	@Ignore
	public void FuncPtrAsParamTest()
	{
		DirectCallPointersClass testObject = DirectCallPointersClass.alloc().init();
		//FuncPtr ptr = new FuncPtr("nativeTestFunctionTakes2DoublesRetsDouble");

		//double result = testObject.DirectCallWithFunctionPointer(10, 13, ptr);
		//assertEquals(result, 10*13, 0.1);
	}
	
	@Ignore
	@Test
	public void FuncPtrAsReturnAndParamTest()
	{
		DirectCallPointersClass testObject = DirectCallPointersClass.alloc().init();
		FunctionMultipleTwoFloats block = (FunctionMultipleTwoFloats)testObject.DirectCallWithReturnFunctionPointer();
		
		double result = testObject.DirectCallWithFunctionPointer(14, 13, block);
		assertEquals(result, 14*13, 0.1);
	}
	
	@Test
	@Ignore
	public void FuncPtrTest()
	{
		// TODO: ?????????????????
		//FuncPtr ptr = new FuncPtr("Vector2Make");
		
		//assertEquals(ptr.getHandler() > 1, true);
	}
	
	private static String blockCalled = "";
	
	@Test
	public void FuncPtrTestWithSimpleBlock()
	{
		blockCalled="";
		DirectCallPointersClass testObject = DirectCallPointersClass.alloc().init();
		SimpleFunction block = new SimpleFunction()
		{
			@Override
			public void BlockCallback() {
				blockCalled = "SimpleBlockCalled";			
			}			
		};
		
		testObject.DirectCallWithFunctionPointerSimple(block);
		
		assertEquals(blockCalled, "SimpleBlockCalled");
	}
	
    
	@Test
	public void FuncPtrTestWithMultipleTwoFloatsBlock()
	{
		blockCalled="";
		DirectCallPointersClass testObject = DirectCallPointersClass.alloc().init();
		FunctionMultipleTwoFloats block = new FunctionMultipleTwoFloats()
		{

			@Override
			public float BlockCallBack(float a, float b) {
				return a*b;
			}
			
		};
				
		float result = testObject.DirectCallWithFunctionMultipleTwoFloats(block, 10, 15);
		
		assertEquals(result, 10*15, 0.1);
	}
	
	
	
	
}
