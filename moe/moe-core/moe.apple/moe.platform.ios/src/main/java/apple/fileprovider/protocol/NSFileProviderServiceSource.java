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

@Generated
@Library("FileProvider")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("NSFileProviderServiceSource")
public interface NSFileProviderServiceSource {
    @Generated
    @Selector("makeListenerEndpointAndReturnError:")
    NSXPCListenerEndpoint makeListenerEndpointAndReturnError(@ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("serviceName")
    String serviceName();
}