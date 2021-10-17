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

package apple.contactsui.protocol;

import apple.contacts.CNContact;
import apple.contacts.CNContactProperty;
import apple.contactsui.CNContactPickerViewController;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNContactPickerDelegate")
public interface CNContactPickerDelegate {
    /**
     * Singular delegate methods.
     * <p>
     * These delegate methods will be invoked when the user selects a single contact or property.
     */
    @Generated
    @IsOptional
    @Selector("contactPicker:didSelectContact:")
    default void contactPickerDidSelectContact(CNContactPickerViewController picker, CNContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contactPicker:didSelectContactProperties:")
    default void contactPickerDidSelectContactProperties(CNContactPickerViewController picker,
            NSArray<? extends CNContactProperty> contactProperties) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contactPicker:didSelectContactProperty:")
    default void contactPickerDidSelectContactProperty(CNContactPickerViewController picker,
            CNContactProperty contactProperty) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Plural delegate methods.
     * <p>
     * These delegate methods will be invoked when the user is done selecting multiple contacts or properties.
     * Implementing one of these methods will configure the picker for multi-selection.
     */
    @Generated
    @IsOptional
    @Selector("contactPicker:didSelectContacts:")
    default void contactPickerDidSelectContacts(CNContactPickerViewController picker,
            NSArray<? extends CNContact> contacts) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Invoked when the picker is closed.
     * <p>
     * The picker will be dismissed automatically after a contact or property is picked.
     */
    @Generated
    @IsOptional
    @Selector("contactPickerDidCancel:")
    default void contactPickerDidCancel(CNContactPickerViewController picker) {
        throw new java.lang.UnsupportedOperationException();
    }
}
