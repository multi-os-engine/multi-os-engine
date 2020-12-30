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
import org.moe.natj.general.ann.NInt;

/**
 * @enum		AVAudioConverterInputStatus
 * @abstract	You must return one of these codes from your AVAudioConverterInputBlock.
 */
@Generated
public final class AVAudioConverterInputStatus {
    /**
     * This is the normal case where you supply data to the converter.
     */
    @Generated @NInt public static final long HaveData = 0x0000000000000000L;
    /**
     * If you are out of data for now, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_NoDataNow; the  conversion routine will return as much output as
     * could be converted with the input already supplied.
     */
    @Generated @NInt public static final long NoDataNow = 0x0000000000000001L;
    /**
     * If you are at the end of stream, set *ioNumberOfPackets = 0 and return
     * AVAudioConverterInputStatus_EndOfStream.
     */
    @Generated @NInt public static final long EndOfStream = 0x0000000000000002L;

    @Generated
    private AVAudioConverterInputStatus() {
    }
}
