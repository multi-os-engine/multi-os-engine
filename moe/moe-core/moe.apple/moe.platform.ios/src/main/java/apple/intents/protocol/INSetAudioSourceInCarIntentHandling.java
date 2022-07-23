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

import apple.intents.INCarAudioSourceResolutionResult;
import apple.intents.INRelativeReferenceResolutionResult;
import apple.intents.INSetAudioSourceInCarIntent;
import apple.intents.INSetAudioSourceInCarIntentResponse;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INSetAudioSourceInCarIntent. By implementing this protocol, a class can
 * provide logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INSetAudioSourceInCarIntentHandling")
public interface INSetAudioSourceInCarIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INSetAudioSourceInCarIntentResponse containing additional
     *                   details about the intent that may be relevant for the system to show the user prior to
     *                   handling.
     * @see INSetAudioSourceInCarIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmSetAudioSourceInCar:completion:")
    default void confirmSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_confirmSetAudioSourceInCarCompletion") Block_confirmSetAudioSourceInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INSetAudioSourceInCarIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INSetAudioSourceInCarIntentResponse containing the details
     *                   of the result of having executed the intent
     * @see INSetAudioSourceInCarIntentResponse
     */
    @Generated
    @Selector("handleSetAudioSourceInCar:completion:")
    void handleSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_handleSetAudioSourceInCarCompletion") Block_handleSetAudioSourceInCarCompletion completion);

    /**
     * Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * <p>
     * Called to make sure the app extension is capable of handling this intent in its current form. This method is for
     * validating if the intent needs any further fleshing out.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveAudioSourceForSetAudioSourceInCar:withCompletion:")
    default void resolveAudioSourceForSetAudioSourceInCarWithCompletion(INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_resolveAudioSourceForSetAudioSourceInCarWithCompletion") Block_resolveAudioSourceForSetAudioSourceInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveRelativeAudioSourceReferenceForSetAudioSourceInCar:withCompletion:")
    default void resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion(
            INSetAudioSourceInCarIntent intent,
            @ObjCBlock(name = "call_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion") Block_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetAudioSourceInCarCompletion {
        @Generated
        void call_confirmSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetAudioSourceInCarCompletion {
        @Generated
        void call_handleSetAudioSourceInCarCompletion(INSetAudioSourceInCarIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAudioSourceForSetAudioSourceInCarWithCompletion {
        @Generated
        void call_resolveAudioSourceForSetAudioSourceInCarWithCompletion(
                INCarAudioSourceResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion {
        @Generated
        void call_resolveRelativeAudioSourceReferenceForSetAudioSourceInCarWithCompletion(
                INRelativeReferenceResolutionResult resolutionResult);
    }
}
