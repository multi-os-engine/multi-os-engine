package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
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
import org.moe.natj.general.ann.NFloat;

/**
 * API-Since: 15.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIKeyboardLayoutGuide extends UITrackingLayoutGuide {
    static {
        NatJ.register();
    }

    @Generated
    protected UIKeyboardLayoutGuide(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIKeyboardLayoutGuide alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native UIKeyboardLayoutGuide allocWithZone(VoidPtr zone);

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

    /**
     * Defaults to @c NO.
     */
    @Generated
    @Selector("followsUndockedKeyboard")
    public native boolean followsUndockedKeyboard();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIKeyboardLayoutGuide init();

    @Generated
    @Selector("initWithCoder:")
    public native UIKeyboardLayoutGuide initWithCoder(@NotNull NSCoder coder);

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
    public static native UIKeyboardLayoutGuide new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Defaults to @c NO.
     */
    @Generated
    @Selector("setFollowsUndockedKeyboard:")
    public native void setFollowsUndockedKeyboard(boolean value);

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

    /**
     * Defaults to 0.0. When a user scrolls to dismiss the keyboard (see @c UIScrollViewKeyboardDismissMode), the
     * gesture waits to start the dismiss until it intersects with the keyboard. This adds padding above the keyboard to
     * start the dismiss earlier. Negative values will be treated as 0.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("keyboardDismissPadding")
    @NFloat
    public native double keyboardDismissPadding();

    /**
     * Defaults to 0.0. When a user scrolls to dismiss the keyboard (see @c UIScrollViewKeyboardDismissMode), the
     * gesture waits to start the dismiss until it intersects with the keyboard. This adds padding above the keyboard to
     * start the dismiss earlier. Negative values will be treated as 0.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setKeyboardDismissPadding:")
    public native void setKeyboardDismissPadding(@NFloat double value);

    /**
     * Defaults to @c YES. When the keyboard is offscreen, the layout guide is tied to the bottomAnchor of the view's
     * safeAreaLayoutGuide. Set this to @c NO to instead have the guide use the bottomAnchor of the view.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("setUsesBottomSafeArea:")
    public native void setUsesBottomSafeArea(boolean value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * Defaults to @c YES. When the keyboard is offscreen, the layout guide is tied to the bottomAnchor of the view's
     * safeAreaLayoutGuide. Set this to @c NO to instead have the guide use the bottomAnchor of the view.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("usesBottomSafeArea")
    public native boolean usesBottomSafeArea();
}
