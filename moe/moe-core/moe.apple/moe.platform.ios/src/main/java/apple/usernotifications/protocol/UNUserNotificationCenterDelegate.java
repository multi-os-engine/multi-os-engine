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
    @Generated
    @IsOptional
    @Selector("userNotificationCenter:didReceiveNotificationResponse:withCompletionHandler:")
    default void userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler(
            UNUserNotificationCenter center, UNNotificationResponse response,
            @ObjCBlock(name = "call_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler") Block_userNotificationCenterDidReceiveNotificationResponseWithCompletionHandler completionHandler) {
        throw new java.lang.UnsupportedOperationException();
    }

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

    @Generated
    @IsOptional
    @Selector("userNotificationCenter:openSettingsForNotification:")
    default void userNotificationCenterOpenSettingsForNotification(UNUserNotificationCenter center,
            UNNotification notification) {
        throw new java.lang.UnsupportedOperationException();
    }
}
