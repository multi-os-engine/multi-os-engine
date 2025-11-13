package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A representation of an endpoint implemented by an MTRDeviceController.
 * 
 * MTRServerEndpoint's API can be accessed from any thread.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRServerEndpoint extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRServerEndpoint(Pointer peer) {
        super(peer);
    }

    /**
     * The list of entities that are allowed to access all clusters on this
     * endpoint. If more fine-grained access control is desired, access grants
     * should be defined on individual clusters.
     * 
     * Defaults to empty list, which means no access granted.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("accessGrants")
    @NotNull
    public native NSArray<? extends MTRAccessGrant> accessGrants();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * Add an access grant to the endpoint. If the same access grant is added
     * multiple times, it will be treated as if it were added once (and removing
     * it once will remove it).
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addAccessGrant:")
    public native void addAccessGrant(@NotNull MTRAccessGrant accessGrant);

    /**
     * Add a server cluster to the endpoint. This can only be done before the
     * endpoint has been added to a controller.
     * 
     * The cluster must not have the same cluster ID as another cluster on
     * this endpoint.
     * 
     * The cluster must not already be added to another endpoint.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addServerCluster:")
    public native boolean addServerCluster(@NotNull MTRServerCluster serverCluster);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRServerEndpoint alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRServerEndpoint allocWithZone(VoidPtr zone);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("deviceTypes")
    @NotNull
    public native NSArray<? extends MTRDeviceTypeRevision> deviceTypes();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("endpointID")
    @NotNull
    public native NSNumber endpointID();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRServerEndpoint init();

    /**
     * The provided endpointID must be in the range 1-65535. The list of device
     * types provided must be nonempty (but may include vendor-specific device
     * types).
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithEndpointID:deviceTypes:")
    public native MTRServerEndpoint initWithEndpointIDDeviceTypes(@NotNull NSNumber endpointID,
            @NotNull NSArray<? extends MTRDeviceTypeRevision> deviceTypes);

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
    public static native MTRServerEndpoint new_objc();

    /**
     * Remove an access grant from the endpoint.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("removeAccessGrant:")
    public native void removeAccessGrant(@NotNull MTRAccessGrant accessGrant);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A list of server clusters supported on this endpoint. The Descriptor cluster
     * does not need to be included unless a TagList attribute is desired on it or
     * it has a non-empty PartsList, or it needs to have cluster-specific access
     * grants. If not included, the Descriptor cluster will be generated
     * automatically.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("serverClusters")
    @NotNull
    public native NSArray<? extends MTRServerCluster> serverClusters();

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