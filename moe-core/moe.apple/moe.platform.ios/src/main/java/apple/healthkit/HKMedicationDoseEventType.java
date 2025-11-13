package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * HKMedicationDoseEventType
 * 
 * Represents a recorded log of a specific medication, represented by HKMedicationDoseEvent samples.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKMedicationDoseEventType extends HKSampleType {
    static {
        NatJ.register();
    }

    @Generated
    protected HKMedicationDoseEventType(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("activitySummaryType")
    @NotNull
    public static native HKActivitySummaryType activitySummaryType();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKMedicationDoseEventType alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKMedicationDoseEventType allocWithZone(VoidPtr zone);

    @Generated
    @Selector("audiogramSampleType")
    @NotNull
    public static native HKAudiogramSampleType audiogramSampleType();

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
    @Selector("categoryTypeForIdentifier:")
    @Nullable
    public static native HKCategoryType categoryTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("characteristicTypeForIdentifier:")
    @Nullable
    public static native HKCharacteristicType characteristicTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("clinicalTypeForIdentifier:")
    @Nullable
    public static native HKClinicalType clinicalTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("correlationTypeForIdentifier:")
    @Nullable
    public static native HKCorrelationType correlationTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("documentTypeForIdentifier:")
    @Nullable
    public static native HKDocumentType documentTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("electrocardiogramType")
    @NotNull
    public static native HKElectrocardiogramType electrocardiogramType();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKMedicationDoseEventType init();

    @Generated
    @Selector("initWithCoder:")
    public native HKMedicationDoseEventType initWithCoder(@NotNull NSCoder coder);

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
    @Selector("medicationDoseEventType")
    @NotNull
    public static native HKMedicationDoseEventType medicationDoseEventType();

    @Generated
    @Owned
    @Selector("new")
    public static native HKMedicationDoseEventType new_objc();

    @Generated
    @Selector("quantityTypeForIdentifier:")
    @Nullable
    public static native HKQuantityType quantityTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("scoredAssessmentTypeForIdentifier:")
    @Nullable
    public static native HKScoredAssessmentType scoredAssessmentTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("seriesTypeForIdentifier:")
    @Nullable
    public static native HKSeriesType seriesTypeForIdentifier(@NotNull String identifier);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("stateOfMindType")
    @NotNull
    public static native HKStateOfMindType stateOfMindType();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("userAnnotatedMedicationType")
    @NotNull
    public static native HKUserAnnotatedMedicationType userAnnotatedMedicationType();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("visionPrescriptionType")
    @NotNull
    public static native HKPrescriptionType visionPrescriptionType();

    @Generated
    @Selector("workoutType")
    @NotNull
    public static native HKWorkoutType workoutType();
}