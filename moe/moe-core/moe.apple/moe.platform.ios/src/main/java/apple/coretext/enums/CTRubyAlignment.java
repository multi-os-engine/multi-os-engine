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
 * [@enum]       CTRubyAlignment
 * <p>
 * These constants specify how to align the ruby annotation and the base text relative to each other when they don't have the same length.
 * <p>
 * [@constant]   kCTRubyAlignmentAuto
 * CoreText will determine the alignment.
 * <p>
 * [@constant]   kCTRubyAlignmentStart
 * The ruby text is aligned with the start edge of the base text.
 * <p>
 * [@constant]   kCTRubyAlignmentCenter
 * The ruby text is centered within the width of the base text. If the ruby text is wider than the base text the base text is centered in the width of the ruby text.
 * <p>
 * [@constant]   kCTRubyAlignmentEnd
 * The ruby text is aligned with the end edge of the base text.
 * <p>
 * [@constant]   kCTRubyAlignmentDistributeLetter
 * If the width of the ruby text is less than the width of the base text, the ruby text is evenly distributed over the width of the base text, with the first letter of the ruby text aligning with the first letter of the base text and the last letter of the ruby text aligning with the last letter of the base text. If the width of the base text is less than the width of the ruby text, the base text is evenly distributed over the width of the ruby text.
 * <p>
 * [@constant]   kCTRubyAlignmentDistributeSpace
 * If the width of the ruby text is less than the width of the base text, the ruby text is evenly distributed over the width of the base text, with a certain amount of space, usually half the inter-character width of the ruby text, before the first and after the last character. If the width of the base text is less than the width of the ruby text, the base text is similarly aligned to the width of the ruby text.
 * <p>
 * [@constant]   kCTRubyAlignmentLineEdge
 * If the ruby text is not adjacent to a line edge it is aligned as with kCTRubyAlignmentAuto. If it is adjacent to a line edge the end of ruby text adjacent to the line edge is aligned to the line edge. This is only relevant if the width of the ruby text is greater than the width of the base text; otherwise alignment is as with kCTRubyAlignmentAuto.
 */
@Generated
public final class CTRubyAlignment {
    @Generated public static final byte Invalid = -1;
    @Generated public static final byte Auto = 0;
    @Generated public static final byte Start = 1;
    @Generated public static final byte Center = 2;
    @Generated public static final byte End = 3;
    @Generated public static final byte DistributeLetter = 4;
    @Generated public static final byte DistributeSpace = 5;
    @Generated public static final byte LineEdge = 6;

    @Generated
    private CTRubyAlignment() {
    }
}
