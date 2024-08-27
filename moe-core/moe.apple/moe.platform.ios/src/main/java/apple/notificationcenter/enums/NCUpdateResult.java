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

package apple.notificationcenter.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * While the Notification Center ultimately controls the layout of its children, widgets can request a change in height.
 * Widgets with heights defined by constraints will be automatically adjusted (within limits).
 * Widgets using explicit layout can request a new height (that may, or may not, be adjusted or honored at all) by
 * changing the value of their ‘preferredContentSize’.
 * Should either form of request result in a height change, the widget will be messaged with
 * ‘viewWillTransitionToSize:withTransitionCoordinator:’ and, if the transition is animated, passed a transition
 * coordinator.
 * If the transition coordinator argument is not 'nil', and the widget has additional animations it wishes to run in
 * concert with the height change, it can specify them and/or a completion block by messaging the coordinator with
 * 'animateAlongsideTransition:completion:'.
 */
@Generated
public final class NCUpdateResult {
    @Generated @NUInt public static final long NewData = 0x0000000000000000L;
    @Generated @NUInt public static final long NoData = 0x0000000000000001L;
    @Generated @NUInt public static final long Failed = 0x0000000000000002L;

    @Generated
    private NCUpdateResult() {
    }
}
