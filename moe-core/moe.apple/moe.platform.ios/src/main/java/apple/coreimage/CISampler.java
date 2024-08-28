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

package apple.coreimage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGRect;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CISampler extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CISampler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CISampler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CISampler allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CISampler new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Creates a new sampler object refencing 'im'.
     */
    @Generated
    @Selector("samplerWithImage:")
    public static native CISampler samplerWithImage(@NotNull CIImage im);

    /**
     * Creates a new sampler object from 'im' specifying key/value option
     * pairs. Each key is an NSString. Supported keys include:
     * 
     * kCISamplerAffineMatrix: An NSArray [a b c d tx ty] defining the
     * transformation to be applied to the sampler.
     * 
     * kCISamplerWrapMode: An NSString defining how pixels outside the
     * sampler's extent are produced. Options include kCISamplerWrapBlack
     * (pixels are transparent black, the default) and kCISamplerWrapClamp
     * (coordinates are clamped to the extent).
     * 
     * kCISamplerFilterMode: An NSString defining the filter to use when
     * sampling the image. One of kCISamplerFilterNearest (point sampling)
     * or kCISamplerFilterLinear (bilinear interpolation, the default).
     */
    @Generated
    @Variadic()
    @Selector("samplerWithImage:keysAndValues:")
    public static native CISampler samplerWithImageKeysAndValues(@NotNull CIImage im,
            @Mapped(ObjCObjectMapper.class) Object key0, Object... varargs);

    @Generated
    @Selector("samplerWithImage:options:")
    public static native CISampler samplerWithImageOptions(@NotNull CIImage im, @Nullable NSDictionary<?, ?> dict);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Returns the shape containing the Domain Of Definition (DOD) of the
     * sampler. The DOD is defined such that it contains all non-transparent
     * pixels produced by referencing the sampler.
     * This property is KVO-safe
     */
    @NotNull
    @Generated
    @Selector("definition")
    public native CIFilterShape definition();

    /**
     * Returns the extent of the sampler. Sampling outside the extent will
     * bring the sampler's wrap mode into action.
     */
    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    @Generated
    @Selector("init")
    public native CISampler init();

    /**
     * Initializers.
     */
    @Generated
    @Selector("initWithImage:")
    public native CISampler initWithImage(@NotNull CIImage im);

    @Generated
    @Variadic()
    @Selector("initWithImage:keysAndValues:")
    public native CISampler initWithImageKeysAndValues(@NotNull CIImage im, @Mapped(ObjCObjectMapper.class) Object key0,
            Object... varargs);

    @Generated
    @Selector("initWithImage:options:")
    public native CISampler initWithImageOptions(@NotNull CIImage im, @Nullable NSDictionary<?, ?> dict);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
