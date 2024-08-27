package apple.nearbyinteraction;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.nearbyinteraction.protocol.NISessionDelegate;
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
import apple.arkit.ARSession;
import apple.nearbyinteraction.protocol.NIDeviceCapability;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import apple.opaque.dispatch_queue_t;

/**
 * Nearby interaction session.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("NearbyInteraction")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NISession extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NISession(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NISession alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NISession allocWithZone(VoidPtr zone);

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

    /**
     * The nearby interaction configuration currently being used by the session.
     */
    @Nullable
    @Generated
    @Selector("configuration")
    public native NIConfiguration configuration();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * A delegate for receiving NISession updates.
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NISessionDelegate delegate();

    /**
     * The dispatch queue on which the delegate calls are performed.
     * 
     * If not provided or nil, delegate calls will be performed on the main queue.
     */
    @Nullable
    @Generated
    @Selector("delegateQueue")
    public native dispatch_queue_t delegateQueue();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * A unique nearby interaction identifier for this session.
     * 
     * Copy this discoveryToken and share it with a peer device.
     * The discoveryToken is unique to this device and this session.
     */
    @Nullable
    @Generated
    @Selector("discoveryToken")
    public native NIDiscoveryToken discoveryToken();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NISession init();

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
     * Invalidate an ongoing nearby interaction session.
     * 
     * Invalidate sessions you wish to terminate and do not intend to restart. A peer device in a nearby interaction
     * session will receive a callback to -didRemoveNearbyObject:withReason: some time after a call to invalidate (see
     * NINearbyObjectRemovalReason).
     * calling -runWithConfiguration: after invalidation will result in an error.
     */
    @Generated
    @Selector("invalidate")
    public native void invalidate();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    /**
     * Whether or not this device is capable of participating in a nearby interaction session.
     * 
     * API-Since: 14.0
     * Deprecated-Since: 16.0
     */
    @Deprecated
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NISession new_objc();

    /**
     * Pause an ongoing nearby interaction session.
     * 
     * Paused sessions may be restarted by calling -runWithConfiguration:. The same local discoveryToken will be used.
     */
    @Generated
    @Selector("pause")
    public native void pause();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Start a nearby interaction session.
     * 
     * @param configuration Nearby interaction configuration for this session.
     *                      Both devices must call -runWithConfiguration: with a valid configuration identifying the
     *                      other device in order to receive nearby object updates.
     */
    @Generated
    @Selector("runWithConfiguration:")
    public native void runWithConfiguration(@NotNull NIConfiguration configuration);

    /**
     * A delegate for receiving NISession updates.
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NISessionDelegate value);

    /**
     * A delegate for receiving NISession updates.
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NISessionDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * The dispatch queue on which the delegate calls are performed.
     * 
     * If not provided or nil, delegate calls will be performed on the main queue.
     */
    @Generated
    @Selector("setDelegateQueue:")
    public native void setDelegateQueue(@Nullable dispatch_queue_t value);

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

    /**
     * Get the protocol that describes nearby interaction capabilities on this device.
     * 
     * Detailed description on the capability protocol is in NIDeviceCapability.h.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("deviceCapabilities")
    @MappedReturn(ObjCObjectMapper.class)
    public static native NIDeviceCapability deviceCapabilities();

    /**
     * Provide an ARSession object for use with the NISession
     * 
     * If not provided, an ARSession will be created automatically if the cameraAssistanceEnabled property on the
     * configuration is YES
     * 
     * The developer is responsible for running the ARSession if provided.
     * 
     * If the ARConfiguration used to run the session is not compatible with the NISession, the NISession will
     * invalidate with error
     * 
     * If the platform does not support camera assistance or an ARSession is provided without enabling
     * cameraAssistanceEnabled property in the NIConfiguration, the NISession will invalidate with error (see NIError.h)
     * 
     * API-Since: 16.0
     * 
     * @param session The ARSession to use for camera assistance
     */
    @Generated
    @Selector("setARSession:")
    public native void setARSession(@NotNull ARSession session);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
