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
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.avfoundation.AVPlayerItemMetadataOutput;
import ios.avfoundation.AVPlayerItemTrack;
import ios.avfoundation.AVTimedMetadataGroup;
import ios.foundation.NSArray;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemMetadataOutputPushDelegate")
public interface AVPlayerItemMetadataOutputPushDelegate extends
		AVPlayerItemOutputPushDelegate {
	/**
	 * metadataOutput:didOutputTimedMetadataGroups:fromPlayerItemTrack:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVPlayerItemMetadataOutputPushDelegate_Protocol/index.html#//apple_ref/occ/intfm/AVPlayerItemMetadataOutputPushDelegate/metadataOutput:didOutputTimedMetadataGroups:fromPlayerItemTrack:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("metadataOutput:didOutputTimedMetadataGroups:fromPlayerItemTrack:")
	default void metadataOutputDidOutputTimedMetadataGroupsFromPlayerItemTrack(
			AVPlayerItemMetadataOutput output, NSArray<? extends AVTimedMetadataGroup> groups,
			AVPlayerItemTrack track) {
		throw new java.lang.UnsupportedOperationException();
	}
}
