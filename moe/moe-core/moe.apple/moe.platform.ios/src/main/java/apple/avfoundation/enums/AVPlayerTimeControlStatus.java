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
 * [@enum] AVPlayerTimeControlStatus
 * <p>
 * These constants are the allowable values of AVPlayer's timeControlStatus property. This discussion pertains when
 * automaticallyWaitsToMinimizeStalling is YES, the default setting, and exceptions are discussed in connection with
 * automaticallyWaitsToMinimizeStalling.
 * <p>
 * [@constant] AVPlayerTimeControlStatusPaused
 * This state is entered upon receipt of a -pause message, an invocation of -setRate: with a value of 0.0, when a change
 * in overall state requires playback to be halted, such as when an interruption occurs on iOS, as announced by
 * AVAudioSession.
 * In this state, playback is paused indefinitely and will not resume until 1) a subsequent -play message is received or
 * 2) a -setRate: or -playImmediatelyAtRate: message with a non-zero value for rate is received and sufficient media
 * data has been buffered for playback to proceed.
 * [@constant] AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate
 * This state is entered when 1) the playback buffer becomes empty and playback stalls in
 * AVPlayerTimeControlStatusPlaying, 2) when rate is set from zero to non-zero in AVPlayerTimeControlStatusPaused and
 * insufficient media data has been buffered for playback to occur, or 3) when the player has no item to play, i.e. when
 * the receiver's currentItem is nil.
 * In this state, the value of the rate property is not currently effective but instead indicates the rate at which
 * playback will start or resume. Refer to the value of reasonForWaitingToPlay for details about why the receiver is
 * waiting and the conditions that allow waitStatus to change to AVPlayerWaitStatusPlaying.
 * While waiting for buffering, you can attempt to start playback of any available media data via
 * -playImmediatelyAtRate:.
 * [@constant] AVPlayerTimeControlStatusPlaying
 * In this state, playback is currently progressing and rate changes will take effect immediately. Should playback stall
 * because of insufficient media data, timeControlStatus will change to
 * AVPlayerTimeControlStatusWaitingToPlayAtSpecifiedRate.
 */
@Generated
public final class AVPlayerTimeControlStatus {
    @Generated @NInt public static final long Paused = 0x0000000000000000L;
    @Generated @NInt public static final long WaitingToPlayAtSpecifiedRate = 0x0000000000000001L;
    @Generated @NInt public static final long Playing = 0x0000000000000002L;

    @Generated
    private AVPlayerTimeControlStatus() {
    }
}
