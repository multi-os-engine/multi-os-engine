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

package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 3.2
 * Deprecated-Since: 9.0
 * Deprecated-Message: Use AVPlayerViewController in AVKit
 */
@Deprecated
@Generated
public final class MPMovieLoadState {
    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated @Generated @NUInt public static final long Unknown = 0x0000000000000000L;
    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated @Generated @NUInt public static final long Playable = 0x0000000000000001L;
    /**
     * Playback will be automatically started in this state when shouldAutoplay is YES
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated @Generated @NUInt public static final long PlaythroughOK = 0x0000000000000002L;
    /**
     * Playback will be automatically paused in this state, if started
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated @Generated @NUInt public static final long Stalled = 0x0000000000000004L;

    @Generated
    private MPMovieLoadState() {
    }
}
