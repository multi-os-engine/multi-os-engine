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
 * API-Since: 16.1
 * Deprecated-Since: 17.0
 * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRThreadNetworkDiagnosticsClusterRouteTable extends MTRThreadNetworkDiagnosticsClusterRouteTableStruct {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRThreadNetworkDiagnosticsClusterRouteTable(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("age")
    @NotNull
    public native NSNumber age();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRThreadNetworkDiagnosticsClusterRouteTable alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRThreadNetworkDiagnosticsClusterRouteTable allocWithZone(VoidPtr zone);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("allocated")
    @NotNull
    public native NSNumber allocated();

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
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("extAddress")
    @NotNull
    public native NSNumber extAddress();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRThreadNetworkDiagnosticsClusterRouteTable init();

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
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("linkEstablished")
    @NotNull
    public native NSNumber linkEstablished();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("lqiIn")
    @NotNull
    public native NSNumber lqiIn();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("lqiOut")
    @NotNull
    public native NSNumber lqiOut();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRThreadNetworkDiagnosticsClusterRouteTable new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("nextHop")
    @NotNull
    public native NSNumber nextHop();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("pathCost")
    @NotNull
    public native NSNumber pathCost();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("rloc16")
    @NotNull
    public native NSNumber rloc16();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("routerId")
    @NotNull
    public native NSNumber routerId();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setAge:")
    public native void setAge(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setAllocated:")
    public native void setAllocated(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setExtAddress:")
    public native void setExtAddress(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setLinkEstablished:")
    public native void setLinkEstablished(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setLqiIn:")
    public native void setLqiIn(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setLqiOut:")
    public native void setLqiOut(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setNextHop:")
    public native void setNextHop(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setPathCost:")
    public native void setPathCost(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setRloc16:")
    public native void setRloc16(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 17.0
     * Deprecated-Message: Please use MTRThreadNetworkDiagnosticsClusterRouteTableStruct
     */
    @Generated
    @Deprecated
    @Selector("setRouterId:")
    public native void setRouterId(@NotNull NSNumber value);

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