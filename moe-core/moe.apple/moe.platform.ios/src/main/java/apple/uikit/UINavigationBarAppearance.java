package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
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
public class UINavigationBarAppearance extends UIBarAppearance {
    static {
        NatJ.register();
    }

    @Generated
    protected UINavigationBarAppearance(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UINavigationBarAppearance alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UINavigationBarAppearance allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The appearance for back buttons. Defaults are drawn from buttonAppearance when appropriate.
     */
    @NotNull
    @Generated
    @Selector("backButtonAppearance")
    public native UIBarButtonItemAppearance backButtonAppearance();

    /**
     * The image shown on the leading edge of the back button.
     */
    @NotNull
    @Generated
    @Selector("backIndicatorImage")
    public native UIImage backIndicatorImage();

    /**
     * This image is used to mask content flowing underneath the backIndicatorImage during push & pop transitions
     */
    @NotNull
    @Generated
    @Selector("backIndicatorTransitionMaskImage")
    public native UIImage backIndicatorTransitionMaskImage();

    /**
     * The appearance for plain-style bar button items
     */
    @NotNull
    @Generated
    @Selector("buttonAppearance")
    public native UIBarButtonItemAppearance buttonAppearance();

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

    /**
     * The appearance for done-style bar button items
     */
    @NotNull
    @Generated
    @Selector("doneButtonAppearance")
    public native UIBarButtonItemAppearance doneButtonAppearance();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UINavigationBarAppearance init();

    @Generated
    @Selector("initWithBarAppearance:")
    public native UINavigationBarAppearance initWithBarAppearance(@NotNull UIBarAppearance barAppearance);

    @Generated
    @Selector("initWithCoder:")
    public native UINavigationBarAppearance initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithIdiom:")
    public native UINavigationBarAppearance initWithIdiom(@NInt long idiom);

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
     * Large Title text attributes. If the font or color are unspecified, appropriate defaults are supplied.
     */
    @NotNull
    @Generated
    @Selector("largeTitleTextAttributes")
    public native NSDictionary<String, ?> largeTitleTextAttributes();

    @Generated
    @Owned
    @Selector("new")
    public static native UINavigationBarAppearance new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The appearance for back buttons. Defaults are drawn from buttonAppearance when appropriate.
     */
    @Generated
    @Selector("setBackButtonAppearance:")
    public native void setBackButtonAppearance(@NotNull UIBarButtonItemAppearance value);

    /**
     * Set the backIndicatorImage & backIndicatorTransitionMaskImage images. If either image is nil, then both images
     * will be reset to their default.
     */
    @Generated
    @Selector("setBackIndicatorImage:transitionMaskImage:")
    public native void setBackIndicatorImageTransitionMaskImage(@Nullable UIImage backIndicatorImage,
            @Nullable UIImage backIndicatorTransitionMaskImage);

    /**
     * The appearance for plain-style bar button items
     */
    @Generated
    @Selector("setButtonAppearance:")
    public native void setButtonAppearance(@NotNull UIBarButtonItemAppearance value);

    /**
     * The appearance for done-style bar button items
     */
    @Generated
    @Selector("setDoneButtonAppearance:")
    public native void setDoneButtonAppearance(@NotNull UIBarButtonItemAppearance value);

    /**
     * Large Title text attributes. If the font or color are unspecified, appropriate defaults are supplied.
     */
    @Generated
    @Selector("setLargeTitleTextAttributes:")
    public native void setLargeTitleTextAttributes(@NotNull NSDictionary<String, ?> value);

    /**
     * An additional adjustment to the inline title's position.
     */
    @Generated
    @Selector("setTitlePositionAdjustment:")
    public native void setTitlePositionAdjustment(@ByValue UIOffset value);

    /**
     * Inline Title text attributes. If the font or color are unspecified, appropriate defaults are supplied.
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

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * An additional adjustment to the inline title's position.
     */
    @Generated
    @Selector("titlePositionAdjustment")
    @ByValue
    public native UIOffset titlePositionAdjustment();

    /**
     * Inline Title text attributes. If the font or color are unspecified, appropriate defaults are supplied.
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
