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

/**
 * [@protocol] SCNAnimatable
 * 
 * The SCNAnimatable protocol defines an animatable property. Objects that implement this protocol can be animated
 * through these methods.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNAnimatable")
public interface SCNAnimatable {
    /**
     * addAnimation:forKey:
     * 
     * Adds and runs an animation
     * 
     * Only SCNAnimation (preferred), CABasicAnimation, CAKeyframeAnimation and CAAnimationGroup are supported.
     * The animation starts playing right away. The animation is automatically removed on completion unless if
     * removedOnCompletion is explicitly set to NO.
     * 
     * @param animation Added animation.
     * @param key       May be any string such that only one animation per unique key is added per animatable object.
     * @see -[id <SCNAnimation> removedOnCompletion]
     */
    @Generated
    @Selector("addAnimation:forKey:")
    void addAnimationForKey(@Mapped(ObjCObjectMapper.class) SCNAnimation animation, String key);

    /**
     * animationForKey:
     * 
     * Returns the animation with the given identifier
     * 
     * This will return nil if no such animation exists.
     * Attempting to modify any properties of the returned object will result in undefined behavior.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * 
     * @param key The identifier for the animation to retrieve.
     */
    @Deprecated
    @Generated
    @Selector("animationForKey:")
    CAAnimation animationForKey(String key);

    /**
     * [@property] animationKeys
     * 
     * Returns an array containing the keys of all animations currently attached to the receiver.
     */
    @Generated
    @Selector("animationKeys")
    NSArray<String> animationKeys();

    /**
     * isAnimationForKeyPaused:
     * 
     * Returns whether the animation for the specified identifier is paused.
     * 
     * @param key The identifier for the animation to query.
     * 
     *            API-Since: 8.0
     *            Deprecated-Since: 11.0
     *            Deprecated-Message: Use -[SCNAnimationPlayer paused] instead
     */
    @Deprecated
    @Generated
    @Selector("isAnimationForKeyPaused:")
    boolean isAnimationForKeyPaused(String key);

    /**
     * pauseAnimationForKey:
     * 
     * Pause the animation with the given identifier.
     * 
     * @param key The identifier for the animation to pause.
     * 
     *            API-Since: 8.0
     *            Deprecated-Since: 11.0
     *            Deprecated-Message: Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Generated
    @Selector("pauseAnimationForKey:")
    void pauseAnimationForKey(String key);

    /**
     * removeAllAnimations
     * 
     * Remove all animations.
     */
    @Generated
    @Selector("removeAllAnimations")
    void removeAllAnimations();

    /**
     * removeAnimationForKey
     * 
     * Remove the animation with the given identifier.
     * 
     * @param key The identifier for the animation to remove.
     */
    @Generated
    @Selector("removeAnimationForKey:")
    void removeAnimationForKey(String key);

    /**
     * removeAnimationForKey:fadeOutDuration:
     * 
     * Smoothly remove the animation with the given identifier.
     * 
     * @param key      The identifier for the animation to remove.
     * @param duration The fade out duration used to remove the animation.
     * 
     *                 API-Since: 8.0
     *                 Deprecated-Since: 11.0
     */
    @Deprecated
    @Generated
    @Selector("removeAnimationForKey:fadeOutDuration:")
    void removeAnimationForKeyFadeOutDuration(String key, @NFloat double duration);

    /**
     * resumeAnimationForKey:
     * 
     * Resume the animation with the given identifier.
     * 
     * @param key The identifier for the animation to resume.
     * 
     *            API-Since: 8.0
     *            Deprecated-Since: 11.0
     *            Deprecated-Message: Use -[SCNAnimationPlayer setPaused:] instead
     */
    @Deprecated
    @Generated
    @Selector("resumeAnimationForKey:")
    void resumeAnimationForKey(String key);

    /**
     * setSpeed:forAnimationKey:
     * 
     * Update the animation speed of the animation with the given identifier.
     * 
     * @param speed The new speed of the animation.
     * @param key   The identifier for the animation to update.
     * 
     *              API-Since: 10.0
     *              Deprecated-Since: 11.0
     *              Deprecated-Message: Use -[SCNAnimationPlayer setSpeed:] instead
     */
    @Deprecated
    @Generated
    @Selector("setSpeed:forAnimationKey:")
    void setSpeedForAnimationKey(@NFloat double speed, String key);

    /**
     * addAnimationPlayer:forKey:
     * 
     * Add an animation player.
     * 
     * The animation player is not removed automatically on completion.
     * The animation doesn't start playing immediatelly. Call "play" on the player to start playing it.
     * 
     * @param player Added animation player.
     * @param key    May be any string such that only one animation per unique key is added per animatable object.
     * @see -[SCNAnimationPlayer play]
     * 
     *      API-Since: 11.0
     */
    @Generated
    @Selector("addAnimationPlayer:forKey:")
    void addAnimationPlayerForKey(SCNAnimationPlayer player, String key);

    /**
     * animationPlayerForKey:
     * 
     * Returns the animation player with the given identifier
     * 
     * This will return nil if no such animation player exists.
     * 
     * API-Since: 11.0
     * 
     * @param key The identifier for the animation player to retrieve.
     */
    @Generated
    @Selector("animationPlayerForKey:")
    SCNAnimationPlayer animationPlayerForKey(String key);

    /**
     * removeAnimationForKey:blendOutDuration:
     * 
     * Smoothly remove the animation with the given identifier.
     * 
     * @param key      The identifier for the animation to remove.
     * @param duration The blend out duration used to remove the animation.
     * 
     *                 API-Since: 11.0
     */
    @Generated
    @Selector("removeAnimationForKey:blendOutDuration:")
    void removeAnimationForKeyBlendOutDuration(String key, @NFloat double duration);

    /**
     * removeAllAnimationsWithBlendOutDuration
     * 
     * Smoothly remove all animations.
     * 
     * @param duration The blend out duration used to remove the animation.
     * 
     *                 API-Since: 15.0
     */
    @Generated
    @Selector("removeAllAnimationsWithBlendOutDuration:")
    void removeAllAnimationsWithBlendOutDuration(@NFloat double duration);
}
