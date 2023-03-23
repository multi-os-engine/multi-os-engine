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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 9.0
 * Deprecated-Since: 10.0
 * Deprecated-Message: Use UserNotifications Framework's UNNotificationAction or UNTextInputNotificationAction
 */
@Deprecated
@Generated
public final class UIUserNotificationActionBehavior {
    /**
     * the default action behavior
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's UNNotificationAction or UNTextInputNotificationAction
     */
    @Deprecated @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * system provided action behavior, allows text input from the user
     * 
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     * Deprecated-Message: Use UserNotifications Framework's UNNotificationAction or UNTextInputNotificationAction
     */
    @Deprecated @Generated @NUInt public static final long TextInput = 0x0000000000000001L;

    @Generated
    private UIUserNotificationActionBehavior() {
    }
}
