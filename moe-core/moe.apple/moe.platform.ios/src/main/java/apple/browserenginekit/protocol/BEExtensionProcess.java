package apple.browserenginekit.protocol;

import apple.foundation.NSError;
import apple.opaque.xpc_connection_t;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 26.0
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("BEExtensionProcess")
public interface BEExtensionProcess {
    /**
     * Stops the extension process.
     * 
     * When you call this method, you tell the system your app no longer needs this extension process.
     * If this is the last connection from the host process to the extension process, the system terminates
     * the extension process.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("invalidate")
    void invalidate();

    /**
     * Creates a new libXPC connection to the extension process.
     * 
     * This method creates a connection to the extension process and returns it. If it is not possible to make an XPC
     * connection, this method will return nil and populate the `error` out param.
     * 
     * - Returns: The connection object representing the created libXPC connection or nil.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("makeLibXPCConnectionError:")
    @Nullable
    xpc_connection_t makeLibXPCConnectionError(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);
}