package apple.carplay;

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
 * CPRouteInformation describes information pertaining to a route that is necessary for rerouting.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("CarPlay")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CPRouteInformation extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CPRouteInformation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CPRouteInformation alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CPRouteInformation allocWithZone(VoidPtr zone);

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
     * currentLaneGuidance is a CPLaneGuidance object, describing the current lane guidance.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("currentLaneGuidance")
    @NotNull
    public native CPLaneGuidance currentLaneGuidance();

    /**
     * currentManeuvers is an array of CPManeuver objects, describing the current maneuvers.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("currentManeuvers")
    @NotNull
    public native NSArray<? extends CPManeuver> currentManeuvers();

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

    @Generated
    @Selector("init")
    public native CPRouteInformation init();

    /**
     * Initialize a CPRouteInformation object with maneuvers, lane guidances, the current maneuvers, the current lane
     * guidance, and trip and current maneuver travel estimates.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("initWithManeuvers:laneGuidances:currentManeuvers:currentLaneGuidance:tripTravelEstimates:maneuverTravelEstimates:")
    public native CPRouteInformation initWithManeuversLaneGuidancesCurrentManeuversCurrentLaneGuidanceTripTravelEstimatesManeuverTravelEstimates(
            @NotNull NSArray<? extends CPManeuver> maneuvers, @NotNull NSArray<? extends CPLaneGuidance> laneGuidances,
            @NotNull NSArray<? extends CPManeuver> currentManeuvers, @NotNull CPLaneGuidance currentLaneGuidance,
            @NotNull CPTravelEstimates tripTravelEstimates, @NotNull CPTravelEstimates maneuverTravelEstimates);

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
     * laneGuidances is an array of CPLaneGuidance objects, each describes a single lane guidance.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("laneGuidances")
    @NotNull
    public native NSArray<? extends CPLaneGuidance> laneGuidances();

    /**
     * maneuverTravelEstimates is a CPTravelEstimates object, describing the travel estimates for the first maneuver in
     * the list of current maneuvers.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("maneuverTravelEstimates")
    @NotNull
    public native CPTravelEstimates maneuverTravelEstimates();

    /**
     * maneuvers is an array of CPManeuver objects, each describes a single maneuver.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("maneuvers")
    @NotNull
    public native NSArray<? extends CPManeuver> maneuvers();

    @Generated
    @Owned
    @Selector("new")
    public static native CPRouteInformation new_objc();

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

    /**
     * tripTravelEstimates is a CPTravelEstimates object, describing the travel estimates for the current trip.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("tripTravelEstimates")
    @NotNull
    public native CPTravelEstimates tripTravelEstimates();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}