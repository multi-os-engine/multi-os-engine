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

package apple.uikit.protocol;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewAnimating")
public interface UIViewAnimating {
    /**
     * This method may only be called if the animator is in the stopped state.
     * The finalPosition argument should indicate the final values of the animated properties.
     */
    @Generated
    @Selector("finishAnimationAtPosition:")
    void finishAnimationAtPosition(@NInt long finalPosition);

    /**
     * fractionComplete values are typically between 0 and 1. Some adopters may choose to give
     * meaning to values less than zero and greater than 1 to facilitate over and
     * undershooting.  The setter is usually a nop when the animation is
     * running. Adopters are free to change this if it makes sense. An adopter
     * may also choose to only return a meaningful result for this property if it
     * is read while the animation is not running.
     */
    @Generated
    @Selector("fractionComplete")
    @NFloat
    double fractionComplete();

    /**
     * Reversed indicates that the animation is running in the reversed direction when running is YES.
     * If running is NO, it indicates that it will run in the reversed direction when it is started.
     */
    @Generated
    @Selector("isReversed")
    boolean isReversed();

    /**
     * Reversed indicates that the animation is running in the reversed direction when running is YES.
     * If running is NO, it indicates that it will run in the reversed direction when it is started.
     */
    @Generated
    @Selector("setReversed:")
    void setReversed(boolean value);

    /**
     * Running indicates that the animation is running either in the forward or the reversed direction.
     * The state of a running animation is always active.
     */
    @Generated
    @Selector("isRunning")
    boolean isRunning();

    /**
     * Pauses an active, running animation, or start the animation as paused. This is different
     * than stopping an animation.
     */
    @Generated
    @Selector("pauseAnimation")
    void pauseAnimation();

    /**
     * fractionComplete values are typically between 0 and 1. Some adopters may choose to give
     * meaning to values less than zero and greater than 1 to facilitate over and
     * undershooting.  The setter is usually a nop when the animation is
     * running. Adopters are free to change this if it makes sense. An adopter
     * may also choose to only return a meaningful result for this property if it
     * is read while the animation is not running.
     */
    @Generated
    @Selector("setFractionComplete:")
    void setFractionComplete(@NFloat double value);

    /**
     * Starts the animation either from an inactive state, or if the animation has been paused.
     */
    @Generated
    @Selector("startAnimation")
    void startAnimation();

    /**
     * Starts the animation after the given delay.
     */
    @Generated
    @Selector("startAnimationAfterDelay:")
    void startAnimationAfterDelay(double delay);

    @Generated
    @Selector("state")
    @NInt
    long state();

    /**
     * Stops the animation.  The values of a view's animated property values are
     * updated to correspond to the values that were last rendered. If
     * withoutFinishing == YES, then the animator immediately becomes
     * inactive. Otherwise it enters the stopped state and it is incumbent on the
     * client to explicitly finish the animation by calling finishAnimationAtPosition:. Note
     * when an animation finishes naturally this method is not called.
     */
    @Generated
    @Selector("stopAnimation:")
    void stopAnimation(boolean withoutFinishing);
}
