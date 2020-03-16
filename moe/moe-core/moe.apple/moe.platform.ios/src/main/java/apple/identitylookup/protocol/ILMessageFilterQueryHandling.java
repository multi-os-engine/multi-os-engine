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

@Generated
@Library("IdentityLookup")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ILMessageFilterQueryHandling")
public interface ILMessageFilterQueryHandling {
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