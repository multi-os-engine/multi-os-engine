package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDate;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * MXMetricPayload
 * 
 * A wrapper class which contains a metric payload and associated properties of that payload.
 * 
 * MXMetricPayload encapsulates currently supported metric types that can be vended by MetricKit. MXMetric subclasses on
 * MXMetricPayload are nullable. If an MXMetric subclass is nil, it indicates that the data is not available for this
 * payload.
 * 
 * MXMetricPayload exposes a convenience function, JSONRepresentation, to convert the contents of the payload to a human
 * readable JSON. This should be used in conjunction with other APIs that accept NSData.
 * 
 * An MXMetricPayload contains data that covers a 24 hour period of application usage. The properties timeStampBegin and
 * timeStampEnd should be used to determine which time range the payload covers.
 * 
 * It is possible for an MXMetricPayload to cover regions of time where an application was updated, and thus had
 * multiple different app version strings. The property latestApplicationVersion will always reflect the latest
 * appVersion at the time the metric payload was created. Use includesMultipleApplicationVersions to determine if an
 * application changed versions during the time range the payload covers.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXMetricPayload extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected MXMetricPayload(Pointer peer) {
        super(peer);
    }

    /**
     * DictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this payload.
     * 
     * @return An NSDictionary object containing the dictionary representation
     * 
     *         API-Since: 13.0
     *         Deprecated-Since: 100000.0
     */
    @NotNull
    @Deprecated
    @Generated
    @Selector("DictionaryRepresentation")
    public native NSDictionary<?, ?> DictionaryRepresentation();

    /**
     * JSONRepresentation
     * 
     * Convenience method to return a JSON representation of this payload.
     * 
     * @return An NSData object containing the JSON representation
     */
    @NotNull
    @Generated
    @Selector("JSONRepresentation")
    public native NSData JSONRepresentation();

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXMetricPayload alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MXMetricPayload allocWithZone(VoidPtr zone);

    /**
     * [@property] applicationLaunchMetrics
     * 
     * An object containing launch metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("applicationLaunchMetrics")
    public native MXAppLaunchMetric applicationLaunchMetrics();

    /**
     * [@property] applicationResponsivenessMetrics
     * 
     * An object containing hang metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("applicationResponsivenessMetrics")
    public native MXAppResponsivenessMetric applicationResponsivenessMetrics();

    /**
     * [@property] applicationTimeMetrics
     * 
     * An object containing running mode metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("applicationTimeMetrics")
    public native MXAppRunTimeMetric applicationTimeMetrics();

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

    /**
     * [@property] cellularConditionMetrics
     * 
     * An object containing a cellular condition metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("cellularConditionMetrics")
    public native MXCellularConditionMetric cellularConditionMetrics();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    /**
     * [@property] cpuMetrics
     * 
     * An object containing CPU metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("cpuMetrics")
    public native MXCPUMetric cpuMetrics();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property] diskIOMetrics
     * 
     * An object containing disk IO metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("diskIOMetrics")
    public native MXDiskIOMetric diskIOMetrics();

    /**
     * [@property] displayMetrics
     * 
     * An object containing display metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("displayMetrics")
    public native MXDisplayMetric displayMetrics();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] gpuMetrics
     * 
     * An object containing GPU metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("gpuMetrics")
    public native MXGPUMetric gpuMetrics();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * [@property] includesMultipleApplicationVersions
     * 
     * A bool which indicates whether or not this payload contains data from multiple application versions.
     * 
     * A value of YES indicates that this payload's data reflects multiple application versions.
     * 
     * A value of NO indicates that this payload only reflects data from the application version specified by
     * latestApplicationVersion.
     */
    @Generated
    @Selector("includesMultipleApplicationVersions")
    public native boolean includesMultipleApplicationVersions();

    @Generated
    @Selector("init")
    public native MXMetricPayload init();

    @Generated
    @Selector("initWithCoder:")
    public native MXMetricPayload initWithCoder(@NotNull NSCoder coder);

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
     * [@property] latestApplicationVersion
     * 
     * An NSString representation of the application version from which this payload was generated.
     * 
     * If the application version was changed during the aggregation of this data, this value will reflect the latest
     * application version at the time of retrieval.
     */
    @NotNull
    @Generated
    @Selector("latestApplicationVersion")
    public native String latestApplicationVersion();

    /**
     * [@property] locationActivityMetrics
     * 
     * An object containing location activity metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("locationActivityMetrics")
    public native MXLocationActivityMetric locationActivityMetrics();

    /**
     * [@property] memoryMetrics
     * 
     * An object containing memory metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("memoryMetrics")
    public native MXMemoryMetric memoryMetrics();

    /**
     * [@property] metaData
     * 
     * An object containing extra metadata for this payload.
     */
    @Nullable
    @Generated
    @Selector("metaData")
    public native MXMetaData metaData();

    /**
     * [@property] networkTransferMetrics
     * 
     * An object containing network transfer metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("networkTransferMetrics")
    public native MXNetworkTransferMetric networkTransferMetrics();

    @Generated
    @Owned
    @Selector("new")
    public static native MXMetricPayload new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property] signpostMetrics
     * 
     * An array containing signpost metrics for this application.
     */
    @Nullable
    @Generated
    @Selector("signpostMetrics")
    public native NSArray<? extends MXSignpostMetric> signpostMetrics();

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
     * [@property] timeStampBegin
     * 
     * An NSDate object that indicates the time which the payload was generated.
     */
    @NotNull
    @Generated
    @Selector("timeStampBegin")
    public native NSDate timeStampBegin();

    /**
     * [@property] timeStampEnd
     * 
     * An NSDate object that indicates the time which the payload was generated.
     */
    @NotNull
    @Generated
    @Selector("timeStampEnd")
    public native NSDate timeStampEnd();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] animationMetrics
     * 
     * An object containing animation metrics for this application.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("animationMetrics")
    public native MXAnimationMetric animationMetrics();

    /**
     * [@property] applicationExitMetrics
     * 
     * An object containing exit metrics for this application.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @Selector("applicationExitMetrics")
    public native MXAppExitMetric applicationExitMetrics();

    /**
     * dictionaryRepresentation
     * 
     * Convenience method to return a NSDictionary representation of this payload.
     * 
     * @return An NSDictionary object containing the dictionary representation
     * 
     *         API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("dictionaryRepresentation")
    public native NSDictionary<?, ?> dictionaryRepresentation();
}
