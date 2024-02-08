package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Cluster Occupancy Sensing
 * Attributes and commands for configuring occupancy sensing, and reporting occupancy status.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterOccupancySensing extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterOccupancySensing(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterOccupancySensing alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterOccupancySensing allocWithZone(VoidPtr zone);

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
    public native MTRClusterOccupancySensing init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterOccupancySensing initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * The queue is currently unused, but may be used in the future for calling completions
     * for command invocations if commands are added to this cluster.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterOccupancySensing initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRClusterOccupancySensing new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeBitmapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupancySensorTypeBitmapWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupancySensorTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOccupancyWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOccupancyWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIROccupiedToUnoccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePIROccupiedToUnoccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePIRUnoccupiedToOccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedThresholdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePIRUnoccupiedToOccupiedThresholdWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIROccupiedToUnoccupiedDelayWithParams on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirOccupiedToUnoccupiedDelayWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributePirOccupiedToUnoccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIRUnoccupiedToOccupiedDelayWithParams on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedDelayWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributePirUnoccupiedToOccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIRUnoccupiedToOccupiedThresholdWithParams on
     * MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedThresholdWithParams:")
    @NotNull
    public native NSDictionary<String, ?> readAttributePirUnoccupiedToOccupiedThresholdWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams(
            @Nullable MTRReadParams params);

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIROccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePIROccupiedToUnoccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIROccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePIROccupiedToUnoccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributePIRUnoccupiedToOccupiedThresholdWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributePIRUnoccupiedToOccupiedThresholdWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIROccupiedToUnoccupiedDelayWithValue on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePirOccupiedToUnoccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIROccupiedToUnoccupiedDelayWithValue on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePirOccupiedToUnoccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedDelayWithValue on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributePirUnoccupiedToOccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedDelayWithValue on MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributePirUnoccupiedToOccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedThresholdWithValue on
     * MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributePirUnoccupiedToOccupiedThresholdWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedThresholdWithValue on
     * MTRClusterOccupancySensing
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributePirUnoccupiedToOccupiedThresholdWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:expectedValueInterval:params:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}