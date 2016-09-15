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
     * unknownPersonViewController:didResolveToPerson:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABUnknownPersonViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/ABUnknownPersonViewControllerDelegate/unknownPersonViewController:didResolveToPerson:">iOS Dev Center</a>
     */
    @Generated
    @Selector("unknownPersonViewController:didResolveToPerson:")
    void unknownPersonViewControllerDidResolveToPerson(ABUnknownPersonViewController unknownCardViewController,
            ConstVoidPtr person);

    /**
     * unknownPersonViewController:shouldPerformDefaultActionForPerson:property:identifier:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AddressBookUI/Reference/ABUnknownPersonViewControllerDelegate_Protocol/index.html#//apple_ref/occ/intfm/ABUnknownPersonViewControllerDelegate/unknownPersonViewController:shouldPerformDefaultActionForPerson:property:identifier:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("unknownPersonViewController:shouldPerformDefaultActionForPerson:property:identifier:")
    default boolean unknownPersonViewControllerShouldPerformDefaultActionForPersonPropertyIdentifier(
            ABUnknownPersonViewController personViewController, ConstVoidPtr person, int property, int identifier) {
        throw new java.lang.UnsupportedOperationException();
    }
}
