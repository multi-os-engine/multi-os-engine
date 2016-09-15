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
import apple.foundation.NSValue;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVVideoCompositionInstruction")
public interface AVVideoCompositionInstruction {
    /**
     * containsTweening</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionInstruction_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositionInstruction/containsTweening">iOS Dev Center</a>
     */
    @Generated
    @Selector("containsTweening")
    boolean containsTweening();

    /**
     * enablePostProcessing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionInstruction_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositionInstruction/enablePostProcessing">iOS Dev Center</a>
     */
    @Generated
    @Selector("enablePostProcessing")
    boolean enablePostProcessing();

    /**
     * passthroughTrackID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionInstruction_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositionInstruction/passthroughTrackID">iOS Dev Center</a>
     */
    @Generated
    @Selector("passthroughTrackID")
    int passthroughTrackID();

    /**
     * requiredSourceTrackIDs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionInstruction_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositionInstruction/requiredSourceTrackIDs">iOS Dev Center</a>
     */
    @Generated
    @Selector("requiredSourceTrackIDs")
    NSArray<? extends NSValue> requiredSourceTrackIDs();

    /**
     * timeRange</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/AVFoundation/Reference/AVVideoCompositionInstruction_Protocol/index.html#//apple_ref/occ/intfp/AVVideoCompositionInstruction/timeRange">iOS Dev Center</a>
     */
    @Generated
    @Selector("timeRange")
    @ByValue
    CMTimeRange timeRange();
}
