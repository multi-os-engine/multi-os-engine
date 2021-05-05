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
 * [@enum]       CTUnderlineStyle
 * 
 * Underline style specifiers.
 * 
 * These underline type specifiers can be applied to the value set
 *             with the kCTUnderlineStyleAttributeName attribute to tell
 *             CoreText that you want a different underline style.
 */
@Generated
public final class CTUnderlineStyle {
    @Generated public static final int None = 0x00000000;
    @Generated public static final int Single = 0x00000001;
    @Generated public static final int Thick = 0x00000002;
    @Generated public static final int Double = 0x00000009;

    @Generated
    private CTUnderlineStyle() {
    }
}
