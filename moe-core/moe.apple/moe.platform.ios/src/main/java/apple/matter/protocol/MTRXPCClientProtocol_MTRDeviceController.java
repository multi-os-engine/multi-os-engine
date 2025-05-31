package apple.matter.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import apple.foundation.NSDictionary;
import apple.foundation.NSUUID;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 18.2
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MTRXPCClientProtocol_MTRDeviceController")
public interface MTRXPCClientProtocol_MTRDeviceController {

    /**
     * API-Since: 18.3
     */
    @Generated
    @IsOptional
    @Selector("controller:controllerConfigurationUpdated:")
    default void controllerControllerConfigurationUpdated(@NotNull NSUUID controller,
            @NotNull NSDictionary<?, ?> configuration) {
        throw new java.lang.UnsupportedOperationException();
    }
}