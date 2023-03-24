package apple.passkit.protocol;

import apple.foundation.NSData;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * API-Since: 15.4
 */
@Generated
@Library("PassKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKVehicleConnectionDelegate")
public interface PKVehicleConnectionDelegate {
    @Generated
    @Selector("sessionDidChangeConnectionState:")
    void sessionDidChangeConnectionState(@NInt long newState);

    /**
     * Called when the session receives the message from the destination.
     */
    @Generated
    @Selector("sessionDidReceiveData:")
    void sessionDidReceiveData(@NotNull NSData data);
}