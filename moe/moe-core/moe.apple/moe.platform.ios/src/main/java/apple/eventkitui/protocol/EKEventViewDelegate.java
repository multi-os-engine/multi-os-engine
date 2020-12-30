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

package apple.eventkitui.protocol;

import apple.eventkitui.EKEventViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EKEventViewDelegate")
public interface EKEventViewDelegate {
    /**
     * eventViewController:didCompleteWithAction:
     * 
     * Called to let delegate know that an action has occurred that should cause the
     *             controller to be dismissed.
     * 
     * If the user taps a button which deletes the event, or responds to an invite, this
     *             method is called on the delegate so that the delegate can decide to dismiss
     *             the view controller. When presented in a popover, it also reports when the Done
     *             button is pressed.
     * 
     * @param      controller          the controller in question
     * @param      action              the action that is triggering the dismissal
     */
    @Generated
    @Selector("eventViewController:didCompleteWithAction:")
    void eventViewControllerDidCompleteWithAction(EKEventViewController controller, @NInt long action);
}
