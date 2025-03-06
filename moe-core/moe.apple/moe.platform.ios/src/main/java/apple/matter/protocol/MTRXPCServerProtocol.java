package apple.matter.protocol;

import apple.foundation.NSDictionary;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCServerProtocol")
public interface MTRXPCServerProtocol extends MTRXPCServerProtocol_MTRDevice, MTRXPCServerProtocol_MTRDeviceController {
    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:checkInWithContext:")
    default void deviceControllerCheckInWithContext(@NotNull NSUUID controller, @NotNull NSDictionary<?, ?> context) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 18.2
     */
    @Generated
    @IsOptional
    @Selector("deviceController:updateControllerConfiguration:")
    default void deviceControllerUpdateControllerConfiguration(@NotNull NSUUID controller,
            @NotNull NSDictionary<?, ?> controllerState) {
        throw new java.lang.UnsupportedOperationException();
    }
}