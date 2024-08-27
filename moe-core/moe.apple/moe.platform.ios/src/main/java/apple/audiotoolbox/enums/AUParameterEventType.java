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
 * [@enum] AUParameterEventType
 * 
 * The type of a parameter event (see AudioUnitScheduleParameter)
 * 
 * [@constant] kParameterEvent_Immediate
 * The parameter event describes an immediate change to the parameter value to
 * the new value
 * [@constant] kParameterEvent_Ramped
 * The parameter event describes a change to the parameter value that should
 * be applied over the specified period of time
 */
@Generated
public final class AUParameterEventType {
    @Generated public static final int Immediate = 0x00000001;
    @Generated public static final int Ramped = 0x00000002;

    @Generated
    private AUParameterEventType() {
    }
}
