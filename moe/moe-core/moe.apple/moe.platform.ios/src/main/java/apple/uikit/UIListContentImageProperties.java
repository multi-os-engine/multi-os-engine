package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 14.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIListContentImageProperties extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIListContentImageProperties(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Prevents the image from inverting its colors when the accessibility setting is enabled.
     */
    @Generated
    @Selector("accessibilityIgnoresInvertColors")
    public native boolean accessibilityIgnoresInvertColors();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIListContentImageProperties alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIListContentImageProperties allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * The preferred corner radius (using a continuous corner curve) for the image.
     * Default is 0. If the image is too small to fit the requested radius, the corner curve
     * and radius will be adjusted to fit.
     */
    @Generated
    @Selector("cornerRadius")
    @NFloat
    public native double cornerRadius();

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

    @Generated
    @Selector("init")
    public native UIListContentImageProperties init();

    @Generated
    @Selector("initWithCoder:")
    public native UIListContentImageProperties initWithCoder(@NotNull NSCoder coder);

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

    /**
     * Enforces a maximum size for the image. The default value is CGSizeZero. A zero width or
     * height means the size is unconstrained on that dimension. If the image exceeds this size
     * on either dimension, its size will be reduced proportionately (maintaining aspect ratio).
     */
    @Generated
    @Selector("maximumSize")
    @ByValue
    public native CGSize maximumSize();

    @Generated
    @Owned
    @Selector("new")
    public static native UIListContentImageProperties new_objc();

    /**
     * The symbol configuration to use.
     */
    @Nullable
    @Generated
    @Selector("preferredSymbolConfiguration")
    public native UIImageSymbolConfiguration preferredSymbolConfiguration();

    /**
     * The layout size that is reserved for the image, inside which the image will be centered.
     * The default value is CGSizeZero. The reservedLayoutSize width & height only affect the
     * space reserved for the image and its positioning; they do not affect the image's size.
     * A zero width or height means the default behavior is used for that dimension:
     * * Symbol images will be centered inside a standard width/height that is scaled
     * with the content size category.
     * * Non-symbol images will use a reservedLayoutSize equal to the actual size of the
     * displayed image.
     * Use the UIListContentImageStandardDimension constant for the width and/or height to force
     * the standard symbol image value to be used for that dimension, regardless of the image.
     * This property is used to horizontally align images across adjacent content views (even
     * when the actual image widths may vary slightly), and/or to ensure a consistent height is
     * reserved for different images across different content views (so that the content view
     * heights are consistent even when the actual image heights may vary slightly). The
     * reservedLayoutSize.width is ignored by content views at Accessibility Dynamic Type
     * sizes, and the reservedLayoutSize.height is ignored when using the special Accessibility
     * Dynamic Type layout where text wraps around the image.
     */
    @Generated
    @Selector("reservedLayoutSize")
    @ByValue
    public native CGSize reservedLayoutSize();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Returns the resolved image tint color for the specified tint color of the view, based on the `tintColor` and
     * `tintColorTransformer`.
     */
    @NotNull
    @Generated
    @Selector("resolvedTintColorForTintColor:")
    public native UIColor resolvedTintColorForTintColor(@NotNull UIColor tintColor);

    /**
     * Prevents the image from inverting its colors when the accessibility setting is enabled.
     */
    @Generated
    @Selector("setAccessibilityIgnoresInvertColors:")
    public native void setAccessibilityIgnoresInvertColors(boolean value);

    /**
     * The preferred corner radius (using a continuous corner curve) for the image.
     * Default is 0. If the image is too small to fit the requested radius, the corner curve
     * and radius will be adjusted to fit.
     */
    @Generated
    @Selector("setCornerRadius:")
    public native void setCornerRadius(@NFloat double value);

    /**
     * Enforces a maximum size for the image. The default value is CGSizeZero. A zero width or
     * height means the size is unconstrained on that dimension. If the image exceeds this size
     * on either dimension, its size will be reduced proportionately (maintaining aspect ratio).
     */
    @Generated
    @Selector("setMaximumSize:")
    public native void setMaximumSize(@ByValue CGSize value);

    /**
     * The symbol configuration to use.
     */
    @Generated
    @Selector("setPreferredSymbolConfiguration:")
    public native void setPreferredSymbolConfiguration(@Nullable UIImageSymbolConfiguration value);

    /**
     * The layout size that is reserved for the image, inside which the image will be centered.
     * The default value is CGSizeZero. The reservedLayoutSize width & height only affect the
     * space reserved for the image and its positioning; they do not affect the image's size.
     * A zero width or height means the default behavior is used for that dimension:
     * * Symbol images will be centered inside a standard width/height that is scaled
     * with the content size category.
     * * Non-symbol images will use a reservedLayoutSize equal to the actual size of the
     * displayed image.
     * Use the UIListContentImageStandardDimension constant for the width and/or height to force
     * the standard symbol image value to be used for that dimension, regardless of the image.
     * This property is used to horizontally align images across adjacent content views (even
     * when the actual image widths may vary slightly), and/or to ensure a consistent height is
     * reserved for different images across different content views (so that the content view
     * heights are consistent even when the actual image heights may vary slightly). The
     * reservedLayoutSize.width is ignored by content views at Accessibility Dynamic Type
     * sizes, and the reservedLayoutSize.height is ignored when using the special Accessibility
     * Dynamic Type layout where text wraps around the image.
     */
    @Generated
    @Selector("setReservedLayoutSize:")
    public native void setReservedLayoutSize(@ByValue CGSize value);

    /**
     * The tintColor to apply to the image view. Nil will use the image view's normal inherited tintColor.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(@Nullable UIColor value);

    /**
     * Optional color transformer that is used to resolve the tint color. A nil value means the `tintColor` is used
     * as-is.
     */
    @Generated
    @Selector("setTintColorTransformer:")
    public native void setTintColorTransformer(
            @Nullable @ObjCBlock(name = "call_setTintColorTransformer") Block_setTintColorTransformer value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTintColorTransformer {
        @NotNull
        @Generated
        UIColor call_setTintColorTransformer(@NotNull UIColor color);
    }

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

    /**
     * The tintColor to apply to the image view. Nil will use the image view's normal inherited tintColor.
     */
    @Nullable
    @Generated
    @Selector("tintColor")
    public native UIColor tintColor();

    /**
     * Optional color transformer that is used to resolve the tint color. A nil value means the `tintColor` is used
     * as-is.
     */
    @Nullable
    @Generated
    @Selector("tintColorTransformer")
    @ObjCBlock(name = "call_tintColorTransformer_ret")
    public native Block_tintColorTransformer_ret tintColorTransformer();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_tintColorTransformer_ret {
        @NotNull
        @Generated
        UIColor call_tintColorTransformer_ret(@NotNull UIColor color);
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
