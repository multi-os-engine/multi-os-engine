package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Thermostat
 * An interface for configuring and controlling the functionality of a thermostat.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterThermostat extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterThermostat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterThermostat alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterThermostat allocWithZone(VoidPtr zone);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeeklyScheduleWithExpectedValues:expectedValueInterval:completion:")
    public native void clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeeklyScheduleWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeeklyScheduleWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearWeeklyScheduleWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRThermostatClusterClearWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRThermostatClusterClearWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRThermostatClusterGetWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRThermostatClusterGetWeeklyScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRThermostatClusterGetWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRThermostatClusterGetWeeklyScheduleResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterThermostat init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterThermostat initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterThermostat initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterThermostat new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACCapacityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACCapacityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACCapacityformatWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACCapacityformatWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACCoilTemperatureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACCoilTemperatureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACCompressorTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACCompressorTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACErrorCodeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACErrorCodeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACLouverPositionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACLouverPositionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACRefrigerantTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACRefrigerantTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeACTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeACTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMaxCoolSetpointLimitWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMaxHeatSetpointLimitWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMinCoolSetpointLimitWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMinHeatSetpointLimitWithParams(
            @Nullable MTRReadParams params);

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
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeControlSequenceOfOperationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeControlSequenceOfOperationWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEmergencyHeatDeltaWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEmergencyHeatDeltaWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeHVACSystemTypeConfigurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHVACSystemTypeConfigurationWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLocalTemperatureCalibrationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocalTemperatureCalibrationWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLocalTemperatureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocalTemperatureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxCoolSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxCoolSetpointLimitWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxHeatSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxHeatSetpointLimitWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinCoolSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinCoolSetpointLimitWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinHeatSetpointLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinHeatSetpointLimitWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinSetpointDeadBandWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinSetpointDeadBandWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfDailyTransitionsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfDailyTransitionsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfWeeklyTransitionsWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupancyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupancyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupiedCoolingSetpointWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupiedCoolingSetpointWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupiedHeatingSetpointWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupiedHeatingSetpointWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupiedSetbackMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupiedSetbackMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupiedSetbackWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOutdoorTemperatureWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOutdoorTemperatureWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePICoolingDemandWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePICoolingDemandWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePIHeatingDemandWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePIHeatingDemandWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRemoteSensingWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRemoteSensingWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSetpointChangeAmountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSetpointChangeAmountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceTimestampWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSetpointChangeSourceTimestampWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSetpointChangeSourceWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeStartOfWeekWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStartOfWeekWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSystemModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSystemModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTemperatureSetpointHoldDurationWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTemperatureSetpointHoldWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeThermostatProgrammingOperationModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeThermostatProgrammingOperationModeWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeThermostatRunningModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeThermostatRunningModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeThermostatRunningStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeThermostatRunningStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUnoccupiedCoolingSetpointWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnoccupiedCoolingSetpointWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUnoccupiedHeatingSetpointWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnoccupiedHeatingSetpointWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnoccupiedSetbackMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnoccupiedSetbackMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUnoccupiedSetbackWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRThermostatClusterSetWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setWeeklyScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRThermostatClusterSetWeeklyScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setWeeklyScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setpointRaiseLowerWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRThermostatClusterSetpointRaiseLowerParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setpointRaiseLowerWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setpointRaiseLowerWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRThermostatClusterSetpointRaiseLowerParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setpointRaiseLowerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

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
    @Selector("writeAttributeACCapacityWithValue:expectedValueInterval:")
    public native void writeAttributeACCapacityWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACCapacityWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCapacityWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACCapacityformatWithValue:expectedValueInterval:")
    public native void writeAttributeACCapacityformatWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACCapacityformatWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCapacityformatWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACCompressorTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACCompressorTypeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACCompressorTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACCompressorTypeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACErrorCodeWithValue:expectedValueInterval:")
    public native void writeAttributeACErrorCodeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACErrorCodeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACErrorCodeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACLouverPositionWithValue:expectedValueInterval:")
    public native void writeAttributeACLouverPositionWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACLouverPositionWithValue:expectedValueInterval:params:")
    public native void writeAttributeACLouverPositionWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACRefrigerantTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACRefrigerantTypeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACRefrigerantTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACRefrigerantTypeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACTypeWithValue:expectedValueInterval:")
    public native void writeAttributeACTypeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeACTypeWithValue:expectedValueInterval:params:")
    public native void writeAttributeACTypeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:expectedValueInterval:")
    public native void writeAttributeControlSequenceOfOperationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:expectedValueInterval:params:")
    public native void writeAttributeControlSequenceOfOperationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:expectedValueInterval:")
    public native void writeAttributeEmergencyHeatDeltaWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:expectedValueInterval:params:")
    public native void writeAttributeEmergencyHeatDeltaWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:expectedValueInterval:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:expectedValueInterval:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMinCoolSetpointLimitWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinCoolSetpointLimitWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:expectedValueInterval:")
    public native void writeAttributeMinHeatSetpointLimitWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinHeatSetpointLimitWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:expectedValueInterval:")
    public native void writeAttributeMinSetpointDeadBandWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:expectedValueInterval:params:")
    public native void writeAttributeMinSetpointDeadBandWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedSetbackWithValue:expectedValueInterval:")
    public native void writeAttributeOccupiedSetbackWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOccupiedSetbackWithValue:expectedValueInterval:params:")
    public native void writeAttributeOccupiedSetbackWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRemoteSensingWithValue:expectedValueInterval:")
    public native void writeAttributeRemoteSensingWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRemoteSensingWithValue:expectedValueInterval:params:")
    public native void writeAttributeRemoteSensingWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSystemModeWithValue:expectedValueInterval:")
    public native void writeAttributeSystemModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSystemModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeSystemModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:expectedValueInterval:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:expectedValueInterval:params:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:expectedValueInterval:")
    public native void writeAttributeTemperatureSetpointHoldWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:expectedValueInterval:params:")
    public native void writeAttributeTemperatureSetpointHoldWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:expectedValueInterval:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:expectedValueInterval:")
    public native void writeAttributeUnoccupiedSetbackWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:expectedValueInterval:params:")
    public native void writeAttributeUnoccupiedSetbackWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}