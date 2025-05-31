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
 * Cluster Device Energy Management
 * This cluster allows a client to manage the power draw of a device. An example of such a client could be an Energy
 * Management System (EMS) which controls an Energy Smart Appliance (ESA).
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterDeviceEnergyManagement extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterDeviceEnergyManagement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterDeviceEnergyManagement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterDeviceEnergyManagement allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelPowerAdjustRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void cancelPowerAdjustRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_cancelPowerAdjustRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_cancelPowerAdjustRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelPowerAdjustRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_cancelPowerAdjustRequestWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelPowerAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void cancelPowerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRDeviceEnergyManagementClusterCancelPowerAdjustRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_cancelPowerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_cancelPowerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelPowerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_cancelPowerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void cancelRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_cancelRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_cancelRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_cancelRequestWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void cancelRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRDeviceEnergyManagementClusterCancelRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_cancelRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_cancelRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_cancelRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

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
    public native MTRClusterDeviceEnergyManagement init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterDeviceEnergyManagement initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("modifyForecastRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void modifyForecastRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDeviceEnergyManagementClusterModifyForecastRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_modifyForecastRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_modifyForecastRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyForecastRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_modifyForecastRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterDeviceEnergyManagement new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("pauseRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void pauseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDeviceEnergyManagementClusterPauseRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_pauseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_pauseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_pauseRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("powerAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void powerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDeviceEnergyManagementClusterPowerAdjustRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_powerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_powerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_powerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_powerAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMaxPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMaxPowerWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMinPowerWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAbsMinPowerWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeESACanGenerateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeESACanGenerateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESAStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeESAStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESATypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeESATypeWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeForecastWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeForecastWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeOptOutStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOptOutStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePowerAdjustmentCapabilityWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePowerAdjustmentCapabilityWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("requestConstraintBasedForecastWithParams:expectedValues:expectedValueInterval:completion:")
    public native void requestConstraintBasedForecastWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDeviceEnergyManagementClusterRequestConstraintBasedForecastParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_requestConstraintBasedForecastWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_requestConstraintBasedForecastWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestConstraintBasedForecastWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_requestConstraintBasedForecastWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable NSError error);
    }

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
    @Selector("resumeRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void resumeRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeRequestWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("resumeRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resumeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRDeviceEnergyManagementClusterResumeRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resumeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resumeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resumeRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("startTimeAdjustRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void startTimeAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDeviceEnergyManagementClusterStartTimeAdjustRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_startTimeAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_startTimeAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startTimeAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_startTimeAdjustRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
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
}