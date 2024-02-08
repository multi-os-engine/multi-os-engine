package apple.uikit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 17.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIPageControlTimerProgress extends UIPageControlProgress {
    static {
        NatJ.register();
    }

    @Generated
    protected UIPageControlTimerProgress(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native UIPageControlTimerProgress alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native UIPageControlTimerProgress allocWithZone(VoidPtr zone);

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

    /**
     * An object that defines the delegate of the page control progress.
     */
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native Object delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Returns the duration for the specified page, and `preferredDuration` when there is no custom duration set
     * for the specified page.
     */
    @Generated
    @Selector("durationForPage:")
    public native double durationForPage(@NInt long page);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native UIPageControlTimerProgress init();

    /**
     * Creates a time interval progress with a specified preferred duration.
     */
    @Generated
    @Selector("initWithPreferredDuration:")
    public native UIPageControlTimerProgress initWithPreferredDuration(double preferredDuration);

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

    /**
     * Returns YES if the timer is currently active.
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

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
    public static native UIPageControlTimerProgress new_objc();

    /**
     * Pause the timer if it is active.
     */
    @Generated
    @Selector("pauseTimer")
    public native void pauseTimer();

    /**
     * The preferred duration for the time interval progress, used when there is no custom page duration set for the
     * current page.
     * The preferred duration must be greater than 0.0
     */
    @Generated
    @Selector("preferredDuration")
    public native double preferredDuration();

    /**
     * Determines if the page control should loop back to page 0 after the last page. Default is NO.
     */
    @Generated
    @Selector("resetsToInitialPageAfterEnd")
    public native boolean resetsToInitialPageAfterEnd();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Resume the timer if it is not currently active.
     */
    @Generated
    @Selector("resumeTimer")
    public native void resumeTimer();

    /**
     * An object that defines the delegate of the page control progress.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable Object value);

    /**
     * An object that defines the delegate of the page control progress.
     */
    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable Object value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Sets a custom duration for the specified page. Set 0.0 to remove the custom duration for the specified page.
     */
    @Generated
    @Selector("setDuration:forPage:")
    public native void setDurationForPage(double duration, @NInt long page);

    /**
     * The preferred duration for the time interval progress, used when there is no custom page duration set for the
     * current page.
     * The preferred duration must be greater than 0.0
     */
    @Generated
    @Selector("setPreferredDuration:")
    public native void setPreferredDuration(double value);

    /**
     * Determines if the page control should loop back to page 0 after the last page. Default is NO.
     */
    @Generated
    @Selector("setResetsToInitialPageAfterEnd:")
    public native void setResetsToInitialPageAfterEnd(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}