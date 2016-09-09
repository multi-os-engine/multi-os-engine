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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.avfoundation.AVAsset;
import ios.avfoundation.AVVideoComposition;
import ios.avfoundation.AVVideoCompositionLayerInstruction;
import ios.coremedia.struct.CMTimeRange;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVVideoCompositionValidationHandling")
public interface AVVideoCompositionValidationHandling {
	/**
	 * videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionValidationHandling_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositionValidationHandling/videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:")
	default boolean videoCompositionShouldContinueValidatingAfterFindingEmptyTimeRange(
			AVVideoComposition videoComposition, @ByValue CMTimeRange timeRange) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionValidationHandling_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositionValidationHandling/videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:")
	default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction(
			AVVideoComposition videoComposition,
			@Mapped(ObjCObjectMapper.class) Object videoCompositionInstruction) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionValidationHandling_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositionValidationHandling/videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:")
	default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidTrackIDInInstructionLayerInstructionAsset(
			AVVideoComposition videoComposition,
			@Mapped(ObjCObjectMapper.class) Object videoCompositionInstruction,
			AVVideoCompositionLayerInstruction layerInstruction, AVAsset asset) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionValidationHandling_Protocol/index.html#//apple_ref/occ/intfm/AVVideoCompositionValidationHandling/videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:")
	default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidValueForKey(
			AVVideoComposition videoComposition, String key) {
		throw new java.lang.UnsupportedOperationException();
	}
}
