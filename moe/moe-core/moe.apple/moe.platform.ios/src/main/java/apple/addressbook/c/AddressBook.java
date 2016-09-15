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
     * ABRecordGetRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordGetRecordID">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABRecordGetRecordID(ConstVoidPtr record);

    /**
     * ABRecordGetRecordType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordGetRecordType">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABRecordGetRecordType(ConstVoidPtr record);

    /**
     * ABRecordCopyValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordCopyValue">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABRecordCopyValue(ConstVoidPtr record, int property);

    /**
     * ABRecordSetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordSetValue">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABRecordSetValue(ConstVoidPtr record, int property, ConstVoidPtr value,
            Ptr<CFErrorRef> error);

    /**
     * ABRecordRemoveValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordRemoveValue">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABRecordRemoveValue(ConstVoidPtr record, int property, Ptr<CFErrorRef> error);

    /**
     * ABRecordCopyCompositeName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABRecordRef_iPhoneOS/index.html#//apple_ref/c/func/ABRecordCopyCompositeName">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABRecordCopyCompositeName(ConstVoidPtr record);

    /**
     * ABAddressBookGetAuthorizationStatus</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetAuthorizationStatus">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetAuthorizationStatus();

    /**
     * ABAddressBookCreateWithOptions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCreateWithOptions">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreateWithOptions(CFDictionaryRef options, Ptr<CFErrorRef> error);

    /**
     * ABAddressBookCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCreate">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCreate();

    /**
     * ABAddressBookRequestAccessWithCompletion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookRequestAccessWithCompletion">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRequestAccessWithCompletion(ConstVoidPtr addressBook,
            @ObjCBlock(name = "call_ABAddressBookRequestAccessWithCompletion") Block_ABAddressBookRequestAccessWithCompletion completion);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_ABAddressBookRequestAccessWithCompletion {
        @Generated
        void call_ABAddressBookRequestAccessWithCompletion(boolean arg0, CFErrorRef arg1);
    }

    /**
     * ABAddressBookSave</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookSave">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookSave(ConstVoidPtr addressBook, Ptr<CFErrorRef> error);

    /**
     * ABAddressBookHasUnsavedChanges</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookHasUnsavedChanges">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookHasUnsavedChanges(ConstVoidPtr addressBook);

    /**
     * ABAddressBookAddRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookAddRecord">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookAddRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    /**
     * ABAddressBookRemoveRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookRemoveRecord">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABAddressBookRemoveRecord(ConstVoidPtr addressBook, ConstVoidPtr record,
            Ptr<CFErrorRef> error);

    /**
     * ABAddressBookCopyLocalizedLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyLocalizedLabel">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABAddressBookCopyLocalizedLabel(CFStringRef label);

    /**
     * ABAddressBookRegisterExternalChangeCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookRegisterExternalChangeCallback">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookRegisterExternalChangeCallback") Function_ABAddressBookRegisterExternalChangeCallback callback,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookRegisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookRegisterExternalChangeCallback(ConstVoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    /**
     * ABAddressBookUnregisterExternalChangeCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookUnregisterExternalChangeCallback">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr addressBook,
            @FunctionPtr(name = "call_ABAddressBookUnregisterExternalChangeCallback") Function_ABAddressBookUnregisterExternalChangeCallback callback,
            VoidPtr context);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_ABAddressBookUnregisterExternalChangeCallback {
        @Generated
        void call_ABAddressBookUnregisterExternalChangeCallback(ConstVoidPtr arg0, VoidPtr arg1, VoidPtr arg2);
    }

    /**
     * ABAddressBookRevert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABAddressBookRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookRevert">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void ABAddressBookRevert(ConstVoidPtr addressBook);

    /**
     * ABAddressBookCopyDefaultSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABSourceRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyDefaultSource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookCopyDefaultSource(ConstVoidPtr addressBook);

    /**
     * ABAddressBookGetSourceWithRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABSourceRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetSourceWithRecordID">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetSourceWithRecordID(ConstVoidPtr addressBook, int sourceID);

    /**
     * ABAddressBookCopyArrayOfAllSources</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABSourceRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllSources">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllSources(ConstVoidPtr addressBook);

    /**
     * ABPersonCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCreate">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCreate();

    /**
     * ABPersonCreateInSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCreateInSource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCreateInSource(ConstVoidPtr source);

    /**
     * ABPersonCopySource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopySource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABPersonCopySource(ConstVoidPtr person);

    /**
     * ABPersonCopyArrayOfAllLinkedPeople</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopyArrayOfAllLinkedPeople">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABPersonCopyArrayOfAllLinkedPeople(ConstVoidPtr person);

    /**
     * ABPersonGetTypeOfProperty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonGetTypeOfProperty">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetTypeOfProperty(int property);

    /**
     * ABPersonCopyLocalizedPropertyName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopyLocalizedPropertyName">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABPersonCopyLocalizedPropertyName(int property);

    /**
     * ABPersonGetSortOrdering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonGetSortOrdering">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetSortOrdering();

    /**
     * ABPersonGetCompositeNameFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonGetCompositeNameFormat">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native int ABPersonGetCompositeNameFormat();

    /**
     * ABPersonGetCompositeNameFormatForRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonGetCompositeNameFormatForRecord">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABPersonGetCompositeNameFormatForRecord(ConstVoidPtr record);

    /**
     * ABPersonCopyCompositeNameDelimiterForRecord</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopyCompositeNameDelimiterForRecord">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABPersonCopyCompositeNameDelimiterForRecord(ConstVoidPtr record);

    /**
     * ABPersonSetImageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonSetImageData">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonSetImageData(ConstVoidPtr person, CFDataRef imageData, Ptr<CFErrorRef> error);

    /**
     * ABPersonCopyImageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopyImageData">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCopyImageData(ConstVoidPtr person);

    /**
     * ABPersonCopyImageDataWithFormat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCopyImageDataWithFormat">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCopyImageDataWithFormat(ConstVoidPtr person, int format);

    /**
     * ABPersonHasImageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonHasImageData">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonHasImageData(ConstVoidPtr person);

    /**
     * ABPersonRemoveImageData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonRemoveImageData">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABPersonRemoveImageData(ConstVoidPtr person, Ptr<CFErrorRef> error);

    /**
     * ABPersonComparePeopleByName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonComparePeopleByName">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABPersonComparePeopleByName(ConstVoidPtr person1, ConstVoidPtr person2, int ordering);

    /**
     * ABAddressBookGetPersonCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetPersonCount">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetPersonCount(ConstVoidPtr addressBook);

    /**
     * ABAddressBookGetPersonWithRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetPersonWithRecordID">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetPersonWithRecordID(ConstVoidPtr addressBook, int recordID);

    /**
     * ABAddressBookCopyArrayOfAllPeople</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllPeople">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeople(ConstVoidPtr addressBook);

    /**
     * ABAddressBookCopyArrayOfAllPeopleInSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllPeopleInSource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    /**
     * ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllPeopleInSourceWithSortOrdering(ConstVoidPtr addressBook,
            ConstVoidPtr source, int sortOrdering);

    /**
     * ABAddressBookCopyPeopleWithName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyPeopleWithName">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyPeopleWithName(ConstVoidPtr addressBook, CFStringRef name);

    /**
     * ABPersonCreatePeopleInSourceWithVCardRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCreatePeopleInSourceWithVCardRepresentation">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABPersonCreatePeopleInSourceWithVCardRepresentation(ConstVoidPtr source,
            CFDataRef vCardData);

    /**
     * ABPersonCreateVCardRepresentationWithPeople</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABPersonRef_iPhoneOS/index.html#//apple_ref/c/func/ABPersonCreateVCardRepresentationWithPeople">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef ABPersonCreateVCardRepresentationWithPeople(CFArrayRef people);

    /**
     * ABGroupCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupCreate">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCreate();

    /**
     * ABGroupCreateInSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupCreateInSource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCreateInSource(ConstVoidPtr source);

    /**
     * ABGroupCopySource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupCopySource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABGroupCopySource(ConstVoidPtr group);

    /**
     * ABGroupCopyArrayOfAllMembers</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupCopyArrayOfAllMembers">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembers(ConstVoidPtr group);

    /**
     * ABGroupCopyArrayOfAllMembersWithSortOrdering</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupCopyArrayOfAllMembersWithSortOrdering">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABGroupCopyArrayOfAllMembersWithSortOrdering(ConstVoidPtr group, int sortOrdering);

    /**
     * ABGroupAddMember</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupAddMember">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABGroupAddMember(ConstVoidPtr group, ConstVoidPtr person, Ptr<CFErrorRef> error);

    /**
     * ABGroupRemoveMember</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABGroupRemoveMember">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABGroupRemoveMember(ConstVoidPtr group, ConstVoidPtr member, Ptr<CFErrorRef> error);

    /**
     * ABAddressBookGetGroupWithRecordID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetGroupWithRecordID">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABAddressBookGetGroupWithRecordID(ConstVoidPtr addressBook, int recordID);

    /**
     * ABAddressBookGetGroupCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookGetGroupCount">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABAddressBookGetGroupCount(ConstVoidPtr addressBook);

    /**
     * ABAddressBookCopyArrayOfAllGroups</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllGroups">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroups(ConstVoidPtr addressBook);

    /**
     * ABAddressBookCopyArrayOfAllGroupsInSource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABGroupRef_iPhoneOS/index.html#//apple_ref/c/func/ABAddressBookCopyArrayOfAllGroupsInSource">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABAddressBookCopyArrayOfAllGroupsInSource(ConstVoidPtr addressBook,
            ConstVoidPtr source);

    /**
     * ABMultiValueGetPropertyType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueGetPropertyType">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABMultiValueGetPropertyType(ConstVoidPtr multiValue);

    /**
     * ABMultiValueGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueGetCount">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetCount(ConstVoidPtr multiValue);

    /**
     * ABMultiValueCopyValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueCopyValueAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCopyValueAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * ABMultiValueCopyArrayOfAllValues</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueCopyArrayOfAllValues">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFArrayRef ABMultiValueCopyArrayOfAllValues(ConstVoidPtr multiValue);

    /**
     * ABMultiValueCopyLabelAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueCopyLabelAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native CFStringRef ABMultiValueCopyLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * ABMultiValueGetIndexForIdentifier</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueGetIndexForIdentifier">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetIndexForIdentifier(ConstVoidPtr multiValue, int identifier);

    /**
     * ABMultiValueGetIdentifierAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueGetIdentifierAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native int ABMultiValueGetIdentifierAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * ABMultiValueGetFirstIndexOfValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueGetFirstIndexOfValue">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    @NInt
    public static native long ABMultiValueGetFirstIndexOfValue(ConstVoidPtr multiValue, ConstVoidPtr value);

    /**
     * ABMultiValueCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueCreateMutable">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutable(int type);

    /**
     * ABMultiValueCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueCreateMutableCopy">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native ConstVoidPtr ABMultiValueCreateMutableCopy(ConstVoidPtr multiValue);

    /**
     * ABMultiValueAddValueAndLabel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueAddValueAndLabel">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueAddValueAndLabel(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, IntPtr outIdentifier);

    /**
     * ABMultiValueInsertValueAndLabelAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueInsertValueAndLabelAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueInsertValueAndLabelAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            CFStringRef label, @NInt long index, IntPtr outIdentifier);

    /**
     * ABMultiValueRemoveValueAndLabelAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueRemoveValueAndLabelAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueRemoveValueAndLabelAtIndex(ConstVoidPtr multiValue, @NInt long index);

    /**
     * ABMultiValueReplaceValueAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueReplaceValueAtIndex">iOS Dev Center</a>
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean ABMultiValueReplaceValueAtIndex(ConstVoidPtr multiValue, ConstVoidPtr value,
            @NInt long index);

    /**
     * ABMultiValueReplaceLabelAtIndex</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBook/Reference/ABMutableMultiValueRef_iPhoneOS/index.html#//apple_ref/c/func/ABMultiValueReplaceLabelAtIndex">iOS Dev Center</a>
     */
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
}
