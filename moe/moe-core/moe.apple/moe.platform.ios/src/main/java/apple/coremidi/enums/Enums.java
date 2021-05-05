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

@Generated
public final class Enums {
    @Generated public static final int kMIDIThruConnection_MaxEndpoints = 0x00000008;
    @Generated public static final int kMIDIInvalidClient = 0xFFFFD5B2;
    @Generated public static final int kMIDIInvalidPort = 0xFFFFD5B1;
    @Generated public static final int kMIDIWrongEndpointType = 0xFFFFD5B0;
    @Generated public static final int kMIDINoConnection = 0xFFFFD5AF;
    @Generated public static final int kMIDIUnknownEndpoint = 0xFFFFD5AE;
    @Generated public static final int kMIDIUnknownProperty = 0xFFFFD5AD;
    @Generated public static final int kMIDIWrongPropertyType = 0xFFFFD5AC;
    @Generated public static final int kMIDINoCurrentSetup = 0xFFFFD5AB;
    @Generated public static final int kMIDIMessageSendErr = 0xFFFFD5AA;
    @Generated public static final int kMIDIServerStartErr = 0xFFFFD5A9;
    @Generated public static final int kMIDISetupFormatErr = 0xFFFFD5A8;
    @Generated public static final int kMIDIWrongThread = 0xFFFFD5A7;
    @Generated public static final int kMIDIObjectNotFound = 0xFFFFD5A6;
    @Generated public static final int kMIDIIDNotUnique = 0xFFFFD5A5;
    @Generated public static final int kMIDINotPermitted = 0xFFFFD5A4;
    @Generated public static final int kMIDIInvalidUniqueID = 0x00000000;

    @Generated
    private Enums() {
    }

    @Generated public static final int kMIDIUnknownError = 0xFFFFD5A3;
    /**
     * no attribute data
     */
    @Generated public static final int kMIDINoteAttributeNone = 0x00000000;
    /**
     * Manufacturer-specific = unknown
     */
    @Generated public static final int kMIDINoteAttributeManufacturerSpecific = 0x00000001;
    /**
     * MIDI-CI profile-specific data
     */
    @Generated public static final int kMIDINoteAttributeProfileSpecific = 0x00000002;
    /**
     * Pitch 7.9
     */
    @Generated public static final int kMIDINoteAttributePitch = 0x00000003;
}
