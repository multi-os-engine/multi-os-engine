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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("exportedInterface")
    public native NSXPCInterface exportedInterface();

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

    @Generated
    @Selector("invalidate")
    public native void invalidate();

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("processIdentifier")
    public native int processIdentifier();

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

    @Generated
    @Selector("resume")
    public native void resume();

    @Generated
    @Selector("serviceName")
    public native String serviceName();

    @Generated
    @Selector("setExportedInterface:")
    public native void setExportedInterface(NSXPCInterface value);

    @Generated
    @Selector("setExportedObject:")
    public native void setExportedObject(@Mapped(ObjCObjectMapper.class) Object value);

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

    @Generated
    @Selector("setRemoteObjectInterface:")
    public native void setRemoteObjectInterface(NSXPCInterface value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

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

    @Generated
    @Selector("currentConnection")
    public static native NSXPCConnection currentConnection();

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
}