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

import apple.intents.INEndWorkoutIntent;
import apple.intents.INEndWorkoutIntentResponse;
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
@ObjCProtocolName("INEndWorkoutIntentHandling")
public interface INEndWorkoutIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmEndWorkout:completion:")
    default void confirmEndWorkoutCompletion(INEndWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmEndWorkoutCompletion") Block_confirmEndWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleEndWorkout:completion:")
    void handleEndWorkoutCompletion(INEndWorkoutIntent intent,
            @ObjCBlock(name = "call_handleEndWorkoutCompletion") Block_handleEndWorkoutCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveWorkoutNameForEndWorkout:withCompletion:")
    default void resolveWorkoutNameForEndWorkoutWithCompletion(INEndWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutNameForEndWorkoutWithCompletion") Block_resolveWorkoutNameForEndWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmEndWorkoutCompletion {
        @Generated
        void call_confirmEndWorkoutCompletion(INEndWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleEndWorkoutCompletion {
        @Generated
        void call_handleEndWorkoutCompletion(INEndWorkoutIntentResponse response);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForEndWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForEndWorkoutWithCompletion(INSpeakableStringResolutionResult resolutionResult);
    }
}
