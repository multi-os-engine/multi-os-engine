package apple.carplay;

import apple.NSObject;
import apple.foundation.NSArray;
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
import apple.uikit.UIColor;

/**
 * [@c] CPNavigationSession represents the active navigation session. A @c CPNavigationSession will be created for you
 * when calling startNavigationSessionForTrip: on @c CYMapTemplate
 * 
 * API-Since: 12.0
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPNavigationSession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CPNavigationSession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPNavigationSession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CPNavigationSession allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Cancel the trip.
     */
    @Generated
    @Selector("cancelTrip")
    public native void cancelTrip();

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
     * Finish the trip.
     */
    @Generated
    @Selector("finishTrip")
    public native void finishTrip();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CPNavigationSession init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CPNavigationSession new_objc();

    /**
     * Pause the current trip.
     * 
     * @param reason      The reason navigation was paused.
     * @param description An optional description of the pause reason. If @c nil, a system-provided string will be used.
     */
    @Generated
    @Selector("pauseTripForReason:description:")
    public native void pauseTripForReasonDescription(@NUInt long reason, String description);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The next maneuvers that should be performed to follow the current route.
     * Multiple maneuvers are displayed simultaneously, however the system may limit the number of maneuvers shown at
     * the same time.
     */
    @Generated
    @Selector("setUpcomingManeuvers:")
    public native void setUpcomingManeuvers(NSArray<? extends CPManeuver> value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * The trip associated with this navigation session.
     */
    @Generated
    @Selector("trip")
    public native CPTrip trip();

    /**
     * The next maneuvers that should be performed to follow the current route.
     * Multiple maneuvers are displayed simultaneously, however the system may limit the number of maneuvers shown at
     * the same time.
     */
    @Generated
    @Selector("upcomingManeuvers")
    public native NSArray<? extends CPManeuver> upcomingManeuvers();

    /**
     * Update the travel estimates for the active navigation session and maneuver.
     * 
     * @param estimates The updated travel estimates.
     * @param maneuver  The maneuver pertaining to this update.
     */
    @Generated
    @Selector("updateTravelEstimates:forManeuver:")
    public native void updateTravelEstimatesForManeuver(CPTravelEstimates estimates, CPManeuver maneuver);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Pause the current trip.
     * 
     * @param reason        The reason navigation was paused.
     * @param description   An optional description of the pause reason. If @c nil, a system-provided string will be
     *                      used.
     * @param turnCardColor An optional color of the pause card. If @c nil, will fallback to the @c
     *                      guidanceBackgroundColor on @c CPMapTemplate. If no color is specified there, will default to
     *                      a system-provided color.
     * 
     *                      API-Since: 15.4
     */
    @Generated
    @Selector("pauseTripForReason:description:turnCardColor:")
    public native void pauseTripForReasonDescriptionTurnCardColor(@NUInt long reason, String description,
            UIColor turnCardColor);
}
