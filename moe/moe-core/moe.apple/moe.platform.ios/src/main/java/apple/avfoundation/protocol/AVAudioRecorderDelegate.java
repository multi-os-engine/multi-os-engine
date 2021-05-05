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

import apple.avfoundation.AVAudioRecorder;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A protocol for delegates of AVAudioRecorder
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioRecorderDelegate")
public interface AVAudioRecorderDelegate {
    /**
     * audioRecorderBeginInterruption: is called when the audio session has been interrupted while the recorder was recording. The recorded file will be closed.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderBeginInterruption:")
    default void audioRecorderBeginInterruption(AVAudioRecorder recorder) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderDidFinishRecording:successfully: is called when a recording has been finished or stopped. This method is NOT called if the recorder is stopped due to an interruption.
     */
    @Generated
    @IsOptional
    @Selector("audioRecorderDidFinishRecording:successfully:")
    default void audioRecorderDidFinishRecordingSuccessfully(AVAudioRecorder recorder, boolean flag) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * if an error occurs while encoding it will be reported to the delegate.
     */
    @Generated
    @IsOptional
    @Selector("audioRecorderEncodeErrorDidOccur:error:")
    default void audioRecorderEncodeErrorDidOccurError(AVAudioRecorder recorder, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEndInterruption: is called when the preferred method, audioRecorderEndInterruption:withFlags:, is not implemented.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:")
    default void audioRecorderEndInterruption(AVAudioRecorder recorder) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:withFlags:")
    default void audioRecorderEndInterruptionWithFlags(AVAudioRecorder recorder, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * audioRecorderEndInterruption:withOptions: is called when the audio session interruption has ended and this recorder had been interrupted while recording.
     * Currently the only flag is AVAudioSessionInterruptionFlags_ShouldResume.
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("audioRecorderEndInterruption:withOptions:")
    default void audioRecorderEndInterruptionWithOptions(AVAudioRecorder recorder, @NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }
}
