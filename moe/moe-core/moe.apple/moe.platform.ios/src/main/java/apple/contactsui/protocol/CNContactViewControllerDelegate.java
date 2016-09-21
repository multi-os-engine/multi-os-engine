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
import apple.contactsui.CNContactViewController;
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
@ObjCProtocolName("CNContactViewControllerDelegate")
public interface CNContactViewControllerDelegate {
    @Generated
    @IsOptional
    @Selector("contactViewController:didCompleteWithContact:")
    default void contactViewControllerDidCompleteWithContact(CNContactViewController viewController,
            CNContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("contactViewController:shouldPerformDefaultActionForContactProperty:")
    default boolean contactViewControllerShouldPerformDefaultActionForContactProperty(
            CNContactViewController viewController, CNContactProperty property) {
        throw new java.lang.UnsupportedOperationException();
    }
}
