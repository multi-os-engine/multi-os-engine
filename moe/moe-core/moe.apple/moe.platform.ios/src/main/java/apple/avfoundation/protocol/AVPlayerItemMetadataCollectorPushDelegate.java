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

import apple.avfoundation.AVDateRangeMetadataGroup;
import apple.avfoundation.AVPlayerItemMetadataCollector;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemMetadataCollectorPushDelegate")
public interface AVPlayerItemMetadataCollectorPushDelegate {
    /**
     * metadataCollector:didCollectDateRangeMetadataGroups:indexesOfNewGroup:indexesOfModifiedGroups:
     * 
     * A delegate callback that delivers the total set of AVDateRangeMetadataGroups for this collector.
     * 
     * This method will be invoked whenever new AVDateRangeMetadataGroups are added to metadataGroups or whenever any
     * AVDateRangeMetadataGroups in metadataGroups have been modified since previous invocations. The initial invocation
     * will have indexesOfNewGroup referring to every index in metadataGroups. Subsequent invocations may not contain
     * all previously collected metadata groups if they no longer refer to a region in the AVPlayerItem's
     * seekableTimeRanges.
     * 
     * @param metadataCollector
     *                                The AVPlayerItemMetadataCollector source.
     * @param metadataGroups
     *                                The set of all metadata groups meeting the criteria of the output.
     * @param indexesOfNewGroups
     *                                Indexes of metadataGroups added since the last delegate invocation of this method.
     * @param indexesOfModifiedGroups
     *                                Indexes of metadataGroups modified since the last delegate invocation of this
     *                                method.
     */
    @Generated
    @Selector("metadataCollector:didCollectDateRangeMetadataGroups:indexesOfNewGroups:indexesOfModifiedGroups:")
    void metadataCollectorDidCollectDateRangeMetadataGroupsIndexesOfNewGroupsIndexesOfModifiedGroups(
            @NotNull AVPlayerItemMetadataCollector metadataCollector,
            @NotNull NSArray<? extends AVDateRangeMetadataGroup> metadataGroups, @NotNull NSIndexSet indexesOfNewGroups,
            @NotNull NSIndexSet indexesOfModifiedGroups);
}
