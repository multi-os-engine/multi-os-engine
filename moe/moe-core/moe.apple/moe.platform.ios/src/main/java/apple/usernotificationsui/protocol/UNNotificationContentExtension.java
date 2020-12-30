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

package apple.usernotificationsui.protocol;

import apple.coregraphics.struct.CGRect;
import apple.uikit.UIColor;
import apple.usernotifications.UNNotification;
import apple.usernotifications.UNNotificationResponse;
import org.moe.natj.general.ann.ByValue;
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
@Library("UserNotificationsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UNNotificationContentExtension")
public interface UNNotificationContentExtension {
    /**
     * This will be called to send the notification to be displayed by
     * the extension. If the extension is being displayed and more related
     * notifications arrive (eg. more messages for the same conversation)
     * the same method will be called for each new notification.
     */
    @Generated
    @Selector("didReceiveNotification:")
    void didReceiveNotification(UNNotification notification);

    /**
     * If implemented, the method will be called when the user taps on one
     * of the notification actions. The completion handler can be called
     * after handling the action to dismiss the notification and forward the
     * action to the app if necessary.
     */
    @Generated
    @IsOptional
    @Selector("didReceiveNotificationResponse:completionHandler:")
    default void didReceiveNotificationResponseCompletionHandler(UNNotificationResponse response,
            @ObjCBlock(name = "call_didReceiveNotificationResponseCompletionHandler") Block_didReceiveNotificationResponseCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mediaPause")
    default void mediaPause() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the user taps the play or pause button.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlay")
    default void mediaPlay() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Implementing this method and returning a non-empty frame will make
     * the notification draw a button that allows the user to play and pause
     * media content embedded in the notification.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonFrame")
    @ByValue
    default CGRect mediaPlayPauseButtonFrame() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonTintColor")
    default UIColor mediaPlayPauseButtonTintColor() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Implementing this method and returning a button type other that "None" will
     * make the notification attempt to draw a play/pause button correctly styled
     * for that type.
     */
    @Generated
    @IsOptional
    @Selector("mediaPlayPauseButtonType")
    @NUInt
    default long mediaPlayPauseButtonType() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_didReceiveNotificationResponseCompletionHandler {
        @Generated
        void call_didReceiveNotificationResponseCompletionHandler(@NUInt long option);
    }
}
