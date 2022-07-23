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
import apple.foundation.NSProgress;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSItemProviderReading;
import apple.foundation.protocol.NSItemProviderWriting;
import apple.foundation.protocol.NSMutableCopying;
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
 * An immutable value object representing a contact.
 * <p>
 * CNContact is thread safe.
 * <p>
 * If using a CNContact instance where you are not certain of the keys that were fetched, use isKeyAvailable: or
 * areKeysAvailable:. If these return NO you need to refetch the contact by the contact identifier with the keys you
 * want to fetch. Accessing a property that was not fetched will throw CNContactPropertyNotFetchedExceptionName.
 */
@Generated
@Library("Contacts")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNContact extends NSObject implements NSCopying, NSMutableCopying, NSSecureCoding, NSItemProviderReading,
        NSItemProviderWriting {
    static {
        NatJ.register();
    }

    @Generated
    protected CNContact(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNContact alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CNContact allocWithZone(VoidPtr zone);

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
     * The contact comparator for a given sort order.
     */
    @Generated
    @Selector("comparatorForNameSortOrder:")
    @ObjCBlock(name = "call_comparatorForNameSortOrder_ret")
    public static native Block_comparatorForNameSortOrder_ret comparatorForNameSortOrder(@NInt long sortOrder);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Use to fetch all contact keys required for the contact sort comparator.
     */
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

    /**
     * Returns a user displayable property name.
     */
    @Generated
    @Selector("localizedStringForKey:")
    public static native String localizedStringForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNContact new_objc();

    @Generated
    @Selector("predicateForContactsInContainerWithIdentifier:")
    public static native NSPredicate predicateForContactsInContainerWithIdentifier(String containerIdentifier);

    @Generated
    @Selector("predicateForContactsInGroupWithIdentifier:")
    public static native NSPredicate predicateForContactsInGroupWithIdentifier(String groupIdentifier);

    /**
     * To fetch contacts matching a name.
     * <p>
     * The name can contain any number of words.
     */
    @Generated
    @Selector("predicateForContactsMatchingName:")
    public static native NSPredicate predicateForContactsMatchingName(String name);

    /**
     * To fetch contacts matching contact identifiers.
     */
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
     * Returns YES if the values for the keys specified by all the descriptors were fetched.
     */
    @Generated
    @Selector("areKeysAvailable:")
    public native boolean areKeysAvailable(NSArray<?> keyDescriptors);

    /**
     * The Gregorian birthday.
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

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    /**
     * Other Gregorian dates (anniversaries, etc).
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
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder coder);

    @Generated
    @Selector("familyName")
    public native String familyName();

    @Generated
    @Selector("givenName")
    public native String givenName();

    /**
     * The identifier is unique among contacts on the device. It can be saved and used for fetching contacts next
     * application launch.
     */
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("imageData")
    public native NSData imageData();

    @Generated
    @Selector("imageDataAvailable")
    public native boolean imageDataAvailable();

    @Generated
    @Selector("init")
    public native CNContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContact initWithCoder(NSCoder coder);

    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

    /**
     * Returns YES if the value for the specified key was fetched.
     */
    @Generated
    @Selector("isKeyAvailable:")
    public native boolean isKeyAvailable(String key);

    /**
     * Unification
     * Returns YES if the receiver was fetched as a unified contact and includes the contact having contactIdentifier in
     * its unification
     */
    @Generated
    @Selector("isUnifiedWithContactWithIdentifier:")
    public native boolean isUnifiedWithContactWithIdentifier(String contactIdentifier);

    @Generated
    @Selector("jobTitle")
    public native String jobTitle();

    @Generated
    @Selector("middleName")
    public native String middleName();

    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(VoidPtr zone);

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

    @Generated
    @Selector("socialProfiles")
    public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("thumbnailImageData")
    public native NSData thumbnailImageData();

    @Generated
    @Selector("urlAddresses")
    public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_comparatorForNameSortOrder_ret {
        @Generated
        @NInt
        long call_comparatorForNameSortOrder_ret(@Mapped(ObjCObjectMapper.class) Object obj1,
                @Mapped(ObjCObjectMapper.class) Object obj2);
    }

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
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(String typeIdentifier);

    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(String typeIdentifier,
            @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native CNContact objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public CNContact _objectWithItemProviderDataTypeIdentifierError(NSData data, String typeIdentifier,
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
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * Fetch contacts matching an email address.
     * <p>
     * Use this predicate to find the contact(s) which contain the specified
     * email address. The search is not case-sensitive.
     *
     * @param emailAddress The email address to search for. Do not include a scheme (e.g., "mailto:").
     */
    @Generated
    @Selector("predicateForContactsMatchingEmailAddress:")
    public static native NSPredicate predicateForContactsMatchingEmailAddress(String emailAddress);

    /**
     * Fetch contacts matching a phone number.
     * <p>
     * If the predicate and contact differ in their use or presence of country
     * codes, a best effort will be made to match results; however, inexact
     * matches are not guaranteed.
     *
     * @param phoneNumber A @c CNPhoneNumber representing the phone number to search for.
     *                    Do not include a scheme (e.g., "tel:").
     */
    @Generated
    @Selector("predicateForContactsMatchingPhoneNumber:")
    public static native NSPredicate predicateForContactsMatchingPhoneNumber(CNPhoneNumber phoneNumber);
}
