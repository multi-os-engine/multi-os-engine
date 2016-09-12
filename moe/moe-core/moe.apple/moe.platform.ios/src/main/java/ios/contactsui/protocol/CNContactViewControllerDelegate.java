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
import ios.contactsui.CNContactViewController;

@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNContactViewControllerDelegate")
public interface CNContactViewControllerDelegate {
	/**
	 * contactViewController:didCompleteWithContact:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactViewControllerDelegate/contactViewController:didCompleteWithContact:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactViewController:didCompleteWithContact:")
	default void contactViewControllerDidCompleteWithContact(CNContactViewController viewController,
			CNContact contact) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * contactViewController:shouldPerformDefaultActionForContactProperty:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ContactsUI/Reference/CNContactViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CNContactViewControllerDelegate/contactViewController:shouldPerformDefaultActionForContactProperty:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("contactViewController:shouldPerformDefaultActionForContactProperty:")
	default boolean contactViewControllerShouldPerformDefaultActionForContactProperty(
			CNContactViewController viewController, CNContactProperty property) {
		throw new java.lang.UnsupportedOperationException();
	}
}
