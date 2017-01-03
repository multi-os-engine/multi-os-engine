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

import apple.intents.INIntegerResolutionResult;
import apple.intents.INSaveProfileInCarIntent;
import apple.intents.INSaveProfileInCarIntentResponse;
import apple.intents.INStringResolutionResult;
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
@ObjCProtocolName("INSaveProfileInCarIntentHandling")
public interface INSaveProfileInCarIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSaveProfileInCar:completion:")
    default void confirmSaveProfileInCarCompletion(INSaveProfileInCarIntent intent,
            @ObjCBlock(name = "call_confirmSaveProfileInCarCompletion") Block_confirmSaveProfileInCarCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSaveProfileInCar:completion:")
    void handleSaveProfileInCarCompletion(INSaveProfileInCarIntent intent,
            @ObjCBlock(name = "call_handleSaveProfileInCarCompletion") Block_handleSaveProfileInCarCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveProfileNameForSaveProfileInCar:withCompletion:")
    default void resolveProfileNameForSaveProfileInCarWithCompletion(INSaveProfileInCarIntent intent,
            @ObjCBlock(name = "call_resolveProfileNameForSaveProfileInCarWithCompletion") Block_resolveProfileNameForSaveProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("resolveProfileNumberForSaveProfileInCar:withCompletion:")
    default void resolveProfileNumberForSaveProfileInCarWithCompletion(INSaveProfileInCarIntent intent,
            @ObjCBlock(name = "call_resolveProfileNumberForSaveProfileInCarWithCompletion") Block_resolveProfileNumberForSaveProfileInCarWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSaveProfileInCarCompletion {
        @Generated
        void call_confirmSaveProfileInCarCompletion(INSaveProfileInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSaveProfileInCarCompletion {
        @Generated
        void call_handleSaveProfileInCarCompletion(INSaveProfileInCarIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNameForSaveProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNameForSaveProfileInCarWithCompletion(INStringResolutionResult arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveProfileNumberForSaveProfileInCarWithCompletion {
        @Generated
        void call_resolveProfileNumberForSaveProfileInCarWithCompletion(INIntegerResolutionResult arg0);
    }
}
