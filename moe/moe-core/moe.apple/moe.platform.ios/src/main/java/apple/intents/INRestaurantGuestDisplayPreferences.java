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

package apple.intents;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class INRestaurantGuestDisplayPreferences extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected INRestaurantGuestDisplayPreferences(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native INRestaurantGuestDisplayPreferences alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native INRestaurantGuestDisplayPreferences allocWithZone(VoidPtr zone);

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
    public static native INRestaurantGuestDisplayPreferences new_objc();

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
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * indicates whether the email address field should be user editable, defaults to YES
     */
    @Generated
    @Selector("emailAddressEditable")
    public native boolean emailAddressEditable();

    /**
     * indicates whether email address input field should be displayed, defaults to YES
     */
    @Generated
    @Selector("emailAddressFieldShouldBeDisplayed")
    public native boolean emailAddressFieldShouldBeDisplayed();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("init")
    public native INRestaurantGuestDisplayPreferences init();

    @Generated
    @Selector("initWithCoder:")
    public native INRestaurantGuestDisplayPreferences initWithCoder(NSCoder coder);

    /**
     * indicates whether the name field should be user editable, defaults to YES
     */
    @Generated
    @Selector("nameEditable")
    public native boolean nameEditable();

    /**
     * indicates whether first name field is marked optional, defaults to NO
     */
    @Generated
    @Selector("nameFieldFirstNameOptional")
    public native boolean nameFieldFirstNameOptional();

    /**
     * indicates whether last name field is marked optional, defaults to NO
     */
    @Generated
    @Selector("nameFieldLastNameOptional")
    public native boolean nameFieldLastNameOptional();

    /**
     * indicates whether name input field should be displayed, defaults to YES
     */
    @Generated
    @Selector("nameFieldShouldBeDisplayed")
    public native boolean nameFieldShouldBeDisplayed();

    /**
     * indicates whether the phone number field should be user editable, defaults to YES
     */
    @Generated
    @Selector("phoneNumberEditable")
    public native boolean phoneNumberEditable();

    /**
     * indicates whether phone number field should be displayed, defaults to YES
     */
    @Generated
    @Selector("phoneNumberFieldShouldBeDisplayed")
    public native boolean phoneNumberFieldShouldBeDisplayed();

    /**
     * indicates whether the email address field should be user editable, defaults to YES
     */
    @Generated
    @Selector("setEmailAddressEditable:")
    public native void setEmailAddressEditable(boolean value);

    /**
     * indicates whether email address input field should be displayed, defaults to YES
     */
    @Generated
    @Selector("setEmailAddressFieldShouldBeDisplayed:")
    public native void setEmailAddressFieldShouldBeDisplayed(boolean value);

    /**
     * indicates whether the name field should be user editable, defaults to YES
     */
    @Generated
    @Selector("setNameEditable:")
    public native void setNameEditable(boolean value);

    /**
     * indicates whether first name field is marked optional, defaults to NO
     */
    @Generated
    @Selector("setNameFieldFirstNameOptional:")
    public native void setNameFieldFirstNameOptional(boolean value);

    /**
     * indicates whether last name field is marked optional, defaults to NO
     */
    @Generated
    @Selector("setNameFieldLastNameOptional:")
    public native void setNameFieldLastNameOptional(boolean value);

    /**
     * indicates whether name input field should be displayed, defaults to YES
     */
    @Generated
    @Selector("setNameFieldShouldBeDisplayed:")
    public native void setNameFieldShouldBeDisplayed(boolean value);

    /**
     * indicates whether the phone number field should be user editable, defaults to YES
     */
    @Generated
    @Selector("setPhoneNumberEditable:")
    public native void setPhoneNumberEditable(boolean value);

    /**
     * indicates whether phone number field should be displayed, defaults to YES
     */
    @Generated
    @Selector("setPhoneNumberFieldShouldBeDisplayed:")
    public native void setPhoneNumberFieldShouldBeDisplayed(boolean value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }
}
