package apple.foundation;

import apple.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A WebSocket task can be created with a ws or wss url. A client can also provide
 * a list of protocols it wishes to advertise during the WebSocket handshake phase.
 * Once the handshake is successfully completed the client will be notified through an optional delegate.
 * All reads and writes enqueued before the completion of the handshake will be queued up and
 * executed once the handshake succeeds. Before the handshake completes, the client can be called to handle
 * redirection or authentication using the same delegates as NSURLSessionTask. WebSocket task will also provide
 * support for cookies and will store cookies to the cookie storage on the session and will attach cookies to
 * outgoing HTTP handshake requests.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSURLSessionWebSocketTask extends NSURLSessionTask {
    static {
        NatJ.register();
    }

    @Generated
    protected NSURLSessionWebSocketTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSURLSessionWebSocketTask alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSURLSessionWebSocketTask allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Sends a close frame with the given closeCode. An optional reason can be provided while sending the close frame.
     * Simply calling cancel on the task will result in a cancellation frame being sent without any reason.
     */
    @Generated
    @Selector("cancelWithCloseCode:reason:")
    public native void cancelWithCloseCodeReason(@NInt long closeCode, @Nullable NSData reason);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * A task can be queried for it's close code at any point. When the task is not closed, it will be set to
     * NSURLSessionWebSocketCloseCodeInvalid
     */
    @Generated
    @Selector("closeCode")
    @NInt
    public native long closeCode();

    /**
     * A task can be queried for it's close reason at any point. A nil value indicates no closeReason or that the task
     * is still running
     */
    @Nullable
    @Generated
    @Selector("closeReason")
    public native NSData closeReason();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSURLSessionWebSocketTask init();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The maximum number of bytes to be buffered before erroring out. This includes the sum of all bytes from
     * continuation frames. Receive calls will error out if this value is reached
     */
    @Generated
    @Selector("maximumMessageSize")
    @NInt
    public native long maximumMessageSize();

    @Generated
    @Owned
    @Selector("new")
    public static native NSURLSessionWebSocketTask new_objc();

    /**
     * Reads a WebSocket message once all the frames of the message are available.
     * If the maximumMessage size is hit while buffering the frames, the receiveMessage call will error out
     * and all outstanding work will also fail resulting in the end of the task.
     */
    @Generated
    @Selector("receiveMessageWithCompletionHandler:")
    public native void receiveMessageWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_receiveMessageWithCompletionHandler") Block_receiveMessageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_receiveMessageWithCompletionHandler {
        @Generated
        void call_receiveMessageWithCompletionHandler(@Nullable NSURLSessionWebSocketMessage message,
                @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sends a WebSocket message. If an error occurs, any outstanding work will also fail.
     * Note that invocation of the completion handler does not
     * guarantee that the remote side has received all the bytes, only
     * that they have been written to the kernel.
     */
    @Generated
    @Selector("sendMessage:completionHandler:")
    public native void sendMessageCompletionHandler(@NotNull NSURLSessionWebSocketMessage message,
            @NotNull @ObjCBlock(name = "call_sendMessageCompletionHandler") Block_sendMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageCompletionHandler {
        @Generated
        void call_sendMessageCompletionHandler(@Nullable NSError error);
    }

    /**
     * Sends a ping frame from the client side. The pongReceiveHandler is invoked when the client
     * receives a pong from the server endpoint. If a connection is lost or an error occurs before receiving
     * the pong from the endpoint, the pongReceiveHandler block will be invoked with an error.
     * Note - the pongReceiveHandler will always be called in the order in which the pings were sent.
     */
    @Generated
    @Selector("sendPingWithPongReceiveHandler:")
    public native void sendPingWithPongReceiveHandler(
            @NotNull @ObjCBlock(name = "call_sendPingWithPongReceiveHandler") Block_sendPingWithPongReceiveHandler pongReceiveHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendPingWithPongReceiveHandler {
        @Generated
        void call_sendPingWithPongReceiveHandler(@Nullable NSError error);
    }

    /**
     * The maximum number of bytes to be buffered before erroring out. This includes the sum of all bytes from
     * continuation frames. Receive calls will error out if this value is reached
     */
    @Generated
    @Selector("setMaximumMessageSize:")
    public native void setMaximumMessageSize(@NInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
