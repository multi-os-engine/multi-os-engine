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

@Generated
@Library("EventKitUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("EKEventEditViewDelegate")
public interface EKEventEditViewDelegate {
    /**
     * eventEditViewController:didCompleteWithAction:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKitUI/Reference/EKEventEditViewDelegateRef/index.html#//apple_ref/occ/intfm/EKEventEditViewDelegate/eventEditViewController:didCompleteWithAction:">iOS Dev Center</a>
     */
    @Generated
    @Selector("eventEditViewController:didCompleteWithAction:")
    void eventEditViewControllerDidCompleteWithAction(EKEventEditViewController controller, @NInt long action);

    /**
     * eventEditViewControllerDefaultCalendarForNewEvents:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/EventKitUI/Reference/EKEventEditViewDelegateRef/index.html#//apple_ref/occ/intfm/EKEventEditViewDelegate/eventEditViewControllerDefaultCalendarForNewEvents:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("eventEditViewControllerDefaultCalendarForNewEvents:")
    default EKCalendar eventEditViewControllerDefaultCalendarForNewEvents(EKEventEditViewController controller) {
        throw new java.lang.UnsupportedOperationException();
    }
}
