package apple.browserenginekit;

import apple.NSObject;
import apple.browserenginekit.protocol.BEProcessCapabilityGrant;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.opaque.xpc_connection_t;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object that represents a running network extension process.
 * 
 * The system guarantees that the extension process has launched by the time the initializer methods return.
 * If the extension process exits, the system calls ``interruptionHandler``. There can only be one extension process per
 * host browser. The first time this type is initialized, a process will be launched. If a extension process is all
 * ready
 * running, the returned object will represent the already running process.
 * 
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BENetworkingProcess extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BENetworkingProcess(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BENetworkingProcess alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BENetworkingProcess allocWithZone(VoidPtr zone);

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
     * Grants the specified capability to the process.
     * 
     * This method grants the specified capability to the process or returns nil and an error if it can not be granted.
     * 
     * - Parameters:
     * - capability: The capability to be granted
     * - error: The error out param populated if the capability cannot be granted.
     * 
     * - Returns: an invalidatable grant object that represents the granted capability.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("grantCapability:error:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native BEProcessCapabilityGrant grantCapabilityError(@NotNull BEProcessCapability capability,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Grants the specified capability to the process with invalidation handler.
     * 
     * This method grants the specified capability to the process or returns nil and an error if it can not be granted.
     * 
     * - Parameters:
     * - capability: The capability to be granted
     * - error: The error out param populated if the capability cannot be granted.
     * - invalidationHandler: The invalidation handler
     * 
     * - Returns: an invalidatable grant object that represents the granted capability.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("grantCapability:error:invalidationHandler:")
    @MappedReturn(ObjCObjectMapper.class)
    @Nullable
    public native BEProcessCapabilityGrant grantCapabilityErrorInvalidationHandler(
            @NotNull BEProcessCapability capability, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error,
            @ObjCBlock(name = "call_grantCapabilityErrorInvalidationHandler") @NotNull Block_grantCapabilityErrorInvalidationHandler invalidationHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_grantCapabilityErrorInvalidationHandler {
        @Generated
        void call_grantCapabilityErrorInvalidationHandler();
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BENetworkingProcess init();

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
     * Stops the extension process.
     * 
     * When you call this method, you tell the system your app no longer needs this extension process.
     * The system will terminate the extension process.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Creates a new libXPC connection to the extension process.
     * 
     * This method creates a connection to the extension process and returns it. If it is not possible to make an XPC
     * connection, this method will return nil and populate the `error` out param.
     * 
     * - Returns: The connection object representing the created libXPC connection or nil.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("makeLibXPCConnectionError:")
    @Nullable
    public native xpc_connection_t makeLibXPCConnectionError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Asynchronously launches a network extension process.
     * 
     * This initializer launches a new network extension process with the provided bundle identifier.
     * 
     * - Parameters:
     * - `bundleID` : The bundle identifier of the network extension process to launch.
     * - `interruptionHandler` : A block that is called if the extension process terminates.
     * - `completion` : A block called with a new ``BENetworkingProcess`` when the extension process has
     * launched or with an error.
     * 
     * API-Since: 18.2
     */
    @Generated
    @Selector("networkProcessWithBundleID:interruptionHandler:completion:")
    public static native void networkProcessWithBundleIDInterruptionHandlerCompletion(@NotNull String bundleID,
            @ObjCBlock(name = "call_networkProcessWithBundleIDInterruptionHandlerCompletion_1") @NotNull Block_networkProcessWithBundleIDInterruptionHandlerCompletion_1 interruptionHandler,
            @ObjCBlock(name = "call_networkProcessWithBundleIDInterruptionHandlerCompletion_2") @NotNull Block_networkProcessWithBundleIDInterruptionHandlerCompletion_2 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_networkProcessWithBundleIDInterruptionHandlerCompletion_1 {
        @Generated
        void call_networkProcessWithBundleIDInterruptionHandlerCompletion_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_networkProcessWithBundleIDInterruptionHandlerCompletion_2 {
        @Generated
        void call_networkProcessWithBundleIDInterruptionHandlerCompletion_2(@Nullable BENetworkingProcess process,
                @Nullable NSError error);
    }

    /**
     * Asynchronously finds an existing network extension process or launches a one.
     * 
     * This initializer finds an existing networking extension process. If it’s unable to find an
     * existing process, it launches a new extension process.
     * 
     * - Parameters:
     * - `interruptionHandler` : A block that is called if the extension process terminates.
     * - `completion` : A block called with a new ``BENetworkingProcess`` when the extension process has
     * launched or with an error.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("networkProcessWithInterruptionHandler:completion:")
    public static native void networkProcessWithInterruptionHandlerCompletion(
            @ObjCBlock(name = "call_networkProcessWithInterruptionHandlerCompletion_0") @NotNull Block_networkProcessWithInterruptionHandlerCompletion_0 interruptionHandler,
            @ObjCBlock(name = "call_networkProcessWithInterruptionHandlerCompletion_1") @NotNull Block_networkProcessWithInterruptionHandlerCompletion_1 completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_networkProcessWithInterruptionHandlerCompletion_0 {
        @Generated
        void call_networkProcessWithInterruptionHandlerCompletion_0();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_networkProcessWithInterruptionHandlerCompletion_1 {
        @Generated
        void call_networkProcessWithInterruptionHandlerCompletion_1(@Nullable BENetworkingProcess process,
                @Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native BENetworkingProcess new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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