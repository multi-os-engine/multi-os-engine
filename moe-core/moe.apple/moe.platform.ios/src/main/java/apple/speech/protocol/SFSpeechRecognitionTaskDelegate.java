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
 * A protocol with methods for managing multi-utterance speech recognition requests.
 * 
 * The methods of this protocol give you fine-grained control over the speech recognition process. Specifically, you use
 * this protocol when you want to know the following:
 * 
 * - When the first utterances of speech occur in the audio.
 * - When the speech recognizer stops accepting audio.
 * - When the speech recognition process finishes or is canceled.
 * - When the speech recognizer generates a potential transcription.
 * 
 * Adopt the methods of this protocol in an object and pass that object in to the `delegate` parameter of
 * ``SFSpeechRecognizer/recognitionTask(with:delegate:)`` when starting your speech recognition task.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFSpeechRecognitionTaskDelegate")
public interface SFSpeechRecognitionTaskDelegate {
    /**
     * Tells the delegate when the task first detects speech in the source audio.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionDidDetectSpeech:")
    default void speechRecognitionDidDetectSpeech(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate when the final utterance is recognized.
     * 
     * When this method is called, the delegate should expect no further information about the utterance to be reported.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * - recognitionResult: A recognized utterance that contains one or more transcription hypotheses in an
     * ``SFSpeechRecognitionResult`` object.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishRecognition:")
    default void speechRecognitionTaskDidFinishRecognition(@NotNull SFSpeechRecognitionTask task,
            @NotNull SFSpeechRecognitionResult recognitionResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate when the recognition of all requested utterances is finished.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * - successfully: A Boolean value that indicates whether the task was successful. When this parameter is `false`,
     * use the ``SFSpeechRecognitionTask/error`` property of the task to get information about why the task was
     * unsuccessful.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishSuccessfully:")
    default void speechRecognitionTaskDidFinishSuccessfully(@NotNull SFSpeechRecognitionTask task,
            boolean successfully) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that a hypothesized transcription is available.
     * 
     * This method is called for all recognitions, including partial recognitions.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * - transcription: The hypothesized transcription in an ``SFTranscription`` object.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didHypothesizeTranscription:")
    default void speechRecognitionTaskDidHypothesizeTranscription(@NotNull SFSpeechRecognitionTask task,
            @NotNull SFTranscription transcription) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate when the task is no longer accepting new audio input, even if final processing is in progress.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskFinishedReadingAudio:")
    default void speechRecognitionTaskFinishedReadingAudio(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate that the task has been canceled.
     * 
     * A speech recognition task can be canceled by the user, by your app, or by the system.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskWasCancelled:")
    default void speechRecognitionTaskWasCancelled(@NotNull SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Tells the delegate how much audio has been processed by the task.
     * 
     * - Parameters:
     * - task: The speech recognition task (an ``SFSpeechRecognitionTask`` object) that represents the request.
     * - duration: The seconds of audio input that the recognizer has processed.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didProcessAudioDuration:")
    default void speechRecognitionTaskDidProcessAudioDuration(@NotNull SFSpeechRecognitionTask task, double duration) {
        throw new java.lang.UnsupportedOperationException();
    }
}
