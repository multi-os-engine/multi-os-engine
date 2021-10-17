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
import apple.contacts.protocol.CNKeyDescriptor;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDateComponents;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSPredicate;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A mutable value object representing a contact.
 * <p>
 * CNMutableContact is not thread safe. If this is a mutable copy of CNContact then it will throw CNContactPropertyNotFetchedExceptionName when accessing a property that was not fetched for the CNContact.
 * <p>
 * [@note] To remove properties when saving a mutable contact, set string properties and array properties to empty values. Set other properties to nil.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNMutableContact extends CNContact {
    static {
        NatJ.register();
    }

    @Generated
    protected CNMutableContact(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNMutableContact alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native CNMutableContact allocWithZone(VoidPtr zone);

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
    @Selector("comparatorForNameSortOrder:")
    @ObjCBlock(name = "call_comparatorForNameSortOrder_ret")
    public static native CNContact.Block_comparatorForNameSortOrder_ret comparatorForNameSortOrder(
            @NInt long sortOrder);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("descriptorForAllComparatorKeys")
    @MappedReturn(ObjCObjectMapper.class)
    public static native CNKeyDescriptor descriptorForAllComparatorKeys();

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
    public static native CNMutableContact new_objc();

    @Generated
    @Selector("predicateForContactsInContainerWithIdentifier:")
    public static native NSPredicate predicateForContactsInContainerWithIdentifier(String containerIdentifier);

    @Generated
    @Selector("predicateForContactsInGroupWithIdentifier:")
    public static native NSPredicate predicateForContactsInGroupWithIdentifier(String groupIdentifier);

    @Generated
    @Selector("predicateForContactsMatchingName:")
    public static native NSPredicate predicateForContactsMatchingName(String name);

    @Generated
    @Selector("predicateForContactsWithIdentifiers:")
    public static native NSPredicate predicateForContactsWithIdentifiers(NSArray<String> identifiers);

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
     * The Gregorian birthday.
     * <p>
     * [@description] Only uses day, month and year components. Needs to have at least a day and a month.
     */
    @Generated
    @Selector("birthday")
    public native NSDateComponents birthday();

    @Generated
    @Selector("contactRelations")
    public native NSArray<? extends CNLabeledValue<CNContactRelation>> contactRelations();

    @Generated
    @Selector("contactType")
    @NInt
    public native long contactType();

    /**
     * Other Gregorian dates (anniversaries, etc).
     * <p>
     * [@description] Only uses day, month and year components. Needs to have at least a day and a month.
     */
    @Generated
    @Selector("dates")
    public native NSArray<? extends CNLabeledValue<NSDateComponents>> dates();

    @Generated
    @Selector("departmentName")
    public native String departmentName();

    @Generated
    @Selector("emailAddresses")
    public native NSArray<? extends CNLabeledValue<String>> emailAddresses();

    @Generated
    @Selector("familyName")
    public native String familyName();

    @Generated
    @Selector("givenName")
    public native String givenName();

    @Generated
    @Selector("imageData")
    public native NSData imageData();

    @Generated
    @Selector("init")
    public native CNMutableContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CNMutableContact initWithCoder(NSCoder coder);

    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

    @Generated
    @Selector("jobTitle")
    public native String jobTitle();

    @Generated
    @Selector("middleName")
    public native String middleName();

    @Generated
    @Selector("namePrefix")
    public native String namePrefix();

    @Generated
    @Selector("nameSuffix")
    public native String nameSuffix();

    @Generated
    @Selector("nickname")
    public native String nickname();

    /**
     * The alternate birthday (Lunisolar).
     * <p>
     * [@description] Only uses day, month, year and calendar components. Needs to have at least a day and a month. Calendar must be Chinese, Hebrew or Islamic.
     */
    @Generated
    @Selector("nonGregorianBirthday")
    public native NSDateComponents nonGregorianBirthday();

    @Generated
    @Selector("note")
    public native String note();

    @Generated
    @Selector("organizationName")
    public native String organizationName();

    @Generated
    @Selector("phoneNumbers")
    public native NSArray<? extends CNLabeledValue<CNPhoneNumber>> phoneNumbers();

    @Generated
    @Selector("phoneticFamilyName")
    public native String phoneticFamilyName();

    @Generated
    @Selector("phoneticGivenName")
    public native String phoneticGivenName();

    @Generated
    @Selector("phoneticMiddleName")
    public native String phoneticMiddleName();

    @Generated
    @Selector("phoneticOrganizationName")
    public native String phoneticOrganizationName();

    @Generated
    @Selector("postalAddresses")
    public native NSArray<? extends CNLabeledValue<CNPostalAddress>> postalAddresses();

    @Generated
    @Selector("previousFamilyName")
    public native String previousFamilyName();

    /**
     * The Gregorian birthday.
     * <p>
     * [@description] Only uses day, month and year components. Needs to have at least a day and a month.
     */
    @Generated
    @Selector("setBirthday:")
    public native void setBirthday(NSDateComponents value);

    @Generated
    @Selector("setContactRelations:")
    public native void setContactRelations(NSArray<? extends CNLabeledValue<CNContactRelation>> value);

    @Generated
    @Selector("setContactType:")
    public native void setContactType(@NInt long value);

    /**
     * Other Gregorian dates (anniversaries, etc).
     * <p>
     * [@description] Only uses day, month and year components. Needs to have at least a day and a month.
     */
    @Generated
    @Selector("setDates:")
    public native void setDates(NSArray<? extends CNLabeledValue<NSDateComponents>> value);

    @Generated
    @Selector("setDepartmentName:")
    public native void setDepartmentName(String value);

    @Generated
    @Selector("setEmailAddresses:")
    public native void setEmailAddresses(NSArray<? extends CNLabeledValue<String>> value);

    @Generated
    @Selector("setFamilyName:")
    public native void setFamilyName(String value);

    @Generated
    @Selector("setGivenName:")
    public native void setGivenName(String value);

    @Generated
    @Selector("setImageData:")
    public native void setImageData(NSData value);

    @Generated
    @Selector("setInstantMessageAddresses:")
    public native void setInstantMessageAddresses(NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> value);

    @Generated
    @Selector("setJobTitle:")
    public native void setJobTitle(String value);

    @Generated
    @Selector("setMiddleName:")
    public native void setMiddleName(String value);

    @Generated
    @Selector("setNamePrefix:")
    public native void setNamePrefix(String value);

    @Generated
    @Selector("setNameSuffix:")
    public native void setNameSuffix(String value);

    @Generated
    @Selector("setNickname:")
    public native void setNickname(String value);

    /**
     * The alternate birthday (Lunisolar).
     * <p>
     * [@description] Only uses day, month, year and calendar components. Needs to have at least a day and a month. Calendar must be Chinese, Hebrew or Islamic.
     */
    @Generated
    @Selector("setNonGregorianBirthday:")
    public native void setNonGregorianBirthday(NSDateComponents value);

    @Generated
    @Selector("setNote:")
    public native void setNote(String value);

    @Generated
    @Selector("setOrganizationName:")
    public native void setOrganizationName(String value);

    @Generated
    @Selector("setPhoneNumbers:")
    public native void setPhoneNumbers(NSArray<? extends CNLabeledValue<CNPhoneNumber>> value);

    @Generated
    @Selector("setPhoneticFamilyName:")
    public native void setPhoneticFamilyName(String value);

    @Generated
    @Selector("setPhoneticGivenName:")
    public native void setPhoneticGivenName(String value);

    @Generated
    @Selector("setPhoneticMiddleName:")
    public native void setPhoneticMiddleName(String value);

    @Generated
    @Selector("setPhoneticOrganizationName:")
    public native void setPhoneticOrganizationName(String value);

    @Generated
    @Selector("setPostalAddresses:")
    public native void setPostalAddresses(NSArray<? extends CNLabeledValue<CNPostalAddress>> value);

    @Generated
    @Selector("setPreviousFamilyName:")
    public native void setPreviousFamilyName(String value);

    @Generated
    @Selector("setSocialProfiles:")
    public native void setSocialProfiles(NSArray<? extends CNLabeledValue<CNSocialProfile>> value);

    @Generated
    @Selector("setUrlAddresses:")
    public native void setUrlAddresses(NSArray<? extends CNLabeledValue<String>> value);

    @Generated
    @Selector("socialProfiles")
    public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("urlAddresses")
    public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native CNMutableContact objectWithItemProviderDataTypeIdentifierError(NSData data,
            String typeIdentifier, @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public CNMutableContact _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @Generated
    @Selector("predicateForContactsMatchingEmailAddress:")
    public static native NSPredicate predicateForContactsMatchingEmailAddress(String emailAddress);

    @Generated
    @Selector("predicateForContactsMatchingPhoneNumber:")
    public static native NSPredicate predicateForContactsMatchingPhoneNumber(CNPhoneNumber phoneNumber);
}
