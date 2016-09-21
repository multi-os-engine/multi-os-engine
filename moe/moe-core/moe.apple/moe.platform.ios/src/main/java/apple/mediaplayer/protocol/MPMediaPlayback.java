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
    @Generated
    @Selector("beginSeekingBackward")
    void beginSeekingBackward();

    @Generated
    @Selector("beginSeekingForward")
    void beginSeekingForward();

    @Generated
    @Selector("currentPlaybackRate")
    float currentPlaybackRate();

    @Generated
    @Selector("currentPlaybackTime")
    double currentPlaybackTime();

    @Generated
    @Selector("endSeeking")
    void endSeeking();

    @Generated
    @Selector("isPreparedToPlay")
    boolean isPreparedToPlay();

    @Generated
    @Selector("pause")
    void pause();

    @Generated
    @Selector("play")
    void play();

    @Generated
    @Selector("prepareToPlay")
    void prepareToPlay();

    @Generated
    @Selector("setCurrentPlaybackRate:")
    void setCurrentPlaybackRate(float value);

    @Generated
    @Selector("setCurrentPlaybackTime:")
    void setCurrentPlaybackTime(double value);

    @Generated
    @Selector("stop")
    void stop();
}
