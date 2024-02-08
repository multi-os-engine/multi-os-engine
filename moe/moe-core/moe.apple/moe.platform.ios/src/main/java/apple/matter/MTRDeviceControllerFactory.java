package apple.matter;

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

/**
 * API-Since: 16.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceControllerFactory extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceControllerFactory(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceControllerFactory alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceControllerFactory allocWithZone(VoidPtr zone);

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
     * Create a MTRDeviceController on an existing fabric. Returns nil on failure.
     * 
     * This method will fail if there is no such fabric or if there is
     * already a controller started for that fabric.
     * 
     * The fabric is identified by the root public key and fabric id in
     * the startupParams.
     * 
     * This method can only be used if the factory was initialized with storage.
     * When using per-controller storage, use createController.
     */
    @Generated
    @Selector("createControllerOnExistingFabric:error:")
    @Nullable
    public native MTRDeviceController createControllerOnExistingFabricError(
            @NotNull MTRDeviceControllerStartupParams startupParams,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Create a MTRDeviceController on a new fabric. Returns nil on failure.
     * 
     * This method will fail if the given fabric already exists.
     * 
     * The fabric is identified by the root public key and fabric id in
     * the startupParams.
     * 
     * This method can only be used if the factory was initialized with storage.
     * When using per-controller storage, use createController.
     */
    @Generated
    @Selector("createControllerOnNewFabric:error:")
    @Nullable
    public native MTRDeviceController createControllerOnNewFabricError(
            @NotNull MTRDeviceControllerStartupParams startupParams,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

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
    public native MTRDeviceControllerFactory init();

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
     * If true, the factory is in a state where it can create controllers:
     * startControllerFactory has been called, but stopControllerFactory has not been called
     * since then.
     */
    @Generated
    @Selector("isRunning")
    public native boolean isRunning();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Returns the list of MTRFabricInfo representing the fabrics the
     * MTRDeviceControllerFactory knows about and the corresponding node identities
     * of the controller factory on those fabrics. Returns nil if the factory is
     * not running or if there is an error reading fabric information.
     * 
     * All entries in this list will have a non-nil rootCertificate.
     */
    @Generated
    @Selector("knownFabrics")
    @Nullable
    public native NSArray<? extends MTRFabricInfo> knownFabrics();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRDeviceControllerFactory new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Return the single MTRDeviceControllerFactory we support existing. It starts off
     * in a "not started" state.
     */
    @Generated
    @Selector("sharedInstance")
    @NotNull
    public static native MTRDeviceControllerFactory sharedInstance();

    /**
     * Start the controller factory. Repeated calls to startControllerFactory
     * without calls to stopControllerFactory in between are NO-OPs. Use the
     * isRunning property to check whether the controller factory needs to be
     * started up.
     * 
     * @param[in] startupParams data needed to start up the controller factory.
     * 
     * @return Whether startup succeded.
     */
    @Generated
    @Selector("startControllerFactory:error:")
    public native boolean startControllerFactoryError(@NotNull MTRDeviceControllerFactoryParams startupParams,
            @ReferenceInfo(type = NSError.class) @Nullable Ptr<NSError> error);

    /**
     * Stop the controller factory. This will shut down any outstanding
     * controllers as part of the factory stopping.
     * 
     * Repeated calls to stopControllerFactory without calls to
     * startControllerFactory in between are NO-OPs.
     */
    @Generated
    @Selector("stopControllerFactory")
    public native void stopControllerFactory();

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