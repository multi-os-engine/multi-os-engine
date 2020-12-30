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

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * The AVAudioSessionDelegate protocol is deprecated. Instead you should register for notifications.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVAudioSessionDelegate")
public interface AVAudioSessionDelegate {
    /**
     * something has caused your audio session to be interrupted
     */
    @Generated
    @IsOptional
    @Selector("beginInterruption")
    default void beginInterruption() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * endInterruptionWithFlags: will be called instead if implemented.
     */
    @Generated
    @IsOptional
    @Selector("endInterruption")
    default void endInterruption() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Currently the only flag is AVAudioSessionInterruptionFlags_ShouldResume.
     */
    @Generated
    @IsOptional
    @Selector("endInterruptionWithFlags:")
    default void endInterruptionWithFlags(@NUInt long flags) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * notification for input become available or unavailable
     */
    @Generated
    @IsOptional
    @Selector("inputIsAvailableChanged:")
    default void inputIsAvailableChanged(boolean isInputAvailable) {
        throw new java.lang.UnsupportedOperationException();
    }
}
