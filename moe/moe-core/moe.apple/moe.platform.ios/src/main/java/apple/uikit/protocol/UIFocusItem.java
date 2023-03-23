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

import apple.uikit.UIFocusEffect;
import apple.uikit.UIFocusMovementHint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.corefoundation.struct.CGRect;

/**
 * Objects conforming to UIFocusItem are considered capable of participating in focus. Only UIFocusItems can ever be
 * focused.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusItem")
public interface UIFocusItem extends UIFocusEnvironment {
    /**
     * Indicates whether or not this item is currently allowed to become focused.
     * Returning NO restricts the item from being focusable, even if it is visible in the user interface. For example,
     * UIControls return NO if they are disabled.
     */
    @Generated
    @Selector("canBecomeFocused")
    boolean canBecomeFocused();

    /**
     * Called whenever this focus item is hinting to the user a focus movement might occur.
     * The provided object is mutated by the focus engine whenever the user's finger moves.
     * 
     * API-Since: 12.0
     */
    @Generated
    @IsOptional
    @Selector("didHintFocusMovement:")
    default void didHintFocusMovement(UIFocusMovementHint hint) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The geometric frame of this item, represented in the `coordinateSpace` of the UIFocusItemContainer in which it is
     * contained.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("frame")
    @ByValue
    CGRect frame();

    /**
     * Describes a visual effect to apply when this item is focused. When not implemented, the system may create a
     * default effect for this item.
     * Returning nil indicates that the system should not apply any visual effects, and that the app will handle
     * applying the appropriate visuals.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("focusEffect")
    default UIFocusEffect focusEffect() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The priority this item has in its focus group. The higher the priority, the more likely it is to get picked when
     * focus moves into this group.
     * Note: this method can only be used to increase an item's priority, not decrease it. For example if an item is
     * currently selected, the actual priority of this item will be determined by MAX(focusGroupPriority,
     * UIFocusGroupPrioritySelected).
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("focusGroupPriority")
    @NInt
    default long focusGroupPriority() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * If this returns YES, the focus item is considered transparent in terms of occlusion. Items that are behind it are
     * focusable.
     * This value is ignored when the item is focusable, in which case the item is never considered transparent.
     * 
     * API-Since: 15.0
     */
    @Generated
    @IsOptional
    @Selector("isTransparentFocusItem")
    default boolean isTransparentFocusItem() {
        throw new java.lang.UnsupportedOperationException();
    }
}
