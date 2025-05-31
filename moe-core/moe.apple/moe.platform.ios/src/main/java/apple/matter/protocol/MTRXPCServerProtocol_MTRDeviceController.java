package apple.matter.protocol;

import apple.foundation.NSNumber;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;

/**
 * API-Since: 18.3
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCServerProtocol_MTRDeviceController")
public interface MTRXPCServerProtocol_MTRDeviceController {
    /**
     * API-Since: 18.3
     */
    @Generated
    @IsOptional
    @Selector("deviceController:registerNodeID:")
    default void deviceControllerRegisterNodeID(@NotNull NSUUID controller, @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 18.3
     */
    @Generated
    @IsOptional
    @Selector("deviceController:unregisterNodeID:")
    default void deviceControllerUnregisterNodeID(@NotNull NSUUID controller, @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * - (oneway void)deviceController:(NSUUID *)controller addServerEndpoint:(MTRServerEndpoint *)endpoint
     * withReply:(void (^)(BOOL success))reply;
     * - (oneway void)deviceController:(NSUUID *)controller removeServerEndpoint:(MTRServerEndpoint *)endpoint;
     * 
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("deviceController:deleteNodeID:")
    default void deviceControllerDeleteNodeID(@NotNull NSUUID controller, @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @IsOptional
    @Selector("deviceController:getNodesWithStoredDataWithReply:")
    default void deviceControllerGetNodesWithStoredDataWithReply(@NotNull NSUUID controller,
            @ObjCBlock(name = "call_deviceControllerGetNodesWithStoredDataWithReply") @NotNull Block_deviceControllerGetNodesWithStoredDataWithReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerGetNodesWithStoredDataWithReply {
        @Generated
        void call_deviceControllerGetNodesWithStoredDataWithReply(@NotNull NSArray<? extends NSNumber> arg0);
    }

    /**
     * API-Since: 18.3
     */
    @Generated
    @IsOptional
    @Selector("deviceController:updateControllerConfiguration:")
    default void deviceControllerUpdateControllerConfiguration(@NotNull NSUUID controller,
            @NotNull NSDictionary<?, ?> controllerState) {
        throw new java.lang.UnsupportedOperationException();
    }
}