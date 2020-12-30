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
 * [@enum] AVPlayerStatus
 * 
 * These constants are returned by the AVPlayer status property to indicate whether it can successfully play items.
 * 
 * [@constant]	 AVPlayerStatusUnknown
 * Indicates that the status of the player is not yet known because it has not tried to load new media resources for
 * playback.
 * [@constant]	 AVPlayerStatusReadyToPlay
 * Indicates that the player is ready to play AVPlayerItem instances.
 * [@constant]	 AVPlayerStatusFailed
 * Indicates that the player can no longer play AVPlayerItem instances because of an error. The error is described by
 * the value of the player's error property.
 */
@Generated
public final class AVPlayerStatus {
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    @Generated @NInt public static final long ReadyToPlay = 0x0000000000000001L;
    @Generated @NInt public static final long Failed = 0x0000000000000002L;

    @Generated
    private AVPlayerStatus() {
    }
}
