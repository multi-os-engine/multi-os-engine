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
 * Cluster Electrical Measurement
 * Attributes related to the electrical properties of a device. This cluster is used by power outlets and other devices
 * that need to provide instantaneous data as opposed to metrology data which should be retrieved from the metering
 * cluster..
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterElectricalMeasurement extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterElectricalMeasurement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterElectricalMeasurement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterElectricalMeasurement allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getMeasurementProfileCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * getMeasurementProfileCommandWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getMeasurementProfileCommandWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getMeasurementProfileCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getProfileInfoCommandWithExpectedValues:expectedValueInterval:completion:")
    public native void getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getProfileInfoCommandWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getProfileInfoCommandWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getProfileInfoCommandWithExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getProfileInfoCommandWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRElectricalMeasurementClusterGetProfileInfoCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getProfileInfoCommandWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getProfileInfoCommandWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRElectricalMeasurementClusterGetProfileInfoCommandParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getProfileInfoCommandWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterElectricalMeasurement init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterElectricalMeasurement initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterElectricalMeasurement initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterElectricalMeasurement new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcActivePowerOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcActivePowerOverloadWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcCurrentDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcCurrentDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcCurrentMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcCurrentMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcCurrentOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcCurrentOverloadWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcFrequencyDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcFrequencyDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcFrequencyMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcFrequencyMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcFrequencyMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcFrequencyMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcFrequencyMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcFrequencyMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcFrequencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcFrequencyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcOverloadAlarmsMaskWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcOverloadAlarmsMaskWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcPowerDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcPowerDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcPowerMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcPowerMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcReactivePowerOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcReactivePowerOverloadWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcVoltageDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcVoltageDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcVoltageMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcVoltageMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcVoltageOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcVoltageOverloadWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeActiveCurrentPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveCurrentPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActiveCurrentPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveCurrentPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMaxPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMaxPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMinPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMinPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApparentPowerPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApparentPowerPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeApparentPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApparentPowerWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsOverVoltageCounterPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsOverVoltageCounterPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsOverVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsUnderVoltageCounterPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsUnderVoltageCounterPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsUnderVoltageCounterWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsUnderVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAverageRmsVoltageMeasurementPeriodWithParams(
            @Nullable MTRReadParams params);

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
    @Selector("readAttributeCurrentOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentOverloadWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcCurrentDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcCurrentDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcCurrentMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcCurrentMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcCurrentMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcCurrentMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcCurrentMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcCurrentMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcPowerDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcPowerDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcPowerMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcPowerMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcPowerMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcPowerMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcPowerMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcPowerMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcVoltageDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcVoltageDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcVoltageMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcVoltageMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcVoltageMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcVoltageMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcVoltageMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcVoltageMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDcVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDcVoltageWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeHarmonicCurrentMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHarmonicCurrentMultiplierWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstantaneousActiveCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstantaneousActiveCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstantaneousLineCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstantaneousLineCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstantaneousPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstantaneousPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstantaneousReactiveCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstantaneousReactiveCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeInstantaneousVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInstantaneousVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLineCurrentPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLineCurrentPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured11thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured11thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured1stHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured1stHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured3rdHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured3rdHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured5thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured5thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured7thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured7thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasured9thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasured9thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase11thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase11thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase1stHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase1stHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase3rdHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase3rdHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase5thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase5thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase7thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase7thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasuredPhase9thHarmonicCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasuredPhase9thHarmonicCurrentWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeasurementTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeasurementTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNeutralCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNeutralCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOverloadAlarmsMaskWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOverloadAlarmsMaskWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhaseHarmonicCurrentMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhaseHarmonicCurrentMultiplierWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerDivisorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerDivisorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerFactorPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerFactorPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerFactorWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerFactorWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePowerMultiplierWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerMultiplierWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactiveCurrentPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactiveCurrentPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactivePowerPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactivePowerPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeReactivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeReactivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMaxPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMaxPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMinPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMinPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeOverVoltagePeriodWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeOverVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeUnderVoltagePeriodWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsExtremeUnderVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMaxPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMaxPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMaxWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMinPhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMinPhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageMinWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltagePhaseBWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltagePhaseCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSagPeriodPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSagPeriodPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSagPeriodWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSagWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseBWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSwellPeriodPhaseBWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSwellPeriodPhaseCWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSwellPeriodWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageSwellWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRmsVoltageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRmsVoltageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTotalActivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTotalActivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTotalApparentPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTotalApparentPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTotalReactivePowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTotalReactivePowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeVoltageOverloadWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeVoltageOverloadWithParams(@Nullable MTRReadParams params);

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
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:expectedValueInterval:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:expectedValueInterval:params:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:expectedValueInterval:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:expectedValueInterval:params:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:expectedValueInterval:")
    public native void writeAttributeOverloadAlarmsMaskWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:expectedValueInterval:params:")
    public native void writeAttributeOverloadAlarmsMaskWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}