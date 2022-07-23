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

import apple.avfoundation.AVPlayerItemMetadataOutput;
import apple.avfoundation.AVPlayerItemTrack;
import apple.avfoundation.AVTimedMetadataGroup;
import apple.foundation.NSArray;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * [@protocol] AVPlayerItemMetadataOutputPushDelegate
 * <p>
 * Extends AVPlayerItemOutputPushDelegate to provide additional methods specific to metadata output.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemMetadataOutputPushDelegate")
public interface AVPlayerItemMetadataOutputPushDelegate extends AVPlayerItemOutputPushDelegate {
    /**
     * metadataOutput:didOutputTimedMetadataGroups:fromPlayerItemTrack:
     * <p>
     * A delegate callback that delivers a new collection of metadata items.
     * <p>
     * Each group provided in a single invocation of this method will have timing that does not overlap with any other
     * group in the array.
     * Note that for some timed metadata formats carried by HTTP live streaming, the timeRange of each group must be
     * reported as kCMTimeIndefinite, because its duration will be unknown until the next metadata group in the stream
     * arrives. In these cases, the groups parameter will always contain a single group.
     * Groups are typically packaged into arrays for delivery to your delegate according to the chunking or interleaving
     * of the underlying metadata data.
     * Note that if the item carries multiple metadata tracks containing metadata with the same metadata identifiers,
     * this method can be invoked for each one separately, each with reference to the associated AVPlayerItemTrack.
     * Note that the associated AVPlayerItemTrack parameter can be nil which implies that the metadata describes the
     * asset as a whole, not just a single track of the asset.
     *
     * @param output The AVPlayerItemMetadataOutput source.
     * @param groups An NSArray of AVTimedMetadataGroups that may contain metadata items with requested identifiers,
     *               according to the format descriptions associated with the underlying tracks.
     * @param track  An instance of AVPlayerItemTrack that indicates the source of the metadata items in the group.
     */
    @Generated
    @IsOptional
    @Selector("metadataOutput:didOutputTimedMetadataGroups:fromPlayerItemTrack:")
    default void metadataOutputDidOutputTimedMetadataGroupsFromPlayerItemTrack(AVPlayerItemMetadataOutput output,
            NSArray<? extends AVTimedMetadataGroup> groups, AVPlayerItemTrack track) {
        throw new java.lang.UnsupportedOperationException();
    }
}
