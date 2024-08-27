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

package org.moe.xosrt.binding.test.delegateTest.testClasses.protocols;


import org.moe.natj.general.NativeObject;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.xosrt.binding.test.common.xNSString;

@ObjCProtocolName("BaseProtocol")
public interface BaseProtocol {
	
	 @Selector("methodBase")
	 public void javaMethodBase();
	 
	//methods with signed primitive arguments
	 @Selector("methodBaseWithCharArg:")
	 public void javaMethodBaseWithCharArg(char arg);
	 
	 @Selector("methodBaseWithShortArg:")
	 public void javaMethodBaseWithShortArg(short arg);
	 
	 @Selector("methodBaseWithIntArg:")
	 public void javaMethodBaseWithIntArg(int arg);
	 
	 @Selector("methodBaseWithLongArg:")
	 public void javaMethodBaseWithLongArg(long arg);
	 
	 @Selector("methodBaseWithLongLongArg:")
	 public void javaMethodBaseWithLongLongArg(long arg);

	 //methods with primitive arguments
	 @Selector("methodBaseWithUCharArg:")
	 public void javaMethodBaseWithUCharArg(char arg);
	 
	 @Selector("methodBaseWithUShortArg:")
	 public void javaMethodBaseWithUShortArg(int arg);
	 
	 @Selector("methodBaseWithUIntArg:")
	 public void javaMethodBaseWithUIntArg(long arg);
	 
	 @Selector("methodBaseWithULongArg:")
	 public void javaMethodBaseWithULongArg(long arg);
	 
	 @Selector("methodBaseWithULongLongArg:")
	 public void javaMethodBaseWithULongLongArg(long arg);
	 
	 //methods with other primitive arguments
	 @Selector("methodBaseWithFloatArg:")
	 public void javaMethodBaseWithFloatArg(float arg);
	 
	 @Selector("methodBaseWithDoubleArg:")
	 public void javaMethodBaseWithDoubleArg(double arg);
	 
	 @Selector("methodBaseWithBooleanArg:")
	 public void javaMethodBaseWithBooleanArg(boolean arg);
	 
	 //methods which Return primitives
	 @Selector("methodBaseWithCharRet")
	 public char javaMethodBaseWithCharRet();
	 
	 @Selector("methodBaseWithShortRet")
	 public short javaMethodBaseWithShortRet();
	 
	 @Selector("methodBaseWithIntRet")
	 public int javaMethodBaseWithIntRet();
	 
	 @Selector("methodBaseWithLongRet")
	 public long javaMethodBaseWithLongRet();
	 
	 @Selector("methodBaseWithLongLongRet")
	 public long javaMethodBaseWithLongLongRet();
	 
	 @Selector("methodBaseWithUCharRet")
	 public char javaMethodBaseWithUCharRet();
	 
	 @Selector("methodBaseWithUShortRet")
	 public int javaMethodBaseWithUShortRet();
	 
	 @Selector("methodBaseWithUIntRet")
	 public long javaMethodBaseWithUIntRet();
	 
	 @Selector("methodBaseWithULongRet")
	 public long javaMethodBaseWithULongRet();
	 
	 @Selector("methodBaseWithULongLongRet")
	 public long javaMethodBaseWithULongLongRet();
	 
	 @Selector("methodBaseWithFloatRet")
	 public float javaMethodBaseWithFloatRet();
	 
	 @Selector("methodBaseWithDoubleRet")
	 public double javaMethodBaseWithDoubleRet();
	 
	 @Selector("methodBaseWithBooleanRet")
	 public boolean javaMethodBaseWithBooleanRet();

	 //methods with complex argument
	 @Selector("methodBaseWithNSStringArg:")
	 public void javaMethodBaseWithNSStringArg(xNSString string);
	 
	 @Selector("methodBaseWithObjectArg:")
	 public void javaMethodBaseWithObjectArg(NativeObject object);

	 //method with two arguments
	 @Selector("methodBaseWithFirst:andSecondParam:")
	 public void javaMethodBaseWithTwoParams( long longParam, double doubleParam);

	 //methods which return complex types
	 @Selector("methodBaseWithNSStringRet")
	 public xNSString javaMethodBaseWithNSStringRet();
	 
	 @Selector("methodBaseWithObjectRet")
	 public NativeObject javaMethodBaseWithObjectRet();
	 
	 //method for Mikhail
	 @Selector("method:Base:For:Mikhail:")
	 public Object javaMethodBaseForMikhail(float first, float second, NativeObject firstObj, NativeObject secondObj );
	 
	 
}
