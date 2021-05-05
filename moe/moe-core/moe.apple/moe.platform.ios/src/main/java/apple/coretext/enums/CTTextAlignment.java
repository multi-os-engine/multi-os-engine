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
 * [@enum]       CTTextAlignment
 * 
 * These constants specify text alignment.
 * 
 * [@constant]   kCTTextAlignmentLeft
 *             Text is visually left-aligned.
 * 
 * [@constant]   kCTTextAlignmentRight
 *             Text is visually right-aligned.
 * 
 * [@constant]   kCTTextAlignmentCenter
 *             Text is visually center-aligned.
 * 
 * [@constant]   kCTTextAlignmentJustified
 *             Text is fully justified. The last line in a paragraph is
 *             naturally aligned.
 * 
 * [@constant]   kCTTextAlignmentNatural
 *             Use the natural alignment of the text's script.
 */
@Generated
public final class CTTextAlignment {
    @Generated public static final byte TextAlignmentLeft = 0;
    @Generated public static final byte TextAlignmentRight = 1;
    @Generated public static final byte TextAlignmentCenter = 2;
    @Generated public static final byte TextAlignmentJustified = 3;
    @Generated public static final byte TextAlignmentNatural = 4;
    @Generated public static final byte LeftTextAlignment = 0;
    @Generated public static final byte RightTextAlignment = 1;
    @Generated public static final byte CenterTextAlignment = 2;
    @Generated public static final byte JustifiedTextAlignment = 3;
    @Generated public static final byte NaturalTextAlignment = 4;

    @Generated
    private CTTextAlignment() {
    }
}
