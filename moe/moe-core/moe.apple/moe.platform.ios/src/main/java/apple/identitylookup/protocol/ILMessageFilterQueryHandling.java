package apple.identitylookup.protocol;

import apple.identitylookup.ILMessageFilterExtensionContext;
import apple.identitylookup.ILMessageFilterQueryRequest;
import apple.identitylookup.ILMessageFilterQueryResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Functionality related to MessageFilter extension query requests.
 * 
 * Subclasses of ILMessageFilterExtension which support querying must conform to this protocol.
 */
@Generated
@Library("IdentityLookup")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ILMessageFilterQueryHandling")
public interface ILMessageFilterQueryHandling {
    /**
     * Evaluate a query request and provide a response describing how the system should handle the message it represents.
     * 
     * May include either (or both) of the following:
     * 
     * - Using offline/stored information to form a response about the message described by the query request.
     * 
     * - Deferring the query request to a network service associated with the app extension, allowing the network service to
     *   return data back to extension in order to form a response about the message. The `context` parameter provides an API which
     *   allows deferring a request to the network and receiving the response to that network request.
     * 
     * Block specified in `completion` parameter must be invoked with a response describing how to handle the message, and may be
     * invoked asynchronously.
     * 
     * @param queryRequest A query request to be handled which describes a received message.
     * @param context Extension context which offers API to defer request to network if necessary.
     * @param completion Completion block for returning a response.
     */
    @Generated
    @Selector("handleQueryRequest:context:completion:")
    void handleQueryRequestContextCompletion(ILMessageFilterQueryRequest queryRequest,
            ILMessageFilterExtensionContext context,
            @ObjCBlock(name = "call_handleQueryRequestContextCompletion") Block_handleQueryRequestContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleQueryRequestContextCompletion {
        @Generated
        void call_handleQueryRequestContextCompletion(ILMessageFilterQueryResponse arg0);
    }
}