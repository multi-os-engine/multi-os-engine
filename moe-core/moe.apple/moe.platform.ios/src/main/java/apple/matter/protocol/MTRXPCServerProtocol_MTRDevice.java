package apple.matter.protocol;

import apple.foundation.NSArray;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.foundation.NSURL;
import apple.foundation.NSUUID;
import apple.matter.MTRAttributeRequestPath;
import apple.matter.MTRReadParams;
import apple.matter.MTRSetupPayload;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.matter.MTRCommandWithRequiredResponse;

/**
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCServerProtocol_MTRDevice")
public interface MTRXPCServerProtocol_MTRDevice {
    /**
     * Note: The consumer of the completion block should move the file that the url points to or open it for reading
     * before the
     * completion handler returns. Otherwise, the file will be deleted, and the data will be lost.
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:nodeID:downloadLogOfType:timeout:completion:")
    default void deviceControllerNodeIDDownloadLogOfTypeTimeoutCompletion(@NotNull NSUUID controller,
            @NotNull NSNumber nodeID, @NInt long type, double timeout,
            @ObjCBlock(name = "call_deviceControllerNodeIDDownloadLogOfTypeTimeoutCompletion") @NotNull Block_deviceControllerNodeIDDownloadLogOfTypeTimeoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDDownloadLogOfTypeTimeoutCompletion {
        @Generated
        void call_deviceControllerNodeIDDownloadLogOfTypeTimeoutCompletion(@Nullable NSURL url,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:getDeviceCachePrimedWithReply:")
    void deviceControllerNodeIDGetDeviceCachePrimedWithReply(@NotNull NSUUID controller, @NotNull NSNumber nodeID,
            @ObjCBlock(name = "call_deviceControllerNodeIDGetDeviceCachePrimedWithReply") @NotNull Block_deviceControllerNodeIDGetDeviceCachePrimedWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDGetDeviceCachePrimedWithReply {
        @Generated
        void call_deviceControllerNodeIDGetDeviceCachePrimedWithReply(boolean primed);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:getEstimatedStartTimeWithReply:")
    void deviceControllerNodeIDGetEstimatedStartTimeWithReply(@NotNull NSUUID controller, @NotNull NSNumber nodeID,
            @ObjCBlock(name = "call_deviceControllerNodeIDGetEstimatedStartTimeWithReply") @NotNull Block_deviceControllerNodeIDGetEstimatedStartTimeWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDGetEstimatedStartTimeWithReply {
        @Generated
        void call_deviceControllerNodeIDGetEstimatedStartTimeWithReply(@Nullable NSDate estimatedStartTime);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:getEstimatedSubscriptionLatencyWithReply:")
    void deviceControllerNodeIDGetEstimatedSubscriptionLatencyWithReply(@NotNull NSUUID controller,
            @NotNull NSNumber nodeID,
            @ObjCBlock(name = "call_deviceControllerNodeIDGetEstimatedSubscriptionLatencyWithReply") @NotNull Block_deviceControllerNodeIDGetEstimatedSubscriptionLatencyWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDGetEstimatedSubscriptionLatencyWithReply {
        @Generated
        void call_deviceControllerNodeIDGetEstimatedSubscriptionLatencyWithReply(
                @Nullable NSNumber estimatedSubscriptionLatency);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:getStateWithReply:")
    void deviceControllerNodeIDGetStateWithReply(@NotNull NSUUID controller, @NotNull NSNumber nodeID,
            @ObjCBlock(name = "call_deviceControllerNodeIDGetStateWithReply") @NotNull Block_deviceControllerNodeIDGetStateWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDGetStateWithReply {
        @Generated
        void call_deviceControllerNodeIDGetStateWithReply(@NUInt long state);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:invokeCommandWithEndpointID:clusterID:commandID:commandFields:expectedValues:expectedValueInterval:timedInvokeTimeout:serverSideProcessingTimeout:completion:")
    void deviceControllerNodeIDInvokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutServerSideProcessingTimeoutCompletion(
            @NotNull NSUUID controller, @NotNull NSNumber nodeID, @NotNull NSNumber endpointID,
            @NotNull NSNumber clusterID, @NotNull NSNumber commandID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object commandFields,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedValues,
            @Nullable NSNumber expectedValueInterval, @Nullable NSNumber timeout,
            @Nullable NSNumber serverSideProcessingTimeout,
            @ObjCBlock(name = "call_deviceControllerNodeIDInvokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutServerSideProcessingTimeoutCompletion") @NotNull Block_deviceControllerNodeIDInvokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutServerSideProcessingTimeoutCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDInvokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutServerSideProcessingTimeoutCompletion {
        @Generated
        void call_deviceControllerNodeIDInvokeCommandWithEndpointIDClusterIDCommandIDCommandFieldsExpectedValuesExpectedValueIntervalTimedInvokeTimeoutServerSideProcessingTimeoutCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:openCommissioningWindowWithSetupPasscode:discriminator:duration:completion:")
    void deviceControllerNodeIDOpenCommissioningWindowWithSetupPasscodeDiscriminatorDurationCompletion(
            @NotNull NSUUID controller, @NotNull NSNumber nodeID, @NotNull NSNumber setupPasscode,
            @NotNull NSNumber discriminator, @NotNull NSNumber duration,
            @ObjCBlock(name = "call_deviceControllerNodeIDOpenCommissioningWindowWithSetupPasscodeDiscriminatorDurationCompletion") @NotNull Block_deviceControllerNodeIDOpenCommissioningWindowWithSetupPasscodeDiscriminatorDurationCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDOpenCommissioningWindowWithSetupPasscodeDiscriminatorDurationCompletion {
        @Generated
        void call_deviceControllerNodeIDOpenCommissioningWindowWithSetupPasscodeDiscriminatorDurationCompletion(
                @Nullable MTRSetupPayload payload, @Nullable NSError error);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:readAttributePaths:withReply:")
    void deviceControllerNodeIDReadAttributePathsWithReply(@NotNull NSUUID controller, @NotNull NSNumber nodeID,
            @NotNull NSArray<? extends MTRAttributeRequestPath> attributePaths,
            @ObjCBlock(name = "call_deviceControllerNodeIDReadAttributePathsWithReply") @NotNull Block_deviceControllerNodeIDReadAttributePathsWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDReadAttributePathsWithReply {
        @Generated
        void call_deviceControllerNodeIDReadAttributePathsWithReply(
                @NotNull NSArray<? extends NSDictionary<String, ?>> arg0);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:readAttributeWithEndpointID:clusterID:attributeID:params:withReply:")
    void deviceControllerNodeIDReadAttributeWithEndpointIDClusterIDAttributeIDParamsWithReply(
            @NotNull NSUUID controller, @NotNull NSNumber nodeID, @NotNull NSNumber endpointID,
            @NotNull NSNumber clusterID, @NotNull NSNumber attributeID, @Nullable MTRReadParams params,
            @ObjCBlock(name = "call_deviceControllerNodeIDReadAttributeWithEndpointIDClusterIDAttributeIDParamsWithReply") @NotNull Block_deviceControllerNodeIDReadAttributeWithEndpointIDClusterIDAttributeIDParamsWithReply reply);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDReadAttributeWithEndpointIDClusterIDAttributeIDParamsWithReply {
        @Generated
        void call_deviceControllerNodeIDReadAttributeWithEndpointIDClusterIDAttributeIDParamsWithReply(
                @Nullable NSDictionary<String, ?> arg0);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("deviceController:nodeID:writeAttributeWithEndpointID:clusterID:attributeID:value:expectedValueInterval:timedWriteTimeout:")
    void deviceControllerNodeIDWriteAttributeWithEndpointIDClusterIDAttributeIDValueExpectedValueIntervalTimedWriteTimeout(
            @NotNull NSUUID controller, @NotNull NSNumber nodeID, @NotNull NSNumber endpointID,
            @NotNull NSNumber clusterID, @NotNull NSNumber attributeID,
            @Mapped(ObjCObjectMapper.class) @NotNull Object value, @Nullable NSNumber expectedValueInterval,
            @Nullable NSNumber timeout);

    /**
     * API-Since: 18.2
     */
    @Generated
    @Selector("downloadLogOfType:nodeID:timeout:completion:")
    void downloadLogOfTypeNodeIDTimeoutCompletion(@NInt long type, @NotNull NSNumber nodeID, double timeout,
            @ObjCBlock(name = "call_downloadLogOfTypeNodeIDTimeoutCompletion") @NotNull Block_downloadLogOfTypeNodeIDTimeoutCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downloadLogOfTypeNodeIDTimeoutCompletion {
        @Generated
        void call_downloadLogOfTypeNodeIDTimeoutCompletion(@Nullable NSURL url, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("deviceController:nodeID:invokeCommands:completion:")
    default void deviceControllerNodeIDInvokeCommandsCompletion(@NotNull NSUUID controller, @NotNull NSNumber nodeID,
            @NotNull NSArray<? extends NSArray<? extends MTRCommandWithRequiredResponse>> commands,
            @ObjCBlock(name = "call_deviceControllerNodeIDInvokeCommandsCompletion") @NotNull Block_deviceControllerNodeIDInvokeCommandsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerNodeIDInvokeCommandsCompletion {
        @Generated
        void call_deviceControllerNodeIDInvokeCommandsCompletion(
                @Nullable NSArray<? extends NSDictionary<String, ?>> values, @Nullable NSError error);
    }
}