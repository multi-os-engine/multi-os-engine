package apple.coremotion;

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
 * CMOdometerData
 * 
 * Discussion:
 * An encapsulated odometer update for workouts.
 * 
 * API-Since: 8.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMOdometerData extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CMOdometerData(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMOdometerData alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CMOdometerData allocWithZone(VoidPtr zone);

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

    /**
     * deltaAltitude
     * 
     * Discussion:
     * The change in altitude above mean sea level associated with a location, measured in meters.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("deltaAltitude")
    public native double deltaAltitude();

    /**
     * deltaDistance
     * 
     * Discussion:
     * The change in distance traveled since the last location, measured in meters.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("deltaDistance")
    public native double deltaDistance();

    /**
     * deltaDistanceAccuracy
     * 
     * Discussion:
     * Uncertainty in the estimated delta distance in meters.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("deltaDistanceAccuracy")
    public native double deltaDistanceAccuracy();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * endDate
     * 
     * Discussion:
     * The end time for the odometer data.
     */
    @Generated
    @Selector("endDate")
    @NotNull
    public native NSDate endDate();

    /**
     * gpsDate
     * 
     * Discussion:
     * Timestamp corresponding to the GPS measurement
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("gpsDate")
    @NotNull
    public native NSDate gpsDate();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CMOdometerData init();

    @Generated
    @Selector("initWithCoder:")
    public native CMOdometerData initWithCoder(@NotNull NSCoder coder);

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
     * maxAbsSlope
     * 
     * Discussion:
     * The maximum absolute slope at current location towards all directions measured in degrees.
     * nil if invalid due to low GPS accuracy.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("maxAbsSlope")
    @Nullable
    public native NSNumber maxAbsSlope();

    @Generated
    @Owned
    @Selector("new")
    public static native CMOdometerData new_objc();

    /**
     * originDevice
     * 
     * Discussion:
     * The device from which this measurement comes from
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("originDevice")
    @NInt
    public native long originDevice();

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
     * slope
     * 
     * Discussion:
     * The slope at the current location towards the direction of travel measured in degrees.
     * nil if the measurement is invalid.
     * 
     * API-Since: 15.4
     */
    @Generated
    @Selector("slope")
    @Nullable
    public native NSNumber slope();

    /**
     * speed
     * 
     * Discussion:
     * The instantaneous speed of the device, measured in meters per second.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("speed")
    public native double speed();

    /**
     * speedAccuracy
     * 
     * Discussion:
     * The accuracy of the speed value, measured in meters per second.
     * When this property contains 0 or a positive number, the value in the speed property is plus or minus the
     * specified number of meters per second. When this property contains a negative number, the value in the speed
     * property is invalid.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("speedAccuracy")
    public native double speedAccuracy();

    /**
     * startDate
     * 
     * Discussion:
     * The start time for the odometer data.
     */
    @Generated
    @Selector("startDate")
    @NotNull
    public native NSDate startDate();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * verticalAccuracy
     * 
     * Discussion:
     * The validity of the altitude values, and their estimated uncertainty, measured in meters.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("verticalAccuracy")
    public native double verticalAccuracy();
}