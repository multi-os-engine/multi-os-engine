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

import apple.intents.INResumeWorkoutIntent;
import apple.intents.INResumeWorkoutIntentResponse;
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
@ObjCProtocolName("INResumeWorkoutIntentHandling")
public interface INResumeWorkoutIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmResumeWorkout:completion:")
    default void confirmResumeWorkoutCompletion(INResumeWorkoutIntent intent,
            @ObjCBlock(name = "call_confirmResumeWorkoutCompletion") Block_confirmResumeWorkoutCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleResumeWorkout:completion:")
    void handleResumeWorkoutCompletion(INResumeWorkoutIntent intent,
            @ObjCBlock(name = "call_handleResumeWorkoutCompletion") Block_handleResumeWorkoutCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveWorkoutNameForResumeWorkout:withCompletion:")
    default void resolveWorkoutNameForResumeWorkoutWithCompletion(INResumeWorkoutIntent intent,
            @ObjCBlock(name = "call_resolveWorkoutNameForResumeWorkoutWithCompletion") Block_resolveWorkoutNameForResumeWorkoutWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmResumeWorkoutCompletion {
        @Generated
        void call_confirmResumeWorkoutCompletion(INResumeWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleResumeWorkoutCompletion {
        @Generated
        void call_handleResumeWorkoutCompletion(INResumeWorkoutIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveWorkoutNameForResumeWorkoutWithCompletion {
        @Generated
        void call_resolveWorkoutNameForResumeWorkoutWithCompletion(INSpeakableStringResolutionResult arg0);
    }
}
