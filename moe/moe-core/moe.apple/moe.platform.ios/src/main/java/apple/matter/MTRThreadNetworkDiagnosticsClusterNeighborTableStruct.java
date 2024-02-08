package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
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
 * API-Since: 17.0
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRThreadNetworkDiagnosticsClusterNeighborTableStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRThreadNetworkDiagnosticsClusterNeighborTableStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("age")
    @NotNull
    public native NSNumber age();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRThreadNetworkDiagnosticsClusterNeighborTableStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRThreadNetworkDiagnosticsClusterNeighborTableStruct allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("averageRssi")
    @Nullable
    public native NSNumber averageRssi();

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
     * API-Since: 17.0
     */
    @Generated
    @Selector("extAddress")
    @NotNull
    public native NSNumber extAddress();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("frameErrorRate")
    @NotNull
    public native NSNumber frameErrorRate();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("fullNetworkData")
    @NotNull
    public native NSNumber fullNetworkData();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("fullThreadDevice")
    @NotNull
    public native NSNumber fullThreadDevice();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRThreadNetworkDiagnosticsClusterNeighborTableStruct init();

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
     * API-Since: 17.0
     */
    @Generated
    @Selector("isChild")
    @NotNull
    public native NSNumber isChild();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("lastRssi")
    @Nullable
    public native NSNumber lastRssi();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("linkFrameCounter")
    @NotNull
    public native NSNumber linkFrameCounter();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("lqi")
    @NotNull
    public native NSNumber lqi();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("messageErrorRate")
    @NotNull
    public native NSNumber messageErrorRate();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("mleFrameCounter")
    @NotNull
    public native NSNumber mleFrameCounter();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRThreadNetworkDiagnosticsClusterNeighborTableStruct new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("rloc16")
    @NotNull
    public native NSNumber rloc16();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("rxOnWhenIdle")
    @NotNull
    public native NSNumber rxOnWhenIdle();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setAge:")
    public native void setAge(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setAverageRssi:")
    public native void setAverageRssi(@Nullable NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setExtAddress:")
    public native void setExtAddress(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setFrameErrorRate:")
    public native void setFrameErrorRate(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setFullNetworkData:")
    public native void setFullNetworkData(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setFullThreadDevice:")
    public native void setFullThreadDevice(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setIsChild:")
    public native void setIsChild(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLastRssi:")
    public native void setLastRssi(@Nullable NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLinkFrameCounter:")
    public native void setLinkFrameCounter(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setLqi:")
    public native void setLqi(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setMessageErrorRate:")
    public native void setMessageErrorRate(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setMleFrameCounter:")
    public native void setMleFrameCounter(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setRloc16:")
    public native void setRloc16(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setRxOnWhenIdle:")
    public native void setRxOnWhenIdle(@NotNull NSNumber value);

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