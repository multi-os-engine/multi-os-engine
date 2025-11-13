package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitInformationStorage;
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
 * MXDiskSpaceUsageMetric
 * 
 * An MXMetric subclass that encapsulates app disk space usage Metrics.
 * 
 * Disk space is a shared resource on-device, and overusage of available disk space can negatively impact the customer
 * experience.
 * 
 * This Metric subclass contains properties that describe disk space usage in various locations in the apps container.
 * Some properties also describe the number of files in common locations, and the types of files.
 * 
 * The data contained in this Metric is computed as a daily snapshot, and should be used as a guide to optimize app disk
 * space usage.
 * 
 * API-Since: 26.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXDiskSpaceUsageMetric extends MXMetric {
    static {
        NatJ.register();
    }

    @Generated
    protected MXDiskSpaceUsageMetric(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXDiskSpaceUsageMetric alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MXDiskSpaceUsageMetric allocWithZone(VoidPtr zone);

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
    public native MXDiskSpaceUsageMetric init();

    @Generated
    @Selector("initWithCoder:")
    public native MXDiskSpaceUsageMetric initWithCoder(@NotNull NSCoder coder);

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
    public static native MXDiskSpaceUsageMetric new_objc();

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

    /**
     * [@property] totalBinaryFileCount
     * 
     * Total count of fixed files owned by the app.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalBinaryFileCount")
    @NInt
    public native long totalBinaryFileCount();

    /**
     * [@property] totalBinaryFileSize
     * 
     * Total fixed size used by the app.
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalBinaryFileSize")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalBinaryFileSize();

    /**
     * [@property] totalCacheFolderSize
     * 
     * Total file size contained within the apps cache folder.
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalCacheFolderSize")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalCacheFolderSize();

    /**
     * [@property] totalCloneSize
     * 
     * Total clone size used by the app.
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalCloneSize")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalCloneSize();

    /**
     * [@property] totalDataFileCount
     * 
     * Total count of data files owned by the app.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalDataFileCount")
    @NInt
    public native long totalDataFileCount();

    /**
     * [@property] totalDataFileSize
     * 
     * Total data file size used by the app.
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalDataFileSize")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalDataFileSize();

    /**
     * [@property] totalDiskSpaceCapacity
     * 
     * Total disk space capacity of the device
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalDiskSpaceCapacity")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalDiskSpaceCapacity();

    /**
     * [@property] totalDiskSpaceUsedSize
     * 
     * Total disk space used by the app.
     * 
     * Dimensioned as NSUnitInformationStorage, base unit is bytes.
     * 
     * API-Since: 26.0
     */
    @Generated
    @Selector("totalDiskSpaceUsedSize")
    @NotNull
    public native NSMeasurement<NSUnitInformationStorage> totalDiskSpaceUsedSize();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}