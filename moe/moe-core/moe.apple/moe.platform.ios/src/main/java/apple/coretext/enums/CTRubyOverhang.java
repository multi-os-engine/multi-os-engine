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
 * [@enum]       CTRubyOverhang
 * 
 * These constants specify whether, and on which side, ruby text is allowed to overhang adjacent text if it is wider than the base text.
 * 
 * [@constant]   kCTRubyOverhangAuto
 *             The ruby text can overhang adjacent text on both sides.
 * 
 * [@constant]   kCTRubyOverhangStart
 *             The ruby text can overhang the text that proceeds it.
 * 
 * [@constant]   kCTRubyOverhangEnd
 *             The ruby text can overhang the text that follows it.
 * 
 * [@constant]   kCTRubyOverhangNone
 *             The ruby text cannot overhang the proceeding or following text.
 */
@Generated
public final class CTRubyOverhang {
    @Generated public static final byte Invalid = -1;
    @Generated public static final byte Auto = 0;
    @Generated public static final byte Start = 1;
    @Generated public static final byte End = 2;
    @Generated public static final byte None = 3;

    @Generated
    private CTRubyOverhang() {
    }
}
