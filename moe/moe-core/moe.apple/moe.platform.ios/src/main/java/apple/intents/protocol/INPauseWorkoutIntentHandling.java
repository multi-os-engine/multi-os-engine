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

import apple.intents.INPauseWorkoutIntent;
import apple.intents.INPauseWorkoutIntentResponse;
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
@ObjCProtocolName("INPauseWorkoutIntentHandling")
public interface INPauseWorkoutIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmPauseWorkout:completion:")
    default void confirmPauseWorkoutCompletion(INPauseWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmPauseWorkoutCompletion") Block_confirmPauseWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handlePauseWorkout:completion:")
    void handlePauseWorkoutCompletion(INPauseWorkoutIntent intent,
            @ObjCBlock(name = "call_handlePauseWorkoutCompletion") Block_handlePauseWorkoutCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveWorkoutNameForPauseWorkout:withCompletion:")
    default void resolveWorkoutNameForPauseWorkoutWithCompletion(INPauseWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutNameForPauseWorkoutWithCompletion") Block_resolveWorkoutNameForPauseWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmPauseWorkoutCompletion {
        @Generated
        void call_confirmPauseWorkoutCompletion(INPauseWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handlePauseWorkoutCompletion {
        @Generated
        void call_handlePauseWorkoutCompletion(INPauseWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForPauseWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForPauseWorkoutWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
