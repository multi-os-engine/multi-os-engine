/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.corelocation;

import apple.NSObject;
import apple.cloudkit.protocol.CKRecordValue;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDate;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * CLLocation
 * <p>
 * Discussion:
 * Represents a geographical coordinate along with accuracy and timestamp information.
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLLocation extends NSObject implements NSCopying, NSSecureCoding, CKRecordValue {
    static {
        NatJ.register();
    }

    @Generated
    protected CLLocation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLLocation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLLocation allocWithZone(VoidPtr zone);

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
    public static native CLLocation new_objc();

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
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * altitude
     * <p>
     * Discussion:
     * Returns the altitude of the location. Can be positive (above sea level) or negative (below sea level).
     */
    @Generated
    @Selector("altitude")
    public native double altitude();

    /**
     * coordinate
     * <p>
     * Discussion:
     * Returns the coordinate of the current location.
     */
    @Generated
    @Selector("coordinate")
    @ByValue
    public native CLLocationCoordinate2D coordinate();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * course
     * <p>
     * Discussion:
     * Returns the course of the location in degrees true North. Negative if course is invalid.
     * <p>
     * Range:
     * 0.0 - 359.9 degrees, 0 being true North
     */
    @Generated
    @Selector("course")
    public native double course();

    /**
     * distanceFromLocation:
     * <p>
     * Discussion:
     * Returns the lateral distance between two locations.
     */
    @Generated
    @Selector("distanceFromLocation:")
    public native double distanceFromLocation(CLLocation location);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    /**
     * floor
     * <p>
     * Discussion:
     * Contains information about the logical floor that you are on
     * in the current building if you are inside a supported venue.
     * This will be nil if the floor is unavailable.
     */
    @Generated
    @Selector("floor")
    public native CLFloor floor();

    /**
     * getDistanceFrom:
     * <p>
     * Discussion:
     * Deprecated. Use -distanceFromLocation: instead.
     */
    @Generated
    @Deprecated
    @Selector("getDistanceFrom:")
    public native double getDistanceFrom(CLLocation location);

    /**
     * horizontalAccuracy
     * <p>
     * Discussion:
     * Returns the horizontal accuracy of the location. Negative if the lateral location is invalid.
     */
    @Generated
    @Selector("horizontalAccuracy")
    public native double horizontalAccuracy();

    @Generated
    @Selector("init")
    public native CLLocation init();

    @Generated
    @Selector("initWithCoder:")
    public native CLLocation initWithCoder(NSCoder coder);

    /**
     * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:
     * <p>
     * Discussion:
     * Initialize with the specified parameters.
     */
    @Generated
    @Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:")
    public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyCourseSpeedTimestamp(
            @ByValue CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy,
            double course, double speed, NSDate timestamp);

    /**
     * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:
     * <p>
     * Discussion:
     * Initialize with the specified parameters.
     */
    @Generated
    @Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:")
    public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyTimestamp(
            @ByValue CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy,
            NSDate timestamp);

    /**
     * initWithLatitude:longitude:
     * <p>
     * Discussion:
     * Initialize with the specified latitude and longitude.
     */
    @Generated
    @Selector("initWithLatitude:longitude:")
    public native CLLocation initWithLatitudeLongitude(double latitude, double longitude);

    /**
     * speed
     * <p>
     * Discussion:
     * Returns the speed of the location in m/s. Negative if speed is invalid.
     */
    @Generated
    @Selector("speed")
    public native double speed();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * timestamp
     * <p>
     * Discussion:
     * Returns the timestamp when this location was determined.
     */
    @Generated
    @Selector("timestamp")
    public native NSDate timestamp();

    /**
     * verticalAccuracy
     * <p>
     * Discussion:
     * Returns the vertical accuracy of the location. Negative if the altitude is invalid.
     */
    @Generated
    @Selector("verticalAccuracy")
    public native double verticalAccuracy();

    /**
     * courseAccuracy
     * <p>
     * Discussion:
     * Returns the course accuracy of the location in degrees. Returns negative if course is invalid.
     */
    @Generated
    @Selector("courseAccuracy")
    public native double courseAccuracy();

    /**
     * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:courseAccuracy:speed:speedAccuracy:timestamp:
     * <p>
     * Discussion:
     * Initialize with the specified parameters.
     */
    @Generated
    @Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:courseAccuracy:speed:speedAccuracy:timestamp:")
    public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyCourseCourseAccuracySpeedSpeedAccuracyTimestamp(
            @ByValue CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy,
            double course, double courseAccuracy, double speed, double speedAccuracy, NSDate timestamp);

    /**
     * speedAccuracy
     * <p>
     * Discussion:
     * Returns the speed accuracy of the location in m/s. Returns -1 if invalid.
     */
    @Generated
    @Selector("speedAccuracy")
    public native double speedAccuracy();

    /**
     * ellipsoidalAltitude
     * <p>
     * Discussion:
     * Returns the ellipsoidal altitude of the location under the WGS 84 reference frame.
     * Can be positive or negative.
     */
    @Generated
    @Selector("ellipsoidalAltitude")
    public native double ellipsoidalAltitude();

    /**
     * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:courseAccuracy:speed:speedAccuracy:timestamp:sourceInfo
     * <p>
     * Discussion:
     * Initialize with the specified parameters.
     */
    @Generated
    @Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:courseAccuracy:speed:speedAccuracy:timestamp:sourceInfo:")
    public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyCourseCourseAccuracySpeedSpeedAccuracyTimestampSourceInfo(
            @ByValue CLLocationCoordinate2D coordinate, double altitude, double hAccuracy, double vAccuracy,
            double course, double courseAccuracy, double speed, double speedAccuracy, NSDate timestamp,
            CLLocationSourceInformation sourceInfo);

    /**
     * sourceInformation
     * <p>
     * Discussion:
     * Contains information about the source of this location.
     */
    @Generated
    @Selector("sourceInformation")
    public native CLLocationSourceInformation sourceInformation();
}
