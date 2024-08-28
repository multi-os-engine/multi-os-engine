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
 * An object that manages the connection from a device to a destination.
 * 
 * A routing controller also informs its ``AVCustomRoutingController/delegate``
 * object about which routes the user previously authorized, so it can
 * reconnect, if appropriate.
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
     * A list of authorized routes.
     * 
     * After a user activates a route, it remains authorized for a certain amount
     * of time even if the connection to the route is temporarily unavailable. Your
     * app may reactivate any one of these routes when appropriate, but it needs to
     * inform the system by calling
     * ``AVCustomRoutingController/setActive:forRoute:``.
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
     * An array of custom action items to add to a route picker.
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
     * A delegate object for a routing controller.
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
     * Revokes an app’s authorization to connect to a route.
     * 
     * The route only becomes authorized again if the user selects it using the
     * route picker.
     * 
     * - Parameters:
     * - route: The route to invalidate authorization for.
     */
    @Generated
    @Selector("invalidateAuthorizationForRoute:")
    public native void invalidateAuthorizationForRoute(@NotNull AVCustomDeviceRoute route);

    /**
     * Returns a Boolean value that indicates whether a route is active.
     * 
     * - Parameters:
     * - route: A route for determining its active state.
     * 
     * - Returns: <doc://com.apple.documentation/documentation/objectivec/yes> if
     * the route is in an active state; otherwise,
     * <doc://com.apple.documentation/documentation/objectivec/no>.
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
     * An array of route addresses known to be on the local network.
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
     * Sets the active state of a route.
     * 
     * Set the value to <doc://com.apple.documentation/documentation/objectivec/no>
     * if the connection to the route becomes unavailable, and set it to
     * <doc://com.apple.documentation/documentation/objectivec/yes> after you
     * reestablish the connection.
     * 
     * - Parameters:
     * - active: A Boolean value that indicates whether the route is active.
     * 
     * - route: A route to change the active state for.
     */
    @Generated
    @Selector("setActive:forRoute:")
    public native void setActiveForRoute(boolean active, @NotNull AVCustomDeviceRoute route);

    /**
     * An array of custom action items to add to a route picker.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setCustomActionItems:")
    public native void setCustomActionItems(@NotNull NSArray<? extends AVCustomRoutingActionItem> value);

    /**
     * A delegate object for a routing controller.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) AVCustomRoutingControllerDelegate value);

    /**
     * A delegate object for a routing controller.
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
     * An array of route addresses known to be on the local network.
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}