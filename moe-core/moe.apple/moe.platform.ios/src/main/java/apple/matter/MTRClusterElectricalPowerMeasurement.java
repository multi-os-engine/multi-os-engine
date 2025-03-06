package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
 * Cluster Electrical Power Measurement
 * This cluster provides a mechanism for querying data about electrical power as measured by the server.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterElectricalPowerMeasurement extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterElectricalPowerMeasurement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterElectricalPowerMeasurement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterElectricalPowerMeasurement allocWithZone(VoidPtr zone);

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
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterElectricalPowerMeasurement init();

    /**
     * The queue is currently unused, but may be used in the future for calling completions
     * for command invocations if commands are added to this cluster.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterElectricalPowerMeasurement initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterElectricalPowerMeasurement new_objc();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAccuracyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAccuracyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeActiveCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeActivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeApparentCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApparentCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeApparentPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApparentPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeFrequencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFrequencyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeHarmonicCurrentsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHarmonicCurrentsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeHarmonicPhasesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHarmonicPhasesWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeNeutralCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNeutralCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeNumberOfMeasurementTypesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfMeasurementTypesWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributePowerFactorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerFactorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributePowerModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRMSCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRMSCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRMSPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRMSPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRMSVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRMSVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRangesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRangesWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeReactiveCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactiveCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeReactivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeVoltageWithParams(@Nullable MTRReadParams params);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}