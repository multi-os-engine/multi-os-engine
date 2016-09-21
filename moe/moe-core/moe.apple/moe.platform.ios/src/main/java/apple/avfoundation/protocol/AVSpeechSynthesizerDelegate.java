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

package apple.avfoundation.protocol;

import apple.avfoundation.AVSpeechSynthesizer;
import apple.avfoundation.AVSpeechUtterance;
import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVSpeechSynthesizerDelegate")
public interface AVSpeechSynthesizerDelegate {
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didCancelSpeechUtterance:")
    default void speechSynthesizerDidCancelSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didContinueSpeechUtterance:")
    default void speechSynthesizerDidContinueSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didFinishSpeechUtterance:")
    default void speechSynthesizerDidFinishSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didPauseSpeechUtterance:")
    default void speechSynthesizerDidPauseSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didStartSpeechUtterance:")
    default void speechSynthesizerDidStartSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("speechSynthesizer:willSpeakRangeOfSpeechString:utterance:")
    default void speechSynthesizerWillSpeakRangeOfSpeechStringUtterance(AVSpeechSynthesizer synthesizer,
            @ByValue NSRange characterRange, AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }
}
