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

    @Deprecated
    @Generated
    @CFunction
    public static native int ABRecordGetRecordID(ConstVoidPtr record);

    @Deprecated
    @Generated
    @CFunction
    public static native int ABRecordGetRecordType(ConstVoidPtr record);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABRecordCopyValue(ConstVoidPtr record, int property);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABRecordSetValue(ConstVoidPtr record, int property, ConstVoidPtr value,
            Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABRecordRemoveValue(ConstVoidPtr record, int property, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABRecordCopyCompositeName(ConstVoidPtr record);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetAuthorizationStatus();

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreateWithOptions(CFDictionaryRef options, Ptr<CFErrorRef> error);

    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreate();

    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRequestAccessWithCompletion(ConstVoidPtr addressBook,
            @ObjCBlock(name = "call_ABAddressBookRequestAccessWithCompletion") Block_ABAddressBookRequestAccessWithCompletion completion);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookSave(ConstVoidPtr addressBook, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookHasUnsavedChanges(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookAddRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookRemoveRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABAddressBookCopyLocalizedLabel(CFStringRef label);

    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookRegisterExternalChangeCallback") Function_ABAddressBookRegisterExternalChangeCallback callback,
            VoidPtr context);

    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookUnregisterExternalChangeCallback") Function_ABAddressBookUnregisterExternalChangeCallback callback,
            VoidPtr context);

    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRevert(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCopyDefaultSource(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetSourceWithRecordID(ConstVoidPtr addressBook, int sourceID);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllSources(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCreate();

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCreateInSource(ConstVoidPtr source);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCopySource(ConstVoidPtr person);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABPersonCopyArrayOfAllLinkedPeople(ConstVoidPtr person);

    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetTypeOfProperty(int property);

    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABPersonCopyLocalizedPropertyName(int property);

    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetSortOrdering();

    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormat();

    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetCompositeNameFormatForRecord(ConstVoidPtr record);

    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABPersonCopyCompositeNameDelimiterForRecord(ConstVoidPtr record);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonSetImageData(ConstVoidPtr person, CFDataRef imageData, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCopyImageData(ConstVoidPtr person);

    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCopyImageDataWithFormat(ConstVoidPtr person, int format);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonHasImageData(ConstVoidPtr person);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonRemoveImageData(ConstVoidPtr person, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABPersonComparePeopleByName(ConstVoidPtr person1, ConstVoidPtr person2, int ordering);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetPersonCount(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetPersonWithRecordID(ConstVoidPtr addressBook, int recordID);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeople(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering(ConstVoidPtr addressBook,
            ConstVoidPtr source, int sortOrdering);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyPeopleWithName(ConstVoidPtr addressBook, CFStringRef name);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABPersonCreatePeopleInSourceWithVCardRepresentation(ConstVoidPtr source,
            CFDataRef vCardData);

    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCreateVCardRepresentationWithPeople(CFArrayRef people);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCreate();

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCreateInSource(ConstVoidPtr source);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCopySource(ConstVoidPtr group);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembers(ConstVoidPtr group);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembersWithSortOrdering(ConstVoidPtr group, int sortOrdering);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABGroupAddMember(ConstVoidPtr group, ConstVoidPtr person, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABGroupRemoveMember(ConstVoidPtr group, ConstVoidPtr member, Ptr<CFErrorRef> error);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetGroupWithRecordID(ConstVoidPtr addressBook, int recordID);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetGroupCount(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroups(ConstVoidPtr addressBook);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroupsInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    @Deprecated
    @Generated
    @CFunction
    public static native int ABMultiValueGetPropertyType(ConstVoidPtr multiValue);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetCount(ConstVoidPtr multiValue);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCopyValueAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABMultiValueCopyArrayOfAllValues(ConstVoidPtr multiValue);

    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABMultiValueCopyLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetIndexForIdentifier(ConstVoidPtr multiValue, int identifier);

    @Deprecated
    @Generated
    @CFunction
    public static native int ABMultiValueGetIdentifierAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetFirstIndexOfValue(ConstVoidPtr multiValue, ConstVoidPtr value);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutable(int type);

    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutableCopy(ConstVoidPtr multiValue);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueAddValueAndLabel(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, IntPtr outIdentifier);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueInsertValueAndLabelAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, @NInt long index, IntPtr outIdentifier);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueRemoveValueAndLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueReplaceValueAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            @NInt long index);

    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueReplaceLabelAtIndex(ConstVoidPtr multiValue, CFStringRef label,
            @NInt long index);

    @Generated
    @CVariable()
    public static native CFStringRef ABAddressBookErrorDomain();

    @Generated
    @CVariable()
    public static native int kABSourceNameProperty();

    @Generated
    @CVariable()
    public static native int kABSourceTypeProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABWorkLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABHomeLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABOtherLabel();

    @Generated
    @CVariable()
    public static native int kABPersonFirstNameProperty();

    @Generated
    @CVariable()
    public static native int kABPersonLastNameProperty();

    @Generated
    @CVariable()
    public static native int kABPersonMiddleNameProperty();

    @Generated
    @CVariable()
    public static native int kABPersonPrefixProperty();

    @Generated
    @CVariable()
    public static native int kABPersonSuffixProperty();

    @Generated
    @CVariable()
    public static native int kABPersonNicknameProperty();

    @Generated
    @CVariable()
    public static native int kABPersonFirstNamePhoneticProperty();

    @Generated
    @CVariable()
    public static native int kABPersonLastNamePhoneticProperty();

    @Generated
    @CVariable()
    public static native int kABPersonMiddleNamePhoneticProperty();

    @Generated
    @CVariable()
    public static native int kABPersonOrganizationProperty();

    @Generated
    @CVariable()
    public static native int kABPersonJobTitleProperty();

    @Generated
    @CVariable()
    public static native int kABPersonDepartmentProperty();

    @Generated
    @CVariable()
    public static native int kABPersonEmailProperty();

    @Generated
    @CVariable()
    public static native int kABPersonBirthdayProperty();

    @Generated
    @CVariable()
    public static native int kABPersonNoteProperty();

    @Generated
    @CVariable()
    public static native int kABPersonCreationDateProperty();

    @Generated
    @CVariable()
    public static native int kABPersonModificationDateProperty();

    @Generated
    @CVariable()
    public static native int kABPersonAddressProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStreetKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCityKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressStateKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressZIPKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAddressCountryCodeKey();

    @Generated
    @CVariable()
    public static native int kABPersonDateProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAnniversaryLabel();

    @Generated
    @CVariable()
    public static native int kABPersonKindProperty();

    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindPerson();

    @Generated
    @CVariable()
    public static native CFNumberRef kABPersonKindOrganization();

    @Generated
    @CVariable()
    public static native int kABPersonPhoneProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMobileLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneIPhoneLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneMainLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneHomeFAXLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneWorkFAXLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhoneOtherFAXLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPhonePagerLabel();

    @Generated
    @CVariable()
    public static native int kABPersonInstantMessageProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceYahoo();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceJabber();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceMSN();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceICQ();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceAIM();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceQQ();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGoogleTalk();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceSkype();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceFacebook();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageServiceGaduGadu();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonInstantMessageUsernameKey();

    @Generated
    @CVariable()
    public static native int kABPersonURLProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonHomePageLabel();

    @Generated
    @CVariable()
    public static native int kABPersonRelatedNamesProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFatherLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonMotherLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonParentLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonBrotherLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSisterLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonChildLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonFriendLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSpouseLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonPartnerLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAssistantLabel();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonManagerLabel();

    @Generated
    @CVariable()
    public static native int kABPersonSocialProfileProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileURLKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUsernameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileUserIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceTwitter();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceSinaWeibo();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceGameCenter();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFacebook();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceMyspace();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceLinkedIn();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonSocialProfileServiceFlickr();

    @Generated
    @CVariable()
    public static native int kABPersonAlternateBirthdayProperty();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayCalendarIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayEraKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayYearKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayMonthKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayIsLeapMonthKey();

    @Generated
    @CVariable()
    public static native CFStringRef kABPersonAlternateBirthdayDayKey();

    @Generated
    @CVariable()
    public static native int kABGroupNameProperty();

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_ABAddressBookRequestAccessWithCompletion {
        @Generated
        void call_ABAddressBookRequestAccessWithCompletion(boolean arg0, CFErrorRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookRegisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookUnregisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }
}
