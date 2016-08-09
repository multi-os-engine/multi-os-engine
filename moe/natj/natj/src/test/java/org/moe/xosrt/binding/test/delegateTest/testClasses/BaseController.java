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

package org.moe.xosrt.binding.test.delegateTest.testClasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.NativeObject;
import org.moe.natj.general.Pointer;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.xNSString;
import org.moe.xosrt.binding.test.delegateTest.testClasses.delegates.Mixed;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.BaseProtocol;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.MiddleProtocolOne;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.MiddleProtocolTwo;
import org.moe.xosrt.binding.test.delegateTest.testClasses.protocols.UpperProtocol;

@ObjCClassName("BaseController")
public class BaseController extends NSObject {
	

	static
	{
		NatJ.register();
	}

	protected BaseController(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	public static native BaseController alloc();

	@Selector("init")
	public native BaseController init();
	
	@Selector("setBaseDelegate:")
	public native void setBaseDelegate(BaseProtocol delegate);
	
	@Selector("baseDelegate")
	public native BaseProtocol getBaseDelegate();

	@Selector("setUpperDelegate:")
	public native void setUpperDelegate(UpperProtocol delegate);
	
	@Selector("upperDelegate")
	public native UpperProtocol getUpperDelegate();
	
	@Selector("setMixedDelegate:")
	public native <T extends MiddleProtocolOne & MiddleProtocolTwo> void setMixedDelegate(T delegate);
	
	@Selector("mixedDelegate")
	public native <T extends MiddleProtocolOne & MiddleProtocolTwo> T getMixedDelegate();
	
	@Selector("initWithBase:andUpper:andMixedDelegate:")
	public native BaseController initWithAllDelegates(BaseProtocol baseDelegate, UpperProtocol upperDelegate, Mixed mixedDelegate);
	
 	@Selector("initWithBaseDelegate:")
	public native BaseController initWithBaseDelegate( BaseProtocol baseDelegate );
	
	@Selector("initWithUpperDelegate:")
	public native BaseController initWithUpperDelegate(UpperProtocol upperDelegate);
	
    @Selector("initWithMixedDelegate:")
	public native BaseController initWithMixedDelegate( Mixed mixedDelegate );

		

	@Selector("callMethodBase")
	public native void callMethodBase();
	//methods with signed primitive arguments
	@Selector("callMethodBaseWithCharArg:")
    public native void callMethodBaseWithCharArg (char arg);
	@Selector("callMethodBaseWithShortArg:")
    public native void callMethodBaseWithShortArg (short arg);
	@Selector("callMethodBaseWithIntArg:")
    public native void callMethodBaseWithIntArg (int arg);
	@Selector("callMethodBaseWithLongArg:")
    public native void callMethodBaseWithLongArg (long arg);
	@Selector("callMethodBaseWithLongLongArg:")
    public native void callMethodBaseWithLongLongArg (long arg);
    //methods with primitive arguments
	@Selector("callMethodBaseWithUCharArg:")
    public native void callMethodBaseWithUCharArg (char arg);
	@Selector("callMethodBaseWithUShortArg:")
    public native void callMethodBaseWithUShortArg (int arg);
	@Selector("callMethodBaseWithUIntArg:")
    public native void callMethodBaseWithUIntArg (long arg);
	@Selector("callMethodBaseWithULongArg:")
    public native void callMethodBaseWithULongArg (long arg);
	@Selector("callMethodBaseWithULongLongArg:")
    public native void callMethodBaseWithULongLongArg (long arg);
    //methods with other primitive arguments
	@Selector("callMethodBaseWithFloatArg:")
    public native void callMethodBaseWithFloatArg (float arg);
	@Selector("callMethodBaseWithDoubleArg:")
    public native void callMethodBaseWithDoubleArg (double arg);
	@Selector("callMethodBaseWithBooleanArg:")
    public native void callMethodBaseWithBooleanArg (boolean arg);
    //methods which Return primitives
	@Selector("callMethodBaseWithCharRet")
    public native char callMethodBaseWithCharRet();
	@Selector("callMethodBaseWithShortRet")
    public native short callMethodBaseWithShortRet();
	@Selector("callMethodBaseWithIntRet")
    public native int callMethodBaseWithIntRet();
	@Selector("callMethodBaseWithLongRet")
    public native long callMethodBaseWithLongRet();
	@Selector("callMethodBaseWithLongLongRet")
    public native long callMethodBaseWithLongLongRet();
	@Selector("callMethodBaseWithUCharRet")
    public native char callMethodBaseWithUCharRet();
	@Selector("callMethodBaseWithUShortRet")
    public native int callMethodBaseWithUShortRet();
	@Selector("callMethodBaseWithUIntRet")
    public native long callMethodBaseWithUIntRet();
	@Selector("callMethodBaseWithULongRet")
    public native long callMethodBaseWithULongRet();
	@Selector("callMethodBaseWithULongLongRet")
    public native long callMethodBaseWithULongLongRet();
	@Selector("callMethodBaseWithFloatRet")
    public native float callMethodBaseWithFloatRet();
	@Selector("callMethodBaseWithDoubleRet")
    public native double callMethodBaseWithDoubleRet();
	@Selector("callMethodBaseWithBooleanRet")
    public native boolean callMethodBaseWithBooleanRet();
    //methods with complex argument
	@Selector("callMethodBaseWithNSStringArg:")
    public native void callMethodBaseWithNSStringArg (xNSString string);
	@Selector("callMethodBaseWithObjectArg:")
    public native void callMethodBaseWithObjectArg (NativeObject object);
    //method with two arguments
	@Selector("callMethodBaseWithFirst:andSecondParam:")
    public native void callMethodBaseWithTwoParams ( long longParam, double stringParam);
    //methods which return complex types
	@Selector("callMethodBaseWithNSStringRet")
    public native xNSString callMethodBaseWithNSStringRet();
	@Selector("callMethodBaseWithObjectRet")
    public native NativeObject callMethodBaseWithObjectRet();
	@Selector("callUpperDelegate")
	public native void callUpperDelegate();
	@Selector("callMixedDelegate")
	public native void callMixedDelegate();
	
	@Selector("callMethod:Base:For:Mikhail:")
	public native NSObject callMethodBaseFloatObject(float first, float second, NativeObject toRet, NativeObject objArg);

	@Selector("callMethodUpperWithStruct")
	public native void callMethodUpperWithStruct();
	
	@Selector("callMethodUpperWithStructPointer")
	public native void callMethodUpperWithStructPointer();
	
	@Selector("callMethodBasePureCallback:")
	public native NativeObject callMethodBasePureCallback(NativeObject object);
	
	@Selector("callStaticMethodBaseCallback:")
	public native NSObject callStaticMethodBaseCallback(NSObject object);
}
