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

import apple.uikit.UITextPosition;
import apple.uikit.UITextRange;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * A tokenizer allows the text input system to evaluate text units of varying granularity.
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UITextInputTokenizer")
public interface UITextInputTokenizer {
    /**
     * Returns YES only if a position is at a boundary of a text unit of the specified granularity in the particular direction.
     */
    @Generated
    @Selector("isPosition:atBoundary:inDirection:")
    boolean isPositionAtBoundaryInDirection(UITextPosition position, @NInt long granularity, @NInt long direction);

    /**
     * Returns YES if position is within a text unit of the given granularity.  If the position is at a boundary, returns YES only if the boundary is part of the text unit in the given direction.
     */
    @Generated
    @Selector("isPosition:withinTextUnit:inDirection:")
    boolean isPositionWithinTextUnitInDirection(UITextPosition position, @NInt long granularity, @NInt long direction);

    /**
     * Returns the next boundary position of a text unit of the given granularity in the given direction, or nil if there is no such position.
     */
    @Generated
    @Selector("positionFromPosition:toBoundary:inDirection:")
    UITextPosition positionFromPositionToBoundaryInDirection(UITextPosition position, @NInt long granularity,
            @NInt long direction);

    /**
     * Returns range of the enclosing text unit of the given granularity, or nil if there is no such enclosing unit.  Whether a boundary position is enclosed depends on the given direction, using the same rule as isPosition:withinTextUnit:inDirection:
     */
    @Generated
    @Selector("rangeEnclosingPosition:withGranularity:inDirection:")
    UITextRange rangeEnclosingPositionWithGranularityInDirection(UITextPosition position, @NInt long granularity,
            @NInt long direction);
}
