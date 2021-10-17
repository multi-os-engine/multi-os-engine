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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]		AUParameterAutomationEventType
 * <p>
 * Identifies the different types of parameter automation events.
 * <p>
 * Audio Units may generate parameter changes from their user interfaces. Hosts may attach
 * significance to the beginning and end of a UI gesture (typically touching and releasing
 * a fader). These gestures are conveyed through these types of automation events.
 * <p>
 * [@constant] AUParameterAutomationEventTypeValue
 * The event contains an updated value for the parameter.
 * [@constant] AUParameterAutomationEventTypeTouch
 * The event marks an initial "touch" gesture on a UI element.
 * [@constant] AUParameterAutomationEventTypeRelease
 * The event marks a final "release" gesture on a UI element.
 */
@Generated
public final class AUParameterAutomationEventType {
    @Generated public static final int Value = 0x00000000;
    @Generated public static final int Touch = 0x00000001;
    @Generated public static final int Release = 0x00000002;

    @Generated
    private AUParameterAutomationEventType() {
    }
}
