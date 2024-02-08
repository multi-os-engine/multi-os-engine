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
 * Cluster WiFi Network Diagnostics
 * The Wi-Fi Network Diagnostics Cluster provides a means to acquire standardized diagnostics metrics that MAY be used
 * by a Node to assist a user or Administrative Node in diagnosing potential problems.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterWiFiNetworkDiagnostics extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterWiFiNetworkDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterWiFiNetworkDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterWiFiNetworkDiagnostics allocWithZone(VoidPtr zone);

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
    public native MTRClusterWiFiNetworkDiagnostics init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterWiFiNetworkDiagnostics initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterWiFiNetworkDiagnostics initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterWiFiNetworkDiagnostics new_objc();

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBSSIDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBSSIDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeBeaconLostCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBeaconLostCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeBeaconRxCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBeaconRxCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBSSIDWithParams on MTRClusterWiFiNetworkDiagnostics
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBssidWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributeBssidWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeChannelNumberWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeChannelNumberWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeCurrentMaxRateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCurrentMaxRateWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeOverrunCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOverrunCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePacketMulticastRxCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePacketMulticastRxCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePacketMulticastTxCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePacketMulticastTxCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePacketUnicastRxCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePacketUnicastRxCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePacketUnicastTxCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePacketUnicastTxCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRSSIWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRSSIWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRSSIWithParams on MTRClusterWiFiNetworkDiagnostics
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRssiWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributeRssiWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSecurityTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSecurityTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWiFiVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWiFiVersionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("resetCountsWithExpectedValues:expectedValueInterval:completion:")
    public native void resetCountsWithExpectedValuesExpectedValueIntervalCompletion(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resetCountsWithExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resetCountsWithExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resetCountsWithExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resetCountsWithExpectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("resetCountsWithExpectedValues:expectedValueInterval:completionHandler:")
    public native void resetCountsWithExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resetCountsWithExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_resetCountsWithExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_resetCountsWithExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("resetCountsWithParams:expectedValues:expectedValueInterval:completion:")
    public native void resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRWiFiNetworkDiagnosticsClusterResetCountsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resetCountsWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("resetCountsWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRWiFiNetworkDiagnosticsClusterResetCountsParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_resetCountsWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

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