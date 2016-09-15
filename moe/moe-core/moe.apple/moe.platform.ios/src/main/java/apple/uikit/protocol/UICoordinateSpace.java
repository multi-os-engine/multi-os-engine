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

import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("UICoordinateSpace")
public interface UICoordinateSpace {
    /**
     * bounds</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICoordinateSpace_protocol/index.html#//apple_ref/occ/intfp/UICoordinateSpace/bounds">iOS Dev Center</a>
     */
    @Generated
    @Selector("bounds")
    @ByValue
    CGRect bounds();

    /**
     * convertPoint:fromCoordinateSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICoordinateSpace_protocol/index.html#//apple_ref/occ/intfm/UICoordinateSpace/convertPoint:fromCoordinateSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:fromCoordinateSpace:")
    @ByValue
    CGPoint convertPointFromCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertPoint:toCoordinateSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICoordinateSpace_protocol/index.html#//apple_ref/occ/intfm/UICoordinateSpace/convertPoint:toCoordinateSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertPoint:toCoordinateSpace:")
    @ByValue
    CGPoint convertPointToCoordinateSpace(@ByValue CGPoint point,
            @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertRect:fromCoordinateSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICoordinateSpace_protocol/index.html#//apple_ref/occ/intfm/UICoordinateSpace/convertRect:fromCoordinateSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertRect:fromCoordinateSpace:")
    @ByValue
    CGRect convertRectFromCoordinateSpace(@ByValue CGRect rect, @Mapped(ObjCObjectMapper.class) Object coordinateSpace);

    /**
     * convertRect:toCoordinateSpace:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UICoordinateSpace_protocol/index.html#//apple_ref/occ/intfm/UICoordinateSpace/convertRect:toCoordinateSpace:">iOS Dev Center</a>
     */
    @Generated
    @Selector("convertRect:toCoordinateSpace:")
    @ByValue
    CGRect convertRectToCoordinateSpace(@ByValue CGRect rect, @Mapped(ObjCObjectMapper.class) Object coordinateSpace);
}
