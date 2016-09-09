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
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSDictionary;
import ios.foundation.NSTimeZone;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLPlacemark extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected CLPlacemark(Pointer peer) {
		super(peer);
	}

	/**
	 * ISOcountryCode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/ISOcountryCode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ISOcountryCode")
	public native String ISOcountryCode();

	/**
	 * addressDictionary</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/addressDictionary">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addressDictionary")
	public native NSDictionary<?, ?> addressDictionary();

	/**
	 * administrativeArea</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/administrativeArea">iOS Dev Center</a>
	 */
	@Generated
	@Selector("administrativeArea")
	public native String administrativeArea();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CLPlacemark alloc();

	/**
	 * areasOfInterest</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/areasOfInterest">iOS Dev Center</a>
	 */
	@Generated
	@Selector("areasOfInterest")
	public native NSArray<String> areasOfInterest();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * country</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/country">iOS Dev Center</a>
	 */
	@Generated
	@Selector("country")
	public native String country();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native CLPlacemark init();

	@Generated
	@Selector("initWithCoder:")
	public native CLPlacemark initWithCoder(NSCoder aDecoder);

	/**
	 * initWithPlacemark:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instm/CLPlacemark/initWithPlacemark:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPlacemark:")
	public native CLPlacemark initWithPlacemark(CLPlacemark placemark);

	/**
	 * inlandWater</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/inlandWater">iOS Dev Center</a>
	 */
	@Generated
	@Selector("inlandWater")
	public native String inlandWater();

	/**
	 * locality</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/locality">iOS Dev Center</a>
	 */
	@Generated
	@Selector("locality")
	public native String locality();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native CLLocation location();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * ocean</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/ocean">iOS Dev Center</a>
	 */
	@Generated
	@Selector("ocean")
	public native String ocean();

	/**
	 * postalCode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/postalCode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("postalCode")
	public native String postalCode();

	/**
	 * region</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/region">iOS Dev Center</a>
	 */
	@Generated
	@Selector("region")
	public native CLRegion region();

	/**
	 * subAdministrativeArea</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/subAdministrativeArea">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subAdministrativeArea")
	public native String subAdministrativeArea();

	/**
	 * subLocality</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/subLocality">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subLocality")
	public native String subLocality();

	/**
	 * subThoroughfare</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/subThoroughfare">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subThoroughfare")
	public native String subThoroughfare();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * thoroughfare</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/thoroughfare">iOS Dev Center</a>
	 */
	@Generated
	@Selector("thoroughfare")
	public native String thoroughfare();

	/**
	 * timeZone</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLPlacemark_class/index.html#//apple_ref/occ/instp/CLPlacemark/timeZone">iOS Dev Center</a>
	 */
	@Generated
	@Selector("timeZone")
	public native NSTimeZone timeZone();

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
	@Selector("description")
	public static native String description_static();

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
