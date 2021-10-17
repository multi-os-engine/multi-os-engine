package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMeasurement;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSUnitDuration;
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
 * MXLocationActivityMetric
 * <p>
 * An MXMetric subclass that encapsulates location metrics
 * <p>
 * The metrics contained in this class describe properties of location activity. See MXAppRunTimeMetric for time spent performing location activities.
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXLocationActivityMetric extends MXMetric {
    static {
        NatJ.register();
    }

    @Generated
    protected MXLocationActivityMetric(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXLocationActivityMetric alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MXLocationActivityMetric allocWithZone(VoidPtr zone);

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
     * [@property]      cumulativeBestAccuracyForNavigationTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyBestForNavigation.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeBestAccuracyForNavigationTime")
    public native NSMeasurement<NSUnitDuration> cumulativeBestAccuracyForNavigationTime();

    /**
     * [@property]      cumulativeBestAccuracyTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyBest.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeBestAccuracyTime")
    public native NSMeasurement<NSUnitDuration> cumulativeBestAccuracyTime();

    /**
     * [@property]      cumulativeHundredMetersAccuracyTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyHundredMeters.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeHundredMetersAccuracyTime")
    public native NSMeasurement<NSUnitDuration> cumulativeHundredMetersAccuracyTime();

    /**
     * [@property]      cumulativeKilometerAccuracyTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyKilometer.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeKilometerAccuracyTime")
    public native NSMeasurement<NSUnitDuration> cumulativeKilometerAccuracyTime();

    /**
     * [@property]      cumulativeNearestTenMetersAccuracyTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyNearestTenMeters.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeNearestTenMetersAccuracyTime")
    public native NSMeasurement<NSUnitDuration> cumulativeNearestTenMetersAccuracyTime();

    /**
     * [@property]      cumulativeThreeKilometersAccuracyTime
     * <p>
     * Cumulative time spent acquiring location at kCLLocationAccuracyThreeKilometers.
     * <p>
     * Dimensioned as NSUnitDuration.
     */
    @Generated
    @Selector("cumulativeThreeKilometersAccuracyTime")
    public native NSMeasurement<NSUnitDuration> cumulativeThreeKilometersAccuracyTime();

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
    public native MXLocationActivityMetric init();

    @Generated
    @Selector("initWithCoder:")
    public native MXLocationActivityMetric initWithCoder(NSCoder coder);

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
    @Owned
    @Selector("new")
    public static native MXLocationActivityMetric new_objc();

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
}
