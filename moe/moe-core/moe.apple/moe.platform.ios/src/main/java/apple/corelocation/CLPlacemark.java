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
import apple.contacts.CNPostalAddress;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSTimeZone;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
 * CLPlacemark
 * 
 * Discussion:
 * Represents placemark data for a geographic location. Placemark data can be
 * information such as the country, state, city, and street address.
 * 
 * API-Since: 5.0
 */
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLPlacemark alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLPlacemark allocWithZone(VoidPtr zone);

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
    public static native CLPlacemark new_objc();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("placemarkWithLocation:name:postalAddress:")
    public static native CLPlacemark placemarkWithLocationNamePostalAddress(CLLocation location, String name,
            CNPostalAddress postalAddress);

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
     * eg. US
     */
    @Generated
    @Selector("ISOcountryCode")
    public native String ISOcountryCode();

    /**
     * addressDictionary
     * 
     * Discussion:
     * This dictionary can be formatted as an address using ABCreateStringWithAddressDictionary,
     * defined in the AddressBookUI framework.
     * 
     * API-Since: 5.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: Use @properties
     */
    @Deprecated
    @Generated
    @Selector("addressDictionary")
    public native NSDictionary<?, ?> addressDictionary();

    /**
     * state, eg. CA
     */
    @Generated
    @Selector("administrativeArea")
    public native String administrativeArea();

    /**
     * eg. Golden Gate Park
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
     * eg. United States
     */
    @Generated
    @Selector("country")
    public native String country();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native CLPlacemark init();

    @Generated
    @Selector("initWithCoder:")
    public native CLPlacemark initWithCoder(NSCoder coder);

    /**
     * initWithPlacemark:
     * 
     * Discussion:
     * Initialize a newly allocated placemark from another placemark, copying its data.
     */
    @Generated
    @Selector("initWithPlacemark:")
    public native CLPlacemark initWithPlacemark(CLPlacemark placemark);

    /**
     * eg. Lake Tahoe
     */
    @Generated
    @Selector("inlandWater")
    public native String inlandWater();

    /**
     * city, eg. Cupertino
     */
    @Generated
    @Selector("locality")
    public native String locality();

    /**
     * location
     * 
     * Discussion:
     * Returns the geographic location associated with the placemark.
     */
    @Generated
    @Selector("location")
    public native CLLocation location();

    /**
     * eg. Apple Inc.
     */
    @Generated
    @Selector("name")
    public native String name();

    /**
     * eg. Pacific Ocean
     */
    @Generated
    @Selector("ocean")
    public native String ocean();

    /**
     * zip code, eg. 95014
     */
    @Generated
    @Selector("postalCode")
    public native String postalCode();

    /**
     * region
     * 
     * Discussion:
     * Returns the geographic region associated with the placemark.
     */
    @Generated
    @Selector("region")
    public native CLRegion region();

    /**
     * county, eg. Santa Clara
     */
    @Generated
    @Selector("subAdministrativeArea")
    public native String subAdministrativeArea();

    /**
     * neighborhood, common name, eg. Mission District
     */
    @Generated
    @Selector("subLocality")
    public native String subLocality();

    /**
     * eg. 1
     */
    @Generated
    @Selector("subThoroughfare")
    public native String subThoroughfare();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * street name, eg. Infinite Loop
     */
    @Generated
    @Selector("thoroughfare")
    public native String thoroughfare();

    /**
     * timeZone
     * 
     * Discussion:
     * Returns the time zone associated with the placemark.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("timeZone")
    public native NSTimeZone timeZone();

    /**
     * API-Since: 11.0
     */
    @Generated
    @Selector("postalAddress")
    public native CNPostalAddress postalAddress();
}
