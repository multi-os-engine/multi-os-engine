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
 * [@enum]		AudioBytePacketTranslation Flags
 * <p>
 * flags for the AudioBytePacketTranslation mFlags field
 * <p>
 * There is currently only one flag.
 * <p>
 * [@constant]   kBytePacketTranslationFlag_IsEstimate
 * If the set then the result value is an estimate.
 */
@Generated
public final class AudioBytePacketTranslationFlags {
    @Generated public static final int kBytePacketTranslationFlag_IsEstimate = 0x00000001;

    @Generated
    private AudioBytePacketTranslationFlags() {
    }
}
