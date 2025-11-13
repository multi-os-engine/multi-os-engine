package apple.touchcontroller;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.touchcontroller.protocol.TCControl;
import apple.touchcontroller.protocol.TCControlLayout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
 * Represents a single on-screen throttle - a one axis input.
 * 
 * This is mirrored by a `GCControllerButtonInput` on the associated `GCController` instance.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("TouchController")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class TCThrottle extends NSObject implements TCControl, TCControlLayout {
    static {
        NatJ.register();
    }

    @Generated
    protected TCThrottle(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native TCThrottle alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native TCThrottle allocWithZone(VoidPtr zone);

    @Generated
    @Selector("anchor")
    @NInt
    public native long anchor();

    @Generated
    @Selector("anchorCoordinateSystem")
    @NInt
    public native long anchorCoordinateSystem();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * The contents for the background of the throttle.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("backgroundContents")
    @Nullable
    public native TCControlContents backgroundContents();

    /**
     * The initial value of this control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("baseValue")
    @NFloat
    public native double baseValue();

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
    @Selector("colliderShape")
    @NInt
    public native long colliderShape();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("handleTouchBeganAtPoint:")
    public native void handleTouchBeganAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("handleTouchEndedAtPoint:")
    public native void handleTouchEndedAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("handleTouchMovedAtPoint:")
    public native void handleTouchMovedAtPoint(@ByValue CGPoint point);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("highlightDuration")
    public native double highlightDuration();

    /**
     * The contents for the indicator of the throttle.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indicatorContents")
    @Nullable
    public native TCControlContents indicatorContents();

    /**
     * The size (width, height) of the indicator itself in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("indicatorSize")
    @ByValue
    public native CGSize indicatorSize();

    @Generated
    @Selector("init")
    public native TCThrottle init();

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
    @Selector("isEnabled")
    public native boolean isEnabled();

    @Generated
    @Selector("isPressed")
    public native boolean isPressed();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Selector("label")
    @NotNull
    public native TCControlLabel label();

    @Generated
    @Owned
    @Selector("new")
    public static native TCThrottle new_objc();

    @Generated
    @Selector("offset")
    @ByValue
    public native CGPoint offset();

    /**
     * The orientation of the throttle.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("orientation")
    @NInt
    public native long orientation();

    @Generated
    @Selector("position")
    @ByValue
    public native CGPoint position();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAnchor:")
    public native void setAnchor(@NInt long value);

    @Generated
    @Selector("setAnchorCoordinateSystem:")
    public native void setAnchorCoordinateSystem(@NInt long value);

    /**
     * The contents for the background of the throttle.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBackgroundContents:")
    public native void setBackgroundContents(@Nullable TCControlContents value);

    /**
     * The initial value of this control.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setBaseValue:")
    public native void setBaseValue(@NFloat double value);

    @Generated
    @Selector("setEnabled:")
    public native void setEnabled(boolean value);

    @Generated
    @Selector("setHighlightDuration:")
    public native void setHighlightDuration(double value);

    /**
     * The contents for the indicator of the throttle.
     * 
     * May be `nil`.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndicatorContents:")
    public native void setIndicatorContents(@Nullable TCControlContents value);

    /**
     * The size (width, height) of the indicator itself in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setIndicatorSize:")
    public native void setIndicatorSize(@ByValue CGSize value);

    @Generated
    @Selector("setOffset:")
    public native void setOffset(@ByValue CGPoint value);

    @Generated
    @Selector("setSize:")
    public native void setSize(@ByValue CGSize value);

    /**
     * A Boolean value that indicates whether the control reverts to it's base value.
     * 
     * If `YES`, the control's value will revert to its base value when no longer pressed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setSnapsToBaseValue:")
    public native void setSnapsToBaseValue(boolean value);

    /**
     * The size (width, height) of the throttle itself, providing boundaries for the indicator, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("setThrottleSize:")
    public native void setThrottleSize(@ByValue CGSize value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("setZIndex:")
    public native void setZIndex(@NInt long value);

    @Generated
    @Selector("size")
    @ByValue
    public native CGSize size();

    /**
     * A Boolean value that indicates whether the control reverts to it's base value.
     * 
     * If `YES`, the control's value will revert to its base value when no longer pressed.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("snapsToBaseValue")
    public native boolean snapsToBaseValue();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The size (width, height) of the throttle itself, providing boundaries for the indicator, in points.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("throttleSize")
    @ByValue
    public native CGSize throttleSize();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("zIndex")
    @NInt
    public native long zIndex();
}