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

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.xNSString;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.UpperProtocol;

public class Upper extends NSObject implements UpperProtocol {

	
	static
	{
		NatJ.register();
	}

	protected Upper(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	public static native Upper alloc(); 
	
	@Selector("init")
	public native Upper init();
	
	public boolean argMethodMiddleOneCalled = false;
	@Override
	public void javaMethodMiddleOne() {
		argMethodMiddleOneCalled = true;
	}

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

	@Override
	public void javaMethodBaseWithIntArg(int arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithLongArg(long arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithLongLongArg(long arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithUCharArg(char arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithUShortArg(int arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithUIntArg(long arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithULongArg(long arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithULongLongArg(long arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithFloatArg(float arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithDoubleArg(double arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void javaMethodBaseWithBooleanArg(boolean arg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public char javaMethodBaseWithCharRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public short javaMethodBaseWithShortRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int javaMethodBaseWithIntRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long javaMethodBaseWithLongRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long javaMethodBaseWithLongLongRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char javaMethodBaseWithUCharRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int javaMethodBaseWithUShortRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long javaMethodBaseWithUIntRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long javaMethodBaseWithULongRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long javaMethodBaseWithULongLongRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float javaMethodBaseWithFloatRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double javaMethodBaseWithDoubleRet() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean javaMethodBaseWithBooleanRet() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void javaMethodBaseWithNSStringArg(xNSString string) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void javaMethodBaseWithTwoParams(long longParam, double doubleParam) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public xNSString javaMethodBaseWithNSStringRet() {
		// TODO Auto-generated method stub
		return null;
	}

    public boolean argMethodMiddleTwoCalled = false;
	@Override
	public void javaMethodMiddleTwo() {
		argMethodMiddleTwoCalled = true;
	}

	public boolean argMethodUpperCalled = false;
	@Override
	public void javaMethodUpper() {
		argMethodUpperCalled = true;
	}

	@Override
	public void javaMethodBaseWithObjectArg(NativeObject object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object javaMethodBaseForMikhail(float first, float second,
										   NativeObject firstObj, NativeObject secondObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NativeObject javaMethodBaseWithObjectRet() {
		// TODO Auto-generated method stub
		return null;
	}

	public static NativeCGPoint argjavaMethodUpperWithStruct = null;
	@Override
	public void javaMethodUpperWithStruct(@ByValue NativeCGPoint point) {
		argjavaMethodUpperWithStruct = point;
	}

	public static NativeCGPoint argjavaMethodUpperWithStructPointer = null;
	@Override
	public void javaMethodUpperWithStructPointer(NativeCGPoint point) {
		argjavaMethodUpperWithStructPointer = point;
	}

	


}
