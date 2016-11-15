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

package apple.foundation;

import apple.protocol.NSObject;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCObject;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSProxy extends ObjCObject implements NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSProxy(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSProxy alloc();

    @Generated
    @Selector("respondsToSelector:")
    public static native boolean respondsToSelector_static(SEL aSelector);

    @Generated
    @Selector("class")
    public native Class class_objc();

    public final void dealloc() {
        System.err.println("Calling dealloc is a no-op. Use ObjCRuntime.dispose(...) instead.");
        new RuntimeException().printStackTrace(System.err);
    }

    @Generated
    @Selector("debugDescription")
    public native String debugDescription();

    @Generated
    @Selector("description")
    public native String description();

    @Generated
    @Selector("finalize")
    public native void finalize_objc();

    @Generated
    @Selector("forwardInvocation:")
    public native void forwardInvocation(NSInvocation invocation);

    @Generated
    @Selector("hash")
    @NUInt
    public native long hash();

    @Generated
    @Selector("isEqual:")
    public native boolean isEqual(@Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("isKindOfClass:")
    public native boolean isKindOfClass(Class aClass);

    @Generated
    @Selector("isMemberOfClass:")
    public native boolean isMemberOfClass(Class aClass);

    @Generated
    @Selector("isProxy")
    public native boolean isProxy();

    @Generated
    @Selector("methodSignatureForSelector:")
    public native NSMethodSignature methodSignatureForSelector(SEL sel);

    @Generated
    @Selector("performSelector:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelector(SEL aSelector);

    @Generated
    @Selector("performSelector:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObject(SEL aSelector, @Mapped(ObjCObjectMapper.class) Object object);

    @Generated
    @Selector("performSelector:withObject:withObject:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object performSelectorWithObjectWithObject(SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object object1, @Mapped(ObjCObjectMapper.class) Object object2);

    @Generated
    @Selector("respondsToSelector:")
    public native boolean respondsToSelector(SEL aSelector);

    @Generated
    @Selector("self")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object self();

    @Generated
    @Selector("superclass")
    public native Class superclass();
}
