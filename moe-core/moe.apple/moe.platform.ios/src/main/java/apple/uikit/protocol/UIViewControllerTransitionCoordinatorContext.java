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

import apple.uikit.UIView;
import apple.uikit.UIViewController;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGAffineTransform;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerTransitionCoordinatorContext")
public interface UIViewControllerTransitionCoordinatorContext {
    @Generated
    @Selector("completionCurve")
    @NInt
    long completionCurve();

    @Generated
    @Selector("completionVelocity")
    @NFloat
    double completionVelocity();

    /**
     * The view in which the animated transition is taking place.
     */
    @NotNull
    @Generated
    @Selector("containerView")
    UIView containerView();

    /**
     * initiallyInteractive indicates whether the transition was initiated as an interactive transition.
     * It never changes during the course of a transition.
     * It can only be YES if isAnimated is YES.
     * If it is NO, then isInteractive can only be YES if isInterruptible is YES
     */
    @Generated
    @Selector("initiallyInteractive")
    boolean initiallyInteractive();

    /**
     * Most of the time isAnimated will be YES. For custom transitions that use the
     * new UIModalPresentationCustom presentation type we invoke the
     * animateTransition: even though the transition is not animated. (This allows
     * the custom transition to add or remove subviews to the container view.)
     */
    @Generated
    @Selector("isAnimated")
    boolean isAnimated();

    /**
     * isCancelled is usually NO. It is only set to YES for an interactive transition that was cancelled.
     */
    @Generated
    @Selector("isCancelled")
    boolean isCancelled();

    /**
     * Interactive transitions have non-interactive segments. For example, they all complete non-interactively. Some
     * interactive transitions may have
     * intermediate segments that are not interactive.
     */
    @Generated
    @Selector("isInteractive")
    boolean isInteractive();

    /**
     * API-Since: 10.0
     */
    @Generated
    @Selector("isInterruptible")
    boolean isInterruptible();

    /**
     * These three methods are potentially meaningful for interactive transitions that are
     * completing. It reports the percent complete of the transition when it moves
     * to the non-interactive completion phase of the transition.
     */
    @Generated
    @Selector("percentComplete")
    @NFloat
    double percentComplete();

    /**
     * A modal presentation style whose transition is being customized or UIModalPresentationNone if this is not a modal
     * presentation
     * or dismissal.
     */
    @Generated
    @Selector("presentationStyle")
    @NInt
    long presentationStyle();

    /**
     * This is either CGAffineTransformIdentity (indicating no rotation), or a rotation transform of +90, -90, or 180.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("targetTransform")
    @ByValue
    CGAffineTransform targetTransform();

    /**
     * The full expected duration of the transition if it is run non-interactively.
     */
    @Generated
    @Selector("transitionDuration")
    double transitionDuration();

    /**
     * Currently only two keys are defined by the system:
     * UITransitionContextToViewControllerKey
     * UITransitionContextFromViewControllerKey
     */
    @Nullable
    @Generated
    @Selector("viewControllerForKey:")
    UIViewController viewControllerForKey(@NotNull String key);

    /**
     * Currently only two keys are defined by the system:
     * UITransitionContextToViewKey
     * UITransitionContextFromViewKey
     * 
     * API-Since: 8.0
     */
    @Nullable
    @Generated
    @Selector("viewForKey:")
    UIView viewForKey(@NotNull String key);
}
