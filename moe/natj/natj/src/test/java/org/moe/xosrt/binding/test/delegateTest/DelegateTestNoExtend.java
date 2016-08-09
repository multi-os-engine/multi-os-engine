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

package org.moe.xosrt.binding.test.delegateTest;

import org.moe.natj.general.NativeObject;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.XrtTest;
import org.moe.xosrt.binding.test.common.xNSString;
import org.moe.xosrt.binding.test.delegateTest.testClasses.BaseController;
import org.moe.xosrt.binding.test.delegateTest.testClasses.delegates.BaseNoExtend;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

// TODO: I cannot run these tests
public class DelegateTestNoExtend extends XrtTest {

	@Test
	
	public void setBaseDelegate() {

		//creation of controller object
		BaseController testObject = BaseController.alloc().init();

		//creation of a mock object for delegate
		BaseNoExtend delegateBase = new BaseNoExtend();

		//setting the delegate object
		testObject.setBaseDelegate(delegateBase);

		//call delegate method
		testObject.callMethodBase();

		//verification of method calls
//		verify(delegateBase, times(1)).javaMethodBase();
		assertEquals(true, delegateBase.argMethodBaseCalled);

	}

	@Test

	public void initWithBaseDelegate() {

		//creation of mock object for delegate
		BaseNoExtend delegateBase = new BaseNoExtend();

		//initialization with delegate object
		BaseController testObject = BaseController.alloc().initWithBaseDelegate(delegateBase);

		//call delegate method
		testObject.callMethodBase();

		//verification of method calls
	//	verify(delegateBase, times(1)).javaMethodBase();
		assertEquals(true, delegateBase.argMethodBaseCalled);
	}

	BaseNoExtend globalBaseDelegate;
	BaseController globalTestObject;

	@Before
	public void beforeTestFunction() {
		globalBaseDelegate = new BaseNoExtend();
		globalTestObject = BaseController.alloc().initWithBaseDelegate(globalBaseDelegate);

		//checking delegate's state
		//verifyZeroInteractions(globalBaseDelegate);
	}

	@After
	public void afterTestFunction() {
	}

	@Test

	public void argumentTestChar() {

		//expected return value
		char expArg = 'c';

		//call delegate method
		globalTestObject.callMethodBaseWithCharArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithCharArg(expArg);
        assertEquals(expArg, BaseNoExtend.argMethodBaseWithCharArg);
	}

	@Test

	public void argumentTestShort() {

		//expected return value
		short expArg = -32768;

		//call delegate method
		globalTestObject.callMethodBaseWithShortArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithShortArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithShortArg);
	}

	@Test
	public void argumentTestInt() {

		//expected return value
		int expArg = -2147483648;

		//call delegate method
		globalTestObject.callMethodBaseWithIntArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithIntArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithIntArg);
	}

	@Test

	public void argumentTestLong() {

		//expected return value
		long expArg = -9223372036854775807L;

		//call delegate method
		globalTestObject.callMethodBaseWithLongArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithLongArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithLongArg);
	}

	@Test
	public void argumentTestLongLong() {

		//expected return value
		long expArg = -9223372036854775807L;

		//call delegate method
		globalTestObject.callMethodBaseWithLongLongArg(expArg);

//		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithLongLongArg(expArg);
//
		//verification of method calls
		assertEquals(expArg, BaseNoExtend.argForBaseWithLongLongArg);

	}

	@Test
	public void argumentTestUChar() {

		//expected return value
		char expArg = 255;

		//call delegate method
		globalTestObject.callMethodBaseWithUCharArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithUCharArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithUCharArg);
	}

	@Test
	public void argumentTestUShort() {

		//expected return value
		int expArg = 65535;

		//call delegate method
		globalTestObject.callMethodBaseWithUShortArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithUShortArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithUShortArg);
	}

	@Test
	public void argumentTestUInt() {

		//expected return value
		long expArg = 4294967295L;

		//call delegate method
		globalTestObject.callMethodBaseWithUIntArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithUIntArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithUIntArg);
	}

	@Test
	public void argumentTestULong() {

		//expected return value
		long expArg = 100500L;

		//call delegate method
		globalTestObject.callMethodBaseWithULongArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithULongArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithULongArg);
	}

	@Test
	public void argumentTestULongLong() {

		//expected return value
		long expArg = 100500L;

		//call delegate method
		globalTestObject.callMethodBaseWithULongLongArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithULongLongArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithULongLongArg);
	}


	@Test
	public void argumentTestFloat() {

		//expected return value
		float expArg = 777.666f;

		//call delegate method
		globalTestObject.callMethodBaseWithFloatArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithFloatArg(expArg);

		assertEquals(expArg, BaseNoExtend.argMethodBaseWithFloatArg, 0.1f);
	}

	@Test
	public void MyNewargumentTestFloat() {

		//expected return value
		float expArg = 777.666f;
		BaseNoExtend delegate = new BaseNoExtend();
		BaseController contr = BaseController.alloc().initWithBaseDelegate(delegate);
		//call delegate method
		contr.callMethodBaseWithFloatArg(expArg);


	}

	@Test
	public void argumentTestDouble() {

		//expected return value
		double expArg = 777.666666d;

		//call delegate method
		globalTestObject.callMethodBaseWithDoubleArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithDoubleArg(expArg);
		assertEquals(expArg, BaseNoExtend.argMethodBaseWithDoubleArg, 0.1);
	}

	@Test
	public void argumentTestBoolean() {

		//expected return value
		boolean expArg = true;

		//call delegate method
		globalTestObject.callMethodBaseWithBooleanArg(expArg);

		//verification of method calls
		//verify(globalBaseDelegate, times(1)).javaMethodBaseWithBooleanArg(expArg);

		assertEquals(expArg, BaseNoExtend.argMethodBaseWithBooleanArg);

	}

	@Test

	public void returnTestChar() {

		//expected return value
		char expRet = 'r';

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithCharRet()).toReturn(expRet);

		//call delegate method
		char ret = globalTestObject.callMethodBaseWithCharRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestShort() {

		//expected return value
		short expRet = -32768;

		//stub method
	//	stub(globalBaseDelegate.javaMethodBaseWithShortRet()).toReturn(expRet);

		//call delegate method
		short ret = globalTestObject.callMethodBaseWithShortRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test
	public void returnTestInt() {

		//expected return value
		int expRet = -2147483648;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithIntRet()).toReturn(expRet);

		//call delegate method
		int ret = globalTestObject.callMethodBaseWithIntRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestLong() {

		//expected return value
		long expRet = -9223372036854775807L;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithLongRet()).toReturn(expRet);

		//call delegate method
		long ret = globalTestObject.callMethodBaseWithLongRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestLongLong() {

		//expected return value
		long expRet = -9223372036854775807L;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithLongLongRet()).toReturn(expRet);

		//call delegate method
		long ret = globalTestObject.callMethodBaseWithLongLongRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestUChar() {

		//expected return value
		char expRet = 255;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithUCharRet()).toReturn(expRet);

		//call delegate method
		char ret = globalTestObject.callMethodBaseWithUCharRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test
	public void returnTestUShort() {

		//expected return value
		int expRet = 65535;

		//stub method
		//globalBaseDelegate.javaMethodBaseWithUShortRet()).toReturn(expRet);

		//call delegate method
		int ret = globalTestObject.callMethodBaseWithUShortRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestUInt() {

		//expected return value
		long expRet = 4294967295L;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithUIntRet()).toReturn(expRet);

		//call delegate method
		long ret = globalTestObject.callMethodBaseWithUIntRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestULong() {

		//expected return value
		long expRet = 100500L;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithULongRet()).toReturn(expRet);

		//call delegate method
		long ret = globalTestObject.callMethodBaseWithULongRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestULongLong() {

		//expected return value
		long expRet = 100500L;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithULongLongRet()).toReturn(expRet);

		//call delegate method
		long ret = globalTestObject.callMethodBaseWithULongLongRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void returnTestFloat() {

		//expected return value
		float expRet = 123.456f;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithFloatRet()).toReturn(expRet);

		//call delegate method
		float ret = globalTestObject.callMethodBaseWithFloatRet();

		//verification of return values
		assertEquals( expRet , ret, 0.001);

	}

	@Test

	public void returnTestDouble() {

		//expected return value
		double expRet = 456.789;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithDoubleRet()).toReturn(expRet);

		//call delegate method
		double ret = globalTestObject.callMethodBaseWithDoubleRet();

		//verification of return values
		assertEquals( expRet , ret, 0.001);

	}

	@Test
	public void returnTestBoolean() {

		//expected return value
		boolean expRet = true;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithBooleanRet()).toReturn(expRet);

		//call delegate method
		boolean ret = globalTestObject.callMethodBaseWithBooleanRet();

		//verification of return values
		assertEquals( expRet , ret);

	}

	@Test

	public void argumentTestString() {

		//expected return value
		xNSString expArg = xNSString.stringWithCString("Hello, bindings!");

		//call delegate method
		globalTestObject.callMethodBaseWithNSStringArg(expArg);

		//verification of method calls
//		verify(globalBaseDelegate, times(1)).javaMethodBaseWithNSStringArg(expArg);
        assertEquals(expArg, BaseNoExtend.argMethodBaseWithNSStringArg);
	}

	@Test

	public void argumentTestObject() {

		//expected return value
		NativeObject expArg = globalTestObject;

		//call delegate method
		globalTestObject.callMethodBaseWithObjectArg(expArg);

		//verification of method calls
        assertEquals(expArg, BaseNoExtend.argMethodBaseWithObjectArg);
	}

	@Test

	public void argumentTestWithTwoParams() {

		//expected return value
		long expFirst = 100500L;
		double expSecond = 100.200;

		//call delegate method
		globalTestObject.callMethodBaseWithTwoParams( expFirst, expSecond);

		assertEquals(expFirst, BaseNoExtend.arg1MethodBaseWithTwoParams);
		assertEquals(expSecond, BaseNoExtend.arg2MethodBaseWithTwoParams, 0.1);
	}

	@Test
	public void returnTestObject() {

		//expected return value
		NativeObject expRet = globalTestObject;

		//stub method
//		stub(globalBaseDelegate.javaMethodBaseWithObjectRet()).toReturn(expRet);

		//call delegate method
		Object ret = globalTestObject.callMethodBaseWithObjectRet();

		//verification of return values
		assertEquals(expRet.getClass(), ret.getClass());

	}

	@Test
	public void testForMikhail() {

		//expected return value
		float first = 100f;
		float second = 500f;
        NSObject expRet = NSObject.alloc().init();
        NSObject expObjArg = NSObject.alloc().init();

		//stub method
		//stub(globalBaseDelegate.javaMethodBaseForMikhail(first,second,expRet,expObjArg)).toReturn(expRet);

		//call delegate method
		NSObject ret = globalTestObject.callMethodBaseFloatObject(first, second, expRet, expObjArg);

		//verification of return values
		assertEquals(expRet , ret);
	}

	@Test
	public void testMethodBasePureCallBack() {
		BaseNoExtend delegate = new BaseNoExtend();

		BaseController controller = BaseController.alloc().initWithBaseDelegate(delegate);
		NSObject testObject = NSObject.alloc().init();
        assertEquals(testObject, controller.callMethodBasePureCallback(testObject));
	}

	@Ignore
	public void testStaticMethodBaseCallBack() {
		BaseNoExtend delegate = new BaseNoExtend();
		
		BaseController controller = BaseController.alloc().initWithBaseDelegate(delegate);
		NSObject testObject = NSObject.alloc().init();
        assertEquals(testObject, controller.callStaticMethodBaseCallback(testObject));
	}
}
