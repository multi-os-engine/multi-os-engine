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

import apple.intents.INDateComponentsRangeResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INPlacemarkResolutionResult;
import apple.intents.INRequestRideIntent;
import apple.intents.INRequestRideIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
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
@ObjCProtocolName("INRequestRideIntentHandling")
public interface INRequestRideIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmRequestRide:completion:")
    default void confirmRequestRideCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_confirmRequestRideCompletion") Block_confirmRequestRideCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleRequestRide:completion:")
    void handleRequestRideCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_handleRequestRideCompletion") Block_handleRequestRideCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveDropOffLocationForRequestRide:withCompletion:")
    default void resolveDropOffLocationForRequestRideWithCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_resolveDropOffLocationForRequestRideWithCompletion") Block_resolveDropOffLocationForRequestRideWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePartySizeForRequestRide:withCompletion:")
    default void resolvePartySizeForRequestRideWithCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_resolvePartySizeForRequestRideWithCompletion") Block_resolvePartySizeForRequestRideWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePickupLocationForRequestRide:withCompletion:")
    default void resolvePickupLocationForRequestRideWithCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_resolvePickupLocationForRequestRideWithCompletion") Block_resolvePickupLocationForRequestRideWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRideOptionNameForRequestRide:withCompletion:")
    default void resolveRideOptionNameForRequestRideWithCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_resolveRideOptionNameForRequestRideWithCompletion") Block_resolveRideOptionNameForRequestRideWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmRequestRideCompletion {
        @Generated
        void call_confirmRequestRideCompletion(INRequestRideIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleRequestRideCompletion {
        @Generated
        void call_handleRequestRideCompletion(INRequestRideIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDropOffLocationForRequestRideWithCompletion {
        @Generated
        void call_resolveDropOffLocationForRequestRideWithCompletion(INPlacemarkResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePartySizeForRequestRideWithCompletion {
        @Generated
        void call_resolvePartySizeForRequestRideWithCompletion(INIntegerResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePickupLocationForRequestRideWithCompletion {
        @Generated
        void call_resolvePickupLocationForRequestRideWithCompletion(INPlacemarkResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRideOptionNameForRequestRideWithCompletion {
        @Generated
        void call_resolveRideOptionNameForRequestRideWithCompletion(INSpeakableStringResolutionResult arg0);
    }

    @Generated
    @IsOptional
    @Selector("resolveScheduledPickupTimeForRequestRide:withCompletion:")
    default void resolveScheduledPickupTimeForRequestRideWithCompletion(INRequestRideIntent intent,
            @ObjCBlock(name = "call_resolveScheduledPickupTimeForRequestRideWithCompletion") Block_resolveScheduledPickupTimeForRequestRideWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveScheduledPickupTimeForRequestRideWithCompletion {
        @Generated
        void call_resolveScheduledPickupTimeForRequestRideWithCompletion(INDateComponentsRangeResolutionResult arg0);
    }
}
