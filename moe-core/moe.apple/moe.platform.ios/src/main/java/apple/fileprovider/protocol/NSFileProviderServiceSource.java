package apple.fileprovider.protocol;

import apple.foundation.NSError;
import apple.foundation.NSXPCListenerEndpoint;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.ann.IsOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 11.0
 */
@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderServiceSource")
public interface NSFileProviderServiceSource {
    /**
     * Return an endpoint object to allow the client application to connect to the
     * file provider.
     * The endpoint is retrieved from an anonymous @c NSXPCListener that the file
     * provider creates. The file provider is in charge of accepting incoming
     * [@c] NSXPCConnection's via @c -[NSXPCListenerDelegate listener:shouldAcceptNewConnection:],
     * and setting up properties on the new connection, like its exported object and
     * interfaces (that both the file provider and the client application have agreed
     * on).
     */
    @Nullable
    @Generated
    @Selector("makeListenerEndpointAndReturnError:")
    NSXPCListenerEndpoint makeListenerEndpointAndReturnError(
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The service name that uniquely identifies the service (using reverse domain
     * name notation for you service name is recommended).
     */
    @NotNull
    @Generated
    @Selector("serviceName")
    String serviceName();

    /**
     * Indicates whether access to the service is restricted.
     * 
     * A restricted service can only be accessed by processes that can manage the domain the service is attached to. It
     * is only accessible
     * through `-[NSFileProviderManager getServiceWithName:itemIdentifier:completionHandler:]`
     * 
     * API-Since: 16.0
     */
    @Generated
    @IsOptional
    @Selector("isRestricted")
    default boolean isRestricted() {
        throw new java.lang.UnsupportedOperationException();
    }
}