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
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

/**
 * API-Since: 9.0
 */
@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIImageAccumulator extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CIImageAccumulator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIImageAccumulator alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CIImageAccumulator allocWithZone(VoidPtr zone);

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

    /**
     * Create a new accumulator object.
     * For pixel format options see CIImage.h.
     * The specified color space is used to render the image.
     * If no color space is specified, no color matching is done.
     * The return values will be null if the format is unsupported or the extent is too big.
     */
    @Generated
    @Selector("imageAccumulatorWithExtent:format:")
    public static native CIImageAccumulator imageAccumulatorWithExtentFormat(@ByValue CGRect extent, int format);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("imageAccumulatorWithExtent:format:colorSpace:")
    public static native CIImageAccumulator imageAccumulatorWithExtentFormatColorSpace(@ByValue CGRect extent,
            int format, @NotNull CGColorSpaceRef colorSpace);

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
    public static native CIImageAccumulator new_objc();

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
     * Reset the accumulator, discarding any pending updates and current content.
     */
    @Generated
    @Selector("clear")
    public native void clear();

    /**
     * Return the extent of the accumulator.
     */
    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    /**
     * Return the pixel format of the accumulator.
     */
    @Generated
    @Selector("format")
    public native int format();

    /**
     * Return an image representing the current contents of the accumulator.
     * Rendering the image after subsequently calling setImage: has
     * undefined behavior.
     */
    @NotNull
    @Generated
    @Selector("image")
    public native CIImage image();

    @Generated
    @Selector("init")
    public native CIImageAccumulator init();

    @Generated
    @Selector("initWithExtent:format:")
    public native CIImageAccumulator initWithExtentFormat(@ByValue CGRect extent, int format);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("initWithExtent:format:colorSpace:")
    public native CIImageAccumulator initWithExtentFormatColorSpace(@ByValue CGRect extent, int format,
            @NotNull CGColorSpaceRef colorSpace);

    /**
     * Set the image 'im' as the current contents of the accumulator.
     */
    @Generated
    @Selector("setImage:")
    public native void setImage(@NotNull CIImage image);

    /**
     * Set the image 'im' as the accumulator's contents. The caller guarantees
     * that the new contents only differ from the old within the specified
     * region.
     */
    @Generated
    @Selector("setImage:dirtyRect:")
    public native void setImageDirtyRect(@NotNull CIImage image, @ByValue CGRect dirtyRect);
}
