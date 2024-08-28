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

package apple.pushkit.protocol;

import apple.pushkit.PKPushCredentials;
import apple.pushkit.PKPushPayload;
import apple.pushkit.PKPushRegistry;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * The methods that you use to handle incoming PushKit notifications and registration
 * events.
 * 
 * Implement the methods of this protocol in an object of your app and assign that object
 * to the ``PushKit/PKPushRegistry/delegate`` property of your `PKPushRegistry`
 * object. Use the methods of this protocol to process incoming notifications and to
 * react to token registration and invalidation.
 * 
 * ## Topics
 * 
 * ### Responding to Registration Events
 * 
 * - ``PushKit/PKPushRegistryDelegate/pushRegistry:didUpdatePushCredentials:forType:``
 * - ``PushKit/PKPushRegistryDelegate/pushRegistry:didInvalidatePushTokenForType:``
 * 
 * ### Handling an Incoming Notification
 * 
 * - ``PushKit/PKPushRegistryDelegate/pushRegistry:didReceiveIncomingPushWithPayload:forType:withCompletionHandler:``
 * 
 * ### Deprecated Methods
 * 
 * - ``PushKit/PKPushRegistryDelegate/pushRegistry:didReceiveIncomingPushWithPayload:forType:``
 */
@Generated
@Library("PushKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPushRegistryDelegate")
public interface PKPushRegistryDelegate {
    /**
     * Tells the delegate that the system invalidated the push token for the specified type.
     * 
     * The system calls this method when a previously provided push token is no longer valid
     * for use. No action is necessary on your part to reregister the push type. Instead,
     * use this method to notify your server not to send push notifications using the matching
     * push token.
     * 
     * - Parameters:
     * - registry: The ``PushKit/PKPushRegistry`` instance responsible for the delegate callback.
     * - type: This is a ``PushKit/PKPushType`` constant, which is present in `[registry desiredPushTypes]`.
     */
    @Generated
    @IsOptional
    @Selector("pushRegistry:didInvalidatePushTokenForType:")
    default void pushRegistryDidInvalidatePushTokenForType(@NotNull PKPushRegistry registry, @NotNull String type) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Notifies the delegate that a remote push has been received.
     * 
     * This method is invoked when a push notification has been received for the
     * specified push type.
     * 
     * - Parameters:
     * - registry: The ``PKPushRegistry`` instance responsible for the delegate callback.
     * - payload: The push payload sent by a developer via APNS server API.
     * - type: This is a ``PushKit/PKPushType`` constant, which is present in `[registry desiredPushTypes]`.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     */
    @Deprecated
    @IsOptional
    @Generated
    @Selector("pushRegistry:didReceiveIncomingPushWithPayload:forType:")
    default void pushRegistryDidReceiveIncomingPushWithPayloadForType(@NotNull PKPushRegistry registry,
            @NotNull PKPushPayload payload, @NotNull String type) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the system updated the credentials for the specified type
     * of push notification.
     * 
     * The system calls this method when it receives new credentials (including a push token)
     * for the specified push type.
     * 
     * - Parameters:
     * - registry: The ``PushKit/PKPushRegistry`` instance responsible for the delegate callback.
     * - credentials: The push credentials that can be used to send pushes to the device for the specified push type.
     * - type: One of the requested notification types. This type is present in the
     * ``PushKit/PKPushRegistry/desiredPushTypes`` property of the push registry.
     */
    @Generated
    @Selector("pushRegistry:didUpdatePushCredentials:forType:")
    void pushRegistryDidUpdatePushCredentialsForType(@NotNull PKPushRegistry registry,
            @NotNull PKPushCredentials pushCredentials, @NotNull String type);

    /**
     * Tells the delegate that a remote push notification arrived.
     * 
     * The system calls this method when it receives a push notification for the specified
     * push type. Use this method to extract data from the notification's payload and to
     * perform the relevant task for that data. For example, use this method to update the
     * complication data of your watchOS app. When you finish the task, execute the provided
     * `completion` handler block to let PushKit know you are finished.
     * 
     * When linking against the iOS 13 SDK or later, your implementation of this method
     * must report notifications of type ``PushKit/PKPushTypeVoIP`` to the
     * <doc://com.apple.documentation/documentation/callkit>
     * framework by calling the
     * <doc://com.apple.documentation/documentation/callkit/cxprovider/1930694-reportnewincomingcallwithuuid>
     * method of your app's <doc://com.apple.documentation/documentation/callkit/cxprovider>
     * object. When you call that method, the system displays the standard incoming call
     * interface to the user unless an error occurs. For example, the system reports an
     * error if the user enabled Do Not Disturb. You may establish a connection to your
     * VoIP server in tandem with notify CallKit.
     * 
     * > Important: On iOS 13.0 and later, if you fail to report a call to CallKit, the
     * system will terminate your app. Repeatedly failing to report calls may cause the
     * system to stop delivering any more VoIP push notifications to your app. If you want
     * to initiate a VoIP call without using CallKit,
     * register for push notifications using the User Notifications
     * framework instead of PushKit. For more information, see
     * <doc://com.apple.documentation/documentation/usernotifications>.
     * 
     * - Parameters:
     * - registry: The ``PushKit/PKPushRegistry`` instance responsible for the delegate callback.
     * - payload: The push payload sent by a developer via APNs server API.
     * - type: This is a ``PushKit/PKPushType`` constant, which is present in `[registry desiredPushTypes]`.
     * - completion: The notification's completion handler. Execute this block when you finish processing the
     * notification.
     * 
     * 
     * API-Since: 11.0
     */
    @Generated
    @IsOptional
    @Selector("pushRegistry:didReceiveIncomingPushWithPayload:forType:withCompletionHandler:")
    default void pushRegistryDidReceiveIncomingPushWithPayloadForTypeWithCompletionHandler(
            @NotNull PKPushRegistry registry, @NotNull PKPushPayload payload, @NotNull String type,
            @NotNull @ObjCBlock(name = "call_pushRegistryDidReceiveIncomingPushWithPayloadForTypeWithCompletionHandler") Block_pushRegistryDidReceiveIncomingPushWithPayloadForTypeWithCompletionHandler completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pushRegistryDidReceiveIncomingPushWithPayloadForTypeWithCompletionHandler {
        @Generated
        void call_pushRegistryDidReceiveIncomingPushWithPayloadForTypeWithCompletionHandler();
    }
}
