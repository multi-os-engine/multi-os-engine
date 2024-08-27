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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * ===========================================================================================================================
 * 
 * Summary of exposure detection.
 * 
 * API-Since: 12.5
 */
@Generated
@Library("ExposureNotification")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ENExposureDetectionSummary extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected ENExposureDetectionSummary(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ENExposureDetectionSummary alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ENExposureDetectionSummary allocWithZone(VoidPtr zone);

    /**
     * Array of durations in seconds at certain radio signal attenuations.
     * Array index 0: Sum of durations for all exposures when attenuation <= X
     * Array index 1: Sum of durations for all exposures when attenuation <= Y
     * Array index 2: Sum of durations for all exposures when attenuation <= Z
     * Array index 3: Sum of durations for all exposures when attenuation > Z
     * X, Y, Z come from the attenuationDurationThresholds on the configuration object.
     */
    @NotNull
    @Generated
    @Selector("attenuationDurations")
    public native NSArray<? extends NSNumber> attenuationDurations();

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

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * Summary of each day containing an exposure.
     * 
     * API-Since: 12.5
     */
    @NotNull
    @Generated
    @Selector("daySummaries")
    public native NSArray<? extends ENExposureDaySummary> daySummaries();

    /**
     * Number of days since the most recent exposure. 0 = today, 1 = yesterday, etc. Only valid if matchedKeyCount > 0.
     */
    @Generated
    @Selector("daysSinceLastExposure")
    @NInt
    public native long daysSinceLastExposure();

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
    public native ENExposureDetectionSummary init();

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

    /**
     * Number of diagnosis keys that matched.
     */
    @Generated
    @Selector("matchedKeyCount")
    public native long matchedKeyCount();

    /**
     * Highest risk score of all exposure incidents.
     */
    @Generated
    @Selector("maximumRiskScore")
    public native byte maximumRiskScore();

    /**
     * Highest risk score of all exposure incidents.
     */
    @Generated
    @Selector("maximumRiskScoreFullRange")
    public native double maximumRiskScoreFullRange();

    /**
     * Metadata associated with the summary.
     */
    @Nullable
    @Generated
    @Selector("metadata")
    public native NSDictionary<?, ?> metadata();

    @Generated
    @Owned
    @Selector("new")
    public static native ENExposureDetectionSummary new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Sum of risk scores for all exposures. Summed using the full range risk scores before capping to ENRiskScore.
     */
    @Generated
    @Selector("riskScoreSumFullRange")
    public native double riskScoreSumFullRange();

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
