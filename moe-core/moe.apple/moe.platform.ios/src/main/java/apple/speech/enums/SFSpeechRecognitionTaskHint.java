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
 * The type of task for which you are using speech recognition.
 * 
 * API-Since: 10.0
 */
@Generated
public final class SFSpeechRecognitionTaskHint {
    /**
     * An unspecified type of task.
     * 
     * Use this hint type when the intended use for captured speech does not match the other task types.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * A task that uses captured speech for text entry.
     * 
     * Use this hint type when you are using speech recognition for a task that's similar to the keyboard's built-in
     * dictation function.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Dictation = 0x0000000000000001L;
    /**
     * A task that uses captured speech to specify search terms.
     * 
     * Use this hint type when you are using speech recognition to identify search terms.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Search = 0x0000000000000002L;
    /**
     * A task that uses captured speech for short, confirmation-style requests.
     * 
     * Use this hint type when you are using speech recognition to handle confirmation commands, such as "yes," "no," or
     * "maybe."
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Confirmation = 0x0000000000000003L;

    @Generated
    private SFSpeechRecognitionTaskHint() {
    }
}
