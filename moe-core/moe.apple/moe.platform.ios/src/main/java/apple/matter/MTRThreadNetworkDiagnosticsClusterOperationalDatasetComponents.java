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
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("activeTimestampPresent")
    @NotNull
    public native NSNumber activeTimestampPresent();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents allocWithZone(VoidPtr zone);

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
     * API-Since: 16.1
     */
    @Generated
    @Selector("channelMaskPresent")
    @NotNull
    public native NSNumber channelMaskPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("channelPresent")
    @NotNull
    public native NSNumber channelPresent();

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

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("delayPresent")
    @NotNull
    public native NSNumber delayPresent();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("extendedPanIdPresent")
    @NotNull
    public native NSNumber extendedPanIdPresent();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents init();

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
     */
    @Generated
    @Selector("masterKeyPresent")
    @NotNull
    public native NSNumber masterKeyPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("meshLocalPrefixPresent")
    @NotNull
    public native NSNumber meshLocalPrefixPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("networkNamePresent")
    @NotNull
    public native NSNumber networkNamePresent();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("panIdPresent")
    @NotNull
    public native NSNumber panIdPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("pendingTimestampPresent")
    @NotNull
    public native NSNumber pendingTimestampPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("pskcPresent")
    @NotNull
    public native NSNumber pskcPresent();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("securityPolicyPresent")
    @NotNull
    public native NSNumber securityPolicyPresent();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setActiveTimestampPresent:")
    public native void setActiveTimestampPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setChannelMaskPresent:")
    public native void setChannelMaskPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setChannelPresent:")
    public native void setChannelPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setDelayPresent:")
    public native void setDelayPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setExtendedPanIdPresent:")
    public native void setExtendedPanIdPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setMasterKeyPresent:")
    public native void setMasterKeyPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setMeshLocalPrefixPresent:")
    public native void setMeshLocalPrefixPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setNetworkNamePresent:")
    public native void setNetworkNamePresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setPanIdPresent:")
    public native void setPanIdPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setPendingTimestampPresent:")
    public native void setPendingTimestampPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setPskcPresent:")
    public native void setPskcPresent(@NotNull NSNumber value);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("setSecurityPolicyPresent:")
    public native void setSecurityPolicyPresent(@NotNull NSNumber value);

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