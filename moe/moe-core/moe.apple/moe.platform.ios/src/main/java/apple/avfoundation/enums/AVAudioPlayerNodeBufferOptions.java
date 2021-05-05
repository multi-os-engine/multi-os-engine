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
 * [@enum] AVAudioPlayerNodeBufferOptions
 * 
 * Options controlling buffer scheduling.
 * 
 * [@constant]	AVAudioPlayerNodeBufferLoops
 * 				The buffer loops indefinitely.
 * [@constant]	AVAudioPlayerNodeBufferInterrupts
 * 				The buffer interrupts any buffer already playing.
 * [@constant]	AVAudioPlayerNodeBufferInterruptsAtLoop
 * 				The buffer interrupts any buffer already playing, at its loop point.
 * 
 * API_AVAILABLE(macos(10.10), ios(8.0), watchos(2.0), tvos(9.0))
 */
@Generated
public final class AVAudioPlayerNodeBufferOptions {
    /**
     * 0x01
     */
    @Generated @NUInt public static final long Loops = 0x0000000000000001L;
    /**
     * 0x02
     */
    @Generated @NUInt public static final long Interrupts = 0x0000000000000002L;
    /**
     * 0x04
     */
    @Generated @NUInt public static final long InterruptsAtLoop = 0x0000000000000004L;

    @Generated
    private AVAudioPlayerNodeBufferOptions() {
    }
}
