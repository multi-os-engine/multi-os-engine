package apple.foundation.protocol;

import apple.foundation.NSXPCConnection;
import apple.foundation.NSXPCListener;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSXPCListenerDelegate")
public interface NSXPCListenerDelegate {
    /**
     * Accept or reject a new connection to the listener. This is a good time to set up properties on the new connection, like its exported object and interfaces. If a value of NO is returned, the connection object will be invalidated after this method returns. Be sure to resume the new connection and return YES when you are finished configuring it and are ready to receive messages. You may delay resuming the connection if you wish, but still return YES from this method if you want the connection to be accepted.
     */
    @Generated
    @IsOptional
    @Selector("listener:shouldAcceptNewConnection:")
    default boolean listenerShouldAcceptNewConnection(NSXPCListener listener, NSXPCConnection newConnection) {
        throw new java.lang.UnsupportedOperationException();
    }
}