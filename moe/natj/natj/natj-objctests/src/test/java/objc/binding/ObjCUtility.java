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

package objc.binding;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.*;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.NSObject;
import objc.binding.protocol.OptionalProtocol;

@Generated
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class ObjCUtility extends NSObject implements OptionalProtocol {
    static {
        NatJ.register();
    }

    @Generated
    protected ObjCUtility(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native ObjCUtility alloc();

    @Generated
    @IsOptional
    @Selector("dontImplementThis")
    public static native void dontImplementThis();

    @Generated
    @IsOptional
    @ProtocolClassMethod("dontImplementThis")
    public void _dontImplementThis() {
        dontImplementThis();
    }

    @Generated
    @Selector("init")
    public native ObjCUtility init();

    @Generated
    @Selector("objectReturnFromClass:selector:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object objectReturnFromClassSelector(String className,
                                                              SEL sel);

    @Generated
    @Selector("objectReturnFromObject:selector:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object objectReturnFromObjectSelector(
            @Mapped(ObjCObjectMapper.class) Object object, SEL sel);
}
