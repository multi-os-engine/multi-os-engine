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

import apple.coremedia.struct.CMTimeRange;
import apple.foundation.NSArray;
import apple.foundation.NSNumber;
import apple.foundation.NSValue;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol]	AVVideoCompositionInstruction
 * <p>
 * The AVVideoCompositionInstruction protocol is implemented by objects to represent operations to be performed by a compositor.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVVideoCompositionInstruction")
public interface AVVideoCompositionInstruction {
    /**
     * If YES, rendering a frame from the same source buffers and the same composition instruction at 2 different
     * compositionTime may yield different output frames. If NO, 2 such compositions would yield the
     * same frame. The media pipeline may me able to avoid some duplicate processing when containsTweening is NO
     */
    @Generated
    @Selector("containsTweening")
    boolean containsTweening();

    /**
     * If NO, indicates that post-processing should be skipped for the duration of this instruction.
     * See +[AVVideoCompositionCoreAnimationTool videoCompositionToolWithPostProcessingAsVideoLayer:inLayer:].
     */
    @Generated
    @Selector("enablePostProcessing")
    boolean enablePostProcessing();

    /**
     * kCMPersistentTrackID_Invalid if not a passthrough instruction
     */
    @Generated
    @Selector("passthroughTrackID")
    int passthroughTrackID();

    /**
     * List of video track IDs required to compose frames for this instruction. If the value of this property is nil, all source tracks will be considered required for composition
     */
    @Generated
    @Selector("requiredSourceTrackIDs")
    NSArray<? extends NSValue> requiredSourceTrackIDs();

    /**
     * Indicates the timeRange during which the instruction is effective. Note requirements for the timeRanges of instructions described in connection with AVVideoComposition's instructions key above.
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    CMTimeRange timeRange();

    /**
     * List of sample data track IDs required to compose frames for this instruction.  An empty array indicates that no sample data is required for this instruction.
     */
    @Generated
    @IsOptional
    @Selector("requiredSourceSampleDataTrackIDs")
    default NSArray<? extends NSNumber> requiredSourceSampleDataTrackIDs() {
        throw new java.lang.UnsupportedOperationException();
    }
}
