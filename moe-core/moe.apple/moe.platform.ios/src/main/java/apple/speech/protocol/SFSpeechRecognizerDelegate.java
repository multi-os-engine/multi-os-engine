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

package apple.speech.protocol;

import apple.speech.SFSpeechRecognizer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * A protocol that you adopt in your objects to track the availability of a speech recognizer.
 * 
 * A speech recognizer's availability can change due to the device's Internet connection or other factors. Use this
 * protocol's optional method to track those changes and provide an appropriate response. For example, when speech
 * recognition becomes unavailable, you might disable related features in your app.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFSpeechRecognizerDelegate")
public interface SFSpeechRecognizerDelegate {
    /**
     * Tells the delegate that the availability of its associated speech recognizer changed.
     * 
     * - Parameters:
     * - speechRecognizer: The ``SFSpeechRecognizer`` object whose availability changed.
     * - available: A Boolean value that indicates the new availability of the speech recognizer.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognizer:availabilityDidChange:")
    default void speechRecognizerAvailabilityDidChange(@NotNull SFSpeechRecognizer speechRecognizer,
            boolean available) {
        throw new java.lang.UnsupportedOperationException();
    }
}
