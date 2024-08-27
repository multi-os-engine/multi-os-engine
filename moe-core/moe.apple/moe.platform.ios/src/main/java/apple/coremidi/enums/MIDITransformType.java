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

package apple.coremidi.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MIDITransformType
 * 
 * Values specifying a type of MIDI transformation, as found in the transform member of MIDITransform.
 * 
 * [@constant] kMIDITransform_None
 * no transformation (param unused)
 * [@constant] kMIDITransform_FilterOut
 * filter out the specified event type (param unused)
 * [@constant] kMIDITransform_MapControl
 * transform one control number to another; param is destination control number
 * [@constant] kMIDITransform_Add
 * add param to values
 * [@constant] kMIDITransform_Scale
 * multiple value by the fixed point number in param, which is in fixed point: bbbb.bbbb bbbb bbbb
 * [@constant] kMIDITransform_MinValue
 * the value's minimum value is param
 * [@constant] kMIDITransform_MaxValue
 * the value's maximum value is param
 * [@constant] kMIDITransform_MapValue
 * transform the value using a map; param is the index of the map in the connection's array of maps.
 */
@Generated
public final class MIDITransformType {
    @Generated public static final char None = 0x0000;
    @Generated public static final char FilterOut = 0x0001;
    @Generated public static final char MapControl = 0x0002;
    @Generated public static final char Add = 0x0008;
    @Generated public static final char Scale = 0x0009;
    @Generated public static final char MinValue = 0x000A;
    @Generated public static final char MaxValue = 0x000B;
    @Generated public static final char MapValue = 0x000C;

    @Generated
    private MIDITransformType() {
    }
}
