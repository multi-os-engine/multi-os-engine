package apple.identitylookup.protocol;

import apple.identitylookup.ILMessageFilterCapabilitiesQueryRequest;
import apple.identitylookup.ILMessageFilterCapabilitiesQueryResponse;
import apple.identitylookup.ILMessageFilterExtensionContext;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Functionality related to MessageFilter extension capabilities query requests.
 * 
 * Subclasses of ILMessageFilterExtension which support querying must conform to this protocol.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("IdentityLookup")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ILMessageFilterCapabilitiesQueryHandling")
public interface ILMessageFilterCapabilitiesQueryHandling {
    /**
     * Evaluate a query request and provide a response describing how the system should handle the message it
     * represents.
     * 
     * - Using offline/stored information to form a response about the message described by the query request.
     * 
     * Block specified in `completion` parameter must be invoked with a response describing how to handle the message,
     * and may be
     * invoked asynchronously.
     * 
     * @param capabilitiesQueryRequest A capabilities query request to be handled
     * @param context                  Extension context.
     * @param completion               Completion block for returning a response.
     */
    @Generated
    @Selector("handleCapabilitiesQueryRequest:context:completion:")
    void handleCapabilitiesQueryRequestContextCompletion(
            ILMessageFilterCapabilitiesQueryRequest capabilitiesQueryRequest, ILMessageFilterExtensionContext context,
            @ObjCBlock(name = "call_handleCapabilitiesQueryRequestContextCompletion") Block_handleCapabilitiesQueryRequestContextCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCapabilitiesQueryRequestContextCompletion {
        @Generated
        void call_handleCapabilitiesQueryRequestContextCompletion(ILMessageFilterCapabilitiesQueryResponse arg0);
    }
}