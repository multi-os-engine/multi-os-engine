package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * Class that configures how MTRDevice objects persist their attributes to storage, so as to not
 * overwhelm the underlying storage system.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRDeviceStorageBehaviorConfiguration extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRDeviceStorageBehaviorConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRDeviceStorageBehaviorConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRDeviceStorageBehaviorConfiguration allocWithZone(VoidPtr zone);

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

    /**
     * Create configuration with a default set of values. See description below for details.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("configurationWithDefaultStorageBehavior")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithDefaultStorageBehavior();

    /**
     * Create configuration with specified values. See description below for details, and the list of
     * properties below for valid ranges of these values.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("configurationWithReportToPersistenceDelayTime:reportToPersistenceDelayTimeMax:recentReportTimesMaxCount:timeBetweenReportsTooShortThreshold:timeBetweenReportsTooShortMinThreshold:reportToPersistenceDelayMaxMultiplier:deviceReportingExcessivelyIntervalThreshold:")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithReportToPersistenceDelayTimeReportToPersistenceDelayTimeMaxRecentReportTimesMaxCountTimeBetweenReportsTooShortThresholdTimeBetweenReportsTooShortMinThresholdReportToPersistenceDelayMaxMultiplierDeviceReportingExcessivelyIntervalThreshold(
            double reportToPersistenceDelayTime, double reportToPersistenceDelayTimeMax,
            @NUInt long recentReportTimesMaxCount, double timeBetweenReportsTooShortThreshold,
            double timeBetweenReportsTooShortMinThreshold, double reportToPersistenceDelayMaxMultiplier,
            double deviceReportingExcessivelyIntervalThreshold);

    /**
     * Create configuration that disables storage behavior optimizations.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("configurationWithStorageBehaviorOptimizationDisabled")
    public static native MTRDeviceStorageBehaviorConfiguration configurationWithStorageBehaviorOptimizationDisabled();

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
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("deviceReportingExcessivelyIntervalThreshold")
    public native double deviceReportingExcessivelyIntervalThreshold();

    /**
     * If disableStorageBehaviorOptimization is set to YES, then all the waiting mechanism as described above
     * is disabled.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("disableStorageBehaviorOptimization")
    public native boolean disableStorageBehaviorOptimization();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRDeviceStorageBehaviorConfiguration init();

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
    public static native MTRDeviceStorageBehaviorConfiguration new_objc();

    /**
     * must be >= 2
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("recentReportTimesMaxCount")
    @NUInt
    public native long recentReportTimesMaxCount();

    /**
     * must be > 1
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("reportToPersistenceDelayMaxMultiplier")
    public native double reportToPersistenceDelayMaxMultiplier();

    /**
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("reportToPersistenceDelayTime")
    public native double reportToPersistenceDelayTime();

    /**
     * must be larger than reportToPersistenceDelayTime
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("reportToPersistenceDelayTimeMax")
    public native double reportToPersistenceDelayTimeMax();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setDeviceReportingExcessivelyIntervalThreshold:")
    public native void setDeviceReportingExcessivelyIntervalThreshold(double value);

    /**
     * If disableStorageBehaviorOptimization is set to YES, then all the waiting mechanism as described above
     * is disabled.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setDisableStorageBehaviorOptimization:")
    public native void setDisableStorageBehaviorOptimization(boolean value);

    /**
     * must be >= 2
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setRecentReportTimesMaxCount:")
    public native void setRecentReportTimesMaxCount(@NUInt long value);

    /**
     * must be > 1
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setReportToPersistenceDelayMaxMultiplier:")
    public native void setReportToPersistenceDelayMaxMultiplier(double value);

    /**
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setReportToPersistenceDelayTime:")
    public native void setReportToPersistenceDelayTime(double value);

    /**
     * must be larger than reportToPersistenceDelayTime
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setReportToPersistenceDelayTimeMax:")
    public native void setReportToPersistenceDelayTimeMax(double value);

    /**
     * must be > 0 and smaller than timeBetweenReportsTooShortThreshold
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setTimeBetweenReportsTooShortMinThreshold:")
    public native void setTimeBetweenReportsTooShortMinThreshold(double value);

    /**
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("setTimeBetweenReportsTooShortThreshold:")
    public native void setTimeBetweenReportsTooShortThreshold(double value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * must be > 0 and smaller than timeBetweenReportsTooShortThreshold
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("timeBetweenReportsTooShortMinThreshold")
    public native double timeBetweenReportsTooShortMinThreshold();

    /**
     * must be > 0
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("timeBetweenReportsTooShortThreshold")
    public native double timeBetweenReportsTooShortThreshold();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}