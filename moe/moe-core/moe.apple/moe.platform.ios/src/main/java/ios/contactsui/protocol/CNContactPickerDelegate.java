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

package ios.contactsui.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.contacts.CNContact;
import ios.contacts.CNContactProperty;
import ios.contactsui.CNContactPickerViewController;
import ios.foundation.NSArray;

@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNContactPickerDelegate")
public interface CNContactPickerDelegate {
	/**
	 * contactPicker:didSelectContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactPickerDelegate/contactPicker:didSelectContact:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactPicker:didSelectContact:")
	default void contactPickerDidSelectContact(CNContactPickerViewController picker, CNContact contact) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * contactPicker:didSelectContactProperties:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactPickerDelegate/contactPicker:didSelectContactProperties:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactPicker:didSelectContactProperties:")
	default void contactPickerDidSelectContactProperties(CNContactPickerViewController picker,
			NSArray<? extends CNContactProperty> contactProperties) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * contactPicker:didSelectContactProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactPickerDelegate/contactPicker:didSelectContactProperty:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactPicker:didSelectContactProperty:")
	default void contactPickerDidSelectContactProperty(CNContactPickerViewController picker,
			CNContactProperty contactProperty) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * contactPicker:didSelectContacts:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactPickerDelegate/contactPicker:didSelectContacts:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactPicker:didSelectContacts:")
	default void contactPickerDidSelectContacts(CNContactPickerViewController picker, NSArray<? extends CNContact> contacts) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * contactPickerDidCancel:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactPickerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactPickerDelegate/contactPickerDidCancel:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactPickerDidCancel:")
	default void contactPickerDidCancel(CNContactPickerViewController picker) {
		throw new java.lang.UnsupportedOperationException();
	}
}
