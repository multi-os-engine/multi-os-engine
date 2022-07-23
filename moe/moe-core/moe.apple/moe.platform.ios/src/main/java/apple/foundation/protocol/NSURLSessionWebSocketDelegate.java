package apple.foundation.protocol;

import apple.foundation.NSData;
import apple.foundation.NSURLSession;
import apple.foundation.NSURLSessionWebSocketTask;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSURLSessionWebSocketDelegate")
public interface NSURLSessionWebSocketDelegate extends NSURLSessionTaskDelegate {
    /**
     * Indicates that the WebSocket has received a close frame from the server endpoint.
     * The close code and the close reason may be provided by the delegate if the server elects to send
     * this information in the close frame
     */
    @Generated
    @IsOptional
    @Selector("URLSession:webSocketTask:didCloseWithCode:reason:")
    default void URLSessionWebSocketTaskDidCloseWithCodeReason(NSURLSession session,
            NSURLSessionWebSocketTask webSocketTask, @NInt long closeCode, NSData reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Indicates that the WebSocket handshake was successful and the connection has been upgraded to webSockets.
     * It will also provide the protocol that is picked in the handshake. If the handshake fails, this delegate will not
     * be invoked.
     */
    @Generated
    @IsOptional
    @Selector("URLSession:webSocketTask:didOpenWithProtocol:")
    default void URLSessionWebSocketTaskDidOpenWithProtocol(NSURLSession session,
            NSURLSessionWebSocketTask webSocketTask, String protocol) {
        throw new java.lang.UnsupportedOperationException();
    }
}