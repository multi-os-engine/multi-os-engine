package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSXPCProxyCreating;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
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
 * This object is the main configuration mechanism for the communication between two processes. Each NSXPCConnection
 * instance has a private serial queue. This queue is used when sending messages to reply handlers, interruption
 * handlers, and invalidation handlers.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXPCConnection extends NSObject implements NSXPCProxyCreating {
    static {
        NatJ.register();
    }

    @Generated
    protected NSXPCConnection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSXPCConnection alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSXPCConnection allocWithZone(VoidPtr zone);

    /**
     * These attributes describe the security attributes of the connection. They may be used by the listener delegate to
     * accept or reject connections.
     */
    @Generated
    @Selector("auditSessionIdentifier")
    public native int auditSessionIdentifier();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("effectiveGroupIdentifier")
    public native int effectiveGroupIdentifier();

    @Generated
    @Selector("effectiveUserIdentifier")
    public native int effectiveUserIdentifier();

    @Generated
    @Selector("endpoint")
    public native NSXPCListenerEndpoint endpoint();

    /**
     * The interface that describes messages that are allowed to be received by the exported object on this connection.
     * This value is required if a exported object is set.
     */
    @Generated
    @Selector("exportedInterface")
    public native NSXPCInterface exportedInterface();

    /**
     * Set an exported object for the connection. Messages sent to the remoteObjectProxy from the other side of the
     * connection will be dispatched to this object. Messages delivered to exported objects are serialized and sent on a
     * non-main queue. The receiver is responsible for handling the messages on a different queue or thread if it is
     * required.
     */
    @Generated
    @Selector("exportedObject")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object exportedObject();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSXPCConnection init();

    /**
     * Initialize an NSXPCConnection that will connect to an NSXPCListener (identified by its NSXPCListenerEndpoint).
     */
    @Generated
    @Selector("initWithListenerEndpoint:")
    public native NSXPCConnection initWithListenerEndpoint(NSXPCListenerEndpoint endpoint);

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
     * The interruption handler will be called if the remote process exits or crashes. It may be possible to
     * re-establish the connection by simply sending another message. The handler will be invoked on the same queue as
     * replies and other handlers, but there is no guarantee of ordering between those callbacks and this one.
     * The interruptionHandler property is cleared after the connection becomes invalid. This is to mitigate the impact
     * of a retain cycle created by referencing the NSXPCConnection instance inside this block.
     */
    @Generated
    @Selector("interruptionHandler")
    @ObjCBlock(name = "call_interruptionHandler_ret")
    public native Block_interruptionHandler_ret interruptionHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_interruptionHandler_ret {
        @Generated
        void call_interruptionHandler_ret();
    }

    /**
     * Invalidate the connection. All outstanding error handling blocks and invalidation blocks will be called on the
     * message handling queue. The connection must be invalidated before it is deallocated. After a connection is
     * invalidated, no more messages may be sent or received.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    /**
     * The invalidation handler will be called if the connection can not be formed or the connection has terminated and
     * may not be re-established. The invalidation handler will also be called if a connection created with an
     * NSXPCListenerEndpoint is invalidated from the remote side, or if the NSXPCListener used to create that endpoint
     * is invalidated. The handler will be invoked on the same queue as replies and other handlers, but there is no
     * guarantee of ordering between those callbacks and this one.
     * You may not send messages over the connection from within an invalidation handler block.
     * The invalidationHandler property is cleared after the connection becomes invalid. This is to mitigate the impact
     * of a retain cycle created by referencing the NSXPCConnection instance inside this block.
     */
    @Generated
    @Selector("invalidationHandler")
    @ObjCBlock(name = "call_invalidationHandler_ret")
    public native Block_invalidationHandler_ret invalidationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_invalidationHandler_ret {
        @Generated
        void call_invalidationHandler_ret();
    }

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSXPCConnection new_objc();

    @Generated
    @Selector("processIdentifier")
    public native int processIdentifier();

    /**
     * The interface that describes messages that are allowed to be received by object that has been "imported" to this
     * connection (exported from the other side). This value is required if messages are sent over this connection.
     */
    @Generated
    @Selector("remoteObjectInterface")
    public native NSXPCInterface remoteObjectInterface();

    @Generated
    @Selector("remoteObjectProxy")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object remoteObjectProxy();

    @Generated
    @Selector("remoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object remoteObjectProxyWithErrorHandler(
            @ObjCBlock(name = "call_remoteObjectProxyWithErrorHandler") NSXPCProxyCreating.Block_remoteObjectProxyWithErrorHandler handler);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * All connections start suspended. You must resume them before they will start processing received messages or
     * sending messages through the remoteObjectProxy. Note: Calling resume does not immediately launch the XPC service.
     * The service will be started on demand when the first message is sent. However, if the name specified when
     * creating the connection is determined to be invalid, your invalidation handler will be called immediately (and
     * asynchronously) after calling resume.
     * For new code, calling `-activate` is preferred for the initial activation of the connection.
     */
    @Generated
    @Selector("resume")
    public native void resume();

    @Generated
    @Selector("serviceName")
    public native String serviceName();

    /**
     * The interface that describes messages that are allowed to be received by the exported object on this connection.
     * This value is required if a exported object is set.
     */
    @Generated
    @Selector("setExportedInterface:")
    public native void setExportedInterface(NSXPCInterface value);

    /**
     * Set an exported object for the connection. Messages sent to the remoteObjectProxy from the other side of the
     * connection will be dispatched to this object. Messages delivered to exported objects are serialized and sent on a
     * non-main queue. The receiver is responsible for handling the messages on a different queue or thread if it is
     * required.
     */
    @Generated
    @Selector("setExportedObject:")
    public native void setExportedObject(@Mapped(ObjCObjectMapper.class) Object value);

    /**
     * The interruption handler will be called if the remote process exits or crashes. It may be possible to
     * re-establish the connection by simply sending another message. The handler will be invoked on the same queue as
     * replies and other handlers, but there is no guarantee of ordering between those callbacks and this one.
     * The interruptionHandler property is cleared after the connection becomes invalid. This is to mitigate the impact
     * of a retain cycle created by referencing the NSXPCConnection instance inside this block.
     */
    @Generated
    @Selector("setInterruptionHandler:")
    public native void setInterruptionHandler(
            @ObjCBlock(name = "call_setInterruptionHandler") Block_setInterruptionHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInterruptionHandler {
        @Generated
        void call_setInterruptionHandler();
    }

    /**
     * The invalidation handler will be called if the connection can not be formed or the connection has terminated and
     * may not be re-established. The invalidation handler will also be called if a connection created with an
     * NSXPCListenerEndpoint is invalidated from the remote side, or if the NSXPCListener used to create that endpoint
     * is invalidated. The handler will be invoked on the same queue as replies and other handlers, but there is no
     * guarantee of ordering between those callbacks and this one.
     * You may not send messages over the connection from within an invalidation handler block.
     * The invalidationHandler property is cleared after the connection becomes invalid. This is to mitigate the impact
     * of a retain cycle created by referencing the NSXPCConnection instance inside this block.
     */
    @Generated
    @Selector("setInvalidationHandler:")
    public native void setInvalidationHandler(
            @ObjCBlock(name = "call_setInvalidationHandler") Block_setInvalidationHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setInvalidationHandler {
        @Generated
        void call_setInvalidationHandler();
    }

    /**
     * The interface that describes messages that are allowed to be received by object that has been "imported" to this
     * connection (exported from the other side). This value is required if messages are sent over this connection.
     */
    @Generated
    @Selector("setRemoteObjectInterface:")
    public native void setRemoteObjectInterface(NSXPCInterface value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Suspend the connection. Suspends must be balanced with resumes before the connection may be invalidated.
     */
    @Generated
    @Selector("suspend")
    public native void suspend();

    @Generated
    @Selector("synchronousRemoteObjectProxyWithErrorHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object synchronousRemoteObjectProxyWithErrorHandler(
            @ObjCBlock(name = "call_synchronousRemoteObjectProxyWithErrorHandler") NSXPCProxyCreating.Block_synchronousRemoteObjectProxyWithErrorHandler handler);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Get the current connection, in the context of a call to a method on your exported object. Useful for determining
     * 'who called this'.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("currentConnection")
    public static native NSXPCConnection currentConnection();

    /**
     * Add a barrier block to be executed on the connection. This barrier block will run after any outstanding sends
     * have completed. Note: This does not guarantee that messages will be received by the remote process by the time
     * the block is invoked. If you need to ensure receipt of a message by the remote process, waiting for a reply to
     * come back is the best option.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("scheduleSendBarrierBlock:")
    public native void scheduleSendBarrierBlock(
            @ObjCBlock(name = "call_scheduleSendBarrierBlock") Block_scheduleSendBarrierBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_scheduleSendBarrierBlock {
        @Generated
        void call_scheduleSendBarrierBlock();
    }

    /**
     * Activates the connection.
     * Connections start in an inactive state. You must call `-activate` on a connection before it will send or receive
     * any messages.
     * Calling `-activate` on an active connection has no effect.
     * For backward compatibility reasons, `-resume` on an inactive and otherwise not suspended NSXPCConnection has the
     * same effect as calling `-activate`. For new code, using `-activate` is preferred.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("activate")
    public native void activate();
}
