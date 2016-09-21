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

package apple.addressbookui.protocol;

import apple.addressbookui.ABPeoplePickerNavigationController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ABPeoplePickerNavigationControllerDelegate")
public interface ABPeoplePickerNavigationControllerDelegate {
    @Generated
    @IsOptional
    @Selector("peoplePickerNavigationController:didSelectPerson:")
    default void peoplePickerNavigationControllerDidSelectPerson(ABPeoplePickerNavigationController peoplePicker,
            ConstVoidPtr person) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peoplePickerNavigationController:didSelectPerson:property:identifier:")
    default void peoplePickerNavigationControllerDidSelectPersonPropertyIdentifier(
            ABPeoplePickerNavigationController peoplePicker, ConstVoidPtr person, int property, int identifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:")
    default boolean peoplePickerNavigationControllerShouldContinueAfterSelectingPerson(
            ABPeoplePickerNavigationController peoplePicker, ConstVoidPtr person) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("peoplePickerNavigationController:shouldContinueAfterSelectingPerson:property:identifier:")
    default boolean peoplePickerNavigationControllerShouldContinueAfterSelectingPersonPropertyIdentifier(
            ABPeoplePickerNavigationController peoplePicker, ConstVoidPtr person, int property, int identifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("peoplePickerNavigationControllerDidCancel:")
    default void peoplePickerNavigationControllerDidCancel(ABPeoplePickerNavigationController peoplePicker) {
        throw new java.lang.UnsupportedOperationException();
    }
}
