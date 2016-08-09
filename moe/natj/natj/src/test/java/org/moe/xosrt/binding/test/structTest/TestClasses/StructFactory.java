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

package org.moe.xosrt.binding.test.structTest.TestClasses;

import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import mac.NSObject;
import org.moe.xosrt.binding.test.common.NativeCGPoint;
import org.moe.xosrt.binding.test.common.NativeCGRect;

@ObjCClassName("StructFactory")
public class StructFactory extends NSObject {

    static
    {
        NatJ.register();
    }

    protected StructFactory(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
	public static native StructFactory alloc();
	
	@Selector("init")
	public native StructFactory init();
	
    @Selector("checkCGPoint:")
    public native boolean checkCGPoint(@ByValue NativeCGPoint point);

    @Selector("prepareCGPoint")
    @ByValue
    public native NativeCGPoint prepareCGPoint();


    @Selector("checkCGRect:")
    public native boolean checkCGRect(@ByValue NativeCGRect rect);

    @Selector("prepareCGRect")
    @ByValue
    public native NativeCGRect prepareCGRect();


}
