package apple.chip;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 */
@Generated
@Library("CHIP")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CHIPThreadNetworkDiagnostics extends CHIPCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected CHIPThreadNetworkDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CHIPThreadNetworkDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CHIPThreadNetworkDiagnostics allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
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
    public native CHIPThreadNetworkDiagnostics init();

    @Generated
    @Selector("initWithDevice:endpoint:queue:")
    public native CHIPThreadNetworkDiagnostics initWithDeviceEndpointQueue(CHIPDevice device, char endpoint,
            NSObject queue);

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CHIPThreadNetworkDiagnostics new_objc();

    @Generated
    @Selector("readAttributeActiveNetworkFaultsListWithResponseHandler:")
    public native void readAttributeActiveNetworkFaultsListWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeActiveNetworkFaultsListWithResponseHandler") Block_readAttributeActiveNetworkFaultsListWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveNetworkFaultsListWithResponseHandler {
        @Generated
        void call_readAttributeActiveNetworkFaultsListWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeAttachAttemptCountWithResponseHandler:")
    public native void readAttributeAttachAttemptCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeAttachAttemptCountWithResponseHandler") Block_readAttributeAttachAttemptCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttachAttemptCountWithResponseHandler {
        @Generated
        void call_readAttributeAttachAttemptCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithResponseHandler:")
    public native void readAttributeBetterPartitionAttachAttemptCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeBetterPartitionAttachAttemptCountWithResponseHandler") Block_readAttributeBetterPartitionAttachAttemptCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBetterPartitionAttachAttemptCountWithResponseHandler {
        @Generated
        void call_readAttributeBetterPartitionAttachAttemptCountWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeChannelMaskWithResponseHandler:")
    public native void readAttributeChannelMaskWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeChannelMaskWithResponseHandler") Block_readAttributeChannelMaskWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelMaskWithResponseHandler {
        @Generated
        void call_readAttributeChannelMaskWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeChannelWithResponseHandler:")
    public native void readAttributeChannelWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeChannelWithResponseHandler") Block_readAttributeChannelWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelWithResponseHandler {
        @Generated
        void call_readAttributeChannelWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeChildRoleCountWithResponseHandler:")
    public native void readAttributeChildRoleCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeChildRoleCountWithResponseHandler") Block_readAttributeChildRoleCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChildRoleCountWithResponseHandler {
        @Generated
        void call_readAttributeChildRoleCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeClusterRevisionWithResponseHandler:")
    public native void readAttributeClusterRevisionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithResponseHandler") Block_readAttributeClusterRevisionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithResponseHandler {
        @Generated
        void call_readAttributeClusterRevisionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeDataVersionWithResponseHandler:")
    public native void readAttributeDataVersionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeDataVersionWithResponseHandler") Block_readAttributeDataVersionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDataVersionWithResponseHandler {
        @Generated
        void call_readAttributeDataVersionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeDetachedRoleCountWithResponseHandler:")
    public native void readAttributeDetachedRoleCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeDetachedRoleCountWithResponseHandler") Block_readAttributeDetachedRoleCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDetachedRoleCountWithResponseHandler {
        @Generated
        void call_readAttributeDetachedRoleCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeExtendedPanIdWithResponseHandler:")
    public native void readAttributeExtendedPanIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeExtendedPanIdWithResponseHandler") Block_readAttributeExtendedPanIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExtendedPanIdWithResponseHandler {
        @Generated
        void call_readAttributeExtendedPanIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLeaderRoleCountWithResponseHandler:")
    public native void readAttributeLeaderRoleCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLeaderRoleCountWithResponseHandler") Block_readAttributeLeaderRoleCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRoleCountWithResponseHandler {
        @Generated
        void call_readAttributeLeaderRoleCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeLeaderRouterIdWithResponseHandler:")
    public native void readAttributeLeaderRouterIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeLeaderRouterIdWithResponseHandler") Block_readAttributeLeaderRouterIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRouterIdWithResponseHandler {
        @Generated
        void call_readAttributeLeaderRouterIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeMeshLocalPrefixWithResponseHandler:")
    public native void readAttributeMeshLocalPrefixWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeMeshLocalPrefixWithResponseHandler") Block_readAttributeMeshLocalPrefixWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeshLocalPrefixWithResponseHandler {
        @Generated
        void call_readAttributeMeshLocalPrefixWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNeighborTableListWithResponseHandler:")
    public native void readAttributeNeighborTableListWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNeighborTableListWithResponseHandler") Block_readAttributeNeighborTableListWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeighborTableListWithResponseHandler {
        @Generated
        void call_readAttributeNeighborTableListWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeNetworkNameWithResponseHandler:")
    public native void readAttributeNetworkNameWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeNetworkNameWithResponseHandler") Block_readAttributeNetworkNameWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNetworkNameWithResponseHandler {
        @Generated
        void call_readAttributeNetworkNameWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOperationalDatasetComponentsWithResponseHandler:")
    public native void readAttributeOperationalDatasetComponentsWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOperationalDatasetComponentsWithResponseHandler") Block_readAttributeOperationalDatasetComponentsWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalDatasetComponentsWithResponseHandler {
        @Generated
        void call_readAttributeOperationalDatasetComponentsWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeOverrunCountWithResponseHandler:")
    public native void readAttributeOverrunCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeOverrunCountWithResponseHandler") Block_readAttributeOverrunCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverrunCountWithResponseHandler {
        @Generated
        void call_readAttributeOverrunCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePanIdWithResponseHandler:")
    public native void readAttributePanIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePanIdWithResponseHandler") Block_readAttributePanIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePanIdWithResponseHandler {
        @Generated
        void call_readAttributePanIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeParentChangeCountWithResponseHandler:")
    public native void readAttributeParentChangeCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeParentChangeCountWithResponseHandler") Block_readAttributeParentChangeCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeParentChangeCountWithResponseHandler {
        @Generated
        void call_readAttributeParentChangeCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePartitionIdChangeCountWithResponseHandler:")
    public native void readAttributePartitionIdChangeCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePartitionIdChangeCountWithResponseHandler") Block_readAttributePartitionIdChangeCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdChangeCountWithResponseHandler {
        @Generated
        void call_readAttributePartitionIdChangeCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributePartitionIdWithResponseHandler:")
    public native void readAttributePartitionIdWithResponseHandler(
            @ObjCBlock(name = "call_readAttributePartitionIdWithResponseHandler") Block_readAttributePartitionIdWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdWithResponseHandler {
        @Generated
        void call_readAttributePartitionIdWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRouteTableListWithResponseHandler:")
    public native void readAttributeRouteTableListWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRouteTableListWithResponseHandler") Block_readAttributeRouteTableListWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouteTableListWithResponseHandler {
        @Generated
        void call_readAttributeRouteTableListWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRouterRoleCountWithResponseHandler:")
    public native void readAttributeRouterRoleCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRouterRoleCountWithResponseHandler") Block_readAttributeRouterRoleCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouterRoleCountWithResponseHandler {
        @Generated
        void call_readAttributeRouterRoleCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRoutingRoleWithResponseHandler:")
    public native void readAttributeRoutingRoleWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRoutingRoleWithResponseHandler") Block_readAttributeRoutingRoleWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRoutingRoleWithResponseHandler {
        @Generated
        void call_readAttributeRoutingRoleWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxAddressFilteredCountWithResponseHandler:")
    public native void readAttributeRxAddressFilteredCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxAddressFilteredCountWithResponseHandler") Block_readAttributeRxAddressFilteredCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxAddressFilteredCountWithResponseHandler {
        @Generated
        void call_readAttributeRxAddressFilteredCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxBeaconCountWithResponseHandler:")
    public native void readAttributeRxBeaconCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxBeaconCountWithResponseHandler") Block_readAttributeRxBeaconCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconCountWithResponseHandler {
        @Generated
        void call_readAttributeRxBeaconCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxBeaconRequestCountWithResponseHandler:")
    public native void readAttributeRxBeaconRequestCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxBeaconRequestCountWithResponseHandler") Block_readAttributeRxBeaconRequestCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconRequestCountWithResponseHandler {
        @Generated
        void call_readAttributeRxBeaconRequestCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxBroadcastCountWithResponseHandler:")
    public native void readAttributeRxBroadcastCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxBroadcastCountWithResponseHandler") Block_readAttributeRxBroadcastCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBroadcastCountWithResponseHandler {
        @Generated
        void call_readAttributeRxBroadcastCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxDataCountWithResponseHandler:")
    public native void readAttributeRxDataCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxDataCountWithResponseHandler") Block_readAttributeRxDataCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataCountWithResponseHandler {
        @Generated
        void call_readAttributeRxDataCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxDataPollCountWithResponseHandler:")
    public native void readAttributeRxDataPollCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxDataPollCountWithResponseHandler") Block_readAttributeRxDataPollCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataPollCountWithResponseHandler {
        @Generated
        void call_readAttributeRxDataPollCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxDestAddrFilteredCountWithResponseHandler:")
    public native void readAttributeRxDestAddrFilteredCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxDestAddrFilteredCountWithResponseHandler") Block_readAttributeRxDestAddrFilteredCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDestAddrFilteredCountWithResponseHandler {
        @Generated
        void call_readAttributeRxDestAddrFilteredCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxDuplicatedCountWithResponseHandler:")
    public native void readAttributeRxDuplicatedCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxDuplicatedCountWithResponseHandler") Block_readAttributeRxDuplicatedCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDuplicatedCountWithResponseHandler {
        @Generated
        void call_readAttributeRxDuplicatedCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrFcsCountWithResponseHandler:")
    public native void readAttributeRxErrFcsCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrFcsCountWithResponseHandler") Block_readAttributeRxErrFcsCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrFcsCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrFcsCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithResponseHandler:")
    public native void readAttributeRxErrInvalidSrcAddrCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrInvalidSrcAddrCountWithResponseHandler") Block_readAttributeRxErrInvalidSrcAddrCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrInvalidSrcAddrCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrInvalidSrcAddrCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrNoFrameCountWithResponseHandler:")
    public native void readAttributeRxErrNoFrameCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrNoFrameCountWithResponseHandler") Block_readAttributeRxErrNoFrameCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrNoFrameCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrNoFrameCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrOtherCountWithResponseHandler:")
    public native void readAttributeRxErrOtherCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrOtherCountWithResponseHandler") Block_readAttributeRxErrOtherCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrOtherCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrOtherCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrSecCountWithResponseHandler:")
    public native void readAttributeRxErrSecCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrSecCountWithResponseHandler") Block_readAttributeRxErrSecCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrSecCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrSecCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxErrUnknownNeighborCountWithResponseHandler:")
    public native void readAttributeRxErrUnknownNeighborCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxErrUnknownNeighborCountWithResponseHandler") Block_readAttributeRxErrUnknownNeighborCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrUnknownNeighborCountWithResponseHandler {
        @Generated
        void call_readAttributeRxErrUnknownNeighborCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxOtherCountWithResponseHandler:")
    public native void readAttributeRxOtherCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxOtherCountWithResponseHandler") Block_readAttributeRxOtherCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxOtherCountWithResponseHandler {
        @Generated
        void call_readAttributeRxOtherCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxTotalCountWithResponseHandler:")
    public native void readAttributeRxTotalCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxTotalCountWithResponseHandler") Block_readAttributeRxTotalCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxTotalCountWithResponseHandler {
        @Generated
        void call_readAttributeRxTotalCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeRxUnicastCountWithResponseHandler:")
    public native void readAttributeRxUnicastCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeRxUnicastCountWithResponseHandler") Block_readAttributeRxUnicastCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxUnicastCountWithResponseHandler {
        @Generated
        void call_readAttributeRxUnicastCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeSecurityPolicyWithResponseHandler:")
    public native void readAttributeSecurityPolicyWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeSecurityPolicyWithResponseHandler") Block_readAttributeSecurityPolicyWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSecurityPolicyWithResponseHandler {
        @Generated
        void call_readAttributeSecurityPolicyWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeStableDataVersionWithResponseHandler:")
    public native void readAttributeStableDataVersionWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeStableDataVersionWithResponseHandler") Block_readAttributeStableDataVersionWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStableDataVersionWithResponseHandler {
        @Generated
        void call_readAttributeStableDataVersionWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxAckRequestedCountWithResponseHandler:")
    public native void readAttributeTxAckRequestedCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxAckRequestedCountWithResponseHandler") Block_readAttributeTxAckRequestedCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckRequestedCountWithResponseHandler {
        @Generated
        void call_readAttributeTxAckRequestedCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxAckedCountWithResponseHandler:")
    public native void readAttributeTxAckedCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxAckedCountWithResponseHandler") Block_readAttributeTxAckedCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckedCountWithResponseHandler {
        @Generated
        void call_readAttributeTxAckedCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxBeaconCountWithResponseHandler:")
    public native void readAttributeTxBeaconCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxBeaconCountWithResponseHandler") Block_readAttributeTxBeaconCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconCountWithResponseHandler {
        @Generated
        void call_readAttributeTxBeaconCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxBeaconRequestCountWithResponseHandler:")
    public native void readAttributeTxBeaconRequestCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxBeaconRequestCountWithResponseHandler") Block_readAttributeTxBeaconRequestCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconRequestCountWithResponseHandler {
        @Generated
        void call_readAttributeTxBeaconRequestCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxBroadcastCountWithResponseHandler:")
    public native void readAttributeTxBroadcastCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxBroadcastCountWithResponseHandler") Block_readAttributeTxBroadcastCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBroadcastCountWithResponseHandler {
        @Generated
        void call_readAttributeTxBroadcastCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxDataCountWithResponseHandler:")
    public native void readAttributeTxDataCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxDataCountWithResponseHandler") Block_readAttributeTxDataCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataCountWithResponseHandler {
        @Generated
        void call_readAttributeTxDataCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxDataPollCountWithResponseHandler:")
    public native void readAttributeTxDataPollCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxDataPollCountWithResponseHandler") Block_readAttributeTxDataPollCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataPollCountWithResponseHandler {
        @Generated
        void call_readAttributeTxDataPollCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler:")
    public native void readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler") Block_readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler {
        @Generated
        void call_readAttributeTxDirectMaxRetryExpiryCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxErrAbortCountWithResponseHandler:")
    public native void readAttributeTxErrAbortCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxErrAbortCountWithResponseHandler") Block_readAttributeTxErrAbortCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrAbortCountWithResponseHandler {
        @Generated
        void call_readAttributeTxErrAbortCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxErrBusyChannelCountWithResponseHandler:")
    public native void readAttributeTxErrBusyChannelCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxErrBusyChannelCountWithResponseHandler") Block_readAttributeTxErrBusyChannelCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrBusyChannelCountWithResponseHandler {
        @Generated
        void call_readAttributeTxErrBusyChannelCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxErrCcaCountWithResponseHandler:")
    public native void readAttributeTxErrCcaCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxErrCcaCountWithResponseHandler") Block_readAttributeTxErrCcaCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCcaCountWithResponseHandler {
        @Generated
        void call_readAttributeTxErrCcaCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler:")
    public native void readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler") Block_readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler {
        @Generated
        void call_readAttributeTxIndirectMaxRetryExpiryCountWithResponseHandler(NSError error,
                NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxNoAckRequestedCountWithResponseHandler:")
    public native void readAttributeTxNoAckRequestedCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxNoAckRequestedCountWithResponseHandler") Block_readAttributeTxNoAckRequestedCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxNoAckRequestedCountWithResponseHandler {
        @Generated
        void call_readAttributeTxNoAckRequestedCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxOtherCountWithResponseHandler:")
    public native void readAttributeTxOtherCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxOtherCountWithResponseHandler") Block_readAttributeTxOtherCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxOtherCountWithResponseHandler {
        @Generated
        void call_readAttributeTxOtherCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxRetryCountWithResponseHandler:")
    public native void readAttributeTxRetryCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxRetryCountWithResponseHandler") Block_readAttributeTxRetryCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxRetryCountWithResponseHandler {
        @Generated
        void call_readAttributeTxRetryCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxTotalCountWithResponseHandler:")
    public native void readAttributeTxTotalCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxTotalCountWithResponseHandler") Block_readAttributeTxTotalCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxTotalCountWithResponseHandler {
        @Generated
        void call_readAttributeTxTotalCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeTxUnicastCountWithResponseHandler:")
    public native void readAttributeTxUnicastCountWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeTxUnicastCountWithResponseHandler") Block_readAttributeTxUnicastCountWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxUnicastCountWithResponseHandler {
        @Generated
        void call_readAttributeTxUnicastCountWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("readAttributeWeightingWithResponseHandler:")
    public native void readAttributeWeightingWithResponseHandler(
            @ObjCBlock(name = "call_readAttributeWeightingWithResponseHandler") Block_readAttributeWeightingWithResponseHandler responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWeightingWithResponseHandler {
        @Generated
        void call_readAttributeWeightingWithResponseHandler(NSError error, NSDictionary<?, ?> values);
    }

    @Generated
    @Selector("resetCounts:")
    public native void resetCounts(@ObjCBlock(name = "call_resetCounts") Block_resetCounts responseHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCounts {
        @Generated
        void call_resetCounts(NSError error, NSDictionary<?, ?> values);
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
    @Selector("version")
    @NInt
    public static native long version_static();
}
