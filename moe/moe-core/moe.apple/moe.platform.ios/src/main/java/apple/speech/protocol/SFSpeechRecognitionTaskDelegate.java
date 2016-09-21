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

@Generated
@Library("Speech")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SFSpeechRecognitionTaskDelegate")
public interface SFSpeechRecognitionTaskDelegate {
    @Generated
    @IsOptional
    @Selector("speechRecognitionDidDetectSpeech:")
    default void speechRecognitionDidDetectSpeech(SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishRecognition:")
    default void speechRecognitionTaskDidFinishRecognition(SFSpeechRecognitionTask task,
            SFSpeechRecognitionResult recognitionResult) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didFinishSuccessfully:")
    default void speechRecognitionTaskDidFinishSuccessfully(SFSpeechRecognitionTask task, boolean successfully) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechRecognitionTask:didHypothesizeTranscription:")
    default void speechRecognitionTaskDidHypothesizeTranscription(SFSpeechRecognitionTask task,
            SFTranscription transcription) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskFinishedReadingAudio:")
    default void speechRecognitionTaskFinishedReadingAudio(SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechRecognitionTaskWasCancelled:")
    default void speechRecognitionTaskWasCancelled(SFSpeechRecognitionTask task) {
        throw new java.lang.UnsupportedOperationException();
    }
}
