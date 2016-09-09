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

import ios.avfoundation.AVAudioPlayer;
import ios.foundation.NSError;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioPlayerDelegate")
public interface AVAudioPlayerDelegate {
	/**
	 * audioPlayerBeginInterruption:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerBeginInterruption:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioPlayerBeginInterruption:")
	default void audioPlayerBeginInterruption(AVAudioPlayer player) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioPlayerDecodeErrorDidOccur:error:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerDecodeErrorDidOccur:error:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("audioPlayerDecodeErrorDidOccur:error:")
	default void audioPlayerDecodeErrorDidOccurError(
			AVAudioPlayer player, NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioPlayerDidFinishPlaying:successfully:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerDidFinishPlaying:successfully:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("audioPlayerDidFinishPlaying:successfully:")
	default void audioPlayerDidFinishPlayingSuccessfully(
			AVAudioPlayer player, boolean flag) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioPlayerEndInterruption:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerEndInterruption:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioPlayerEndInterruption:")
	default void audioPlayerEndInterruption(AVAudioPlayer player) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioPlayerEndInterruption:withFlags:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerEndInterruption:withFlags:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioPlayerEndInterruption:withFlags:")
	default void audioPlayerEndInterruptionWithFlags(
			AVAudioPlayer player, @NUInt long flags) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * audioPlayerEndInterruption:withOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioPlayerDelegateProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioPlayerDelegate/audioPlayerEndInterruption:withOptions:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Deprecated
	@Selector("audioPlayerEndInterruption:withOptions:")
	default void audioPlayerEndInterruptionWithOptions(
			AVAudioPlayer player, @NUInt long flags) {
		throw new java.lang.UnsupportedOperationException();
	}
}
