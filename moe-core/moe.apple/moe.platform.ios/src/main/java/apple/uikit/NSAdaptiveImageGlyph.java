package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.coregraphics.opaque.CGImageRef;
import apple.coretext.protocol.CTAdaptiveImageProviding;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.uniformtypeidentifiers.UTType;
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
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * NSAdaptiveImageGlyph is a data model object representing an image containing multiple resolutions and representations
 * conforming to the image format described by NSAdaptiveImageGlyph.contentType. It can be applied to a range of text
 * with NSAttributedString.Key.adaptiveImageGlyph (NSAdaptiveImageGlyphAttributeName).
 * 
 * API-Since: 18.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSAdaptiveImageGlyph extends NSObject implements NSCopying, NSSecureCoding, CTAdaptiveImageProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSAdaptiveImageGlyph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSAdaptiveImageGlyph alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native NSAdaptiveImageGlyph allocWithZone(VoidPtr zone);

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

    /**
     * Brief textual alternate representation of the represented contents, useful for non-graphical depiction of the
     * image data or searching. Note that the value of this property is derived from the underlying image data.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("contentDescription")
    @NotNull
    public native String contentDescription();

    /**
     * Unique identifier, derived from the underlying image data which can be used as a persistent / durable way to
     * reference the content represented by this adaptive image glyph instance.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("contentIdentifier")
    @NotNull
    public native String contentIdentifier();

    /**
     * A UTType identifying the image data format
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("contentType")
    @NotNull
    public static native UTType contentType();

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 18.0
     */
    @Generated
    @Selector("imageContent")
    @NotNull
    public native NSData imageContent();

    @Generated
    @Selector("imageForProposedSize:scaleFactor:imageOffset:imageSize:")
    @Nullable
    public native CGImageRef imageForProposedSizeScaleFactorImageOffsetImageSize(@ByValue CGSize proposedSize,
            @NFloat double scaleFactor,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CGPoint outImageOffset,
            @UncertainArgument("Options: reference, array Fallback: reference") @NotNull CGSize outImageSize);

    @Generated
    @Selector("init")
    public native NSAdaptiveImageGlyph init();

    @Generated
    @Selector("initWithCoder:")
    public native NSAdaptiveImageGlyph initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialization: imageContent must conform to the image data format identified by contentType
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("initWithImageContent:")
    public native NSAdaptiveImageGlyph initWithImageContent(@NotNull NSData imageContent);

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
    public static native NSAdaptiveImageGlyph new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}