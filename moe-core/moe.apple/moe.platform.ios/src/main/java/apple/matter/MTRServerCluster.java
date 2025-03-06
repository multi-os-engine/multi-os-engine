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
 * A representation of a server cluster implemented by an MTRDeviceController.
 * 
 * MTRServerCluster's API can be accessed from any thread.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRServerCluster extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRServerCluster(Pointer peer) {
        super(peer);
    }

    /**
     * The list of entities that are allowed to access this cluster instance. This
     * list is in addition to any endpoint-wide access grants that exist.
     * 
     * Defaults to empty list, which means no additional access grants.
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
     * Add an access grant to the cluster. If the same access grant is added
     * multiple times, it will be treated as if it were added once (and removing
     * it once will remove it).
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addAccessGrant:")
    public native void addAccessGrant(@NotNull MTRAccessGrant accessGrant);

    /**
     * Add an attribute to the cluster. This can only be done before the endpoint
     * the cluster is a part of has been added to a controller.
     * 
     * The attribute must not have the same attribute ID as another attribute in
     * this cluster.
     * 
     * The attribute must not already be added to another cluster.
     * 
     * If this cluster is the Descriptor cluster (id MTRClusterIDTypeDescriptorID),
     * it must not define any values for DeviceTypeList, ServerList, ClientList, PartsList;
     * those values will be determined automatically.
     * 
     * For all clusters, the global AttributeList, AcceptedCommandList,
     * GeneratedCommandList attributes will be determined automatically and must not
     * be included in the attributes added on the cluster.
     * 
     * For all clusters, the FeatureMap attribute will be assumed to be 0 unless
     * otherwise specified and may be omitted from the attributes added to the cluster.
     * 
     * For all clusters, ClusterRevision will be determined automatically based on
     * this object's clusterRevision property, and must not be explicitly added to
     * the cluster.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("addAttribute:")
    public native boolean addAttribute(@NotNull MTRServerAttribute attribute);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRServerCluster alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRServerCluster allocWithZone(VoidPtr zone);

    /**
     * The list of attributes supported by the cluster.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("attributes")
    @NotNull
    public native NSArray<? extends MTRServerAttribute> attributes();

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("clusterID")
    @NotNull
    public native NSNumber clusterID();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("clusterRevision")
    @NotNull
    public native NSNumber clusterRevision();

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
    public native MTRServerCluster init();

    /**
     * The provided clusterID must not be MTRClusterIDTypeDescriptorID; see
     * newDescriptorCluster.
     * 
     * Otherwise, it must be a valid cluster identifier. That means:
     * 
     * * In the range 0-0x7FFF for standard clusters.
     * * In the range 0xVVVVFC00-0xVVVVFFFE for vendor-specific clusters, where VVVV
     * is the vendor identifier.
     * 
     * The provided revision must be in the range 1-65535.
     * 
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithClusterID:revision:")
    public native MTRServerCluster initWithClusterIDRevision(@NotNull NSNumber clusterID, @NotNull NSNumber revision);

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
    public static native MTRServerCluster new_objc();

    /**
     * Create a cluster description for the descriptor cluster. This will set
     * clusterRevision to the current version implemented by Matter.framework.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Owned
    @Selector("newDescriptorCluster")
    @NotNull
    public static native MTRServerCluster newDescriptorCluster();

    /**
     * Remove an access grant from the cluster.
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