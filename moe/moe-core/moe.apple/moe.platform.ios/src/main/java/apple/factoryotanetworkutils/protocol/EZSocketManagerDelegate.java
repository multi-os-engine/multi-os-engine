package apple.factoryotanetworkutils.protocol;

import apple.factoryotanetworkutils.EZSocket;
import apple.factoryotanetworkutils.EZSocketManager;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EZSocketManagerDelegate")
public interface EZSocketManagerDelegate {
    @Generated
    @Selector("socketManager:socket:didDisconnect:")
    void socketManagerSocketDidDisconnect(@NotNull EZSocketManager smgr, @NotNull EZSocket socket,
            @Nullable NSError error);

    @Generated
    @Selector("socketManager:socket:didReceiveMessage:")
    void socketManagerSocketDidReceiveMessage(@NotNull EZSocketManager smgr, @NotNull EZSocket socket,
            @NotNull NSDictionary<?, ?> recvd_message);

    @Generated
    @IsOptional
    @Selector("socketManager:socket:shouldDeserializeData:")
    default boolean socketManagerSocketShouldDeserializeData(@NotNull EZSocketManager smgr, @NotNull EZSocket socket,
            @NotNull NSData recvd_data) {
        throw new java.lang.UnsupportedOperationException();
    }
}