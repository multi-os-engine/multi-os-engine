package apple.webkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/**
 * A ``WKWebExtensionMessagePort`` object manages message-based communication with a web extension.
 * 
 * Contains properties and methods to handle message exchanges with a web extension.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("WebKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class WKWebExtensionMessagePort extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected WKWebExtensionMessagePort(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native WKWebExtensionMessagePort alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native WKWebExtensionMessagePort allocWithZone(VoidPtr zone);

    /**
     * The unique identifier for the app to which this port should be connected.
     * 
     * This identifier is provided by the web extension and may or may not be used by the app.
     * It's up to the app to decide how to interpret this identifier.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("applicationIdentifier")
    @Nullable
    public native String applicationIdentifier();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Disconnects the port, terminating all further messages.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("disconnect")
    public native void disconnect();

    /**
     * The block to be executed when the port disconnects.
     * 
     * An optional block to be invoked when the port disconnects, taking an optional error that indicates if the
     * disconnection was caused by an error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("disconnectHandler")
    @ObjCBlock(name = "call_disconnectHandler_ret")
    @Nullable
    public native Block_disconnectHandler_ret disconnectHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disconnectHandler_ret {
        @Generated
        void call_disconnectHandler_ret(@Nullable NSError arg0);
    }

    /**
     * Disconnects the port, terminating all further messages with an optional error.
     * 
     * @param error An optional error indicating the reason for disconnection.
     * 
     *              API-Since: 18.4
     */
    @Generated
    @Selector("disconnectWithError:")
    public native void disconnectWithError(@Nullable NSError error);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native WKWebExtensionMessagePort init();

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

    /**
     * Indicates whether the message port is disconnected.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("isDisconnected")
    public native boolean isDisconnected();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * The block to be executed when a message is received from the web extension.
     * 
     * An optional block to be invoked when a message is received, taking two parameters: the message and an optional
     * error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("messageHandler")
    @ObjCBlock(name = "call_messageHandler_ret")
    @Nullable
    public native Block_messageHandler_ret messageHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_messageHandler_ret {
        @Generated
        void call_messageHandler_ret(@Mapped(ObjCObjectMapper.class) @Nullable Object arg0, @Nullable NSError arg1);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native WKWebExtensionMessagePort new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sends a message to the connected web extension.
     * [@note] The message must be JSON-serializable according to ``NSJSONSerialization``.
     * 
     * API-Since: 18.4
     * 
     * @param message           The JSON-serializable message to be sent.
     * @param completionHandler An optional block to be invoked after the message is sent, taking an optional error.
     */
    @Generated
    @Selector("sendMessage:completionHandler:")
    public native void sendMessageCompletionHandler(@Mapped(ObjCObjectMapper.class) @Nullable Object message,
            @ObjCBlock(name = "call_sendMessageCompletionHandler") @Nullable Block_sendMessageCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_sendMessageCompletionHandler {
        @Generated
        void call_sendMessageCompletionHandler(@Nullable NSError error);
    }

    /**
     * The block to be executed when the port disconnects.
     * 
     * An optional block to be invoked when the port disconnects, taking an optional error that indicates if the
     * disconnection was caused by an error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDisconnectHandler:")
    public native void setDisconnectHandler(
            @ObjCBlock(name = "call_setDisconnectHandler") @Nullable Block_setDisconnectHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setDisconnectHandler {
        @Generated
        void call_setDisconnectHandler(@Nullable NSError arg0);
    }

    /**
     * The block to be executed when a message is received from the web extension.
     * 
     * An optional block to be invoked when a message is received, taking two parameters: the message and an optional
     * error.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMessageHandler:")
    public native void setMessageHandler(
            @ObjCBlock(name = "call_setMessageHandler") @Nullable Block_setMessageHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setMessageHandler {
        @Generated
        void call_setMessageHandler(@Mapped(ObjCObjectMapper.class) @Nullable Object arg0, @Nullable NSError arg1);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}