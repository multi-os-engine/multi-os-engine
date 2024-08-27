package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.struct.UIOffset;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 13.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UITabBarItemStateAppearance extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected UITabBarItemStateAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UITabBarItemStateAppearance alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UITabBarItemStateAppearance allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The color to use for the badge background
     */
    @Nullable
    @Generated
    @Selector("badgeBackgroundColor")
    public native UIColor badgeBackgroundColor();

    /**
     * An offset to apply to the badge's position
     */
    @Generated
    @Selector("badgePositionAdjustment")
    @ByValue
    public native UIOffset badgePositionAdjustment();

    /**
     * Text attributes to be used for rendering badge text. If the font and color are unspecified, appropriate defaults
     * are supplied.
     */
    @NotNull
    @Generated
    @Selector("badgeTextAttributes")
    public native NSDictionary<String, ?> badgeTextAttributes();

    /**
     * An offset to apply to the badge's title position
     */
    @Generated
    @Selector("badgeTitlePositionAdjustment")
    @ByValue
    public native UIOffset badgeTitlePositionAdjustment();

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
     * The color to use for item icons. If not specified, a suitable color will be derived.
     */
    @Nullable
    @Generated
    @Selector("iconColor")
    public native UIColor iconColor();

    @Generated
    @Selector("init")
    public native UITabBarItemStateAppearance init();

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
    public static native UITabBarItemStateAppearance new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The color to use for the badge background
     */
    @Generated
    @Selector("setBadgeBackgroundColor:")
    public native void setBadgeBackgroundColor(@Nullable UIColor value);

    /**
     * An offset to apply to the badge's position
     */
    @Generated
    @Selector("setBadgePositionAdjustment:")
    public native void setBadgePositionAdjustment(@ByValue UIOffset value);

    /**
     * Text attributes to be used for rendering badge text. If the font and color are unspecified, appropriate defaults
     * are supplied.
     */
    @Generated
    @Selector("setBadgeTextAttributes:")
    public native void setBadgeTextAttributes(@NotNull NSDictionary<String, ?> value);

    /**
     * An offset to apply to the badge's title position
     */
    @Generated
    @Selector("setBadgeTitlePositionAdjustment:")
    public native void setBadgeTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * The color to use for item icons. If not specified, a suitable color will be derived.
     */
    @Generated
    @Selector("setIconColor:")
    public native void setIconColor(@Nullable UIColor value);

    /**
     * An offset to apply to the UITabBarItem's title position
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * Text attributes to be used for rendering title text. If the font or color are unspecified, appropriate defaults
     * are supplied.
     */
    @Generated
    @Selector("setTitleTextAttributes:")
    public native void setTitleTextAttributes(@NotNull NSDictionary<String, ?> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * An offset to apply to the UITabBarItem's title position
     */
    @Generated
    @Selector("titlePositionAdjustment")
    @ByValue
    public native UIOffset titlePositionAdjustment();

    /**
     * Text attributes to be used for rendering title text. If the font or color are unspecified, appropriate defaults
     * are supplied.
     */
    @NotNull
    @Generated
    @Selector("titleTextAttributes")
    public native NSDictionary<String, ?> titleTextAttributes();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
