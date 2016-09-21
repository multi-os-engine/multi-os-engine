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

@Generated
@Library("Intents")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INStartWorkoutIntentHandling")
public interface INStartWorkoutIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmStartWorkout:completion:")
    default void confirmStartWorkoutCompletion(INStartWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmStartWorkoutCompletion") Block_confirmStartWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

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
        void call_confirmStartWorkoutCompletion(INStartWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleStartWorkoutCompletion {
        @Generated
        void call_handleStartWorkoutCompletion(INStartWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveGoalValueForStartWorkoutWithCompletion {
        @Generated
        void call_resolveGoalValueForStartWorkoutWithCompletion(INDoubleResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveIsOpenEndedForStartWorkoutWithCompletion {
        @Generated
        void call_resolveIsOpenEndedForStartWorkoutWithCompletion(INBooleanResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutGoalUnitTypeForStartWorkoutWithCompletion(INWorkoutGoalUnitTypeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutLocationTypeForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutLocationTypeForStartWorkoutWithCompletion(INWorkoutLocationTypeResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForStartWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForStartWorkoutWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
