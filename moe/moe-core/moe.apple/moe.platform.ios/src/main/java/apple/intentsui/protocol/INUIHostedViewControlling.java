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

package apple.intentsui.protocol;

import apple.coregraphics.struct.CGSize;
import apple.foundation.NSSet;
import apple.intents.INInteraction;
import apple.intents.INParameter;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("IntentsUI")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("INUIHostedViewControlling")
public interface INUIHostedViewControlling {
    @IsOptional
    @Generated
    @Selector("configureWithInteraction:context:completion:")
    default void configureWithInteractionContextCompletion(INInteraction interaction, @NUInt long context,
            @ObjCBlock(name = "call_configureWithInteractionContextCompletion") Block_configureWithInteractionContextCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureWithInteractionContextCompletion {
        @Generated
        void call_configureWithInteractionContextCompletion(@ByValue CGSize arg0);
    }

    @Generated
    @IsOptional
    @Selector("configureViewForParameters:ofInteraction:interactiveBehavior:context:completion:")
    default void configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion(
            NSSet<? extends INParameter> parameters, INInteraction interaction, @NUInt long interactiveBehavior,
            @NUInt long context,
            @ObjCBlock(name = "call_configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion") Block_configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion completion) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion {
        @Generated
        void call_configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion(boolean arg0,
                NSSet<? extends INParameter> arg1, @ByValue CGSize arg2);
    }
}
