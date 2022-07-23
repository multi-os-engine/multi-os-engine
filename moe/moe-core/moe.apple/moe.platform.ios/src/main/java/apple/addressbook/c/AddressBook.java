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

package apple.addressbook.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFNumberRef;
import apple.corefoundation.opaque.CFStringRef;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("AddressBook")
@Runtime(CRuntime.class)
public final class AddressBook {
    static {
        NatJ.register();
    }

    @Generated
    private AddressBook() {
    }

    @Generated
    @Deprecated
    @CFunction
    public static native int ABRecordGetRecordID(ConstVoidPtr record);

    @Generated
    @Deprecated
    @CFunction
    public static native int ABRecordGetRecordType(ConstVoidPtr record);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABRecordCopyValue(ConstVoidPtr record, int property);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABRecordSetValue(ConstVoidPtr record, int property, ConstVoidPtr value,
            Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABRecordRemoveValue(ConstVoidPtr record, int property, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABRecordCopyCompositeName(ConstVoidPtr record);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABAddressBookGetAuthorizationStatus();

    /**
     * Call ABAddressBookCreateWithOptions to create an instance of AddressBook. The
     * ABAddressBookRef will initially not have access to contact data. The app must
     * then call ABAddressBookRequestAccessWithCompletion to request this access.
     * The options argument is reserved for future use. Currently it will always be NULL.
     * If access to contact data is already restricted or denied, this will fail returning
     * a NULL ABAddressBookRef with error kABOperationNotPermittedByUserError.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreateWithOptions(CFDictionaryRef options, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreate();

    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRequestAccessWithCompletion(ConstVoidPtr addressBook,
            @ObjCBlock(name = "call_ABAddressBookRequestAccessWithCompletion") Block_ABAddressBookRequestAccessWithCompletion completion);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookSave(ConstVoidPtr addressBook, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookHasUnsavedChanges(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookAddRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookRemoveRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    /**
     * Some labels are special keys representing generic labels. Use this function to obtain
     * a localized string for a label to display to a user.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABAddressBookCopyLocalizedLabel(CFStringRef label);

    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookRegisterExternalChangeCallback") Function_ABAddressBookRegisterExternalChangeCallback callback,
            VoidPtr context);

    /**
     * When unregistering a callback both the callback and the context need to match the ones
     * that were registered.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookUnregisterExternalChangeCallback") Function_ABAddressBookUnregisterExternalChangeCallback callback,
            VoidPtr context);

    /**
     * ABAddressBookRevert() discards all cached properties and any unsaved changes so that
     * records and properties retrieved subsequently will reflect any changes made by external
     * ABAddressBook instances. If records were deleted externally, the corresponding ABRecord
     * instances will return NULL for all properties. If necessary you can identify these
     * deleted records by checking whether the class accessor (eg. ABPersonGetPersonWithRecordID())
     * returns the record.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRevert(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCopyDefaultSource(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetSourceWithRecordID(ConstVoidPtr addressBook, int sourceID);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllSources(ConstVoidPtr addressBook);

    /**
     * ABPersonCreate creates a new person in the default source
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCreate();

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCreateInSource(ConstVoidPtr source);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCopySource(ConstVoidPtr person);

    /**
     * Returns an array of all the linked people, including the person passed in. If the person is not linked, returns
     * an array with the person passed in.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABPersonCopyArrayOfAllLinkedPeople(ConstVoidPtr person);

    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetTypeOfProperty(int property);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABPersonCopyLocalizedPropertyName(int property);

    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetSortOrdering();

    /**
     * Composite Names
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormat();

    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormatForRecord(ConstVoidPtr record);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABPersonCopyCompositeNameDelimiterForRecord(ConstVoidPtr record);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonSetImageData(ConstVoidPtr person, CFDataRef imageData, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCopyImageData(ConstVoidPtr person);

    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCopyImageDataWithFormat(ConstVoidPtr person, int format);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonHasImageData(ConstVoidPtr person);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonRemoveImageData(ConstVoidPtr person, Ptr<CFErrorRef> error);

    /**
     * Sorting
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABPersonComparePeopleByName(ConstVoidPtr person1, ConstVoidPtr person2, int ordering);

    /**
     * Finding people
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABAddressBookGetPersonCount(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetPersonWithRecordID(ConstVoidPtr addressBook, int recordID);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeople(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering(ConstVoidPtr addressBook,
            ConstVoidPtr source, int sortOrdering);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyPeopleWithName(ConstVoidPtr addressBook, CFStringRef name);

    /**
     * VCard
     * Creates an array of people from a vcard representation. Source is optional. The people
     * will be created in the source given as the first argument, or the default source if NULL.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABPersonCreatePeopleInSourceWithVCardRepresentation(ConstVoidPtr source,
            CFDataRef vCardData);

    /**
     * Creates a vCard representation of the people passed in.
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCreateVCardRepresentationWithPeople(CFArrayRef people);

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef ABAddressBookErrorDomain();

    /**
     * string
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABSourceNameProperty();

    /**
     * CFNumberRef of ABSourceType (int)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABSourceTypeProperty();

    /**
     * Generic labels
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABWorkLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABHomeLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABOtherLabel();

    /**
     * First name - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonFirstNameProperty();

    /**
     * Last name - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonLastNameProperty();

    /**
     * Middle name - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonMiddleNameProperty();

    /**
     * Prefix ("Sir" "Duke" "General") - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonPrefixProperty();

    /**
     * Suffix ("Jr." "Sr." "III") - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonSuffixProperty();

    /**
     * Nickname - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonNicknameProperty();

    /**
     * First name Phonetic - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonFirstNamePhoneticProperty();

    /**
     * Last name Phonetic - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonLastNamePhoneticProperty();

    /**
     * Middle name Phonetic - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonMiddleNamePhoneticProperty();

    /**
     * Company name - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonOrganizationProperty();

    /**
     * Department name - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonDepartmentProperty();

    /**
     * Job Title - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonJobTitleProperty();

    /**
     * Email(s) - kABMultiStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonEmailProperty();

    /**
     * Birthday associated with this person - kABDateTimePropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonBirthdayProperty();

    /**
     * Note - kABStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonNoteProperty();

    /**
     * Creation Date (when first saved)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonCreationDateProperty();

    /**
     * Last saved date
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonModificationDateProperty();

    /**
     * Street address - kABMultiDictionaryPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonAddressProperty();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStreetKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCityKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStateKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressZIPKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryCodeKey();

    /**
     * Dates associated with this person - kABMultiDatePropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonDateProperty();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAnniversaryLabel();

    /**
     * Person/Organization - kABIntegerPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonKindProperty();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindPerson();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindOrganization();

    /**
     * Generic phone number - kABMultiStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonPhoneProperty();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMobileLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneIPhoneLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMainLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneHomeFAXLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneWorkFAXLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneOtherFAXLabel();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhonePagerLabel();

    /**
     * Instant Messaging - kABMultiDictionaryPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonInstantMessageProperty();

    /**
     * Service ("Yahoo", "Jabber", etc.)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceYahoo();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceJabber();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceMSN();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceICQ();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceAIM();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceQQ();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGoogleTalk();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceSkype();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceFacebook();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGaduGadu();

    /**
     * Username
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageUsernameKey();

    /**
     * URL - kABMultiStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonURLProperty();

    /**
     * Home Page
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonHomePageLabel();

    /**
     * Names - kABMultiStringPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonRelatedNamesProperty();

    /**
     * Father
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFatherLabel();

    /**
     * Mother
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonMotherLabel();

    /**
     * Parent
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonParentLabel();

    /**
     * Brother
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonBrotherLabel();

    /**
     * Sister
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSisterLabel();

    /**
     * Child
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonChildLabel();

    /**
     * Friend
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFriendLabel();

    /**
     * Spouse
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSpouseLabel();

    /**
     * Partner
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPartnerLabel();

    /**
     * Assistant
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAssistantLabel();

    /**
     * Manager
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonManagerLabel();

    /**
     * kABMultiDictionaryPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonSocialProfileProperty();

    /**
     * string representation of a url for the social profile
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileURLKey();

    /**
     * string representing the name of the service (Twitter, Facebook, LinkedIn, etc.)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceKey();

    /**
     * string representing the user visible name
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUsernameKey();

    /**
     * string representing the service specific identifier (optional)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUserIdentifierKey();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceTwitter();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceSinaWeibo();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceGameCenter();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFacebook();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceMyspace();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceLinkedIn();

    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFlickr();

    /**
     * kABDictionaryPropertyType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonAlternateBirthdayProperty();

    /**
     * string representing the calendar identifier for CFCalendarRef
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayCalendarIdentifierKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayEraKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayYearKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayMonthKey();

    /**
     * CFNumberRef - kCFNumberCharType (aka NSNumber Bool type)
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayIsLeapMonthKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayDayKey();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_ABAddressBookRequestAccessWithCompletion {
        @Generated
        void call_ABAddressBookRequestAccessWithCompletion(boolean granted, CFErrorRef error);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookRegisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr arg0, CFDictionaryRef arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookUnregisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr arg0, CFDictionaryRef arg1, VoidPtr arg2);
    }

    /**
     * ABGroupCreate creates a new group in the default source
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCreate();

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCreateInSource(ConstVoidPtr source);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCopySource(ConstVoidPtr group);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembers(ConstVoidPtr group);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembersWithSortOrdering(ConstVoidPtr group, int sortOrdering);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABGroupAddMember(ConstVoidPtr group, ConstVoidPtr person, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABGroupRemoveMember(ConstVoidPtr group, ConstVoidPtr member, Ptr<CFErrorRef> error);

    /**
     * Finding groups
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetGroupWithRecordID(ConstVoidPtr addressBook, int recordID);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABAddressBookGetGroupCount(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroups(ConstVoidPtr addressBook);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroupsInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    /**
     * Type of the contained values
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABMultiValueGetPropertyType(ConstVoidPtr multiValue);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetCount(ConstVoidPtr multiValue);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCopyValueAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABMultiValueCopyArrayOfAllValues(ConstVoidPtr multiValue);

    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABMultiValueCopyLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetIndexForIdentifier(ConstVoidPtr multiValue, int identifier);

    @Generated
    @Deprecated
    @CFunction
    public static native int ABMultiValueGetIdentifierAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetFirstIndexOfValue(ConstVoidPtr multiValue, ConstVoidPtr value);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutable(int type);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutableCopy(ConstVoidPtr multiValue);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueAddValueAndLabel(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, IntPtr outIdentifier);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueInsertValueAndLabelAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, @NInt long index, IntPtr outIdentifier);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueRemoveValueAndLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueReplaceValueAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            @NInt long index);

    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueReplaceLabelAtIndex(ConstVoidPtr multiValue, CFStringRef label,
            @NInt long index);

    @Deprecated
    @Generated
    @CVariable()
    public static native int kABGroupNameProperty();
}
