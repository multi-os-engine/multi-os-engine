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

/**
 * A class conforming to the WKScriptMessageHandlerWithReply protocol provides a
 * method for receiving messages from JavaScript running in a webpage and replying to them asynchronously.
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("WKScriptMessageHandlerWithReply")
public interface WKScriptMessageHandlerWithReply {
    /**
     * Invoked when a script message is received from a webpage.
     * 
     * When the JavaScript running in your application's web content called
     * window.webkit.messageHandlers.<name>.postMessage(<messageBody>),
     * a JavaScript Promise object was returned. The values passed to the replyHandler are used to resolve that Promise.
     * 
     * Passing a non-nil NSString value to the second parameter of the replyHandler signals an error.
     * No matter what value you pass to the first parameter of the replyHandler,
     * the Promise will be rejected with a JavaScript error object whose message property is set to that errorMessage
     * string.
     * 
     * If the second parameter to the replyHandler is nil, the first argument will be serialized into its JavaScript
     * equivalent and the Promise will be fulfilled with the resulting value.
     * If the first argument is nil then the Promise will be resolved with a JavaScript value of "undefined"
     * 
     * Allowed non-nil result types are:
     * NSNumber, NSNull, NSString, NSDate, NSArray, and NSDictionary.
     * Any NSArray or NSDictionary containers can only contain objects of those types.
     * 
     * The replyHandler can be called at most once.
     * If the replyHandler is deallocated before it is called, the Promise will be rejected with a JavaScript Error
     * object
     * with an appropriate message indicating the handler was never called.
     * 
     * Example:
     * 
     * With a WKScriptMessageHandlerWithReply object installed with the name "testHandler", consider the following
     * JavaScript:
     * 
     * @textblock
     *            var promise = window.webkit.messageHandlers.testHandler.postMessage("Fulfill me with 42");
     *            await p;
     *            return p;
     * @/textblock
     * 
     *             And consider the following WKScriptMessageHandlerWithReply implementation:
     * @textblock
     *            - (void)userContentController:(WKUserContentController *)userContentController
     *            didReceiveScriptMessage:(WKScriptMessage *)message replyHandler:(void (^)(id, NSString *))replyHandler
     *            {
     *            if ([message.body isEqual:@"Fulfill me with 42"])
     *            replyHandler(@42, nil);
     *            else
     *            replyHandler(nil, @"Unexpected message received");
     *            }
     * @/textblock
     * 
     *             In this example:
     *             - The JavaScript code sends a message to your application code with the body @"Fulfill me with 42"
     *             - JavaScript execution is suspended while waiting for the resulting promise to resolve.
     *             - Your message handler is invoked with that message and a block to call with the reply when ready.
     *             - Your message handler sends the value @42 as a reply.
     *             - The JavaScript promise is fulfilled with the value 42.
     *             - JavaScript execution continues and the value 42 is returned.
     * 
     *             API-Since: 14.0
     * 
     * @param userContentController The user content controller invoking the delegate method.
     * @param message               The script message received.
     * @param replyHandler          A block to be called with the result of processing the message.
     */
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
