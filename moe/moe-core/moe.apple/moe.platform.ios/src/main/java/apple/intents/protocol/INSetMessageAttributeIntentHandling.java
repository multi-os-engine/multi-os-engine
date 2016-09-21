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

import apple.intents.INMessageAttributeResolutionResult;
import apple.intents.INSetMessageAttributeIntent;
import apple.intents.INSetMessageAttributeIntentResponse;
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
@ObjCProtocolName("INSetMessageAttributeIntentHandling")
public interface INSetMessageAttributeIntentHandling {
    @Generated
    @IsOptional
    @Selector("confirmSetMessageAttribute:completion:")
    default void confirmSetMessageAttributeCompletion(INSetMessageAttributeIntent intent,
            @ObjCBlock(name = "call_confirmSetMessageAttributeCompletion") Block_confirmSetMessageAttributeCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("handleSetMessageAttribute:completion:")
    void handleSetMessageAttributeCompletion(INSetMessageAttributeIntent intent,
            @ObjCBlock(name = "call_handleSetMessageAttributeCompletion") Block_handleSetMessageAttributeCompletion completion);

    @Generated
    @IsOptional
    @Selector("resolveAttributeForSetMessageAttribute:withCompletion:")
    default void resolveAttributeForSetMessageAttributeWithCompletion(INSetMessageAttributeIntent intent,
            @ObjCBlock(name = "call_resolveAttributeForSetMessageAttributeWithCompletion") Block_resolveAttributeForSetMessageAttributeWithCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_confirmSetMessageAttributeCompletion {
        @Generated
        void call_confirmSetMessageAttributeCompletion(INSetMessageAttributeIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleSetMessageAttributeCompletion {
        @Generated
        void call_handleSetMessageAttributeCompletion(INSetMessageAttributeIntentResponse arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resolveAttributeForSetMessageAttributeWithCompletion {
        @Generated
        void call_resolveAttributeForSetMessageAttributeWithCompletion(INMessageAttributeResolutionResult arg0);
    }
}
