package apple.uikit;

import apple.NSObject;
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
public class UIContentUnavailableTextProperties extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIContentUnavailableTextProperties(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Whether the font size of the text is automatically adjusted when necessary to fit in the available width.
     */
    @Generated
    @Selector("adjustsFontSizeToFitWidth")
    public native boolean adjustsFontSizeToFitWidth();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIContentUnavailableTextProperties alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIContentUnavailableTextProperties allocWithZone(VoidPtr zone);

    /**
     * Whether the text is tightened before truncating.
     */
    @Generated
    @Selector("allowsDefaultTighteningForTruncation")
    public native boolean allowsDefaultTighteningForTruncation();

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
     * The color of the text.
     */
    @Generated
    @Selector("color")
    @NotNull
    public native UIColor color();

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

    /**
     * The font used for the text.
     */
    @Generated
    @Selector("font")
    @NotNull
    public native UIFont font();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIContentUnavailableTextProperties init();

    @Generated
    @Selector("initWithCoder:")
    public native UIContentUnavailableTextProperties initWithCoder(@NotNull NSCoder coder);

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
     * The line break mode to use for the text.
     */
    @Generated
    @Selector("lineBreakMode")
    @NInt
    public native long lineBreakMode();

    /**
     * When `adjustsFontSizeToFitWidth` is enabled, the smallest multiplier for the font size used to make the text fit.
     */
    @Generated
    @Selector("minimumScaleFactor")
    @NFloat
    public native double minimumScaleFactor();

    @Generated
    @Owned
    @Selector("new")
    public static native UIContentUnavailableTextProperties new_objc();

    /**
     * The maximum number of lines for the text. 0 indicates the number of lines is unlimited.
     */
    @Generated
    @Selector("numberOfLines")
    @NInt
    public native long numberOfLines();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Whether the font size of the text is automatically adjusted when necessary to fit in the available width.
     */
    @Generated
    @Selector("setAdjustsFontSizeToFitWidth:")
    public native void setAdjustsFontSizeToFitWidth(boolean value);

    /**
     * Whether the text is tightened before truncating.
     */
    @Generated
    @Selector("setAllowsDefaultTighteningForTruncation:")
    public native void setAllowsDefaultTighteningForTruncation(boolean value);

    /**
     * The color of the text.
     */
    @Generated
    @Selector("setColor:")
    public native void setColor(@NotNull UIColor value);

    /**
     * The font used for the text.
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(@NotNull UIFont value);

    /**
     * The line break mode to use for the text.
     */
    @Generated
    @Selector("setLineBreakMode:")
    public native void setLineBreakMode(@NInt long value);

    /**
     * When `adjustsFontSizeToFitWidth` is enabled, the smallest multiplier for the font size used to make the text fit.
     */
    @Generated
    @Selector("setMinimumScaleFactor:")
    public native void setMinimumScaleFactor(@NFloat double value);

    /**
     * The maximum number of lines for the text. 0 indicates the number of lines is unlimited.
     */
    @Generated
    @Selector("setNumberOfLines:")
    public native void setNumberOfLines(@NInt long value);

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