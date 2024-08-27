package apple.factoryotanetworkutils;

import apple.NSObject;
import apple.factoryotanetworkutils.protocol.EZSocketServerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("FactoryOTANetworkUtils")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EZSocketServer extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected EZSocketServer(Pointer peer) {
        super(peer);
    }

    /**
     * accept:
     * 
     * This is a blocking call on accept() to accept one connection.
     * Cannot be used if listenForConnections: has been called already.
     */
    @Generated
    @Selector("accept:")
    @Nullable
    public native EZSocket accept(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native EZSocketServer alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native EZSocketServer allocWithZone(VoidPtr zone);

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
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native EZSocketServerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native EZSocketServer init();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * listenForConnections:
     * 
     * Opens a passive socket and detaches a thread to accept connections (unless EZSocketServerAcceptUndetached
     * is set).
     * 
     * This is a blocking call if EZSocketServerAcceptUndetached is set.
     */
    @Generated
    @Selector("listenForConnections:")
    public native boolean listenForConnections(@ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    @Generated
    @Owned
    @Selector("new")
    public static native EZSocketServer new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("serverWithFileDescriptor:delegate:")
    public static native EZSocketServer serverWithFileDescriptorDelegate(int fd,
            @Mapped(ObjCObjectMapper.class) @Nullable EZSocketServerDelegate delegate);

    /**
     * Currently supported schemes:
     * - tcp://host:port (Note: For passive TCP sockets, the host in the URL is ignored)
     * - unix://filepath
     */
    @Generated
    @Selector("serverWithURL:delegate:error:")
    public static native EZSocketServer serverWithURLDelegateError(@NotNull NSURL url,
            @Mapped(ObjCObjectMapper.class) @NotNull EZSocketServerDelegate delegate,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    @Generated
    @Selector("serverWithURL:delegate:options:error:")
    public static native EZSocketServer serverWithURLDelegateOptionsError(@NotNull NSURL url,
            @Mapped(ObjCObjectMapper.class) @NotNull EZSocketServerDelegate delegate, @NUInt long options,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> err);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) @Nullable EZSocketServerDelegate value);

    @Generated
    public void setDelegate(@Mapped(ObjCObjectMapper.class) @Nullable EZSocketServerDelegate value) {
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

    /**
     * Shuts down the accept loop
     */
    @Generated
    @Selector("shutdown")
    public native void shutdown();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("url")
    @NotNull
    public native NSURL url();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}