package apple.browserenginekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSData;
import org.moe.natj.objc.ann.ObjCBlock;

/**
 * API-Since: 17.4
 */
@Generated
@Library("BrowserEngineKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BELayerHierarchyHostingTransactionCoordinator extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected BELayerHierarchyHostingTransactionCoordinator(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * a signal to coordinate transactions involving `layerHierarchy` from now until `commit` is called
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("addLayerHierarchy:")
    public native void addLayerHierarchy(@NotNull BELayerHierarchy layerHierarchy);

    /**
     * a signal to coordinate transactions involving `hostingView` from now until `commit` is called
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("addLayerHierarchyHostingView:")
    public native void addLayerHierarchyHostingView(@NotNull BELayerHierarchyHostingView hostingView);

    @Generated
    @Owned
    @Selector("alloc")
    public static native BELayerHierarchyHostingTransactionCoordinator alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native BELayerHierarchyHostingTransactionCoordinator allocWithZone(VoidPtr zone);

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

    /**
     * `commit` must be called on _every_ instance and it must be the last call to each instance.
     * note that it does not commit `CATransaction`s but rather commits the coordination of transactions in the render
     * server.
     * note that coordinators should have as constrained a lifespan as possible and will timeout if held open too long.
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("commit")
    public native void commit();

    /**
     * may fail if a connection to the render server cannot be established
     * 
     * API-Since: 17.4
     */
    @Generated
    @Selector("coordinatorWithError:")
    @Nullable
    public static native BELayerHierarchyHostingTransactionCoordinator coordinatorWithError(
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("coordinatorWithXPCRepresentation:error:")
    @Nullable
    public static native BELayerHierarchyHostingTransactionCoordinator coordinatorWithXPCRepresentationError(
            @Nullable VoidPtr xpcRepresentation, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * API-Since: 17.4
     */
    @Generated
    @Selector("createXPCRepresentation")
    @NotNull
    public native VoidPtr createXPCRepresentation();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BELayerHierarchyHostingTransactionCoordinator init();

    @Generated
    @Selector("initWithCoder:")
    public native BELayerHierarchyHostingTransactionCoordinator initWithCoder(@NotNull NSCoder coder);

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

    @Generated
    @Owned
    @Selector("new")
    public static native BELayerHierarchyHostingTransactionCoordinator new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Decodes a coordinator form a `mach_port_t` send right and its accompanying metadata.
     * - This method takes ownership of the port right (even if it returns an error).
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("coordinatorWithPort:data:error:")
    @Nullable
    public static native BELayerHierarchyHostingTransactionCoordinator coordinatorWithPortDataError(int port,
            @NotNull NSData data, @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Encodes the coordinator into a `mach_port_t` send right and its accompanying metadata.
     * - The block is responsible for disposing of `copiedPort` - failure to manage its lifecycle will leak the port.
     * Note that some functions (like ``coordinatorWithPort:data:error:``) will assume control of the right for you.
     * - `copiedPort` will be `MACH_PORT_NULL` if the receiver is already invalidated.
     * - The port and data should ultimately be consumed together and _only_ once by
     * ``coordinatorWithPort:data:error:``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("encodeWithBlock:")
    public native void encodeWithBlock(@ObjCBlock(name = "call_encodeWithBlock") @NotNull Block_encodeWithBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_encodeWithBlock {
        @Generated
        void call_encodeWithBlock(int copiedPort, @NotNull NSData data);
    }
}