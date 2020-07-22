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
    @Generated
    @IsOptional
    @Selector("confirmGetUserCurrentRestaurantReservationBookings:completion:")
    default void confirmGetUserCurrentRestaurantReservationBookingsCompletion(
            INGetUserCurrentRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_confirmGetUserCurrentRestaurantReservationBookingsCompletion") Block_confirmGetUserCurrentRestaurantReservationBookingsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleGetUserCurrentRestaurantReservationBookings:completion:")
    void handleGetUserCurrentRestaurantReservationBookingsCompletion(
            INGetUserCurrentRestaurantReservationBookingsIntent intent,
            @ObjCBlock(name = "call_handleGetUserCurrentRestaurantReservationBookingsCompletion") Block_handleGetUserCurrentRestaurantReservationBookingsCompletion completion);

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
