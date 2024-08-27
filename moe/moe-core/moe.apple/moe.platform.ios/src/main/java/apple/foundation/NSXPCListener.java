package apple.foundation;

import apple.NSObject;
import apple.foundation.protocol.NSXPCListenerDelegate;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Each NSXPCListener instance has a private serial queue. This queue is used when sending the delegate messages.
 * 
 * API-Since: 6.0
 */
@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSXPCListener extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NSXPCListener(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSXPCListener alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSXPCListener allocWithZone(VoidPtr zone);

    /**
     * Create an anonymous listener connection. Other processes may connect to this listener by passing this listener
     * object's endpoint to NSXPCConnection's -initWithListenerEndpoint: method.
     */
    @NotNull
    @Generated
    @Selector("anonymousListener")
    public static native NSXPCListener anonymousListener();

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

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * The delegate for the connection listener. If no delegate is set, all new connections will be rejected. See the
     * protocol for more information on how to implement it.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSXPCListenerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Get an endpoint object which may be sent over an existing connection. This allows the receiver of the endpoint to
     * create a new connection to this NSXPCListener. The NSXPCListenerEndpoint uniquely names this listener object
     * across connections.
     */
    @NotNull
    @Generated
    @Selector("endpoint")
    public native NSXPCListenerEndpoint endpoint();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NSXPCListener init();

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
     * Invalidate the listener. No more connections will be created. Once a listener is invalidated it may not be
     * resumed or suspended.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSXPCListener new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * All listeners start suspended and must be resumed before they will process incoming requests. If called on the
     * serviceListener, this method will never return. Call it as the last step inside your main function in your XPC
     * service after setting up desired initial state and the listener itself. If called on any other NSXPCListener, the
     * connection is resumed and the method returns immediately.
     * For new code, calling `-activate` is preferred for the initial activation of the listener.
     */
    @Generated
    @Selector("resume")
    public native void resume();

    /**
     * If your listener is an XPCService (that is, in the XPCServices folder of an application or framework), then use
     * this method to get the shared, singleton NSXPCListener object that will await new connections. When the resume
     * method is called on this listener, it will not return. Instead it hands over control to the object and allows it
     * to service the listener as appropriate. This makes it ideal for use in your main() function. For more info on
     * XPCServices, please refer to the developer documentation.
     */
    @NotNull
    @Generated
    @Selector("serviceListener")
    public static native NSXPCListener serviceListener();

    /**
     * The delegate for the connection listener. If no delegate is set, all new connections will be rejected. See the
     * protocol for more information on how to implement it.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSXPCListenerDelegate value);

    /**
     * The delegate for the connection listener. If no delegate is set, all new connections will be rejected. See the
     * protocol for more information on how to implement it.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSXPCListenerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Suspend the listener. Suspends must be balanced with resumes before the listener may be invalidated.
     */
    @Generated
    @Selector("suspend")
    public native void suspend();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Activates the listener.
     * Listeners start in an inactive state. You must call `-activate` on a listener before it will send or receive any
     * messages.
     * Calling `-activate` on an active listener has no effect.
     * For backward compatibility reasons, `-resume` on an inactive and otherwise not suspended NSXPCListener has the
     * same effect as calling `-activate`. For new code, using `-activate` is preferred.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("activate")
    public native void activate();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
