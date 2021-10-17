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

import apple.intents.INGetAvailableRestaurantReservationBookingDefaultsIntent;
import apple.intents.INGetAvailableRestaurantReservationBookingDefaultsIntentResponse;
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
@ObjCProtocolName("INGetAvailableRestaurantReservationBookingDefaultsIntentHandling")
public interface INGetAvailableRestaurantReservationBookingDefaultsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * These methods are called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INGetAvailableRestaurantReservationBookingDefaultsIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * @see INGetAvailableRestaurantReservationBookingDefaultsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmGetAvailableRestaurantReservationBookingDefaults:completion:")
    default void confirmGetAvailableRestaurantReservationBookingDefaultsCompletion(
            INGetAvailableRestaurantReservationBookingDefaultsIntent intent,
            @ObjCBlock(name = "call_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion") Block_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INGetAvailableRestaurantReservationBookingDefaultsIntent that's passed in
     * <p>
     * This method is called to actually execute the intent, the app must return a response for this intent and an NSUserActivity capturing the state that the app must be restored to at the end of handling this intent
     *
     * @param intent     The input intent
     * @param completion The response handling block to invoke with the response to handling the intent.
     * @see INGetAvailableRestaurantReservationBookingDefaultsIntentResponse
     */
    @Generated
    @Selector("handleGetAvailableRestaurantReservationBookingDefaults:completion:")
    void handleGetAvailableRestaurantReservationBookingDefaultsCompletion(
            INGetAvailableRestaurantReservationBookingDefaultsIntent intent,
            @ObjCBlock(name = "call_handleGetAvailableRestaurantReservationBookingDefaultsCompletion") Block_handleGetAvailableRestaurantReservationBookingDefaultsCompletion completion);

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * These methods are called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INGetAvailableRestaurantReservationBookingDefaultsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("resolveRestaurantForGetAvailableRestaurantReservationBookingDefaults:withCompletion:")
    default void resolveRestaurantForGetAvailableRestaurantReservationBookingDefaultsWithCompletion(
            INGetAvailableRestaurantReservationBookingDefaultsIntent intent,
            @ObjCBlock(name = "call_resolveRestaurantForGetAvailableRestaurantReservationBookingDefaultsWithCompletion") Block_resolveRestaurantForGetAvailableRestaurantReservationBookingDefaultsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion {
        @Generated
        void call_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion(
                INGetAvailableRestaurantReservationBookingDefaultsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetAvailableRestaurantReservationBookingDefaultsCompletion {
        @Generated
        void call_handleGetAvailableRestaurantReservationBookingDefaultsCompletion(
                INGetAvailableRestaurantReservationBookingDefaultsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRestaurantForGetAvailableRestaurantReservationBookingDefaultsWithCompletion {
        @Generated
        void call_resolveRestaurantForGetAvailableRestaurantReservationBookingDefaultsWithCompletion(
                INRestaurantResolutionResult resolutionResult);
    }
}
