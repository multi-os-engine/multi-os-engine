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

package mac.foundation;

import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import mac.NSObject;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSSet extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("anyObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object anyObject();

    @Generated
    @Selector("count")
    public native long count();

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("init")
    public native NSSet init();

    @Generated
    @Variadic()
    @Selector("setWithObjects:")
    public static native NSSet setWithObjects(
            @Mapped(ObjCObjectMapper.class) Object firstObj, Object... varargs);
}
