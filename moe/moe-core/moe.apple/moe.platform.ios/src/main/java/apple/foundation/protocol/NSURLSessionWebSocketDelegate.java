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
    @Generated
    @IsOptional
    @Selector("URLSession:webSocketTask:didCloseWithCode:reason:")
    default void URLSessionWebSocketTaskDidCloseWithCodeReason(NSURLSession session,
            NSURLSessionWebSocketTask webSocketTask, @NInt long closeCode, NSData reason) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("URLSession:webSocketTask:didOpenWithProtocol:")
    default void URLSessionWebSocketTaskDidOpenWithProtocol(NSURLSession session,
            NSURLSessionWebSocketTask webSocketTask, String protocol) {
        throw new java.lang.UnsupportedOperationException();
    }
}