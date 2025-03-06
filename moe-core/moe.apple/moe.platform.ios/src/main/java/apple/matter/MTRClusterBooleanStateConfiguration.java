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
 * Cluster Boolean State Configuration
 * This cluster is used to configure a boolean sensor.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterBooleanStateConfiguration extends MTRGenericCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterBooleanStateConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterBooleanStateConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterBooleanStateConfiguration allocWithZone(VoidPtr zone);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("enableDisableAlarmWithParams:expectedValues:expectedValueInterval:completion:")
    public native void enableDisableAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRBooleanStateConfigurationClusterEnableDisableAlarmParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_enableDisableAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_enableDisableAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableDisableAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_enableDisableAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterBooleanStateConfiguration init();

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterBooleanStateConfiguration initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterBooleanStateConfiguration new_objc();

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
    @Selector("readAttributeAlarmsActiveWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAlarmsActiveWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAlarmsEnabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAlarmsEnabledWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAlarmsSupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAlarmsSupportedWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAlarmsSuppressedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAlarmsSuppressedWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeCurrentSensitivityLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentSensitivityLevelWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultSensitivityLevelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultSensitivityLevelWithParams(
            @Nullable MTRReadParams params);

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
    @Selector("readAttributeSensorFaultWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSensorFaultWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeSupportedSensitivityLevelsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSupportedSensitivityLevelsWithParams(
            @Nullable MTRReadParams params);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("suppressAlarmWithParams:expectedValues:expectedValueInterval:completion:")
    public native void suppressAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRBooleanStateConfigurationClusterSuppressAlarmParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_suppressAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_suppressAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_suppressAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_suppressAlarmWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

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
    @Selector("writeAttributeCurrentSensitivityLevelWithValue:expectedValueInterval:")
    public native void writeAttributeCurrentSensitivityLevelWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeCurrentSensitivityLevelWithValue:expectedValueInterval:params:")
    public native void writeAttributeCurrentSensitivityLevelWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}