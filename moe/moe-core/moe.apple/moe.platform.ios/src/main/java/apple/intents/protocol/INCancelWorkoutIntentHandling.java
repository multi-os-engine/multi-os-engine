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

import apple.intents.INCancelWorkoutIntent;
import apple.intents.INCancelWorkoutIntentResponse;
import apple.intents.INSpeakableStringResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Protocol to declare support for handling an INCancelWorkoutIntent. By implementing this protocol, a class can provide
 * logic for resolving, confirming and handling the intent.
 * <p>
 * The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and
 * confirmation methods are optional. The handling method is always called last, after resolving and confirming the
 * intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INCancelWorkoutIntentHandling")
public interface INCancelWorkoutIntentHandling {
    /**
     * Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * <p>
     * Called prior to asking the app to handle the intent. The app should return a response object that contains
     * additional information about the intent, which may be relevant for the system to show the user prior to handling.
     * If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no
     * additional information relevant to this intent.
     *
     * @param intent     The input intent
     * @param completion The response block contains an INCancelWorkoutIntentResponse containing additional details
     *                   about the intent that may be relevant for the system to show the user prior to handling.
     * @see INCancelWorkoutIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmCancelWorkout:completion:")
    default void confirmCancelWorkoutCompletion(INCancelWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmCancelWorkoutCompletion") Block_confirmCancelWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Handling method - Execute the task represented by the INCancelWorkoutIntent that's passed in
     * <p>
     * Called to actually execute the intent. The app must return a response for this intent.
     *
     * @param intent     The input intent
     * @param completion The response handling block takes a INCancelWorkoutIntentResponse containing the details of the
     *                   result of having executed the intent
     * @see INCancelWorkoutIntentResponse
     */
    @Generated
    @Selector("handleCancelWorkout:completion:")
    void handleCancelWorkoutCompletion(INCancelWorkoutIntent intent,
            @ObjCBlock(name = "call_handleCancelWorkoutCompletion") Block_handleCancelWorkoutCompletion completion);

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
    @Selector("resolveWorkoutNameForCancelWorkout:withCompletion:")
    default void resolveWorkoutNameForCancelWorkoutWithCompletion(INCancelWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutNameForCancelWorkoutWithCompletion") Block_resolveWorkoutNameForCancelWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmCancelWorkoutCompletion {
        @Generated
        void call_confirmCancelWorkoutCompletion(INCancelWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleCancelWorkoutCompletion {
        @Generated
        void call_handleCancelWorkoutCompletion(INCancelWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForCancelWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForCancelWorkoutWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}
