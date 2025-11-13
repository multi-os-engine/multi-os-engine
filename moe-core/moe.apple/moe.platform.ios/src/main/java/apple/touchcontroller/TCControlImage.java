package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metal.protocol.MTLTexture;
import apple.uikit.UIImage;
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
 * Represents an image to be rendered using Metal.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCControlImage extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected TCControlImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCControlImage alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCControlImage allocWithZone(VoidPtr zone);

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
     * The Metal texture to use for the image when highlighted. May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("highlightTexture")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native MTLTexture highlightTexture();

    @Generated
    @Selector("init")
    public native TCControlImage init();

    /**
     * Creates a new image from a CGImage.
     * 
     * - Parameters:
     * - cgImage: The Core Graphics image to create the texture from.
     * - size: The size of the image in points.
     * - device: The Metal device used to create the texture.
     * - Returns: A new `TCControlImage` instance, or `nil` if texture creation fails.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithCGImage:size:device:")
    public native TCControlImage initWithCGImageSizeDevice(@NotNull CGImageRef cgImage, @ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

    /**
     * Creates a new image with the specified texture and size.
     * 
     * - Parameters:
     * - texture: The Metal texture to use for the image.
     * - size: The size of the image in points.
     * - Returns: A new `TCControlImage` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithTexture:size:")
    public native TCControlImage initWithTextureSize(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture,
            @ByValue CGSize size);

    /**
     * Creates a new image with the specified texture, size, highlight texture, offset, and color tint.
     * 
     * - Parameters:
     * - texture: The Metal texture to use for the image.
     * - size: The size of the image in points.
     * - highlightTexture: The Metal texture to use for the image when highlighted. May be `nil`.
     * - offset: The offset from the center of the parent control in points.
     * - tintColor: The color tint to apply to the texture. The color ref is retained.
     * - Returns: A new `TCControlImage` instance.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithTexture:size:highlightTexture:offset:tintColor:")
    public native TCControlImage initWithTextureSizeHighlightTextureOffsetTintColor(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLTexture texture, @ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) @Nullable MTLTexture highlightTexture, @ByValue CGPoint offset,
            @NotNull CGColorRef tintColor);

    /**
     * Creates a new image from a UIImage.
     * 
     * - Parameters:
     * - uiImage: The UIKit image to create the texture from.
     * - size: The size of the image in points.
     * - device: The Metal device used to create the texture.
     * - Returns: A new `TCControlImage` instance, or `nil` if the UIImage has no backing CGImage
     * or if texture creation fails.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("initWithUIImage:size:device:")
    public native TCControlImage initWithUIImageSizeDevice(@NotNull UIImage uiImage, @ByValue CGSize size,
            @Mapped(ObjCObjectMapper.class) @NotNull MTLDevice device);

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
    public static native TCControlImage new_objc();

    /**
     * The offset from the center of the parent control in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("offset")
    @ByValue
    public native CGPoint offset();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The Metal texture to use for the image when highlighted. May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setHighlightTexture:")
    public native void setHighlightTexture(@Mapped(ObjCObjectMapper.class) @Nullable MTLTexture value);

    /**
     * The offset from the center of the parent control in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue CGPoint value);

    /**
     * The size of the image in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * The Metal texture to use for the image.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTexture:")
    public native void setTexture(@Mapped(ObjCObjectMapper.class) @NotNull MTLTexture value);

    /**
     * The color tint to apply to the texture. The color ref is retained.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(@NotNull CGColorRef value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * The size of the image in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The Metal texture to use for the image.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("texture")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native MTLTexture texture();

    /**
     * The color tint to apply to the texture. The color ref is retained.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("tintColor")
    @NotNull
    public native CGColorRef tintColor();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}