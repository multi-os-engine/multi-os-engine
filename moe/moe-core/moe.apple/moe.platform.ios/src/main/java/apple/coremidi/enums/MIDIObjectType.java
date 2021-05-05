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
 * [@enum]			MIDIObjectType
 * 
 * Signifies the type of a MIDIObject.
 * 
 * 	Signifies the real type of a MIDIObjectRef instance.
 */
@Generated
public final class MIDIObjectType {
    @Generated public static final int Other = 0xFFFFFFFF;
    @Generated public static final int Device = 0x00000000;
    @Generated public static final int Entity = 0x00000001;
    @Generated public static final int Source = 0x00000002;
    @Generated public static final int Destination = 0x00000003;
    @Generated public static final int ExternalDevice = 0x00000010;
    @Generated public static final int ExternalEntity = 0x00000011;
    @Generated public static final int ExternalSource = 0x00000012;
    @Generated public static final int ExternalDestination = 0x00000013;

    @Generated
    private MIDIObjectType() {
    }
}
