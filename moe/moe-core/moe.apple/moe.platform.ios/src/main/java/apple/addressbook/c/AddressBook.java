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

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CN object's identifier
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABRecordGetRecordID(ConstVoidPtr record);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABRecordGetRecordType(ConstVoidPtr record);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CN object's properties
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABRecordCopyValue(ConstVoidPtr record, int property);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CN mutable object's properties
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABRecordSetValue(ConstVoidPtr record, int property, ConstVoidPtr value,
            Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CN mutable object's properties, setting to @, @[], or nil
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABRecordRemoveValue(ConstVoidPtr record, int property, Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFormatter or CN object's name
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABRecordCopyCompositeName(ConstVoidPtr record);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore authorizationStatusForEntityType:]
     */
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
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNContactStore alloc] init]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreateWithOptions(CFDictionaryRef options, Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNContactStore alloc] init]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreate();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore requestAccessForEntityType:completionHandler:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRequestAccessWithCompletion(ConstVoidPtr addressBook,
            @ObjCBlock(name = "call_ABAddressBookRequestAccessWithCompletion") Block_ABAddressBookRequestAccessWithCompletion completion);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore executeSaveRequest:error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookSave(ConstVoidPtr addressBook, Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookHasUnsavedChanges(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSaveRequest
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookAddRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSaveRequest
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABAddressBookRemoveRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    /**
     * Some labels are special keys representing generic labels. Use this function to obtain
     * a localized string for a label to display to a user.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNLabeledValue localizedStringForLabel:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABAddressBookCopyLocalizedLabel(CFStringRef label);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactStoreDidChangeNotification
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookRegisterExternalChangeCallback") Function_ABAddressBookRegisterExternalChangeCallback callback,
            VoidPtr context);

    /**
     * When unregistering a callback both the callback and the context need to match the ones
     * that were registered.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
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
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: refetch CN objects
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void ABAddressBookRevert(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore containersMatchingPredicate:[CNContainer
     * predicateForContainersWithIdentifiers: @[CNContactStore.defaultContainerIdentifier]] error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCopyDefaultSource(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore containersMatchingPredicate:[CNContainer
     * predicateForContainersWithIdentifiers:] error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetSourceWithRecordID(ConstVoidPtr addressBook, int sourceID);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore containersMatchingPredicate:nil error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllSources(ConstVoidPtr addressBook);

    /**
     * ABPersonCreate creates a new person in the default source
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNMutableContact alloc] init]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCreate();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNMutableContact alloc] init] and [CNSaveRequest addContact:toContainerWithIdentifier:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCreateInSource(ConstVoidPtr source);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore containersMatchingPredicate:[CNContainer
     * predicateForContainerOfContactWithIdentifier:] error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABPersonCopySource(ConstVoidPtr person);

    /**
     * Returns an array of all the linked people, including the person passed in. If the person is not linked, returns
     * an array with the person passed in.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = [CNContact predicateForContactsLinkedToContact:]
     * and unifyResults = NO
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABPersonCopyArrayOfAllLinkedPeople(ConstVoidPtr person);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetTypeOfProperty(int property);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContact localizedStringForKey:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABPersonCopyLocalizedPropertyName(int property);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNContactsUserDefaults sharedDefaults] sortOrder]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetSortOrdering();

    /**
     * Composite Names
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormat();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormatForRecord(ConstVoidPtr record);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABPersonCopyCompositeNameDelimiterForRecord(ConstVoidPtr record);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNMutableContact.imageData
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonSetImageData(ConstVoidPtr person, CFDataRef imageData, Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.imageData
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCopyImageData(ConstVoidPtr person);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.imageData or CNContact.thumbnailImageData
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCopyImageDataWithFormat(ConstVoidPtr person, int format);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonHasImageData(ConstVoidPtr person);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNMutableContact.imageData = nil
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABPersonRemoveImageData(ConstVoidPtr person, Ptr<CFErrorRef> error);

    /**
     * Sorting
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContact comparatorForNameSortOrder:]
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABPersonComparePeopleByName(ConstVoidPtr person1, ConstVoidPtr person2, int ordering);

    /**
     * Finding people
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use count of fetch results for CNContactFetchRequest with predicate = nil
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABAddressBookGetPersonCount(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore unifiedContactWithIdentifier:keysToFetch:error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetPersonWithRecordID(ConstVoidPtr addressBook, int recordID);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = nil
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeople(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = [CNContact
     * predicateForContactsInContainerWithIdentifier:] and unifyResults = NO
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = [CNContact
     * predicateForContactsInContainerWithIdentifier:] and unifyResults = NO and sortOrder
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering(ConstVoidPtr addressBook,
            ConstVoidPtr source, int sortOrdering);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore unifiedContactsMatchingPredicate:[CNContact
     * predicateForContactsMatchingName:] keysToFetch: error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyPeopleWithName(ConstVoidPtr addressBook, CFStringRef name);

    /**
     * VCard
     * Creates an array of people from a vcard representation. Source is optional. The people
     * will be created in the source given as the first argument, or the default source if NULL.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactVCardSerialization contactsWithData:error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABPersonCreatePeopleInSourceWithVCardRepresentation(ConstVoidPtr source,
            CFDataRef vCardData);

    /**
     * Creates a vCard representation of the people passed in.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactVCardSerialization dataWithContacts:error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFDataRef ABPersonCreateVCardRepresentationWithPeople(CFArrayRef people);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNErrorDomain
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef ABAddressBookErrorDomain();

    /**
     * string
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContainer.name
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABSourceNameProperty();

    /**
     * CFNumberRef of ABSourceType (int)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContainer.type
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABSourceTypeProperty();

    /**
     * Generic labels
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelWork
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABWorkLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelHome
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABHomeLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelOther
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABOtherLabel();

    /**
     * First name - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.givenName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonFirstNameProperty();

    /**
     * Last name - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.familyName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonLastNameProperty();

    /**
     * Middle name - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.middleName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonMiddleNameProperty();

    /**
     * Prefix ("Sir" "Duke" "General") - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.namePrefix
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonPrefixProperty();

    /**
     * Suffix ("Jr." "Sr." "III") - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.nameSuffix
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonSuffixProperty();

    /**
     * Nickname - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.nickname
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonNicknameProperty();

    /**
     * First name Phonetic - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.phoneticGivenName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonFirstNamePhoneticProperty();

    /**
     * Last name Phonetic - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.phoneticFamilyName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonLastNamePhoneticProperty();

    /**
     * Middle name Phonetic - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.phoneticMiddleName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonMiddleNamePhoneticProperty();

    /**
     * Company name - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.organizationName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonOrganizationProperty();

    /**
     * Department name - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.departmentName
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonDepartmentProperty();

    /**
     * Job Title - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.jobTitle
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonJobTitleProperty();

    /**
     * Email(s) - kABMultiStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.emailAddresses
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonEmailProperty();

    /**
     * Birthday associated with this person - kABDateTimePropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.birthday
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonBirthdayProperty();

    /**
     * Note - kABStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.note
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonNoteProperty();

    /**
     * Creation Date (when first saved)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonCreationDateProperty();

    /**
     * Last saved date
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonModificationDateProperty();

    /**
     * Street address - kABMultiDictionaryPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.postalAddresses
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonAddressProperty();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.street
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStreetKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.city
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCityKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.state
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStateKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.postalCode
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressZIPKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.country
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNPostalAddress.ISOCountryCode
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryCodeKey();

    /**
     * Dates associated with this person - kABMultiDatePropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.dates
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonDateProperty();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelDateAnniversary
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAnniversaryLabel();

    /**
     * Person/Organization - kABIntegerPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.contactType
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonKindProperty();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactTypePerson
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindPerson();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactTypeOrganization
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindOrganization();

    /**
     * Generic phone number - kABMultiStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.phoneNumbers
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonPhoneProperty();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberMobile
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMobileLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberiPhone
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneIPhoneLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberMain
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMainLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberHomeFax
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneHomeFAXLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberWorkFax
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneWorkFAXLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberOtherFax
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneOtherFAXLabel();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelPhoneNumberPager
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhonePagerLabel();

    /**
     * Instant Messaging - kABMultiDictionaryPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.instantMessageAddresses
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonInstantMessageProperty();

    /**
     * Service ("Yahoo", "Jabber", etc.)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageAddress.service
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceYahoo
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceYahoo();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceJabber
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceJabber();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceMSN
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceMSN();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceICQ
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceICQ();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceAIM
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceAIM();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceQQ
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceQQ();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceGoogleTalk
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGoogleTalk();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceSkype
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceSkype();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceFacebook
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceFacebook();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageServiceGaduGadu
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGaduGadu();

    /**
     * Username
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNInstantMessageAddress.username
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageUsernameKey();

    /**
     * URL - kABMultiStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.urlAddresses
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonURLProperty();

    /**
     * Home Page
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelURLAddressHomePage
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonHomePageLabel();

    /**
     * Names - kABMultiStringPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.contactRelations
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonRelatedNamesProperty();

    /**
     * Father
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationFather
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFatherLabel();

    /**
     * Mother
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationMother
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonMotherLabel();

    /**
     * Parent
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationParent
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonParentLabel();

    /**
     * Brother
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationBrother
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonBrotherLabel();

    /**
     * Sister
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationSister
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSisterLabel();

    /**
     * Child
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationChild
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonChildLabel();

    /**
     * Friend
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationFriend
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFriendLabel();

    /**
     * Spouse
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationSpouse
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSpouseLabel();

    /**
     * Partner
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationPartner
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPartnerLabel();

    /**
     * Assistant
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationAssistant
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAssistantLabel();

    /**
     * Manager
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNLabelContactRelationManager
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonManagerLabel();

    /**
     * kABMultiDictionaryPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.socialProfiles
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonSocialProfileProperty();

    /**
     * string representation of a url for the social profile
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfile.urlString
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileURLKey();

    /**
     * string representing the name of the service (Twitter, Facebook, LinkedIn, etc.)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfile.service
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceKey();

    /**
     * string representing the user visible name
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfile.username
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUsernameKey();

    /**
     * string representing the service specific identifier (optional)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfile.userIdentifier
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUserIdentifierKey();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceTwitter
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceTwitter();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceSinaWeibo
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceSinaWeibo();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceGameCenter
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceGameCenter();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceFacebook
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFacebook();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceMySpace
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceMyspace();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceLinkedIn
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceLinkedIn();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNSocialProfileServiceFlickr
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFlickr();

    /**
     * kABDictionaryPropertyType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContact.nonGregorianBirthday
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABPersonAlternateBirthdayProperty();

    /**
     * string representing the calendar identifier for CFCalendarRef
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.calendar
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayCalendarIdentifierKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.era
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayEraKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.year
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayYearKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.month
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayMonthKey();

    /**
     * CFNumberRef - kCFNumberCharType (aka NSNumber Bool type)
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.isLeapMonth
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayIsLeapMonthKey();

    /**
     * CFNumberRef - kCFNumberNSIntegerType
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSDateComponents.day
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
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNMutableGroup alloc] init]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCreate();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[CNMutableGroup alloc] init] and [CNSaveRequest addGroup:toContainerWithIdentifier:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCreateInSource(ConstVoidPtr source);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore containersMatchingPredicate:[CNContainer
     * predicateForContainerOfGroupWithIdentifier:] error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABGroupCopySource(ConstVoidPtr group);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = [CNContact
     * predicateForContactsInGroupWithIdentifier:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembers(ConstVoidPtr group);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNContactFetchRequest with predicate = [CNContact
     * predicateForContactsInGroupWithIdentifier:] and sortOrder
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembersWithSortOrdering(ConstVoidPtr group, int sortOrdering);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNSaveRequest addMember:toGroup:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABGroupAddMember(ConstVoidPtr group, ConstVoidPtr person, Ptr<CFErrorRef> error);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNSaveRequest removeMember:fromGroup:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABGroupRemoveMember(ConstVoidPtr group, ConstVoidPtr member, Ptr<CFErrorRef> error);

    /**
     * Finding groups
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore groupsMatchingPredicate:[CNGroup predicateForGroupsWithIdentifiers:]
     * error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetGroupWithRecordID(ConstVoidPtr addressBook, int recordID);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use count of fetch results for [CNContactStore groupsMatchingPredicate:nil error:]
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABAddressBookGetGroupCount(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore groupsMatchingPredicate:nil error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroups(ConstVoidPtr addressBook);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [CNContactStore groupsMatchingPredicate:[CNGroup
     * predicateForGroupsInContainerWithIdentifier:] error:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroupsInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    /**
     * Type of the contained values
     * 
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABMultiValueGetPropertyType(ConstVoidPtr multiValue);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use NSArray.count with the labeled value property
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetCount(ConstVoidPtr multiValue);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[NSArray objectAtIndex:] value] with the labeled value property
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCopyValueAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSArray enumerateObjectsUsingBlock:] with the labeled value property and collect the
     * values
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFArrayRef ABMultiValueCopyArrayOfAllValues(ConstVoidPtr multiValue);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[NSArray objectAtIndex:] label] with the labeled value property
     */
    @Generated
    @Deprecated
    @CFunction
    public static native CFStringRef ABMultiValueCopyLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSArray indexOfObjectPassingTest:] with the labeled value property and find the
     * identifier
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetIndexForIdentifier(ConstVoidPtr multiValue, int identifier);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[NSArray objectAtIndex:] identifier] with the labeled value property
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABMultiValueGetIdentifierAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSArray indexOfObjectPassingTest:] with the labeled value property and find the value
     */
    @Generated
    @Deprecated
    @CFunction
    @NInt
    public static native long ABMultiValueGetFirstIndexOfValue(ConstVoidPtr multiValue, ConstVoidPtr value);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [[NSMutableArray alloc] init]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutable(int type);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSArray mutableCopy]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutableCopy(ConstVoidPtr multiValue);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSMutableArray addObject:[CNLabeledValue labeledValueWithLabel:value:]]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueAddValueAndLabel(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, IntPtr outIdentifier);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSMutableArray insertObject:[CNLabeledValue labeledValueWithLabel:value:] atIndex:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueInsertValueAndLabelAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, @NInt long index, IntPtr outIdentifier);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSMutableArray removeObjectAtIndex:]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueRemoveValueAndLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSMutableArray replaceObjectAtIndex: withObject:[CNLabeledValue
     * labeledValueBySettingValue:]]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueReplaceValueAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use [NSMutableArray replaceObjectAtIndex: withObject:[CNLabeledValue
     * labeledValueBySettingLabel:]]
     */
    @Generated
    @Deprecated
    @CFunction
    public static native boolean ABMultiValueReplaceLabelAtIndex(ConstVoidPtr multiValue, CFStringRef label,
            @NInt long index);

    /**
     * API-Since: 2.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: use CNGroup.name
     */
    @Deprecated
    @Generated
    @CVariable()
    public static native int kABGroupNameProperty();

    @Generated public static final double kABRecordInvalidID = -1.0;
    @Generated public static final double kABPropertyInvalidID = -1.0;
    @Generated public static final double kABSourceTypeSearchableMask = 1.6777216E7;
    @Generated public static final double kABMultiValueInvalidIdentifier = -1.0;
}
