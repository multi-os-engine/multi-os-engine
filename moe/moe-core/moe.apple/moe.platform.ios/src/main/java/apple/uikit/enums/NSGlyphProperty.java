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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSGlyphProperty {
    /**
     * null glyph ignored for layout and display
     */
    @Generated @NInt public static final long Null = 0x0000000000000001L;
    /**
     * control character such as tab, attachment, etc that has special behavior associated with
     */
    @Generated @NInt public static final long ControlCharacter = 0x0000000000000002L;
    /**
     * glyphs with elastic glyph width behavior such as white spaces
     */
    @Generated @NInt public static final long Elastic = 0x0000000000000004L;
    /**
     * glyphs with combining properties. typically characters in Unicode Mn class.
     */
    @Generated @NInt public static final long NonBaseCharacter = 0x0000000000000008L;

    @Generated
    private NSGlyphProperty() {
    }
}
