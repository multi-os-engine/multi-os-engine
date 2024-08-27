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

package apple.mapkit;

import apple.NSObject;
import apple.contacts.CNPostalAddress;
import apple.corelocation.CLLocation;
import apple.corelocation.CLPlacemark;
import apple.corelocation.struct.CLLocationCoordinate2D;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.mapkit.protocol.MKAnnotation;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MKPlacemark extends CLPlacemark implements MKAnnotation {
    static {
        NatJ.register();
    }

    @Generated
    protected MKPlacemark(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MKPlacemark alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MKPlacemark allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MKPlacemark new_objc();

    @Generated
    @Selector("placemarkWithLocation:name:postalAddress:")
    public static native MKPlacemark placemarkWithLocationNamePostalAddress(@NotNull CLLocation location,
            @Nullable String name, @Nullable CNPostalAddress postalAddress);

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

    @Generated
    @Selector("coordinate")
    @ByValue
    public native CLLocationCoordinate2D coordinate();

    /**
     * To create an MKPlacemark from a CLPlacemark, call [MKPlacemark initWithPlacemark:] passing the CLPlacemark
     * instance that is returned by CLGeocoder.
     * See CLGeocoder.h and CLPlacemark.h in CoreLocation for more information.
     */
    @Nullable
    @Generated
    @Selector("countryCode")
    public native String countryCode();

    @Generated
    @Selector("init")
    public native MKPlacemark init();

    @Generated
    @Selector("initWithCoder:")
    public native MKPlacemark initWithCoder(@NotNull NSCoder coder);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithCoordinate:")
    public native MKPlacemark initWithCoordinate(@ByValue CLLocationCoordinate2D coordinate);

    /**
     * An address dictionary is a dictionary in the same form as returned by
     * ABRecordCopyValue(person, kABPersonAddressProperty).
     */
    @Generated
    @Selector("initWithCoordinate:addressDictionary:")
    public native MKPlacemark initWithCoordinateAddressDictionary(@ByValue CLLocationCoordinate2D coordinate,
            @Nullable NSDictionary<String, ?> addressDictionary);

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("initWithCoordinate:postalAddress:")
    public native MKPlacemark initWithCoordinatePostalAddress(@ByValue CLLocationCoordinate2D coordinate,
            @NotNull CNPostalAddress postalAddress);

    @Generated
    @Selector("initWithPlacemark:")
    public native MKPlacemark initWithPlacemark(@NotNull CLPlacemark placemark);

    @Generated
    @IsOptional
    @Selector("setCoordinate:")
    public native void setCoordinate(@ByValue CLLocationCoordinate2D newCoordinate);

    @Nullable
    @Generated
    @IsOptional
    @Selector("subtitle")
    public native String subtitle();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Nullable
    @Generated
    @IsOptional
    @Selector("title")
    public native String title();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
