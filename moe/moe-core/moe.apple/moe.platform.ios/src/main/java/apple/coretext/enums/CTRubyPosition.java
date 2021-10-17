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
 * [@enum]       CTRubyPosition
 * <p>
 * These constants specify the position of the ruby text with respect to the base text.
 * <p>
 * [@constant]   kCTRubyPositionBefore
 * The ruby text is positioned before the base text; i.e. above horizontal text and to the right of vertical text.
 * <p>
 * [@constant]   kCTRubyPositionAfter
 * The ruby text is positioned after the base text; i.e. below horizontal text and to the left of vertical text.
 * <p>
 * [@constant]   kCTRubyPositionInterCharacter
 * The ruby text is positioned to the right of the base text whether it is horizontal or vertical. This is the way that Bopomofo annotations are attached to Chinese text in Taiwan.
 * <p>
 * [@constant]   kCTRubyPositionInline
 * The ruby text follows the base text with no special styling.
 */
@Generated
public final class CTRubyPosition {
    @Generated public static final byte Before = 0;
    @Generated public static final byte After = 1;
    @Generated public static final byte InterCharacter = 2;
    @Generated public static final byte Inline = 3;
    @Generated public static final byte Count = 4;

    @Generated
    private CTRubyPosition() {
    }
}
