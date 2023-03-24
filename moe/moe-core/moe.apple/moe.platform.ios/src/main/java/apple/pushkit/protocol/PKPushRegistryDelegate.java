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

@Generated
@Library("PushKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("PKPushRegistryDelegate")
public interface PKPushRegistryDelegate {
    /**
     * pushRegistry:didInvalidatePushTokenForType:
     * 
     * This method is invoked if a previously provided push token is no longer valid for use. No action is
     * necessary to rerequest registration. This feedback can be used to update an app's server to no longer
     * send push notifications of the specified type to this device.
     * 
     * @param registry
     *                 The PKPushRegistry instance responsible for the delegate callback.
     * @param type
     *                 This is a PKPushType constant which is present in [registry desiredPushTypes].
     */
    @Generated
    @IsOptional
    @Selector("pushRegistry:didInvalidatePushTokenForType:")
    default void pushRegistryDidInvalidatePushTokenForType(@NotNull PKPushRegistry registry, @NotNull String type) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * pushRegistry:didReceiveIncomingPushWithPayload:forType:
     * 
     * This method is invoked when a push notification has been received for the specified PKPushType.
     * 
     * @param registry
     *                 The PKPushRegistry instance responsible for the delegate callback.
     * @param payload
     *                 The push payload sent by a developer via APNS server API.
     * @param type
     *                 This is a PKPushType constant which is present in [registry desiredPushTypes].
     * 
     *                 API-Since: 8.0
     *                 Deprecated-Since: 11.0
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
     * pushRegistry:didUpdatePushCredentials:forType:
     * 
     * This method is invoked when new credentials (including push token) have been received for the specified
     * PKPushType.
     * 
     * @param registry
     *                        The PKPushRegistry instance responsible for the delegate callback.
     * @param pushCredentials
     *                        The push credentials that can be used to send pushes to the device for the specified
     *                        PKPushType.
     * @param type
     *                        This is a PKPushType constant which is present in [registry desiredPushTypes].
     */
    @Generated
    @Selector("pushRegistry:didUpdatePushCredentials:forType:")
    void pushRegistryDidUpdatePushCredentialsForType(@NotNull PKPushRegistry registry,
            @NotNull PKPushCredentials pushCredentials, @NotNull String type);

    /**
     * pushRegistry:didReceiveIncomingPushWithPayload:forType:withCompletionHandler:
     * 
     * This method is invoked when a push notification has been received for the specified PKPushType.
     * 
     * @param registry
     *                   The PKPushRegistry instance responsible for the delegate callback.
     * @param payload
     *                   The push payload sent by a developer via APNS server API.
     * @param type
     *                   This is a PKPushType constant which is present in [registry desiredPushTypes].
     * @param completion
     *                   This completion handler should be called to signify the completion of payload processing.
     * 
     *                   API-Since: 11.0
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
