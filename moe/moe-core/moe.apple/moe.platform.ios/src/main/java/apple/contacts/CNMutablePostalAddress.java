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

package apple.contacts;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * A mutable value object representing a postal address.
 * <p>
 * CNMutablePostalAddress is not thread safe.
 * <p>
 * [@note] To remove properties when saving a mutable postal address, set string properties to empty values.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNMutablePostalAddress extends CNPostalAddress {
    static {
        NatJ.register();
    }

    @Generated
    protected CNMutablePostalAddress(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNMutablePostalAddress alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CNMutablePostalAddress allocWithZone(VoidPtr zone);

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
    @Selector("localizedStringForKey:")
    public static native String localizedStringForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNMutablePostalAddress new_objc();

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
    @Selector("ISOCountryCode")
    public native String ISOCountryCode();

    @Generated
    @Selector("city")
    public native String city();

    @Generated
    @Selector("country")
    public native String country();

    @Generated
    @Selector("init")
    public native CNMutablePostalAddress init();

    @Generated
    @Selector("initWithCoder:")
    public native CNMutablePostalAddress initWithCoder(NSCoder coder);

    @Generated
    @Selector("postalCode")
    public native String postalCode();

    @Generated
    @Selector("setCity:")
    public native void setCity(String value);

    @Generated
    @Selector("setCountry:")
    public native void setCountry(String value);

    @Generated
    @Selector("setISOCountryCode:")
    public native void setISOCountryCode(String value);

    @Generated
    @Selector("setPostalCode:")
    public native void setPostalCode(String value);

    @Generated
    @Selector("setState:")
    public native void setState(String value);

    /**
     * multi-street address is delimited with carriage returns “\n”
     */
    @Generated
    @Selector("setStreet:")
    public native void setStreet(String value);

    @Generated
    @Selector("state")
    public native String state();

    /**
     * multi-street address is delimited with carriage returns “\n”
     */
    @Generated
    @Selector("street")
    public native String street();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("setSubAdministrativeArea:")
    public native void setSubAdministrativeArea(String value);

    @Generated
    @Selector("setSubLocality:")
    public native void setSubLocality(String value);

    @Generated
    @Selector("subAdministrativeArea")
    public native String subAdministrativeArea();

    @Generated
    @Selector("subLocality")
    public native String subLocality();
}
