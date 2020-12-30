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

import apple.foundation.NSArray;
import apple.uikit.UIFocusAnimationCoordinator;
import apple.uikit.UIFocusUpdateContext;
import apple.uikit.UIView;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Objects conforming to UIFocusEnvironment influence and respond to focus behavior within a specific area of the screen that they control.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusEnvironment")
public interface UIFocusEnvironment {
    /**
     * Called when the screen’s focused item has been updated to a new item. Use the animation coordinator to schedule focus-related animations in response to the update.
     */
    @Generated
    @Selector("didUpdateFocusInContext:withAnimationCoordinator:")
    void didUpdateFocusInContextWithAnimationCoordinator(UIFocusUpdateContext context,
            UIFocusAnimationCoordinator coordinator);

    /**
     * The preferred focus environments define where to search for the default focused item in an environment, such as when focus updates programmatically.
     * Starting from the target environment, each preferred focus environment is recursively searched in the order of the array until an eligible, focusable item is found.
     * Preferred focus environments can include focusable and non-focusable items, in addition to non-item environments. Returning an empty array is equivalent to returning an array containing only 'self'.
     */
    @Generated
    @Selector("preferredFocusEnvironments")
    NSArray<?> preferredFocusEnvironments();

    @Generated
    @IsOptional
    @Selector("preferredFocusedView")
    default UIView preferredFocusedView() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Marks this environment as needing a focus update, which if accepted will attempt to reset focus to this environment, or one of its preferred focus environments, on the next update cycle. If this environment does not currently contain the focused item, then calling this method has no effect. If a parent of this environment is also requesting focus, then this environment's request is rejected in favor of the parent's.
     * NOTE: If you provide your own implementation, it must call `[[UIFocusSystem focusSystemForEnvironment:self] requestFocusUpdateToEnvironment:self]`;
     */
    @Generated
    @Selector("setNeedsFocusUpdate")
    void setNeedsFocusUpdate();

    /**
     * Asks whether the system should allow a focus update to occur.
     */
    @Generated
    @Selector("shouldUpdateFocusInContext:")
    boolean shouldUpdateFocusInContext(UIFocusUpdateContext context);

    /**
     * Forces focus to be updated immediately. If there is an environment that has requested a focus update via -setNeedsFocusUpdate, and the request was accepted, then focus will be updated to that environment or one of its preferred focus environments.
     * NOTE: If you provide your own implementation, it must call `[[UIFocusSystem focusSystemForEnvironment:self] updateFocusIfNeeded];`.
     */
    @Generated
    @Selector("updateFocusIfNeeded")
    void updateFocusIfNeeded();

    /**
     * The container of any child focus items in this focus environment, or nil if no container exists.
     */
    @Generated
    @Selector("focusItemContainer")
    @MappedReturn(ObjCObjectMapper.class)
    UIFocusItemContainer focusItemContainer();

    /**
     * The parent focus environment of this environment, or nil if no parent exists.
     * NOTE: If you implement this method, you must return a non-nil value for parent focus environment, otherwise your focus environment will not participate in focus interactions.
     */
    @Generated
    @Selector("parentFocusEnvironment")
    @MappedReturn(ObjCObjectMapper.class)
    UIFocusEnvironment parentFocusEnvironment();

    /**
     * The identifier of the focus group that this view belongs to. If this is nil, subviews inherit their superview's focus group.
     */
    @Generated
    @IsOptional
    @Selector("focusGroupIdentifier")
    default String focusGroupIdentifier() {
        throw new java.lang.UnsupportedOperationException();
    }
}
