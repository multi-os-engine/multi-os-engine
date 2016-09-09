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

package ios.corelocation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.cloudkit.protocol.CKRecordValue;
import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.foundation.NSCoder;
import ios.foundation.NSDate;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLLocation extends NSObject implements NSCopying, NSSecureCoding,
		CKRecordValue {
	static {
		NatJ.register();
	}

	@Generated
	protected CLLocation(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CLLocation alloc();

	/**
	 * altitude</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/altitude">iOS Dev Center</a>
	 */
	@Generated
	@Selector("altitude")
	public native double altitude();

	/**
	 * coordinate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/coordinate">iOS Dev Center</a>
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
	 * course</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/course">iOS Dev Center</a>
	 */
	@Generated
	@Selector("course")
	public native double course();

	/**
	 * description</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/description">iOS Dev Center</a>
	 */
	@Generated
	@Selector("description")
	public native String description();

	/**
	 * distanceFromLocation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instm/CLLocation/distanceFromLocation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distanceFromLocation:")
	public native double distanceFromLocation(CLLocation location);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * floor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/floor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("floor")
	public native CLFloor floor();

	/**
	 * getDistanceFrom:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instm/CLLocation/getDistanceFrom:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("getDistanceFrom:")
	public native double getDistanceFrom(CLLocation location);

	/**
	 * horizontalAccuracy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/horizontalAccuracy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("horizontalAccuracy")
	public native double horizontalAccuracy();

	@Generated
	@Selector("init")
	public native CLLocation init();

	@Generated
	@Selector("initWithCoder:")
	public native CLLocation initWithCoder(NSCoder aDecoder);

	/**
	 * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instm/CLLocation/initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:course:speed:timestamp:")
	public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyCourseSpeedTimestamp(
			@ByValue CLLocationCoordinate2D coordinate, double altitude,
			double hAccuracy, double vAccuracy, double course, double speed,
			NSDate timestamp);

	/**
	 * initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instm/CLLocation/initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCoordinate:altitude:horizontalAccuracy:verticalAccuracy:timestamp:")
	public native CLLocation initWithCoordinateAltitudeHorizontalAccuracyVerticalAccuracyTimestamp(
			@ByValue CLLocationCoordinate2D coordinate, double altitude,
			double hAccuracy, double vAccuracy, NSDate timestamp);

	/**
	 * initWithLatitude:longitude:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instm/CLLocation/initWithLatitude:longitude:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLatitude:longitude:")
	public native CLLocation initWithLatitudeLongitude(double latitude,
			double longitude);

	/**
	 * speed</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/speed">iOS Dev Center</a>
	 */
	@Generated
	@Selector("speed")
	public native double speed();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * timestamp</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/timestamp">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timestamp")
	public native NSDate timestamp();

	/**
	 * verticalAccuracy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocation_Class/index.html#//apple_ref/occ/instp/CLLocation/verticalAccuracy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("verticalAccuracy")
	public native double verticalAccuracy();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

	@Generated
	@Selector("load")
	public static native void load_objc_static();

	@Generated
	@Owned
	@Selector("new")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object new_objc();

	@Generated
	@Selector("resolveClassMethod:")
	public static native boolean resolveClassMethod(SEL sel);

	@Generated
	@Selector("resolveInstanceMethod:")
	public static native boolean resolveInstanceMethod(SEL sel);

	@Generated
	@Selector("setVersion:")
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
