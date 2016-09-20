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

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * lodMaxClamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodMaxClamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("lodMaxClamp")
    public native float lodMaxClamp();

    /**
     * lodMinClamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodMinClamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("lodMinClamp")
    public native float lodMinClamp();

    /**
     * magFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/magFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("magFilter")
    @NUInt
    public native long magFilter();

    /**
     * maxAnisotropy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/maxAnisotropy">iOS Dev Center</a>
     */
    @Generated
    @Selector("maxAnisotropy")
    @NUInt
    public native long maxAnisotropy();

    /**
     * minFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/minFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("minFilter")
    @NUInt
    public native long minFilter();

    /**
     * mipFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/mipFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("mipFilter")
    @NUInt
    public native long mipFilter();

    /**
     * normalizedCoordinates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/normalizedCoordinates">iOS Dev Center</a>
     */
    @Generated
    @Selector("normalizedCoordinates")
    public native boolean normalizedCoordinates();

    /**
     * rAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/rAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("rAddressMode")
    @NUInt
    public native long rAddressMode();

    /**
     * sAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/sAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("sAddressMode")
    @NUInt
    public native long sAddressMode();

    /**
     * label</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/label">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * lodMaxClamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodMaxClamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLodMaxClamp:")
    public native void setLodMaxClamp(float value);

    /**
     * lodMinClamp</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodMinClamp">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLodMinClamp:")
    public native void setLodMinClamp(float value);

    /**
     * magFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/magFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMagFilter:")
    public native void setMagFilter(@NUInt long value);

    /**
     * maxAnisotropy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/maxAnisotropy">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@NUInt long value);

    /**
     * minFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/minFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMinFilter:")
    public native void setMinFilter(@NUInt long value);

    /**
     * mipFilter</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/mipFilter">iOS Dev Center</a>
     */
    @Generated
    @Selector("setMipFilter:")
    public native void setMipFilter(@NUInt long value);

    /**
     * normalizedCoordinates</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/normalizedCoordinates">iOS Dev Center</a>
     */
    @Generated
    @Selector("setNormalizedCoordinates:")
    public native void setNormalizedCoordinates(boolean value);

    /**
     * rAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/rAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setRAddressMode:")
    public native void setRAddressMode(@NUInt long value);

    /**
     * sAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/sAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setSAddressMode:")
    public native void setSAddressMode(@NUInt long value);

    /**
     * tAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/tAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("setTAddressMode:")
    public native void setTAddressMode(@NUInt long value);

    /**
     * tAddressMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/tAddressMode">iOS Dev Center</a>
     */
    @Generated
    @Selector("tAddressMode")
    @NUInt
    public native long tAddressMode();

    /**
     * compareFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/compareFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("compareFunction")
    @NUInt
    public native long compareFunction();

    /**
     * lodAverage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodAverage">iOS Dev Center</a>
     */
    @Generated
    @Selector("lodAverage")
    public native boolean lodAverage();

    /**
     * compareFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/compareFunction">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCompareFunction:")
    public native void setCompareFunction(@NUInt long value);

    /**
     * lodAverage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Metal/Reference/MTLSamplerDescriptor_Ref/index.html#//apple_ref/occ/instp/MTLSamplerDescriptor/lodAverage">iOS Dev Center</a>
     */
    @Generated
    @Selector("setLodAverage:")
    public native void setLodAverage(boolean value);
}
