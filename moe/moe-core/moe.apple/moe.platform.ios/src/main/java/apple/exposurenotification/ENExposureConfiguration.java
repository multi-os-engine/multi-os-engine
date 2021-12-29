package apple.exposurenotification;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * ===========================================================================================================================
 * <p>
 * Configuration parameters for exposure detection.
 * <p>
 * Configuration parameters are used to calculate an exposure duration for each exposure using the following formula.
 * <p>
 * exposureDuration =
 * ( ( immediateDuration * immediateDurationWeight ) +
 * ( nearDuration      * nearDurationWeight ) +
 * ( mediumDuration    * mediumDurationWeight ) +
 * ( otherDuration     * otherDurationWeight ) )
 * * infectiousnessWeight )
 * * reportTypeWeight )
 */
@Generated
@Library("ExposureNotification")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ENExposureConfiguration extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ENExposureConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ENExposureConfiguration alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ENExposureConfiguration allocWithZone(VoidPtr zone);

    /**
     * Thresholds for calculating attenuationDurations. Defaults to [50, 70, 90].
     * <p>
     * Index		|0	|1	|2
     * Variable	|X	|Y	|Z
     */
    @Generated
    @Selector("attenuationDurationThresholds")
    public native NSArray<? extends NSNumber> attenuationDurationThresholds();

    /**
     * ---------------------------------------------------------------------------------------------------------------------------
     * Soon to be deprecated parameters. Use the parameters above instead.
     */
    @Generated
    @Selector("attenuationLevelValues")
    public native NSArray<? extends NSNumber> attenuationLevelValues();

    @Generated
    @Selector("attenuationWeight")
    public native double attenuationWeight();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("daysSinceLastExposureLevelValues")
    public native NSArray<? extends NSNumber> daysSinceLastExposureLevelValues();

    /**
     * Exclude exposures with daysSinceLastExposure > this value. Defaults to 0 (don't filter).
     */
    @Generated
    @Selector("daysSinceLastExposureThreshold")
    @NInt
    public native long daysSinceLastExposureThreshold();

    @Generated
    @Selector("daysSinceLastExposureWeight")
    public native double daysSinceLastExposureWeight();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("durationLevelValues")
    public native NSArray<? extends NSNumber> durationLevelValues();

    @Generated
    @Selector("durationWeight")
    public native double durationWeight();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Weights to apply to durations at each proximity level based on attenuation. Range is 0-250%.
     */
    @Generated
    @Selector("immediateDurationWeight")
    public native double immediateDurationWeight();

    /**
     * Maps daysSinceOnsetOfSymptoms to infectiousness. Must be configured if using V2 scoring.
     * Key is a daysSinceOnsetOfSymptoms: -14 to 14. Value is an ENInfectiousness.
     * Defaults to ENInfectiousnessNone for days not specified.
     * If a value is set to ENInfectiousnessNone, diagnosis keys for it should be ignored.
     */
    @Generated
    @Selector("infectiousnessForDaysSinceOnsetOfSymptoms")
    public native NSDictionary<? extends NSNumber, ? extends NSNumber> infectiousnessForDaysSinceOnsetOfSymptoms();

    @Generated
    @Selector("infectiousnessHighWeight")
    public native double infectiousnessHighWeight();

    /**
     * Weights to apply for infectiousness. Range is 0-250%.
     */
    @Generated
    @Selector("infectiousnessStandardWeight")
    public native double infectiousnessStandardWeight();

    @Generated
    @Selector("init")
    public native ENExposureConfiguration init();

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
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("mediumDurationWeight")
    public native double mediumDurationWeight();

    @Generated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    @Generated
    @Selector("minimumRiskScore")
    public native byte minimumRiskScore();

    /**
     * Minimum risk score. Excludes exposure incidents with scores lower than this. Full range and not capped to ENRiskScore.
     */
    @Generated
    @Selector("minimumRiskScoreFullRange")
    public native double minimumRiskScoreFullRange();

    @Generated
    @Selector("nearDurationWeight")
    public native double nearDurationWeight();

    @Generated
    @Owned
    @Selector("new")
    public static native ENExposureConfiguration new_objc();

    @Generated
    @Selector("otherDurationWeight")
    public native double otherDurationWeight();

    @Generated
    @Selector("reportTypeConfirmedClinicalDiagnosisWeight")
    public native double reportTypeConfirmedClinicalDiagnosisWeight();

    /**
     * Weights to apply for each report type. Range is 0-250%.
     */
    @Generated
    @Selector("reportTypeConfirmedTestWeight")
    public native double reportTypeConfirmedTestWeight();

    /**
     * Maps scenarios when Report Type is not present into one of the available report types.
     * If this is set to ENDiagnosisReportTypeUnknown, the key will be ignored if it does not contain a report type.
     */
    @Generated
    @Selector("reportTypeNoneMap")
    public native int reportTypeNoneMap();

    @Generated
    @Selector("reportTypeRecursiveWeight")
    public native double reportTypeRecursiveWeight();

    @Generated
    @Selector("reportTypeSelfReportedWeight")
    public native double reportTypeSelfReportedWeight();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Thresholds for calculating attenuationDurations. Defaults to [50, 70, 90].
     * <p>
     * Index		|0	|1	|2
     * Variable	|X	|Y	|Z
     */
    @Generated
    @Selector("setAttenuationDurationThresholds:")
    public native void setAttenuationDurationThresholds(NSArray<? extends NSNumber> value);

    /**
     * ---------------------------------------------------------------------------------------------------------------------------
     * Soon to be deprecated parameters. Use the parameters above instead.
     */
    @Generated
    @Selector("setAttenuationLevelValues:")
    public native void setAttenuationLevelValues(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setAttenuationWeight:")
    public native void setAttenuationWeight(double value);

    @Generated
    @Selector("setDaysSinceLastExposureLevelValues:")
    public native void setDaysSinceLastExposureLevelValues(NSArray<? extends NSNumber> value);

    /**
     * Exclude exposures with daysSinceLastExposure > this value. Defaults to 0 (don't filter).
     */
    @Generated
    @Selector("setDaysSinceLastExposureThreshold:")
    public native void setDaysSinceLastExposureThreshold(@NInt long value);

    @Generated
    @Selector("setDaysSinceLastExposureWeight:")
    public native void setDaysSinceLastExposureWeight(double value);

    @Generated
    @Selector("setDurationLevelValues:")
    public native void setDurationLevelValues(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setDurationWeight:")
    public native void setDurationWeight(double value);

    /**
     * Weights to apply to durations at each proximity level based on attenuation. Range is 0-250%.
     */
    @Generated
    @Selector("setImmediateDurationWeight:")
    public native void setImmediateDurationWeight(double value);

    /**
     * Maps daysSinceOnsetOfSymptoms to infectiousness. Must be configured if using V2 scoring.
     * Key is a daysSinceOnsetOfSymptoms: -14 to 14. Value is an ENInfectiousness.
     * Defaults to ENInfectiousnessNone for days not specified.
     * If a value is set to ENInfectiousnessNone, diagnosis keys for it should be ignored.
     */
    @Generated
    @Selector("setInfectiousnessForDaysSinceOnsetOfSymptoms:")
    public native void setInfectiousnessForDaysSinceOnsetOfSymptoms(
            NSDictionary<? extends NSNumber, ? extends NSNumber> value);

    @Generated
    @Selector("setInfectiousnessHighWeight:")
    public native void setInfectiousnessHighWeight(double value);

    /**
     * Weights to apply for infectiousness. Range is 0-250%.
     */
    @Generated
    @Selector("setInfectiousnessStandardWeight:")
    public native void setInfectiousnessStandardWeight(double value);

    @Generated
    @Selector("setMediumDurationWeight:")
    public native void setMediumDurationWeight(double value);

    @Generated
    @Selector("setMetadata:")
    public native void setMetadata(NSDictionary<?, ?> value);

    @Generated
    @Selector("setMinimumRiskScore:")
    public native void setMinimumRiskScore(byte value);

    /**
     * Minimum risk score. Excludes exposure incidents with scores lower than this. Full range and not capped to ENRiskScore.
     */
    @Generated
    @Selector("setMinimumRiskScoreFullRange:")
    public native void setMinimumRiskScoreFullRange(double value);

    @Generated
    @Selector("setNearDurationWeight:")
    public native void setNearDurationWeight(double value);

    @Generated
    @Selector("setOtherDurationWeight:")
    public native void setOtherDurationWeight(double value);

    @Generated
    @Selector("setReportTypeConfirmedClinicalDiagnosisWeight:")
    public native void setReportTypeConfirmedClinicalDiagnosisWeight(double value);

    /**
     * Weights to apply for each report type. Range is 0-250%.
     */
    @Generated
    @Selector("setReportTypeConfirmedTestWeight:")
    public native void setReportTypeConfirmedTestWeight(double value);

    /**
     * Maps scenarios when Report Type is not present into one of the available report types.
     * If this is set to ENDiagnosisReportTypeUnknown, the key will be ignored if it does not contain a report type.
     */
    @Generated
    @Selector("setReportTypeNoneMap:")
    public native void setReportTypeNoneMap(int value);

    @Generated
    @Selector("setReportTypeRecursiveWeight:")
    public native void setReportTypeRecursiveWeight(double value);

    @Generated
    @Selector("setReportTypeSelfReportedWeight:")
    public native void setReportTypeSelfReportedWeight(double value);

    @Generated
    @Selector("setTransmissionRiskLevelValues:")
    public native void setTransmissionRiskLevelValues(NSArray<? extends NSNumber> value);

    @Generated
    @Selector("setTransmissionRiskWeight:")
    public native void setTransmissionRiskWeight(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("transmissionRiskLevelValues")
    public native NSArray<? extends NSNumber> transmissionRiskLevelValues();

    @Generated
    @Selector("transmissionRiskWeight")
    public native double transmissionRiskWeight();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
