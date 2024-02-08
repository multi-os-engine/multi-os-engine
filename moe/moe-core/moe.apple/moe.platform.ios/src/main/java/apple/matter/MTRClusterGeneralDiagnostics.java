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
 * Cluster General Diagnostics
 * The General Diagnostics Cluster, along with other diagnostics clusters, provide a means to acquire standardized
 * diagnostics metrics that MAY be used by a Node to assist a user or Administrative Node in diagnosing potential
 * problems.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterGeneralDiagnostics extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterGeneralDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterGeneralDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterGeneralDiagnostics allocWithZone(VoidPtr zone);

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
    public native MTRClusterGeneralDiagnostics init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterGeneralDiagnostics initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterGeneralDiagnostics initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterGeneralDiagnostics new_objc();

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
    @Selector("readAttributeActiveHardwareFaultsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveHardwareFaultsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActiveNetworkFaultsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveNetworkFaultsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActiveRadioFaultsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveRadioFaultsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBootReasonWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBootReasonWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBootReasonWithParams on MTRClusterGeneralDiagnostics
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBootReasonsWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributeBootReasonsWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeNetworkInterfacesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNetworkInterfacesWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRebootCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRebootCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTestEventTriggersEnabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTestEventTriggersEnabledWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTotalOperationalHoursWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTotalOperationalHoursWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUpTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUpTimeWithParams(@Nullable MTRReadParams params);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("testEventTriggerWithParams:expectedValues:expectedValueInterval:completion:")
    public native void testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRGeneralDiagnosticsClusterTestEventTriggerParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testEventTriggerWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEventTriggerWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRGeneralDiagnosticsClusterTestEventTriggerParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_testEventTriggerWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}