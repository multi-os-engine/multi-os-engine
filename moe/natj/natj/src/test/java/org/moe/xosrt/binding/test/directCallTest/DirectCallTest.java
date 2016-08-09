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


import org.moe.natj.general.NatJ;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.impl.PtrFactory;
import org.moe.natj.objc.ObjCException;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.SEL;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.IdStub;
import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.ArgTest;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClass;
import org.moe.xosrt.binding.test.directCallTest.testClasses.DirectCallClassCFunctions;
import org.junit.Ignore;
import org.junit.Test;

import java.lang.reflect.Method;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class DirectCallTest extends XrtTest {
	
	@Test
	public void baseInstanceMethodCallTest() {
		
		//expected return value
		int expVal = 42;
		
		DirectCallClass testObject = DirectCallClass.alloc();
		//method call
		testObject = testObject.init();
		int res = testObject.javaMethodDCall();
		
		//verification of method call
		assertEquals(expVal, res);
	 
	}
	
	@Test
	public void argumentTestChar() {
		
		//expected return value
		byte expArg = (byte)'c';
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		byte res = testObject.javaMethodDCallWithCharArg(expArg);
				
		//verification of method call
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestShort() {
		
		//expected return value
		short expArg = -32768;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		short res = testObject.javaMethodDCallWithShortArg(expArg);
				
		//verification of method call
		assertEquals( expArg, res);
	}
	
	@Test
	public void argumentTestInt() {
		
		//expected return value
		int expArg = -2147483648;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		int res = testObject.javaMethodDCallWithIntArg(expArg);
		
		assertEquals(expArg, res);
	}
	
	@Test
	public void argumentTestLong() {
		
		//expected return value
		int expArg = -2147483648;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		int res = testObject.javaMethodDCallWithLongArg(expArg);
		
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestLongLong() {
		
		//expected return value
		long expArg = -9223372036854775807L;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		long res = testObject.javaMethodDCallWithLongLongArg(expArg);
				
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestUChar() {
		
		//expected return value
		char expArg = 255;

		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		char res = testObject.javaMethodDCallWithUCharArg(expArg);
				
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestUShort() {
		
		//expected return value
		int expArg = 65535;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		int res = testObject.javaMethodDCallWithUShortArg(expArg);
				
		//verification of method call
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestUInt() {
		
		//expected return value
		long expArg = 4294967295L;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		long res = testObject.javaMethodDCallWithUIntArg(expArg);
				
		//verification of method call
		assertEquals(expArg, res);
	}
	
	@Test
	public void argumentTestULong() {
		
		//expected return value
		long expArg = 9223372036854775807L;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		long res = testObject.javaMethodDCallWithULongArg(expArg);
		
		//verification of method call
		assertEquals(expArg, res);
	}
	
	@Test
	public void argumentTestULongLong() {
		
		//expected return value
		long expArg = 9223372036854775807L;

		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		long res = testObject.javaMethodDCallWithULongLongArg(expArg);
				
		//verification of method call
		assertEquals(expArg, res);

	}
	
	@Test
	public void argumentTestFloat() {
		
		//expected return value
		float expArg = 777.666f;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		float res = testObject.javaMethodDCallWithFloatArg(expArg);
				
		//verification of method call
		assertEquals(expArg, res, 0.01);
	}
	
	@Test
	public void argumentTestDouble() {
		
		//expected return value
		double expArg = 777.666666d;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		double res = testObject.javaMethodDCallWithDoubleArg(expArg);
				
		assertEquals(expArg, res,  0.000001);

	}
	
	@Test
	public void argumentTestBoolean() {
		
		//expected return value
		boolean expArg = true;
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		boolean res = testObject.javaMethodDCallWithBooleanArg(expArg);
		
		assertEquals(expArg, res);
	}
	
	@Test
	public void returnTestChar() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 65408 , testObject.javaMethodDCallWithCharRet());

	}
	
	@Test
	public void returnTestShort() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( -32768 , testObject.javaMethodDCallWithShortRet());

	}
	
	@Test
	public void returnTestInt() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( -2147483648 , testObject.javaMethodDCallWithIntRet());

	}
	
	@Test
	public void returnTestLong() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( -9223372036854775808L , testObject.javaMethodDCallWithLongRet());

	}
	
	@Test
	public void returnTestLongLong() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( -9223372036854775808L , testObject.javaMethodDCallWithLongLongRet());

	}
	
	@Test
	public void returnTestUChar() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 255 , testObject.javaMethodDCallWithUCharRet());

	}
	
	@Test
	public void returnTestUShort() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 65535 , testObject.javaMethodDCallWithUShortRet());

	}
	
	@Test
	public void returnTestUInt() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 4294967295L , testObject.javaMethodDCallWithUIntRet());

	}
	
	@Test
	public void returnTestULong() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		long exp;
		if (NatJ.is64Bit()) {
			exp = Long.MAX_VALUE * 2L + 1L;
		} else {
			exp = Integer.MAX_VALUE * 2L + 1L;
		}
		//expected return value defined in native part
		assertEquals( exp , testObject.javaMethodDCallWithULongRet());


	}
	
	@Test
	public void returnTestULongLong() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		

		long exp = 9223372036854775807L * 2L + 1L;
		
		//expected return value defined in native part
		assertEquals( exp , testObject.javaMethodDCallWithULongLongRet());
	}
	
	@Test
	public void returnTestFloat() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 0.001, 123.456f , testObject.javaMethodDCallWithFloatRet());

	}
	
	@Test
	public void returnTestDouble() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( 0.000001, 456.789 , testObject.javaMethodDCallWithDoubleRet());

	}
	
	@Test
	public void returnTestBoolean() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( true , testObject.javaMethodDCallWithBooleanRet());

	}
	
	
	@Test
	public void argumentTestObject() {
		
		//expected return value
		NSObject expArg = IdStub.alloc().init();
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		IdStub res = (IdStub) testObject.javaMethodDCallWithObjectArg(expArg);
		
		assertEquals(expArg, res);
	}
	
	@Test
	public void argumentTestWithTwoParams() {
		
		//expected return value
		long expArg1 = 100500L;
		NSObject expArg2 = NSObject.alloc().init();
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		NSObject res = testObject.javaMethodDCallWithTwoParams( expArg1, expArg2);
				
		//verification of method call
		assertTrue( res.getPeerPointer() > 0);

	}
	
	@Test
	public void returnTestObject() {

		DirectCallClass testObject = DirectCallClass.alloc().init();
		
		//expected return value defined in native part
		assertEquals( testObject , testObject.javaMethodDCallWithObjectRet());

	}
	
	
	@Test
	public void argumentTestSelector() throws NoSuchMethodException, SecurityException {
		//expected return value
		Method method = Long.class.getMethod("longValue");
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		testObject.javaMethodDCallWithMethodArg(method);
	}

	@Test
	public void argumentTestJavaSelector() throws NoSuchMethodException, SecurityException {
		
		//expected return value
		ArgTest at = ArgTest.alloc().init();
		
		//method call
		Method longValue = ArgTest.class.getMethod("testLong");
		DirectCallClass testObject = DirectCallClass.alloc().init();
		long ret = testObject.javaMethodDCallWithJavaMethodArg(at, new SEL(longValue));
				
		//assert
		assertEquals(100500L, ret);

	}
	
	
	@Test
	public void argumentTestJavaSelectorSelf() throws NoSuchMethodException, SecurityException {
		
		//expected return value
		long longa = 100500L;

		//method call
		//Method longValue = Long.class.getMethod("longValue");
		DirectCallClass testObject = DirectCallClass.alloc().init();
		Method longValue = DirectCallClass.class.getMethod("forDirectCallCallback");
		long ret = testObject.javaMethodDCallWithJavaMethodArg(testObject, new SEL(longValue));
				
		//assert
		assertEquals( longa , ret);

	}
	
	@Test
	@Ignore
	/** TODO: Cyclic static section dependency CRuntime -> Natj -> ObjCObjectPtrImpl -> CRuntime.
	 *  TODO: Lead to ObjCObjectPtrImpl.ELEM_SIZE is 0;
	 *  TODO: Ptr<? extends ObjCObject> doesn't work. MOE limitation
	 */
	public void argumentTestToIdPtrBase() {

		//expected argument value
		NSObject firstObj = NSObject.alloc().init();
		Ptr<ObjCObject> ptr =  PtrFactory.newGuardedObjectReference(ObjCObject.class);

		ptr.set(firstObj);
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		testObject.javaMethodDCallWithToIdPtrBase(ptr);

		//assert
		assertThat( firstObj, not(ptr.get()));
	}
	
	@Test
	@Ignore
	/** TODO: Cyclic static section dependency CRuntime -> Natj -> ObjCObjectPtrImpl -> CRuntime.
	 *  TODO: Lead to ObjCObjectPtrImpl.ELEM_SIZE is 0;
	 *  TODO: Ptr<? extends ObjCObject> doesn't work. MOE limitation
	 */
	public void argumentTestToIdPtrMatch() {
		
		//expected argument value
		DirectCallClass obj = DirectCallClass.alloc().init();

		Ptr<ObjCObject> ptr = PtrFactory.newGuardedObjectReference(ObjCObject.class);
		ptr.set(obj);
		
		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		testObject.javaMethodDCallWithToIdPtrArg(ptr);
				
		//assert
		assertEquals( testObject , ptr.get());

	}
	
	@Test
	@Ignore
	/** TODO: Cyclic static section dependency CRuntime -> Natj -> ObjCObjectPtrImpl -> CRuntime.
	 *  TODO: Lead to ObjCObjectPtrImpl.ELEM_SIZE is 0;
	 *  TODO: Ptr<? extends ObjCObject> doesn't work. MOE limitation
	 */
	public void argumentTestTwoIdPtrs() {
		
		NSObject arg = NSObject.alloc().init();
		Ptr<ObjCObject> ptr1 = PtrFactory.newGuardedObjectReference(ObjCObject.class);
		
		ptr1.set(arg);
		DirectCallClass secondObj = DirectCallClass.alloc().init();
		//IdPtr<DirectCallClass> ptr2 = new IdPtr<DirectCallClass>(secondObj);
		Ptr<DirectCallClass> ptr2 = (Ptr<DirectCallClass>) PtrFactory.newGuardedObjectReference(DirectCallClass.class);
		ptr2.set(secondObj);

		//method call
		DirectCallClass testObject = DirectCallClass.alloc().init();
		testObject.javaMethodDCallWithTwoIdPtrArgs(ptr1, ptr2);
				
		//assert
		assertEquals( secondObj, ptr1.get());
		assertEquals( testObject , ptr2.get());

	}
	
	
	@Test
	public void returnTestSelector() throws NoSuchMethodException, SecurityException {
		
		DirectCallClass testObject = DirectCallClass.alloc().init();
		Method method = testObject.getClass().getMethod("javaMethodDCallWithSelectorRet");
		
		//expected return value defined in native part
		SEL str2 = testObject.javaMethodDCallWithSelectorRet();
		assertTrue(str2.getPeerPointer() > 0);
		
	}
	
	@Test
	public void nativeTestFunctionTest() {
		DirectCallClassCFunctions.nativeTestFunction();
	}

	@Test
	public void nativeTestFunctionTakesIntTest() {
		DirectCallClassCFunctions.nativeTestFunctionTakesInt(123);
	}

	@Test
	public void nativeTestFunctionTakes2DoublesRetsDoubleTest() {
		double res = DirectCallClassCFunctions.nativeTestFunctionTakes2DoublesRetsDouble(100.0, 200.0);
		assertEquals(20000.0, res, 0.1);
	}

	@Test
	public void nativeTestFunctionTakes2StructsRetsStruct() {
		NativeCGPoint p1 = new NativeCGPoint(1.0, 2.0);
		NativeCGPoint p2 = new NativeCGPoint(3.0, 4.0);
		NativeCGPoint res = DirectCallClassCFunctions.nativeTestFunctionTakes2StructsRetsStruct(p1, p2);
		assertEquals(4.0, res.getX(), 0.01);
		assertEquals(6.0, res.getY(), 0.01);
	}
	
	@Test
	public void nativeTestRaiseException() {
		DirectCallClass testClass = DirectCallClass.alloc().init();
		boolean nativeExceptionCatched = false;
		try
		{
			testClass.raiseExceptionMethod();
		}
		catch (ObjCException ex)
		{
			nativeExceptionCatched = true;
			System.out.println("NativeException:" + ex.getMessage());
			
		}
		assertEquals(true, nativeExceptionCatched);
	}
}
