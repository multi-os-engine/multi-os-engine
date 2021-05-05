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

import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGRect;
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

/**
 * A transition context object is constructed by the system and passed to the
 * animator in its animateTransition: and transitionDuration: methods as well as
 * to the interaction controller in its startInteractiveTransition: method. If
 * there is an interaction controller its startInteractiveTransition: is called
 * first and its up to the the interaction controller object to call the
 * animateTransition: method if needed. If there is no interaction controller,
 * then the system automatically invokes the animator's animateTransition:
 * method.
 * 
 * The system queries the view controller's transitioningDelegate or the
 * navigation controller's delegate to determine if an animator or interaction
 * controller should be used in a transition. The transitioningDelegate is a new
 * propery on UIViewController and conforms to the
 * UIViewControllerTransitioningDelegate protocol defined below. The navigation
 * controller likewise has been augmented with a couple of new delegate methods.
 * 
 * The UIViewControllerContextTransitioning protocol can be adopted by custom
 * container controllers.  It is purposely general to cover more complex
 * transitions than the system currently supports. For now, navigation push/pops
 * and UIViewController present/dismiss transitions can be
 * customized. Information about the transition is obtained by using the
 * viewControllerForKey:, initialFrameForViewController:, and
 * finalFrameForViewController: methods. The system provides two keys for
 * identifying the from view controller and the to view controller for
 * navigation push/pop and view controller present/dismiss transitions.
 * 
 * All custom animations must invoke the context's completeTransition: method
 * when the transition completes.  Furthermore the animation should take place
 * within the containerView specified by the context. For interactive
 * transitions the context's updateInteractiveTransition:,
 * finishInteractiveTransition or cancelInteractiveTransition should be called
 * as the interactive animation proceeds. The UIPercentDrivenInteractiveTransition
 * class provides an implementation of the UIViewControllerInteractiveTransitioning
 * protocol that can be used to interactively drive any UIView property animations
 * that are created by an animator.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerContextTransitioning")
public interface UIViewControllerContextTransitioning {
    @Generated
    @Selector("cancelInteractiveTransition")
    void cancelInteractiveTransition();

    /**
     * This must be called whenever a transition completes (or is cancelled.)
     * Typically this is called by the object conforming to the
     * UIViewControllerAnimatedTransitioning protocol that was vended by the transitioning
     * delegate.  For purely interactive transitions it should be called by the
     * interaction controller. This method effectively updates internal view
     * controller state at the end of the transition.
     */
    @Generated
    @Selector("completeTransition:")
    void completeTransition(boolean didComplete);

    /**
     * The view in which the animated transition should take place.
     */
    @Generated
    @Selector("containerView")
    UIView containerView();

    @Generated
    @Selector("finalFrameForViewController:")
    @ByValue
    CGRect finalFrameForViewController(UIViewController vc);

    @Generated
    @Selector("finishInteractiveTransition")
    void finishInteractiveTransition();

    /**
     * The frame's are set to CGRectZero when they are not known or
     * otherwise undefined.  For example the finalFrame of the
     * fromViewController will be CGRectZero if and only if the fromView will be
     * removed from the window at the end of the transition. On the other
     * hand, if the finalFrame is not CGRectZero then it must be respected
     * at the end of the transition.
     */
    @Generated
    @Selector("initialFrameForViewController:")
    @ByValue
    CGRect initialFrameForViewController(UIViewController vc);

    /**
     * Most of the time this is YES. For custom transitions that use the new UIModalPresentationCustom
     * presentation type we will invoke the animateTransition: even though the transition should not be
     * animated. This allows the custom transition to add or remove subviews to the container view.
     */
    @Generated
    @Selector("isAnimated")
    boolean isAnimated();

    /**
     * This indicates whether the transition is currently interactive.
     */
    @Generated
    @Selector("isInteractive")
    boolean isInteractive();

    /**
     * This should be called if the transition animation is interruptible and it
     * is being paused.
     */
    @Generated
    @Selector("pauseInteractiveTransition")
    void pauseInteractiveTransition();

    @Generated
    @Selector("presentationStyle")
    @NInt
    long presentationStyle();

    @Generated
    @Selector("targetTransform")
    @ByValue
    CGAffineTransform targetTransform();

    @Generated
    @Selector("transitionWasCancelled")
    boolean transitionWasCancelled();

    /**
     * An interaction controller that conforms to the
     * UIViewControllerInteractiveTransitioning protocol (which is vended by a
     * container view controller's delegate or, in the case of a presentation, the
     * transitioningDelegate) should call these methods as the interactive
     * transition is scrubbed and then either cancelled or completed. Note that if
     * the animator is interruptible, then calling finishInteractiveTransition: and
     * cancelInteractiveTransition: are indications that if the transition is not
     * interrupted again it will finish naturally or be cancelled.
     */
    @Generated
    @Selector("updateInteractiveTransition:")
    void updateInteractiveTransition(@NFloat double percentComplete);

    /**
     * Currently only two keys are defined by the
     * system - UITransitionContextToViewControllerKey, and
     * UITransitionContextFromViewControllerKey.
     * Animators should not directly manipulate a view controller's views and should
     * use viewForKey: to get views instead.
     */
    @Generated
    @Selector("viewControllerForKey:")
    UIViewController viewControllerForKey(String key);

    /**
     * Currently only two keys are defined by the system -
     * UITransitionContextFromViewKey, and UITransitionContextToViewKey
     * viewForKey: may return nil which would indicate that the animator should not
     * manipulate the associated view controller's view.
     */
    @Generated
    @Selector("viewForKey:")
    UIView viewForKey(String key);
}
