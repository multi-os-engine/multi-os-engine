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
 * Cluster Energy EVSE
 * Electric Vehicle Supply Equipment (EVSE) is equipment used to charge an Electric Vehicle (EV) or Plug-In Hybrid
 * Electric Vehicle. This cluster provides an interface to the functionality of Electric Vehicle Supply Equipment (EVSE)
 * management.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterEnergyEVSE extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterEnergyEVSE(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterEnergyEVSE alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterEnergyEVSE allocWithZone(VoidPtr zone);

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("clearTargetsWithExpectedValues:expectedValueInterval:completion:")
    public native void clearTargetsWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearTargetsWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearTargetsWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearTargetsWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearTargetsWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("clearTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTREnergyEVSEClusterClearTargetsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("disableWithExpectedValues:expectedValueInterval:completion:")
    public native void disableWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_disableWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_disableWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("disableWithParams:expectedValues:expectedValueInterval:completion:")
    public native void disableWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTREnergyEVSEClusterDisableParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_disableWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_disableWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_disableWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("enableChargingWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enableChargingWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTREnergyEVSEClusterEnableChargingParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableChargingWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enableChargingWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableChargingWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enableChargingWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getTargetsWithExpectedValues:expectedValueInterval:completion:")
    public native void getTargetsWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getTargetsWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getTargetsWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTargetsWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getTargetsWithExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTREnergyEVSEClusterGetTargetsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTREnergyEVSEClusterGetTargetsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTREnergyEVSEClusterGetTargetsResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterEnergyEVSE init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterEnergyEVSE initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterEnergyEVSE new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeApproximateEVEfficiencyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeApproximateEVEfficiencyWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeChargingEnabledUntilWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeChargingEnabledUntilWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeCircuitCapacityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCircuitCapacityWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeFaultStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFaultStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMaximumChargeCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaximumChargeCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMinimumChargeCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinimumChargeCurrentWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeRequiredEnergyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNextChargeRequiredEnergyWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeStartTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNextChargeStartTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetSoCWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNextChargeTargetSoCWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNextChargeTargetTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeRandomizationDelayWindowWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRandomizationDelayWindowWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionDurationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSessionDurationWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionEnergyChargedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSessionEnergyChargedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSessionIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSupplyStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSupplyStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeUserMaximumChargeCurrentWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUserMaximumChargeCurrentWithParams(
            @Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTargetsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTREnergyEVSEClusterSetTargetsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setTargetsWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("startDiagnosticsWithExpectedValues:expectedValueInterval:completion:")
    public native void startDiagnosticsWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startDiagnosticsWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startDiagnosticsWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDiagnosticsWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startDiagnosticsWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("startDiagnosticsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startDiagnosticsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTREnergyEVSEClusterStartDiagnosticsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startDiagnosticsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startDiagnosticsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDiagnosticsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startDiagnosticsWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeApproximateEVEfficiencyWithValue:expectedValueInterval:")
    public native void writeAttributeApproximateEVEfficiencyWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeApproximateEVEfficiencyWithValue:expectedValueInterval:params:")
    public native void writeAttributeApproximateEVEfficiencyWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeRandomizationDelayWindowWithValue:expectedValueInterval:")
    public native void writeAttributeRandomizationDelayWindowWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeRandomizationDelayWindowWithValue:expectedValueInterval:params:")
    public native void writeAttributeRandomizationDelayWindowWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeUserMaximumChargeCurrentWithValue:expectedValueInterval:")
    public native void writeAttributeUserMaximumChargeCurrentWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeUserMaximumChargeCurrentWithValue:expectedValueInterval:params:")
    public native void writeAttributeUserMaximumChargeCurrentWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}