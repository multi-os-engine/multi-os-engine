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
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import apple.NSObject;
import objc.binding.protocol.ProxiedConstPtrProtocol;
import objc.binding.protocol.ProxiedPtrProtocol;
import objc.binding.protocol.ProxiedValueProtocol;

@Runtime(ObjCRuntime.class)
@ObjCClassBinding
@Library("TestClassesObjC")
public class ProtocolFactoryClass extends NSObject {

    static {
        NatJ.register();
    }

    protected ProtocolFactoryClass(Pointer peer) {
        super(peer);
    }

    @Owned
    @Selector("alloc")
    public static native ProtocolFactoryClass alloc();

    @Selector("init")
    public native ProtocolFactoryClass init();

    @Selector("valueObject")
    public native ProxiedValueProtocol valueObject();

    @Selector("ptrObject")
    public native ProxiedPtrProtocol ptrObject();

    @Selector("constPtrObject")
    public native ProxiedConstPtrProtocol constPtrObject();

    @Selector("castableValueObject")
    public native Object castableValueObject();

    @Selector("checkTransparentValueObject:andNonTransparentValueObject:")
    public native boolean checkTransparentValueObjectAndNonTransparentValueObject(ProxiedValueProtocol transparent, ProxiedValueProtocol nonTransparent);

}
