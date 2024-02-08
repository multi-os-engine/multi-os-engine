package apple.uikit;

import apple.NSObject;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIContentUnavailableImageProperties extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContentUnavailableImageProperties(Pointer peer) {
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
    public static native UIContentUnavailableImageProperties alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIContentUnavailableImageProperties allocWithZone(VoidPtr zone);

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
    public native UIContentUnavailableImageProperties init();

    @Generated
    @Selector("initWithCoder:")
    public native UIContentUnavailableImageProperties initWithCoder(@NotNull NSCoder coder);

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
    public static native UIContentUnavailableImageProperties new_objc();

    /**
     * The symbol configuration to use.
     */
    @Generated
    @Selector("preferredSymbolConfiguration")
    @Nullable
    public native UIImageSymbolConfiguration preferredSymbolConfiguration();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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
     * The tint color to apply to the image view. Nil will use the image view's normal inherited tint color.
     */
    @Generated
    @Selector("setTintColor:")
    public native void setTintColor(@Nullable UIColor value);

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
     * The tint color to apply to the image view. Nil will use the image view's normal inherited tint color.
     */
    @Generated
    @Selector("tintColor")
    @Nullable
    public native UIColor tintColor();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}