package apple.webkit.protocol;

import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSURLRequest;
import apple.foundation.NSURLResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKURLSchemeTask")
public interface WKURLSchemeTask {
    @Generated
    @Selector("didFailWithError:")
    void didFailWithError(NSError error);

    @Generated
    @Selector("didFinish")
    void didFinish();

    @Generated
    @Selector("didReceiveData:")
    void didReceiveData(NSData data);

    @Generated
    @Selector("didReceiveResponse:")
    void didReceiveResponse(NSURLResponse response);

    @Generated
    @Selector("request")
    NSURLRequest request();
}