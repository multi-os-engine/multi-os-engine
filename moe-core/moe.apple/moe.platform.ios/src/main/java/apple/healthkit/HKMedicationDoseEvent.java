package apple.healthkit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * API-Since: 26.0
 */
@Generated
@Library("HealthKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HKMedicationDoseEvent extends HKSample implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected HKMedicationDoseEvent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native HKMedicationDoseEvent alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native HKMedicationDoseEvent allocWithZone(VoidPtr zone);

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
     * The dose quantity the person reports as taken.
     * 
     * For scheduled dose events, the value defaults to the ``HKMedicationDoseEvent/scheduledDoseQuantity-477ge``, when
     * logged from a
     * reminder. For as needed dose events, the value defaults to `1` in the medication tracking experience, but can
     * always be edited by the person logging.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("doseQuantity")
    @Nullable
    public native NSNumber doseQuantity();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native HKMedicationDoseEvent init();

    @Generated
    @Selector("initWithCoder:")
    public native HKMedicationDoseEvent initWithCoder(@NotNull NSCoder coder);

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
     * The log status the system assigns to this dose event.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("logStatus")
    @NInt
    public native long logStatus();

    /**
     * The identifier of the medication concept the system associates with this dose event.
     * 
     * The system uses this identifier to link the dose event back to its ``HKMedicationConcept`` object.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("medicationConceptIdentifier")
    @NotNull
    public native HKHealthConceptIdentifier medicationConceptIdentifier();

    /**
     * The data type that identified the samples that store medication dose event data.
     * 
     * You use this type when creating queries or filtering results by sample type.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("medicationDoseEventType")
    @NotNull
    public native HKMedicationDoseEventType medicationDoseEventType();

    @Generated
    @Owned
    @Selector("new")
    public static native HKMedicationDoseEvent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * The scheduling context for this logged dose event.
     * 
     * The system sets this to ``HKMedicationDoseEvent/ScheduleType/asNeeded`` when the person
     * logs a dose without a schedule and ``HKMedicationDoseEvent/ScheduleType/schedule`` when a person logs a dose
     * from a scheduled medication reminder.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("scheduleType")
    @NInt
    public native long scheduleType();

    /**
     * The date and time the person takes the medication, if scheduled.
     * 
     * The value is always non-null for ``HKMedicationDoseEvent/ScheduleType/schedule`` and always null for
     * ``HKMedicationDoseEvent/ScheduleType/asNeeded``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("scheduledDate")
    @Nullable
    public native NSDate scheduledDate();

    /**
     * The dose quantity a person is expected to take based on their medication schedule.
     * 
     * The value is always non-null for ``HKMedicationDoseEvent/ScheduleType/schedule``, and always null for
     * ``HKMedicationDoseEvent/ScheduleType/asNeeded``.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("scheduledDoseQuantity")
    @Nullable
    public native NSNumber scheduledDoseQuantity();

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

    /**
     * The unit that the system associates with the medication when the person logs the dose.
     * 
     * This ensures that the dose quantity is recorded with the correct measurement unit.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("unit")
    @NotNull
    public native HKUnit unit();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}