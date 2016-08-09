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

package org.moe.xosrt.binding.test.delegateTest.testClasses.delegates;

import org.moe.natj.general.NativeObject;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.xNSString;
import org.moe.xosrt.binding.test.delegateTest.testClasses.BaseController;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.BaseProtocol;

public class BaseNoExtend implements BaseProtocol {

	public boolean argMethodBaseCalled = false;
	@Override
	public void javaMethodBase() {
		argMethodBaseCalled = true;
	}

	public static char argMethodBaseWithCharArg = 0;
	@Override
	public void javaMethodBaseWithCharArg(char arg) {
		argMethodBaseWithCharArg = arg;
	}

	public static short argMethodBaseWithShortArg = 0;
	@Override
	public void javaMethodBaseWithShortArg(short arg) {
		argMethodBaseWithShortArg = arg;
	}

	public static int argMethodBaseWithIntArg = 0;
	@Override
	public void javaMethodBaseWithIntArg(int arg) {
		argMethodBaseWithIntArg = arg;
		
	}

	public static long argMethodBaseWithLongArg = 0;
	@Override
	public void javaMethodBaseWithLongArg(long arg) {
		argMethodBaseWithLongArg = arg;
	}
	
    public static long argForBaseWithLongLongArg = 0;
	@Override
	public void javaMethodBaseWithLongLongArg(long arg) {
		argForBaseWithLongLongArg = arg;		
	}

	public static char argMethodBaseWithUCharArg = 0;
	@Override
	public void javaMethodBaseWithUCharArg(char arg) {
		argMethodBaseWithUCharArg = arg;
	}

	public static int argMethodBaseWithUShortArg = 0;
	@Override
	public void javaMethodBaseWithUShortArg(int arg) {
		argMethodBaseWithUShortArg = arg;
	}

	public static long argMethodBaseWithUIntArg = 0;
	@Override
	public void javaMethodBaseWithUIntArg(long arg) {
		argMethodBaseWithUIntArg = arg;
	}

	public static long argMethodBaseWithULongArg = 0;
	@Override
	public void javaMethodBaseWithULongArg(long arg) {
		argMethodBaseWithULongArg = arg;
	}

	public static long argMethodBaseWithULongLongArg = 0;
	@Override
	public void javaMethodBaseWithULongLongArg(long arg) {
		argMethodBaseWithULongLongArg = arg;
	}

	public static float argMethodBaseWithFloatArg = 0;
	@Override
	public void javaMethodBaseWithFloatArg(float arg) {
		//XRTLogger.test("Float arg:" + arg);
		argMethodBaseWithFloatArg = arg;
	}

	public static double argMethodBaseWithDoubleArg = 0;
	@Override
	public void javaMethodBaseWithDoubleArg(double arg) {
		argMethodBaseWithDoubleArg = arg;
	}
	
    public static boolean argMethodBaseWithBooleanArg = false;
	@Override
	public void javaMethodBaseWithBooleanArg(boolean arg) {
		argMethodBaseWithBooleanArg = arg;
		
	}

	@Override
	public char javaMethodBaseWithCharRet() {
		// TODO Auto-generated method stub
		return 'r';
	}

	@Override
	public short javaMethodBaseWithShortRet() {
		// TODO Auto-generated method stub
		return -32768;
	}

	@Override
	public int javaMethodBaseWithIntRet() {
		// TODO Auto-generated method stub
		return -2147483648;
	}

	@Override
	public long javaMethodBaseWithLongRet() {
		// TODO Auto-generated method stub
		return -9223372036854775807L;
	}

	@Override
	public long javaMethodBaseWithLongLongRet() {
		// TODO Auto-generated method stub
		return -9223372036854775807L;
	}

	@Override
	public char javaMethodBaseWithUCharRet() {
		// TODO Auto-generated method stub
		return 255;
	}

	@Override
	public int javaMethodBaseWithUShortRet() {
		// TODO Auto-generated method stub
		return 65535;
	}

	@Override
	public long javaMethodBaseWithUIntRet() {
		// TODO Auto-generated method stub
		return 4294967295L;
	}

	@Override
	public long javaMethodBaseWithULongRet() {
		// TODO Auto-generated method stub
		return 100500L;
	}

	@Override
	public long javaMethodBaseWithULongLongRet() {
		// TODO Auto-generated method stub
		return 100500L;
	}

	@Override
	public float javaMethodBaseWithFloatRet() {
		// TODO Auto-generated method stub
		return 123.456f;
	}

	@Override
	public double javaMethodBaseWithDoubleRet() {
		// TODO Auto-generated method stub
		return 456.789;
	}

	@Override
	public boolean javaMethodBaseWithBooleanRet() {
		// TODO Auto-generated method stub
		return true;
	}

	public static xNSString argMethodBaseWithNSStringArg = null;
	@Override
	public void javaMethodBaseWithNSStringArg(xNSString string) {
		argMethodBaseWithNSStringArg = string;
	}

	public static NativeObject argMethodBaseWithObjectArg = null;

	@Override
	public void javaMethodBaseWithObjectArg(NativeObject object) {
		argMethodBaseWithObjectArg = object;
	}

	public static long arg1MethodBaseWithTwoParams = 0;
	public static double arg2MethodBaseWithTwoParams = 0;
	@Override
	public void javaMethodBaseWithTwoParams(long longParam, double doubleParam) {
		arg1MethodBaseWithTwoParams = longParam;
		arg2MethodBaseWithTwoParams = doubleParam;
	}

	@Override
	public xNSString javaMethodBaseWithNSStringRet() {
		// TODO Auto-generated method stub
		return xNSString.stringWithCString("Hello, bindings!");
	}

	@Override
	public NativeObject javaMethodBaseWithObjectRet() {
		return BaseController.alloc().init();
	}

	public static float argMikhailFirst = 0;
	public static float argMikhailSecond = 0;
	public static Object argMikhailFirstObj = 0;
	public static Object argMikhailSecondObj = 0;
	@Override
	public Object javaMethodBaseForMikhail(float first, float second,
                                           NativeObject firstObj, NativeObject secondObj) {
		// TODO Auto-generated method stub
		return firstObj;
	}
	
	@Selector("pureCallBack:")
	public NSObject javaMethodPureCallBack(NSObject object)
	{
		return object;
	}
	
	@Selector("staticCallBack:")
	public static NSObject javaStaticMethodCallBack(NSObject object)
	{
		return object;
	}
	
}
