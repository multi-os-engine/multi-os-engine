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

package apple.homekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * This enumeration describes the setting for audio on the recipient of the camera stream.
 */
@Generated
public final class HMCameraAudioStreamSetting {
    /**
     * Muted for incoming and outgoing audio.
     */
    @Generated @NUInt public static final long Muted = 0x0000000000000001L;
    /**
     * Only incoming audio is allowed.
     */
    @Generated @NUInt public static final long IncomingAudioAllowed = 0x0000000000000002L;
    /**
     * Bidirectional audio is allowed.
     */
    @Generated @NUInt public static final long BidirectionalAudioAllowed = 0x0000000000000003L;

    @Generated
    private HMCameraAudioStreamSetting() {
    }
}
