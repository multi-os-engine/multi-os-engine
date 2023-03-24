package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * HKSeriesType
 * 
 * Represents a type of HKSeriesSample
 * 
 * API-Since: 11.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKSeriesType extends HKSampleType {
    static {
        NatJ.register();
    }

    @Generated
    protected HKSeriesType(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @NotNull
    @Generated
    @Selector("activitySummaryType")
    public static native HKActivitySummaryType activitySummaryType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKSeriesType alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native HKSeriesType allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Nullable
    @Generated
    @Selector("categoryTypeForIdentifier:")
    public static native HKCategoryType categoryTypeForIdentifier(@NotNull String identifier);

    @Nullable
    @Generated
    @Selector("characteristicTypeForIdentifier:")
    public static native HKCharacteristicType characteristicTypeForIdentifier(@NotNull String identifier);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Nullable
    @Generated
    @Selector("correlationTypeForIdentifier:")
    public static native HKCorrelationType correlationTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Nullable
    @Generated
    @Selector("documentTypeForIdentifier:")
    public static native HKDocumentType documentTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKSeriesType init();

    @Generated
    @Selector("initWithCoder:")
    public native HKSeriesType initWithCoder(@NotNull NSCoder coder);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native HKSeriesType new_objc();

    @Nullable
    @Generated
    @Selector("quantityTypeForIdentifier:")
    public static native HKQuantityType quantityTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Nullable
    @Generated
    @Selector("seriesTypeForIdentifier:")
    public static native HKSeriesType seriesTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Selector("workoutRouteType")
    public static native HKSeriesType workoutRouteType();

    @NotNull
    @Generated
    @Selector("workoutType")
    public static native HKWorkoutType workoutType();

    @NotNull
    @Generated
    @Selector("audiogramSampleType")
    public static native HKAudiogramSampleType audiogramSampleType();

    @Nullable
    @Generated
    @Selector("clinicalTypeForIdentifier:")
    public static native HKClinicalType clinicalTypeForIdentifier(@NotNull String identifier);

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("heartbeatSeriesType")
    public static native HKSeriesType heartbeatSeriesType();

    @NotNull
    @Generated
    @Selector("electrocardiogramType")
    public static native HKElectrocardiogramType electrocardiogramType();

    @NotNull
    @Generated
    @Selector("visionPrescriptionType")
    public static native HKPrescriptionType visionPrescriptionType();
}
