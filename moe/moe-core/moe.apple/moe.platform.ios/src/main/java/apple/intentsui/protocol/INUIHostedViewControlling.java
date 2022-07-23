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
    /**
     * Perform configuration of UI based on the provided INInteraction object.
     * <p>
     * When configuration is complete for the given interaction, the hosted view controller should call the completion
     * block with its view's desired size. This size will be constrained between hostedViewMinimumAllowedSize and
     * hostedViewMaximumAllowedSize of the extension context.
     *
     * @param interaction The input interaction
     * @param context     The hosting context for this interaction. The hosted view will be displayed alongside this
     *                    context -- for instance, a Siri result snippet, or a place card within Maps.
     * @param completion  The response handling block takes one parameter corresponding the optional desiredSize
     *                    property of the INUIHostedViewControlling protocol
     * @see INInteraction
     */
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
        void call_configureWithInteractionContextCompletion(@ByValue CGSize desiredSize);
    }

    /**
     * Perform configuration of UI based on the provided INInteraction and INParameter objects.
     * <p>
     * When configuration is complete for the given parameters and interaction, the hosted view controller should call
     * the completion block with whether it was successful, the parameters it configured itself with, and its view's
     * desired size. The size of the view will ultimately be constrained between hostedViewMinimumAllowedSize and
     * hostedViewMaximumAllowedSize of the extension context.
     *
     * @param parameters          The parameters of the interaction for which to configure the view
     * @param interaction         The input interaction
     * @param interactiveBehavior The behavior that will be driven by user interaction of this view
     * @param context             The hosting context for this interaction. The hosted view will be displayed
     *                            within/alongside this context -- for instance, a Siri result snippet, or a place card
     *                            within Maps.
     * @param completion          The response handling block takes the following: A) a success boolean, which tells the
     *                            hosted view context if this view was successfully configured, B) the set of parameters
     *                            that this view was successfully configured for, and C) a desiredSize for this view to
     *                            be sized at within the hosted view context.
     * @see INParameter
     * @see INInteraction
     */
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
        void call_configureViewForParametersOfInteractionInteractiveBehaviorContextCompletion(boolean success,
                NSSet<? extends INParameter> configuredParameters, @ByValue CGSize desiredSize);
    }
}
