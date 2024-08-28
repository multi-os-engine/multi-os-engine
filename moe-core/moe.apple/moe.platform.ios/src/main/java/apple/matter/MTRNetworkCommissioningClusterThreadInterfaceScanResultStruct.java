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
public class MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("channel")
    @NotNull
    public native NSNumber channel();

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
    @Selector("extendedAddress")
    @NotNull
    public native NSData extendedAddress();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("extendedPanId")
    @NotNull
    public native NSNumber extendedPanId();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct init();

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
    @Selector("networkName")
    @NotNull
    public native String networkName();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRNetworkCommissioningClusterThreadInterfaceScanResultStruct new_objc();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("panId")
    @NotNull
    public native NSNumber panId();

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
    @Selector("rssi")
    @NotNull
    public native NSNumber rssi();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setChannel:")
    public native void setChannel(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setExtendedAddress:")
    public native void setExtendedAddress(@NotNull NSData value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setExtendedPanId:")
    public native void setExtendedPanId(@NotNull NSNumber value);

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
    @Selector("setNetworkName:")
    public native void setNetworkName(@NotNull String value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setPanId:")
    public native void setPanId(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setRssi:")
    public native void setRssi(@NotNull NSNumber value);

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("setVersion:")
    public native void setVersion(@NotNull NSNumber value);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    /**
     * API-Since: 17.0
     */
    @Generated
    @Selector("version")
    @NotNull
    public native NSNumber version();
}