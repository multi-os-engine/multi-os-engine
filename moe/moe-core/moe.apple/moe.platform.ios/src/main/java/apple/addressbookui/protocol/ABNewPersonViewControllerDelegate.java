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

import apple.addressbookui.ABNewPersonViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AddressBookUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("ABNewPersonViewControllerDelegate")
public interface ABNewPersonViewControllerDelegate {
    /**
     * Called when the user selects Save or Cancel. If the new person was saved, person will be
     * a valid person that was saved into the Address Book. Otherwise, person will be NULL.
     * It is up to the delegate to dismiss the view controller.
     */
    @Generated
    @Selector("newPersonViewController:didCompleteWithNewPerson:")
    void newPersonViewControllerDidCompleteWithNewPerson(ABNewPersonViewController newPersonView, ConstVoidPtr person);
}
