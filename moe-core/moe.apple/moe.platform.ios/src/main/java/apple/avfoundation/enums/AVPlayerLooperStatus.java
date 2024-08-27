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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVPlayerLooperStatus
 * 
 * These constants are returned by the AVPlayerLooper status property to indicate whether it can successfully accomplish
 * looping playback.
 * [@constant] AVPlayerLooperStatusUnknown
 * Indicates that the status of the looper is not yet known.
 * [@constant] AVPlayerLooperStatusReady
 * Indicates that the looper is ready for looping playback.
 * [@constant] AVPlayerLooperStatusFailed
 * Indicates that the looper is not able to perform looping playback because of an error. The error is described by the
 * value of the error property.
 * [@constant] AVPlayerLooperStatusCancelled
 * Indicates that the looper is no longer looping because -disableLooping was invoked.
 */
@Generated
public final class AVPlayerLooperStatus {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long Ready = 0x0000000000000001L;
    @Generated @NInt public static final long Failed = 0x0000000000000002L;
    @Generated @NInt public static final long Cancelled = 0x0000000000000003L;

    @Generated
    private AVPlayerLooperStatus() {
    }
}
