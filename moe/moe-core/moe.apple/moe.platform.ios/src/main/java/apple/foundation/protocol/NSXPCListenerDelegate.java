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
    @Generated
    @IsOptional
    @Selector("listener:shouldAcceptNewConnection:")
    default boolean listenerShouldAcceptNewConnection(NSXPCListener listener, NSXPCConnection newConnection) {
        throw new java.lang.UnsupportedOperationException();
    }
}