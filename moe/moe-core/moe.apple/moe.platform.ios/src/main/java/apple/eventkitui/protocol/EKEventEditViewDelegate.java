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

import apple.eventkit.EKCalendar;
import apple.eventkitui.EKEventEditViewController;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @enum       EKEventEditViewDelegate
 * @abstract   Delegate protocol for event edit view controller.
 */
@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EKEventEditViewDelegate")
public interface EKEventEditViewDelegate {
    /**
     * @method     eventEditViewController:didCompleteWithAction:
     * @abstract   Called to let delegate know the controller is done editing.
     * @discussion When the user presses Cancel, presses Done, or deletes the event, this method
     *             is called. Your delegate is responsible for dismissing the controller. If the editing
     *             session is terminated programmatically using cancelEditing, 
     *             this method will not be called.
     * 
     * @param      controller          the controller in question
     * @param      action              the action that is causing the dismissal
     */
    @Generated
    @Selector("eventEditViewController:didCompleteWithAction:")
    void eventEditViewControllerDidCompleteWithAction(EKEventEditViewController controller, @NInt long action);

    /**
     * @method     eventEditViewControllerDefaultCalendarForNewEvents:
     * @abstract   Allows you to supply your own default calendar for new events.
     * @discussion This delegate method allows you to control what the editor chooses for the default calendar
     *             if it needs to fill in a calendar. This might be necessary if you either don't pass an initial
     *             event to the view controller, or you do, but you did not supply a calendar. In these cases, we
     *             we set the calendar to a default. If this is not implemented by the delegate, the controller
     *             will use the store's defaultCalendarForNewEvents.
     */
    @Generated
    @IsOptional
    @Selector("eventEditViewControllerDefaultCalendarForNewEvents:")
    default EKCalendar eventEditViewControllerDefaultCalendarForNewEvents(EKEventEditViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
