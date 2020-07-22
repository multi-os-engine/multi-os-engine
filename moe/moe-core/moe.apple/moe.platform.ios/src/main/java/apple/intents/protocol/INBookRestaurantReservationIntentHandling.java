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
    @Generated
    @IsOptional
    @Selector("confirmBookRestaurantReservation:completion:")
    default void confirmBookRestaurantReservationCompletion(INBookRestaurantReservationIntent intent,
            @ObjCBlock(name = "call_confirmBookRestaurantReservationCompletion") Block_confirmBookRestaurantReservationCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

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
