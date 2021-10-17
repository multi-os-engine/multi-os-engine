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

/**
 * MTLSamplerDescriptor
 * <p>
 * A mutable descriptor used to configure a sampler.  When complete, this can be used to create an immutable MTLSamplerState.
 */
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
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTLSamplerDescriptor alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MTLSamplerDescriptor allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("new")
    public static native MTLSamplerDescriptor new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] compareFunction
     * <p>
     * Set the comparison function used when sampling shadow maps. The default value is MTLCompareFunctionNever.
     */
    @Generated
    @Selector("compareFunction")
    @NUInt
    public native long compareFunction();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("init")
    public native MTLSamplerDescriptor init();

    /**
     * [@property] label
     * <p>
     * A string to help identify the created object.
     */
    @Generated
    @Selector("label")
    public native String label();

    /**
     * [@property] lodAverage
     * <p>
     * If YES, an average level of detail will be used when sampling from a texture. If NO, no averaging is performed.
     * <p>
     * lodAverage defaults to NO. This option is a performance hint. An implementation is free to ignore this property.
     */
    @Generated
    @Selector("lodAverage")
    public native boolean lodAverage();

    /**
     * [@property] lodMaxClamp
     * <p>
     * The maximum level of detail that will be used when sampling from a texture.
     * <p>
     * The default value of lodMaxClamp is FLT_MAX.  Clamp values are ignored for texture sample variants that specify an explicit level of detail.
     */
    @Generated
    @Selector("lodMaxClamp")
    public native float lodMaxClamp();

    /**
     * [@property] lodMinClamp
     * <p>
     * The minimum level of detail that will be used when sampling from a texture.
     * <p>
     * The default value of lodMinClamp is 0.0.  Clamp values are ignored for texture sample variants that specify an explicit level of detail.
     */
    @Generated
    @Selector("lodMinClamp")
    public native float lodMinClamp();

    /**
     * [@property] magFilter
     * <p>
     * Filter option for combining texels within a mipmap level the sample footprint is smaller than a pixel (magnification).
     * <p>
     * The default value is MTLSamplerMinMagFilterNearest.
     */
    @Generated
    @Selector("magFilter")
    @NUInt
    public native long magFilter();

    /**
     * [@property] maxAnisotropy
     * <p>
     * The number of samples that can be taken to improve quality of sample footprints that are anisotropic.
     * <p>
     * The default value is 1.
     */
    @Generated
    @Selector("maxAnisotropy")
    @NUInt
    public native long maxAnisotropy();

    /**
     * [@property] minFilter
     * <p>
     * Filter option for combining texels within a mipmap level the sample footprint is larger than a pixel (minification).
     * <p>
     * The default value is MTLSamplerMinMagFilterNearest.
     */
    @Generated
    @Selector("minFilter")
    @NUInt
    public native long minFilter();

    /**
     * [@property] mipFilter
     * <p>
     * Filter options for filtering between two mipmap levels.
     * <p>
     * The default value is MTLSamplerMipFilterNotMipmapped
     */
    @Generated
    @Selector("mipFilter")
    @NUInt
    public native long mipFilter();

    /**
     * [@property] normalizedCoordinates.
     * <p>
     * If YES, texture coordates are from 0 to 1.  If NO, texture coordinates are 0..width, 0..height.
     * <p>
     * normalizedCoordinates defaults to YES.  Non-normalized coordinates should only be used with 1D and 2D textures with the ClampToEdge wrap mode, otherwise the results of sampling are undefined.
     */
    @Generated
    @Selector("normalizedCoordinates")
    public native boolean normalizedCoordinates();

    /**
     * [@property] rAddressMode
     * <p>
     * Set the wrap mode for the R texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("rAddressMode")
    @NUInt
    public native long rAddressMode();

    /**
     * [@property] sAddressMode
     * <p>
     * Set the wrap mode for the S texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("sAddressMode")
    @NUInt
    public native long sAddressMode();

    /**
     * [@property] compareFunction
     * <p>
     * Set the comparison function used when sampling shadow maps. The default value is MTLCompareFunctionNever.
     */
    @Generated
    @Selector("setCompareFunction:")
    public native void setCompareFunction(@NUInt long value);

    /**
     * [@property] label
     * <p>
     * A string to help identify the created object.
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(String value);

    /**
     * [@property] lodAverage
     * <p>
     * If YES, an average level of detail will be used when sampling from a texture. If NO, no averaging is performed.
     * <p>
     * lodAverage defaults to NO. This option is a performance hint. An implementation is free to ignore this property.
     */
    @Generated
    @Selector("setLodAverage:")
    public native void setLodAverage(boolean value);

    /**
     * [@property] lodMaxClamp
     * <p>
     * The maximum level of detail that will be used when sampling from a texture.
     * <p>
     * The default value of lodMaxClamp is FLT_MAX.  Clamp values are ignored for texture sample variants that specify an explicit level of detail.
     */
    @Generated
    @Selector("setLodMaxClamp:")
    public native void setLodMaxClamp(float value);

    /**
     * [@property] lodMinClamp
     * <p>
     * The minimum level of detail that will be used when sampling from a texture.
     * <p>
     * The default value of lodMinClamp is 0.0.  Clamp values are ignored for texture sample variants that specify an explicit level of detail.
     */
    @Generated
    @Selector("setLodMinClamp:")
    public native void setLodMinClamp(float value);

    /**
     * [@property] magFilter
     * <p>
     * Filter option for combining texels within a mipmap level the sample footprint is smaller than a pixel (magnification).
     * <p>
     * The default value is MTLSamplerMinMagFilterNearest.
     */
    @Generated
    @Selector("setMagFilter:")
    public native void setMagFilter(@NUInt long value);

    /**
     * [@property] maxAnisotropy
     * <p>
     * The number of samples that can be taken to improve quality of sample footprints that are anisotropic.
     * <p>
     * The default value is 1.
     */
    @Generated
    @Selector("setMaxAnisotropy:")
    public native void setMaxAnisotropy(@NUInt long value);

    /**
     * [@property] minFilter
     * <p>
     * Filter option for combining texels within a mipmap level the sample footprint is larger than a pixel (minification).
     * <p>
     * The default value is MTLSamplerMinMagFilterNearest.
     */
    @Generated
    @Selector("setMinFilter:")
    public native void setMinFilter(@NUInt long value);

    /**
     * [@property] mipFilter
     * <p>
     * Filter options for filtering between two mipmap levels.
     * <p>
     * The default value is MTLSamplerMipFilterNotMipmapped
     */
    @Generated
    @Selector("setMipFilter:")
    public native void setMipFilter(@NUInt long value);

    /**
     * [@property] normalizedCoordinates.
     * <p>
     * If YES, texture coordates are from 0 to 1.  If NO, texture coordinates are 0..width, 0..height.
     * <p>
     * normalizedCoordinates defaults to YES.  Non-normalized coordinates should only be used with 1D and 2D textures with the ClampToEdge wrap mode, otherwise the results of sampling are undefined.
     */
    @Generated
    @Selector("setNormalizedCoordinates:")
    public native void setNormalizedCoordinates(boolean value);

    /**
     * [@property] rAddressMode
     * <p>
     * Set the wrap mode for the R texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("setRAddressMode:")
    public native void setRAddressMode(@NUInt long value);

    /**
     * [@property] sAddressMode
     * <p>
     * Set the wrap mode for the S texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("setSAddressMode:")
    public native void setSAddressMode(@NUInt long value);

    /**
     * [@property] tAddressMode
     * <p>
     * Set the wrap mode for the T texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("setTAddressMode:")
    public native void setTAddressMode(@NUInt long value);

    /**
     * [@property] tAddressMode
     * <p>
     * Set the wrap mode for the T texture coordinate.  The default value is MTLSamplerAddressModeClampToEdge.
     */
    @Generated
    @Selector("tAddressMode")
    @NUInt
    public native long tAddressMode();

    /**
     * [@property] supportArgumentBuffers
     * <p>
     * true if the sampler can be used inside an argument buffer
     */
    @Generated
    @Selector("setSupportArgumentBuffers:")
    public native void setSupportArgumentBuffers(boolean value);

    /**
     * [@property] supportArgumentBuffers
     * <p>
     * true if the sampler can be used inside an argument buffer
     */
    @Generated
    @Selector("supportArgumentBuffers")
    public native boolean supportArgumentBuffers();

    /**
     * [@property] borderColor
     * <p>
     * Set the color for the MTLSamplerAddressMode to one of the predefined in the MTLSamplerBorderColor enum.
     */
    @Generated
    @Selector("borderColor")
    @NUInt
    public native long borderColor();

    /**
     * [@property] borderColor
     * <p>
     * Set the color for the MTLSamplerAddressMode to one of the predefined in the MTLSamplerBorderColor enum.
     */
    @Generated
    @Selector("setBorderColor:")
    public native void setBorderColor(@NUInt long value);
}
