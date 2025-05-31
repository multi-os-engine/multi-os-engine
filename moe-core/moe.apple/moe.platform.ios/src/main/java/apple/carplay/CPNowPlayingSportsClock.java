package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A representation of the amount of time elapsed so far in this event,
 * for events where the clock counts UP.
 * 
 * Or, a representation of the amount of time remaining in the event,
 * or a section of the event (period/quarter/etc.) for events where the
 * clock counts DOWN.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNowPlayingSportsClock extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNowPlayingSportsClock(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNowPlayingSportsClock alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPNowPlayingSportsClock allocWithZone(VoidPtr zone);

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
     * If true, the timer is counting UP, so as to indicate an amount of time elapsed
     * so far in this event.
     * 
     * If false, the timer is counting DOWN, so as to indicate an amount of time
     * remaining in the event, or a play period of the event (quarter/inning/period).
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("countsUp")
    public native boolean countsUp();

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
    public native CPNowPlayingSportsClock init();

    @Generated
    @Selector("initWithCoder:")
    public native CPNowPlayingSportsClock initWithCoder(@NotNull NSCoder coder);

    /**
     * Represents a duration of time that has elapsed so far in this event, or play period of the event
     * (quarter/inning/period).
     * 
     * When displayed on the now playing screen, the clock will count UP.
     * 
     * [@property] elapsedTime The amount of time elapsed so far in this event.
     * [@property] paused If YES, the clock will be paused at the specified elapsed time value. If NO, the clock will
     * count up.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithElapsedTime:paused:")
    public native CPNowPlayingSportsClock initWithElapsedTimePaused(double elapsedTime, boolean paused);

    /**
     * Represents an amount of time remaining in the event, or play period of the event (quarter/inning/period).
     * 
     * When displayed on the now playing screen, the clock will count DOWN.
     * 
     * [@property] timeRemaining The amount of time remaining in the event, or a play period of the event
     * (quarter/inning/period).
     * [@property] paused If YES, the clock will be paused at the specified time remaining value. If NO, the clock will
     * count down.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithTimeRemaining:paused:")
    public native CPNowPlayingSportsClock initWithTimeRemainingPaused(double timeRemaining, boolean paused);

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
     * Whether the clock should be paused, e.g. due to a stoppage in play.
     * 
     * If YES, the clock will be paused at the specified value.
     * 
     * If NO, the clock will count up (or down).
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isPaused")
    public native boolean isPaused();

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
    public static native CPNowPlayingSportsClock new_objc();

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

    /**
     * The time value in the clock; either elapsed time or time remaining.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("timeValue")
    public native double timeValue();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}