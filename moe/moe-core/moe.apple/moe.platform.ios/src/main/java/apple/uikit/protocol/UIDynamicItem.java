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
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.uikit.UIBezierPath;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UIDynamicItem")
public interface UIDynamicItem {
    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    @Generated
    @Selector("center")
    @ByValue
    CGPoint center();

    /**
     * The path must represent a convex polygon with counter clockwise winding and no self intersection. 
     * The point (0,0) in the path corresponds to the dynamic item's center.
     */
    @Generated
    @IsOptional
    @Selector("collisionBoundingPath")
    default UIBezierPath collisionBoundingPath() {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * The collision type represents how the dynamics system will evaluate collisions with 
     * respect to the dynamic item. defaults to UIDynamicItemCollisionBoundsTypeRectangle
     */
    @Generated
    @IsOptional
    @Selector("collisionBoundsType")
    @NUInt
    default long collisionBoundsType() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Generated
    @Selector("setCenter:")
    void setCenter(@ByValue CGPoint value);

    @Generated
    @Selector("setTransform:")
    void setTransform(@ByValue CGAffineTransform value);

    @Generated
    @Selector("transform")
    @ByValue
    CGAffineTransform transform();
}
