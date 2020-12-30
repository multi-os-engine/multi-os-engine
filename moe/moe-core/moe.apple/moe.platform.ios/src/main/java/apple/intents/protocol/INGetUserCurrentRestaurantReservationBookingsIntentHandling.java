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

import apple.intents.INGetUserCurrentRestaurantReservationBookingsIntent;
import apple.intents.INGetUserCurrentRestaurantReservationBookingsIntentResponse;
import apple.intents.INRestaurantResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INGetUserCurrentRestaurantReservationBookingsIntentHandling")
public interface INGetUserCurrentRestaurantReservationBookingsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * These methods are called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INGetUserCurrentRestaurantReservationBookingsIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INGetUserCurrentRestaurantReservationBookingsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetUserCurrentRestaurantReservationBookings:completion:")
    default void confirmGetUserCurrentRestaurantReservationBookingsCompletion(
            INGetUserCurrentRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_confirmGetUserCurrentRestaurantReservationBookingsCompletion") Block_confirmGetUserCurrentRestaurantReservationBookingsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INGetUserCurrentRestaurantReservationBookingsIntent that's passed in
     * 
     * This method is called to actually execute the intent, the app must return a response for this intent and an NSUserActivity capturing the state that the app must be restored to at the end of handling this intent
     * 
     * @param  intent The input intent
     * @param  completion The response handling block to invoke with the response to handling the intent.
     * 
     * @see  INGetUserCurrentRestaurantReservationBookingsIntentResponse
     */
    @Generated
    @Selector("handleGetUserCurrentRestaurantReservationBookings:completion:")
    void handleGetUserCurrentRestaurantReservationBookingsCompletion(
            INGetUserCurrentRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_handleGetUserCurrentRestaurantReservationBookingsCompletion") Block_handleGetUserCurrentRestaurantReservationBookingsCompletion completion);

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * These methods are called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INGetUserCurrentRestaurantReservationBookingsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("resolveRestaurantForGetUserCurrentRestaurantReservationBookings:withCompletion:")
    default void resolveRestaurantForGetUserCurrentRestaurantReservationBookingsWithCompletion(
            INGetUserCurrentRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_resolveRestaurantForGetUserCurrentRestaurantReservationBookingsWithCompletion") Block_resolveRestaurantForGetUserCurrentRestaurantReservationBookingsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetUserCurrentRestaurantReservationBookingsCompletion {
        @Generated
        void call_confirmGetUserCurrentRestaurantReservationBookingsCompletion(
                INGetUserCurrentRestaurantReservationBookingsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetUserCurrentRestaurantReservationBookingsCompletion {
        @Generated
        void call_handleGetUserCurrentRestaurantReservationBookingsCompletion(
                INGetUserCurrentRestaurantReservationBookingsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRestaurantForGetUserCurrentRestaurantReservationBookingsWithCompletion {
        @Generated
        void call_resolveRestaurantForGetUserCurrentRestaurantReservationBookingsWithCompletion(
                INRestaurantResolutionResult resolutionResult);
    }
}
