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
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceEnergyManagementClusterSlotStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceEnergyManagementClusterSlotStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceEnergyManagementClusterSlotStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceEnergyManagementClusterSlotStruct allocWithZone(VoidPtr zone);

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

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("costs")
    @Nullable
    public native NSArray<?> costs();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("defaultDuration")
    @NotNull
    public native NSNumber defaultDuration();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("elapsedSlotTime")
    @NotNull
    public native NSNumber elapsedSlotTime();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDeviceEnergyManagementClusterSlotStruct init();

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("manufacturerESAState")
    @Nullable
    public native NSNumber manufacturerESAState();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("maxDuration")
    @NotNull
    public native NSNumber maxDuration();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("maxDurationAdjustment")
    @Nullable
    public native NSNumber maxDurationAdjustment();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("maxPauseDuration")
    @Nullable
    public native NSNumber maxPauseDuration();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("maxPower")
    @Nullable
    public native NSNumber maxPower();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("maxPowerAdjustment")
    @Nullable
    public native NSNumber maxPowerAdjustment();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("minDuration")
    @NotNull
    public native NSNumber minDuration();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("minDurationAdjustment")
    @Nullable
    public native NSNumber minDurationAdjustment();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("minPauseDuration")
    @Nullable
    public native NSNumber minPauseDuration();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("minPower")
    @Nullable
    public native NSNumber minPower();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("minPowerAdjustment")
    @Nullable
    public native NSNumber minPowerAdjustment();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRDeviceEnergyManagementClusterSlotStruct new_objc();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("nominalEnergy")
    @Nullable
    public native NSNumber nominalEnergy();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("nominalPower")
    @Nullable
    public native NSNumber nominalPower();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("remainingSlotTime")
    @NotNull
    public native NSNumber remainingSlotTime();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setCosts:")
    public native void setCosts(@Nullable NSArray<?> value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setDefaultDuration:")
    public native void setDefaultDuration(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setElapsedSlotTime:")
    public native void setElapsedSlotTime(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setManufacturerESAState:")
    public native void setManufacturerESAState(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMaxDuration:")
    public native void setMaxDuration(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMaxDurationAdjustment:")
    public native void setMaxDurationAdjustment(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMaxPauseDuration:")
    public native void setMaxPauseDuration(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMaxPower:")
    public native void setMaxPower(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMaxPowerAdjustment:")
    public native void setMaxPowerAdjustment(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMinDuration:")
    public native void setMinDuration(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMinDurationAdjustment:")
    public native void setMinDurationAdjustment(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMinPauseDuration:")
    public native void setMinPauseDuration(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMinPower:")
    public native void setMinPower(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setMinPowerAdjustment:")
    public native void setMinPowerAdjustment(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setNominalEnergy:")
    public native void setNominalEnergy(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setNominalPower:")
    public native void setNominalPower(@Nullable NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setRemainingSlotTime:")
    public native void setRemainingSlotTime(@NotNull NSNumber value);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("setSlotIsPausable:")
    public native void setSlotIsPausable(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("slotIsPausable")
    @Nullable
    public native NSNumber slotIsPausable();

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