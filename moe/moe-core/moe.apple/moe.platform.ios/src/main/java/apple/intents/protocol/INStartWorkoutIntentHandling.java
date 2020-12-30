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

import apple.intents.INBooleanResolutionResult;
import apple.intents.INDoubleResolutionResult;
import apple.intents.INSpeakableStringResolutionResult;
import apple.intents.INStartWorkoutIntent;
import apple.intents.INStartWorkoutIntentResponse;
import apple.intents.INWorkoutGoalUnitTypeResolutionResult;
import apple.intents.INWorkoutLocationTypeResolutionResult;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @abstract Protocol to declare support for handling an INStartWorkoutIntent. By implementing this protocol, a class can provide logic for resolving, confirming and handling the intent.
 * @discussion The minimum requirement for an implementing class is that it should be able to handle the intent. The resolution and confirmation methods are optional. The handling method is always called last, after resolving and confirming the intent.
 */
@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INStartWorkoutIntentHandling")
public interface INStartWorkoutIntentHandling {
    /**
     * @abstract Confirmation method - Validate that this intent is ready for the next step (i.e. handling)
     * @discussion Called prior to asking the app to handle the intent. The app should return a response object that contains additional information about the intent, which may be relevant for the system to show the user prior to handling. If unimplemented, the system will assume the intent is valid following resolution, and will assume there is no additional information relevant to this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INStartWorkoutIntentResponse containing additional details about the intent that may be relevant for the system to show the user prior to handling.
     * 
     * @see INStartWorkoutIntentResponse
     */
    @Generated
    @IsOptional
    @Selector("confirmStartWorkout:completion:")
    default void confirmStartWorkoutCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmStartWorkoutCompletion") Block_confirmStartWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Handling method - Execute the task represented by the INStartWorkoutIntent that's passed in
     * @discussion Called to actually execute the intent. The app must return a response for this intent.
     * 
     * @param  intent The input intent
     * @param  completion The response handling block takes a INStartWorkoutIntentResponse containing the details of the result of having executed the intent
     * 
     * @see  INStartWorkoutIntentResponse
     */
    @Generated
    @Selector("handleStartWorkout:completion:")
    void handleStartWorkoutCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_handleStartWorkoutCompletion") Block_handleStartWorkoutCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveGoalValueForStartWorkout:withCompletion:")
    default void resolveGoalValueForStartWorkoutWithCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveGoalValueForStartWorkoutWithCompletion") Block_resolveGoalValueForStartWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveIsOpenEndedForStartWorkout:withCompletion:")
    default void resolveIsOpenEndedForStartWorkoutWithCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveIsOpenEndedForStartWorkoutWithCompletion") Block_resolveIsOpenEndedForStartWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveWorkoutGoalUnitTypeForStartWorkout:withCompletion:")
    default void resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion") Block_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveWorkoutLocationTypeForStartWorkout:withCompletion:")
    default void resolveWorkoutLocationTypeForStartWorkoutWithCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutLocationTypeForStartWorkoutWithCompletion") Block_resolveWorkoutLocationTypeForStartWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * @abstract Resolution methods - Determine if this intent is ready for the next step (confirmation)
     * @discussion Called to make sure the app extension is capable of handling this intent in its current form. This method is for validating if the intent needs any further fleshing out.
     * 
     * @param  intent The input intent
     * @param  completion The response block contains an INIntentResolutionResult for the parameter being resolved
     * 
     * @see INIntentResolutionResult
     */
    @Generated
    @IsOptional
    @Selector("resolveWorkoutNameForStartWorkout:withCompletion:")
    default void resolveWorkoutNameForStartWorkoutWithCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutNameForStartWorkoutWithCompletion") Block_resolveWorkoutNameForStartWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmStartWorkoutCompletion {
        @Generated
        void call_confirmStartWorkoutCompletion(INStartWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartWorkoutCompletion {
        @Generated
        void call_handleStartWorkoutCompletion(INStartWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGoalValueForStartWorkoutWithCompletion {
        @Generated
        void call_resolveGoalValueForStartWorkoutWithCompletion(INDoubleResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveIsOpenEndedForStartWorkoutWithCompletion {
        @Generated
        void call_resolveIsOpenEndedForStartWorkoutWithCompletion(INBooleanResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion(
                INWorkoutGoalUnitTypeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutLocationTypeForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutLocationTypeForStartWorkoutWithCompletion(
                INWorkoutLocationTypeResolutionResult resolutionResult);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForStartWorkoutWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}
