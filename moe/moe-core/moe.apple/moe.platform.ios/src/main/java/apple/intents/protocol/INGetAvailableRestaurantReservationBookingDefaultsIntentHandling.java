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
    @Generated
    @IsOptional
    @Selector("confirmGetAvailableRestaurantReservationBookingDefaults:completion:")
    default void confirmGetAvailableRestaurantReservationBookingDefaultsCompletion(
            INGetAvailableRestaurantReservationBookingDefaultsIntent intent,
            @ObjCBlock(name = "call_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion") Block_confirmGetAvailableRestaurantReservationBookingDefaultsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleGetAvailableRestaurantReservationBookingDefaults:completion:")
    void handleGetAvailableRestaurantReservationBookingDefaultsCompletion(
            INGetAvailableRestaurantReservationBookingDefaultsIntent intent,
            @ObjCBlock(name = "call_handleGetAvailableRestaurantReservationBookingDefaultsCompletion") Block_handleGetAvailableRestaurantReservationBookingDefaultsCompletion completion);

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
