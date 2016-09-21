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

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIViewControllerTransitionCoordinator")
public interface UIViewControllerTransitionCoordinator extends UIViewControllerTransitionCoordinatorContext {
    @Generated
    @Selector("animateAlongsideTransition:completion:")
    boolean animateAlongsideTransitionCompletion(
            @ObjCBlock(name = "call_animateAlongsideTransitionCompletion_0") Block_animateAlongsideTransitionCompletion_0 animation,
            @ObjCBlock(name = "call_animateAlongsideTransitionCompletion_1") Block_animateAlongsideTransitionCompletion_1 completion);

    @Generated
    @Selector("animateAlongsideTransitionInView:animation:completion:")
    boolean animateAlongsideTransitionInViewAnimationCompletion(UIView view,
            @ObjCBlock(name = "call_animateAlongsideTransitionInViewAnimationCompletion_1") Block_animateAlongsideTransitionInViewAnimationCompletion_1 animation,
            @ObjCBlock(name = "call_animateAlongsideTransitionInViewAnimationCompletion_2") Block_animateAlongsideTransitionInViewAnimationCompletion_2 completion);

    @Generated
    @Selector("notifyWhenInteractionChangesUsingBlock:")
    void notifyWhenInteractionChangesUsingBlock(
            @ObjCBlock(name = "call_notifyWhenInteractionChangesUsingBlock") Block_notifyWhenInteractionChangesUsingBlock handler);

    @Generated
    @Selector("notifyWhenInteractionEndsUsingBlock:")
    void notifyWhenInteractionEndsUsingBlock(
            @ObjCBlock(name = "call_notifyWhenInteractionEndsUsingBlock") Block_notifyWhenInteractionEndsUsingBlock handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionCompletion_0 {
        @Generated
        void call_animateAlongsideTransitionCompletion_0(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionCompletion_1 {
        @Generated
        void call_animateAlongsideTransitionCompletion_1(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionInViewAnimationCompletion_1 {
        @Generated
        void call_animateAlongsideTransitionInViewAnimationCompletion_1(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_animateAlongsideTransitionInViewAnimationCompletion_2 {
        @Generated
        void call_animateAlongsideTransitionInViewAnimationCompletion_2(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenInteractionChangesUsingBlock {
        @Generated
        void call_notifyWhenInteractionChangesUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_notifyWhenInteractionEndsUsingBlock {
        @Generated
        void call_notifyWhenInteractionEndsUsingBlock(@Mapped(ObjCObjectMapper.class) Object arg0);
    }
}
