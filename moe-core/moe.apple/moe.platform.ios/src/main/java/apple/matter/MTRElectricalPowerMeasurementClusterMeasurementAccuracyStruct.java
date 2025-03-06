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
public class MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("accuracyRanges")
    @NotNull
    public native NSArray<?> accuracyRanges();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct init();

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
    @Selector("maxMeasuredValue")
    @NotNull
    public native NSNumber maxMeasuredValue();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("measured")
    @NotNull
    public native NSNumber measured();

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
    @Selector("minMeasuredValue")
    @NotNull
    public native NSNumber minMeasuredValue();

    @Generated
    @Owned
    @Selector("new")
    public static native MTRElectricalPowerMeasurementClusterMeasurementAccuracyStruct new_objc();

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
    @Selector("setAccuracyRanges:")
    public native void setAccuracyRanges(@NotNull NSArray<?> value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMaxMeasuredValue:")
    public native void setMaxMeasuredValue(@NotNull NSNumber value);

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("setMeasured:")
    public native void setMeasured(@NotNull NSNumber value);

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
    @Selector("setMinMeasuredValue:")
    public native void setMinMeasuredValue(@NotNull NSNumber value);

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