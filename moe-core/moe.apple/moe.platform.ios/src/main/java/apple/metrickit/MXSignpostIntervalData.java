package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnit;
import apple.foundation.NSUnitDuration;
import apple.foundation.NSUnitInformationStorage;
import apple.foundation.protocol.NSSecureCoding;
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
 * MXSignpostIntervalData
 * 
 * A class that encapsulates metrics associated with app specific signpost intervals.
 * 
 * These metrics will be collected and aggregated if the associated signposts were emit using MXSignpost or
 * MXSignpostAnimation APIs
 * 
 * To limit on-device overhead, the system will automatically limit the number of signposts (emitted using the MetricKit
 * log handle) processed.
 * 
 * Avoid losing telemetry by limiting usage of signposts (emitted using the MetricKit log handle) to critical sections
 * of code.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXSignpostIntervalData extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXSignpostIntervalData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXSignpostIntervalData alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MXSignpostIntervalData allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] averageMemory
     * 
     * Average value of memory snapshots taken at beginning and end of MXSignpost intervals
     * 
     * This property is null when signposts with the associated signpostName and signpostCategory contain no interval
     * metric data.
     */
    @Nullable
    @Generated
    @Selector("averageMemory")
    public native MXAverage<NSUnitInformationStorage> averageMemory();

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
     * [@property] cumulativeCPUTime
     * 
     * Cumulative CPU time aggregated over the MXSignpost intervals.
     * 
     * This property is null when signposts with the associated signpostName and signpostCategory contain no interval
     * metric data.
     */
    @Nullable
    @Generated
    @Selector("cumulativeCPUTime")
    public native NSMeasurement<NSUnitDuration> cumulativeCPUTime();

    /**
     * [@property] cumulativeLogicalWrites
     * 
     * Cumulative logical writes aggregated over the MXSignpost intervals.
     * 
     * This property is null when signposts with the associated signpostName and signpostCategory contain no interval
     * metric data.
     */
    @Nullable
    @Generated
    @Selector("cumulativeLogicalWrites")
    public native NSMeasurement<NSUnitInformationStorage> cumulativeLogicalWrites();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] histogrammedSignpostDuration
     * 
     * A histogram of signpost intervals durations associated with the given signposts with signpostName and
     * signpostCategory.
     */
    @NotNull
    @Generated
    @Selector("histogrammedSignpostDuration")
    public native MXHistogram<NSUnitDuration> histogrammedSignpostDuration();

    @Generated
    @Selector("init")
    public native MXSignpostIntervalData init();

    @Generated
    @Selector("initWithCoder:")
    public native MXSignpostIntervalData initWithCoder(@NotNull NSCoder coder);

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
    public static native MXSignpostIntervalData new_objc();

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

    /**
     * [@property] cumulativeHitchTimeRatio
     * 
     * Cumulative hitch time ratio aggregated over the MXSignpostAnimation intervals.
     * 
     * This property is null when signposts with the associated signpostName and signpostCategory contain no interval
     * metric data.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @Selector("cumulativeHitchTimeRatio")
    public native NSMeasurement<NSUnit> cumulativeHitchTimeRatio();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
