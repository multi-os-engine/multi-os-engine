package apple.factoryotanetworkutils.protocol;

import apple.factoryotanetworkutils.EZSocket;
import apple.factoryotanetworkutils.EZSocketServer;
import org.jetbrains.annotations.NotNull;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EZSocketServerDelegate")
public interface EZSocketServerDelegate {
    /**
     * server:didReceiveConnection: will be invoked from the thread from which start: is called
     * on the server instance, unless the EZSocketServerAcceptUndetached is set, in which case
     * a separate thread is detached and this method will be called from that thread.
     */
    @Generated
    @Selector("server:didReceiveConnection:")
    void serverDidReceiveConnection(@NotNull EZSocketServer server, @NotNull EZSocket socket);
}