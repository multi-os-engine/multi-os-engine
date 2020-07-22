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

import apple.intents.INDateComponentsResolutionResult;
import apple.intents.INGetAvailableRestaurantReservationBookingsIntent;
import apple.intents.INGetAvailableRestaurantReservationBookingsIntentResponse;
import apple.intents.INIntegerResolutionResult;
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
@ObjCProtocolName("INGetAvailableRestaurantReservationBookingsIntentHandling")
public interface INGetAvailableRestaurantReservationBookingsIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmGetAvailableRestaurantReservationBookings:completion:")
    default void confirmGetAvailableRestaurantReservationBookingsCompletion(
            INGetAvailableRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_confirmGetAvailableRestaurantReservationBookingsCompletion") Block_confirmGetAvailableRestaurantReservationBookingsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleGetAvailableRestaurantReservationBookings:completion:")
    void handleGetAvailableRestaurantReservationBookingsCompletion(
            INGetAvailableRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_handleGetAvailableRestaurantReservationBookingsCompletion") Block_handleGetAvailableRestaurantReservationBookingsCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolvePartySizeForGetAvailableRestaurantReservationBookings:withCompletion:")
    default void resolvePartySizeForGetAvailableRestaurantReservationBookingsWithCompletion(
            INGetAvailableRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_resolvePartySizeForGetAvailableRestaurantReservationBookingsWithCompletion") Block_resolvePartySizeForGetAvailableRestaurantReservationBookingsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookings:withCompletion:")
    default void resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookingsWithCompletion(
            INGetAvailableRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookingsWithCompletion") Block_resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookingsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRestaurantForGetAvailableRestaurantReservationBookings:withCompletion:")
    default void resolveRestaurantForGetAvailableRestaurantReservationBookingsWithCompletion(
            INGetAvailableRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_resolveRestaurantForGetAvailableRestaurantReservationBookingsWithCompletion") Block_resolveRestaurantForGetAvailableRestaurantReservationBookingsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmGetAvailableRestaurantReservationBookingsCompletion {
        @Generated
        void call_confirmGetAvailableRestaurantReservationBookingsCompletion(
                INGetAvailableRestaurantReservationBookingsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleGetAvailableRestaurantReservationBookingsCompletion {
        @Generated
        void call_handleGetAvailableRestaurantReservationBookingsCompletion(
                INGetAvailableRestaurantReservationBookingsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePartySizeForGetAvailableRestaurantReservationBookingsWithCompletion {
        @Generated
        void call_resolvePartySizeForGetAvailableRestaurantReservationBookingsWithCompletion(
                INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookingsWithCompletion {
        @Generated
        void call_resolvePreferredBookingDateComponentsForGetAvailableRestaurantReservationBookingsWithCompletion(
                INDateComponentsResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRestaurantForGetAvailableRestaurantReservationBookingsWithCompletion {
        @Generated
        void call_resolveRestaurantForGetAvailableRestaurantReservationBookingsWithCompletion(
                INRestaurantResolutionResult resolutionResult);
    }
}
