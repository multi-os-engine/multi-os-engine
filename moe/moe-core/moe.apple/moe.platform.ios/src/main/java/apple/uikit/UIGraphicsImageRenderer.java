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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIGraphicsImageRenderer extends UIGraphicsRenderer {
    static {
        NatJ.register();
    }

    @Generated
    protected UIGraphicsImageRenderer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIGraphicsImageRenderer alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIGraphicsImageRenderer allocWithZone(VoidPtr zone);

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
    public static native UIGraphicsImageRenderer new_objc();

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

    @NotNull
    @Generated
    @Selector("JPEGDataWithCompressionQuality:actions:")
    public native NSData JPEGDataWithCompressionQualityActions(@NFloat double compressionQuality,
            @NotNull @ObjCBlock(name = "call_JPEGDataWithCompressionQualityActions") Block_JPEGDataWithCompressionQualityActions actions);

    /**
     * These return compressed image data with the contents of the image drawn in the renderer block.
     */
    @NotNull
    @Generated
    @Selector("PNGDataWithActions:")
    public native NSData PNGDataWithActions(
            @NotNull @ObjCBlock(name = "call_PNGDataWithActions") Block_PNGDataWithActions actions);

    /**
     * Returns a UIImage rendered with the contents of the CGContext after the imageRenderBlock executes.
     * If the options provided to the renderer contain a rect with a zero width or height size, this will return an
     * empty UIImage.
     */
    @NotNull
    @Generated
    @Selector("imageWithActions:")
    public native UIImage imageWithActions(
            @NotNull @ObjCBlock(name = "call_imageWithActions") Block_imageWithActions actions);

    @Generated
    @Selector("init")
    public native UIGraphicsImageRenderer init();

    @Generated
    @Selector("initWithBounds:")
    public native UIGraphicsImageRenderer initWithBounds(@ByValue CGRect bounds);

    @Generated
    @Selector("initWithBounds:format:")
    public native UIGraphicsImageRenderer initWithBoundsFormat(@ByValue CGRect bounds,
            @NotNull UIGraphicsImageRendererFormat format);

    @Generated
    @Selector("initWithSize:")
    public native UIGraphicsImageRenderer initWithSize(@ByValue CGSize size);

    @Generated
    @Selector("initWithSize:format:")
    public native UIGraphicsImageRenderer initWithSizeFormat(@ByValue CGSize size,
            @NotNull UIGraphicsImageRendererFormat format);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_JPEGDataWithCompressionQualityActions {
        @Generated
        void call_JPEGDataWithCompressionQualityActions(@NotNull UIGraphicsImageRendererContext rendererContext);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_PNGDataWithActions {
        @Generated
        void call_PNGDataWithActions(@NotNull UIGraphicsImageRendererContext rendererContext);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_imageWithActions {
        @Generated
        void call_imageWithActions(@NotNull UIGraphicsImageRendererContext rendererContext);
    }

    @Nullable
    @Generated
    @Selector("contextWithFormat:")
    public static native CGContextRef contextWithFormat(@NotNull UIGraphicsRendererFormat format);

    @Generated
    @Selector("prepareCGContext:withRendererContext:")
    public static native void prepareCGContextWithRendererContext(@NotNull CGContextRef context,
            @NotNull UIGraphicsRendererContext rendererContext);

    @NotNull
    @Generated
    @Selector("rendererContextClass")
    public static native Class rendererContextClass();
}
