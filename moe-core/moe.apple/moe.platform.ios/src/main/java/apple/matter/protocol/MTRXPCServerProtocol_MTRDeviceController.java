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

/**
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCServerProtocol_MTRDeviceController")
public interface MTRXPCServerProtocol_MTRDeviceController {
    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:controllerNodeIDWithReply:")
    default void deviceControllerControllerNodeIDWithReply(@NotNull NSUUID controller,
            @ObjCBlock(name = "call_deviceControllerControllerNodeIDWithReply") @NotNull Block_deviceControllerControllerNodeIDWithReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerControllerNodeIDWithReply {
        @Generated
        void call_deviceControllerControllerNodeIDWithReply(@NotNull NSNumber nodeID);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:getIsRunningWithReply:")
    default void deviceControllerGetIsRunningWithReply(@NotNull NSUUID controller,
            @ObjCBlock(name = "call_deviceControllerGetIsRunningWithReply") @NotNull Block_deviceControllerGetIsRunningWithReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerGetIsRunningWithReply {
        @Generated
        void call_deviceControllerGetIsRunningWithReply(boolean response);
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:getUniqueIdentifierWithReply:")
    default void deviceControllerGetUniqueIdentifierWithReply(@NotNull NSUUID controller,
            @ObjCBlock(name = "call_deviceControllerGetUniqueIdentifierWithReply") @NotNull Block_deviceControllerGetUniqueIdentifierWithReply reply) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_deviceControllerGetUniqueIdentifierWithReply {
        @Generated
        void call_deviceControllerGetUniqueIdentifierWithReply(@NotNull NSUUID arg0);
    }

    /**
     * - (oneway void)deviceController:(NSUUID *)controller addServerEndpoint:(MTRServerEndpoint *)endpoint
     * withReply:(void (^)(BOOL success))reply;
     * - (oneway void)deviceController:(NSUUID *)controller removeServerEndpoint:(MTRServerEndpoint *)endpoint;
     * 
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:registerNodeID:")
    default void deviceControllerRegisterNodeID(@NotNull NSUUID controller, @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:unregisterNodeID:")
    default void deviceControllerUnregisterNodeID(@NotNull NSUUID controller, @NotNull NSNumber nodeID) {
        throw new java.lang.UnsupportedOperationException();
    }
}