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

package apple.usernotifications.protocol;

import apple.usernotifications.UNNotification;
import apple.usernotifications.UNNotificationResponse;
import apple.usernotifications.UNUserNotificationCenter;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UserNotifications")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UNUserNotificationCenterDelegate")
public interface UNUserNotificationCenterDelegate {
    /**
     * The method will be called on the delegate when the user responded to the notification by opening the application, dismissing the notification or choosing a UNNotificationAction. The delegate must be set before the application returns from application:didFinishLaunchingWithOptions:.
     */
    @Generated
    @IsOptional
    @Selector("userNotificationCenter:didReceiveNotificationResponse:withCompletionHandler:")
    default void userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler(
            UNUserNotificationCenter center, UNNotificationResponse response,
            @ObjCBlock(name = "call_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler") Block_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The method will be called on the delegate only if the application is in the foreground. If the method is not implemented or the handler is not called in a timely manner then the notification will not be presented. The application can choose to have the notification presented as a sound, badge, alert and/or in the notification list. This decision should be based on whether the information in the notification is otherwise visible to the user.
     */
    @Generated
    @IsOptional
    @Selector("userNotificationCenter:willPresentNotification:withCompletionHandler:")
    default void userNotificationCenterWillPresentNotificationWithCompletionHandler(UNUserNotificationCenter center,
            UNNotification notification,
            @ObjCBlock(name = "call_userNotificationCenterWillPresentNotificationWithCompletionHandler") Block_userNotificationCenterWillPresentNotificationWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler {
        @Generated
        void call_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_userNotificationCenterWillPresentNotificationWithCompletionHandler {
        @Generated
        void call_userNotificationCenterWillPresentNotificationWithCompletionHandler(@NUInt long options);
    }

    /**
     * The method will be called on the delegate when the application is launched in response to the user's request to view in-app notification settings. Add UNAuthorizationOptionProvidesAppNotificationSettings as an option in requestAuthorizationWithOptions:completionHandler: to add a button to inline notification settings view and the notification settings view in Settings. The notification will be nil when opened from Settings.
     */
    @Generated
    @IsOptional
    @Selector("userNotificationCenter:openSettingsForNotification:")
    default void userNotificationCenterOpenSettingsForNotification(UNUserNotificationCenter center,
            UNNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }
}
