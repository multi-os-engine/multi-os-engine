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
 * [@enum] AudioBalanceFadeType
 * <p>
 * used for mType field of AudioBalanceFade struct
 * [@constant] kAudioBalanceFadeType_MaxUnityGain
 * the gain value never exceeds 1.0, the opposite channel fades out.
 * This can reduce overall loudness when the balance or fade is not in the center.
 * [@constant] kAudioBalanceFadeType_EqualPower
 * The overall loudness remains constant, but gain can exceed 1.0.
 * the gain value is 1.0 when the balance and fade are in the center.
 * From there they can increase to +3dB (1.414) and decrease to -inf dB (0.0).
 */
@Generated
public final class AudioBalanceFadeType {
    @Generated public static final int MaxUnityGain = 0x00000000;
    @Generated public static final int EqualPower = 0x00000001;

    @Generated
    private AudioBalanceFadeType() {
    }
}
