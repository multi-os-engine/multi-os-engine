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
public class MTRGeneralDiagnosticsClusterNetworkInterface extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRGeneralDiagnosticsClusterNetworkInterface(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRGeneralDiagnosticsClusterNetworkInterface alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRGeneralDiagnosticsClusterNetworkInterface allocWithZone(VoidPtr zone);

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
    @Selector("hardwareAddress")
    @NotNull
    public native NSData hardwareAddress();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("iPv4Addresses")
    @NotNull
    public native NSArray<?> iPv4Addresses();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("iPv6Addresses")
    @NotNull
    public native NSArray<?> iPv6Addresses();

    @Generated
    @Selector("init")
    public native MTRGeneralDiagnosticsClusterNetworkInterface init();

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("isOperational")
    @NotNull
    public native NSNumber isOperational();

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
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRGeneralDiagnosticsClusterNetworkInterface new_objc();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("offPremiseServicesReachableIPv4")
    @Nullable
    public native NSNumber offPremiseServicesReachableIPv4();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("offPremiseServicesReachableIPv6")
    @Nullable
    public native NSNumber offPremiseServicesReachableIPv6();

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
    @Selector("setHardwareAddress:")
    public native void setHardwareAddress(@NotNull NSData value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setIPv4Addresses:")
    public native void setIPv4Addresses(@NotNull NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setIPv6Addresses:")
    public native void setIPv6Addresses(@NotNull NSArray<?> value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setIsOperational:")
    public native void setIsOperational(@NotNull NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setName:")
    public native void setName(@NotNull String value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOffPremiseServicesReachableIPv4:")
    public native void setOffPremiseServicesReachableIPv4(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setOffPremiseServicesReachableIPv6:")
    public native void setOffPremiseServicesReachableIPv6(@Nullable NSNumber value);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NotNull NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("type")
    @NotNull
    public native NSNumber type();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}