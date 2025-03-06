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
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRElectricalPowerMeasurementClusterMeasurementRangeStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRElectricalPowerMeasurementClusterMeasurementRangeStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRElectricalPowerMeasurementClusterMeasurementRangeStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRElectricalPowerMeasurementClusterMeasurementRangeStruct allocWithZone(VoidPtr zone);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("endSystime")
    @Nullable
    public native NSNumber endSystime();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("endTimestamp")
    @Nullable
    public native NSNumber endTimestamp();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRElectricalPowerMeasurementClusterMeasurementRangeStruct init();

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("max")
    @NotNull
    public native NSNumber max();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("maxSystime")
    @Nullable
    public native NSNumber maxSystime();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("maxTimestamp")
    @Nullable
    public native NSNumber maxTimestamp();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("measurementType")
    @NotNull
    public native NSNumber measurementType();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("min")
    @NotNull
    public native NSNumber min();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("minSystime")
    @Nullable
    public native NSNumber minSystime();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("minTimestamp")
    @Nullable
    public native NSNumber minTimestamp();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRElectricalPowerMeasurementClusterMeasurementRangeStruct new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setEndSystime:")
    public native void setEndSystime(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setEndTimestamp:")
    public native void setEndTimestamp(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMax:")
    public native void setMax(@NotNull NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMaxSystime:")
    public native void setMaxSystime(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMaxTimestamp:")
    public native void setMaxTimestamp(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMeasurementType:")
    public native void setMeasurementType(@NotNull NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMin:")
    public native void setMin(@NotNull NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMinSystime:")
    public native void setMinSystime(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMinTimestamp:")
    public native void setMinTimestamp(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setStartSystime:")
    public native void setStartSystime(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setStartTimestamp:")
    public native void setStartTimestamp(@Nullable NSNumber value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("startSystime")
    @Nullable
    public native NSNumber startSystime();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("startTimestamp")
    @Nullable
    public native NSNumber startTimestamp();

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