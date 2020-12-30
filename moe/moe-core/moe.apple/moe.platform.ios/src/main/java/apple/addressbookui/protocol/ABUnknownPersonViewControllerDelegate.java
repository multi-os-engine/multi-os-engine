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

import apple.addressbookui.ABUnknownPersonViewController;
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
@ObjCProtocolName("ABUnknownPersonViewControllerDelegate")
public interface ABUnknownPersonViewControllerDelegate {
    /**
     * Called when picking has completed.  If picking was canceled, 'person' will be NULL.
     * Otherwise, person will be either a non-NULL resolved contact, or newly created and
     * saved contact, in both cases, person will be a valid contact in the Address Book.
     * It is up to the delegate to dismiss the view controller.
     */
    @Generated
    @Selector("unknownPersonViewController:didResolveToPerson:")
    void unknownPersonViewControllerDidResolveToPerson(ABUnknownPersonViewController unknownCardViewController,
            ConstVoidPtr person);

    /**
     * Called when the user selects an individual value in the unknown person view, identifier will be kABMultiValueInvalidIdentifier if a single value property was selected.
     * Return NO if you do not want anything to be done or if you are handling the actions yourself.
     * Return YES if you want the ABUnknownPersonViewController to perform its default action.
     */
    @Generated
    @IsOptional
    @Selector("unknownPersonViewController:shouldPerformDefaultActionForPerson:property:identifier:")
    default boolean unknownPersonViewControllerShouldPerformDefaultActionForPersonPropertyIdentifier(
            ABUnknownPersonViewController personViewController, ConstVoidPtr person, int property, int identifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}
