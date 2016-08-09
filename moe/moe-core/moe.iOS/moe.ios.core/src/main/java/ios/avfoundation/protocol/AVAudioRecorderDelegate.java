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

package ios.avfoundation.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.AVAudioRecorder;
import ios.foundation.NSError;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioRecorderDelegate")
public interface AVAudioRecorderDelegate {
	/**
	 * audioRecorderBeginInterruption:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderBeginInterruption:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioRecorderBeginInterruption:")
	default void audioRecorderBeginInterruption(AVAudioRecorder recorder) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioRecorderDidFinishRecording:successfully:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderDidFinishRecording:successfully:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("audioRecorderDidFinishRecording:successfully:")
	default void audioRecorderDidFinishRecordingSuccessfully(
			AVAudioRecorder recorder, boolean flag) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioRecorderEncodeErrorDidOccur:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderEncodeErrorDidOccur:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("audioRecorderEncodeErrorDidOccur:error:")
	default void audioRecorderEncodeErrorDidOccurError(
			AVAudioRecorder recorder, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioRecorderEndInterruption:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderEndInterruption:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioRecorderEndInterruption:")
	default void audioRecorderEndInterruption(AVAudioRecorder recorder) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioRecorderEndInterruption:withFlags:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderEndInterruption:withFlags:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioRecorderEndInterruption:withFlags:")
	default void audioRecorderEndInterruptionWithFlags(
			AVAudioRecorder recorder, @NUInt long flags) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioRecorderEndInterruption:withOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioRecorderDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioRecorderDelegate/audioRecorderEndInterruption:withOptions:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioRecorderEndInterruption:withOptions:")
	default void audioRecorderEndInterruptionWithOptions(
			AVAudioRecorder recorder, @NUInt long flags) {
		throw new java.lang.UnsupportedOperationException();
	}
}
