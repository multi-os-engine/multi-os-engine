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

package apple.speech.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class SFSpeechRecognitionTaskState {
    /**
     * Speech processing (potentially including recording) has not yet begun
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Starting = 0x0000000000000000L;
    /**
     * Speech processing (potentially including recording) is running
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Running = 0x0000000000000001L;
    /**
     * No more audio is being recorded, but more recognition results may arrive
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Finishing = 0x0000000000000002L;
    /**
     * No more recognition results will arrive, but recording may not have stopped yet
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Canceling = 0x0000000000000003L;
    /**
     * No more results will arrive, and recording is stopped.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Completed = 0x0000000000000004L;

    @Generated
    private SFSpeechRecognitionTaskState() {
    }
}
