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
 * Cluster Pump Configuration and Control
 * An interface for configuring and controlling pumps.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterPumpConfigurationAndControl extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterPumpConfigurationAndControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterPumpConfigurationAndControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterPumpConfigurationAndControl allocWithZone(VoidPtr zone);

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
    public native MTRClusterPumpConfigurationAndControl init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterPumpConfigurationAndControl initWithDeviceEndpointQueue(@NotNull MTRDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * The queue is currently unused, but may be used in the future for calling completions
     * for command invocations if commands are added to this cluster.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterPumpConfigurationAndControl initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterPumpConfigurationAndControl new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCapacityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCapacityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeControlModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeControlModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEffectiveControlModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEffectiveControlModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEffectiveOperationModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEffectiveOperationModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLifetimeEnergyConsumedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLifetimeEnergyConsumedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLifetimeRunningHoursWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLifetimeRunningHoursWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxCompPressureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxCompPressureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxConstFlowWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxConstFlowWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxConstPressureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxConstPressureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxConstSpeedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxConstSpeedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxConstTempWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxConstTempWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxFlowWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxFlowWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxPressureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxPressureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxSpeedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxSpeedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinCompPressureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinCompPressureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinConstFlowWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinConstFlowWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinConstPressureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinConstPressureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinConstSpeedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinConstSpeedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinConstTempWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinConstTempWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOperationModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePumpStatusWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePumpStatusWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSpeedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSpeedWithParams(@Nullable MTRReadParams params);

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeControlModeWithValue:expectedValueInterval:")
    public native void writeAttributeControlModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeControlModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeControlModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLifetimeEnergyConsumedWithValue:expectedValueInterval:")
    public native void writeAttributeLifetimeEnergyConsumedWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLifetimeEnergyConsumedWithValue:expectedValueInterval:params:")
    public native void writeAttributeLifetimeEnergyConsumedWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLifetimeRunningHoursWithValue:expectedValueInterval:")
    public native void writeAttributeLifetimeRunningHoursWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLifetimeRunningHoursWithValue:expectedValueInterval:params:")
    public native void writeAttributeLifetimeRunningHoursWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOperationModeWithValue:expectedValueInterval:")
    public native void writeAttributeOperationModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOperationModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOperationModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}