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

/**
 * Values for NSTextAlignment
 * 
 * API-Since: 6.0
 */
@Generated
public final class NSTextAlignment {
    /**
     * Visually left aligned
     * 
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Left = 0x0000000000000000L;
    /**
     * Visually centered
     * 
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Center = 0x0000000000000001L;
    /**
     * Visually right aligned
     * 
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Right = 0x0000000000000002L;
    /**
     * Fully-justified. The last line in a paragraph is natural-aligned.
     * 
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Justified = 0x0000000000000003L;
    /**
     * Resolved to either ``left`` or ``right`` based on the natural alignment resolution type active in the associated
     * component.
     * 
     * There are two types of natural alignment resolution behavior. The natural alignment is resolved based on either
     * the UI language or the base writing direction.
     * The behavior is selected by the ``resolvesNaturalAlignmentWithBaseWritingDirection`` property for
     * ``NSTextLayoutManager``.
     * ``NSStringDrawingOptions.resolvesNaturalAlignmentWithBaseWritingDirection`` specifies the base writing direction
     * based resolution for ``NSStringDrawing``.
     * 
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Natural = 0x0000000000000004L;

    @Generated
    private NSTextAlignment() {
    }
}
