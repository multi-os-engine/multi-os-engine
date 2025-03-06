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
 * Cluster Smoke CO Alarm
 * This cluster provides an interface for observing and managing the state of smoke and CO alarms.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterSmokeCOAlarm extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterSmokeCOAlarm(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterSmokeCOAlarm alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterSmokeCOAlarm allocWithZone(VoidPtr zone);

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
    public native MTRClusterSmokeCOAlarm init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterSmokeCOAlarm initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterSmokeCOAlarm new_objc();

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
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeBatteryAlertWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBatteryAlertWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCOStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCOStateWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeContaminationStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeContaminationStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDeviceMutedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDeviceMutedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeEndOfServiceAlertWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEndOfServiceAlertWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeExpiryDateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeExpiryDateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeExpressedStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeExpressedStateWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeHardwareFaultAlertWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeHardwareFaultAlertWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeInterconnectCOAlarmWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInterconnectCOAlarmWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeInterconnectSmokeAlarmWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeInterconnectSmokeAlarmWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeSmokeSensitivityLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSmokeSensitivityLevelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeSmokeStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSmokeStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTestInProgressWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTestInProgressWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("selfTestRequestWithExpectedValues:expectedValueInterval:completion:")
    public native void selfTestRequestWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_selfTestRequestWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_selfTestRequestWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selfTestRequestWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_selfTestRequestWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("selfTestRequestWithParams:expectedValues:expectedValueInterval:completion:")
    public native void selfTestRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRSmokeCOAlarmClusterSelfTestRequestParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_selfTestRequestWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_selfTestRequestWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_selfTestRequestWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_selfTestRequestWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeSmokeSensitivityLevelWithValue:expectedValueInterval:")
    public native void writeAttributeSmokeSensitivityLevelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeSmokeSensitivityLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeSmokeSensitivityLevelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}