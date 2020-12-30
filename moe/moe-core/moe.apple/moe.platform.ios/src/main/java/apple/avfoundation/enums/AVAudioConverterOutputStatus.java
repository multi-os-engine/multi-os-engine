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
 * @enum AVAudioConverterOutputStatus
 * @abstract These values are returned from convertToBuffer:error:withInputFromBlock:
 */
@Generated
public final class AVAudioConverterOutputStatus {
    /**
     * All of the requested data was returned.
     */
    @Generated @NInt public static final long HaveData = 0x0000000000000000L;
    /**
     * Not enough input was available to satisfy the request at the current time. The output buffer
     * contains as much as could be converted.
     */
    @Generated @NInt public static final long InputRanDry = 0x0000000000000001L;
    /**
     * The end of stream has been reached. No data was returned.
     */
    @Generated @NInt public static final long EndOfStream = 0x0000000000000002L;
    /**
     * An error occurred.
     */
    @Generated @NInt public static final long Error = 0x0000000000000003L;

    @Generated
    private AVAudioConverterOutputStatus() {
    }
}
