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

package apple.mediaplayer.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * API-Since: 3.0
 */
@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPMediaPlayback")
public interface MPMediaPlayback {
    @Generated
    @Selector("beginSeekingBackward")
    void beginSeekingBackward();

    /**
     * The seeking rate will increase the longer scanning is active.
     */
    @Generated
    @Selector("beginSeekingForward")
    void beginSeekingForward();

    /**
     * The current playback rate of the now playing item. Default is 1.0 (normal speed).
     * Pausing will set the rate to 0.0. Setting the rate to non-zero implies playing.
     */
    @Generated
    @Selector("currentPlaybackRate")
    float currentPlaybackRate();

    /**
     * The current playback time of the now playing item in seconds.
     */
    @Generated
    @Selector("currentPlaybackTime")
    double currentPlaybackTime();

    @Generated
    @Selector("endSeeking")
    void endSeeking();

    /**
     * Returns YES if prepared for playback.
     */
    @Generated
    @Selector("isPreparedToPlay")
    boolean isPreparedToPlay();

    /**
     * Pauses playback if playing.
     */
    @Generated
    @Selector("pause")
    void pause();

    /**
     * Plays items from the current queue, resuming paused playback if possible.
     */
    @Generated
    @Selector("play")
    void play();

    /**
     * Prepares the current queue for playback, interrupting any active (non-mixible) audio sessions.
     * Automatically invoked when -play is called if the player is not already prepared.
     */
    @Generated
    @Selector("prepareToPlay")
    void prepareToPlay();

    /**
     * The current playback rate of the now playing item. Default is 1.0 (normal speed).
     * Pausing will set the rate to 0.0. Setting the rate to non-zero implies playing.
     */
    @Generated
    @Selector("setCurrentPlaybackRate:")
    void setCurrentPlaybackRate(float value);

    /**
     * The current playback time of the now playing item in seconds.
     */
    @Generated
    @Selector("setCurrentPlaybackTime:")
    void setCurrentPlaybackTime(double value);

    /**
     * Ends playback. Calling -play again will start from the beginnning of the queue.
     */
    @Generated
    @Selector("stop")
    void stop();
}
