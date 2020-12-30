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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum]       CTFramePathFillRule
 * 
 * These constants specify fill rule used by the frame.
 * 
 * When a path intersects with itself, the client should specify which rule to use for deciding the
 *             area of the path.
 * 
 * [@constant]   kCTFramePathFillEvenOdd
 *             Text is filled in the area that would be painted if the path were given to CGContextEOFillPath.
 * 
 * [@constant]   kCTFramePathFillWindingNumber
 *             Text is fill in the area that would be painted if the path were given to CGContextFillPath.
 */
@Generated
public final class CTFramePathFillRule {
    @Generated public static final int EvenOdd = 0x00000000;
    @Generated public static final int WindingNumber = 0x00000001;

    @Generated
    private CTFramePathFillRule() {
    }
}
