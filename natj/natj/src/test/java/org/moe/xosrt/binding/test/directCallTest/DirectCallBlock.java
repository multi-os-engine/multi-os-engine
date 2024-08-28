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
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.BlockMultipleTwoFloats;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.BlockObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.CharBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlock;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlockRetFloat;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.FloatBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.ObjectBlockRetObject;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.ObjectOnlyBlock;
import org.moe.xosrt.binding.test.directCallTest.testClasses.Blocks.SimpleBlock;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClassWBlocks;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectCallBlock extends XrtTest {
	
	static  String expStr;
	static float floatA;
	static float floatB;
	
	static long first;
	static long second;
	static long third;
	
	static int intA;
	static int intC;
	
	static double doubleB;
	static double doubleD;
	
	static char charA;
	static byte byteB;

	@Test
	public void argumentTestVoidBlock() {
		
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		expStr = "";
		SimpleBlock block = new SimpleBlock()
		{
			public void BlockCallback()
			{
				expStr = "argumentTestVoidBlock block called";
			}			
		};
		
		testObject.DirectCallWBlock(block);
		assertEquals("argumentTestVoidBlock block called", expStr);
	}
	
	
	@Test
	public void argumentTestFloatBlock() {
		
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		floatA = floatB = 0;
		
		FloatBlock block = new FloatBlock()
		{
			public void BlockCallBack( float a, float b)
			{
				//XRTLogger.test("Here in java float block called:" + a + ":" + b);
				floatA = a;
				floatB = b;
			}			
		};
		
		testObject.DirectCallWBlockFloat(block);
		
		//expected output is defined in native part
		assertEquals(10.0, floatA, 0.001);
		assertEquals(20.0, floatB, 0.001);
		
	}
	
	@Test
	public void argumentTestObjectOnlyBlock() {
		
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		
		NSObject fObject = NSObject.alloc().init();
		NSObject sObject = NSObject.alloc().init();
		NSObject tObject = NSObject.alloc().init();
		
		first = second = third = 0;
		
		/*XRTLogger.test("First object id before call:" + fObject.getPeerPointer() +
				"Second object id before call:" + sObject.getPeerPointer() +
				"Third object id before call:" + tObject.getPeerPointer());*/
		
		ObjectOnlyBlock block = new ObjectOnlyBlock()
		{
			@Override
			public void BlockCallBack(NSObject a, NSObject b, NSObject c) {
				
				first = a.getPeerPointer();
				second = b.getPeerPointer();
				third = c.getPeerPointer();
				
				/*XRTLogger.test("First object id after call:" + first +
						"Second object id after call:" + second +
						"Third object id after call:" + third);*/
			}
		};
		
		testObject.DirectCallWObjectOnlyBlock(block, fObject, sObject, tObject);
		
		assertEquals(fObject.getPeerPointer(), first);
		assertEquals(sObject.getPeerPointer(), second);
		assertEquals(tObject.getPeerPointer(), third);
	}
	
	@Test
	public void argumentTestObjectBlock() {
		
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		NSObject argObject = NSObject.alloc().init();
		NSObject sargObject = NSObject.alloc().init();
		NSObject targObject = NSObject.alloc().init();
		
		/*XRTLogger.test("First object:" + argObject.getHandler());
		XRTLogger.test("Second object:" + sargObject.getHandler());
		XRTLogger.test("Third object:" + targObject.getHandler());*/
		
		first = second = third = 0;
		intA = intC = 0;
		doubleB = doubleD = 0;
		
		BlockObject block = new BlockObject()
		{
			@Override
			public void ObjectMethod(int a, double b, NSObject object, int c, double d, NSObject sobject, NSObject tObject) {
				
				first = object.getPeerPointer();
				second = sobject.getPeerPointer();
				third = tObject.getPeerPointer();
				intA = a;
				intC = c;
				doubleB = b;
				doubleD = d;
				
				/*XRTLogger.test("Here in java float block called:" + a + ":" + b + ":" + c +":" + d +
						 ":" + first +
						 ":" + second +
						 ":" + third);*/
			}			
		};
		
		testObject.DirectCallWBlockObject(block, argObject,sargObject, targObject );
		
		assertEquals(argObject.getPeerPointer(), first);
		assertEquals(sargObject.getPeerPointer(), second);
		assertEquals(targObject.getPeerPointer(), third);
		
		//expected output is defined in native part
		assertEquals(15, intA);
		assertEquals(27, intC);
		assertEquals(100.0, doubleB, 0.001);
		assertEquals(350.0, doubleD, 0.001);
		
	}
	
	@Test
	public void TestObjectBlockRetObject() {
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		NSObject argObject = NSObject.alloc().init();
		//XRTLogger.test("First object:" + argObject.getHandler());
		
		ObjectBlockRetObject block = new ObjectBlockRetObject()
		{
			@Override
			public NSObject BlockCallBack(NSObject a) {
				//XRTLogger.test("First object: in BlockCallBack:" + a.getHandler());
				return a;
			}
		};
		
	   NSObject retObject =  testObject.DirectCallWObjectBlockRetObject(block, argObject);
	   assertEquals(argObject, retObject);
	}
	
	@Test
	public void TestFloatBlockRetObject() {
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		
		float a = 15;
		float b = 25;
		NSObject argObject = NSObject.alloc().init();
		floatA = floatB = 0;		
		
		//XRTLogger.test("First object:" + argObject.getHandler());
		
		FloatBlockRetObject block = new FloatBlockRetObject()
		{
			@Override
			public NSObject BlockCallBack(float a, float b, NSObject obj) {
				//XRTLogger.test("TestFloatBlockRetObject called:" + a + ":" + b + " with " + obj);
				floatA = a;
				floatB = b;
				return obj;
			}
		};
		
		NSObject retObject =  testObject.DirectCallFloatBlockRetObject(block, a, b, argObject);
		
		assertEquals(argObject, retObject);
		assertEquals( a, floatA, 0.001);
		assertEquals( b, floatB, 0.001);

	}
	
	
	@Test
	public void TestCharBlockRetObject() {
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		
		char a = 'a';
		byte b = 101;
		NSObject argObject = NSObject.alloc().init();
		
		charA = 0;
		byteB = 0;
		
		//XRTLogger.test("TestCharBlockRetObject object:" + argObject.getHandler());
		
		CharBlockRetObject block = new CharBlockRetObject()
		{
			@Override
			public NSObject BlockCallBack(char a, byte b, NSObject obj) {
				charA = a;
				byteB = b;
				//XRTLogger.test("TestCharBlockRetObject called:" + a + ":" + b + ":" + obj);
				return obj;
			}
		};
		
		NSObject retObject =  testObject.DirectCallCharBlockRetObject(block, a, b, argObject);
		
		assertEquals( argObject, retObject);
		assertEquals( a, charA);
		assertEquals( b, byteB);

	}
	
	@Test
	public void TestFloatBlockRetFloat() {
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		
		float a = 5000;
		byte b = 99;
		float c = 5000;
		NSObject argObject = NSObject.alloc().init();
		first = 0;

		//XRTLogger.test("First object:" + argObject.getHandler());
		
		FloatBlockRetFloat block = new FloatBlockRetFloat()
		{
			@Override
			public float BlockCallBack(float a, byte b, NSObject obj, float c) {
				//XRTLogger.test("TestFloatBlockRetFloat called:" + a + ":" + b + ":" + obj + ":" + c);
				first = obj.getPeerPointer();
				return a+b+c;
			}	
		};
		
		float result =  testObject.DirectCallFloatBlockRetFloat(block, a, b, argObject, c);
		
		assertEquals(argObject.getPeerPointer(), first);
	    assertEquals(a+b+c, result, 0.001);
	  
	}
	
	@Test
	public void TestBlockAsProperty() {
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		expStr = "";
		SimpleBlock block = new SimpleBlock()
		{
			@Override
			public void BlockCallback() {
				expStr = "SimpleBlockCalled";				
			}
		};
		
		testObject.setCompletionBlock(block);
		testObject.DirectCallDerniBlock();
		testObject.DirectCallDerniBlock();
		
		assertEquals(expStr, "SimpleBlockCalled");
		
	}
	
	@Test
	public void FuncPtrTestWithMultipleTwoFloatsBlock()
	{
		DirectCallClassWBlocks testObject = DirectCallClassWBlocks.alloc().init();
		BlockMultipleTwoFloats block = new BlockMultipleTwoFloats()
		{

			@Override
			public float BlockCallBack(float a, float b) {
				return a*b;
			}
			
		};
		
		
		float result = testObject.DirectCallWithBlockMultipleTwoFloats(block, 10, 15);
		
		assertEquals(result, 10*15, 0.1);
	}
}
