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

import apple.intents.INListRideOptionsIntent;
import apple.intents.INListRideOptionsIntentResponse;
import apple.intents.INPlacemarkResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Protocol to declare support for handling an INListRideOptionsIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INListRideOptionsIntentHandling")
public interface INListRideOptionsIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INListRideOptionsIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INListRideOptionsIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmListRideOptions:completion:")
    default void confirmListRideOptionsCompletion(@NotNull INListRideOptionsIntent intent,
            @NotNull @ObjCBlock(name = "call_confirmListRideOptionsCompletion") Block_confirmListRideOptionsCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INListRideOptionsIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INListRideOptionsIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INListRideOptionsIntentResponse
     */
    @Generated
    @Selector("handleListRideOptions:completion:")
    void handleListRideOptionsCompletion(@NotNull INListRideOptionsIntent intent,
            @NotNull @ObjCBlock(name = "call_handleListRideOptionsCompletion") Block_handleListRideOptionsCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveDropOffLocationForListRideOptions:withCompletion:")
    default void resolveDropOffLocationForListRideOptionsWithCompletion(@NotNull INListRideOptionsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolveDropOffLocationForListRideOptionsWithCompletion") Block_resolveDropOffLocationForListRideOptionsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * 
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolvePickupLocationForListRideOptions:withCompletion:")
    default void resolvePickupLocationForListRideOptionsWithCompletion(@NotNull INListRideOptionsIntent intent,
            @NotNull @ObjCBlock(name = "call_resolvePickupLocationForListRideOptionsWithCompletion") Block_resolvePickupLocationForListRideOptionsWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmListRideOptionsCompletion {
        @Generated
        void call_confirmListRideOptionsCompletion(@NotNull INListRideOptionsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleListRideOptionsCompletion {
        @Generated
        void call_handleListRideOptionsCompletion(@NotNull INListRideOptionsIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveDropOffLocationForListRideOptionsWithCompletion {
        @Generated
        void call_resolveDropOffLocationForListRideOptionsWithCompletion(
                @NotNull INPlacemarkResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePickupLocationForListRideOptionsWithCompletion {
        @Generated
        void call_resolvePickupLocationForListRideOptionsWithCompletion(
                @NotNull INPlacemarkResolutionResult resolutionResult);
    }
}
