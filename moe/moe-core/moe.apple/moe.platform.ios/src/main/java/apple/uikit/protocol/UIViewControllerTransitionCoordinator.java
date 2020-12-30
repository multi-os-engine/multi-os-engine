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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * An object conforming to this protocol is returned by -[UIViewController
 * transitionCoordinator] when an active transition or presentation/dismissal is
 * in flight. A container controller may not vend such an object. This is an
 * ephemeral object that is released after the transition completes and the
 * last callback has been made.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerTransitionCoordinator")
public interface UIViewControllerTransitionCoordinator extends UIViewControllerTransitionCoordinatorContext {
    /**
     * Any animations specified will be run in the same animation context as the
     * transition. If the animations are occurring in a view that is a not
     * descendent of the containerView, then an ancestor view in which all of the
     * animations are occuring should be specified.  The completionBlock is invoked
     * after the transition completes. (Note that this may not be after all the
     * animations specified by to call complete if the duration is not inherited.)
     * It is perfectly legitimate to only specify a completion block. This method
     * returns YES if the animations are successfully queued to run. The completions
     * may be run even if the animations are not. Note that for transitioning
     * animators that are not implemented with UIView animations, the alongside
     * animations will be run just after their animateTransition: method returns.
     */
    @Generated
    @Selector("animateAlongsideTransition:completion:")
    boolean animateAlongsideTransitionCompletion(
            @ObjCBlock(name = "call_animateAlongsideTransitionCompletion_0") Block_animateAlongsideTransitionCompletion_0 animation,
            @ObjCBlock(name = "call_animateAlongsideTransitionCompletion_1") Block_animateAlongsideTransitionCompletion_1 completion);

    /**
     * This alternative API is needed if the view is not a descendent of the container view AND you require this animation
     * to be driven by a UIPercentDrivenInteractiveTransition interaction controller.
     */
    @Generated
    @Selector("animateAlongsideTransitionInView:animation:completion:")
    boolean animateAlongsideTransitionInViewAnimationCompletion(UIView view,
            @ObjCBlock(name = "call_animateAlongsideTransitionInViewAnimationCompletion_1") Block_animateAlongsideTransitionInViewAnimationCompletion_1 animation,
            @ObjCBlock(name = "call_animateAlongsideTransitionInViewAnimationCompletion_2") Block_animateAlongsideTransitionInViewAnimationCompletion_2 completion);

    /**
     * This method behavior is identical to the method above. On 10.0, however, the behavior has
     * changed slightly to account for the fact that transitions can be interruptible. For interruptible transitions
     * The block may be called multiple times. It is called each time the transition moves from an interactive to a
     * non-interactive state and vice-versa. The block is now also retained until the transition has completed.
     */
    @Generated
    @Selector("notifyWhenInteractionChangesUsingBlock:")
    void notifyWhenInteractionChangesUsingBlock(
            @ObjCBlock(name = "call_notifyWhenInteractionChangesUsingBlock") Block_notifyWhenInteractionChangesUsingBlock handler);

    /**
     * When a transition changes from interactive to non-interactive then handler is
     * invoked. The handler will typically then do something depending on whether or
     * not the transition isCancelled. Note that only interactive transitions can
     * be cancelled and all interactive transitions complete as non-interactive
     * ones. In general, when a transition is cancelled the view controller that was
     * appearing will receive a viewWillDisappear: call, and the view controller
     * that was disappearing will receive a viewWillAppear: call.  This handler is
     * invoked BEFORE the "will" method calls are made.
     */
    @Generated
    @Selector("notifyWhenInteractionEndsUsingBlock:")
    void notifyWhenInteractionEndsUsingBlock(
            @ObjCBlock(name = "call_notifyWhenInteractionEndsUsingBlock") Block_notifyWhenInteractionEndsUsingBlock handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionCompletion_0 {
        @Generated
        void call_animateAlongsideTransitionCompletion_0(@Mapped(ObjCObjectMapper.class) Object context);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionCompletion_1 {
        @Generated
        void call_animateAlongsideTransitionCompletion_1(@Mapped(ObjCObjectMapper.class) Object context);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionInViewAnimationCompletion_1 {
        @Generated
        void call_animateAlongsideTransitionInViewAnimationCompletion_1(@Mapped(ObjCObjectMapper.class) Object context);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionInViewAnimationCompletion_2 {
        @Generated
        void call_animateAlongsideTransitionInViewAnimationCompletion_2(@Mapped(ObjCObjectMapper.class) Object context);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenInteractionChangesUsingBlock {
        @Generated
        void call_notifyWhenInteractionChangesUsingBlock(@Mapped(ObjCObjectMapper.class) Object context);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenInteractionEndsUsingBlock {
        @Generated
        void call_notifyWhenInteractionEndsUsingBlock(@Mapped(ObjCObjectMapper.class) Object context);
    }
}
