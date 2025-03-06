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
public class MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct allocWithZone(VoidPtr zone);

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
    @Selector("fixedMax")
    @Nullable
    public native NSNumber fixedMax();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("fixedMin")
    @Nullable
    public native NSNumber fixedMin();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("fixedTypical")
    @Nullable
    public native NSNumber fixedTypical();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct init();

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
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyRangeStruct new_objc();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("percentMax")
    @Nullable
    public native NSNumber percentMax();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("percentMin")
    @Nullable
    public native NSNumber percentMin();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("percentTypical")
    @Nullable
    public native NSNumber percentTypical();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("rangeMax")
    @NotNull
    public native NSNumber rangeMax();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("rangeMin")
    @NotNull
    public native NSNumber rangeMin();

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
    @Selector("setFixedMax:")
    public native void setFixedMax(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setFixedMin:")
    public native void setFixedMin(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setFixedTypical:")
    public native void setFixedTypical(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setPercentMax:")
    public native void setPercentMax(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setPercentMin:")
    public native void setPercentMin(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setPercentTypical:")
    public native void setPercentTypical(@Nullable NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setRangeMax:")
    public native void setRangeMax(@NotNull NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setRangeMin:")
    public native void setRangeMin(@NotNull NSNumber value);

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