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

import apple.intents.INBookRestaurantReservationIntent;
import apple.intents.INBookRestaurantReservationIntentResponse;
import apple.intents.INDateComponentsResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRestaurantGuestResolutionResult;
import apple.intents.INRestaurantResolutionResult;
import apple.intents.INStringResolutionResult;
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
@ObjCProtocolName("INBookRestaurantReservationIntentHandling")
public interface INBookRestaurantReservationIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * These methods are called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INBookRestaurantReservationIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INEndWorkoutIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmBookRestaurantReservation:completion:")
    default void confirmBookRestaurantReservationCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_confirmBookRestaurantReservationCompletion") Block_confirmBookRestaurantReservationCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INBookRestaurantReservationIntent that's passed in
     * 
     * This method is called to actually execute the intent, the app must return a response for this intent and an NSUserActivity capturing the state that the app must be restored to at the end of handling this intent
     * 
     * @param  intent The input intent
     * @param  completion The response handling block to invoke with the response to handling the intent.
     * 
     * @see  INBookRestaurantReservationIntentResponse
     */
    @Generated
    @Selector("handleBookRestaurantReservation:completion:")
    void handleBookRestaurantReservationCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_handleBookRestaurantReservationCompletion") Block_handleBookRestaurantReservationCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveBookingDateComponentsForBookRestaurantReservation:withCompletion:")
    default void resolveBookingDateComponentsForBookRestaurantReservationWithCompletion(
            INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_resolveBookingDateComponentsForBookRestaurantReservationWithCompletion") Block_resolveBookingDateComponentsForBookRestaurantReservationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveGuestForBookRestaurantReservation:withCompletion:")
    default void resolveGuestForBookRestaurantReservationWithCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_resolveGuestForBookRestaurantReservationWithCompletion") Block_resolveGuestForBookRestaurantReservationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveGuestProvidedSpecialRequestTextForBookRestaurantReservation:withCompletion:")
    default void resolveGuestProvidedSpecialRequestTextForBookRestaurantReservationWithCompletion(
            INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_resolveGuestProvidedSpecialRequestTextForBookRestaurantReservationWithCompletion") Block_resolveGuestProvidedSpecialRequestTextForBookRestaurantReservationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePartySizeForBookRestaurantReservation:withCompletion:")
    default void resolvePartySizeForBookRestaurantReservationWithCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_resolvePartySizeForBookRestaurantReservationWithCompletion") Block_resolvePartySizeForBookRestaurantReservationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * These methods are called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveRestaurantForBookRestaurantReservation:withCompletion:")
    default void resolveRestaurantForBookRestaurantReservationWithCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_resolveRestaurantForBookRestaurantReservationWithCompletion") Block_resolveRestaurantForBookRestaurantReservationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmBookRestaurantReservationCompletion {
        @Generated
        void call_confirmBookRestaurantReservationCompletion(INBookRestaurantReservationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBookRestaurantReservationCompletion {
        @Generated
        void call_handleBookRestaurantReservationCompletion(INBookRestaurantReservationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveBookingDateComponentsForBookRestaurantReservationWithCompletion {
        @Generated
        void call_resolveBookingDateComponentsForBookRestaurantReservationWithCompletion(
                INDateComponentsResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGuestForBookRestaurantReservationWithCompletion {
        @Generated
        void call_resolveGuestForBookRestaurantReservationWithCompletion(
                INRestaurantGuestResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGuestProvidedSpecialRequestTextForBookRestaurantReservationWithCompletion {
        @Generated
        void call_resolveGuestProvidedSpecialRequestTextForBookRestaurantReservationWithCompletion(
                INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePartySizeForBookRestaurantReservationWithCompletion {
        @Generated
        void call_resolvePartySizeForBookRestaurantReservationWithCompletion(
                INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRestaurantForBookRestaurantReservationWithCompletion {
        @Generated
        void call_resolveRestaurantForBookRestaurantReservationWithCompletion(
                INRestaurantResolutionResult resolutionResult);
    }
}
