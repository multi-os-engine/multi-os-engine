package apple.matter.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSNumber;
import apple.matter.MTRDeviceController;
import apple.matter.MTROTASoftwareUpdateProviderClusterApplyUpdateRequestParams;
import apple.matter.MTROTASoftwareUpdateProviderClusterApplyUpdateResponseParams;
import apple.matter.MTROTASoftwareUpdateProviderClusterNotifyUpdateAppliedParams;
import apple.matter.MTROTASoftwareUpdateProviderClusterQueryImageParams;
import apple.matter.MTROTASoftwareUpdateProviderClusterQueryImageResponseParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The protocol definition for the MTROTAProviderDelegate
 * 
 * All delegate methods will be called on the supplied Delegate Queue.
 * 
 * While the selectors on this protocol are marked @optional, in practice an
 * implementation must provide an implementation for one of each pair of
 * selectors (e.g. one of the two handleQueryImageForNodeID selectors must be
 * implemented). The selector ending in "completion:" will be used if present;
 * otherwise the one ending in "completionHandler:" will be used.
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTROTAProviderDelegate")
public interface MTROTAProviderDelegate {
    /**
     * Notify the delegate when the apply update request command is received from
     * some node. The controller identifies the fabric the node is on, and the
     * nodeID identifies the node within that fabric.
     * 
     * If completion is passed a non-nil error, that will be converted into
     * an error response to the client. Otherwise it must have a non-nil data,
     * which will be returned to the client.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("handleApplyUpdateRequestForNodeID:controller:params:completion:")
    default void handleApplyUpdateRequestForNodeIDControllerParamsCompletion(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller,
            @NotNull MTROTASoftwareUpdateProviderClusterApplyUpdateRequestParams params,
            @ObjCBlock(name = "call_handleApplyUpdateRequestForNodeIDControllerParamsCompletion") @NotNull Block_handleApplyUpdateRequestForNodeIDControllerParamsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleApplyUpdateRequestForNodeIDControllerParamsCompletion {
        @Generated
        void call_handleApplyUpdateRequestForNodeIDControllerParamsCompletion(
                @Nullable MTROTASoftwareUpdateProviderClusterApplyUpdateResponseParams data, @Nullable NSError error);
    }

    /**
     * Notify the delegate when a BDX Query message has been received for some node.
     * The controller identifies the fabric the node is on, and the nodeID
     * identifies the node within that fabric.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("handleBDXQueryForNodeID:controller:blockSize:blockIndex:bytesToSkip:completion:")
    default void handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletion(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller, @NotNull NSNumber blockSize, @NotNull NSNumber blockIndex,
            @NotNull NSNumber bytesToSkip,
            @ObjCBlock(name = "call_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletion") @NotNull Block_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletion {
        @Generated
        void call_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletion(@Nullable NSData data,
                boolean isEOF);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("handleBDXQueryForNodeID:controller:blockSize:blockIndex:bytesToSkip:completionHandler:")
    default void handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletionHandler(
            @NotNull NSNumber nodeID, @NotNull MTRDeviceController controller, @NotNull NSNumber blockSize,
            @NotNull NSNumber blockIndex, @NotNull NSNumber bytesToSkip,
            @ObjCBlock(name = "call_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletionHandler") @NotNull Block_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletionHandler {
        @Generated
        void call_handleBDXQueryForNodeIDControllerBlockSizeBlockIndexBytesToSkipCompletionHandler(
                @Nullable NSData data, boolean isEOF);
    }

    /**
     * Notify the delegate when a BDX Session starts for some node. The controller
     * identifies the fabric the node is on, and the nodeID identifies the node
     * within that fabric.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("handleBDXTransferSessionBeginForNodeID:controller:fileDesignator:offset:completion:")
    default void handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletion(
            @NotNull NSNumber nodeID, @NotNull MTRDeviceController controller, @NotNull String fileDesignator,
            @NotNull NSNumber offset,
            @ObjCBlock(name = "call_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletion") @NotNull Block_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletion {
        @Generated
        void call_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("handleBDXTransferSessionBeginForNodeID:controller:fileDesignator:offset:completionHandler:")
    default void handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletionHandler(
            @NotNull NSNumber nodeID, @NotNull MTRDeviceController controller, @NotNull String fileDesignator,
            @NotNull NSNumber offset,
            @ObjCBlock(name = "call_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletionHandler") @NotNull Block_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletionHandler {
        @Generated
        void call_handleBDXTransferSessionBeginForNodeIDControllerFileDesignatorOffsetCompletionHandler(
                @Nullable NSError arg0);
    }

    /**
     * Notify the delegate when a BDX Session ends for some node. The controller
     * identifies the fabric the node is on, and the nodeID identifies the node
     * within that fabric.
     */
    @Generated
    @IsOptional
    @Selector("handleBDXTransferSessionEndForNodeID:controller:error:")
    default void handleBDXTransferSessionEndForNodeIDControllerError(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notify the delegate when the notify update applied command is received from
     * some node. The controller identifies the fabric the node is on, and the
     * nodeID identifies the node within that fabric.
     * 
     * If completion is passed a non-nil error, that will be converted into
     * an error response to the client. Otherwise a success response will be sent.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("handleNotifyUpdateAppliedForNodeID:controller:params:completion:")
    default void handleNotifyUpdateAppliedForNodeIDControllerParamsCompletion(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller,
            @NotNull MTROTASoftwareUpdateProviderClusterNotifyUpdateAppliedParams params,
            @ObjCBlock(name = "call_handleNotifyUpdateAppliedForNodeIDControllerParamsCompletion") @NotNull Block_handleNotifyUpdateAppliedForNodeIDControllerParamsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleNotifyUpdateAppliedForNodeIDControllerParamsCompletion {
        @Generated
        void call_handleNotifyUpdateAppliedForNodeIDControllerParamsCompletion(@Nullable NSError error);
    }

    /**
     * Notify the delegate when the query image command is received from some node.
     * The controller identifies the fabric the node is on, and the nodeID
     * identifies the node within that fabric.
     * 
     * If completion is passed a non-nil error, that will be converted into
     * an error response to the client. Otherwise it must have a non-nil data,
     * which will be returned to the client.
     * 
     * When providing an OTA image, the imageURI in the
     * MTROTASoftwareUpdateProviderClusterQueryImageResponseParams must be set to
     * the file designator of the image. The completion will create the right BDX
     * URI from that file designator, as needed. The file designator returned here
     * via imageURI will be the same as the file designator passed to
     * handleBDXTransferSessionBeginForNodeID:controller:fileDesignator:offset:completion:.
     * 
     * API-Since: 16.4
     */
    @Generated
    @IsOptional
    @Selector("handleQueryImageForNodeID:controller:params:completion:")
    default void handleQueryImageForNodeIDControllerParamsCompletion(@NotNull NSNumber nodeID,
            @NotNull MTRDeviceController controller,
            @NotNull MTROTASoftwareUpdateProviderClusterQueryImageParams params,
            @ObjCBlock(name = "call_handleQueryImageForNodeIDControllerParamsCompletion") @NotNull Block_handleQueryImageForNodeIDControllerParamsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleQueryImageForNodeIDControllerParamsCompletion {
        @Generated
        void call_handleQueryImageForNodeIDControllerParamsCompletion(
                @Nullable MTROTASoftwareUpdateProviderClusterQueryImageResponseParams data, @Nullable NSError error);
    }
}