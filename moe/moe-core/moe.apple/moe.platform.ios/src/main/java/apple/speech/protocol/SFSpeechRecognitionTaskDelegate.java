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

import apple.speech.SFSpeechRecognitionResult;
import apple.speech.SFSpeechRecognitionTask;
import apple.speech.SFTranscription;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

/**
 * Recognition result receiver, to be used for complex or multi-utterance speech recognition requests
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFSpeechRecognitionTaskDelegate")
public interface SFSpeechRecognitionTaskDelegate {
    /**
     * Called when the task first detects speech in the source audio
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionDidDetectSpeech:")
    default void speechRecognitionDidDetectSpeech(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called only for final recognitions of utterances. No more about the utterance will be reported
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishRecognition:")
    default void speechRecognitionTaskDidFinishRecognition(@NotNull SFSpeechRecognitionTask task,
            @NotNull SFSpeechRecognitionResult recognitionResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when recognition of all requested utterances is finished.
     * If successfully is false, the error property of the task will contain error information
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishSuccessfully:")
    default void speechRecognitionTaskDidFinishSuccessfully(@NotNull SFSpeechRecognitionTask task,
            boolean successfully) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called for all recognitions, including non-final hypothesis
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didHypothesizeTranscription:")
    default void speechRecognitionTaskDidHypothesizeTranscription(@NotNull SFSpeechRecognitionTask task,
            @NotNull SFTranscription transcription) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the task is no longer accepting new audio but may be finishing final processing
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskFinishedReadingAudio:")
    default void speechRecognitionTaskFinishedReadingAudio(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Called when the task has been cancelled, either by client app, the user, or the system
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskWasCancelled:")
    default void speechRecognitionTaskWasCancelled(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }
}
