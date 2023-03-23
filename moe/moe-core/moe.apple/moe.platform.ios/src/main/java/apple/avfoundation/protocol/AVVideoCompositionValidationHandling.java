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

import apple.avfoundation.AVAsset;
import apple.avfoundation.AVVideoComposition;
import apple.avfoundation.AVVideoCompositionLayerInstruction;
import apple.coremedia.struct.CMTimeRange;
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

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVVideoCompositionValidationHandling")
public interface AVVideoCompositionValidationHandling {
    /**
     * videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:
     * 
     * Invoked by an instance of AVVideoComposition when validating an instance of AVVideoComposition, to report a
     * timeRange that has no corresponding video composition instruction.
     * 
     * @return
     *         An indication of whether the AVVideoComposition should continue validation in order to report additional
     *         problems that may exist.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("videoComposition:shouldContinueValidatingAfterFindingEmptyTimeRange:")
    default boolean videoCompositionShouldContinueValidatingAfterFindingEmptyTimeRange(
            AVVideoComposition videoComposition, @ByValue CMTimeRange timeRange) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:
     * 
     * Invoked by an instance of AVVideoComposition when validating an instance of AVVideoComposition, to report a video
     * composition instruction with a timeRange that's invalid, that overlaps with the timeRange of a prior instruction,
     * or that contains times earlier than the timeRange of a prior instruction.
     * 
     * Use CMTIMERANGE_IS_INVALID, defined in CMTimeRange.h, to test whether the timeRange itself is invalid. Refer to
     * headerdoc for AVVideoComposition.instructions for a discussion of how timeRanges for instructions must be
     * formulated.
     * 
     * @return
     *         An indication of whether the AVVideoComposition should continue validation in order to report additional
     *         problems that may exist.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction:")
    default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidTimeRangeInInstruction(
            AVVideoComposition videoComposition,
            @Mapped(ObjCObjectMapper.class) AVVideoCompositionInstruction videoCompositionInstruction) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:
     * 
     * Invoked by an instance of AVVideoComposition when validating an instance of AVVideoComposition, to report a video
     * composition layer instruction with a trackID that does not correspond either to the trackID used for the
     * composition's animationTool or to a track of the asset specified in -[AVVideoComposition
     * isValidForAsset:timeRange:delegate:].
     * 
     * @return
     *         An indication of whether the AVVideoComposition should continue validation in order to report additional
     *         problems that may exist.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidTrackIDInInstruction:layerInstruction:asset:")
    default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidTrackIDInInstructionLayerInstructionAsset(
            AVVideoComposition videoComposition,
            @Mapped(ObjCObjectMapper.class) AVVideoCompositionInstruction videoCompositionInstruction,
            AVVideoCompositionLayerInstruction layerInstruction, AVAsset asset) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:
     * 
     * Invoked by an instance of AVVideoComposition when validating an instance of AVVideoComposition, to report a key
     * that has an invalid value.
     * 
     * @return
     *         An indication of whether the AVVideoComposition should continue validation in order to report additional
     *         problems that may exist.
     * 
     *         API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("videoComposition:shouldContinueValidatingAfterFindingInvalidValueForKey:")
    default boolean videoCompositionShouldContinueValidatingAfterFindingInvalidValueForKey(
            AVVideoComposition videoComposition, String key) {
        throw new java.lang.UnsupportedOperationException();
    }
}
