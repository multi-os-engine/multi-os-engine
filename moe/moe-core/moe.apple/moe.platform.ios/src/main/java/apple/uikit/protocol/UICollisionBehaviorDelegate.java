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

import apple.uikit.UICollisionBehavior;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICollisionBehaviorDelegate")
public interface UICollisionBehaviorDelegate {
    /**
     * The identifier of a boundary created with translatesReferenceBoundsIntoBoundary or
     * setTranslatesReferenceBoundsIntoBoundaryWithInsets is nil
     */
    @Generated
    @IsOptional
    @Selector("collisionBehavior:beganContactForItem:withBoundaryIdentifier:atPoint:")
    default void collisionBehaviorBeganContactForItemWithBoundaryIdentifierAtPoint(UICollisionBehavior behavior,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item, @Mapped(ObjCObjectMapper.class) Object identifier,
            @ByValue CGPoint p) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collisionBehavior:beganContactForItem:withItem:atPoint:")
    default void collisionBehaviorBeganContactForItemWithItemAtPoint(UICollisionBehavior behavior,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2,
            @ByValue CGPoint p) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collisionBehavior:endedContactForItem:withBoundaryIdentifier:")
    default void collisionBehaviorEndedContactForItemWithBoundaryIdentifier(UICollisionBehavior behavior,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item, @Mapped(ObjCObjectMapper.class) Object identifier) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @IsOptional
    @Selector("collisionBehavior:endedContactForItem:withItem:")
    default void collisionBehaviorEndedContactForItemWithItem(UICollisionBehavior behavior,
            @Mapped(ObjCObjectMapper.class) UIDynamicItem item1, @Mapped(ObjCObjectMapper.class) UIDynamicItem item2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
