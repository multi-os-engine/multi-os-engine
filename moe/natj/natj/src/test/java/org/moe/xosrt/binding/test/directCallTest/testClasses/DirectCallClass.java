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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCException;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.NativeCGPointFloat;
import org.moe.xosrt.binding.test.common.NativeCGRect;
import org.moe.xosrt.binding.test.common.NativeComplexCGPoint;
import org.moe.xosrt.binding.test.common._NSCopying;
import org.moe.xosrt.binding.test.common._NSError;
import org.moe.xosrt.binding.test.common._NSObject;
import org.moe.xosrt.binding.test.common._NSUInteger;
import org.moe.xosrt.binding.test.common.xNSString;

import java.lang.reflect.Method;


@ObjCClassName("DirectCallClass")
@Runtime(ObjCRuntime.class)
public class DirectCallClass extends NSObject {
	
	static {
		NatJ.register();
	}

	protected DirectCallClass(Pointer peer) {
		super(peer);
	}

	@Selector("alloc")
	public static native DirectCallClass alloc();
	
	@Selector("init")
	public native DirectCallClass init();
	
	@Selector("initWithMock:")
	public native DirectCallClass initWithMock(boolean mock);
	
	@Selector("initWithBounds")
	public native DirectCallClass initWithBounds();
	

	
	@Selector("staticStringProp")
	public static  native NSObject getStaticNSStringProp();
	
	@Selector("setStaticStringProp:")
	public static  native void setStaticStringProp(NSObject string);
	
	@Selector("dataCopy")
	public native _NSCopying getDataCopy();
	
	@Selector("setDataCopy:")
	public native void setDataCopy(_NSCopying string);
	
	@Selector("stringProp")
	public  native NSObject getNSStringProp();
	
		
	@Selector("setStringProp:")
	public  native void setStringProp(NSObject prop);
	
	@Selector("methodDCall")
	public native int javaMethodDCall();
	
	//methods with signed primitive arguments
	@Selector("methodDCallWithCharArg:")
	public native byte javaMethodDCallWithCharArg(byte arg);
	
	@Selector("methodDCallWithShortArg:")
	public native short javaMethodDCallWithShortArg(short arg);
	
	@Selector("methodDCallWithIntArg:")
	public native int javaMethodDCallWithIntArg(int arg);
	
	@Selector("methodDCallWithLongArg:")
	public native int javaMethodDCallWithLongArg(int arg);
	
	@Selector("methodDCallWithLongLongArg:")
	public native long javaMethodDCallWithLongLongArg(long arg);
	
	//methods with primitive arguments
	@Selector("methodDCallWithUCharArg:")
	public native char javaMethodDCallWithUCharArg(char arg);
	
	@Selector("methodDCallWithUShortArg:")
	public native int javaMethodDCallWithUShortArg(int arg);
	
	@Selector("methodDCallWithUIntArg:")
	public native long javaMethodDCallWithUIntArg(long arg);
	
	@Selector("methodDCallWithULongArg:")
	@_NSUInteger
	@Generated
	public native long javaMethodDCallWithULongArg(long arg);
	
	@Selector("methodDCallWithULongLongArg:")
	@_NSUInteger
	@Generated
	public native long javaMethodDCallWithULongLongArg(long arg);
	
	//methods with other primitive arguments
	@Selector("methodDCallWithFloatArg:")
	public native float javaMethodDCallWithFloatArg(float arg);
	
	@Selector("methodDCallWithDoubleArg:")
	public native double javaMethodDCallWithDoubleArg(double arg);
	
	@Selector("methodDCallWithBooleanArg:")
	public native boolean javaMethodDCallWithBooleanArg(boolean arg);
	
	//methods which Return primitives
	@Selector("methodDCallWithCharRet")
	public native char javaMethodDCallWithCharRet();
	
	@Selector("methodDCallWithShortRet")
	public native short javaMethodDCallWithShortRet();
	
	@Selector("methodDCallWithIntRet")
	public native int javaMethodDCallWithIntRet();
	
	@Selector("methodDCallWithLongRet")
	public native long javaMethodDCallWithLongRet();
	
	@Selector("methodDCallWithLongLongRet")
	public native long javaMethodDCallWithLongLongRet();
	
	@Selector("methodDCallWithUCharRet")
	public native char javaMethodDCallWithUCharRet();
	
	@Selector("methodDCallWithUShortRet")
	public native int javaMethodDCallWithUShortRet();
	
	@Selector("methodDCallWithUIntRet")
	public native long javaMethodDCallWithUIntRet();
	
	@Selector("methodDCallWithULongRet")
	public native long javaMethodDCallWithULongRet();
	
	@Selector("methodDCallWithULongLongRet")
	public native long javaMethodDCallWithULongLongRet();
	
	@Selector("methodDCallWithFloatRet")
	public native float javaMethodDCallWithFloatRet();
	
	@Selector("methodDCallWithDoubleRet")
	public native double javaMethodDCallWithDoubleRet();
	
	@Selector("methodDCallWithBooleanRet")
	public native boolean javaMethodDCallWithBooleanRet();	
	
	//methods with complex argument	
	@Selector("methodDCallWithNSStringArg:")
	public native xNSString javaMethodDCallWithNSStringArg(xNSString string);
	
	@Selector("methodDCallWithObjectArg:")
	public native NSObject javaMethodDCallWithObjectArg(NSObject object);	
	
	//method with two arguments	
	@Selector("methodDCallWithFirst:andSecondParam:")
	public native xNSString javaMethodDCallWithTwoParams( long longParam, NSObject stringParam);
	
	@Selector("methodDCallWithObjectRet")
	public native NativeObject javaMethodDCallWithObjectRet();
		
	//methods which structures
	@Selector("methodDCallWithStructArg:")
	public native void javaMethodDCallWithStructArg(@ByValue NativeCGPoint struct);
	
	@Selector("methodDCallWithStructRet:")
	@ByValue
	public native NativeCGPoint javaMethodDCallWithStructRet(@ByValue NativeCGPoint struct); 

	@Selector("methodDCallWithStructRetX:Y:")
	@ByValue public native NativeCGPoint javaMethodDCallWithStructRetXY(double x, double y); 

	@Selector("methodDCallWithComplexStructRetX:Y:")
	@ByValue public native NativeComplexCGPoint javaMethodDCallWithComplexStructRetXY(@ByValue NativeCGPoint x, float y); 
	
	
	@Selector("methodDStructRetStructFloat:Y:")
	@ByValue public native NativeCGPointFloat methodDStructRetStructFloat(float x, float y); 
	
	@Selector("methodDStructRetStructFloatFromStruct:")
	@ByValue public native NativeCGPointFloat methodDStructRetStructFloatFromStruct(@ByValue NativeCGPointFloat point); 
	
	//methods with selectors
	@Selector("methodDCallWithSelectorArg:")
	public native void javaMethodDCallWithMethodArg(Method method);	
	
	@Selector("methodDCall:WithJavaSelectorArg:")
	public native long javaMethodDCallWithJavaMethodArg(Object obj, SEL sel);
	
	@Selector("methodDCallWithSelectorRet")
	public native SEL javaMethodDCallWithSelectorRet();
	
	//methods with toIdPtrs
	@Selector("methodDCallWithToIdPtrBase:")
	public native void javaMethodDCallWithToIdPtrBase(Ptr<? extends ObjCObject> ptr);
	
	@Selector("methodDCallWithToIdPtrArg:")
	public native void javaMethodDCallWithToIdPtrArg(Ptr<? extends ObjCObject> ptr);
	
	@Selector("methodDCallWithFirst:andSecondToIdPtr:")
	public native void javaMethodDCallWithTwoIdPtrArgs(Ptr<? extends ObjCObject> ptr1, Ptr<DirectCallClass> ptr2);
	
	
	@Selector("methodDCallRetCGRectProperty")
	public native @ByValue NativeCGRect javaMethodDCallRetCGRectProperty();
	
	@Selector("methodDCallRetCGRectX:Y:")
	public native @ByValue NativeCGRect javaMethodDCallRetCGRect(double x, double y);

	@Selector("methodDCallWithToNSErrorPtr:")
	public native void javaMethodDCallWithNSErrorPtr(Ptr<_NSError> ptr);
	
	@Selector("forDirectCallCallback")
	public long forDirectCallCallback()
	{
		return 100500L;
	}
	
	@Selector("producingNativeObjects")
	public native _NSObject producingNativeObjects();
	
	@Selector("raiseExceptionMethod")
	public native void raiseExceptionMethod() throws ObjCException;
	
	@Selector("assertMethodCall:times:")
	private native boolean assertMethodCallTimes(String selector, long times);
}
