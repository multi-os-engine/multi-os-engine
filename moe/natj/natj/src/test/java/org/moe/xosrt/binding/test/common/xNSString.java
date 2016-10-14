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

package org.moe.xosrt.binding.test.common;

import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ObjCClassName;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;

@ObjCClassName("NSString")
@ObjCClassBinding()
public class xNSString extends NSObject {

	static {
        NatJ.register();
	}

    protected xNSString(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("alloc")
    public static native xNSString alloc();


    @Selector("init")
    public native xNSString init();
    
//    @Override
//    public String toString() {
//        return toJavaString();
//    }

    @Selector("stringWithCString:")
    public static native xNSString stringWithCString(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String bytes);


//    private native String toJavaString();

    @Selector("stringWithUTF8String:")
    public static native xNSString stringWithUTF8String(CharPtr nullTerminatedCString); //TODO: const char* nullTerminatedCString

    @Selector("isEqualToString:")
    public native boolean isEqualToString(String aString);

}
