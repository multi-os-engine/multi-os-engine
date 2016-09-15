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

@Generated
@Library("MediaPlayer")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPMediaPlayback")
public interface MPMediaPlayback {
    /**
     * beginSeekingBackward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/beginSeekingBackward">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginSeekingBackward")
    void beginSeekingBackward();

    /**
     * beginSeekingForward</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/beginSeekingForward">iOS Dev Center</a>
     */
    @Generated
    @Selector("beginSeekingForward")
    void beginSeekingForward();

    /**
     * currentPlaybackRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfp/MPMediaPlayback/currentPlaybackRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPlaybackRate")
    float currentPlaybackRate();

    /**
     * currentPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfp/MPMediaPlayback/currentPlaybackTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("currentPlaybackTime")
    double currentPlaybackTime();

    /**
     * endSeeking</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/endSeeking">iOS Dev Center</a>
     */
    @Generated
    @Selector("endSeeking")
    void endSeeking();

    /**
     * isPreparedToPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfp/MPMediaPlayback/isPreparedToPlay">iOS Dev Center</a>
     */
    @Generated
    @Selector("isPreparedToPlay")
    boolean isPreparedToPlay();

    /**
     * pause</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/pause">iOS Dev Center</a>
     */
    @Generated
    @Selector("pause")
    void pause();

    /**
     * play</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/play">iOS Dev Center</a>
     */
    @Generated
    @Selector("play")
    void play();

    /**
     * prepareToPlay</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/prepareToPlay">iOS Dev Center</a>
     */
    @Generated
    @Selector("prepareToPlay")
    void prepareToPlay();

    /**
     * currentPlaybackRate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfp/MPMediaPlayback/currentPlaybackRate">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrentPlaybackRate:")
    void setCurrentPlaybackRate(float value);

    /**
     * currentPlaybackTime</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfp/MPMediaPlayback/currentPlaybackTime">iOS Dev Center</a>
     */
    @Generated
    @Selector("setCurrentPlaybackTime:")
    void setCurrentPlaybackTime(double value);

    /**
     * stop</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MediaPlayer/Reference/MPMediaPlayback_protocol/index.html#//apple_ref/occ/intfm/MPMediaPlayback/stop">iOS Dev Center</a>
     */
    @Generated
    @Selector("stop")
    void stop();
}
