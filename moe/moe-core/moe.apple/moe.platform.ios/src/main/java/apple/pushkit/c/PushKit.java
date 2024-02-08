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

package apple.pushkit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("PushKit")
@Runtime(CRuntime.class)
public final class PushKit {
    static {
        NatJ.register();
    }

    @Generated
    private PushKit() {
    }

    /**
     * A push type for Voice-over-IP (VoIP) call invitations.
     * 
     * Use this type of notification to initiate live voice calls over the network.
     * Apps receiving VoIP push notifications must report the call quickly to
     * CallKit, so it can alert the user to the presence of the incoming call. For
     * apps linked against the iOS 13 SDK or later, the system terminates your app
     * if you fail to report these notifications to CallKit. If your app repeatedly
     * fails to report VoIP notifications to CallKit, the system stops launching
     * your app for VoIP push notifications.
     * 
     * Don't use this type of notification for anything other than initiating VoIP
     * calls. If you don't want to post the CallKit call interface, handle
     * notifications with the
     * <doc://com.apple.documentation/documentation/usernotifications> framework
     * instead of ``PushKit``. When sending encrypted content, use a Notification
     * Service Extension to decrypt that content before displaying it to the user.
     * You can also use a Notification Content Extension to display a custom
     * interface for your app's notifications. For more information, see
     * <doc://com.apple.documentation/documentation/usernotifications/modifying_content_in_newly_delivered_notifications>
     * and
     * <doc://com.apple.documentation/documentation/usernotificationsui/customizing_the_appearance_of_notifications>.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPushTypeVoIP();

    /**
     * A push type for watchOS complications.
     * 
     * Use this type of notification to deliver updated data related for your
     * watchOS app’s complication. The watchOS app’s complication must be active on
     * the user’s current clock face. If it is not, the system does not deliver
     * pushes of this type. For watchOS 6 and later, send the push notification
     * directly to Apple Watch. For watchOS 5 and earlier, you must send it to the
     * iOS companion instead.
     * 
     * The time your watchOS app spends processing these push notifications counts
     * against the budget allotted to your complication for updating itself. Don't
     * start any long-running tasks when processing the notification payload. In
     * fact, it is recommended that you include all needed data in the payload so
     * that your app can process that data quickly.
     * 
     * The system limits you to 50 push notifications per day. If you exceed the
     * limit, subsequent pushes are not delivered.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Complication pushes are supported directly on watchOS now, so this should no longer be used
     * on iOS.
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPushTypeComplication();

    /**
     * A push type for file provider updates.
     * 
     * Use file provider notifications to update your File Provider extension's content
     * from your server. For more information, see
     * <doc://com.apple.documentation/documentation/fileprovider/nonreplicated_file_provider_extension/content_and_change_tracking/tracking_your_file_provider_s_changes>.
     * 
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String PKPushTypeFileProvider();
}
