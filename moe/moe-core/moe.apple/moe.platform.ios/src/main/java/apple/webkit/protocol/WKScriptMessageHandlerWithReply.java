package apple.webkit.protocol;

import apple.webkit.WKScriptMessage;
import apple.webkit.WKUserContentController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKScriptMessageHandlerWithReply")
public interface WKScriptMessageHandlerWithReply {
    @Generated
    @Selector("userContentController:didReceiveScriptMessage:replyHandler:")
    void userContentControllerDidReceiveScriptMessageReplyHandler(WKUserContentController userContentController,
            WKScriptMessage message,
            @ObjCBlock(name = "call_userContentControllerDidReceiveScriptMessageReplyHandler") Block_userContentControllerDidReceiveScriptMessageReplyHandler replyHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_userContentControllerDidReceiveScriptMessageReplyHandler {
        @Generated
        void call_userContentControllerDidReceiveScriptMessageReplyHandler(@Mapped(ObjCObjectMapper.class) Object reply,
                String errorMessage);
    }
}