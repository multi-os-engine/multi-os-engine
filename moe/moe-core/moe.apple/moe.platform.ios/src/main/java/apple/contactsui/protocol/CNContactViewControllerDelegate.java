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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 9.0
 */
@Generated
@Library("ContactsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CNContactViewControllerDelegate")
public interface CNContactViewControllerDelegate {
    /**
     * Called when the view has completed.
     * 
     * If creating a new contact, the new contact added to the contacts list will be passed.
     * If adding to an existing contact, the existing contact will be passed.
     * [@note] It is up to the delegate to dismiss the view controller.
     */
    @Generated
    @IsOptional
    @Selector("contactViewController:didCompleteWithContact:")
    default void contactViewControllerDidCompleteWithContact(@NotNull CNContactViewController viewController,
            @Nullable CNContact contact) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user selects a single property.
     * 
     * Return @c NO if you do not want anything to be done or if you are handling the actions yourself.
     * 
     * @return @c YES if you want the default action performed for the property otherwise return @c NO.
     */
    @Generated
    @IsOptional
    @Selector("contactViewController:shouldPerformDefaultActionForContactProperty:")
    default boolean contactViewControllerShouldPerformDefaultActionForContactProperty(
            @NotNull CNContactViewController viewController, @NotNull CNContactProperty property) {
        throw new java.lang.UnsupportedOperationException();
    }
}
