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


import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.struct.AVAudio3DPoint;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudio3DMixing")
public interface AVAudio3DMixing {
	/**
	 * obstruction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/obstruction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("obstruction")
	float obstruction();

	/**
	 * occlusion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/occlusion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("occlusion")
	float occlusion();

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("position")
	@ByValue
	AVAudio3DPoint position();

	/**
	 * rate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/rate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rate")
	float rate();

	/**
	 * renderingAlgorithm</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/renderingAlgorithm">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderingAlgorithm")
	@NInt
	long renderingAlgorithm();

	/**
	 * reverbBlend</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/reverbBlend">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reverbBlend")
	float reverbBlend();

	/**
	 * obstruction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/obstruction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setObstruction:")
	void setObstruction(float value);

	/**
	 * occlusion</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/occlusion">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setOcclusion:")
	void setOcclusion(float value);

	/**
	 * position</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/position">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPosition:")
	void setPosition(@ByValue AVAudio3DPoint value);

	/**
	 * rate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/rate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRate:")
	void setRate(float value);

	/**
	 * renderingAlgorithm</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/renderingAlgorithm">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setRenderingAlgorithm:")
	void setRenderingAlgorithm(@NInt long value);

	/**
	 * reverbBlend</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVAudio3DMixing_Protocol/index.html#//apple_ref/occ/intfp/AVAudio3DMixing/reverbBlend">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setReverbBlend:")
	void setReverbBlend(float value);
}
