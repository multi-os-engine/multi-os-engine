package apple.avrouting;

import apple.NSObject;
import apple.avrouting.protocol.AVCustomRoutingControllerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * AVCustomRoutingController
 * 
 * When a user selects / deselects a 3rd party device in the route picker, this class delegates the activation /
 * deactivation of that device to the client of this class via AVCustomRoutingEvents.
 * 
 * This class also informs the client which routes have been previously authorized, allowing them to reconnect if
 * appropriate.
 * 
 * API-Since: 16.0
 */
@Generated
@Library("AVRouting")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class AVCustomRoutingController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected AVCustomRoutingController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native AVCustomRoutingController alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native AVCustomRoutingController allocWithZone(VoidPtr zone);

    /**
     * [@property] authorizedRoutes
     * 
     * The list of authorized routes. Once a route has been activated, it remains authorized for a certain amount of
     * time even if the connection to the route temporarily goes down.
     * The app may reactivate any one of these routes if they deem it appropriate, but must inform the system by calling
     * -setActive:forRoute:.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("authorizedRoutes")
    public native NSArray<? extends AVCustomDeviceRoute> authorizedRoutes();

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
     * [@property] customActionItems
     * 
     * An array of custom action items to be added in the picker.
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @Selector("customActionItems")
    public native NSArray<? extends AVCustomRoutingActionItem> customActionItems();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native AVCustomRoutingControllerDelegate delegate();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native AVCustomRoutingController init();

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
     * invalidateAuthorization
     * 
     * Calling this method revokes the app's authorization to connect to a route. The route will only become authorized
     * again if the user selects it via the route picker.
     * 
     * @param route
     *              The route for which to invalidate authorization.
     */
    @Generated
    @Selector("invalidateAuthorizationForRoute:")
    public native void invalidateAuthorizationForRoute(@NotNull AVCustomDeviceRoute route);

    /**
     * isRouteActive:
     * 
     * Returns whether or not the given route is active.
     * 
     * @param route
     *              The route for which to check active status.
     */
    @Generated
    @Selector("isRouteActive:")
    public native boolean isRouteActive(@NotNull AVCustomDeviceRoute route);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * [@property] knownRouteIPs
     * 
     * An array of route IPs known to be on the local network.
     * 
     * API-Since: 16.1
     */
    @NotNull
    @Generated
    @Selector("knownRouteIPs")
    public native NSArray<? extends AVCustomRoutingPartialIP> knownRouteIPs();

    @Generated
    @Owned
    @Selector("new")
    public static native AVCustomRoutingController new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * setActive:forRoute:
     * 
     * Set this to NO if the connection to the route temporarily drops, and set it to YES once the connection is
     * reestablished.
     * 
     * @param active
     *               Whether or not the route is active.
     * @param route
     *               The route to set as active or inactive.
     */
    @Generated
    @Selector("setActive:forRoute:")
    public native void setActiveForRoute(boolean active, @NotNull AVCustomDeviceRoute route);

    /**
     * [@property] customActionItems
     * 
     * An array of custom action items to be added in the picker.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCustomActionItems:")
    public native void setCustomActionItems(@NotNull NSArray<? extends AVCustomRoutingActionItem> value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) AVCustomRoutingControllerDelegate value);

    /**
     * [@property] delegate
     * 
     * The receiver's delegate.
     * 
     * API-Since: 16.0
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) AVCustomRoutingControllerDelegate value) {
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
     * [@property] knownRouteIPs
     * 
     * An array of route IPs known to be on the local network.
     * 
     * API-Since: 16.1
     */
    @Generated
    @Selector("setKnownRouteIPs:")
    public native void setKnownRouteIPs(@NotNull NSArray<? extends AVCustomRoutingPartialIP> value);

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