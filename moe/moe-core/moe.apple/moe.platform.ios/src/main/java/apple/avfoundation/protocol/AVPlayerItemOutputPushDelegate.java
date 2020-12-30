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

import apple.avfoundation.AVPlayerItemOutput;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * @protocol		AVPlayerItemOutputPushDelegate
 * @abstract		Defines common delegate methods for objects participating in AVPlayerItemOutput push sample output acquisition.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerItemOutputPushDelegate")
public interface AVPlayerItemOutputPushDelegate {
    /**
     * @method			outputSequenceWasFlushed:
     * @abstract		A method invoked when the output is commencing a new sequence of media data.
     * @discussion
     * 	This method is invoked after any seeking and change in playback direction. If you are maintaining any queued future media data, received previously, you may want to discard these after receiving this message.
     */
    @Generated
    @IsOptional
    @Selector("outputSequenceWasFlushed:")
    default void outputSequenceWasFlushed(AVPlayerItemOutput output) {
        throw new java.lang.UnsupportedOperationException();
    }
}
