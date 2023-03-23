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

package apple.intents.protocol;

import apple.intents.INGetRestaurantGuestIntent;
import apple.intents.INGetRestaurantGuestIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetRestaurantGuestIntentHandling")
public interface INGetRestaurantGuestIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * These methods are called prior to asking the app to handle the intent. The app should return a response object
     * that contains additional information about the intent, which may be relevant for the system to show the user
     * prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will
     * assume there is no additional information relevant to this intent.
     * 
     * @param guestIntent The input intent
     * @param completion  The response block contains an INGetRestaurantGuestIntentResponse containing additional
     *                    details about the intent that may be relevant for the system to show the user prior to
     *                    handling.
     * 
     * @see INGetRestaurantGuestIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetRestaurantGuest:completion:")
    default void confirmGetRestaurantGuestCompletion(INGetRestaurantGuestIntent guestIntent,
            @ObjCBlock(name = "call_confirmGetRestaurantGuestCompletion") Block_confirmGetRestaurantGuestCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INGetRestaurantGuestIntent that's passed in
     * 
     * This method is called to actually execute the intent, the app must return a response for this intent and an
     * NSUserActivity capturing the state that the app must be restored to at the end of handling this intent
     * 
     * @param intent     The input intent
     * @param completion The response handling block to invoke with the response to handling the intent.
     * 
     * @see INGetRestaurantGuestIntentResponse
     */
    @Generated
    @Selector("handleGetRestaurantGuest:completion:")
    void handleGetRestaurantGuestCompletion(INGetRestaurantGuestIntent intent,
            @ObjCBlock(name = "call_handleGetRestaurantGuestCompletion") Block_handleGetRestaurantGuestCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetRestaurantGuestCompletion {
        @Generated
        void call_confirmGetRestaurantGuestCompletion(INGetRestaurantGuestIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetRestaurantGuestCompletion {
        @Generated
        void call_handleGetRestaurantGuestCompletion(INGetRestaurantGuestIntentResponse response);
    }
}
