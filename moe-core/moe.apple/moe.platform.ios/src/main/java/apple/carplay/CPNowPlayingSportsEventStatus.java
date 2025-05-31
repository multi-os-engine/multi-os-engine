package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.uikit.UIImage;
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
 * A representation of the status of a sporting event.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNowPlayingSportsEventStatus extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNowPlayingSportsEventStatus(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNowPlayingSportsEventStatus alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPNowPlayingSportsEventStatus allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * The event timer, if it applies to this event. See @c CPNowPlayingSportsClock.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("eventClock")
    @Nullable
    public native CPNowPlayingSportsClock eventClock();

    /**
     * An optional event status image for this event, if it applies to this event. For example,
     * a baseball game could display a representation of the bases and outs, indicating
     * how many bases are loaded and the number of outs in the current inning.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("eventStatusImage")
    @Nullable
    public native UIImage eventStatusImage();

    /**
     * Up to three separate strings for event status may be displayed.
     * 
     * The first string should always be used to show the play period (quarter, inning, period)
     * using as few characters as possible; e.g. "2nd" for the 2nd quarter.
     * 
     * The second and third strings can be used to display additional information, like "1st & 10" and "SF 15"
     * for an American football game.
     * 
     * All three strings should be kept as brief as possible to ensure they display well on car screens
     * of various sizes.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("eventStatusText")
    @Nullable
    public native NSArray<String> eventStatusText();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPNowPlayingSportsEventStatus init();

    @Generated
    @Selector("initWithCoder:")
    public native CPNowPlayingSportsEventStatus initWithCoder(@NotNull NSCoder coder);

    /**
     * Initialize an event status with optional event status text, an optional event status image,
     * and an optional event clock.
     * 
     * @param eventStatusText  Up to three separate strings for event status may be displayed.
     * 
     *                         The first string should always be used to show the play period (quarter, inning, period)
     *                         using as few characters as possible; e.g. "2nd" for the 2nd quarter.
     * 
     *                         The second and third strings can be used to display additional information, like "1st &
     *                         10" and "SF 15"
     *                         for an American football game.
     * 
     *                         All three strings should be kept as brief as possible to ensure they display well on car
     *                         screens
     *                         of various sizes.
     * @param eventStatusImage An optional event status image for this event, if it applies to this event. For example,
     *                         a baseball game could display a representation of the bases and outs, indicating
     *                         how many bases are loaded and the number of outs in the current inning.
     * @param eventClock       The event timer, if it applies to this event. See @c CPNowPlayingSportsClock.
     * 
     * 
     *                         API-Since: 18.4
     */
    @Generated
    @Selector("initWithEventStatusText:eventStatusImage:eventClock:")
    public native CPNowPlayingSportsEventStatus initWithEventStatusTextEventStatusImageEventClock(
            @Nullable NSArray<String> eventStatusText, @Nullable UIImage eventStatusImage,
            @Nullable CPNowPlayingSportsClock eventClock);

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
    public static native CPNowPlayingSportsEventStatus new_objc();

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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}