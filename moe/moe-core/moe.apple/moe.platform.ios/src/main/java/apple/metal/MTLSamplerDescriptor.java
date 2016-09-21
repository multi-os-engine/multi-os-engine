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

package apple.metal;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("Metal")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTLSamplerDescriptor extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTLSamplerDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLSamplerDescriptor alloc();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("initialize")
    public static native void initialize();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native MTLSamplerDescriptor init();

    @Generated
    @Selector("label")
    public native String label();

    @Generated
    @Selector("lodMaxClamp")
    public native float lodMaxClamp();

    @Generated
    @Selector("lodMinClamp")
    public native float lodMinClamp();

    @Generated
    @Selector("magFilter")
    @NUInt
    public native long magFilter();

    @Generated
    @Selector("maxAnisotropy")
    @NUInt
    public native long maxAnisotropy();

    @Generated
    @Selector("minFilter")
    @NUInt
    public native long minFilter();

    @Generated
    @Selector("mipFilter")
    @NUInt
    public native long mipFilter();

    @Generated
    @Selector("normalizedCoordinates")
    public native boolean normalizedCoordinates();

    @Generated
    @Selector("rAddressMode")
    @NUInt
    public native long rAddressMode();

    @Generated
    @Selector("sAddressMode")
    @NUInt
    public native long sAddressMode();

    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    @Generated
    @Selector("setLodMaxClamp:")
    public native void setLodMaxClamp(float value);

    @Generated
    @Selector("setLodMinClamp:")
    public native void setLodMinClamp(float value);

    @Generated
    @Selector("setMagFilter:")
    public native void setMagFilter(@NUInt long value);

    @Generated
    @Selector("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@NUInt long value);

    @Generated
    @Selector("setMinFilter:")
    public native void setMinFilter(@NUInt long value);

    @Generated
    @Selector("setMipFilter:")
    public native void setMipFilter(@NUInt long value);

    @Generated
    @Selector("setNormalizedCoordinates:")
    public native void setNormalizedCoordinates(boolean value);

    @Generated
    @Selector("setRAddressMode:")
    public native void setRAddressMode(@NUInt long value);

    @Generated
    @Selector("setSAddressMode:")
    public native void setSAddressMode(@NUInt long value);

    @Generated
    @Selector("setTAddressMode:")
    public native void setTAddressMode(@NUInt long value);

    @Generated
    @Selector("tAddressMode")
    @NUInt
    public native long tAddressMode();

    @Generated
    @Selector("compareFunction")
    @NUInt
    public native long compareFunction();

    @Generated
    @Selector("lodAverage")
    public native boolean lodAverage();

    @Generated
    @Selector("setCompareFunction:")
    public native void setCompareFunction(@NUInt long value);

    @Generated
    @Selector("setLodAverage:")
    public native void setLodAverage(boolean value);
}
