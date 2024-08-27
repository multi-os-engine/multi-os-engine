package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
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
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImageReaderConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected UIImageReaderConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIImageReaderConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIImageReaderConfiguration allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

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
    @Selector("init")
    public native UIImageReaderConfiguration init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native UIImageReaderConfiguration new_objc();

    /**
     * If non-zero when generating images, image metadata information (if present) will be used to determine the scale
     * to assign to the image. If zero all images will be assigned a scale of 1.0. Always assigns integral scales.
     * Defaults to 0.
     */
    @Generated
    @Selector("pixelsPerInch")
    @NFloat
    public native double pixelsPerInch();

    /**
     * If set, images loaded will be thumbnails of approximately the given size. Default value is CGSizeZero, indicating
     * that thumb-nailing is disabled. This size is always in pixels.
     */
    @Generated
    @Selector("preferredThumbnailSize")
    @ByValue
    public native CGSize preferredThumbnailSize();

    /**
     * For image types that may decode as either SDR or HDR, prefer the HDR variant. Images that may only decode as
     * either SDR or HDR are unaffected. Default depends on system capabilities.
     */
    @Generated
    @Selector("prefersHighDynamicRange")
    public native boolean prefersHighDynamicRange();

    /**
     * If set, images vended by the loader are automatically prepared for display. Default is NO.
     */
    @Generated
    @Selector("preparesImagesForDisplay")
    public native boolean preparesImagesForDisplay();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * If non-zero when generating images, image metadata information (if present) will be used to determine the scale
     * to assign to the image. If zero all images will be assigned a scale of 1.0. Always assigns integral scales.
     * Defaults to 0.
     */
    @Generated
    @Selector("setPixelsPerInch:")
    public native void setPixelsPerInch(@NFloat double value);

    /**
     * If set, images loaded will be thumbnails of approximately the given size. Default value is CGSizeZero, indicating
     * that thumb-nailing is disabled. This size is always in pixels.
     */
    @Generated
    @Selector("setPreferredThumbnailSize:")
    public native void setPreferredThumbnailSize(@ByValue CGSize value);

    /**
     * For image types that may decode as either SDR or HDR, prefer the HDR variant. Images that may only decode as
     * either SDR or HDR are unaffected. Default depends on system capabilities.
     */
    @Generated
    @Selector("setPrefersHighDynamicRange:")
    public native void setPrefersHighDynamicRange(boolean value);

    /**
     * If set, images vended by the loader are automatically prepared for display. Default is NO.
     */
    @Generated
    @Selector("setPreparesImagesForDisplay:")
    public native void setPreparesImagesForDisplay(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}