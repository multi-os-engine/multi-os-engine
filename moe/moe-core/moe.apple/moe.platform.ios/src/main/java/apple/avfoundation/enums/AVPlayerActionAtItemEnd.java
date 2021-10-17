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
 * [@enum] AVPlayerActionAtItemEnd
 * <p>
 * These constants are the allowable values of AVPlayer's actionAtItemEnd property.
 * <p>
 * [@constant]	 AVPlayerActionAtItemEndAdvance
 * Indicates that when an AVPlayerItem reaches its end time the player will automatically advance to the next item in its queue.
 * This value is supported only for players of class AVQueuePlayer. An AVPlayer that's not an AVQueuePlayer will raise an NSInvalidArgumentException if an attempt is made to set its actionAtItemEnd to AVPlayerActionAtItemEndAdvance.
 * [@constant]	 AVPlayerActionAtItemEndPause
 * Indicates that when an AVPlayerItem reaches its end time the player will automatically pause (which is to say, the player's
 * rate will automatically be set to 0).
 * [@constant]	 AVPlayerActionAtItemEndNone
 * Indicates that when an AVPlayerItem reaches its end time the player will take no action (which is to say, the player's rate
 * will not change, its currentItem will not change, and its currentTime will continue to be incremented or decremented as time
 * elapses, according to its rate). After this, if the player's actionAtItemEnd is set to a value other than AVPlayerActionAtItemEndNone,
 * the player will immediately take the action appropriate to that value.
 */
@Generated
public final class AVPlayerActionAtItemEnd {
    @Generated @NInt public static final long Advance = 0x0000000000000000L;
    @Generated @NInt public static final long Pause = 0x0000000000000001L;
    @Generated @NInt public static final long None = 0x0000000000000002L;

    @Generated
    private AVPlayerActionAtItemEnd() {
    }
}
