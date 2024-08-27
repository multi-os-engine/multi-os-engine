package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
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
import org.moe.natj.general.ann.Runtime;
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
public class MTROperationalCredentialsClusterFabricDescriptorStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTROperationalCredentialsClusterFabricDescriptorStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTROperationalCredentialsClusterFabricDescriptorStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTROperationalCredentialsClusterFabricDescriptorStruct allocWithZone(VoidPtr zone);

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("fabricID")
    @NotNull
    public native NSNumber fabricID();

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use fabricID
     */
    @Generated
    @Deprecated
    @Selector("fabricId")
    @NotNull
    public native NSNumber fabricId();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("fabricIndex")
    @NotNull
    public native NSNumber fabricIndex();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTROperationalCredentialsClusterFabricDescriptorStruct init();

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("label")
    @NotNull
    public native String label();

    @Generated
    @Owned
    @Selector("new")
    public static native MTROperationalCredentialsClusterFabricDescriptorStruct new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("nodeID")
    @NotNull
    public native NSNumber nodeID();

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nodeID
     */
    @Generated
    @Deprecated
    @Selector("nodeId")
    @NotNull
    public native NSNumber nodeId();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("rootPublicKey")
    @NotNull
    public native NSData rootPublicKey();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setFabricID:")
    public native void setFabricID(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use fabricID
     */
    @Generated
    @Deprecated
    @Selector("setFabricId:")
    public native void setFabricId(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setFabricIndex:")
    public native void setFabricIndex(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setLabel:")
    public native void setLabel(@NotNull String value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setNodeID:")
    public native void setNodeID(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use nodeID
     */
    @Generated
    @Deprecated
    @Selector("setNodeId:")
    public native void setNodeId(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setRootPublicKey:")
    public native void setRootPublicKey(@NotNull NSData value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setVendorID:")
    public native void setVendorID(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("setVendorId:")
    public native void setVendorId(@NotNull NSNumber value);

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("vendorID")
    @NotNull
    public native NSNumber vendorID();

    /**
     * API-Since: 16.4
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use vendorID
     */
    @Generated
    @Deprecated
    @Selector("vendorId")
    @NotNull
    public native NSNumber vendorId();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}