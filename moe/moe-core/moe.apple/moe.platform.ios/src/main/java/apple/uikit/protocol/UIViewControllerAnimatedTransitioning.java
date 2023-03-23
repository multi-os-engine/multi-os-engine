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
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerAnimatedTransitioning")
public interface UIViewControllerAnimatedTransitioning {
    /**
     * This method can only be a no-op if the transition is interactive and not a percentDriven interactive transition.
     */
    @Generated
    @Selector("animateTransition:")
    void animateTransition(@Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);

    /**
     * This is a convenience and if implemented will be invoked by the system when the transition context's
     * completeTransition: method is invoked.
     */
    @Generated
    @IsOptional
    @Selector("animationEnded:")
    default void animationEnded(boolean transitionCompleted) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * A conforming object implements this method if the transition it creates can
     * be interrupted. For example, it could return an instance of a
     * UIViewPropertyAnimator. It is expected that this method will return the same
     * instance for the life of a transition.
     * 
     * API-Since: 10.0
     */
    @Generated
    @IsOptional
    @Selector("interruptibleAnimatorForTransition:")
    @MappedReturn(ObjCObjectMapper.class)
    default UIViewImplicitlyAnimating interruptibleAnimatorForTransition(
            @Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * This is used for percent driven interactive transitions, as well as for
     * container controllers that have companion animations that might need to
     * synchronize with the main animation.
     */
    @Generated
    @Selector("transitionDuration:")
    double transitionDuration(@Mapped(ObjCObjectMapper.class) UIViewControllerContextTransitioning transitionContext);
}
