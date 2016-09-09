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

package ios.scenekit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.quartzcore.CAAnimation;

@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("SCNAnimatable")
public interface SCNAnimatable {
	/**
	 * addAnimation:forKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/addAnimation:forKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addAnimation:forKey:")
	void addAnimationForKey(CAAnimation animation, String key);

	/**
	 * animationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/animationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationForKey:")
	CAAnimation animationForKey(String key);

	/**
	 * animationKeys</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfp/SCNAnimatable/animationKeys">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animationKeys")
	NSArray<String> animationKeys();

	/**
	 * isAnimationForKeyPaused:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/isAnimationForKeyPaused:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isAnimationForKeyPaused:")
	boolean isAnimationForKeyPaused(String key);

	/**
	 * pauseAnimationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/pauseAnimationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pauseAnimationForKey:")
	void pauseAnimationForKey(String key);

	/**
	 * removeAllAnimations</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/removeAllAnimations">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAllAnimations")
	void removeAllAnimations();

	/**
	 * removeAnimationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/removeAnimationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAnimationForKey:")
	void removeAnimationForKey(String key);

	/**
	 * removeAnimationForKey:fadeOutDuration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/removeAnimationForKey:fadeOutDuration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeAnimationForKey:fadeOutDuration:")
	void removeAnimationForKeyFadeOutDuration(String key,
			@NFloat double duration);

	/**
	 * resumeAnimationForKey:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SceneKit/Reference/SCNAnimatable_Protocol/index.html#//apple_ref/occ/intfm/SCNAnimatable/resumeAnimationForKey:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resumeAnimationForKey:")
	void resumeAnimationForKey(String key);
}
