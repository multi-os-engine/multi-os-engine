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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioSessionDelegate")
public interface AVAudioSessionDelegate {
	/**
	 * beginInterruption</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSessionDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioSessionDelegate/beginInterruption">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("beginInterruption")
	default void beginInterruption() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * endInterruption</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSessionDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioSessionDelegate/endInterruption">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("endInterruption")
	default void endInterruption() {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * endInterruptionWithFlags:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSessionDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioSessionDelegate/endInterruptionWithFlags:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("endInterruptionWithFlags:")
	default void endInterruptionWithFlags(@NUInt long flags) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * inputIsAvailableChanged:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudioSessionDelegate_ProtocolReference/index.html#//apple_ref/occ/intfm/AVAudioSessionDelegate/inputIsAvailableChanged:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("inputIsAvailableChanged:")
	default void inputIsAvailableChanged(boolean isInputAvailable) {
		throw new java.lang.UnsupportedOperationException();
	}
}
