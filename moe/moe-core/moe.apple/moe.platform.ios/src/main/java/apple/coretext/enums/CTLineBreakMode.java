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
 * @enum       CTLineBreakMode
 * @abstract   These constants specify what happens when a line is too long for
 *             its frame.
 * 
 * @constant   kCTLineBreakByWordWrapping
 *             Wrapping occurs at word boundaries, unless the word itself doesn't
 *             fit on a single line.
 * 
 * @constant   kCTLineBreakByCharWrapping
 *             Wrapping occurs before the first character that doesn't fit.
 * 
 * @constant   kCTLineBreakByClipping
 *             Lines are simply not drawn past the edge of the frame.
 * 
 * @constant   kCTLineBreakByTruncatingHead
 *             Each line is displayed so that the end fits in the frame and the
 *             missing text is indicated by some kind of ellipsis glyph.
 * 
 * @constant   kCTLineBreakByTruncatingTail
 *             Each line is displayed so that the beginning fits in the
 *             container and the missing text is indicated by some kind of
 *             ellipsis glyph.
 * 
 * @constant   kCTLineBreakByTruncatingMiddle
 *             Each line is displayed so that the beginning and end fit in the
 *             container and the missing text is indicated by some kind of
 *             ellipsis glyph in the middle.
 */
@Generated
public final class CTLineBreakMode {
    @Generated public static final byte WordWrapping = 0;
    @Generated public static final byte CharWrapping = 1;
    @Generated public static final byte Clipping = 2;
    @Generated public static final byte TruncatingHead = 3;
    @Generated public static final byte TruncatingTail = 4;
    @Generated public static final byte TruncatingMiddle = 5;

    @Generated
    private CTLineBreakMode() {
    }
}
