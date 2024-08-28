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
 * Cluster Thread Network Diagnostics
 * The Thread Network Diagnostics Cluster provides a means to acquire standardized diagnostics metrics that MAY be used
 * by a Node to assist a user or Administrative Node in diagnosing potential problems
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterThreadNetworkDiagnostics extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterThreadNetworkDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterThreadNetworkDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterThreadNetworkDiagnostics allocWithZone(VoidPtr zone);

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
    public native MTRClusterThreadNetworkDiagnostics init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterThreadNetworkDiagnostics initWithDeviceEndpointQueue(@NotNull MTRDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterThreadNetworkDiagnostics initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
    public static native MTRClusterThreadNetworkDiagnostics new_objc();

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
    @Selector("readAttributeActiveNetworkFaultsListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveNetworkFaultsListWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActiveTimestampWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActiveTimestampWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttachAttemptCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttachAttemptCountWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeBetterPartitionAttachAttemptCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeChannelPage0MaskWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeChannelPage0MaskWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeChannelWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeChannelWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeChildRoleCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeChildRoleCountWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeDataVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDataVersionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDelayWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDetachedRoleCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDetachedRoleCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeExtendedPanIdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeExtendedPanIdWithParams(@Nullable MTRReadParams params);

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
    @Selector("readAttributeLeaderRoleCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLeaderRoleCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLeaderRouterIdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLeaderRouterIdWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMeshLocalPrefixWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMeshLocalPrefixWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNeighborTableWithParams on MTRClusterThreadNetworkDiagnostics
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNeighborTableListWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributeNeighborTableListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNeighborTableWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNeighborTableWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNetworkNameWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNetworkNameWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOperationalDatasetComponentsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperationalDatasetComponentsWithParams(
            @Nullable MTRReadParams params);

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
    @Selector("readAttributePanIdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePanIdWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeParentChangeCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeParentChangeCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePartitionIdChangeCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePartitionIdChangeCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePartitionIdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePartitionIdWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePendingTimestampWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePendingTimestampWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRouteTableWithParams on MTRClusterThreadNetworkDiagnostics
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRouteTableListWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributeRouteTableListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRouteTableWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRouteTableWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRouterRoleCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRouterRoleCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRoutingRoleWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRoutingRoleWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxAddressFilteredCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxAddressFilteredCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxBeaconCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxBeaconCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxBeaconRequestCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxBeaconRequestCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxBroadcastCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxBroadcastCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxDataCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxDataCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxDataPollCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxDataPollCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxDestAddrFilteredCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxDestAddrFilteredCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxDuplicatedCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxDuplicatedCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrFcsCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrFcsCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrInvalidSrcAddrCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrNoFrameCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrNoFrameCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrOtherCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrOtherCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrSecCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrSecCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxErrUnknownNeighborCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxErrUnknownNeighborCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxOtherCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxOtherCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxTotalCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxTotalCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRxUnicastCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRxUnicastCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSecurityPolicyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSecurityPolicyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeStableDataVersionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeStableDataVersionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxAckRequestedCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxAckRequestedCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxAckedCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxAckedCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxBeaconCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxBeaconCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxBeaconRequestCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxBeaconRequestCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxBroadcastCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxBroadcastCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxDataCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxDataCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxDataPollCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxDataPollCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxDirectMaxRetryExpiryCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxErrAbortCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxErrAbortCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxErrBusyChannelCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxErrBusyChannelCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxErrCcaCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxErrCcaCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxIndirectMaxRetryExpiryCountWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxNoAckRequestedCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxNoAckRequestedCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxOtherCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxOtherCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxRetryCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxRetryCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxTotalCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxTotalCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeTxUnicastCountWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeTxUnicastCountWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWeightingWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWeightingWithParams(@Nullable MTRReadParams params);

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
            @Nullable MTRThreadNetworkDiagnosticsClusterResetCountsParams params,
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
            @Nullable MTRThreadNetworkDiagnosticsClusterResetCountsParams params,
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