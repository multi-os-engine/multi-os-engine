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
public final class NSControlCharacterAction {
    /**
     * glyphs with this action are filtered out from layout (notShownAttribute == YES)
     */
    @Generated @NInt public static final long ZeroAdvancement = 0x0000000000000001L;
    /**
     * the width for glyphs with this action are determined by -layoutManager:boundingBoxForControlGlyphAtIndex:forTextContainer:proposedLineFragment:glyphPosition:characterIndex: if the method is implemented; otherwise, same as NSControlCharacterZeroAdvancementAction
     */
    @Generated @NInt public static final long Whitespace = 0x0000000000000002L;
    /**
     * Treated as tab character
     */
    @Generated @NInt public static final long HorizontalTab = 0x0000000000000004L;
    /**
     * Causes line break
     */
    @Generated @NInt public static final long LineBreak = 0x0000000000000008L;
    /**
     * Causes paragraph break; firstLineIndent will be used for the following glyph
     */
    @Generated @NInt public static final long ParagraphBreak = 0x0000000000000010L;
    /**
     * Causes container break
     */
    @Generated @NInt public static final long ContainerBreak = 0x0000000000000020L;

    @Generated
    private NSControlCharacterAction() {
    }
}
