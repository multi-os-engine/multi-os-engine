package apple.foundation.protocol;

import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;

/**
 * The connection itself and all proxies vended by the connection will conform with this protocol. This allows creation
 * of new proxies from other proxies.
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXPCProxyCreating")
public interface NSXPCProxyCreating {
    /**
     * Returns a proxy object with no error handling block. Messages sent to the proxy object will be sent over the wire
     * to the other side of the connection. All messages must be 'oneway void' return type. Control may be returned to
     * the caller before the message is sent. This proxy object will conform with the NSXPCProxyCreating protocol.
     */
    @NotNull
    @Generated
    @Selector("remoteObjectProxy")
    @MappedReturn(ObjCObjectMapper.class)
    Object remoteObjectProxy();

    /**
     * Returns a proxy object which will invoke the error handling block if an error occurs on the connection. If the
     * message sent to the proxy has a reply handler, then either the error handler or the reply handler will be called
     * exactly once. This proxy object will also conform with the NSXPCProxyCreating protocol.
     */
    @NotNull
    @Generated
    @Selector("remoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    Object remoteObjectProxyWithErrorHandler(
            @NotNull @ObjCBlock(name = "call_remoteObjectProxyWithErrorHandler") Block_remoteObjectProxyWithErrorHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_remoteObjectProxyWithErrorHandler {
        @Generated
        void call_remoteObjectProxyWithErrorHandler(@NotNull NSError error);
    }

    /**
     * Make a synchronous IPC call instead of the default async behavior. The error handler block and reply block will
     * be invoked on the calling thread before the message to the proxy returns, instead of on the queue for the
     * connection.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("synchronousRemoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    default Object synchronousRemoteObjectProxyWithErrorHandler(
            @NotNull @ObjCBlock(name = "call_synchronousRemoteObjectProxyWithErrorHandler") Block_synchronousRemoteObjectProxyWithErrorHandler handler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_synchronousRemoteObjectProxyWithErrorHandler {
        @Generated
        void call_synchronousRemoteObjectProxyWithErrorHandler(@NotNull NSError error);
    }
}