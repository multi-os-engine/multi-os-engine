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

package apple.scenekit.protocol;

import apple.foundation.NSArray;
import apple.quartzcore.CAAnimation;
import apple.scenekit.SCNAnimationPlayer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNAnimatable")
public interface SCNAnimatable {
    @Generated
    @Selector("addAnimation:forKey:")
    void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    @Generated
    @Selector("animationForKey:")
    CAAnimation animationForKey(String key);

    @Generated
    @Selector("animationKeys")
    NSArray<String> animationKeys();

    @Generated
    @Selector("isAnimationForKeyPaused:")
    boolean isAnimationForKeyPaused(String key);

    @Generated
    @Selector("pauseAnimationForKey:")
    void pauseAnimationForKey(String key);

    @Generated
    @Selector("removeAllAnimations")
    void removeAllAnimations();

    @Generated
    @Selector("removeAnimationForKey:")
    void removeAnimationForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    @Generated
    @Selector("resumeAnimationForKey:")
    void resumeAnimationForKey(String key);

    @Generated
    @Selector("setSpeed:forAnimationKey:")
    void setSpeedForAnimationKey(@NFloat double speed, String key);

    @Generated
    @Selector("addAnimationPlayer:forKey:")
    void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    @Generated
    @Selector("animationPlayerForKey:")
    SCNAnimationPlayer animationPlayerForKey(String key);

    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);
}
