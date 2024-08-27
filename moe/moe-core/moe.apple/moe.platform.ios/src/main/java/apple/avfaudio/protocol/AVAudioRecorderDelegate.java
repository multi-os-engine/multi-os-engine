package apple.avfaudio.protocol;

import apple.avfaudio.AVAudioRecorder;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * [@protocol] AVAudioRecorderDelegate
 * 
 * A protocol for delegates of AVAudioRecorder.
 * 
 * API-Since: 3.0
 */
@Generated
@Library("AVFAudio")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioRecorderDelegate")
public interface AVAudioRecorderDelegate {
    /**
     * audioRecorderBeginInterruption:
     * 
     * audioRecorderBeginInterruption: is called when the audio session has been interrupted while the recorder was
     * recording. The recorded file will be closed.
     * 
     * Deprecated - use AVAudioSession instead.
     * 
     * API-Since: 2.2
     * Deprecated-Since: 8.0
     * Deprecated-Message: Deprecated - use AVAudioSession instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderBeginInterruption:")
    default void audioRecorderBeginInterruption(@NotNull AVAudioRecorder recorder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderDidFinishRecording:successfully:
     * 
     * This callback method is called when a recording has been finished or stopped.
     * 
     * This method is NOT called if the recorder is stopped due to an interruption.
     */
    @Generated
    @IsOptional
    @Selector("audioRecorderDidFinishRecording:successfully:")
    default void audioRecorderDidFinishRecordingSuccessfully(@NotNull AVAudioRecorder recorder, boolean flag) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEncodeErrorDidOccur:error:
     * 
     * This callback method is called when an error occurs while encoding.
     * 
     * If an error occurs while encoding it will be reported to the delegate.
     */
    @Generated
    @IsOptional
    @Selector("audioRecorderEncodeErrorDidOccur:error:")
    default void audioRecorderEncodeErrorDidOccurError(@NotNull AVAudioRecorder recorder, @Nullable NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEndInterruption:
     * 
     * audioRecorderEndInterruption: is called when the preferred method, audioRecorderEndInterruption:withFlags:, is
     * not implemented.
     * 
     * Deprecated - use AVAudioSession instead.
     * 
     * API-Since: 2.2
     * Deprecated-Since: 6.0
     * Deprecated-Message: Deprecated - use AVAudioSession instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:")
    default void audioRecorderEndInterruption(@NotNull AVAudioRecorder recorder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEndInterruption:withFlags:
     * 
     * audioRecorderEndInterruption:withFlags: is called when the audio session interruption has ended and this recorder
     * had been interrupted while recording.
     * 
     * Deprecated - use AVAudioSession instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Deprecated - use AVAudioSession instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:withFlags:")
    default void audioRecorderEndInterruptionWithFlags(@NotNull AVAudioRecorder recorder, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEndInterruption:withOptions:
     * 
     * audioRecorderEndInterruption:withOptions: is called when the audio session interruption has ended and this
     * recorder had been interrupted while recording.
     * 
     * Currently the only flag is AVAudioSessionInterruptionFlags_ShouldResume. Deprecated - use AVAudioSession instead.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Deprecated - use AVAudioSession instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:withOptions:")
    default void audioRecorderEndInterruptionWithOptions(@NotNull AVAudioRecorder recorder, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }
}
