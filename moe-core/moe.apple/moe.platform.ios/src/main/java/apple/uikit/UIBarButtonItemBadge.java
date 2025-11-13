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
 * A badge to be rendered on a bar button item.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIBarButtonItemBadge extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected UIBarButtonItemBadge(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIBarButtonItemBadge alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIBarButtonItemBadge allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The badge's background color. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("backgroundColor")
    @Nullable
    public native UIColor backgroundColor();

    /**
     * Creates a badge with the specified `count`.
     * 
     * The count is localized when shown, and will update
     * when the app’s locale changes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("badgeWithCount:")
    public static native UIBarButtonItemBadge badgeWithCount(@NUInt long count);

    /**
     * Creates a badge with the specified `string`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("badgeWithString:")
    public static native UIBarButtonItemBadge badgeWithString(@NotNull String stringValue);

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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The font to use for the badge. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("font")
    @Nullable
    public native UIFont font();

    /**
     * The badge's foreground color. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("foregroundColor")
    @Nullable
    public native UIColor foregroundColor();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a badge that's empty, and just renders the badge background
     * with no content.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indicatorBadge")
    @NotNull
    public static native UIBarButtonItemBadge indicatorBadge();

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("init")
    public native UIBarButtonItemBadge init();

    @Generated
    @Selector("initWithCoder:")
    public native UIBarButtonItemBadge initWithCoder(@NotNull NSCoder coder);

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
    public static native UIBarButtonItemBadge new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The badge's background color. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBackgroundColor:")
    public native void setBackgroundColor(@Nullable UIColor value);

    /**
     * The font to use for the badge. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setFont:")
    public native void setFont(@Nullable UIFont value);

    /**
     * The badge's foreground color. A `nil` value will be treated as an indication to use the system default.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setForegroundColor:")
    public native void setForegroundColor(@Nullable UIColor value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 26.0
     */
    @Generated
    @Selector("stringValue")
    @Nullable
    public native String stringValue();

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