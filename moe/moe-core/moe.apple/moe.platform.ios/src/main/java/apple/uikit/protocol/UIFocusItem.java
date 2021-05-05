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

import apple.coregraphics.struct.CGRect;
import apple.uikit.UIFocusMovementHint;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * Objects conforming to UIFocusItem are considered capable of participating in focus. Only UIFocusItems can ever be focused.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIFocusItem")
public interface UIFocusItem extends UIFocusEnvironment {
    /**
     * Indicates whether or not this item is currently allowed to become focused.
     * Returning NO restricts the item from being focusable, even if it is visible in the user interface. For example, UIControls return NO if they are disabled.
     */
    @Generated
    @Selector("canBecomeFocused")
    boolean canBecomeFocused();

    /**
     * Called whenever this focus item is hinting to the user a focus movement might occur.
     * The provided object is mutated by the focus engine whenever the user's finger moves.
     */
    @Generated
    @IsOptional
    @Selector("didHintFocusMovement:")
    default void didHintFocusMovement(UIFocusMovementHint hint) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The geometric frame of this item, represented in the `coordinateSpace` of the UIFocusItemContainer in which it is contained.
     */
    @Generated
    @Selector("frame")
    @ByValue
    CGRect frame();
}
