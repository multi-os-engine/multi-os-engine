package apple.exposurenotification;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDate;
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
 * Info about an exposure.
 */
@Generated
@Library("ExposureNotification")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ENExposureInfo extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ENExposureInfo(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ENExposureInfo alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ENExposureInfo allocWithZone(VoidPtr zone);

    /**
     * Array of durations in seconds at certain radio signal attenuations.
     * Array index 0: Sum of durations for this exposure when attenuation <= X
     * Array index 1: Sum of durations for this exposure when attenuation <= Y
     * Array index 2: Sum of durations for this exposure when attenuation <= Z
     * Array index 3: Sum of durations for this exposure when attenuation >  Z
     * X, Y, Z come from the attenuationDurationThresholds on the configuration object.
     */
    @Generated
    @Selector("attenuationDurations")
    public native NSArray<? extends NSNumber> attenuationDurations();

    /**
     * Duration-weighted average of the attenuations associated with this exposure.
     */
    @Generated
    @Selector("attenuationValue")
    public native byte attenuationValue();

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

    /**
     * Date when the exposure occurred. This may have reduced precision, such as within 1 day of the actual time.
     */
    @Generated
    @Selector("date")
    public native NSDate date();

    /**
     * Number of days since the onset of symptoms. Defaults to ENDaysSinceOnsetOfSymptomsUnknown.
     */
    @Generated
    @Selector("daysSinceOnsetOfSymptoms")
    @NInt
    public native long daysSinceOnsetOfSymptoms();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * How positive diagnosis was reported.
     */
    @Generated
    @Selector("diagnosisReportType")
    public native int diagnosisReportType();

    /**
     * Length of exposure in 5 minute increments with a 30 minute maximum.
     */
    @Generated
    @Selector("duration")
    public native double duration();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ENExposureInfo init();

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

    /**
     * Metadata associated with the exposure.
     */
    @Generated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native ENExposureInfo new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Indicates the total risk calculated for this exposure incident. Capped to ENRiskScore range.
     */
    @Generated
    @Selector("totalRiskScore")
    public native byte totalRiskScore();

    /**
     * Indicates the total risk calculated for this exposure incident. Full range and not capped to ENRiskScore.
     */
    @Generated
    @Selector("totalRiskScoreFullRange")
    public native double totalRiskScoreFullRange();

    /**
     * Indicates the transmission risk associated with the diagnosis key.
     */
    @Generated
    @Selector("transmissionRiskLevel")
    public native byte transmissionRiskLevel();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
