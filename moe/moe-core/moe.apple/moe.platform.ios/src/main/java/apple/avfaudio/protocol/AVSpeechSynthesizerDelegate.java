package apple.avfaudio.protocol;

import apple.avfaudio.AVSpeechSynthesizer;
import apple.avfaudio.AVSpeechUtterance;
import apple.foundation.struct.NSRange;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVSpeechSynthesizerDelegate
 * 
 * Defines an interface for delegates of AVSpeechSynthesizer to receive notifications of important speech utterance
 * events.
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVSpeechSynthesizerDelegate")
public interface AVSpeechSynthesizerDelegate {
    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didCancelSpeechUtterance:")
    default void speechSynthesizerDidCancelSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didContinueSpeechUtterance:")
    default void speechSynthesizerDidContinueSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didFinishSpeechUtterance:")
    default void speechSynthesizerDidFinishSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didPauseSpeechUtterance:")
    default void speechSynthesizerDidPauseSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:didStartSpeechUtterance:")
    default void speechSynthesizerDidStartSpeechUtterance(AVSpeechSynthesizer synthesizer,
            AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("speechSynthesizer:willSpeakRangeOfSpeechString:utterance:")
    default void speechSynthesizerWillSpeakRangeOfSpeechStringUtterance(AVSpeechSynthesizer synthesizer,
            @ByValue NSRange characterRange, AVSpeechUtterance utterance) {
        throw new java.lang.UnsupportedOperationException();
    }
}
