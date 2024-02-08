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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An immutable value object representing a contact.
 * 
 * CNContact is thread safe.
 * 
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

    /**
     * The contact comparator for a given sort order.
     */
    @NotNull
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
    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * Returns a user displayable property name.
     */
    @NotNull
    @Generated
    @Selector("localizedStringForKey:")
    public static native String localizedStringForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNContact new_objc();

    @NotNull
    @Generated
    @Selector("predicateForContactsInContainerWithIdentifier:")
    public static native NSPredicate predicateForContactsInContainerWithIdentifier(@NotNull String containerIdentifier);

    @NotNull
    @Generated
    @Selector("predicateForContactsInGroupWithIdentifier:")
    public static native NSPredicate predicateForContactsInGroupWithIdentifier(@NotNull String groupIdentifier);

    /**
     * To fetch contacts matching a name.
     * 
     * The name can contain any number of words.
     */
    @NotNull
    @Generated
    @Selector("predicateForContactsMatchingName:")
    public static native NSPredicate predicateForContactsMatchingName(@NotNull String name);

    /**
     * To fetch contacts matching contact identifiers.
     */
    @NotNull
    @Generated
    @Selector("predicateForContactsWithIdentifiers:")
    public static native NSPredicate predicateForContactsWithIdentifiers(@NotNull NSArray<String> identifiers);

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
    public native boolean areKeysAvailable(@NotNull NSArray<?> keyDescriptors);

    /**
     * The Gregorian birthday.
     */
    @Nullable
    @Generated
    @Selector("birthday")
    public native NSDateComponents birthday();

    @NotNull
    @Generated
    @Selector("contactRelations")
    public native NSArray<? extends CNLabeledValue<CNContactRelation>> contactRelations();

    @Generated
    @Selector("contactType")
    @NInt
    public native long contactType();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * Other Gregorian dates (anniversaries, etc).
     */
    @NotNull
    @Generated
    @Selector("dates")
    public native NSArray<? extends CNLabeledValue<NSDateComponents>> dates();

    @NotNull
    @Generated
    @Selector("departmentName")
    public native String departmentName();

    @NotNull
    @Generated
    @Selector("emailAddresses")
    public native NSArray<? extends CNLabeledValue<String>> emailAddresses();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("familyName")
    public native String familyName();

    @NotNull
    @Generated
    @Selector("givenName")
    public native String givenName();

    /**
     * The identifier is unique among contacts on the device. It can be saved and used for fetching contacts next
     * application launch.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Nullable
    @Generated
    @Selector("imageData")
    public native NSData imageData();

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("imageDataAvailable")
    public native boolean imageDataAvailable();

    @Generated
    @Selector("init")
    public native CNContact init();

    @Generated
    @Selector("initWithCoder:")
    public native CNContact initWithCoder(@NotNull NSCoder coder);

    @NotNull
    @Generated
    @Selector("instantMessageAddresses")
    public native NSArray<? extends CNLabeledValue<CNInstantMessageAddress>> instantMessageAddresses();

    /**
     * Returns YES if the value for the specified key was fetched.
     */
    @Generated
    @Selector("isKeyAvailable:")
    public native boolean isKeyAvailable(@NotNull String key);

    /**
     * Unification
     * Returns YES if the receiver was fetched as a unified contact and includes the contact having contactIdentifier in
     * its unification
     */
    @Generated
    @Selector("isUnifiedWithContactWithIdentifier:")
    public native boolean isUnifiedWithContactWithIdentifier(@NotNull String contactIdentifier);

    @NotNull
    @Generated
    @Selector("jobTitle")
    public native String jobTitle();

    @NotNull
    @Generated
    @Selector("middleName")
    public native String middleName();

    @NotNull
    @Owned
    @Generated
    @Selector("mutableCopyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object mutableCopyWithZone(@Nullable VoidPtr zone);

    @NotNull
    @Generated
    @Selector("namePrefix")
    public native String namePrefix();

    @NotNull
    @Generated
    @Selector("nameSuffix")
    public native String nameSuffix();

    @NotNull
    @Generated
    @Selector("nickname")
    public native String nickname();

    /**
     * The alternate birthday (Lunisolar).
     */
    @Nullable
    @Generated
    @Selector("nonGregorianBirthday")
    public native NSDateComponents nonGregorianBirthday();

    @NotNull
    @Generated
    @Selector("note")
    public native String note();

    @NotNull
    @Generated
    @Selector("organizationName")
    public native String organizationName();

    @NotNull
    @Generated
    @Selector("phoneNumbers")
    public native NSArray<? extends CNLabeledValue<CNPhoneNumber>> phoneNumbers();

    @NotNull
    @Generated
    @Selector("phoneticFamilyName")
    public native String phoneticFamilyName();

    @NotNull
    @Generated
    @Selector("phoneticGivenName")
    public native String phoneticGivenName();

    @NotNull
    @Generated
    @Selector("phoneticMiddleName")
    public native String phoneticMiddleName();

    /**
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @Selector("phoneticOrganizationName")
    public native String phoneticOrganizationName();

    @NotNull
    @Generated
    @Selector("postalAddresses")
    public native NSArray<? extends CNLabeledValue<CNPostalAddress>> postalAddresses();

    @NotNull
    @Generated
    @Selector("previousFamilyName")
    public native String previousFamilyName();

    @NotNull
    @Generated
    @Selector("socialProfiles")
    public native NSArray<? extends CNLabeledValue<CNSocialProfile>> socialProfiles();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Nullable
    @Generated
    @Selector("thumbnailImageData")
    public native NSData thumbnailImageData();

    @NotNull
    @Generated
    @Selector("urlAddresses")
    public native NSArray<? extends CNLabeledValue<String>> urlAddresses();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_comparatorForNameSortOrder_ret {
        @Generated
        @NInt
        long call_comparatorForNameSortOrder_ret(@NotNull @Mapped(ObjCObjectMapper.class) Object obj1,
                @NotNull @Mapped(ObjCObjectMapper.class) Object obj2);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public static native long itemProviderVisibilityForRepresentationWithTypeIdentifier_static(
            @NotNull String typeIdentifier);

    @Generated
    @IsOptional
    @ProtocolClassMethod("itemProviderVisibilityForRepresentationWithTypeIdentifier_static")
    @NInt
    public long _itemProviderVisibilityForRepresentationWithTypeIdentifier_static(@NotNull String typeIdentifier) {
        return itemProviderVisibilityForRepresentationWithTypeIdentifier_static(typeIdentifier);
    }

    @Generated
    @IsOptional
    @Selector("itemProviderVisibilityForRepresentationWithTypeIdentifier:")
    @NInt
    public native long itemProviderVisibilityForRepresentationWithTypeIdentifier(@NotNull String typeIdentifier);

    @Nullable
    @Generated
    @Selector("loadDataWithTypeIdentifier:forItemProviderCompletionHandler:")
    public native NSProgress loadDataWithTypeIdentifierForItemProviderCompletionHandler(@NotNull String typeIdentifier,
            @NotNull @ObjCBlock(name = "call_loadDataWithTypeIdentifierForItemProviderCompletionHandler") NSItemProviderWriting.Block_loadDataWithTypeIdentifierForItemProviderCompletionHandler completionHandler);

    @Nullable
    @Generated
    @Selector("objectWithItemProviderData:typeIdentifier:error:")
    public static native CNContact objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError);

    @Nullable
    @Generated
    @ProtocolClassMethod("objectWithItemProviderDataTypeIdentifierError")
    public CNContact _objectWithItemProviderDataTypeIdentifierError(@NotNull NSData data,
            @NotNull String typeIdentifier, @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> outError) {
        return objectWithItemProviderDataTypeIdentifierError(data, typeIdentifier, outError);
    }

    @NotNull
    @Generated
    @Selector("readableTypeIdentifiersForItemProvider")
    public static native NSArray<String> readableTypeIdentifiersForItemProvider();

    @NotNull
    @Generated
    @ProtocolClassMethod("readableTypeIdentifiersForItemProvider")
    public NSArray<String> _readableTypeIdentifiersForItemProvider() {
        return readableTypeIdentifiersForItemProvider();
    }

    @NotNull
    @Generated
    @Selector("writableTypeIdentifiersForItemProvider")
    public static native NSArray<String> writableTypeIdentifiersForItemProvider_static();

    @NotNull
    @Generated
    @ProtocolClassMethod("writableTypeIdentifiersForItemProvider_static")
    public NSArray<String> _writableTypeIdentifiersForItemProvider_static() {
        return writableTypeIdentifiersForItemProvider_static();
    }

    @NotNull
    @Generated
    @IsOptional
    @Selector("writableTypeIdentifiersForItemProvider")
    public native NSArray<String> writableTypeIdentifiersForItemProvider();

    /**
     * Fetch contacts matching an email address.
     * 
     * Use this predicate to find the contact(s) which contain the specified
     * email address. The search is not case-sensitive.
     * 
     * @param emailAddress
     *                     The email address to search for. Do not include a scheme (e.g., "mailto:").
     * 
     *                     API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("predicateForContactsMatchingEmailAddress:")
    public static native NSPredicate predicateForContactsMatchingEmailAddress(@NotNull String emailAddress);

    /**
     * Fetch contacts matching a phone number.
     * 
     * If the predicate and contact differ in their use or presence of country
     * codes, a best effort will be made to match results; however, inexact
     * matches are not guaranteed.
     * 
     * @param phoneNumber
     *                    A @c CNPhoneNumber representing the phone number to search for.
     *                    Do not include a scheme (e.g., "tel:").
     * 
     *                    API-Since: 11.0
     */
    @NotNull
    @Generated
    @Selector("predicateForContactsMatchingPhoneNumber:")
    public static native NSPredicate predicateForContactsMatchingPhoneNumber(@NotNull CNPhoneNumber phoneNumber);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
