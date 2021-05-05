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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]		AVAudioCommonFormat
 * [@constant]	AVAudioOtherFormat
 * 				A format other than one of the common ones below.
 * [@constant]	AVAudioPCMFormatFloat32
 * 				Native-endian floats (this is the standard format).
 * [@constant]	AVAudioPCMFormatFloat64
 * 				Native-endian doubles.
 * [@constant]	AVAudioPCMFormatInt16
 * 				Signed 16-bit native-endian integers.
 * [@constant]	AVAudioPCMFormatInt32
 * 				Signed 32-bit native-endian integers.
 */
@Generated
public final class AVAudioCommonFormat {
    @Generated @NUInt public static final long OtherFormat = 0x0000000000000000L;
    @Generated @NUInt public static final long PCMFormatFloat32 = 0x0000000000000001L;
    @Generated @NUInt public static final long PCMFormatFloat64 = 0x0000000000000002L;
    @Generated @NUInt public static final long PCMFormatInt16 = 0x0000000000000003L;
    @Generated @NUInt public static final long PCMFormatInt32 = 0x0000000000000004L;

    @Generated
    private AVAudioCommonFormat() {
    }
}
