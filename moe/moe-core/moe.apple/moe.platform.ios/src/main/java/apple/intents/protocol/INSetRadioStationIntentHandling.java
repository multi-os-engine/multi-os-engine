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

import apple.intents.INDoubleResolutionResult;
import apple.intents.INIntegerResolutionResult;
import apple.intents.INRadioTypeResolutionResult;
import apple.intents.INSetRadioStationIntent;
import apple.intents.INSetRadioStationIntentResponse;
import apple.intents.INStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSetRadioStationIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * 
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 * 
 * API-Since: 10.0
 * Deprecated-Since: 15.0
 * Deprecated-Message: INSetRadioStationIntentHandling is deprecated. There is no replacement.
 */
@Deprecated
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetRadioStationIntentHandling")
public interface INSetRadioStationIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * 
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     * 
     * @param intent     The input intent
     * @param completion The response block contains an INSetRadioStationIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INSetRadioStationIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetRadioStation:completion:")
    default void confirmSetRadioStationCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_confirmSetRadioStationCompletion") Block_confirmSetRadioStationCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSetRadioStationIntent that's passed in
     * 
     * Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetRadioStationIntentResponse containing the details of
     *                   the result of having executed the intent
     * 
     * @see INSetRadioStationIntentResponse
     */
    @Generated
    @Selector("handleSetRadioStation:completion:")
    void handleSetRadioStationCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_handleSetRadioStationCompletion") Block_handleSetRadioStationCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveChannelForSetRadioStation:withCompletion:")
    default void resolveChannelForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveChannelForSetRadioStationWithCompletion") Block_resolveChannelForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveFrequencyForSetRadioStation:withCompletion:")
    default void resolveFrequencyForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveFrequencyForSetRadioStationWithCompletion") Block_resolveFrequencyForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolvePresetNumberForSetRadioStation:withCompletion:")
    default void resolvePresetNumberForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolvePresetNumberForSetRadioStationWithCompletion") Block_resolvePresetNumberForSetRadioStationWithCompletion completion) {
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
    @Selector("resolveRadioTypeForSetRadioStation:withCompletion:")
    default void resolveRadioTypeForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveRadioTypeForSetRadioStationWithCompletion") Block_resolveRadioTypeForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveStationNameForSetRadioStation:withCompletion:")
    default void resolveStationNameForSetRadioStationWithCompletion(INSetRadioStationIntent intent,
            @ObjCBlock(name = "call_resolveStationNameForSetRadioStationWithCompletion") Block_resolveStationNameForSetRadioStationWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetRadioStationCompletion {
        @Generated
        void call_confirmSetRadioStationCompletion(INSetRadioStationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetRadioStationCompletion {
        @Generated
        void call_handleSetRadioStationCompletion(INSetRadioStationIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveChannelForSetRadioStationWithCompletion {
        @Generated
        void call_resolveChannelForSetRadioStationWithCompletion(INStringResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveFrequencyForSetRadioStationWithCompletion {
        @Generated
        void call_resolveFrequencyForSetRadioStationWithCompletion(INDoubleResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolvePresetNumberForSetRadioStationWithCompletion {
        @Generated
        void call_resolvePresetNumberForSetRadioStationWithCompletion(INIntegerResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRadioTypeForSetRadioStationWithCompletion {
        @Generated
        void call_resolveRadioTypeForSetRadioStationWithCompletion(INRadioTypeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveStationNameForSetRadioStationWithCompletion {
        @Generated
        void call_resolveStationNameForSetRadioStationWithCompletion(INStringResolutionResult resolutionResult);
    }
}
